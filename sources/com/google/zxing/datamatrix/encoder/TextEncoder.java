package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class TextEncoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public int encodeChar(char c6, StringBuilder sb2) {
        if (c6 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c6 >= '0' && c6 <= '9') {
            sb2.append((char) (c6 - ','));
            return 1;
        }
        if (c6 >= 'a' && c6 <= 'z') {
            sb2.append((char) (c6 - 'S'));
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
        if (c6 >= '[' && c6 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c6 - 'E'));
            return 2;
        }
        if (c6 == '`') {
            sb2.append((char) 2);
            sb2.append((char) 0);
            return 2;
        }
        if (c6 <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) (c6 - '@'));
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

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 2;
    }
}
