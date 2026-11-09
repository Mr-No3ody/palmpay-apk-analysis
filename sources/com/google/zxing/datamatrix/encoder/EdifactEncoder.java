package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class EdifactEncoder implements Encoder {
    private static void encodeChar(char c6, StringBuilder sb2) {
        if (c6 >= ' ' && c6 <= '?') {
            sb2.append(c6);
        } else if (c6 < '@' || c6 > '^') {
            HighLevelEncoder.illegalCharacter(c6);
        } else {
            sb2.append((char) (c6 - '@'));
        }
    }

    private static String encodeToCodewords(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c6 = (char) ((iCharAt >> 16) & 255);
        char c10 = (char) ((iCharAt >> 8) & 255);
        char c11 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c6);
        if (length >= 2) {
            sb2.append(c10);
        }
        if (length >= 3) {
            sb2.append(c11);
        }
        return sb2.toString();
    }

    private static void handleEOD(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                encoderContext.signalEncoderChange(0);
                return;
            }
            boolean z3 = true;
            if (length == 1) {
                encoderContext.updateSymbolInfo();
                int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                int remainingCharacters = encoderContext.getRemainingCharacters();
                if (remainingCharacters > dataCapacity) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + 1);
                    dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                }
                if (remainingCharacters <= dataCapacity && dataCapacity <= 2) {
                    encoderContext.signalEncoderChange(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i7 = length - 1;
            String strEncodeToCodewords = encodeToCodewords(charSequence);
            if (encoderContext.hasMoreCharacters() || i7 > 2) {
                z3 = false;
            }
            if (i7 <= 2) {
                encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + i7);
                if (encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount() >= 3) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + strEncodeToCodewords.length());
                    z3 = false;
                }
            }
            if (z3) {
                encoderContext.resetSymbolInfo();
                encoderContext.pos -= i7;
            } else {
                encoderContext.writeCodewords(strEncodeToCodewords);
            }
            encoderContext.signalEncoderChange(0);
        } catch (Throwable th) {
            encoderContext.signalEncoderChange(0);
            throw th;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.hasMoreCharacters()) {
            encodeChar(encoderContext.getCurrentChar(), sb2);
            encoderContext.pos++;
            if (sb2.length() >= 4) {
                encoderContext.writeCodewords(encodeToCodewords(sb2));
                sb2.delete(0, 4);
                if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        handleEOD(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 4;
    }
}
