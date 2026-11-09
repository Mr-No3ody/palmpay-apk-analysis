package androidx.camera.video.impl;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoOutput;

/* JADX INFO: loaded from: classes.dex */
public final class a implements UseCaseConfig, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0971c f14607b = new C0971c("camerax.video.VideoCapture.videoOutput", VideoOutput.class, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0971c f14608c = new C0971c("camerax.video.VideoCapture.videoEncoderInfoFinder", Function.class, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0971c f14609d = new C0971c("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f14610a;

    public a(C1000q0 c1000q0) {
        p118hf.a.f(c1000q0.f14126a.containsKey(f14607b));
        this.f14610a = c1000q0;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f14610a;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 34;
    }
}
