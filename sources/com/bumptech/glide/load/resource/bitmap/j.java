package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option$CacheKeyUpdater;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DefaultImageHeaderParser$Reader, Option$CacheKeyUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20922b;

    public j(int i7) {
        this.f20921a = i7;
        switch (i7) {
            case 2:
                this.f20922b = ByteBuffer.allocate(4);
                break;
            default:
                this.f20922b = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public int getUInt16() {
        switch (this.f20921a) {
            case 0:
                break;
        }
        return (getUInt8() << 8) | getUInt8();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public short getUInt8() throws IOException {
        switch (this.f20921a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f20922b;
                if (byteBuffer.remaining() >= 1) {
                    return (short) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
                }
                throw new k();
            default:
                int i7 = ((InputStream) this.f20922b).read();
                if (i7 != -1) {
                    return (short) i7;
                }
                throw new k();
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public int read(byte[] bArr, int i7) throws k {
        switch (this.f20921a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f20922b;
                int iMin = Math.min(i7, byteBuffer.remaining());
                if (iMin == 0) {
                    return -1;
                }
                byteBuffer.get(bArr, 0, iMin);
                return iMin;
            default:
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7 && (i11 = ((InputStream) this.f20922b).read(bArr, i10, i7 - i10)) != -1) {
                    i10 += i11;
                }
                if (i10 == 0 && i11 == -1) {
                    throw new k();
                }
                return i10;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public long skip(long j6) throws IOException {
        switch (this.f20921a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f20922b;
                int iMin = (int) Math.min(byteBuffer.remaining(), j6);
                byteBuffer.position(byteBuffer.position() + iMin);
                return iMin;
            default:
                if (j6 < 0) {
                    return 0L;
                }
                long j10 = j6;
                while (j10 > 0) {
                    InputStream inputStream = (InputStream) this.f20922b;
                    long jSkip = inputStream.skip(j10);
                    if (jSkip > 0) {
                        j10 -= jSkip;
                    } else {
                        if (inputStream.read() == -1) {
                            return j6 - j10;
                        }
                        j10--;
                    }
                }
                return j6 - j10;
        }
    }

    @Override // com.bumptech.glide.load.Option$CacheKeyUpdater
    public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f20921a) {
            case 1:
                Long l5 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (((ByteBuffer) this.f20922b)) {
                    ((ByteBuffer) this.f20922b).position(0);
                    messageDigest.update(((ByteBuffer) this.f20922b).putLong(l5.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (((ByteBuffer) this.f20922b)) {
                    ((ByteBuffer) this.f20922b).position(0);
                    messageDigest.update(((ByteBuffer) this.f20922b).putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    public j(ByteBuffer byteBuffer) {
        this.f20921a = 0;
        this.f20922b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public j(InputStream inputStream) {
        this.f20921a = 3;
        this.f20922b = inputStream;
    }
}
