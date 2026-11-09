package androidx.camera.video.internal.encoder;

import Me.AbstractC0456a;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.video.internal.encoder.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019a extends AbstractC0456a implements AudioEncoderInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.AudioCapabilities f14647c;

    public C1019a(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = ((MediaCodecInfo.CodecCapabilities) this.f5950b).getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f14647c = audioCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    public final Range getBitrateRange() {
        return this.f14647c.getBitrateRange();
    }
}
