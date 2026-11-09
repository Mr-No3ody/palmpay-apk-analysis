package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0960w0 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13667b;

    public C0960w0(List list, int i7) {
        this.f13666a = i7;
        switch (i7) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f13667b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.f13667b = list.isEmpty() ? new C0945o0() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C0943n0(list);
                break;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public void a(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onActive((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).a(synchronizedCaptureSession);
                }
                break;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public void b(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onCaptureQueueEmpty((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).b(synchronizedCaptureSession);
                }
                break;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public void c(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onClosed((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).c(synchronizedCaptureSession);
                }
                break;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void d(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 0:
                synchronized (((C0962x0) this.f13667b).f13670a) {
                    try {
                        switch (F.i(((C0962x0) this.f13667b).f13678i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(F.k(((C0962x0) this.f13667b).f13678i)));
                            case 3:
                            case 5:
                            case 6:
                                ((C0962x0) this.f13667b).d();
                                break;
                            case 7:
                                p140j8.f.G("CaptureSession");
                                break;
                        }
                        p140j8.f.g("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(F.k(((C0962x0) this.f13667b).f13678i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onConfigureFailed((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                return;
            default:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).d(synchronizedCaptureSession);
                }
                return;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void e(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 0:
                synchronized (((C0962x0) this.f13667b).f13670a) {
                    try {
                        switch (F.i(((C0962x0) this.f13667b).f13678i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(F.k(((C0962x0) this.f13667b).f13678i)));
                            case 3:
                                C0962x0 c0962x0 = (C0962x0) this.f13667b;
                                c0962x0.f13678i = 5;
                                c0962x0.f13674e = synchronizedCaptureSession;
                                p140j8.f.G("CaptureSession");
                                C0962x0 c0962x1 = (C0962x0) this.f13667b;
                                c0962x1.h(c0962x1.f13675f);
                                C0962x0 c0962x2 = (C0962x0) this.f13667b;
                                c0962x2.f13684o.c().addListener(new RunnableC0961x(c0962x2, 4), org.chromium.support_lib_boundary.util.b.u());
                                break;
                            case 5:
                                ((C0962x0) this.f13667b).f13674e = synchronizedCaptureSession;
                                break;
                            case 6:
                                synchronizedCaptureSession.close();
                                break;
                        }
                        int i7 = ((C0962x0) this.f13667b).f13678i;
                        p140j8.f.G("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onConfigured((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                return;
            default:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).e(synchronizedCaptureSession);
                }
                return;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void f(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 0:
                synchronized (((C0962x0) this.f13667b).f13670a) {
                    try {
                        if (F.i(((C0962x0) this.f13667b).f13678i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(F.k(((C0962x0) this.f13667b).f13678i)));
                        }
                        int i7 = ((C0962x0) this.f13667b).f13678i;
                        p140j8.f.G("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onReady((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a);
                return;
            default:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).f(synchronizedCaptureSession);
                }
                return;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void g(SynchronizedCaptureSession synchronizedCaptureSession) {
        switch (this.f13666a) {
            case 0:
                synchronized (((C0962x0) this.f13667b).f13670a) {
                    try {
                        if (((C0962x0) this.f13667b).f13678i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(F.k(((C0962x0) this.f13667b).f13678i)));
                        }
                        p140j8.f.G("CaptureSession");
                        ((C0962x0) this.f13667b).d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).g(synchronizedCaptureSession);
                }
                return;
        }
    }

    @Override // androidx.camera.camera2.internal.a1
    public void h(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        switch (this.f13666a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f13667b).onSurfacePrepared((CameraCaptureSession) synchronizedCaptureSession.toCameraCaptureSessionCompat().f13400a.f13402a, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f13667b).iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).h(synchronizedCaptureSession, surface);
                }
                break;
        }
    }

    public C0960w0(C0962x0 c0962x0) {
        this.f13666a = 0;
        this.f13667b = c0962x0;
    }

    private final void i(SynchronizedCaptureSession synchronizedCaptureSession) {
    }
}
