package com.google.zxing.oned.rss.expanded;

import androidx.camera.video.u;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final float DATA_CHARACTER_MODULES = 17.0f;
    private static final float FINDER_PATTERN_MODULES = 15.0f;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final float MAX_FINDER_PATTERN_DISTANCE_VARIANCE = 0.1f;
    private static final int MAX_PAIRS = 11;
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final List<ExpandedRow> rows = new ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{ModuleDescriptor.MODULE_VERSION, 133, PictureConfig.CHOOSE_REQUEST, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 187, 139, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 196, 166}, new int[]{76, 17, 51, 153, 37, HomeDialogState.PRIORITY_HIGHEST_111, 122, 155}, new int[]{43, 129, 176, 106, 107, HomeDialogState.PRIORITY_HIGHEST, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, 125, 164}, new int[]{70, 210, JfifUtil.MARKER_RST0, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, JfifUtil.MARKER_SOFn, 154, 40}, new int[]{KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 199, 175}, new int[]{MsgEvent.MSG_EVENT_STOP_FOREGROUND, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, KkCarPayResultDialog.FREE_RIDE_LOTTIE_HEIGHT_DP, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private void adjustOddEvenCounts(int i7) throws NotFoundException {
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z12 = true;
        if (iSum > 13) {
            z8 = true;
            z3 = false;
        } else if (iSum < 4) {
            z3 = true;
            z8 = false;
        } else {
            z3 = false;
            z8 = false;
        }
        if (iSum2 > 13) {
            z11 = true;
            z10 = false;
        } else if (iSum2 < 4) {
            z10 = true;
            z11 = false;
        } else {
            z10 = false;
            z11 = false;
        }
        int i10 = (iSum + iSum2) - i7;
        boolean z13 = (iSum & 1) == 1;
        boolean z14 = (iSum2 & 1) == 0;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z13) {
                    if (z14) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z8 = true;
                } else {
                    if (!z14) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z11 = true;
                }
            } else if (z13) {
                if (!z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z11 = true;
                } else {
                    z10 = true;
                    z8 = true;
                }
            } else if (z14) {
                throw NotFoundException.getNotFoundInstance();
            }
            z12 = z3;
        } else if (z13) {
            if (z14) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            if (!z14) {
                throw NotFoundException.getNotFoundInstance();
            }
            z10 = true;
            z12 = z3;
        }
        if (z12) {
            if (z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z8) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z10) {
            if (z11) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z11) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i7 = 2;
        for (int i10 = 1; i10 < this.pairs.size(); i10++) {
            ExpandedPair expandedPair2 = this.pairs.get(i10);
            int checksumPortion2 = expandedPair2.getLeftChar().getChecksumPortion() + checksumPortion;
            int i11 = i7 + 1;
            DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion = rightChar2.getChecksumPortion() + checksumPortion2;
                i7 += 2;
            } else {
                i7 = i11;
                checksumPortion = checksumPortion2;
            }
        }
        return ((i7 + (-4)) * 211) + (checksumPortion % 211) == leftChar.getValue();
    }

    private List<ExpandedPair> checkRows(boolean z3) {
        List<ExpandedPair> listCheckRows = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z3) {
            Collections.reverse(this.rows);
        }
        try {
            listCheckRows = checkRows(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z3) {
            Collections.reverse(this.rows);
        }
        return listCheckRows;
    }

    public static Result constructResult(List<ExpandedPair> list) throws NotFoundException, FormatException {
        String information = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = ((ExpandedPair) u.e(1, list)).getFinderPattern().getResultPoints();
        Result result = new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]e0");
        return result;
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i7) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i7 < 0) {
            i7 = list.isEmpty() ? 0 : ((ExpandedPair) u.e(1, list)).getFinderPattern().getStartEnd()[1];
        }
        boolean z3 = list.size() % 2 != 0;
        if (this.startFromEven) {
            z3 = !z3;
        }
        boolean z8 = false;
        while (i7 < size) {
            boolean z10 = bitArray.get(i7);
            boolean z11 = !z10;
            if (z10) {
                z8 = z11;
                break;
            } else {
                i7++;
                z8 = z11;
            }
        }
        int i10 = 0;
        boolean z12 = z8;
        int i11 = i7;
        while (i7 < size) {
            if (bitArray.get(i7) != z12) {
                decodeFinderCounters[i10] = decodeFinderCounters[i10] + 1;
            } else {
                if (i10 == 3) {
                    if (z3) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i11;
                        iArr[1] = i7;
                        return;
                    }
                    if (z3) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i11 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i10--;
                } else {
                    i10++;
                }
                decodeFinderCounters[i10] = 1;
                z12 = !z12;
            }
            i7++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i7) {
        return bitArray.get(i7) ? bitArray.getNextSet(bitArray.getNextUnset(i7)) : bitArray.getNextUnset(bitArray.getNextSet(i7));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z3, boolean z8) {
        return (finderPattern.getValue() == 0 && z3 && z8) ? false : true;
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
        for (ExpandedRow expandedRow : iterable2) {
            for (ExpandedPair expandedPair : iterable) {
                Iterator<ExpandedPair> it = expandedRow.getPairs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (expandedPair.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f A[LOOP:1: B:10:0x0016->B:15:0x002f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    private static boolean isValidSequence(List<ExpandedPair> list, boolean z3) {
        int i7;
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            int size = list.size();
            int length = iArr.length;
            if (z3) {
                if (size == length) {
                    for (i7 = 0; i7 < list.size(); i7++) {
                        if (list.get(i7).getFinderPattern().getValue() != iArr[i7]) {
                        }
                    }
                    return true;
                }
                continue;
            } else {
                if (size <= length) {
                    while (i7 < list.size()) {
                        if (list.get(i7).getFinderPattern().getValue() != iArr[i7]) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    private static boolean mayFollow(List<ExpandedPair> list, int i7) {
        if (list.isEmpty()) {
            return true;
        }
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() + 1 <= iArr.length) {
                for (int size = list.size(); size < iArr.length; size++) {
                    if (iArr[size] == i7) {
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (iArr[(size - i10) - 1] == list.get((list.size() - i10) - 1).getFinderPattern().getValue()) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i7, boolean z3, List<ExpandedPair> list) {
        int nextUnset;
        int i10;
        int i11;
        if (z3) {
            int i12 = this.startEnd[0] - 1;
            while (i12 >= 0 && !bitArray.get(i12)) {
                i12--;
            }
            int i13 = i12 + 1;
            int[] iArr = this.startEnd;
            i11 = iArr[0] - i13;
            nextUnset = iArr[1];
            i10 = i13;
        } else {
            int[] iArr2 = this.startEnd;
            int i14 = iArr2[0];
            nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i10 = i14;
            i11 = nextUnset - this.startEnd[1];
        }
        int i15 = nextUnset;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i11;
        try {
            int finderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
            if (!mayFollow(list, finderValue)) {
                return null;
            }
            if (!list.isEmpty()) {
                ExpandedPair expandedPair = (ExpandedPair) u.e(1, list);
                int i16 = expandedPair.getFinderPattern().getStartEnd()[0];
                int i17 = expandedPair.getFinderPattern().getStartEnd()[1];
                float f10 = ((i17 - i16) / FINDER_PATTERN_MODULES) * DATA_CHARACTER_MODULES;
                float f11 = i17;
                float f12 = f10 * 2.0f;
                float f13 = (0.9f * f12) + f11;
                float f14 = (f12 * 1.1f) + f11;
                float f15 = i10;
                if (f15 < f13 || f15 > f14) {
                    return null;
                }
            }
            return new FinderPattern(finderValue, new int[]{i10, i15}, i10, i15, i7);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void removePartialRows(Collection<ExpandedPair> collection, Collection<ExpandedRow> collection2) {
        Iterator<ExpandedRow> it = collection2.iterator();
        while (it.hasNext()) {
            ExpandedRow next = it.next();
            if (next.getPairs().size() != collection.size()) {
                Iterator<ExpandedPair> it2 = next.getPairs().iterator();
                do {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                } while (collection.contains(it2.next()));
            }
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i7 = 0; i7 < length / 2; i7++) {
            int i10 = iArr[i7];
            int i11 = (length - i7) - 1;
            iArr[i7] = iArr[i11];
            iArr[i11] = i10;
        }
    }

    private void storeRow(int i7) {
        boolean zIsEquivalent = false;
        int i10 = 0;
        boolean zIsEquivalent2 = false;
        while (i10 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i10);
            if (expandedRow.getRowNumber() > i7) {
                zIsEquivalent = expandedRow.isEquivalent(this.pairs);
                break;
            } else {
                zIsEquivalent2 = expandedRow.isEquivalent(this.pairs);
                i10++;
            }
        }
        if (zIsEquivalent || zIsEquivalent2 || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i10, new ExpandedRow(this.pairs, i7));
        removePartialRows(this.pairs, this.rows);
    }

    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z3, boolean z8) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        Arrays.fill(dataCharacterCounters, 0);
        if (z8) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i7 = 0;
            for (int length = dataCharacterCounters.length - 1; i7 < length; length--) {
                int i10 = dataCharacterCounters[i7];
                dataCharacterCounters[i7] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i10;
                i7++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17;
        float f10 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / FINDER_PATTERN_MODULES;
        if (Math.abs(fSum - f10) / f10 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i11 = 0; i11 < dataCharacterCounters.length; i11++) {
            float f11 = (dataCharacterCounters[i11] * 1.0f) / fSum;
            int i12 = (int) (0.5f + f11);
            if (i12 < 1) {
                if (f11 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i12 = 1;
            } else if (i12 > 8) {
                if (f11 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i12 = 8;
            }
            int i13 = i11 / 2;
            if ((i11 & 1) == 0) {
                oddCounts[i13] = i12;
                oddRoundingErrors[i13] = f11 - i12;
            } else {
                evenCounts[i13] = i12;
                evenRoundingErrors[i13] = f11 - i12;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z3 ? 0 : 2)) + (!z8 ? 1 : 0)) - 1;
        int i14 = 0;
        int i15 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z3, z8)) {
                i14 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i15 += oddCounts[length2];
        }
        int i16 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z3, z8)) {
                i16 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
        }
        int i17 = i14 + i16;
        if ((i15 & 1) != 0 || i15 > 13 || i15 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i18 = (13 - i15) / 2;
        int i19 = SYMBOL_WIDEST[i18];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i19, true) * EVEN_TOTAL_SUBSET[i18]) + RSSUtils.getRSSvalue(evenCounts, 9 - i19, false) + GSUM[i18], i17);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i7, bitArray));
        } catch (NotFoundException unused) {
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i7, bitArray));
        }
    }

    public List<ExpandedPair> decodeRow2pairs(int i7, BitArray bitArray) throws NotFoundException {
        this.pairs.clear();
        boolean z3 = false;
        while (!z3) {
            try {
                List<ExpandedPair> list = this.pairs;
                list.add(retrieveNextPair(bitArray, list, i7));
            } catch (NotFoundException e10) {
                if (this.pairs.isEmpty()) {
                    throw e10;
                }
                z3 = true;
            }
        }
        if (checkChecksum() && isValidSequence(this.pairs, true)) {
            return this.pairs;
        }
        boolean zIsEmpty = this.rows.isEmpty();
        storeRow(i7);
        if (!zIsEmpty) {
            List<ExpandedPair> listCheckRows = checkRows(false);
            if (listCheckRows != null) {
                return listCheckRows;
            }
            List<ExpandedPair> listCheckRows2 = checkRows(true);
            if (listCheckRows2 != null) {
                return listCheckRows2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public List<ExpandedRow> getRows() {
        return this.rows;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    public ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i7) throws NotFoundException {
        FinderPattern foundFinderPattern;
        boolean z3 = list.size() % 2 == 0;
        if (this.startFromEven) {
            z3 = !z3;
        }
        DataCharacter dataCharacterDecodeDataCharacter = null;
        int nextSecondBar = -1;
        boolean z8 = true;
        DataCharacter dataCharacterDecodeDataCharacter2 = null;
        do {
            findNextPair(bitArray, list, nextSecondBar);
            foundFinderPattern = parseFoundFinderPattern(bitArray, i7, z3, list);
            if (foundFinderPattern == null) {
                nextSecondBar = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                try {
                    dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, z3, true);
                    z8 = false;
                } catch (NotFoundException unused) {
                    nextSecondBar = getNextSecondBar(bitArray, this.startEnd[0]);
                }
            }
        } while (z8);
        if (!list.isEmpty() && ((ExpandedPair) u.e(1, list)).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, z3, false);
        } catch (NotFoundException unused2) {
        }
        return new ExpandedPair(dataCharacterDecodeDataCharacter2, dataCharacterDecodeDataCharacter, foundFinderPattern);
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i7) throws NotFoundException {
        while (i7 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i7);
            this.pairs.clear();
            Iterator<ExpandedRow> it = list.iterator();
            while (it.hasNext()) {
                this.pairs.addAll(it.next().getPairs());
            }
            this.pairs.addAll(expandedRow.getPairs());
            if (isValidSequence(this.pairs, false)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(expandedRow);
                try {
                    return checkRows(arrayList, i7 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i7++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
