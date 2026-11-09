package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCorrection {
    private final ModulusGF field = ModulusGF.PDF417_GF;

    private int[] findErrorLocations(ModulusPoly modulusPoly) throws ChecksumException {
        int degree = modulusPoly.getDegree();
        int[] iArr = new int[degree];
        int i7 = 0;
        for (int i10 = 1; i10 < this.field.getSize() && i7 < degree; i10++) {
            if (modulusPoly.evaluateAt(i10) == 0) {
                iArr[i7] = this.field.inverse(i10);
                i7++;
            }
        }
        if (i7 == degree) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private int[] findErrorMagnitudes(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int[] iArr) {
        int degree = modulusPoly2.getDegree();
        if (degree < 1) {
            return new int[0];
        }
        int[] iArr2 = new int[degree];
        for (int i7 = 1; i7 <= degree; i7++) {
            iArr2[degree - i7] = this.field.multiply(i7, modulusPoly2.getCoefficient(i7));
        }
        ModulusPoly modulusPoly3 = new ModulusPoly(this.field, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iInverse = this.field.inverse(iArr[i10]);
            iArr3[i10] = this.field.multiply(this.field.subtract(0, modulusPoly.evaluateAt(iInverse)), this.field.inverse(modulusPoly3.evaluateAt(iInverse)));
        }
        return iArr3;
    }

    private ModulusPoly[] runEuclideanAlgorithm(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int i7) throws ChecksumException {
        if (modulusPoly.getDegree() < modulusPoly2.getDegree()) {
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly2;
        }
        ModulusPoly zero = this.field.getZero();
        ModulusPoly one = this.field.getOne();
        while (true) {
            ModulusPoly modulusPoly3 = modulusPoly2;
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly3;
            ModulusPoly modulusPoly4 = one;
            ModulusPoly modulusPoly5 = zero;
            zero = modulusPoly4;
            if (modulusPoly.getDegree() < i7 / 2) {
                int coefficient = zero.getCoefficient(0);
                if (coefficient == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iInverse = this.field.inverse(coefficient);
                return new ModulusPoly[]{zero.multiply(iInverse), modulusPoly.multiply(iInverse)};
            }
            if (modulusPoly.isZero()) {
                throw ChecksumException.getChecksumInstance();
            }
            ModulusPoly zero2 = this.field.getZero();
            int iInverse2 = this.field.inverse(modulusPoly.getCoefficient(modulusPoly.getDegree()));
            while (modulusPoly2.getDegree() >= modulusPoly.getDegree() && !modulusPoly2.isZero()) {
                int degree = modulusPoly2.getDegree() - modulusPoly.getDegree();
                int iMultiply = this.field.multiply(modulusPoly2.getCoefficient(modulusPoly2.getDegree()), iInverse2);
                zero2 = zero2.add(this.field.buildMonomial(degree, iMultiply));
                modulusPoly2 = modulusPoly2.subtract(modulusPoly.multiplyByMonomial(degree, iMultiply));
            }
            one = zero2.multiply(zero).subtract(modulusPoly5).negative();
        }
    }

    public int decode(int[] iArr, int i7, int[] iArr2) throws ChecksumException {
        ModulusPoly modulusPoly = new ModulusPoly(this.field, iArr);
        int[] iArr3 = new int[i7];
        boolean z3 = false;
        for (int i10 = i7; i10 > 0; i10--) {
            int iEvaluateAt = modulusPoly.evaluateAt(this.field.exp(i10));
            iArr3[i7 - i10] = iEvaluateAt;
            if (iEvaluateAt != 0) {
                z3 = true;
            }
        }
        if (!z3) {
            return 0;
        }
        ModulusPoly one = this.field.getOne();
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                int iExp = this.field.exp((iArr.length - 1) - i11);
                ModulusGF modulusGF = this.field;
                one = one.multiply(new ModulusPoly(modulusGF, new int[]{modulusGF.subtract(0, iExp), 1}));
            }
        }
        ModulusPoly[] modulusPolyArrRunEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i7, 1), new ModulusPoly(this.field, iArr3), i7);
        ModulusPoly modulusPoly2 = modulusPolyArrRunEuclideanAlgorithm[0];
        ModulusPoly modulusPoly3 = modulusPolyArrRunEuclideanAlgorithm[1];
        int[] iArrFindErrorLocations = findErrorLocations(modulusPoly2);
        int[] iArrFindErrorMagnitudes = findErrorMagnitudes(modulusPoly3, modulusPoly2, iArrFindErrorLocations);
        for (int i12 = 0; i12 < iArrFindErrorLocations.length; i12++) {
            int length = (iArr.length - 1) - this.field.log(iArrFindErrorLocations[i12]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.field.subtract(iArr[length], iArrFindErrorMagnitudes[i12]);
        }
        return iArrFindErrorLocations.length;
    }
}
