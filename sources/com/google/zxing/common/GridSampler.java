package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GridSampler {
    private static GridSampler gridSampler = new DefaultGridSampler();

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:55:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007e A[SYNTHETIC] */
    public static void checkAndNudgePoints(BitMatrix bitMatrix, float[] fArr) throws NotFoundException {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int length = fArr.length - 1;
        boolean z3 = true;
        for (int i7 = 0; i7 < length && z3; i7 += 2) {
            int i10 = (int) fArr[i7];
            int i11 = i7 + 1;
            int i12 = (int) fArr[i11];
            if (i10 < -1 || i10 > width || i12 < -1 || i12 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i10 == -1) {
                fArr[i7] = 0.0f;
            } else {
                if (i10 == width) {
                    fArr[i7] = width - 1;
                } else {
                    z3 = false;
                }
                if (i12 == -1) {
                    fArr[i11] = 0.0f;
                } else {
                    if (i12 == height) {
                        fArr[i11] = height - 1;
                    }
                }
                z3 = true;
            }
            z3 = true;
            if (i12 == -1) {
                fArr[i11] = 0.0f;
            } else {
                if (i12 == height) {
                    fArr[i11] = height - 1;
                }
            }
            z3 = true;
        }
        boolean z8 = true;
        for (int length2 = fArr.length - 2; length2 >= 0 && z8; length2 -= 2) {
            int i13 = (int) fArr[length2];
            int i14 = length2 + 1;
            int i15 = (int) fArr[i14];
            if (i13 < -1 || i13 > width || i15 < -1 || i15 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i13 == -1) {
                fArr[length2] = 0.0f;
            } else {
                if (i13 == width) {
                    fArr[length2] = width - 1;
                } else {
                    z8 = false;
                }
                if (i15 == -1) {
                    fArr[i14] = 0.0f;
                } else {
                    if (i15 == height) {
                        fArr[i14] = height - 1;
                    }
                }
                z8 = true;
            }
            z8 = true;
            if (i15 == -1) {
                fArr[i14] = 0.0f;
            } else {
                if (i15 == height) {
                    fArr[i14] = height - 1;
                }
            }
            z8 = true;
        }
    }

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridSampler2) {
        gridSampler = gridSampler2;
    }

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i7, int i10, PerspectiveTransform perspectiveTransform) throws NotFoundException;
}
