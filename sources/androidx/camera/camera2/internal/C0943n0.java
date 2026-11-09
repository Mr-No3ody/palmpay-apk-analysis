package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0943n0 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13603b;

    public /* synthetic */ C0943n0(Object obj, int i7) {
        this.f13602a = i7;
        this.f13603b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                b1 b1Var = (b1) this.f13603b;
                b1Var.i(cameraCaptureSession);
                b1Var.a(b1Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                b1 b1Var = (b1) this.f13603b;
                b1Var.i(cameraCaptureSession);
                b1Var.b(b1Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                b1 b1Var = (b1) this.f13603b;
                b1Var.i(cameraCaptureSession);
                b1Var.c(b1Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        androidx.concurrent.futures.k kVar;
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((b1) this.f13603b).i(cameraCaptureSession);
                    b1 b1Var = (b1) this.f13603b;
                    b1Var.d(b1Var);
                    synchronized (((b1) this.f13603b).f13349a) {
                        p118hf.a.j(((b1) this.f13603b).f13357i, "OpenCaptureSession completer should not null");
                        b1 b1Var2 = (b1) this.f13603b;
                        kVar = b1Var2.f13357i;
                        b1Var2.f13357i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((b1) this.f13603b).f13349a) {
                        p118hf.a.j(((b1) this.f13603b).f13357i, "OpenCaptureSession completer should not null");
                        b1 b1Var3 = (b1) this.f13603b;
                        kVar = b1Var3.f13357i;
                        b1Var3.f13357i = null;
                        kVar.d(new IllegalStateException("onConfigureFailed"));
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        androidx.concurrent.futures.k kVar;
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((b1) this.f13603b).i(cameraCaptureSession);
                    b1 b1Var = (b1) this.f13603b;
                    b1Var.e(b1Var);
                    synchronized (((b1) this.f13603b).f13349a) {
                        p118hf.a.j(((b1) this.f13603b).f13357i, "OpenCaptureSession completer should not null");
                        b1 b1Var2 = (b1) this.f13603b;
                        kVar = b1Var2.f13357i;
                        b1Var2.f13357i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((b1) this.f13603b).f13349a) {
                        p118hf.a.j(((b1) this.f13603b).f13357i, "OpenCaptureSession completer should not null");
                        b1 b1Var3 = (b1) this.f13603b;
                        kVar = b1Var3.f13357i;
                        b1Var3.f13357i = null;
                        kVar.b(null);
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((l1) this.f13603b).f13594j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                b1 b1Var = (b1) this.f13603b;
                b1Var.i(cameraCaptureSession);
                b1Var.f(b1Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f13602a) {
            case 0:
                Iterator it = ((ArrayList) this.f13603b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                b1 b1Var = (b1) this.f13603b;
                b1Var.i(cameraCaptureSession);
                b1Var.h(b1Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public C0943n0(List list) {
        this.f13602a = 0;
        this.f13603b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C0945o0)) {
                ((ArrayList) this.f13603b).add(stateCallback);
            }
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }
}
