package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
abstract class AI01decoder extends AbstractExpandedDecoder {
    static final int GTIN_SIZE = 40;

    public AI01decoder(BitArray bitArray) {
        super(bitArray);
    }

    private static void appendCheckDigit(StringBuilder sb2, int i7) {
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11 + i7) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        sb2.append(i12 != 10 ? i12 : 0);
    }

    public final void encodeCompressedGtin(StringBuilder sb2, int i7) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        encodeCompressedGtinWithoutAI(sb2, i7, length);
    }

    public final void encodeCompressedGtinWithoutAI(StringBuilder sb2, int i7, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray((i11 * 10) + i7, 10);
            if (iExtractNumericValueFromBitArray / 100 == 0) {
                sb2.append('0');
            }
            if (iExtractNumericValueFromBitArray / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iExtractNumericValueFromBitArray);
        }
        appendCheckDigit(sb2, i10);
    }
}
