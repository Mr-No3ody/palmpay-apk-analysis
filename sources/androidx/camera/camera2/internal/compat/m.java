package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C0963y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963y f13409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f13410c;

    public /* synthetic */ m(C0963y c0963y, CameraDevice cameraDevice, int i7) {
        this.f13408a = i7;
        this.f13409b = c0963y;
        this.f13410c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13408a) {
            case 0:
                ((CameraDevice.StateCallback) this.f13409b.f13689b).onClosed(this.f13410c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f13409b.f13689b).onDisconnected(this.f13410c);
                break;
            default:
                ((CameraDevice.StateCallback) this.f13409b.f13689b).onOpened(this.f13410c);
                break;
        }
    }
}
