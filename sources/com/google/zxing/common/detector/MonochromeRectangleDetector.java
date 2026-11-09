package com.google.zxing.common.detector;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:40:0x0056  */
    /* JADX WARN: Code duplicated, block: B:68:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0031 A[EDGE_INSN: B:69:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0031 A[EDGE_INSN: B:72:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0067 A[EDGE_INSN: B:86:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0067 A[EDGE_INSN: B:88:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0067 A[EDGE_INSN: B:90:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0053 A[SYNTHETIC] */
    private int[] blackWhiteRange(int i7, int i10, int i11, int i12, boolean z3) {
        int i13;
        BitMatrix bitMatrix;
        int i14;
        BitMatrix bitMatrix2;
        int i15 = (i11 + i12) / 2;
        int i16 = i15;
        while (i16 >= i11) {
            BitMatrix bitMatrix3 = this.image;
            if (!z3) {
                if (!bitMatrix3.get(i7, i16)) {
                    i14 = i16;
                    while (true) {
                        i14--;
                        if (i14 >= i11) {
                            break;
                            break;
                        }
                        bitMatrix2 = this.image;
                        if (z3) {
                            if (bitMatrix2.get(i14, i7)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix2.get(i7, i14)) {
                            break;
                            break;
                        }
                    }
                    int i17 = i16 - i14;
                    if (i14 < i11) {
                        break;
                    }
                    break;
                    break;
                }
                i16--;
            } else if (bitMatrix3.get(i16, i7)) {
                i16--;
            } else {
                i14 = i16;
                while (true) {
                    i14--;
                    if (i14 >= i11) {
                        break;
                    }
                    bitMatrix2 = this.image;
                    if (z3) {
                        if (bitMatrix2.get(i14, i7)) {
                            break;
                        }
                    } else if (bitMatrix2.get(i7, i14)) {
                        break;
                    }
                }
                int i18 = i16 - i14;
                if (i14 < i11 || i18 > i10) {
                    break;
                }
                i16 = i14;
            }
        }
        int i19 = i16 + 1;
        while (i15 < i12) {
            BitMatrix bitMatrix4 = this.image;
            if (!z3) {
                if (!bitMatrix4.get(i7, i15)) {
                    i13 = i15;
                    while (true) {
                        i13++;
                        if (i13 < i12) {
                            break;
                            break;
                        }
                        bitMatrix = this.image;
                        if (z3) {
                            if (bitMatrix.get(i13, i7)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix.get(i7, i13)) {
                            break;
                            break;
                        }
                    }
                    int i20 = i13 - i15;
                    if (i13 >= i12) {
                        break;
                    }
                    break;
                    break;
                }
                i15++;
            } else if (bitMatrix4.get(i15, i7)) {
                i15++;
            } else {
                i13 = i15;
                while (true) {
                    i13++;
                    if (i13 < i12) {
                        break;
                    }
                    bitMatrix = this.image;
                    if (z3) {
                        if (bitMatrix.get(i13, i7)) {
                            break;
                        }
                    } else if (bitMatrix.get(i7, i13)) {
                        break;
                    }
                }
                int i21 = i13 - i15;
                if (i13 >= i12 || i21 > i10) {
                    break;
                }
                i15 = i13;
            }
        }
        int i22 = i15 - 1;
        if (i22 > i19) {
            return new int[]{i19, i22};
        }
        return null;
    }

    private ResultPoint findCornerFromCenter(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws NotFoundException {
        int[] iArr = null;
        int i18 = i7;
        int i19 = i13;
        while (i19 < i16 && i19 >= i15 && i18 < i12 && i18 >= i11) {
            int[] iArrBlackWhiteRange = i10 == 0 ? blackWhiteRange(i19, i17, i11, i12, true) : blackWhiteRange(i18, i17, i15, i16, false);
            if (iArrBlackWhiteRange == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i10 == 0) {
                    int i20 = i19 - i14;
                    int i21 = iArr[0];
                    if (i21 >= i7) {
                        return new ResultPoint(iArr[1], i20);
                    }
                    if (iArr[1] > i7) {
                        return new ResultPoint(iArr[i14 <= 0 ? (char) 1 : (char) 0], i20);
                    }
                    return new ResultPoint(i21, i20);
                }
                int i22 = i18 - i10;
                int i23 = iArr[0];
                if (i23 >= i13) {
                    return new ResultPoint(i22, iArr[1]);
                }
                if (iArr[1] > i13) {
                    return new ResultPoint(i22, iArr[i10 >= 0 ? (char) 1 : (char) 0]);
                }
                return new ResultPoint(i22, i23);
            }
            i19 += i14;
            i18 += i10;
            iArr = iArrBlackWhiteRange;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i7 = height / 2;
        int i10 = width / 2;
        int iMax = Math.max(1, height / IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        int iMax2 = Math.max(1, width / IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        int i11 = -iMax;
        int i12 = i10 / 2;
        int y8 = ((int) findCornerFromCenter(i10, 0, 0, width, i7, i11, 0, height, i12).getY()) - 1;
        int i13 = i7 / 2;
        ResultPoint resultPointFindCornerFromCenter = findCornerFromCenter(i10, -iMax2, 0, width, i7, 0, y8, height, i13);
        int x3 = ((int) resultPointFindCornerFromCenter.getX()) - 1;
        ResultPoint resultPointFindCornerFromCenter2 = findCornerFromCenter(i10, iMax2, x3, width, i7, 0, y8, height, i13);
        int x7 = ((int) resultPointFindCornerFromCenter2.getX()) + 1;
        ResultPoint resultPointFindCornerFromCenter3 = findCornerFromCenter(i10, 0, x3, x7, i7, iMax, y8, height, i12);
        return new ResultPoint[]{findCornerFromCenter(i10, 0, x3, x7, i7, i11, y8, ((int) resultPointFindCornerFromCenter3.getY()) + 1, i10 / 4), resultPointFindCornerFromCenter, resultPointFindCornerFromCenter2, resultPointFindCornerFromCenter3};
    }
}
