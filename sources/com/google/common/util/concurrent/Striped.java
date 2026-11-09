package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i7) {
            return (L) this.array[i7];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }

        private CompactStriped(int i7, Supplier<L> supplier) {
            super(i7);
            int i10 = 0;
            Preconditions.checkArgument(i7 <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i10 >= objArr.length) {
                    return;
                }
                objArr[i10] = supplier.get();
                i10++;
            }
        }
    }

    @VisibleForTesting
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        public LargeLazyStriped(int i7, Supplier<L> supplier) {
            super(i7);
            int i10 = this.mask;
            this.size = i10 == -1 ? Integer.MAX_VALUE : i10 + 1;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i7) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i7, size());
            }
            L l5 = this.locks.get(Integer.valueOf(i7));
            if (l5 != null) {
                return l5;
            }
            L l6 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i7), l6), l6);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i7) {
            super(i7, false);
        }
    }

    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        public PowerOfTwoStriped(int i7) {
            super();
            Preconditions.checkArgument(i7 > 0, "Stripes must be positive");
            this.mask = i7 > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i7) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    @VisibleForTesting
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        public static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            public ArrayReference(L l5, int i7, ReferenceQueue<L> referenceQueue) {
                super(l5, referenceQueue);
                this.index = i7;
            }
        }

        public SmallLazyStriped(int i7, Supplier<L> supplier) {
            super(i7);
            this.queue = new ReferenceQueue<>();
            int i10 = this.mask;
            int i11 = i10 == -1 ? Integer.MAX_VALUE : i10 + 1;
            this.size = i11;
            this.locks = new AtomicReferenceArray<>(i11);
            this.supplier = supplier;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> referencePoll = this.queue.poll();
                if (referencePoll == null) {
                    return;
                }
                ArrayReference<? extends L> arrayReference = (ArrayReference) referencePoll;
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                int i7 = arrayReference.index;
                while (!atomicReferenceArray.compareAndSet(i7, arrayReference, null) && atomicReferenceArray.get(i7) == arrayReference) {
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i7) {
            L l5;
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i7, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i7);
            L l6 = arrayReference == null ? null : arrayReference.get();
            if (l6 != null) {
                return l6;
            }
            L l8 = this.supplier.get();
            ArrayReference<? extends L> arrayReference2 = new ArrayReference<>(l8, i7, this.queue);
            do {
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                do {
                    if (atomicReferenceArray.compareAndSet(i7, arrayReference, arrayReference2)) {
                        drainQueue();
                        return l8;
                    }
                } while (atomicReferenceArray.get(i7) == arrayReference);
                arrayReference = this.locks.get(i7);
                l5 = arrayReference == null ? null : arrayReference.get();
            } while (l5 == null);
            return l5;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }
    }

    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i7) {
        return 1 << IntMath.log2(i7, RoundingMode.CEILING);
    }

    public static <L> Striped<L> custom(int i7, Supplier<L> supplier) {
        return new CompactStriped(i7, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i7) {
        return new Semaphore(i7, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$semaphore$1(int i7) {
        return new PaddedSemaphore(i7);
    }

    private static <L> Striped<L> lazy(int i7, Supplier<L> supplier) {
        return i7 < 1024 ? new SmallLazyStriped(i7, supplier) : new LargeLazyStriped(i7, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i7) {
        return lazy(i7, new j(2));
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i7) {
        return lazy(i7, new j(0));
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i7, int i10) {
        return lazy(i7, new k(i10, 1));
    }

    public static Striped<Lock> lock(int i7) {
        return custom(i7, new j(1));
    }

    public static Striped<ReadWriteLock> readWriteLock(int i7) {
        return custom(i7, new j(3));
    }

    public static Striped<Semaphore> semaphore(int i7, int i10) {
        return custom(i7, new k(i10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i7) {
        int i10 = i7 ^ ((i7 >>> 20) ^ (i7 >>> 12));
        return (i10 >>> 4) ^ ((i10 >>> 7) ^ i10);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(iterable);
        if (arrayListNewArrayList.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i7 = 0; i7 < arrayListNewArrayList.size(); i7++) {
            iArr[i7] = indexFor(arrayListNewArrayList.get(i7));
        }
        Arrays.sort(iArr);
        int i10 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i10));
        for (int i11 = 1; i11 < arrayListNewArrayList.size(); i11++) {
            int i12 = iArr[i11];
            if (i12 == i10) {
                arrayListNewArrayList.set(i11, arrayListNewArrayList.get(i11 - 1));
            } else {
                arrayListNewArrayList.set(i11, getAt(i12));
                i10 = i12;
            }
        }
        return Collections.unmodifiableList(arrayListNewArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i7);

    public abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }
}
