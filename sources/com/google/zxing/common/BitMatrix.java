package com.google.zxing.common;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class BitMatrix implements Cloneable {
    private int[] bits;
    private int height;
    private int rowSize;
    private int width;

    public BitMatrix(int i7) {
        this(i7, i7);
    }

    private String buildToString(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder((this.width + 1) * this.height);
        for (int i7 = 0; i7 < this.height; i7++) {
            for (int i10 = 0; i10 < this.width; i10++) {
                sb2.append(get(i10, i7) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public static BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        BitMatrix bitMatrix = new BitMatrix(length2, length);
        for (int i7 = 0; i7 < length; i7++) {
            boolean[] zArr2 = zArr[i7];
            for (int i10 = 0; i10 < length2; i10++) {
                if (zArr2[i10]) {
                    bitMatrix.set(i10, i7);
                }
            }
        }
        return bitMatrix;
    }

    public void clear() {
        int length = this.bits.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.bits[i7] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.width == bitMatrix.width && this.height == bitMatrix.height && this.rowSize == bitMatrix.rowSize && Arrays.equals(this.bits, bitMatrix.bits);
    }

    public void flip(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.rowSize);
        int[] iArr = this.bits;
        iArr[i11] = (1 << (i7 & 31)) ^ iArr[i11];
    }

    public boolean get(int i7, int i10) {
        return ((this.bits[(i7 / 32) + (i10 * this.rowSize)] >>> (i7 & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int length = this.bits.length - 1;
        while (length >= 0 && this.bits[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i7 = this.rowSize;
        int i10 = length / i7;
        int i11 = (length % i7) * 32;
        int i12 = 31;
        while ((this.bits[length] >>> i12) == 0) {
            i12--;
        }
        return new int[]{i11 + i12, i10};
    }

    public int[] getEnclosingRectangle() {
        int i7 = this.width;
        int i10 = this.height;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < this.height; i13++) {
            int i14 = 0;
            while (true) {
                int i15 = this.rowSize;
                if (i14 < i15) {
                    int i16 = this.bits[(i15 * i13) + i14];
                    if (i16 != 0) {
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        int i17 = i14 * 32;
                        if (i17 < i7) {
                            int i18 = 0;
                            while ((i16 << (31 - i18)) == 0) {
                                i18++;
                            }
                            int i19 = i18 + i17;
                            if (i19 < i7) {
                                i7 = i19;
                            }
                        }
                        if (i17 + 31 > i11) {
                            int i20 = 31;
                            while ((i16 >>> i20) == 0) {
                                i20--;
                            }
                            int i21 = i17 + i20;
                            if (i21 > i11) {
                                i11 = i21;
                            }
                        }
                    }
                    i14++;
                }
            }
        }
        if (i11 < i7 || i12 < i10) {
            return null;
        }
        return new int[]{i7, i10, (i11 - i7) + 1, (i12 - i10) + 1};
    }

    public int getHeight() {
        return this.height;
    }

    public BitArray getRow(int i7, BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.width) {
            bitArray = new BitArray(this.width);
        } else {
            bitArray.clear();
        }
        int i10 = i7 * this.rowSize;
        for (int i11 = 0; i11 < this.rowSize; i11++) {
            bitArray.setBulk(i11 * 32, this.bits[i10 + i11]);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.rowSize;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.bits;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.rowSize;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        while ((iArr[i10] << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i13 + i7, i12};
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i7 = this.width;
        return Arrays.hashCode(this.bits) + (((((((i7 * 31) + i7) * 31) + this.height) * 31) + this.rowSize) * 31);
    }

    public void rotate(int i7) {
        int i10 = i7 % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
        if (i10 != 0) {
            if (i10 == 90) {
                rotate90();
                return;
            }
            if (i10 == 180) {
                rotate180();
            } else {
                if (i10 != 270) {
                    throw new IllegalArgumentException("degrees must be a multiple of 0, 90, 180, or 270");
                }
                rotate90();
                rotate180();
            }
        }
    }

    public void rotate180() {
        BitArray bitArray = new BitArray(this.width);
        BitArray bitArray2 = new BitArray(this.width);
        int i7 = (this.height + 1) / 2;
        for (int i10 = 0; i10 < i7; i10++) {
            bitArray = getRow(i10, bitArray);
            int i11 = (this.height - 1) - i10;
            bitArray2 = getRow(i11, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i10, bitArray2);
            setRow(i11, bitArray);
        }
    }

    public void rotate90() {
        int i7 = this.height;
        int i10 = this.width;
        int i11 = (i7 + 31) / 32;
        int[] iArr = new int[i11 * i10];
        for (int i12 = 0; i12 < this.height; i12++) {
            for (int i13 = 0; i13 < this.width; i13++) {
                if (((this.bits[(i13 / 32) + (this.rowSize * i12)] >>> (i13 & 31)) & 1) != 0) {
                    int i14 = (i12 / 32) + (((i10 - 1) - i13) * i11);
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
            }
        }
        this.width = i7;
        this.height = i10;
        this.rowSize = i11;
        this.bits = iArr;
    }

    public void set(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.rowSize);
        int[] iArr = this.bits;
        iArr[i11] = (1 << (i7 & 31)) | iArr[i11];
    }

    public void setRegion(int i7, int i10, int i11, int i12) {
        if (i10 < 0 || i7 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        if (i14 > this.height || i13 > this.width) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.rowSize * i10;
            for (int i16 = i7; i16 < i13; i16++) {
                int[] iArr = this.bits;
                int i17 = (i16 / 32) + i15;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public void setRow(int i7, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.bits;
        int i10 = this.rowSize;
        System.arraycopy(bitArray2, 0, iArr, i7 * i10, i10);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.rowSize);
        int[] iArr = this.bits;
        iArr[i11] = (~(1 << (i7 & 31))) & iArr[i11];
    }

    public void xor(BitMatrix bitMatrix) {
        int i7 = this.width;
        if (i7 != bitMatrix.width || this.height != bitMatrix.height || this.rowSize != bitMatrix.rowSize) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        BitArray bitArray = new BitArray(i7);
        for (int i10 = 0; i10 < this.height; i10++) {
            int i11 = this.rowSize * i10;
            int[] bitArray2 = bitMatrix.getRow(i10, bitArray).getBitArray();
            for (int i12 = 0; i12 < this.rowSize; i12++) {
                int[] iArr = this.bits;
                int i13 = i11 + i12;
                iArr[i13] = iArr[i13] ^ bitArray2[i12];
            }
        }
    }

    public BitMatrix(int i7, int i10) {
        if (i7 < 1 || i10 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.width = i7;
        this.height = i10;
        int i11 = (i7 + 31) / 32;
        this.rowSize = i11;
        this.bits = new int[i11 * i10];
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitMatrix m105clone() {
        return new BitMatrix(this.width, this.height, this.rowSize, (int[]) this.bits.clone());
    }

    public String toString(String str, String str2) {
        return buildToString(str, str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public void flip() {
        int length = this.bits.length;
        for (int i7 = 0; i7 < length; i7++) {
            int[] iArr = this.bits;
            iArr[i7] = ~iArr[i7];
        }
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return buildToString(str, str2, str3);
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i7 = -1;
            int length = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (length < str.length()) {
                if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                    if (i10 > i11) {
                        if (i7 == -1) {
                            i7 = i10 - i11;
                        } else if (i10 - i11 != i7) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i12++;
                        i11 = i10;
                    }
                    length++;
                } else {
                    if (str.startsWith(str2, length)) {
                        length += str2.length();
                        zArr[i10] = true;
                    } else if (str.startsWith(str3, length)) {
                        length += str3.length();
                        zArr[i10] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(length));
                    }
                    i10++;
                }
            }
            if (i10 > i11) {
                if (i7 == -1) {
                    i7 = i10 - i11;
                } else if (i10 - i11 != i7) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i12++;
            }
            BitMatrix bitMatrix = new BitMatrix(i7, i12);
            for (int i13 = 0; i13 < i10; i13++) {
                if (zArr[i13]) {
                    bitMatrix.set(i13 % i7, i13 / i7);
                }
            }
            return bitMatrix;
        }
        throw new IllegalArgumentException();
    }

    private BitMatrix(int i7, int i10, int i11, int[] iArr) {
        this.width = i7;
        this.height = i10;
        this.rowSize = i11;
        this.bits = iArr;
    }
}
