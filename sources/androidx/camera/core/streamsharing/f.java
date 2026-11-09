package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements UseCaseConfig, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0971c f14485b = new C0971c("camerax.core.streamSharing.captureTypes", List.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f14486a;

    public f(C1000q0 c1000q0) {
        this.f14486a = c1000q0;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f14486a;
    }
}
