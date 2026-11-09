package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    public SimpleToken(Token token, int i7, int i10) {
        super(token);
        this.value = (short) i7;
        this.bitCount = (short) i10;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s3 = this.value;
        short s8 = this.bitCount;
        return "<" + Integer.toBinaryString((s3 & ((1 << s8) - 1)) | (1 << s8) | (1 << this.bitCount)).substring(1) + '>';
    }
}
