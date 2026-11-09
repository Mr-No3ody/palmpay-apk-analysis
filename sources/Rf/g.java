package Rf;

import kotlin.ranges.ClosedRange;
import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends d implements ClosedRange, OpenEndRange {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final f f8623e = new f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f8624f = new g(1, 0);

    public g(long j6, long j10) {
        super(j6, j10, 1L);
    }

    public final boolean a(long j6) {
        return this.f8616a <= j6 && j6 <= this.f8617b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).longValue());
    }

    @Override // Rf.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f8616a == gVar.f8616a) {
            return this.f8617b == gVar.f8617b;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final Comparable getEndExclusive() {
        long j6 = this.f8617b;
        if (j6 != Long.MAX_VALUE) {
            return Long.valueOf(j6 + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Long.valueOf(this.f8617b);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final Comparable getStart() {
        return Long.valueOf(this.f8616a);
    }

    @Override // Rf.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j6 = this.f8616a;
        long j10 = ((long) 31) * (j6 ^ (j6 >>> 32));
        long j11 = this.f8617b;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    @Override // Rf.d, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final boolean isEmpty() {
        return this.f8616a > this.f8617b;
    }

    @Override // Rf.d
    public final String toString() {
        return this.f8616a + ".." + this.f8617b;
    }
}
