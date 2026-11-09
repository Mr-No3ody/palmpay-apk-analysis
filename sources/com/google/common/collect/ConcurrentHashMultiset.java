package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        private List<Multiset.Entry<E>> snapshot() {
            ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
            Iterators.addAll(arrayListNewArrayListWithExpectedSize, iterator());
            return arrayListNewArrayListWithExpectedSize;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return snapshot().toArray();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public ConcurrentHashMultiset<E> multiset() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) snapshot().toArray(tArr);
        }
    }

    public static class FieldSettersHolder {
        static final Serialization.FieldSetter<ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = Serialization.getFieldSetter(ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    @VisibleForTesting
    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, (ConcurrentMap) objectInputStream.readObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
        for (Multiset.Entry entry : entrySet()) {
            Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                arrayListNewArrayListWithExpectedSize.add(element);
            }
        }
        return arrayListNewArrayListWithExpectedSize;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e10, int i7) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i10;
        AtomicInteger atomicInteger;
        Preconditions.checkNotNull(e10);
        if (i7 == 0) {
            return count(e10);
        }
        CollectPreconditions.checkPositive(i7, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.safeGet(this.countMap, e10);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e10, new AtomicInteger(i7))) == null) {
                return 0;
            }
            do {
                i10 = atomicIntegerPutIfAbsent.get();
                if (i10 == 0) {
                    atomicInteger = new AtomicInteger(i7);
                    if (this.countMap.putIfAbsent(e10, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        StringBuilder sb2 = new StringBuilder(65);
                        sb2.append("Overflow adding ");
                        sb2.append(i7);
                        sb2.append(" occurrences to a count of ");
                        sb2.append(i10);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i10, IntMath.checkedAdd(i10, i7)));
            return i10;
        } while (!this.countMap.replace(e10, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Set<E> createElementSet() {
        final Set<E> setKeySet = this.countMap.keySet();
        return new ForwardingSet<E>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.1
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return obj != null && Collections2.safeContains(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return standardContainsAll(collection);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                return obj != null && Collections2.safeRemove(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return standardRemoveAll(collection);
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<E> delegate() {
                return setKeySet;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    public Set<Multiset.Entry<E>> createEntrySet() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        final AbstractIterator<Multiset.Entry<E>> abstractIterator = new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.2
            private final Iterator<Map.Entry<E, AtomicInteger>> mapEntries;

            {
                this.mapEntries = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Multiset.Entry<E> computeNext() {
                while (this.mapEntries.hasNext()) {
                    Map.Entry<E, AtomicInteger> next = this.mapEntries.next();
                    int i7 = next.getValue().get();
                    if (i7 != 0) {
                        return Multisets.immutableEntry(next.getKey(), i7);
                    }
                }
                return endOfData();
            }
        };
        return new ForwardingIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.3

            @CheckForNull
            private Multiset.Entry<E> last;

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.last != null, "no calls to next() since the last call to remove()");
                ConcurrentHashMultiset.this.setCount(this.last.getElement(), 0);
                this.last = null;
            }

            @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
            public Iterator<Multiset.Entry<E>> delegate() {
                return abstractIterator;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public Multiset.Entry<E> next() {
                Multiset.Entry<E> entry = (Multiset.Entry) super.next();
                this.last = entry;
                return entry;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj, int i7) {
        int i10;
        int iMax;
        if (i7 == 0) {
            return count(obj);
        }
        CollectPreconditions.checkPositive(i7, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return 0;
            }
            iMax = Math.max(0, i10 - i7);
        } while (!atomicInteger.compareAndSet(i10, iMax));
        if (iMax == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i10;
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(@CheckForNull Object obj, int i7) {
        int i10;
        int i11;
        if (i7 == 0) {
            return true;
        }
        CollectPreconditions.checkPositive(i7, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i10 = atomicInteger.get();
            if (i10 < i7) {
                return false;
            }
            i11 = i10 - i7;
        } while (!atomicInteger.compareAndSet(i10, i11));
        if (i11 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e10, int i7) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        Preconditions.checkNotNull(e10);
        CollectPreconditions.checkNonnegative(i7, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY);
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.safeGet(this.countMap, e10);
            if (atomicIntegerPutIfAbsent != null || (i7 != 0 && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e10, new AtomicInteger(i7))) != null)) {
                while (true) {
                    int i10 = atomicIntegerPutIfAbsent.get();
                    if (i10 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i10, i7)) {
                        if (i7 == 0) {
                            this.countMap.remove(e10, atomicIntegerPutIfAbsent);
                        }
                        return i10;
                    }
                }
                if (i7 != 0) {
                    atomicInteger = new AtomicInteger(i7);
                    if (this.countMap.putIfAbsent(e10, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.countMap.replace(e10, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        Iterator<AtomicInteger> it = this.countMap.values().iterator();
        long j6 = 0;
        while (it.hasNext()) {
            j6 += (long) it.next().get();
        }
        return Ints.saturatedCast(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        Iterables.addAll(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    @Beta
    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e10, int i7, int i10) {
        Preconditions.checkNotNull(e10);
        CollectPreconditions.checkNonnegative(i7, "oldCount");
        CollectPreconditions.checkNonnegative(i10, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, e10);
        if (atomicInteger == null) {
            if (i7 != 0) {
                return false;
            }
            return i10 == 0 || this.countMap.putIfAbsent(e10, new AtomicInteger(i10)) == null;
        }
        int i11 = atomicInteger.get();
        if (i11 == i7) {
            if (i11 == 0) {
                if (i10 == 0) {
                    this.countMap.remove(e10, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i10);
                return this.countMap.putIfAbsent(e10, atomicInteger2) == null || this.countMap.replace(e10, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i11, i10)) {
                if (i10 == 0) {
                    this.countMap.remove(e10, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
