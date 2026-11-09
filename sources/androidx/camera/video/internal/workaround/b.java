package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements VideoEncoderInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEncoderInfo f14778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f14779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f14780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f14781d;

    public b(VideoEncoderInfo videoEncoderInfo) {
        HashSet hashSet = new HashSet();
        this.f14781d = hashSet;
        this.f14778a = videoEncoderInfo;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        this.f14779b = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) widthAlignment))) * widthAlignment));
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        this.f14780c = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) heightAlignment))) * heightAlignment));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.f14629a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f14629a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static VideoEncoderInfo a(VideoEncoderInfo videoEncoderInfo, Size size) {
        if (!(videoEncoderInfo instanceof b)) {
            if (androidx.camera.video.internal.compat.quirk.a.f14630a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                videoEncoderInfo = new b(videoEncoderInfo);
            } else if (size != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
                Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
                size.toString();
                Objects.toString(supportedWidths);
                Objects.toString(supportedHeights);
                f.G("VideoEncoderInfoWrapper");
                videoEncoderInfo = new b(videoEncoderInfo);
            }
        }
        if (size != null && (videoEncoderInfo instanceof b)) {
            ((b) videoEncoderInfo).f14781d.add(size);
        }
        return videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.f14778a.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.f14778a.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public final String getName() {
        return this.f14778a.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.f14778a.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this.f14780c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        Range range = this.f14779b;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f14778a;
        p118hf.a.g(zContains && i7 % videoEncoderInfo.getWidthAlignment() == 0, "Not supported width: " + i7 + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.getWidthAlignment());
        return this.f14780c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this.f14779b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        Range range = this.f14780c;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f14778a;
        p118hf.a.g(zContains && i7 % videoEncoderInfo.getHeightAlignment() == 0, "Not supported height: " + i7 + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.getHeightAlignment());
        return this.f14779b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.f14778a.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i7, int i10) {
        VideoEncoderInfo videoEncoderInfo = this.f14778a;
        if (videoEncoderInfo.isSizeSupported(i7, i10)) {
            return true;
        }
        for (Size size : this.f14781d) {
            if (size.getWidth() == i7 && size.getHeight() == i10) {
                return true;
            }
        }
        if (this.f14779b.contains(Integer.valueOf(i7))) {
            return this.f14780c.contains(Integer.valueOf(i10)) && i7 % videoEncoderInfo.getWidthAlignment() == 0 && i10 % videoEncoderInfo.getHeightAlignment() == 0;
        }
        return false;
    }
}
