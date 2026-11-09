package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        public ComparisonChain classify(int i7) {
            if (i7 < 0) {
                return ComparisonChain.LESS;
            }
            return i7 > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z3, boolean z8) {
            return classify(Booleans.compare(z3, z8));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z3, boolean z8) {
            return classify(Booleans.compare(z8, z3));
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t3, Comparator<T> comparator) {
            return classify(comparator.compare(t, t3));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i7, int i10) {
            return classify(Ints.compare(i7, i10));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j6, long j10) {
            return classify(Longs.compare(j6, j10));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f10, float f11) {
            return classify(Float.compare(f10, f11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d2, double d10) {
            return classify(Double.compare(d2, d10));
        }
    };
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    public static final class InactiveComparisonChain extends ComparisonChain {
        final int result;

        public InactiveComparisonChain(int i7) {
            super();
            this.result = i7;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d2, double d10) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z3, boolean z8) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z3, boolean z8) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f10, float f11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i7, int i10) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j6, long j10) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t3, Comparator<T> comparator) {
            return this;
        }
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    public abstract ComparisonChain compare(double d2, double d10);

    public abstract ComparisonChain compare(float f10, float f11);

    public abstract ComparisonChain compare(int i7, int i10);

    public abstract ComparisonChain compare(long j6, long j10);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t3, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z3, boolean z8);

    public abstract ComparisonChain compareTrueFirst(boolean z3, boolean z8);

    public abstract int result();

    private ComparisonChain() {
    }
}
