package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultPlacement {
    private final byte[] bits;
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence charSequence, int i7, int i10) {
        this.codewords = charSequence;
        this.numcols = i7;
        this.numrows = i10;
        byte[] bArr = new byte[i7 * i10];
        this.bits = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void corner1(int i7) {
        module(this.numrows - 1, 0, i7, 1);
        module(this.numrows - 1, 1, i7, 2);
        module(this.numrows - 1, 2, i7, 3);
        module(0, this.numcols - 2, i7, 4);
        module(0, this.numcols - 1, i7, 5);
        module(1, this.numcols - 1, i7, 6);
        module(2, this.numcols - 1, i7, 7);
        module(3, this.numcols - 1, i7, 8);
    }

    private void corner2(int i7) {
        module(this.numrows - 3, 0, i7, 1);
        module(this.numrows - 2, 0, i7, 2);
        module(this.numrows - 1, 0, i7, 3);
        module(0, this.numcols - 4, i7, 4);
        module(0, this.numcols - 3, i7, 5);
        module(0, this.numcols - 2, i7, 6);
        module(0, this.numcols - 1, i7, 7);
        module(1, this.numcols - 1, i7, 8);
    }

    private void corner3(int i7) {
        module(this.numrows - 3, 0, i7, 1);
        module(this.numrows - 2, 0, i7, 2);
        module(this.numrows - 1, 0, i7, 3);
        module(0, this.numcols - 2, i7, 4);
        module(0, this.numcols - 1, i7, 5);
        module(1, this.numcols - 1, i7, 6);
        module(2, this.numcols - 1, i7, 7);
        module(3, this.numcols - 1, i7, 8);
    }

    private void corner4(int i7) {
        module(this.numrows - 1, 0, i7, 1);
        module(this.numrows - 1, this.numcols - 1, i7, 2);
        module(0, this.numcols - 3, i7, 3);
        module(0, this.numcols - 2, i7, 4);
        module(0, this.numcols - 1, i7, 5);
        module(1, this.numcols - 3, i7, 6);
        module(1, this.numcols - 2, i7, 7);
        module(1, this.numcols - 1, i7, 8);
    }

    private void module(int i7, int i10, int i11, int i12) {
        if (i7 < 0) {
            int i13 = this.numrows;
            i7 += i13;
            i10 += 4 - ((i13 + 4) % 8);
        }
        if (i10 < 0) {
            int i14 = this.numcols;
            i10 += i14;
            i7 += 4 - ((i14 + 4) % 8);
        }
        setBit(i10, i7, (this.codewords.charAt(i11) & (1 << (8 - i12))) != 0);
    }

    private boolean noBit(int i7, int i10) {
        return this.bits[(i10 * this.numcols) + i7] < 0;
    }

    private void setBit(int i7, int i10, boolean z3) {
        this.bits[(i10 * this.numcols) + i7] = z3 ? (byte) 1 : (byte) 0;
    }

    private void utah(int i7, int i10, int i11) {
        int i12 = i7 - 2;
        int i13 = i10 - 2;
        module(i12, i13, i11, 1);
        int i14 = i10 - 1;
        module(i12, i14, i11, 2);
        int i15 = i7 - 1;
        module(i15, i13, i11, 3);
        module(i15, i14, i11, 4);
        module(i15, i10, i11, 5);
        module(i7, i13, i11, 6);
        module(i7, i14, i11, 7);
        module(i7, i10, i11, 8);
    }

    public final boolean getBit(int i7, int i10) {
        return this.bits[(i10 * this.numcols) + i7] == 1;
    }

    public final byte[] getBits() {
        return this.bits;
    }

    public final int getNumcols() {
        return this.numcols;
    }

    public final int getNumrows() {
        return this.numrows;
    }

    public final void place() {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 4;
        while (true) {
            if (i13 == this.numrows && i11 == 0) {
                corner1(i12);
                i12++;
            }
            if (i13 == this.numrows - 2 && i11 == 0 && this.numcols % 4 != 0) {
                corner2(i12);
                i12++;
            }
            if (i13 == this.numrows - 2 && i11 == 0 && this.numcols % 8 == 4) {
                corner3(i12);
                i12++;
            }
            if (i13 == this.numrows + 4 && i11 == 2 && this.numcols % 8 == 0) {
                corner4(i12);
                i12++;
            }
            while (true) {
                if (i13 < this.numrows && i11 >= 0 && noBit(i11, i13)) {
                    utah(i13, i11, i12);
                    i12++;
                }
                int i14 = i13 - 2;
                int i15 = i11 + 2;
                if (i14 < 0 || i15 >= this.numcols) {
                    break;
                }
                i13 = i14;
                i11 = i15;
            }
            int i16 = i13 - 1;
            int i17 = i11 + 5;
            while (true) {
                if (i16 >= 0 && i17 < this.numcols && noBit(i17, i16)) {
                    utah(i16, i17, i12);
                    i12++;
                }
                int i18 = i16 + 2;
                int i19 = i17 - 2;
                i7 = this.numrows;
                if (i18 >= i7 || i19 < 0) {
                    break;
                }
                i16 = i18;
                i17 = i19;
            }
            i13 = i16 + 5;
            i11 = i17 - 1;
            if (i13 >= i7 && i11 >= (i10 = this.numcols)) {
                break;
            }
        }
        if (noBit(i10 - 1, i7 - 1)) {
            setBit(this.numcols - 1, this.numrows - 1, true);
            setBit(this.numcols - 2, this.numrows - 2, true);
        }
    }
}
