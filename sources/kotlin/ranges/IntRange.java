package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntRange extends a implements ClosedRange<Integer>, OpenEndRange<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntRange f38975f = new IntRange(1, 0, 1);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRange getEMPTY() {
            return IntRange.f38975f;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        if (this.f38977a == intRange.f38977a) {
            return this.f38978b == intRange.f38978b;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final Comparable getEndExclusive() {
        int i7 = this.f38978b;
        if (i7 != Integer.MAX_VALUE) {
            return Integer.valueOf(i7 + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f38978b);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final Comparable getStart() {
        return Integer.valueOf(this.f38977a);
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f38977a * 31) + this.f38978b;
    }

    @Override // kotlin.ranges.a, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public final boolean isEmpty() {
        return this.f38977a > this.f38978b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f38977a + ".." + this.f38978b;
    }

    public final boolean contains(int i7) {
        return this.f38977a <= i7 && i7 <= this.f38978b;
    }
}
