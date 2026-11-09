package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private final List<Pair> possibleLeftPairs = new ArrayList();
    private final List<Pair> possibleRightPairs = new ArrayList();
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] OUTSIDE_GSUM = {0, 161, 961, 2015, 2715};
    private static final int[] INSIDE_GSUM = {0, MessageEvent.EVENT_GRAB_ADD_ADDRESS_SUCCESS, 1036, 1516};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
        if (pair == null) {
            return;
        }
        for (Pair pair2 : collection) {
            if (pair2.getValue() == pair.getValue()) {
                pair2.incrementCount();
                return;
            }
        }
        collection.add(pair);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r6 r7
      0x0025: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    private void adjustOddEvenCounts(boolean z3, int i7) throws NotFoundException {
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z13 = true;
        if (z3) {
            if (iSum > 12) {
                z10 = true;
                z8 = false;
            } else if (iSum < 4) {
                z8 = true;
                z10 = false;
            } else {
                z8 = false;
                z10 = false;
            }
            if (iSum2 > 12) {
                z12 = true;
                z11 = false;
            } else if (iSum2 < 4) {
                z11 = true;
                z12 = false;
            } else {
                z11 = false;
                z12 = false;
            }
        } else {
            if (iSum > 11) {
                z10 = true;
                z8 = false;
            } else if (iSum < 5) {
                z8 = true;
                z10 = false;
            } else {
                z8 = false;
                z10 = false;
            }
            if (iSum2 > 10) {
                z12 = true;
                z11 = false;
            } else if (iSum2 < 4) {
                z11 = true;
                z12 = false;
            } else {
                z11 = false;
                z12 = false;
            }
        }
        int i10 = (iSum + iSum2) - i7;
        boolean z14 = (iSum & 1) == z3;
        boolean z15 = (iSum2 & 1) == 1;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z14) {
                    if (z15) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z10 = true;
                } else {
                    if (!z15) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z12 = true;
                }
            } else if (z14) {
                if (!z15) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z12 = true;
                } else {
                    z11 = true;
                    z10 = true;
                }
            } else if (z15) {
                throw NotFoundException.getNotFoundInstance();
            }
            z13 = z8;
        } else if (z14) {
            if (z15) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            if (!z15) {
                throw NotFoundException.getNotFoundInstance();
            }
            z11 = true;
            z13 = z8;
        }
        if (z13) {
            if (z10) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z10) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z11) {
            if (z12) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z12) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
        int checksumPortion = ((pair2.getChecksumPortion() * 16) + pair.getChecksumPortion()) % 79;
        int value = pair2.getFinderPattern().getValue() + (pair.getFinderPattern().getValue() * 9);
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private static Result constructResult(Pair pair, Pair pair2) {
        String strValueOf = String.valueOf((((long) pair.getValue()) * 4537077) + ((long) pair2.getValue()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        int i7 = 0;
        for (int i10 = 0; i10 < 13; i10++) {
            int iCharAt = sb2.charAt(i10) - '0';
            if ((i10 & 1) == 0) {
                iCharAt *= 3;
            }
            i7 += iCharAt;
        }
        int i11 = 10 - (i7 % 10);
        if (i11 == 10) {
            i11 = 0;
        }
        sb2.append(i11);
        ResultPoint[] resultPoints = pair.getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = pair2.getFinderPattern().getResultPoints();
        Result result = new Result(sb2.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]e0");
        return result;
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z3) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        Arrays.fill(dataCharacterCounters, 0);
        if (z3) {
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
        int i11 = z3 ? 16 : 15;
        float fSum = MathUtils.sum(dataCharacterCounters) / i11;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i12 = 0; i12 < dataCharacterCounters.length; i12++) {
            float f10 = dataCharacterCounters[i12] / fSum;
            int i13 = (int) (0.5f + f10);
            if (i13 < 1) {
                i13 = 1;
            } else if (i13 > 8) {
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                oddCounts[i14] = i13;
                oddRoundingErrors[i14] = f10 - i13;
            } else {
                evenCounts[i14] = i13;
                evenRoundingErrors[i14] = f10 - i13;
            }
        }
        adjustOddEvenCounts(z3, i11);
        int i15 = 0;
        int i16 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i17 = oddCounts[length2];
            i15 = (i15 * 9) + i17;
            i16 += i17;
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i20 = evenCounts[length3];
            i18 = (i18 * 9) + i20;
            i19 += i20;
        }
        int i21 = (i18 * 3) + i15;
        if (!z3) {
            if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i22 = (10 - i19) / 2;
            int i23 = INSIDE_ODD_WIDEST[i22];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i23, false) * INSIDE_ODD_TOTAL_SUBSET[i22]) + RSSUtils.getRSSvalue(oddCounts, i23, true) + INSIDE_GSUM[i22], i21);
        }
        if ((i16 & 1) != 0 || i16 > 12 || i16 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i24 = (12 - i16) / 2;
        int i25 = OUTSIDE_ODD_WIDEST[i24];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i25, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i24]) + RSSUtils.getRSSvalue(evenCounts, 9 - i25, true) + OUTSIDE_GSUM[i24], i21);
    }

    private Pair decodePair(BitArray bitArray, boolean z3, int i7, Map<DecodeHintType, ?> map) {
        try {
            FinderPattern foundFinderPattern = parseFoundFinderPattern(bitArray, i7, z3, findFinderPattern(bitArray, z3));
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                int[] startEnd = foundFinderPattern.getStartEnd();
                float size = ((startEnd[0] + startEnd[1]) - 1) / 2.0f;
                if (z3) {
                    size = (bitArray.getSize() - 1) - size;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(size, i7));
            }
            DataCharacter dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, true);
            DataCharacter dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, false);
            return new Pair((dataCharacterDecodeDataCharacter.getValue() * 1597) + dataCharacterDecodeDataCharacter2.getValue(), (dataCharacterDecodeDataCharacter2.getChecksumPortion() * 4) + dataCharacterDecodeDataCharacter.getChecksumPortion(), foundFinderPattern);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] findFinderPattern(BitArray bitArray, boolean z3) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i7 = 0;
        boolean z8 = false;
        while (i7 < size) {
            z8 = !bitArray.get(i7);
            if (z3 == z8) {
                break;
            }
            i7++;
        }
        int i10 = 0;
        int i11 = i7;
        while (i7 < size) {
            if (bitArray.get(i7) != z8) {
                decodeFinderCounters[i10] = decodeFinderCounters[i10] + 1;
            } else {
                if (i10 != 3) {
                    i10++;
                } else {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i11, i7};
                    }
                    i11 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i10--;
                }
                decodeFinderCounters[i10] = 1;
                z8 = !z8;
            }
            i7++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i7, boolean z3, int[] iArr) throws NotFoundException {
        int i10;
        boolean z8 = bitArray.get(iArr[0]);
        int i11 = iArr[0] - 1;
        while (i11 >= 0 && z8 != bitArray.get(i11)) {
            i11--;
        }
        int i12 = i11 + 1;
        int i13 = iArr[0] - i12;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i13;
        int finderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int size = iArr[1];
        if (z3) {
            int size2 = (bitArray.getSize() - 1) - i12;
            size = (bitArray.getSize() - 1) - size;
            i10 = size2;
        } else {
            i10 = i12;
        }
        return new FinderPattern(finderValue, new int[]{i12, iArr[1]}, i10, size, i7);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        addOrTally(this.possibleLeftPairs, decodePair(bitArray, false, i7, map));
        bitArray.reverse();
        addOrTally(this.possibleRightPairs, decodePair(bitArray, true, i7, map));
        bitArray.reverse();
        for (Pair pair : this.possibleLeftPairs) {
            if (pair.getCount() > 1) {
                for (Pair pair2 : this.possibleRightPairs) {
                    if (pair2.getCount() > 1 && checkChecksum(pair, pair2)) {
                        return constructResult(pair, pair2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }
}
