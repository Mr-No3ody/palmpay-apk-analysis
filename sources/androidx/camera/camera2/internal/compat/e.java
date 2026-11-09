package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f13397c;

    public /* synthetic */ e(f fVar, CameraCaptureSession cameraCaptureSession, int i7) {
        this.f13395a = i7;
        this.f13396b = fVar;
        this.f13397c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13395a) {
            case 0:
                this.f13396b.f13398a.onActive(this.f13397c);
                break;
            case 1:
                this.f13396b.f13398a.onClosed(this.f13397c);
                break;
            case 2:
                this.f13396b.f13398a.onCaptureQueueEmpty(this.f13397c);
                break;
            case 3:
                this.f13396b.f13398a.onConfigured(this.f13397c);
                break;
            case 4:
                this.f13396b.f13398a.onReady(this.f13397c);
                break;
            default:
                this.f13396b.f13398a.onConfigureFailed(this.f13397c);
                break;
        }
    }
}
