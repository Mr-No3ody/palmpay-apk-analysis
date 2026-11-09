package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private static final EstimatedModuleComparator moduleComparator = new EstimatedModuleComparator();
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    public static final class EstimatedModuleComparator implements Comparator<FinderPattern>, Serializable {
        private EstimatedModuleComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    private static float centerFromEnd(int[] iArr, int i7) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean crossCheckDiagonal(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i14 = 0;
        while (i7 >= i14 && i10 >= i14 && this.image.get(i10 - i14, i7 - i14)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i14++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i7 >= i14 && i10 >= i14 && !this.image.get(i10 - i14, i7 - i14)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i14++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i7 >= i14 && i10 >= i14 && this.image.get(i10 - i14, i7 - i14)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i14++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i15 = 1;
        while (true) {
            int i16 = i7 + i15;
            if (i16 >= height || (i13 = i10 + i15) >= width || !this.image.get(i13, i16)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i15++;
        }
        while (true) {
            int i17 = i7 + i15;
            if (i17 >= height || (i12 = i10 + i15) >= width || this.image.get(i12, i17)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i15++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i18 = i7 + i15;
            if (i18 >= height || (i11 = i10 + i15) >= width || !this.image.get(i11, i18)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i15++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }

    private float crossCheckHorizontal(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i16 = i7;
        while (i16 >= 0 && bitMatrix.get(i16, i10)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i16--;
        }
        if (i16 < 0) {
            return Float.NaN;
        }
        while (i16 >= 0 && !bitMatrix.get(i16, i10)) {
            int i17 = crossCheckStateCount[1];
            if (i17 > i11) {
                break;
            }
            crossCheckStateCount[1] = i17 + 1;
            i16--;
        }
        if (i16 >= 0 && crossCheckStateCount[1] <= i11) {
            while (i16 >= 0 && bitMatrix.get(i16, i10) && (i15 = crossCheckStateCount[0]) <= i11) {
                crossCheckStateCount[0] = i15 + 1;
                i16--;
            }
            if (crossCheckStateCount[0] > i11) {
                return Float.NaN;
            }
            int i18 = i7 + 1;
            while (i18 < width && bitMatrix.get(i18, i10)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i18++;
            }
            if (i18 == width) {
                return Float.NaN;
            }
            while (i18 < width && !bitMatrix.get(i18, i10) && (i14 = crossCheckStateCount[3]) < i11) {
                crossCheckStateCount[3] = i14 + 1;
                i18++;
            }
            if (i18 != width && crossCheckStateCount[3] < i11) {
                while (i18 < width && bitMatrix.get(i18, i10) && (i13 = crossCheckStateCount[4]) < i11) {
                    crossCheckStateCount[4] = i13 + 1;
                    i18++;
                }
                int i19 = crossCheckStateCount[4];
                if (i19 < i11 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i19) - i12) * 5 < i12 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i18);
                }
            }
        }
        return Float.NaN;
    }

    private float crossCheckVertical(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i16 = i7;
        while (i16 >= 0 && bitMatrix.get(i10, i16)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i16--;
        }
        if (i16 < 0) {
            return Float.NaN;
        }
        while (i16 >= 0 && !bitMatrix.get(i10, i16)) {
            int i17 = crossCheckStateCount[1];
            if (i17 > i11) {
                break;
            }
            crossCheckStateCount[1] = i17 + 1;
            i16--;
        }
        if (i16 >= 0 && crossCheckStateCount[1] <= i11) {
            while (i16 >= 0 && bitMatrix.get(i10, i16) && (i15 = crossCheckStateCount[0]) <= i11) {
                crossCheckStateCount[0] = i15 + 1;
                i16--;
            }
            if (crossCheckStateCount[0] > i11) {
                return Float.NaN;
            }
            int i18 = i7 + 1;
            while (i18 < height && bitMatrix.get(i10, i18)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i18++;
            }
            if (i18 == height) {
                return Float.NaN;
            }
            while (i18 < height && !bitMatrix.get(i10, i18) && (i14 = crossCheckStateCount[3]) < i11) {
                crossCheckStateCount[3] = i14 + 1;
                i18++;
            }
            if (i18 != height && crossCheckStateCount[3] < i11) {
                while (i18 < height && bitMatrix.get(i10, i18) && (i13 = crossCheckStateCount[4]) < i11) {
                    crossCheckStateCount[4] = i13 + 1;
                    i18++;
                }
                int i19 = crossCheckStateCount[4];
                if (i19 < i11 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i19) - i12) * 5 < i12 * 2 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i18);
                }
            }
        }
        return Float.NaN;
    }

    public static void doClearCounts(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void doShiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i7 += i11;
        }
        if (i7 < 7) {
            return false;
        }
        float f10 = i7 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i7 += i11;
        }
        if (i7 < 7) {
            return false;
        }
        float f10 = i7 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private int[] getCrossCheckStateCount() {
        doClearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float fAbs = 0.0f;
        int i7 = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i7++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i7 < 3) {
            return false;
        }
        float f10 = estimatedModuleSize / size;
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().getEstimatedModuleSize() - f10);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    private FinderPattern[] selectBestPatterns() throws NotFoundException {
        int i7;
        double d2;
        if (this.possibleCenters.size() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (true) {
            i7 = 2;
            if (!it.hasNext()) {
                break;
            }
            if (it.next().getCount() < 2) {
                it.remove();
            }
        }
        Collections.sort(this.possibleCenters, moduleComparator);
        FinderPattern[] finderPatternArr = new FinderPattern[3];
        double d10 = Double.MAX_VALUE;
        int i10 = 0;
        while (i10 < this.possibleCenters.size() - i7) {
            FinderPattern finderPattern = this.possibleCenters.get(i10);
            float estimatedModuleSize = finderPattern.getEstimatedModuleSize();
            i10++;
            int i11 = i10;
            while (i11 < this.possibleCenters.size() - 1) {
                FinderPattern finderPattern2 = this.possibleCenters.get(i11);
                double dSquaredDistance = squaredDistance(finderPattern, finderPattern2);
                i11++;
                int i12 = i7;
                for (int i13 = i11; i13 < this.possibleCenters.size(); i13++) {
                    FinderPattern finderPattern3 = this.possibleCenters.get(i13);
                    if (finderPattern3.getEstimatedModuleSize() <= 1.4f * estimatedModuleSize) {
                        double dSquaredDistance2 = squaredDistance(finderPattern2, finderPattern3);
                        double dSquaredDistance3 = squaredDistance(finderPattern, finderPattern3);
                        if (dSquaredDistance < dSquaredDistance2) {
                            if (dSquaredDistance2 <= dSquaredDistance3) {
                                dSquaredDistance3 = dSquaredDistance2;
                                dSquaredDistance2 = dSquaredDistance3;
                            } else if (dSquaredDistance >= dSquaredDistance3) {
                                d2 = dSquaredDistance3;
                                dSquaredDistance3 = dSquaredDistance;
                            }
                            d2 = dSquaredDistance;
                        } else {
                            if (dSquaredDistance2 >= dSquaredDistance3) {
                                d2 = dSquaredDistance3;
                                dSquaredDistance3 = dSquaredDistance2;
                            } else if (dSquaredDistance < dSquaredDistance3) {
                                d2 = dSquaredDistance2;
                                dSquaredDistance2 = dSquaredDistance3;
                                dSquaredDistance3 = dSquaredDistance;
                            } else {
                                d2 = dSquaredDistance2;
                            }
                            dSquaredDistance2 = dSquaredDistance;
                        }
                        double dAbs = Math.abs(dSquaredDistance2 - (d2 * 2.0d)) + Math.abs(dSquaredDistance2 - (dSquaredDistance3 * 2.0d));
                        if (dAbs < d10) {
                            finderPatternArr[0] = finderPattern;
                            finderPatternArr[1] = finderPattern2;
                            finderPatternArr[i12] = finderPattern3;
                            d10 = dAbs;
                        }
                    }
                }
                i7 = i12;
            }
        }
        if (d10 != Double.MAX_VALUE) {
            return finderPatternArr;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static double squaredDistance(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double x3 = finderPattern.getX() - finderPattern2.getX();
        double y8 = finderPattern.getY() - finderPattern2.getY();
        return (y8 * y8) + (x3 * x3);
    }

    @Deprecated
    public final void clearCounts(int[] iArr) {
        doClearCounts(iArr);
    }

    public final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z3 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i7 = (height * 3) / MessageEvent.EVENT_SHOW_UPDATE_DIALOG;
        if (i7 < 3 || z3) {
            i7 = 3;
        }
        int[] iArr = new int[5];
        int i10 = i7 - 1;
        boolean zHaveMultiplyConfirmedCenters = false;
        while (i10 < height && !zHaveMultiplyConfirmedCenters) {
            doClearCounts(iArr);
            int i11 = 0;
            int i12 = 0;
            while (i11 < width) {
                if (this.image.get(i11, i10)) {
                    if ((i12 & 1) == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if ((i12 & 1) != 0) {
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 != 4) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i10, i11)) {
                    if (this.hasSkipped) {
                        zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                    } else {
                        int iFindRowSkip = findRowSkip();
                        int i13 = iArr[2];
                        if (iFindRowSkip > i13) {
                            i10 += (iFindRowSkip - i13) - 2;
                            i11 = width - 1;
                        }
                    }
                    doClearCounts(iArr);
                    i7 = 2;
                    i12 = 0;
                } else {
                    doShiftCounts2(iArr);
                    i12 = 3;
                }
                i11++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i10, width)) {
                i7 = iArr[0];
                if (this.hasSkipped) {
                    zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                }
            }
            i10 += i7;
        }
        FinderPattern[] finderPatternArrSelectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(finderPatternArrSelectBestPatterns);
        return new FinderPatternInfo(finderPatternArrSelectBestPatterns);
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i7, int i10, boolean z3) {
        return handlePossibleCenter(iArr, i7, i10);
    }

    @Deprecated
    public final void shiftCounts2(int[] iArr) {
        doShiftCounts2(iArr);
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    public final boolean handlePossibleCenter(int[] iArr, int i7, int i10) {
        int i11 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iCenterFromEnd = (int) centerFromEnd(iArr, i10);
        float fCrossCheckVertical = crossCheckVertical(i7, iCenterFromEnd, iArr[2], i11);
        if (!Float.isNaN(fCrossCheckVertical)) {
            int i12 = (int) fCrossCheckVertical;
            float fCrossCheckHorizontal = crossCheckHorizontal(iCenterFromEnd, i12, iArr[2], i11);
            if (!Float.isNaN(fCrossCheckHorizontal) && crossCheckDiagonal(i12, (int) fCrossCheckHorizontal)) {
                float f10 = i11 / 7.0f;
                for (int i13 = 0; i13 < this.possibleCenters.size(); i13++) {
                    FinderPattern finderPattern = this.possibleCenters.get(i13);
                    if (finderPattern.aboutEquals(f10, fCrossCheckVertical, fCrossCheckHorizontal)) {
                        this.possibleCenters.set(i13, finderPattern.combineEstimate(fCrossCheckVertical, fCrossCheckHorizontal, f10));
                        return true;
                    }
                }
                FinderPattern finderPattern2 = new FinderPattern(fCrossCheckHorizontal, fCrossCheckVertical, f10);
                this.possibleCenters.add(finderPattern2);
                ResultPointCallback resultPointCallback = this.resultPointCallback;
                if (resultPointCallback != null) {
                    resultPointCallback.foundPossibleResultPoint(finderPattern2);
                }
                return true;
            }
        }
        return false;
    }
}
