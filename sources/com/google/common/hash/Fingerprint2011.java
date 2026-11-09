package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final long f22830K0 = -6505348102511208375L;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    private static final long f22831K1 = -8261664234251669945L;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    private static final long f22832K2 = -4288712594273399085L;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    private static final long f22833K3 = -4132994306676758123L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i7, int i10) {
        long jHashLength33To64;
        if (i10 <= 32) {
            jHashLength33To64 = murmurHash64WithSeed(bArr, i7, i10, -1397348546323613475L);
        } else {
            jHashLength33To64 = i10 <= 64 ? hashLength33To64(bArr, i7, i10) : fullFingerprint(bArr, i7, i10);
        }
        long jLoad64 = f22830K0;
        long jLoad65 = i10 >= 8 ? LittleEndianByteArray.load64(bArr, i7) : -6505348102511208375L;
        if (i10 >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bArr, (i7 + i10) - 8);
        }
        long jHash128to64 = hash128to64(jHashLength33To64 + jLoad64, jLoad65);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i7, int i10) {
        byte[] bArr2 = bArr;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i7);
        int i11 = i7 + i10;
        long jLoad65 = LittleEndianByteArray.load64(bArr2, i11 - 16) ^ f22831K1;
        long jLoad66 = f22830K0 ^ LittleEndianByteArray.load64(bArr2, i11 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j6 = i10;
        weakHashLength32WithSeeds(bArr2, i11 - 64, j6, jLoad65, jArr);
        weakHashLength32WithSeeds(bArr2, i11 - 32, j6 * f22831K1, f22830K0, jArr2);
        long[] jArr3 = jArr2;
        long jShiftMix = (shiftMix(jArr[1]) * f22831K1) + jLoad66;
        long jRotateRight = Long.rotateRight(jLoad64 + jShiftMix, 39) * f22831K1;
        int i12 = (i10 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jLoad65, 33) * f22831K1;
        long j10 = jRotateRight;
        long j11 = jShiftMix;
        int i13 = i7;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j10 + jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr2, i13 + 16), 37) * f22831K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.load64(bArr2, i13 + 48), 42) * f22831K1;
            long j12 = jArr3[1] ^ jRotateRight3;
            long j13 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(j11 ^ jArr3[0], 33);
            weakHashLength32WithSeeds(bArr2, i13, jArr[1] * f22831K1, jArr3[0] + j12, jArr);
            int i14 = i13;
            long[] jArr4 = jArr3;
            weakHashLength32WithSeeds(bArr, i14 + 32, jRotateRight5 + jArr3[1], j13, jArr4);
            i13 = i14 + 64;
            i12 -= 64;
            if (i12 == 0) {
                return hash128to64((shiftMix(j13) * f22831K1) + hash128to64(jArr[0], jArr4[0]) + j12, hash128to64(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j11 = j12;
            jRotateRight2 = j13;
            j10 = jRotateRight5;
        }
    }

    @VisibleForTesting
    public static long hash128to64(long j6, long j10) {
        long j11 = (j10 ^ j6) * f22833K3;
        long j12 = (j6 ^ (j11 ^ (j11 >>> 47))) * f22833K3;
        return (j12 ^ (j12 >>> 47)) * f22833K3;
    }

    private static long hashLength33To64(byte[] bArr, int i7, int i10) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i7 + 24);
        int i11 = i7 + i10;
        int i12 = i11 - 16;
        long jLoad65 = ((((long) i10) + LittleEndianByteArray.load64(bArr, i12)) * f22830K0) + LittleEndianByteArray.load64(bArr, i7);
        long jRotateRight = Long.rotateRight(jLoad65 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad65, 37);
        long jLoad66 = jLoad65 + LittleEndianByteArray.load64(bArr, i7 + 8);
        long jRotateRight3 = Long.rotateRight(jLoad66, 7) + jRotateRight2;
        int i13 = i7 + 16;
        long jLoad67 = jLoad66 + LittleEndianByteArray.load64(bArr, i13);
        long j6 = jLoad64 + jLoad67;
        long jRotateRight4 = Long.rotateRight(jLoad67, 31) + jRotateRight + jRotateRight3;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i13) + LittleEndianByteArray.load64(bArr, i11 - 32);
        long jLoad69 = LittleEndianByteArray.load64(bArr, i11 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad68 + jLoad69, 52);
        long jRotateRight6 = Long.rotateRight(jLoad68, 37);
        long jLoad610 = jLoad68 + LittleEndianByteArray.load64(bArr, i11 - 24);
        long jRotateRight7 = Long.rotateRight(jLoad610, 7) + jRotateRight6;
        long jLoad611 = jLoad610 + LittleEndianByteArray.load64(bArr, i12);
        return shiftMix((shiftMix(((jLoad611 + jLoad69 + jRotateRight4) * f22830K0) + ((Long.rotateRight(jLoad611, 31) + jRotateRight5 + jRotateRight7 + j6) * f22832K2)) * f22830K0) + jRotateRight4) * f22832K2;
    }

    @VisibleForTesting
    public static long murmurHash64WithSeed(byte[] bArr, int i7, int i10, long j6) {
        int i11 = i10 & (-8);
        int i12 = i10 & 7;
        long jLoad64Safely = j6 ^ (((long) i10) * f22833K3);
        for (int i13 = 0; i13 < i11; i13 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bArr, i7 + i13) * f22833K3) * f22833K3)) * f22833K3;
        }
        if (i12 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bArr, i7 + i11, i12) ^ jLoad64Safely) * f22833K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * f22833K3);
    }

    private static long shiftMix(long j6) {
        return j6 ^ (j6 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i7, long j6, long j10, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i7);
        long jLoad65 = LittleEndianByteArray.load64(bArr, i7 + 8);
        long jLoad66 = LittleEndianByteArray.load64(bArr, i7 + 16);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i7 + 24);
        long j11 = j6 + jLoad64;
        long j12 = jLoad65 + j11 + jLoad66;
        long jRotateRight = Long.rotateRight(j12, 23) + Long.rotateRight(j10 + j11 + jLoad67, 51);
        jArr[0] = j12 + jLoad67;
        jArr[1] = jRotateRight + j11;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i7, i10));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
