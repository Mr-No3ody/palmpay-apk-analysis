package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class X12Encoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            encodeChar(currentChar, sb2);
            if (sb2.length() % 3 == 0) {
                C40Encoder.writeNextTriplet(encoderContext, sb2);
                if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        handleEOD(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public int encodeChar(char c6, StringBuilder sb2) {
        if (c6 == '\r') {
            sb2.append((char) 0);
        } else if (c6 == ' ') {
            sb2.append((char) 3);
        } else if (c6 == '*') {
            sb2.append((char) 1);
        } else if (c6 == '>') {
            sb2.append((char) 2);
        } else if (c6 >= '0' && c6 <= '9') {
            sb2.append((char) (c6 - ','));
        } else if (c6 < 'A' || c6 > 'Z') {
            HighLevelEncoder.illegalCharacter(c6);
        } else {
            sb2.append((char) (c6 - '3'));
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public void handleEOD(EncoderContext encoderContext, StringBuilder sb2) {
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
        encoderContext.pos -= sb2.length();
        if (encoderContext.getRemainingCharacters() > 1 || dataCapacity > 1 || encoderContext.getRemainingCharacters() != dataCapacity) {
            encoderContext.writeCodeword((char) 254);
        }
        if (encoderContext.getNewEncoding() < 0) {
            encoderContext.signalEncoderChange(0);
        }
    }
}
