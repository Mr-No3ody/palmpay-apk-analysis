package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = new FinderPatternInfo[0];
    private static final FinderPattern[] EMPTY_FP_ARRAY = new FinderPattern[0];
    private static final FinderPattern[][] EMPTY_FP_2D_ARRAY = new FinderPattern[0][];

    public static final class ModuleSizeComparator implements Comparator<FinderPattern>, Serializable {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < 0.0d) {
                return -1;
            }
            return estimatedModuleSize > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    private FinderPattern[][] selectMultipleBestPatterns() throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        for (FinderPattern finderPattern : getPossibleCenters()) {
            if (finderPattern.getCount() >= 2) {
                arrayList.add(finderPattern);
            }
        }
        int size = arrayList.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (size == 3) {
            return new FinderPattern[][]{(FinderPattern[]) arrayList.toArray(EMPTY_FP_ARRAY)};
        }
        Collections.sort(arrayList, new ModuleSizeComparator());
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < size - 2; i7++) {
            FinderPattern finderPattern2 = (FinderPattern) arrayList.get(i7);
            if (finderPattern2 != null) {
                for (int i10 = i7 + 1; i10 < size - 1; i10++) {
                    FinderPattern finderPattern3 = (FinderPattern) arrayList.get(i10);
                    if (finderPattern3 != null) {
                        float estimatedModuleSize = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                        float fAbs = Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize());
                        float f10 = DIFF_MODSIZE_CUTOFF;
                        float f11 = DIFF_MODSIZE_CUTOFF_PERCENT;
                        if (fAbs > DIFF_MODSIZE_CUTOFF && estimatedModuleSize >= DIFF_MODSIZE_CUTOFF_PERCENT) {
                            break;
                        }
                        int i11 = i10 + 1;
                        while (i11 < size) {
                            FinderPattern finderPattern4 = (FinderPattern) arrayList.get(i11);
                            if (finderPattern4 != null) {
                                float estimatedModuleSize2 = (finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) / Math.min(finderPattern3.getEstimatedModuleSize(), finderPattern4.getEstimatedModuleSize());
                                if (Math.abs(finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) > f10 && estimatedModuleSize2 >= f11) {
                                    break;
                                }
                                FinderPattern[] finderPatternArr = {finderPattern2, finderPattern3, finderPattern4};
                                ResultPoint.orderBestPatterns(finderPatternArr);
                                FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr);
                                float fDistance = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                float fDistance2 = ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                float fDistance3 = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                float estimatedModuleSize3 = (fDistance + fDistance3) / (finderPattern2.getEstimatedModuleSize() * 2.0f);
                                if (estimatedModuleSize3 <= 180.0f && estimatedModuleSize3 >= MIN_MODULE_COUNT_PER_EDGE && Math.abs((fDistance - fDistance3) / Math.min(fDistance, fDistance3)) < 0.1f) {
                                    double d2 = fDistance;
                                    double d10 = fDistance3;
                                    float fSqrt = (float) Math.sqrt((d10 * d10) + (d2 * d2));
                                    if (Math.abs((fDistance2 - fSqrt) / Math.min(fDistance2, fSqrt)) < 0.1f) {
                                        arrayList2.add(finderPatternArr);
                                    }
                                }
                            }
                            i11++;
                            f10 = DIFF_MODSIZE_CUTOFF;
                            f11 = DIFF_MODSIZE_CUTOFF_PERCENT;
                        }
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (FinderPattern[][]) arrayList2.toArray(EMPTY_FP_2D_ARRAY);
    }

    public FinderPatternInfo[] findMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z3 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix image = getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i7 = (height * 3) / MessageEvent.EVENT_SHOW_UPDATE_DIALOG;
        if (i7 < 3 || z3) {
            i7 = 3;
        }
        int[] iArr = new int[5];
        for (int i10 = i7 - 1; i10 < height; i10 += i7) {
            FinderPatternFinder.doClearCounts(iArr);
            int i11 = 0;
            for (int i12 = 0; i12 < width; i12++) {
                if (image.get(i12, i10)) {
                    if ((i11 & 1) == 1) {
                        i11++;
                    }
                    iArr[i11] = iArr[i11] + 1;
                } else if ((i11 & 1) != 0) {
                    iArr[i11] = iArr[i11] + 1;
                } else if (i11 != 4) {
                    i11++;
                    iArr[i11] = iArr[i11] + 1;
                } else if (FinderPatternFinder.foundPatternCross(iArr) && handlePossibleCenter(iArr, i10, i12)) {
                    FinderPatternFinder.doClearCounts(iArr);
                    i11 = 0;
                } else {
                    FinderPatternFinder.doShiftCounts2(iArr);
                    i11 = 3;
                }
            }
            if (FinderPatternFinder.foundPatternCross(iArr)) {
                handlePossibleCenter(iArr, i10, width);
            }
        }
        FinderPattern[][] finderPatternArrSelectMultipleBestPatterns = selectMultipleBestPatterns();
        ArrayList arrayList = new ArrayList();
        for (FinderPattern[] finderPatternArr : finderPatternArrSelectMultipleBestPatterns) {
            ResultPoint.orderBestPatterns(finderPatternArr);
            arrayList.add(new FinderPatternInfo(finderPatternArr));
        }
        return arrayList.isEmpty() ? EMPTY_RESULT_ARRAY : (FinderPatternInfo[]) arrayList.toArray(EMPTY_RESULT_ARRAY);
    }
}
