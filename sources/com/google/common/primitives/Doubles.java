package com.google.common.primitives;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Doubles extends DoublesMethodsForWeb {
    public static final int BYTES = 8;

    @GwtIncompatible
    static final Pattern FLOATING_POINT_PATTERN = fpPattern();

    @GwtCompatible
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        public DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Double) && Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != doubleArrayAsList.array[doubleArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Double) || (iIndexOf = Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Double) || (iLastIndexOf = Doubles.lastIndexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.array;
            int i11 = this.start;
            return new DoubleArrayAsList(dArr, i7 + i11, i11 + i10);
        }

        public double[] toDoubleArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.array[this.start]);
            int i7 = this.start;
            while (true) {
                i7++;
                if (i7 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i7]);
            }
        }

        public DoubleArrayAsList(double[] dArr, int i7, int i10) {
            this.array = dArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Double.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i7, Double d2) {
            Preconditions.checkElementIndex(i7, size());
            double[] dArr = this.array;
            int i10 = this.start;
            double d10 = dArr[i10 + i7];
            dArr[i10 + i7] = ((Double) Preconditions.checkNotNull(d2)).doubleValue();
            return Double.valueOf(d10);
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        static final DoubleConverter INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Double d2) {
            return d2.toString();
        }

        @Override // com.google.common.base.Converter
        public Double doForward(String str) {
            return Double.valueOf(str);
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Double.compare(dArr[i7], dArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    private Doubles() {
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new DoubleArrayAsList(dArr);
    }

    public static int compare(double d2, double d10) {
        return Double.compare(d2, d10);
    }

    public static double[] concat(double[]... dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        double[] dArr3 = new double[length];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    @Beta
    public static double constrainToRange(double d2, double d10, double d11) {
        if (d10 <= d11) {
            return Math.min(Math.max(d2, d10), d11);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(d10), Double.valueOf(d11)));
    }

    public static boolean contains(double[] dArr, double d2) {
        for (double d10 : dArr) {
            if (d10 == d2) {
                return true;
            }
        }
        return false;
    }

    public static double[] ensureCapacity(double[] dArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return dArr.length < i7 ? Arrays.copyOf(dArr, i7 + i10) : dArr;
    }

    @GwtIncompatible
    private static Pattern fpPattern() {
        String strConcat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb2 = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb2.append("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        String string = sb2.toString();
        StringBuilder sbP = d.p("[+-]?(?:NaN|Infinity|", d.c(d.c(23, strConcat), string), strConcat, "|", string);
        sbP.append(")");
        return Pattern.compile(sbP.toString().replace("#", "+"));
    }

    public static int hashCode(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    public static int indexOf(double[] dArr, double d2) {
        return indexOf(dArr, d2, 0, dArr.length);
    }

    public static boolean isFinite(double d2) {
        return Double.NEGATIVE_INFINITY < d2 && d2 < Double.POSITIVE_INFINITY;
    }

    public static String join(String str, double... dArr) {
        Preconditions.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i7 = 1; i7 < dArr.length; i7++) {
            sb2.append(str);
            sb2.append(dArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(double[] dArr, double d2) {
        return lastIndexOf(dArr, d2, 0, dArr.length);
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i7 = 1; i7 < dArr.length; i7++) {
            dMax = Math.max(dMax, dArr[i7]);
        }
        return dMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i7 = 1; i7 < dArr.length; i7++) {
            dMin = Math.min(dMin, dArr[i7]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    @Beta
    public static Converter<String, Double> stringConverter() {
        return DoubleConverter.INSTANCE;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).toDoubleArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i7 = 0; i7 < length; i7++) {
            dArr[i7] = ((Number) Preconditions.checkNotNull(array[i7])).doubleValue();
        }
        return dArr;
    }

    @Beta
    @CheckForNull
    @GwtIncompatible
    public static Double tryParse(String str) {
        if (!FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] dArr, double d2, int i7, int i10) {
        while (i7 < i10) {
            if (dArr[i7] == d2) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] dArr, double d2, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (dArr[i11] == d2) {
                return i11;
            }
        }
        return -1;
    }

    public static int indexOf(double[] dArr, double[] dArr2) {
        Preconditions.checkNotNull(dArr, "array");
        Preconditions.checkNotNull(dArr2, "target");
        if (dArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (dArr.length - dArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < dArr2.length; i10++) {
                if (dArr[i7 + i10] != dArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(double[] dArr, int i7, int i10) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i7, i10, dArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            double d2 = dArr[i7];
            dArr[i7] = dArr[i11];
            dArr[i11] = d2;
            i7++;
        }
    }

    public static void sortDescending(double[] dArr, int i7, int i10) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i7, i10, dArr.length);
        Arrays.sort(dArr, i7, i10);
        reverse(dArr, i7, i10);
    }
}
