package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.AbstractC0978f0;
import androidx.camera.core.impl.C0979g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0979g f13707a = new C0979g(new Object());

    @NonNull
    List<CameraInfo> filter(@NonNull List<CameraInfo> list);

    @NonNull
    @RestrictTo({p192n.c.f39801b})
    default AbstractC0978f0 getIdentifier() {
        return f13707a;
    }
}
