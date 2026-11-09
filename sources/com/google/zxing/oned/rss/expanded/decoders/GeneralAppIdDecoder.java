package com.google.zxing.oned.rss.expanded.decoders;

import C0.G;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;

/* JADX INFO: loaded from: classes3.dex */
final class GeneralAppIdDecoder {
    private final BitArray information;
    private final CurrentParsingState current = new CurrentParsingState();
    private final StringBuilder buffer = new StringBuilder();

    public GeneralAppIdDecoder(BitArray bitArray) {
        this.information = bitArray;
    }

    private DecodedChar decodeAlphanumeric(int i7) {
        char c6;
        int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i7, 5);
        if (iExtractNumericValueFromBitArray == 15) {
            return new DecodedChar(i7 + 5, '$');
        }
        if (iExtractNumericValueFromBitArray >= 5 && iExtractNumericValueFromBitArray < 15) {
            return new DecodedChar(i7 + 5, (char) (iExtractNumericValueFromBitArray + 43));
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i7, 6);
        if (iExtractNumericValueFromBitArray2 >= 32 && iExtractNumericValueFromBitArray2 < 58) {
            return new DecodedChar(i7 + 6, (char) (iExtractNumericValueFromBitArray2 + 33));
        }
        switch (iExtractNumericValueFromBitArray2) {
            case 58:
                c6 = '*';
                break;
            case 59:
                c6 = ',';
                break;
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                c6 = '-';
                break;
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                c6 = '.';
                break;
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                c6 = '/';
                break;
            default:
                throw new IllegalStateException(G.m(iExtractNumericValueFromBitArray2, "Decoding invalid alphanumeric value: "));
        }
        return new DecodedChar(i7 + 6, c6);
    }

    private DecodedChar decodeIsoIec646(int i7) throws FormatException {
        int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i7, 5);
        if (iExtractNumericValueFromBitArray == 15) {
            return new DecodedChar(i7 + 5, '$');
        }
        char c6 = '+';
        if (iExtractNumericValueFromBitArray >= 5 && iExtractNumericValueFromBitArray < 15) {
            return new DecodedChar(i7 + 5, (char) (iExtractNumericValueFromBitArray + 43));
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i7, 7);
        if (iExtractNumericValueFromBitArray2 >= 64 && iExtractNumericValueFromBitArray2 < 90) {
            return new DecodedChar(i7 + 7, (char) (iExtractNumericValueFromBitArray2 + 1));
        }
        if (iExtractNumericValueFromBitArray2 >= 90 && iExtractNumericValueFromBitArray2 < 116) {
            return new DecodedChar(i7 + 7, (char) (iExtractNumericValueFromBitArray2 + 7));
        }
        switch (extractNumericValueFromBitArray(i7, 8)) {
            case 232:
                c6 = '!';
                break;
            case 233:
                c6 = '\"';
                break;
            case 234:
                c6 = '%';
                break;
            case 235:
                c6 = '&';
                break;
            case 236:
                c6 = '\'';
                break;
            case 237:
                c6 = '(';
                break;
            case 238:
                c6 = ')';
                break;
            case 239:
                c6 = '*';
                break;
            case 240:
                break;
            case 241:
                c6 = ',';
                break;
            case 242:
                c6 = '-';
                break;
            case 243:
                c6 = '.';
                break;
            case 244:
                c6 = '/';
                break;
            case 245:
                c6 = ':';
                break;
            case 246:
                c6 = ';';
                break;
            case 247:
                c6 = '<';
                break;
            case 248:
                c6 = '=';
                break;
            case 249:
                c6 = '>';
                break;
            case 250:
                c6 = '?';
                break;
            case 251:
                c6 = '_';
                break;
            case 252:
                c6 = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new DecodedChar(i7 + 8, c6);
    }

    private DecodedNumeric decodeNumeric(int i7) throws FormatException {
        int i10 = i7 + 7;
        if (i10 > this.information.getSize()) {
            int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i7, 4);
            return iExtractNumericValueFromBitArray == 0 ? new DecodedNumeric(this.information.getSize(), 10, 10) : new DecodedNumeric(this.information.getSize(), iExtractNumericValueFromBitArray - 1, 10);
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i7, 7) - 8;
        return new DecodedNumeric(i10, iExtractNumericValueFromBitArray2 / 11, iExtractNumericValueFromBitArray2 % 11);
    }

    private boolean isAlphaOr646ToNumericLatch(int i7) {
        int i10 = i7 + 3;
        if (i10 > this.information.getSize()) {
            return false;
        }
        while (i7 < i10) {
            if (this.information.get(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i7) {
        int i10;
        if (i7 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i11 = 0; i11 < 5 && (i10 = i11 + i7) < this.information.getSize(); i11++) {
            if (i11 == 2) {
                if (!this.information.get(i7 + 2)) {
                    return false;
                }
            } else if (this.information.get(i10)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i7) {
        int i10;
        if (i7 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i11 = 0; i11 < 4 && (i10 = i11 + i7) < this.information.getSize(); i11++) {
            if (this.information.get(i10)) {
                return false;
            }
        }
        return true;
    }

    private boolean isStillAlpha(int i7) {
        int iExtractNumericValueFromBitArray;
        if (i7 + 5 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i7, 5);
        if (iExtractNumericValueFromBitArray2 < 5 || iExtractNumericValueFromBitArray2 >= 16) {
            return i7 + 6 <= this.information.getSize() && (iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i7, 6)) >= 16 && iExtractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private boolean isStillIsoIec646(int i7) {
        int iExtractNumericValueFromBitArray;
        if (i7 + 5 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i7, 5);
        if (iExtractNumericValueFromBitArray2 >= 5 && iExtractNumericValueFromBitArray2 < 16) {
            return true;
        }
        if (i7 + 7 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i7, 7);
        if (iExtractNumericValueFromBitArray3 < 64 || iExtractNumericValueFromBitArray3 >= 116) {
            return i7 + 8 <= this.information.getSize() && (iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i7, 8)) >= 232 && iExtractNumericValueFromBitArray < 253;
        }
        return true;
    }

    private boolean isStillNumeric(int i7) {
        if (i7 + 7 > this.information.getSize()) {
            return i7 + 4 <= this.information.getSize();
        }
        int i10 = i7;
        while (true) {
            int i11 = i7 + 3;
            if (i10 >= i11) {
                return this.information.get(i11);
            }
            if (this.information.get(i10)) {
                return true;
            }
            i10++;
        }
    }

    private BlockParsedResult parseAlphaBlock() {
        while (isStillAlpha(this.current.getPosition())) {
            DecodedChar decodedCharDecodeAlphanumeric = decodeAlphanumeric(this.current.getPosition());
            this.current.setPosition(decodedCharDecodeAlphanumeric.getNewPosition());
            if (decodedCharDecodeAlphanumeric.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedCharDecodeAlphanumeric.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setIsoIec646();
        }
        return new BlockParsedResult();
    }

    private DecodedInformation parseBlocks() throws FormatException {
        BlockParsedResult numericBlock;
        boolean zIsFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                numericBlock = parseAlphaBlock();
                zIsFinished = numericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                numericBlock = parseIsoIec646Block();
                zIsFinished = numericBlock.isFinished();
            } else {
                numericBlock = parseNumericBlock();
                zIsFinished = numericBlock.isFinished();
            }
            if (position == this.current.getPosition() && !zIsFinished) {
                break;
            }
        } while (!zIsFinished);
        return numericBlock.getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() throws FormatException {
        while (isStillIsoIec646(this.current.getPosition())) {
            DecodedChar decodedCharDecodeIsoIec646 = decodeIsoIec646(this.current.getPosition());
            this.current.setPosition(decodedCharDecodeIsoIec646.getNewPosition());
            if (decodedCharDecodeIsoIec646.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedCharDecodeIsoIec646.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setAlpha();
        }
        return new BlockParsedResult();
    }

    private BlockParsedResult parseNumericBlock() throws FormatException {
        while (isStillNumeric(this.current.getPosition())) {
            DecodedNumeric decodedNumericDecodeNumeric = decodeNumeric(this.current.getPosition());
            this.current.setPosition(decodedNumericDecodeNumeric.getNewPosition());
            if (decodedNumericDecodeNumeric.isFirstDigitFNC1()) {
                return new BlockParsedResult(decodedNumericDecodeNumeric.isSecondDigitFNC1() ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), decodedNumericDecodeNumeric.getSecondDigit()), true);
            }
            this.buffer.append(decodedNumericDecodeNumeric.getFirstDigit());
            if (decodedNumericDecodeNumeric.isSecondDigitFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedNumericDecodeNumeric.getSecondDigit());
        }
        if (isNumericToAlphaNumericLatch(this.current.getPosition())) {
            this.current.setAlpha();
            this.current.incrementPosition(4);
        }
        return new BlockParsedResult();
    }

    public String decodeAllCodes(StringBuilder sb2, int i7) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            DecodedInformation decodedInformationDecodeGeneralPurposeField = decodeGeneralPurposeField(i7, str);
            String fieldsInGeneralPurpose = FieldParser.parseFieldsInGeneralPurpose(decodedInformationDecodeGeneralPurposeField.getNewString());
            if (fieldsInGeneralPurpose != null) {
                sb2.append(fieldsInGeneralPurpose);
            }
            String strValueOf = decodedInformationDecodeGeneralPurposeField.isRemaining() ? String.valueOf(decodedInformationDecodeGeneralPurposeField.getRemainingValue()) : null;
            if (i7 == decodedInformationDecodeGeneralPurposeField.getNewPosition()) {
                return sb2.toString();
            }
            i7 = decodedInformationDecodeGeneralPurposeField.getNewPosition();
            str = strValueOf;
        }
    }

    public DecodedInformation decodeGeneralPurposeField(int i7, String str) throws FormatException {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i7);
        DecodedInformation blocks = parseBlocks();
        return (blocks == null || !blocks.isRemaining()) ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), blocks.getRemainingValue());
    }

    public int extractNumericValueFromBitArray(int i7, int i10) {
        return extractNumericValueFromBitArray(this.information, i7, i10);
    }

    public static int extractNumericValueFromBitArray(BitArray bitArray, int i7, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (bitArray.get(i7 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
