package com.google.common.hash;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInts;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        public BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) Preconditions.checkNotNull(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.bytes;
            return ((bArr2[3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr2[0] & UnsignedBytes.MAX_VALUE) | ((bArr2[1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr2[2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.bytes.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            if (this.bytes.length != hashCode.getBytesInternal().length) {
                return false;
            }
            boolean z3 = true;
            int i7 = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i7 >= bArr.length) {
                    return z3;
                }
                z3 &= bArr[i7] == hashCode.getBytesInternal()[i7];
                i7++;
            }
        }

        @Override // com.google.common.hash.HashCode
        public byte[] getBytesInternal() {
            return this.bytes;
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            long j6 = this.bytes[0] & UnsignedBytes.MAX_VALUE;
            for (int i7 = 1; i7 < Math.min(this.bytes.length, 8); i7++) {
                j6 |= (((long) this.bytes[i7]) & 255) << (i7 * 8);
            }
            return j6;
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i7, int i10) {
            System.arraycopy(this.bytes, 0, bArr, i7, i10);
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        public IntHashCode(int i7) {
            this.hash = i7;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i7 = this.hash;
            return new byte[]{(byte) i7, (byte) (i7 >> 8), (byte) (i7 >> 16), (byte) (i7 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asInt();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.toLong(this.hash);
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i7, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i7 + i11] = (byte) (this.hash >> (i11 * 8));
            }
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        public LongHashCode(long j6) {
            this.hash = j6;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            long j6 = this.hash;
            return new byte[]{(byte) j6, (byte) (j6 >> 8), (byte) (j6 >> 16), (byte) (j6 >> 24), (byte) (j6 >> 32), (byte) (j6 >> 40), (byte) (j6 >> 48), (byte) (j6 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asLong();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i7, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i7 + i11] = (byte) (this.hash >> (i11 * 8));
            }
        }
    }

    private static int decode(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 >= 'a' && c6 <= 'f') {
            return c6 - 'W';
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Illegal hexadecimal character: ");
        sb2.append(c6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static HashCode fromBytes(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bArr.clone());
    }

    public static HashCode fromBytesNoCopy(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromInt(int i7) {
        return new IntHashCode(i7);
    }

    public static HashCode fromLong(long j6) {
        return new LongHashCode(j6);
    }

    public static HashCode fromString(String str) {
        Preconditions.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        Preconditions.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i7 = 0; i7 < str.length(); i7 += 2) {
            bArr[i7 / 2] = (byte) ((decode(str.charAt(i7)) << 4) + decode(str.charAt(i7 + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (bits() == hashCode.bits() && equalsSameBits(hashCode)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean equalsSameBits(HashCode hashCode);

    public byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i7 = bytesInternal[0] & UnsignedBytes.MAX_VALUE;
        for (int i10 = 1; i10 < bytesInternal.length; i10++) {
            i7 |= (bytesInternal[i10] & UnsignedBytes.MAX_VALUE) << (i10 * 8);
        }
        return i7;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb2 = new StringBuilder(bytesInternal.length * 2);
        for (byte b7 : bytesInternal) {
            char[] cArr = hexDigits;
            sb2.append(cArr[(b7 >> 4) & 15]);
            sb2.append(cArr[b7 & Ascii.SI]);
        }
        return sb2.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i7, int i10) {
        int iMin = Ints.min(i10, bits() / 8);
        Preconditions.checkPositionIndexes(i7, i7 + iMin, bArr.length);
        writeBytesToImpl(bArr, i7, iMin);
        return iMin;
    }

    public abstract void writeBytesToImpl(byte[] bArr, int i7, int i10);
}
