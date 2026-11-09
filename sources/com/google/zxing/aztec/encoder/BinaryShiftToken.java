package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
final class BinaryShiftToken extends Token {
    private final int binaryShiftByteCount;
    private final int binaryShiftStart;

    public BinaryShiftToken(Token token, int i7, int i10) {
        super(token);
        this.binaryShiftStart = i7;
        this.binaryShiftByteCount = i10;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        int i7 = this.binaryShiftByteCount;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 == 0 || (i10 == 31 && i7 <= 62)) {
                bitArray.appendBits(31, 5);
                if (i7 > 62) {
                    bitArray.appendBits(i7 - 31, 16);
                } else if (i10 == 0) {
                    bitArray.appendBits(Math.min(i7, 31), 5);
                } else {
                    bitArray.appendBits(i7 - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.binaryShiftStart + i10], 8);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(this.binaryShiftStart);
        sb2.append("::");
        sb2.append((this.binaryShiftStart + this.binaryShiftByteCount) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
