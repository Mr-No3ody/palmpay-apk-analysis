package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraManager;
import androidx.camera.core.impl.CameraStateRegistry$OnOpenAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public final class A extends CameraManager.AvailabilityCallback implements CameraStateRegistry$OnOpenAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13113b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f13114c;

    public A(J j6, String str) {
        this.f13114c = j6;
        this.f13112a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f13112a.equals(str)) {
            this.f13113b = true;
            if (this.f13114c.f13166B0 == 4) {
                this.f13114c.w(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f13112a.equals(str)) {
            this.f13113b = false;
        }
    }

    @Override // androidx.camera.core.impl.CameraStateRegistry$OnOpenAvailableListener
    public final void onOpenAvailable() {
        if (this.f13114c.f13166B0 == 4) {
            this.f13114c.w(false);
        }
    }
}
