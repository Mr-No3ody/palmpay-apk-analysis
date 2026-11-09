package com.google.zxing.datamatrix.encoder;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
final class ASCIIEncoder implements Encoder {
    private static char encodeASCIIDigits(char c6, char c10) {
        if (HighLevelEncoder.isDigit(c6) && HighLevelEncoder.isDigit(c10)) {
            return (char) ((c10 - '0') + ((c6 - '0') * 10) + 130);
        }
        throw new IllegalArgumentException("not digits: " + c6 + c10);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(encoderContext.getMessage(), encoderContext.pos) >= 2) {
            encoderContext.writeCodeword(encodeASCIIDigits(encoderContext.getMessage().charAt(encoderContext.pos), encoderContext.getMessage().charAt(encoderContext.pos + 1)));
            encoderContext.pos += 2;
            return;
        }
        char currentChar = encoderContext.getCurrentChar();
        int iLookAheadTest = HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
        if (iLookAheadTest == getEncodingMode()) {
            if (!HighLevelEncoder.isExtendedASCII(currentChar)) {
                encoderContext.writeCodeword((char) (currentChar + 1));
                encoderContext.pos++;
                return;
            } else {
                encoderContext.writeCodeword((char) 235);
                encoderContext.writeCodeword((char) (currentChar - 127));
                encoderContext.pos++;
                return;
            }
        }
        if (iLookAheadTest == 1) {
            encoderContext.writeCodeword((char) 230);
            encoderContext.signalEncoderChange(1);
            return;
        }
        if (iLookAheadTest == 2) {
            encoderContext.writeCodeword((char) 239);
            encoderContext.signalEncoderChange(2);
            return;
        }
        if (iLookAheadTest == 3) {
            encoderContext.writeCodeword((char) 238);
            encoderContext.signalEncoderChange(3);
        } else if (iLookAheadTest == 4) {
            encoderContext.writeCodeword((char) 240);
            encoderContext.signalEncoderChange(4);
        } else {
            if (iLookAheadTest != 5) {
                throw new IllegalStateException(G.m(iLookAheadTest, "Illegal mode: "));
            }
            encoderContext.writeCodeword((char) 231);
            encoderContext.signalEncoderChange(5);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 0;
    }
}
