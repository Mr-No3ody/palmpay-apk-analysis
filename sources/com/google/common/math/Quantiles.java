package com.google.common.math;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public final class Quantiles {

    public static final class Scale {
        private final int scale;

        public ScaleAndIndex index(int i7) {
            return new ScaleAndIndex(this.scale, i7);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.scale, (int[]) iArr.clone());
        }

        private Scale(int i7) {
            Preconditions.checkArgument(i7 > 0, "Quantile scale must be positive");
            this.scale = i7;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.scale, Ints.toArray(collection));
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                return Double.NaN;
            }
            long length = ((long) this.index) * ((long) (dArr.length - 1));
            int iDivide = (int) LongMath.divide(length, this.scale, RoundingMode.DOWN);
            int i7 = (int) (length - (((long) iDivide) * ((long) this.scale)));
            Quantiles.selectInPlace(iDivide, dArr, 0, dArr.length - 1);
            if (i7 == 0) {
                return dArr[iDivide];
            }
            int i10 = iDivide + 1;
            Quantiles.selectInPlace(i10, dArr, i10, dArr.length - 1);
            return Quantiles.interpolate(dArr[iDivide], dArr[i10], i7, this.scale);
        }

        private ScaleAndIndex(int i7, int i10) {
            Quantiles.checkIndex(i10, i7);
            this.scale = i7;
            this.index = i10;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            int i7 = 0;
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i7 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i7]), Double.valueOf(Double.NaN));
                    i7++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr6 = this.indexes;
                if (i10 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i10]) * ((long) (dArr.length - 1));
                int iDivide = (int) LongMath.divide(length2, this.scale, RoundingMode.DOWN);
                int i12 = (int) (length2 - (((long) iDivide) * ((long) this.scale)));
                iArr3[i10] = iDivide;
                iArr4[i10] = i12;
                iArr5[i11] = iDivide;
                int i13 = i11 + 1;
                if (i12 != 0) {
                    iArr5[i13] = iDivide + 1;
                    i11 += 2;
                } else {
                    i11 = i13;
                }
                i10++;
            }
            Arrays.sort(iArr5, 0, i11);
            Quantiles.selectAllInPlace(iArr5, 0, i11 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.indexes;
                if (i7 >= iArr7.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i14 = iArr3[i7];
                int i15 = iArr4[i7];
                if (i15 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i7]), Double.valueOf(dArr[i14]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i7]), Double.valueOf(Quantiles.interpolate(dArr[i14], dArr[i14 + 1], i15, this.scale)));
                }
                i7++;
            }
        }

        private ScaleAndIndexes(int i7, int[] iArr) {
            for (int i10 : iArr) {
                Quantiles.checkIndex(i10, i7);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.scale = i7;
            this.indexes = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IllegalArgumentException(d.g(70, i10, "Quantile indexes must be between 0 and the scale, which is "));
        }
    }

    private static int chooseNextSelection(int[] iArr, int i7, int i10, int i11, int i12) {
        if (i7 == i10) {
            return i7;
        }
        int i13 = i11 + i12;
        int i14 = i13 >>> 1;
        while (i10 > i7 + 1) {
            int i15 = (i7 + i10) >>> 1;
            int i16 = iArr[i15];
            if (i16 > i14) {
                i10 = i15;
            } else {
                if (i16 >= i14) {
                    return i15;
                }
                i7 = i15;
            }
        }
        return (i13 - iArr[i7]) - iArr[i10] > 0 ? i10 : i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dArr) {
        for (double d2 : dArr) {
            if (Double.isNaN(d2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double d2, double d10, double d11, double d12) {
        if (d2 == Double.NEGATIVE_INFINITY) {
            return d10 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d10 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return (((d10 - d2) * d11) / d12) + d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i7 = 0; i7 < length; i7++) {
            dArr[i7] = iArr[i7];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i7 = 0; i7 < length; i7++) {
            dArr[i7] = jArr[i7];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i7, int i10) {
        int i11 = (i7 + i10) >>> 1;
        double d2 = dArr[i10];
        double d10 = dArr[i11];
        boolean z3 = d2 < d10;
        double d11 = dArr[i7];
        boolean z8 = d10 < d11;
        boolean z10 = d2 < d11;
        if (z3 == z8) {
            swap(dArr, i11, i7);
        } else if (z3 != z10) {
            swap(dArr, i7, i10);
        }
    }

    private static int partition(double[] dArr, int i7, int i10) {
        movePivotToStartOfSlice(dArr, i7, i10);
        double d2 = dArr[i7];
        int i11 = i10;
        while (i10 > i7) {
            if (dArr[i10] > d2) {
                swap(dArr, i11, i10);
                i11--;
            }
            i10--;
        }
        swap(dArr, i7, i11);
        return i11;
    }

    public static Scale percentiles() {
        return scale(100);
    }

    public static Scale quartiles() {
        return scale(4);
    }

    public static Scale scale(int i7) {
        return new Scale(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] iArr, int i7, int i10, double[] dArr, int i11, int i12) {
        int iChooseNextSelection = chooseNextSelection(iArr, i7, i10, i11, i12);
        int i13 = iArr[iChooseNextSelection];
        selectInPlace(i13, dArr, i11, i12);
        int i14 = iChooseNextSelection - 1;
        while (i14 >= i7 && iArr[i14] == i13) {
            i14--;
        }
        if (i14 >= i7) {
            selectAllInPlace(iArr, i7, i14, dArr, i11, i13 - 1);
        }
        int i15 = iChooseNextSelection + 1;
        while (i15 <= i10 && iArr[i15] == i13) {
            i15++;
        }
        if (i15 <= i10) {
            selectAllInPlace(iArr, i15, i10, dArr, i13 + 1, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int i7, double[] dArr, int i10, int i11) {
        if (i7 != i10) {
            while (i11 > i10) {
                int iPartition = partition(dArr, i10, i11);
                if (iPartition >= i7) {
                    i11 = iPartition - 1;
                }
                if (iPartition <= i7) {
                    i10 = iPartition + 1;
                }
            }
            return;
        }
        int i12 = i10;
        for (int i13 = i10 + 1; i13 <= i11; i13++) {
            if (dArr[i12] > dArr[i13]) {
                i12 = i13;
            }
        }
        if (i12 != i10) {
            swap(dArr, i12, i10);
        }
    }

    private static void swap(double[] dArr, int i7, int i10) {
        double d2 = dArr[i7];
        dArr[i7] = dArr[i10];
        dArr[i10] = d2;
    }
}
