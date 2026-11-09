package androidx.camera.video.internal.encoder;

import E.K;
import Me.AbstractC0456a;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0456a implements VideoEncoderInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K f14644d = new K(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f14645c;

    public A(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.f5950b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f14645c = videoCapabilities;
    }

    public static A l(d dVar) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = androidx.camera.video.internal.utils.a.f14768a;
        String str = dVar.f14657a;
        LruCache lruCache2 = androidx.camera.video.internal.utils.a.f14768a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        if (mediaCodecInfo == null) {
            try {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e10) {
                    throw new x(e10);
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCodecCreateEncoderByType = null;
            }
        }
        return new A(mediaCodecInfo, dVar.f14657a);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.f14645c.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.f14645c.getBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this.f14645c.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i7) {
        try {
            return this.f14645c.getSupportedHeightsFor(i7);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this.f14645c.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i7) {
        try {
            return this.f14645c.getSupportedWidthsFor(i7);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.f14645c.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i7, int i10) {
        return this.f14645c.isSizeSupported(i7, i10);
    }
}
