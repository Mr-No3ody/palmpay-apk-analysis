package androidx.camera.core.impl;

import androidx.camera.core.ImageAnalysis$BackpressureStrategy;
import androidx.camera.core.ImageAnalysis$OutputImageFormat;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.internal.ThreadConfig;

/* JADX INFO: renamed from: androidx.camera.core.impl.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0980g0 implements UseCaseConfig, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0971c f14059b = new C0971c("camerax.core.imageAnalysis.backpressureStrategy", ImageAnalysis$BackpressureStrategy.class, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0971c f14060c = new C0971c("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0971c f14061d = new C0971c("camerax.core.imageAnalysis.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0971c f14062e = new C0971c("camerax.core.imageAnalysis.outputImageFormat", ImageAnalysis$OutputImageFormat.class, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0971c f14063f = new C0971c("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0971c f14064g = new C0971c("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f14065a;

    public C0980g0(C1000q0 c1000q0) {
        this.f14065a = c1000q0;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f14065a;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 35;
    }
}
