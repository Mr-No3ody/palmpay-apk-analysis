package com.google.zxing.common.reedsolomon;

import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReedSolomonEncoder {
    private final List<GenericGFPoly> cachedGenerators;
    private final GenericGF field;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.field = genericGF;
        ArrayList arrayList = new ArrayList();
        this.cachedGenerators = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    private GenericGFPoly buildGenerator(int i7) {
        if (i7 >= this.cachedGenerators.size()) {
            GenericGFPoly genericGFPolyMultiply = (GenericGFPoly) u.e(1, this.cachedGenerators);
            for (int size = this.cachedGenerators.size(); size <= i7; size++) {
                GenericGF genericGF = this.field;
                genericGFPolyMultiply = genericGFPolyMultiply.multiply(new GenericGFPoly(genericGF, new int[]{1, genericGF.exp(genericGF.getGeneratorBase() + (size - 1))}));
                this.cachedGenerators.add(genericGFPolyMultiply);
            }
        }
        return this.cachedGenerators.get(i7);
    }

    public void encode(int[] iArr, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i7;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        GenericGFPoly genericGFPolyBuildGenerator = buildGenerator(i7);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] coefficients = new GenericGFPoly(this.field, iArr2).multiplyByMonomial(i7, 1).divide(genericGFPolyBuildGenerator)[1].getCoefficients();
        int length2 = i7 - coefficients.length;
        for (int i10 = 0; i10 < length2; i10++) {
            iArr[length + i10] = 0;
        }
        System.arraycopy(coefficients, 0, iArr, length + length2, coefficients.length);
    }
}
