package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class BitArray implements Cloneable {
    private static final int[] EMPTY_BITS = new int[0];
    private static final float LOAD_FACTOR = 0.75f;
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        this.bits = EMPTY_BITS;
    }

    private void ensureCapacity(int i7) {
        if (i7 > this.bits.length * 32) {
            int[] iArrMakeArray = makeArray((int) Math.ceil(i7 / LOAD_FACTOR));
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, iArrMakeArray, 0, iArr.length);
            this.bits = iArrMakeArray;
        }
    }

    private static int[] makeArray(int i7) {
        return new int[(i7 + 31) / 32];
    }

    public void appendBit(boolean z3) {
        ensureCapacity(this.size + 1);
        if (z3) {
            int[] iArr = this.bits;
            int i7 = this.size;
            int i10 = i7 / 32;
            iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
        }
        this.size++;
    }

    public void appendBitArray(BitArray bitArray) {
        int i7 = bitArray.size;
        ensureCapacity(this.size + i7);
        for (int i10 = 0; i10 < i7; i10++) {
            appendBit(bitArray.get(i10));
        }
    }

    public void appendBits(int i7, int i10) {
        if (i10 < 0 || i10 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i11 = this.size;
        ensureCapacity(i11 + i10);
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            if (((1 << i12) & i7) != 0) {
                int[] iArr = this.bits;
                int i13 = i11 / 32;
                iArr[i13] = iArr[i13] | (1 << (i11 & 31));
            }
            i11++;
        }
        this.size = i11;
    }

    public void clear() {
        int length = this.bits.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.bits[i7] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.size == bitArray.size && Arrays.equals(this.bits, bitArray.bits);
    }

    public void flip(int i7) {
        int[] iArr = this.bits;
        int i10 = i7 / 32;
        iArr[i10] = (1 << (i7 & 31)) ^ iArr[i10];
    }

    public boolean get(int i7) {
        return ((1 << (i7 & 31)) & this.bits[i7 / 32]) != 0;
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public int getNextSet(int i7) {
        int i10 = this.size;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & this.bits[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.bits;
            if (i11 == iArr.length) {
                return this.size;
            }
            i12 = iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), this.size);
    }

    public int getNextUnset(int i7) {
        int i10 = this.size;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & (~this.bits[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.bits;
            if (i11 == iArr.length) {
                return this.size;
            }
            i12 = ~iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), this.size);
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) / 8;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bits) + (this.size * 31);
    }

    public boolean isRange(int i7, int i10, boolean z3) {
        if (i10 < i7 || i7 < 0 || i10 > this.size) {
            throw new IllegalArgumentException();
        }
        if (i10 == i7) {
            return true;
        }
        int i11 = i10 - 1;
        int i12 = i7 / 32;
        int i13 = i11 / 32;
        int i14 = i12;
        while (i14 <= i13) {
            int i15 = (2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i7 & 31));
            int i16 = this.bits[i14] & i15;
            if (!z3) {
                i15 = 0;
            }
            if (i16 != i15) {
                return false;
            }
            i14++;
        }
        return true;
    }

    public void reverse() {
        int[] iArr = new int[this.bits.length];
        int i7 = (this.size - 1) / 32;
        int i10 = i7 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i7 - i11] = Integer.reverse(this.bits[i11]);
        }
        int i12 = this.size;
        int i13 = i10 * 32;
        if (i12 != i13) {
            int i14 = i13 - i12;
            int i15 = iArr[0] >>> i14;
            for (int i16 = 1; i16 < i10; i16++) {
                int i17 = iArr[i16];
                iArr[i16 - 1] = i15 | (i17 << (32 - i14));
                i15 = i17 >>> i14;
            }
            iArr[i7] = i15;
        }
        this.bits = iArr;
    }

    public void set(int i7) {
        int[] iArr = this.bits;
        int i10 = i7 / 32;
        iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
    }

    public void setBulk(int i7, int i10) {
        this.bits[i7 / 32] = i10;
    }

    public void setRange(int i7, int i10) {
        if (i10 < i7 || i7 < 0 || i10 > this.size) {
            throw new IllegalArgumentException();
        }
        if (i10 == i7) {
            return;
        }
        int i11 = i10 - 1;
        int i12 = i7 / 32;
        int i13 = i11 / 32;
        int i14 = i12;
        while (i14 <= i13) {
            int i15 = 31;
            int i16 = i14 > i12 ? 0 : i7 & 31;
            if (i14 >= i13) {
                i15 = 31 & i11;
            }
            int i17 = (2 << i15) - (1 << i16);
            int[] iArr = this.bits;
            iArr[i14] = i17 | iArr[i14];
            i14++;
        }
    }

    public void toBytes(int i7, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                if (get(i7)) {
                    i13 |= 1 << (7 - i14);
                }
                i7++;
            }
            bArr[i10 + i12] = (byte) i13;
        }
    }

    public String toString() {
        int i7 = this.size;
        StringBuilder sb2 = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i10 = 0; i10 < this.size; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(get(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void xor(BitArray bitArray) {
        if (this.size != bitArray.size) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i7 = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i7 >= iArr.length) {
                return;
            }
            iArr[i7] = iArr[i7] ^ bitArray.bits[i7];
            i7++;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitArray m104clone() {
        return new BitArray((int[]) this.bits.clone(), this.size);
    }

    public BitArray(int i7) {
        this.size = i7;
        this.bits = makeArray(i7);
    }

    public BitArray(int[] iArr, int i7) {
        this.bits = iArr;
        this.size = i7;
    }
}
