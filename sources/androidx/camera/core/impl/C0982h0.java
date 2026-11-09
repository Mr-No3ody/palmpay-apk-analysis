package androidx.camera.core.impl;

import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.internal.IoConfig;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982h0 implements UseCaseConfig, ImageOutputConfig, IoConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0971c f14069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0971c f14070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0971c f14071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0971c f14072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0971c f14073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0971c f14074g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0971c f14075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0971c f14076j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0971c f14077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0971c f14078p;
    public static final C0971c t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0971c f14079v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f14080a;

    static {
        Class cls = Integer.TYPE;
        f14069b = new C0971c("camerax.core.imageCapture.captureMode", cls, null);
        f14070c = new C0971c("camerax.core.imageCapture.flashMode", cls, null);
        f14071d = new C0971c("camerax.core.imageCapture.captureBundle", CaptureBundle.class, null);
        f14072e = new C0971c("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f14073f = new C0971c("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f14074g = new C0971c("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);
        f14075i = new C0971c("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f14076j = new C0971c("camerax.core.imageCapture.flashType", cls, null);
        f14077o = new C0971c("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        f14078p = new C0971c("camerax.core.imageCapture.screenFlash", ImageCapture$ScreenFlash.class, null);
        t = new C0971c("camerax.core.useCase.postviewResolutionSelector", I.b.class, null);
        f14079v = new C0971c("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public C0982h0(C1000q0 c1000q0) {
        this.f14080a = c1000q0;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f14080a;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((Integer) retrieveOption(ImageInputConfig.f13897r)).intValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    public final Executor getIoExecutor(Executor executor) {
        return (Executor) retrieveOption(IoConfig.b0, executor);
    }

    @Override // androidx.camera.core.internal.IoConfig
    public final Executor getIoExecutor() {
        return (Executor) retrieveOption(IoConfig.b0);
    }
}
