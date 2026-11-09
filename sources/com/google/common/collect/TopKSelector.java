package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22809k;

    @CheckForNull
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i7) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f22809k = i7;
        Preconditions.checkArgument(i7 >= 0, "k (%s) must be >= 0", i7);
        Preconditions.checkArgument(i7 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i7);
        this.buffer = (T[]) new Object[IntMath.checkedMultiply(i7, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i7) {
        return greatest(i7, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i7) {
        return least(i7, Ordering.natural());
    }

    private int partition(int i7, int i10, int i11) {
        Object objUncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]);
        T[] tArr = this.buffer;
        tArr[i11] = tArr[i10];
        int i12 = i7;
        while (i7 < i10) {
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i7]), objUncheckedCastNullableTToT) < 0) {
                swap(i12, i7);
                i12++;
            }
            i7++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i10] = tArr2[i12];
        tArr2[i12] = objUncheckedCastNullableTToT;
        return i12;
    }

    private void swap(int i7, int i10) {
        T[] tArr = this.buffer;
        T t = tArr[i7];
        tArr[i7] = tArr[i10];
        tArr[i10] = t;
    }

    private void trim() {
        int i7 = (this.f22809k * 2) - 1;
        int iLog2 = IntMath.log2(i7, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i10 = 0;
        int i11 = 0;
        while (iMax < i7) {
            int iPartition = partition(iMax, i7, ((iMax + i7) + 1) >>> 1);
            int i12 = this.f22809k;
            if (iPartition <= i12) {
                if (iPartition >= i12) {
                    break;
                }
                iMax = Math.max(iPartition, iMax + 1);
                i11 = iPartition;
            } else {
                i7 = iPartition - 1;
            }
            i10++;
            if (i10 >= iLog2) {
                Arrays.sort(this.buffer, iMax, i7 + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.f22809k;
        this.threshold = (T) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]);
        while (true) {
            i11++;
            if (i11 >= this.f22809k) {
                return;
            }
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]), (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i11];
            }
        }
    }

    public void offer(@ParametricNullness T t) {
        int i7 = this.f22809k;
        if (i7 == 0) {
            return;
        }
        int i10 = this.bufferSize;
        if (i10 == 0) {
            this.buffer[0] = t;
            this.threshold = t;
            this.bufferSize = 1;
            return;
        }
        if (i10 < i7) {
            T[] tArr = this.buffer;
            this.bufferSize = i10 + 1;
            tArr[i10] = t;
            if (this.comparator.compare(t, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = t;
                return;
            }
            return;
        }
        if (this.comparator.compare(t, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
            T[] tArr2 = this.buffer;
            int i11 = this.bufferSize;
            int i12 = i11 + 1;
            this.bufferSize = i12;
            tArr2[i11] = t;
            if (i12 == this.f22809k * 2) {
                trim();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        Arrays.sort(this.buffer, 0, this.bufferSize, this.comparator);
        int i7 = this.bufferSize;
        int i10 = this.f22809k;
        if (i7 > i10) {
            T[] tArr = this.buffer;
            Arrays.fill(tArr, i10, tArr.length, (Object) null);
            int i11 = this.f22809k;
            this.bufferSize = i11;
            this.threshold = this.buffer[i11 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.buffer, this.bufferSize)));
    }

    public static <T> TopKSelector<T> greatest(int i7, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i7);
    }

    public static <T> TopKSelector<T> least(int i7, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i7);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
