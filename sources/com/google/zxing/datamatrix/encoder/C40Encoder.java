package com.google.zxing.datamatrix.encoder;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
class C40Encoder implements Encoder {
    private int backtrackOneCharacter(EncoderContext encoderContext, StringBuilder sb2, StringBuilder sb3, int i7) {
        int length = sb2.length();
        sb2.delete(length - i7, length);
        encoderContext.pos--;
        int iEncodeChar = encodeChar(encoderContext.getCurrentChar(), sb3);
        encoderContext.resetSymbolInfo();
        return iEncodeChar;
    }

    private static String encodeToCodewords(CharSequence charSequence) {
        int iCharAt = charSequence.charAt(2) + (charSequence.charAt(1) * '(') + (charSequence.charAt(0) * 1600) + 1;
        return new String(new char[]{(char) (iCharAt / IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), (char) (iCharAt % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)});
    }

    public static void writeNextTriplet(EncoderContext encoderContext, StringBuilder sb2) {
        encoderContext.writeCodewords(encodeToCodewords(sb2));
        sb2.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            int iEncodeChar = encodeChar(currentChar, sb2);
            int codewordCount = encoderContext.getCodewordCount() + ((sb2.length() / 3) * 2);
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!encoderContext.hasMoreCharacters()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && dataCapacity != 2) {
                    iEncodeChar = backtrackOneCharacter(encoderContext, sb2, sb3, iEncodeChar);
                }
                while (sb2.length() % 3 == 1 && (iEncodeChar > 3 || dataCapacity != 1)) {
                    iEncodeChar = backtrackOneCharacter(encoderContext, sb2, sb3, iEncodeChar);
                }
                break;
            }
            if (sb2.length() % 3 == 0 && HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        handleEOD(encoderContext, sb2);
    }

    public int encodeChar(char c6, StringBuilder sb2) {
        if (c6 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c6 >= '0' && c6 <= '9') {
            sb2.append((char) (c6 - ','));
            return 1;
        }
        if (c6 >= 'A' && c6 <= 'Z') {
            sb2.append((char) (c6 - '3'));
            return 1;
        }
        if (c6 < ' ') {
            sb2.append((char) 0);
            sb2.append(c6);
            return 2;
        }
        if (c6 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c6 - '!'));
            return 2;
        }
        if (c6 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c6 - '+'));
            return 2;
        }
        if (c6 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c6 - 'E'));
            return 2;
        }
        if (c6 > 127) {
            sb2.append("\u0001\u001e");
            return encodeChar((char) (c6 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c6 - '`'));
        return 2;
    }

    public void encodeMaximal(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        int i7 = encoderContext.pos;
        int length = 0;
        int iEncodeChar = 0;
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            iEncodeChar = encodeChar(currentChar, sb2);
            if (sb2.length() % 3 == 0) {
                i7 = encoderContext.pos;
                length = sb2.length();
            }
        }
        if (length != sb2.length()) {
            int codewordCount = encoderContext.getCodewordCount() + ((sb2.length() / 3) * 2) + 1;
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            int length2 = sb2.length() % 3;
            if ((length2 == 2 && dataCapacity != 2) || (length2 == 1 && (iEncodeChar > 3 || dataCapacity != 1))) {
                sb2.setLength(length);
                encoderContext.pos = i7;
            }
        }
        if (sb2.length() > 0) {
            encoderContext.writeCodeword((char) 230);
        }
        handleEOD(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 1;
    }

    public void handleEOD(EncoderContext encoderContext, StringBuilder sb2) {
        int length = (sb2.length() / 3) * 2;
        int length2 = sb2.length() % 3;
        int codewordCount = encoderContext.getCodewordCount() + length;
        encoderContext.updateSymbolInfo(codewordCount);
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
            encoderContext.pos--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (dataCapacity > 0 || encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        }
        encoderContext.signalEncoderChange(0);
    }
}
