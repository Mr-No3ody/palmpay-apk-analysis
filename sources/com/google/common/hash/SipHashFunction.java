package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22842d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f22843k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final long f22844k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f22845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22847d;
        private long finalM;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private long f22848v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private long f22849v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        private long f22850v2;
        private long v3;

        public SipHasher(int i7, int i10, long j6, long j10) {
            super(8);
            this.f22845b = 0L;
            this.finalM = 0L;
            this.f22846c = i7;
            this.f22847d = i10;
            this.f22848v0 = 8317987319222330741L ^ j6;
            this.f22849v1 = 7237128888997146477L ^ j10;
            this.f22850v2 = 7816392313619706465L ^ j6;
            this.v3 = 8387220255154660723L ^ j10;
        }

        private void processM(long j6) {
            this.v3 ^= j6;
            sipRound(this.f22846c);
            this.f22848v0 = j6 ^ this.f22848v0;
        }

        private void sipRound(int i7) {
            for (int i10 = 0; i10 < i7; i10++) {
                long j6 = this.f22848v0;
                long j10 = this.f22849v1;
                this.f22848v0 = j6 + j10;
                this.f22850v2 += this.v3;
                this.f22849v1 = Long.rotateLeft(j10, 13);
                long jRotateLeft = Long.rotateLeft(this.v3, 16);
                long j11 = this.f22849v1;
                long j12 = this.f22848v0;
                this.f22849v1 = j11 ^ j12;
                this.v3 = jRotateLeft ^ this.f22850v2;
                long jRotateLeft2 = Long.rotateLeft(j12, 32);
                long j13 = this.f22850v2;
                long j14 = this.f22849v1;
                this.f22850v2 = j13 + j14;
                this.f22848v0 = jRotateLeft2 + this.v3;
                this.f22849v1 = Long.rotateLeft(j14, 17);
                long jRotateLeft3 = Long.rotateLeft(this.v3, 21);
                long j15 = this.f22849v1;
                long j16 = this.f22850v2;
                this.f22849v1 = j15 ^ j16;
                this.v3 = jRotateLeft3 ^ this.f22848v0;
                this.f22850v2 = Long.rotateLeft(j16, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j6 = this.finalM ^ (this.f22845b << 56);
            this.finalM = j6;
            processM(j6);
            this.f22850v2 ^= 255;
            sipRound(this.f22847d);
            return HashCode.fromLong(((this.f22848v0 ^ this.f22849v1) ^ this.f22850v2) ^ this.v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f22845b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f22845b += (long) byteBuffer.remaining();
            int i7 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i7;
                i7 += 8;
            }
        }
    }

    public SipHashFunction(int i7, int i10, long j6, long j10) {
        Preconditions.checkArgument(i7 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i7);
        Preconditions.checkArgument(i10 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i10);
        this.f22841c = i7;
        this.f22842d = i10;
        this.f22843k0 = j6;
        this.f22844k1 = j10;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f22841c == sipHashFunction.f22841c && this.f22842d == sipHashFunction.f22842d && this.f22843k0 == sipHashFunction.f22843k0 && this.f22844k1 == sipHashFunction.f22844k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f22841c) ^ this.f22842d)) ^ this.f22843k0) ^ this.f22844k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f22841c, this.f22842d, this.f22843k0, this.f22844k1);
    }

    public String toString() {
        int i7 = this.f22841c;
        int i10 = this.f22842d;
        long j6 = this.f22843k0;
        long j10 = this.f22844k1;
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("Hashing.sipHash");
        sb2.append(i7);
        sb2.append(i10);
        sb2.append("(");
        sb2.append(j6);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(")");
        return sb2.toString();
    }
}
