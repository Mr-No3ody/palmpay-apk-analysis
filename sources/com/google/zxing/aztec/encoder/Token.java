package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
abstract class Token {
    static final Token EMPTY = new SimpleToken(null, 0, 0);
    private final Token previous;

    public Token(Token token) {
        this.previous = token;
    }

    public final Token add(int i7, int i10) {
        return new SimpleToken(this, i7, i10);
    }

    public final Token addBinaryShift(int i7, int i10) {
        return new BinaryShiftToken(this, i7, i10);
    }

    public abstract void appendTo(BitArray bitArray, byte[] bArr);

    public final Token getPrevious() {
        return this.previous;
    }
}
