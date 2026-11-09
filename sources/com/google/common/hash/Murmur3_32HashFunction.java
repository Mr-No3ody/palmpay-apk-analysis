package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    private static final int f22838C1 = -862048943;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    private static final int f22839C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final HashFunction MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final HashFunction GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.GOOD_FAST_HASH_SEED, true);

    @CanIgnoreReturnValue
    public static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private int f22840h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        public Murmur3_32Hasher(int i7) {
            this.f22840h1 = i7;
        }

        private void update(int i7, long j6) {
            long j10 = this.buffer;
            int i10 = this.shift;
            long j11 = ((j6 & 4294967295L) << i10) | j10;
            this.buffer = j11;
            int i11 = (i7 * 8) + i10;
            this.shift = i11;
            this.length += i7;
            if (i11 >= 32) {
                this.f22840h1 = Murmur3_32HashFunction.mixH1(this.f22840h1, Murmur3_32HashFunction.mixK1((int) j11));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int iMixK1 = this.f22840h1 ^ Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.f22840h1 = iMixK1;
            return Murmur3_32HashFunction.fmix(iMixK1, this.length);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b7) {
            update(1, b7 & UnsignedBytes.MAX_VALUE);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c6) {
            update(2, c6);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i7) {
            update(4, i7);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j6) {
            update(4, (int) j6);
            update(4, j6 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
            if (!Charsets.UTF_8.equals(charset)) {
                return super.putString(charSequence, charset);
            }
            int length = charSequence.length();
            int i7 = 0;
            while (true) {
                int i10 = i7 + 4;
                if (i10 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i7);
                char cCharAt2 = charSequence.charAt(i7 + 1);
                char cCharAt3 = charSequence.charAt(i7 + 2);
                char cCharAt4 = charSequence.charAt(i7 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                update(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i7 = i10;
            }
            while (i7 < length) {
                char cCharAt5 = charSequence.charAt(i7);
                if (cCharAt5 < 128) {
                    update(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    update(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    update(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i7);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(charSequence.subSequence(i7, length).toString().getBytes(charset));
                        return this;
                    }
                    i7++;
                    update(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i7++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
            int i11 = 0;
            while (true) {
                int i12 = i11 + 4;
                if (i12 > i10) {
                    break;
                }
                update(4, Murmur3_32HashFunction.getIntLittleEndian(bArr, i11 + i7));
                i11 = i12;
            }
            while (i11 < i10) {
                putByte(bArr[i7 + i11]);
                i11++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                putInt(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                putByte(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }
    }

    public Murmur3_32HashFunction(int i7, boolean z3) {
        this.seed = i7;
        this.supplementaryPlaneFix = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c6) {
        return ((long) (c6 >>> '\f')) | 224 | ((long) ((((c6 >>> 6) & 63) | 128) << 8)) | ((long) (((c6 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c6) {
        return ((long) (c6 >>> 6)) | 192 | ((long) (((c6 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int i7) {
        return ((long) (i7 >>> 18)) | 240 | ((((long) ((i7 >>> 12) & 63)) | 128) << 8) | ((((long) ((i7 >>> 6) & 63)) | 128) << 16) | ((((long) (i7 & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int i7, int i10) {
        int i11 = i7 ^ i10;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i13 ^ (i13 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] bArr, int i7) {
        return Ints.fromBytes(bArr[i7 + 3], bArr[i7 + 2], bArr[i7 + 1], bArr[i7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int i7, int i10) {
        return (Integer.rotateLeft(i7 ^ i10, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int i7) {
        return Integer.rotateLeft(i7 * f22838C1, 15) * f22839C2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
            if (this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        int iMixH1 = this.seed;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 4;
            if (i13 > i10) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(bArr, i12 + i7)));
            i12 = i13;
        }
        int i14 = i12;
        int i15 = 0;
        while (i14 < i10) {
            i11 ^= UnsignedBytes.toInt(bArr[i7 + i14]) << i15;
            i14++;
            i15 += 8;
        }
        return fmix(mixK1(i11) ^ iMixH1, i10);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i7) {
        return fmix(mixH1(this.seed, mixK1(i7)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j6) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) j6)), mixK1((int) (j6 >>> 32))), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!Charsets.UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iMixH1 = this.seed;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 4;
            if (i12 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence.charAt(i10 + 1);
            char cCharAt3 = charSequence.charAt(i10 + 2);
            char cCharAt4 = charSequence.charAt(i10 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i11 += 4;
            i10 = i12;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i10 < length) {
            char cCharAt5 = charSequence.charAt(i10);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i7;
                i7 += 8;
                i11++;
            } else if (cCharAt5 < 2048) {
                jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i7;
                i7 += 16;
                i11 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i7;
                i7 += 24;
                i11 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i10);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i10++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i7;
                if (this.supplementaryPlaneFix) {
                    i7 += 32;
                }
                i11 += 4;
            }
            if (i7 >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i7 -= 32;
            }
            i10++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i11);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int iMixK1 = this.seed;
        for (int i7 = 1; i7 < charSequence.length(); i7 += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(charSequence.charAt(i7 - 1) | (charSequence.charAt(i7) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iMixK1 ^= mixK1(charSequence.charAt(charSequence.length() - 1));
        }
        return fmix(iMixK1, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.seed);
    }

    public String toString() {
        int i7 = this.seed;
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Hashing.murmur3_32(");
        sb2.append(i7);
        sb2.append(")");
        return sb2.toString();
    }
}
