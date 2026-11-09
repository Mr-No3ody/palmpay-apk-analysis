package com.google.common.math;

import N8.q0;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public final class StatsAccumulator {
    private long count = 0;
    private double mean = 0.0d;
    private double sumOfSquaresOfDeltas = 0.0d;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public static double calculateNewMeanNonFinite(double d2, double d10) {
        if (Doubles.isFinite(d2)) {
            return d10;
        }
        if (Doubles.isFinite(d10) || d2 == d10) {
            return d2;
        }
        return Double.NaN;
    }

    private void merge(long j6, double d2, double d10, double d11, double d12) {
        long j10 = this.count;
        if (j10 == 0) {
            this.count = j6;
            this.mean = d2;
            this.sumOfSquaresOfDeltas = d10;
            this.min = d11;
            this.max = d12;
            return;
        }
        this.count = j10 + j6;
        if (Doubles.isFinite(this.mean) && Doubles.isFinite(d2)) {
            double d13 = this.mean;
            double d14 = d2 - d13;
            double d15 = j6;
            double d16 = ((d14 * d15) / this.count) + d13;
            this.mean = d16;
            this.sumOfSquaresOfDeltas = ((d2 - d16) * d14 * d15) + d10 + this.sumOfSquaresOfDeltas;
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d2);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d11);
        this.max = Math.max(this.max, d12);
    }

    public void add(double d2) {
        double d10;
        long j6 = this.count;
        if (j6 == 0) {
            this.count = 1L;
            this.mean = d2;
            this.min = d2;
            this.max = d2;
            if (Doubles.isFinite(d2)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j6 + 1;
        if (Doubles.isFinite(d2) && Doubles.isFinite(this.mean)) {
            double d11 = this.mean;
            double d12 = d2 - d11;
            double d13 = (d12 / this.count) + d11;
            this.mean = d13;
            d10 = d2;
            this.sumOfSquaresOfDeltas = q0.a(d2, d13, d12, this.sumOfSquaresOfDeltas);
        } else {
            d10 = d2;
            this.mean = calculateNewMeanNonFinite(this.mean, d10);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public long count() {
        return this.count;
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d2 : dArr) {
            add(d2);
        }
    }

    public void addAll(int... iArr) {
        for (int i7 : iArr) {
            add(i7);
        }
    }

    public void addAll(long... jArr) {
        for (long j6 : jArr) {
            add(j6);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }
}
