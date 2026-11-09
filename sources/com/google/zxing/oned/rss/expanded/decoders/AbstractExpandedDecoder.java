package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractExpandedDecoder {
    private final GeneralAppIdDecoder generalDecoder;
    private final BitArray information;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.information = bitArray;
        this.generalDecoder = new GeneralAppIdDecoder(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
        if (bitArray.get(1)) {
            return new AI01AndOtherAIs(bitArray);
        }
        if (!bitArray.get(2)) {
            return new AnyAIDecoder(bitArray);
        }
        int iExtractNumericValueFromBitArray = GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 4);
        if (iExtractNumericValueFromBitArray == 4) {
            return new AI013103decoder(bitArray);
        }
        if (iExtractNumericValueFromBitArray == 5) {
            return new AI01320xDecoder(bitArray);
        }
        int iExtractNumericValueFromBitArray2 = GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 5);
        if (iExtractNumericValueFromBitArray2 == 12) {
            return new AI01392xDecoder(bitArray);
        }
        if (iExtractNumericValueFromBitArray2 == 13) {
            return new AI01393xDecoder(bitArray);
        }
        switch (GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 7)) {
            case 56:
                return new AI013x0x1xDecoder(bitArray, "310", TransType.TRANS_TYPE_CASH_LOAN);
            case 57:
                return new AI013x0x1xDecoder(bitArray, "320", TransType.TRANS_TYPE_CASH_LOAN);
            case 58:
                return new AI013x0x1xDecoder(bitArray, "310", TransType.TRANS_TYPE_AIRTIME_LOAN);
            case 59:
                return new AI013x0x1xDecoder(bitArray, "320", TransType.TRANS_TYPE_AIRTIME_LOAN);
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                return new AI013x0x1xDecoder(bitArray, "310", "15");
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                return new AI013x0x1xDecoder(bitArray, "320", "15");
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                return new AI013x0x1xDecoder(bitArray, "310", "17");
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                return new AI013x0x1xDecoder(bitArray, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + bitArray);
        }
    }

    public final GeneralAppIdDecoder getGeneralDecoder() {
        return this.generalDecoder;
    }

    public final BitArray getInformation() {
        return this.information;
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
