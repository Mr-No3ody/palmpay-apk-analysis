package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes3.dex */
final class GenericGFPoly {
    private final int[] coefficients;
    private final GenericGF field;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.field = genericGF;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.coefficients = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.coefficients = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i7];
        this.coefficients = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, iArr2.length);
    }

    public GenericGFPoly addOrSubtract(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero()) {
            return genericGFPoly;
        }
        if (genericGFPoly.isZero()) {
            return this;
        }
        int[] iArr = this.coefficients;
        int[] iArr2 = genericGFPoly.coefficients;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = GenericGF.addOrSubtract(iArr2[i7 - length], iArr[i7]);
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    public GenericGFPoly[] divide(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.isZero()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly zero = this.field.getZero();
        int iInverse = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
        GenericGFPoly genericGFPolyAddOrSubtract = this;
        while (genericGFPolyAddOrSubtract.getDegree() >= genericGFPoly.getDegree() && !genericGFPolyAddOrSubtract.isZero()) {
            int degree = genericGFPolyAddOrSubtract.getDegree() - genericGFPoly.getDegree();
            int iMultiply = this.field.multiply(genericGFPolyAddOrSubtract.getCoefficient(genericGFPolyAddOrSubtract.getDegree()), iInverse);
            GenericGFPoly genericGFPolyMultiplyByMonomial = genericGFPoly.multiplyByMonomial(degree, iMultiply);
            zero = zero.addOrSubtract(this.field.buildMonomial(degree, iMultiply));
            genericGFPolyAddOrSubtract = genericGFPolyAddOrSubtract.addOrSubtract(genericGFPolyMultiplyByMonomial);
        }
        return new GenericGFPoly[]{zero, genericGFPolyAddOrSubtract};
    }

    public int evaluateAt(int i7) {
        if (i7 == 0) {
            return getCoefficient(0);
        }
        if (i7 == 1) {
            int iAddOrSubtract = 0;
            for (int i10 : this.coefficients) {
                iAddOrSubtract = GenericGF.addOrSubtract(iAddOrSubtract, i10);
            }
            return iAddOrSubtract;
        }
        int[] iArr = this.coefficients;
        int iAddOrSubtract2 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            iAddOrSubtract2 = GenericGF.addOrSubtract(this.field.multiply(i7, iAddOrSubtract2), this.coefficients[i11]);
        }
        return iAddOrSubtract2;
    }

    public int getCoefficient(int i7) {
        int[] iArr = this.coefficients;
        return iArr[(iArr.length - 1) - i7];
    }

    public int[] getCoefficients() {
        return this.coefficients;
    }

    public int getDegree() {
        return this.coefficients.length - 1;
    }

    public boolean isZero() {
        return this.coefficients[0] == 0;
    }

    public GenericGFPoly multiply(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero() || genericGFPoly.isZero()) {
            return this.field.getZero();
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = GenericGF.addOrSubtract(iArr3[i12], this.field.multiply(i10, iArr2[i11]));
            }
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    public GenericGFPoly multiplyByMonomial(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.field.getZero();
        }
        int length = this.coefficients.length;
        int[] iArr = new int[i7 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.field.multiply(this.coefficients[i11], i10);
        }
        return new GenericGFPoly(this.field, iArr);
    }

    public String toString() {
        if (isZero()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(getDegree() * 8);
        for (int degree = getDegree(); degree >= 0; degree--) {
            int coefficient = getCoefficient(degree);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    if (degree == getDegree()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    coefficient = -coefficient;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (degree == 0 || coefficient != 1) {
                    int iLog = this.field.log(coefficient);
                    if (iLog == 0) {
                        sb2.append('1');
                    } else if (iLog == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iLog);
                    }
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(degree);
                    }
                }
            }
        }
        return sb2.toString();
    }

    public GenericGFPoly multiply(int i7) {
        if (i7 == 0) {
            return this.field.getZero();
        }
        if (i7 == 1) {
            return this;
        }
        int length = this.coefficients.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.field.multiply(this.coefficients[i10], i7);
        }
        return new GenericGFPoly(this.field, iArr);
    }
}
