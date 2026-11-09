package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i7) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i7, iArr);
        float f10 = MAX_AVG_VARIANCE;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i11 >= iArr2.length) {
                break;
            }
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i11], MAX_INDIVIDUAL_VARIANCE);
            if (fPatternMatchVariance < f10) {
                i10 = i11;
                f10 = fPatternMatchVariance;
            }
            i11++;
        }
        if (i10 >= 0) {
            return i10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        boolean z3 = false;
        int i7 = 0;
        int i10 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z3) {
                iArr[i7] = iArr[i7] + 1;
            } else {
                if (i7 == 5) {
                    int i11 = -1;
                    float f10 = MAX_AVG_VARIANCE;
                    for (int i12 = 103; i12 <= 105; i12++) {
                        float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i12], MAX_INDIVIDUAL_VARIANCE);
                        if (fPatternMatchVariance < f10) {
                            i11 = i12;
                            f10 = fPatternMatchVariance;
                        }
                    }
                    if (i11 >= 0 && bitArray.isRange(Math.max(0, i10 - ((nextSet - i10) / 2)), i10, false)) {
                        return new int[]{i10, nextSet, i11};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i13 = i7 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i7] = 0;
                    i7--;
                } else {
                    i7++;
                }
                iArr[i7] = 1;
                z3 = !z3;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0168  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0178  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:113:0x018a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0191  */
    /* JADX WARN: Code duplicated, block: B:117:0x0195  */
    /* JADX WARN: Code duplicated, block: B:119:0x019b  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[LOOP:1: B:23:0x007a->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[FALL_THROUGH, PHI: r20 r21
      0x00c4: PHI (r20v14 boolean) = 
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
     binds: [B:77:0x012c, B:85:0x0142, B:89:0x014e, B:88:0x014a, B:43:0x00c1, B:51:0x00d8, B:55:0x00e4, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r21v10 int) = (r21v1 int), (r21v6 int), (r21v6 int), (r21v6 int), (r21v1 int), (r21v12 int), (r21v12 int), (r21v12 int) binds: [B:77:0x012c, B:85:0x0142, B:89:0x014e, B:88:0x014a, B:43:0x00c1, B:51:0x00d8, B:55:0x00e4, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee A[PHI: r20
      0x00ee: PHI (r20v12 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:93:0x015a, B:57:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6 A[PHI: r20
      0x00f6: PHI (r20v11 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:96:0x015f, B:60:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa A[PHI: r20
      0x00fa: PHI (r20v10 boolean) = (r20v5 boolean), (r20v5 boolean), (r20v15 boolean), (r20v15 boolean) binds: [B:95:0x015d, B:96:0x015f, B:59:0x00f2, B:60:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101 A[PHI: r20
      0x0101: PHI (r20v9 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012c, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107 A[PHI: r20
      0x0107: PHI (r20v8 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012c, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x010b A[PHI: r20
      0x010b: PHI (r20v7 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:76:0x012a, B:42:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144  */
    /* JADX WARN: Code duplicated, block: B:88:0x014a  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:65:0x0101
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int r28, com.google.zxing.common.BitArray r29, java.util.Map<com.google.zxing.DecodeHintType, ?> r30) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Reader.decodeRow(int, com.google.zxing.common.BitArray, java.util.Map):com.google.zxing.Result");
    }
}
