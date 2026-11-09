package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i7, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i10 = (int) jAsLong;
            int i11 = (int) (jAsLong >>> 32);
            for (int i12 = 1; i12 <= i7; i12++) {
                int i13 = (i12 * i11) + i10;
                if (i13 < 0) {
                    i13 = ~i13;
                }
                if (!lockFreeBitArray.get(((long) i13) % jBitSize)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i7, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i10 = (int) jAsLong;
            int i11 = (int) (jAsLong >>> 32);
            boolean z3 = false;
            for (int i12 = 1; i12 <= i7; i12++) {
                int i13 = (i12 * i11) + i10;
                if (i13 < 0) {
                    i13 = ~i13;
                }
                z3 |= lockFreeBitArray.set(((long) i13) % jBitSize);
            }
            return z3;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i7, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i10 = 0; i10 < i7; i10++) {
                if (!lockFreeBitArray.get((Long.MAX_VALUE & jLowerEight) % jBitSize)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i7, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean z3 = false;
            for (int i10 = 0; i10 < i7; i10++) {
                z3 |= lockFreeBitArray.set((Long.MAX_VALUE & jLowerEight) % jBitSize);
                jLowerEight += jUpperEight;
            }
            return z3;
        }
    };

    public static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        public LockFreeBitArray(long j6) {
            Preconditions.checkArgument(j6 > 0, "data length is zero!");
            this.data = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j6, 64L, RoundingMode.CEILING)));
            this.bitCount = LongAddables.create();
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = atomicLongArray.get(i7);
            }
            return jArr;
        }

        public long bitCount() {
            return this.bitCount.sum();
        }

        public long bitSize() {
            return ((long) this.data.length()) * 64;
        }

        public LockFreeBitArray copy() {
            return new LockFreeBitArray(toPlainArray(this.data));
        }

        public int dataLength() {
            return this.data.length();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.data), toPlainArray(((LockFreeBitArray) obj).data));
            }
            return false;
        }

        public boolean get(long j6) {
            return ((1 << ((int) j6)) & this.data.get((int) (j6 >>> 6))) != 0;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.data));
        }

        public void putAll(LockFreeBitArray lockFreeBitArray) {
            Preconditions.checkArgument(this.data.length() == lockFreeBitArray.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), lockFreeBitArray.data.length());
            for (int i7 = 0; i7 < this.data.length(); i7++) {
                putData(i7, lockFreeBitArray.data.get(i7));
            }
        }

        public void putData(int i7, long j6) {
            while (true) {
                long j10 = this.data.get(i7);
                long j11 = j10 | j6;
                if (j10 == j11) {
                    return;
                }
                int i10 = i7;
                if (this.data.compareAndSet(i10, j10, j11)) {
                    this.bitCount.add(Long.bitCount(j11) - Long.bitCount(j10));
                    return;
                }
                i7 = i10;
            }
        }

        public boolean set(long j6) {
            long j10;
            long j11;
            if (get(j6)) {
                return false;
            }
            int i7 = (int) (j6 >>> 6);
            long j12 = 1 << ((int) j6);
            do {
                j10 = this.data.get(i7);
                j11 = j10 | j12;
                if (j10 == j11) {
                    return false;
                }
            } while (!this.data.compareAndSet(i7, j10, j11));
            this.bitCount.increment();
            return true;
        }

        public LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.data = new AtomicLongArray(jArr);
            this.bitCount = LongAddables.create();
            long jBitCount = 0;
            for (long j6 : jArr) {
                jBitCount += (long) Long.bitCount(j6);
            }
            this.bitCount.add(jBitCount);
        }
    }
}
