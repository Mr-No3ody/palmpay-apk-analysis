package com.google.zxing.qrcode.encoder;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
final class MaskUtil {

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    private static final int f23127N1 = 3;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    private static final int f23128N2 = 3;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    private static final int f23129N3 = 40;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    private static final int f23130N4 = 10;

    private MaskUtil() {
    }

    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        return applyMaskPenaltyRule1Internal(byteMatrix, true) + applyMaskPenaltyRule1Internal(byteMatrix, false);
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix byteMatrix, boolean z3) {
        int height = z3 ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z3 ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        int i7 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            byte b7 = -1;
            int i11 = 0;
            for (int i12 = 0; i12 < width; i12++) {
                byte b10 = z3 ? array[i10][i12] : array[i12][i10];
                if (b10 == b7) {
                    i11++;
                } else {
                    if (i11 >= 5) {
                        i7 += i11 - 2;
                    }
                    i11 = 1;
                    b7 = b10;
                }
            }
            if (i11 >= 5) {
                i7 = (i11 - 2) + i7;
            }
        }
        return i7;
    }

    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i7 = 0;
        for (int i10 = 0; i10 < height - 1; i10++) {
            byte[] bArr = array[i10];
            int i11 = 0;
            while (i11 < width - 1) {
                byte b7 = bArr[i11];
                int i12 = i11 + 1;
                if (b7 == bArr[i12]) {
                    byte[] bArr2 = array[i10 + 1];
                    if (b7 == bArr2[i11] && b7 == bArr2[i12]) {
                        i7++;
                    }
                }
                i11 = i12;
            }
        }
        return i7 * 3;
    }

    public static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i7 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < width; i11++) {
                byte[] bArr = array[i10];
                int i12 = i11 + 6;
                if (i12 < width && bArr[i11] == 1 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 1 && bArr[i11 + 3] == 1 && bArr[i11 + 4] == 1 && bArr[i11 + 5] == 0 && bArr[i12] == 1 && (isWhiteHorizontal(bArr, i11 - 4, i11) || isWhiteHorizontal(bArr, i11 + 7, i11 + 11))) {
                    i7++;
                }
                int i13 = i10 + 6;
                if (i13 < height && array[i10][i11] == 1 && array[i10 + 1][i11] == 0 && array[i10 + 2][i11] == 1 && array[i10 + 3][i11] == 1 && array[i10 + 4][i11] == 1 && array[i10 + 5][i11] == 0 && array[i13][i11] == 1 && (isWhiteVertical(array, i11, i10 - 4, i10) || isWhiteVertical(array, i11, i10 + 7, i10 + 11))) {
                    i7++;
                }
            }
        }
        return i7 * 40;
    }

    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i7 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            byte[] bArr = array[i10];
            for (int i11 = 0; i11 < width; i11++) {
                if (bArr[i11] == 1) {
                    i7++;
                }
            }
        }
        int width2 = byteMatrix.getWidth() * byteMatrix.getHeight();
        return ((Math.abs((i7 * 2) - width2) * 10) / width2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[RETURN] */
    public static boolean getDataMaskBit(int i7, int i10, int i11) {
        int i12;
        switch (i7) {
            case 0:
                i11 += i10;
                i12 = i11 & 1;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 1:
                i12 = i11 & 1;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 2:
                i12 = i10 % 3;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 3:
                i12 = (i11 + i10) % 3;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 4:
                i12 = ((i10 / 3) + (i11 / 2)) & 1;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i13 = i11 * i10;
                i12 = (i13 & 1) + (i13 % 3);
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i14 = i11 * i10;
                i11 = (i14 % 3) + (i14 & 1);
                i12 = i11 & 1;
                if (i12 == 0) {
                    return true;
                }
                return false;
            case 7:
                i12 = (((i11 * i10) % 3) + ((i11 + i10) & 1)) & 1;
                if (i12 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException(G.m(i7, "Invalid mask pattern: "));
        }
    }

    private static boolean isWhiteHorizontal(byte[] bArr, int i7, int i10) {
        if (i7 < 0 || bArr.length < i10) {
            return false;
        }
        while (i7 < i10) {
            if (bArr[i7] == 1) {
                return false;
            }
            i7++;
        }
        return true;
    }

    private static boolean isWhiteVertical(byte[][] bArr, int i7, int i10, int i11) {
        if (i10 < 0 || bArr.length < i11) {
            return false;
        }
        while (i10 < i11) {
            if (bArr[i10][i7] == 1) {
                return false;
            }
            i10++;
        }
        return true;
    }
}
