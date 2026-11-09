package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;

    @CheckForNull
    private final T lowerEndpoint;

    @CheckForNull
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;

    @CheckForNull
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z3, @CheckForNull T t, BoundType boundType, boolean z8, @CheckForNull T t3, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z3;
        this.hasUpperBound = z8;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t3;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z3) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t));
        }
        if (z8) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t3), (Object) NullnessCasts.uncheckedCastNullableTToT(t3));
        }
        if (z3 && z8) {
            int iCompare = comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t3));
            Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t3);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType, @ParametricNullness T t3, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t, boundType, true, t3, boundType2);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean contains(@ParametricNullness T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    @CheckForNull
    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    @CheckForNull
    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        int iCompare;
        int iCompare2;
        T t;
        int iCompare3;
        BoundType boundType;
        Preconditions.checkNotNull(generalRange);
        Preconditions.checkArgument(this.comparator.equals(generalRange.comparator));
        boolean z3 = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z3 = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (iCompare == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z8 = z3;
        boolean z10 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z10 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (iCompare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z11 = z10;
        T t3 = upperEndpoint;
        if (z8 && z11 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t3)) > 0 || (iCompare3 == 0 && lowerBoundType == (boundType = BoundType.OPEN) && upperBoundType == boundType))) {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            t = t3;
        } else {
            t = lowerEndpoint;
        }
        return new GeneralRange<>(this.comparator, z8, t, lowerBoundType, z11, t3, upperBoundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isEmpty() {
        if (hasUpperBound() && tooLow(NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) {
            return true;
        }
        return hasLowerBound() && tooHigh(NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
    }

    public GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.comparator);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c6 = boundType == boundType2 ? '[' : '(';
        String strValueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String strValueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c10 = this.upperBoundType == boundType2 ? ']' : ')';
        StringBuilder sb2 = new StringBuilder(strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 4);
        sb2.append(strValueOf);
        sb2.append(":");
        sb2.append(c6);
        sb2.append(strValueOf2);
        sb2.append(',');
        sb2.append(strValueOf3);
        sb2.append(c10);
        return sb2.toString();
    }

    public boolean tooHigh(@ParametricNullness T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        return ((iCompare == 0) & (getUpperBoundType() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean tooLow(@ParametricNullness T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        return ((iCompare == 0) & (getLowerBoundType() == BoundType.OPEN)) | (iCompare < 0);
    }
}
