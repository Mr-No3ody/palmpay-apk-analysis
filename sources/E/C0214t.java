package E;

import android.os.Handler;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.C1005t0;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: E.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214t implements TargetConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0971c f2109b = new C0971c("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.Provider.class, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0971c f2110c = new C0971c("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.Provider.class, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0971c f2111d = new C0971c("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.Provider.class, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0971c f2112e = new C0971c("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0971c f2113f = new C0971c("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0971c f2114g = new C0971c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0971c f2115i = new C0971c("camerax.core.appConfig.availableCamerasLimiter", C0211p.class, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0971c f2116j = new C0971c("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0971c f2117o = new C0971c("camerax.core.appConfig.cameraProviderInitRetryPolicy", RetryPolicy.class, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0971c f2118p = new C0971c("camerax.core.appConfig.quirksSettings", C1005t0.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f2119a;

    public C0214t(C1000q0 c1000q0) {
        this.f2119a = c1000q0;
    }

    public final C0211p a() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.f2119a.retrieveOption(f2115i);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (C0211p) objRetrieveOption;
    }

    public final CameraFactory.Provider b() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.f2119a.retrieveOption(f2109b);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (CameraFactory.Provider) objRetrieveOption;
    }

    public final long c() {
        Object objRetrieveOption = -1L;
        try {
            objRetrieveOption = this.f2119a.retrieveOption(f2116j);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objRetrieveOption).longValue();
    }

    public final CameraDeviceSurfaceManager.Provider d() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.f2119a.retrieveOption(f2110c);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (CameraDeviceSurfaceManager.Provider) objRetrieveOption;
    }

    public final UseCaseConfigFactory.Provider e() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.f2119a.retrieveOption(f2111d);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (UseCaseConfigFactory.Provider) objRetrieveOption;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f2119a;
    }
}
