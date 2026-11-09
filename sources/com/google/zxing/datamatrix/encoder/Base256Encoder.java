package com.google.zxing.datamatrix.encoder;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
final class Base256Encoder implements Encoder {
    private static char randomize255State(char c6, int i7) {
        int i10 = ((i7 * 149) % 255) + 1 + c6;
        return i10 <= 255 ? (char) i10 : (char) (i10 - 256);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (encoderContext.hasMoreCharacters()) {
            sb2.append(encoderContext.getCurrentChar());
            encoderContext.pos++;
            if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        boolean z3 = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0;
        if (encoderContext.hasMoreCharacters() || z3) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException(G.m(length, "Message length not in valid ranges: "));
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb2.length();
        for (int i7 = 0; i7 < length2; i7++) {
            encoderContext.writeCodeword(randomize255State(sb2.charAt(i7), encoderContext.getCodewordCount() + 1));
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 5;
    }
}
