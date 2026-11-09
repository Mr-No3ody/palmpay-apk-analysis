package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.y0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import androidx.camera.video.l;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f14774d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EncoderProfilesProvider f14775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraInfoInternal f14776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f14777c;

    static {
        HashMap map = new HashMap();
        f14774d = map;
        map.put(1, l.f14798f);
        map.put(8, l.f14796d);
        map.put(6, l.f14795c);
        map.put(5, l.f14794b);
        map.put(4, l.f14793a);
        map.put(0, l.f14797e);
    }

    public a(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, y0 y0Var) {
        this.f14775a = encoderProfilesProvider;
        this.f14776b = cameraInfoInternal;
        this.f14777c = y0Var;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i7) {
        if (hasProfile(i7)) {
            return this.f14775a.getAll(i7);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i7) {
        if (!this.f14775a.hasProfile(i7)) {
            return false;
        }
        l lVar = (l) f14774d.get(Integer.valueOf(i7));
        if (lVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f14777c.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.isProblematicVideoQuality(this.f14776b, lVar) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).workaroundBySurfaceProcessing())) {
                return false;
            }
        }
        return true;
    }
}
