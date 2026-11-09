package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.impl.AbstractC0970b0;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0961x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13669b;

    public /* synthetic */ RunnableC0961x(Object obj, int i7) {
        this.f13668a = i7;
        this.f13669b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13668a) {
            case 0:
                ((CameraDevice) this.f13669b).close();
                return;
            case 1:
                H h7 = (H) this.f13669b;
                if (h7.f13148b) {
                    return;
                }
                p118hf.a.k(((I) h7.f13150d).f13159f.f13166B0 == 7 || ((I) h7.f13150d).f13159f.f13166B0 == 6, null);
                if (((I) h7.f13150d).c()) {
                    ((I) h7.f13150d).f13159f.v(true);
                    return;
                } else {
                    ((I) h7.f13150d).f13159f.w(true);
                    return;
                }
            case 2:
                ((Z) this.f13669b).f13331i.postCapture();
                return;
            case 3:
                ((ImageCapture$ScreenFlash) this.f13669b).clear();
                return;
            case 4:
                C0962x0 c0962x0 = (C0962x0) this.f13669b;
                synchronized (c0962x0.f13670a) {
                    if (c0962x0.f13671b.isEmpty()) {
                        return;
                    }
                    try {
                        c0962x0.g(c0962x0.f13671b);
                        c0962x0.f13671b.clear();
                        return;
                    } catch (Throwable th) {
                        c0962x0.f13671b.clear();
                        throw th;
                    }
                }
            case 5:
                for (SynchronizedCaptureSession synchronizedCaptureSession : (LinkedHashSet) this.f13669b) {
                    synchronizedCaptureSession.getStateCallback().c(synchronizedCaptureSession);
                }
                return;
            case 6:
                V0 v3 = (V0) this.f13669b;
                v3.getClass();
                p140j8.f.G("ProcessingCaptureSession");
                v3.f13277a.deInitSession();
                return;
            case 7:
                V0.f13275o.remove((AbstractC0970b0) this.f13669b);
                return;
            case 8:
                b1 b1Var = (b1) this.f13669b;
                b1Var.g(b1Var);
                return;
            case 9:
                c1.m((c1) this.f13669b);
                return;
            default:
                ((E.d0) this.f13669b).a();
                return;
        }
    }
}
