package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
final class AI01393xDecoder extends AI01decoder {
    private static final int FIRST_THREE_DIGITS_SIZE = 10;
    private static final int HEADER_SIZE = 8;
    private static final int LAST_DIGIT_SIZE = 2;

    public AI01393xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException, FormatException {
        if (getInformation().getSize() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        encodeCompressedGtin(sb2, 8);
        int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(48, 2);
        sb2.append("(393");
        sb2.append(iExtractNumericValueFromBitArray);
        sb2.append(')');
        int iExtractNumericValueFromBitArray2 = getGeneralDecoder().extractNumericValueFromBitArray(50, 10);
        if (iExtractNumericValueFromBitArray2 / 100 == 0) {
            sb2.append('0');
        }
        if (iExtractNumericValueFromBitArray2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(iExtractNumericValueFromBitArray2);
        sb2.append(getGeneralDecoder().decodeGeneralPurposeField(60, null).getNewString());
        return sb2.toString();
    }
}
