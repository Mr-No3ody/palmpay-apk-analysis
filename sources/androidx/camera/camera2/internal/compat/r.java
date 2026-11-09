package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraManager.AvailabilityCallback f13479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13480c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13481d = false;

    public r(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f13478a = executor;
        this.f13479b = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f13480c) {
            try {
                if (!this.f13481d) {
                    this.f13478a.execute(new W8.o(this, 11));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f13480c) {
            try {
                if (!this.f13481d) {
                    this.f13478a.execute(new q(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f13480c) {
            try {
                if (!this.f13481d) {
                    this.f13478a.execute(new q(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
