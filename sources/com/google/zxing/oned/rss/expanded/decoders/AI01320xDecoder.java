package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import face.security.device.api.FaceSecCode;

/* JADX INFO: loaded from: classes3.dex */
final class AI01320xDecoder extends AI013x0xDecoder {
    public AI01320xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public void addWeightCode(StringBuilder sb2, int i7) {
        if (i7 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public int checkWeight(int i7) {
        return i7 < 10000 ? i7 : i7 - FaceSecCode.SC_SUCCESS;
    }
}
