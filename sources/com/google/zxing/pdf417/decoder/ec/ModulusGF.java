package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.PDF417Common;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);
    private final int[] expTable;
    private final int[] logTable;
    private final int modulus;
    private final ModulusPoly one;
    private final ModulusPoly zero;

    private ModulusGF(int i7, int i10) {
        this.modulus = i7;
        this.expTable = new int[i7];
        this.logTable = new int[i7];
        int i11 = 1;
        for (int i12 = 0; i12 < i7; i12++) {
            this.expTable[i12] = i11;
            i11 = (i11 * i10) % i7;
        }
        for (int i13 = 0; i13 < i7 - 1; i13++) {
            this.logTable[this.expTable[i13]] = i13;
        }
        this.zero = new ModulusPoly(this, new int[]{0});
        this.one = new ModulusPoly(this, new int[]{1});
    }

    public int add(int i7, int i10) {
        return (i7 + i10) % this.modulus;
    }

    public ModulusPoly buildMonomial(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.zero;
        }
        int[] iArr = new int[i7 + 1];
        iArr[0] = i10;
        return new ModulusPoly(this, iArr);
    }

    public int exp(int i7) {
        return this.expTable[i7];
    }

    public ModulusPoly getOne() {
        return this.one;
    }

    public int getSize() {
        return this.modulus;
    }

    public ModulusPoly getZero() {
        return this.zero;
    }

    public int inverse(int i7) {
        if (i7 != 0) {
            return this.expTable[(this.modulus - this.logTable[i7]) - 1];
        }
        throw new ArithmeticException();
    }

    public int log(int i7) {
        if (i7 != 0) {
            return this.logTable[i7];
        }
        throw new IllegalArgumentException();
    }

    public int multiply(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.expTable;
        int[] iArr2 = this.logTable;
        return iArr[(iArr2[i7] + iArr2[i10]) % (this.modulus - 1)];
    }

    public int subtract(int i7, int i10) {
        int i11 = this.modulus;
        return ((i7 + i11) - i10) % i11;
    }
}
