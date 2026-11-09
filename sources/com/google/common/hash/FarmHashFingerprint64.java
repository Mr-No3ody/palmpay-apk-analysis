package com.google.common.hash;

import androidx.camera.video.u;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final long f22827K0 = -4348849565147123417L;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    private static final long f22828K1 = -5435081209227447693L;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    private static final long f22829K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i7, int i10) {
        if (i10 <= 32) {
            return i10 <= 16 ? hashLength0to16(bArr, i7, i10) : hashLength17to32(bArr, i7, i10);
        }
        return i10 <= 64 ? hashLength33To64(bArr, i7, i10) : hashLength65Plus(bArr, i7, i10);
    }

    private static long hashLength0to16(byte[] bArr, int i7, int i10) {
        if (i10 >= 8) {
            long j6 = ((long) (i10 * 2)) + f22829K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i7) + f22829K2;
            long jLoad65 = LittleEndianByteArray.load64(bArr, (i7 + i10) - 8);
            return hashLength16((Long.rotateRight(jLoad65, 37) * j6) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad65) * j6, j6);
        }
        if (i10 >= 4) {
            return hashLength16(((long) i10) + ((((long) LittleEndianByteArray.load32(bArr, i7)) & 4294967295L) << 3), ((long) LittleEndianByteArray.load32(bArr, (i7 + i10) - 4)) & 4294967295L, ((long) (i10 * 2)) + f22829K2);
        }
        if (i10 <= 0) {
            return f22829K2;
        }
        return shiftMix((((long) ((bArr[i7] & UnsignedBytes.MAX_VALUE) + ((bArr[(i10 >> 1) + i7] & UnsignedBytes.MAX_VALUE) << 8))) * f22829K2) ^ (((long) (i10 + ((bArr[(i10 - 1) + i7] & 255) << 2))) * f22827K0)) * f22829K2;
    }

    private static long hashLength16(long j6, long j10, long j11) {
        long j12 = (j6 ^ j10) * j11;
        long j13 = ((j12 ^ (j12 >>> 47)) ^ j10) * j11;
        return (j13 ^ (j13 >>> 47)) * j11;
    }

    private static long hashLength17to32(byte[] bArr, int i7, int i10) {
        long j6 = ((long) (i10 * 2)) + f22829K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i7) * f22828K1;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i7 + 8);
        int i11 = i7 + i10;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i11 - 8) * j6;
        return hashLength16(Long.rotateRight(jLoad66, 30) + Long.rotateRight(jLoad64 + jLoad65, 43) + (LittleEndianByteArray.load64(bArr, i11 - 16) * f22829K2), Long.rotateRight(jLoad65 + f22829K2, 18) + jLoad64 + jLoad66, j6);
    }

    private static long hashLength33To64(byte[] bArr, int i7, int i10) {
        long j6 = ((long) (i10 * 2)) + f22829K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i7) * f22829K2;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i7 + 8);
        int i11 = i7 + i10;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i11 - 8) * j6;
        long jRotateRight = Long.rotateRight(jLoad66, 30) + Long.rotateRight(jLoad64 + jLoad65, 43) + (LittleEndianByteArray.load64(bArr, i11 - 16) * f22829K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad66 + Long.rotateRight(jLoad65 + f22829K2, 18) + jLoad64, j6);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i7 + 16) * j6;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i7 + 24);
        long jLoad69 = (jRotateRight + LittleEndianByteArray.load64(bArr, i11 - 32)) * j6;
        return hashLength16(Long.rotateRight(jLoad69, 30) + Long.rotateRight(jLoad67 + jLoad68, 43) + ((jHashLength16 + LittleEndianByteArray.load64(bArr, i11 - 24)) * j6), Long.rotateRight(jLoad68 + jLoad64, 18) + jLoad67 + jLoad69, j6);
    }

    private static long hashLength65Plus(byte[] bArr, int i7, int i10) {
        long j6 = 81;
        long j10 = f22828K1;
        long j11 = (j6 * f22828K1) + 113;
        long jShiftMix = shiftMix((j11 * f22829K2) + 113) * f22829K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j6 * f22829K2) + LittleEndianByteArray.load64(bArr, i7);
        char c6 = 1;
        int i11 = i10 - 1;
        char c10 = '@';
        int iY = u.y(i11, 64, 64, i7);
        int i12 = i11 & 63;
        int i13 = iY + i12;
        int i14 = i13 - 63;
        long j12 = jShiftMix;
        long jLoad65 = j11;
        long j13 = jLoad64;
        int i15 = i7;
        while (true) {
            long jRotateRight = Long.rotateRight(j13 + jLoad65 + jArr[0] + LittleEndianByteArray.load64(bArr, i15 + 8), 37) * j10;
            long jRotateRight2 = Long.rotateRight(jLoad65 + jArr[c6] + LittleEndianByteArray.load64(bArr, i15 + 48), 42) * j10;
            long j14 = jRotateRight ^ jArr2[c6];
            jLoad65 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i15 + 40);
            long jRotateRight3 = Long.rotateRight(j12 + jArr2[0], 33) * j10;
            long j15 = j10;
            char c11 = c10;
            int i16 = i12;
            char c12 = c6;
            weakHashLength32WithSeeds(bArr, i15, jArr[c6] * j10, j14 + jArr2[0], jArr);
            int i17 = i15;
            long[] jArr3 = jArr;
            weakHashLength32WithSeeds(bArr, i17 + 32, jRotateRight3 + jArr2[c12], LittleEndianByteArray.load64(bArr, i17 + 16) + jLoad65, jArr2);
            i15 = i17 + 64;
            if (i15 == iY) {
                long j16 = ((j14 & 255) << c12) + j15;
                long j17 = jArr2[0] + ((long) i16);
                jArr2[0] = j17;
                long j18 = jArr3[0] + j17;
                jArr3[0] = j18;
                jArr2[0] = jArr2[0] + j18;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad65 + jArr3[0] + LittleEndianByteArray.load64(bArr, i13 - 55), 37) * j16;
                long jRotateRight5 = Long.rotateRight(jLoad65 + jArr3[c12] + LittleEndianByteArray.load64(bArr, i13 - 15), 42) * j16;
                long j19 = jRotateRight4 ^ (jArr2[c12] * 9);
                long jLoad66 = (jArr3[0] * 9) + LittleEndianByteArray.load64(bArr, i13 - 23) + jRotateRight5;
                long jRotateRight6 = Long.rotateRight(j14 + jArr2[0], 33) * j16;
                weakHashLength32WithSeeds(bArr, i14, jArr3[c12] * j16, jArr2[0] + j19, jArr3);
                weakHashLength32WithSeeds(bArr, i13 - 31, jArr2[c12] + jRotateRight6, LittleEndianByteArray.load64(bArr, i13 - 47) + jLoad66, jArr2);
                return hashLength16((shiftMix(jLoad66) * f22827K0) + hashLength16(jArr3[0], jArr2[0], j16) + j19, hashLength16(jArr3[c12], jArr2[c12], j16) + jRotateRight6, j16);
            }
            c10 = c11;
            i12 = i16;
            j13 = jRotateRight3;
            j12 = j14;
            c6 = c12;
            jArr = jArr3;
            j10 = j15;
        }
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
        long jRotateRight = Long.rotateRight(j12, 44) + Long.rotateRight(j10 + j11 + jLoad67, 21);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
