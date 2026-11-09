package androidx.camera.video.internal.encoder;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class y implements VideoEncoderInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEncoderInfo f14767a;

    public y(VideoEncoderInfo videoEncoderInfo) {
        p118hf.a.f(videoEncoderInfo.canSwapWidthHeight());
        this.f14767a = videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.f14767a.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.f14767a.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public final String getName() {
        return this.f14767a.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.f14767a.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this.f14767a.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i7) {
        return this.f14767a.getSupportedWidthsFor(i7);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this.f14767a.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i7) {
        return this.f14767a.getSupportedHeightsFor(i7);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.f14767a.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i7, int i10) {
        return this.f14767a.isSizeSupported(i10, i7);
    }
}
