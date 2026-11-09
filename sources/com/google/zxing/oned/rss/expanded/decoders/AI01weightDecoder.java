package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
abstract class AI01weightDecoder extends AI01decoder {
    public AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public abstract void addWeightCode(StringBuilder sb2, int i7);

    public abstract int checkWeight(int i7);

    public final void encodeCompressedWeight(StringBuilder sb2, int i7, int i10) {
        int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i7, i10);
        addWeightCode(sb2, iExtractNumericValueFromBitArray);
        int iCheckWeight = checkWeight(iExtractNumericValueFromBitArray);
        int i11 = 100000;
        for (int i12 = 0; i12 < 5; i12++) {
            if (iCheckWeight / i11 == 0) {
                sb2.append('0');
            }
            i11 /= 10;
        }
        sb2.append(iCheckWeight);
    }
}
