package androidx.camera.video;

import E.C0216v;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface VideoCapabilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f14574a = new v();

    @Nullable
    @RestrictTo({p192n.c.f39800a})
    default androidx.camera.video.internal.d findNearestHigherSupportedEncoderProfilesFor(@NonNull Size size, @NonNull C0216v c0216v) {
        return null;
    }

    @NonNull
    @RestrictTo({p192n.c.f39800a})
    default l findNearestHigherSupportedQualityFor(@NonNull Size size, @NonNull C0216v c0216v) {
        return l.f14799g;
    }

    @Nullable
    @RestrictTo({p192n.c.f39800a})
    default androidx.camera.video.internal.d getProfiles(@NonNull l lVar, @NonNull C0216v c0216v) {
        return null;
    }

    @NonNull
    Set<C0216v> getSupportedDynamicRanges();

    @NonNull
    List<l> getSupportedQualities(@NonNull C0216v c0216v);

    boolean isQualitySupported(@NonNull l lVar, @NonNull C0216v c0216v);

    default boolean isStabilizationSupported() {
        return false;
    }
}
