package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes3.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x3 = resultPoint.getX();
        float y8 = resultPoint.getY();
        float x7 = resultPoint2.getX();
        float y10 = resultPoint2.getY();
        float x10 = resultPoint3.getX();
        float y11 = resultPoint3.getY();
        float x11 = resultPoint4.getX();
        float y12 = resultPoint4.getY();
        return x3 < ((float) this.width) / 2.0f ? new ResultPoint[]{new ResultPoint(x11 - 1.0f, y12 + 1.0f), new ResultPoint(x7 + 1.0f, y10 + 1.0f), new ResultPoint(x10 - 1.0f, y11 - 1.0f), new ResultPoint(x3 + 1.0f, y8 - 1.0f)} : new ResultPoint[]{new ResultPoint(x11 + 1.0f, y12 + 1.0f), new ResultPoint(x7 + 1.0f, y10 - 1.0f), new ResultPoint(x10 - 1.0f, y11 + 1.0f), new ResultPoint(x3 - 1.0f, y8 - 1.0f)};
    }

    private boolean containsBlackPoint(int i7, int i10, int i11, boolean z3) {
        if (z3) {
            while (i7 <= i10) {
                if (this.image.get(i7, i11)) {
                    return true;
                }
                i7++;
            }
            return false;
        }
        while (i7 <= i10) {
            if (this.image.get(i11, i7)) {
                return true;
            }
            i7++;
        }
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float f10, float f11, float f12, float f13) {
        int iRound = MathUtils.round(MathUtils.distance(f10, f11, f12, f13));
        float f14 = iRound;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i7 = 0; i7 < iRound; i7++) {
            float f17 = i7;
            int iRound2 = MathUtils.round((f17 * f15) + f10);
            int iRound3 = MathUtils.round((f17 * f16) + f11);
            if (this.image.get(iRound2, iRound3)) {
                return new ResultPoint(iRound2, iRound3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i7 = this.leftInit;
        int i10 = this.rightInit;
        int i11 = this.upInit;
        int i12 = this.downInit;
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        while (z13) {
            boolean z14 = false;
            boolean zContainsBlackPoint = true;
            while (true) {
                if ((!zContainsBlackPoint && z8) || i10 >= this.width) {
                    break;
                }
                zContainsBlackPoint = containsBlackPoint(i11, i12, i10, false);
                if (zContainsBlackPoint) {
                    i10++;
                    z8 = true;
                    z14 = true;
                } else if (!z8) {
                    i10++;
                }
            }
            if (i10 < this.width) {
                boolean zContainsBlackPoint2 = true;
                while (true) {
                    if ((!zContainsBlackPoint2 && z10) || i12 >= this.height) {
                        break;
                    }
                    zContainsBlackPoint2 = containsBlackPoint(i7, i10, i12, true);
                    if (zContainsBlackPoint2) {
                        i12++;
                        z10 = true;
                        z14 = true;
                    } else if (!z10) {
                        i12++;
                    }
                }
                if (i12 < this.height) {
                    boolean zContainsBlackPoint3 = true;
                    while (true) {
                        if ((!zContainsBlackPoint3 && z11) || i7 < 0) {
                            break;
                        }
                        zContainsBlackPoint3 = containsBlackPoint(i11, i12, i7, false);
                        if (zContainsBlackPoint3) {
                            i7--;
                            z11 = true;
                            z14 = true;
                        } else if (!z11) {
                            i7--;
                        }
                    }
                    if (i7 >= 0) {
                        z13 = z14;
                        boolean zContainsBlackPoint4 = true;
                        while (true) {
                            if ((!zContainsBlackPoint4 && z12) || i11 < 0) {
                                break;
                            }
                            zContainsBlackPoint4 = containsBlackPoint(i7, i10, i11, true);
                            if (zContainsBlackPoint4) {
                                i11--;
                                z13 = true;
                                z12 = true;
                            } else if (!z12) {
                                i11--;
                            }
                        }
                        if (i11 < 0) {
                        }
                    }
                }
            }
            z3 = true;
            break;
        }
        if (z3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i13 = i10 - i7;
        ResultPoint blackPointOnSegment = null;
        ResultPoint blackPointOnSegment2 = null;
        for (int i14 = 1; blackPointOnSegment2 == null && i14 < i13; i14++) {
            blackPointOnSegment2 = getBlackPointOnSegment(i7, i12 - i14, i7 + i14, i12);
        }
        if (blackPointOnSegment2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment3 = null;
        for (int i15 = 1; blackPointOnSegment3 == null && i15 < i13; i15++) {
            blackPointOnSegment3 = getBlackPointOnSegment(i7, i11 + i15, i7 + i15, i11);
        }
        if (blackPointOnSegment3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment4 = null;
        for (int i16 = 1; blackPointOnSegment4 == null && i16 < i13; i16++) {
            blackPointOnSegment4 = getBlackPointOnSegment(i10, i11 + i16, i10 - i16, i11);
        }
        if (blackPointOnSegment4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i17 = 1; blackPointOnSegment == null && i17 < i13; i17++) {
            blackPointOnSegment = getBlackPointOnSegment(i10, i12 - i17, i10 - i17, i12);
        }
        if (blackPointOnSegment != null) {
            return centerEdges(blackPointOnSegment, blackPointOnSegment2, blackPointOnSegment4, blackPointOnSegment3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i7, int i10, int i11) throws NotFoundException {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i12 = i7 / 2;
        int i13 = i10 - i12;
        this.leftInit = i13;
        int i14 = i10 + i12;
        this.rightInit = i14;
        int i15 = i11 - i12;
        this.upInit = i15;
        int i16 = i11 + i12;
        this.downInit = i16;
        if (i15 < 0 || i13 < 0 || i16 >= height || i14 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
