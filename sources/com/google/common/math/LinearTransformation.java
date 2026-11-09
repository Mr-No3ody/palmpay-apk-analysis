package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private final double f22864x1;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private final double f22865y1;

        public LinearTransformation and(double d2, double d10) {
            Preconditions.checkArgument(DoubleUtils.isFinite(d2) && DoubleUtils.isFinite(d10));
            double d11 = this.f22864x1;
            if (d2 != d11) {
                return withSlope((d10 - this.f22865y1) / (d2 - d11));
            }
            Preconditions.checkArgument(d10 != this.f22865y1);
            return new VerticalLinearTransformation(this.f22864x1);
        }

        public LinearTransformation withSlope(double d2) {
            Preconditions.checkArgument(!Double.isNaN(d2));
            return DoubleUtils.isFinite(d2) ? new RegularLinearTransformation(d2, this.f22865y1 - (this.f22864x1 * d2)) : new VerticalLinearTransformation(this.f22864x1);
        }

        private LinearTransformationBuilder(double d2, double d10) {
            this.f22864x1 = d2;
            this.f22865y1 = d10;
        }
    }

    public static final class NaNLinearTransformation extends LinearTransformation {
        static final NaNLinearTransformation INSTANCE = new NaNLinearTransformation();

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
            return Double.NaN;
        }
    }

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.INSTANCE;
    }

    public static LinearTransformation horizontal(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        return new RegularLinearTransformation(0.0d, d2);
    }

    public static LinearTransformationBuilder mapping(double d2, double d10) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2) && DoubleUtils.isFinite(d10));
        return new LinearTransformationBuilder(d2, d10);
    }

    public static LinearTransformation vertical(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        return new VerticalLinearTransformation(d2);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d2);

    public static final class VerticalLinearTransformation extends LinearTransformation {

        @CheckForNull
        @LazyInit
        LinearTransformation inverse;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final double f22866x;

        public VerticalLinearTransformation(double d2) {
            this.f22866x = d2;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            return new RegularLinearTransformation(0.0d, this.f22866x, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f22866x));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
            throw new IllegalStateException();
        }

        public VerticalLinearTransformation(double d2, LinearTransformation linearTransformation) {
            this.f22866x = d2;
            this.inverse = linearTransformation;
        }
    }

    public static final class RegularLinearTransformation extends LinearTransformation {

        @CheckForNull
        @LazyInit
        LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        public RegularLinearTransformation(double d2, double d10) {
            this.slope = d2;
            this.yIntercept = d10;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            double d2 = this.slope;
            return d2 != 0.0d ? new RegularLinearTransformation(1.0d / d2, (this.yIntercept * (-1.0d)) / d2, this) : new VerticalLinearTransformation(this.yIntercept, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.slope == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.slope;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.slope), Double.valueOf(this.yIntercept));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
            return (d2 * this.slope) + this.yIntercept;
        }

        public RegularLinearTransformation(double d2, double d10, LinearTransformation linearTransformation) {
            this.slope = d2;
            this.yIntercept = d10;
            this.inverse = linearTransformation;
        }
    }
}
