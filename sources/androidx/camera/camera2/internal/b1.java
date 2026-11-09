package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends a1 implements SynchronizedCaptureSession, SynchronizedCaptureSession.Opener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f13350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f13351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1 f13354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.camera.camera2.internal.compat.g f13355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.concurrent.futures.m f13356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.concurrent.futures.k f13357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.camera.core.impl.utils.futures.b f13358j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13349a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f13359k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13360l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13361m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13362n = false;

    public b1(P0 p3, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar, Handler handler) {
        this.f13350b = p3;
        this.f13351c = handler;
        this.f13352d = iVar;
        this.f13353e = dVar;
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void a(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f13354f);
        this.f13354f.a(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void abortCaptures() {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) this.f13355g.f13400a.f13402a).abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void b(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f13354f);
        this.f13354f.b(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.a1
    public abstract void c(SynchronizedCaptureSession synchronizedCaptureSession);

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.a(list, this.f13352d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.b(captureRequest, this.f13352d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        P0 p3 = this.f13350b;
        synchronized (p3.f13247b) {
            ((LinkedHashSet) p3.f13249d).add(this);
        }
        ((CameraCaptureSession) this.f13355g.f13400a.f13402a).close();
        this.f13352d.execute(new RunnableC0961x(this, 8));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final androidx.camera.camera2.internal.compat.params.r createSessionConfigurationCompat(int i7, List list, a1 a1Var) {
        this.f13354f = a1Var;
        return new androidx.camera.camera2.internal.compat.params.r(i7, list, this.f13352d, new C0943n0(this, 1));
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void d(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f13354f);
        finishClose();
        P0 p3 = this.f13350b;
        p3.f(this);
        synchronized (p3.f13247b) {
            ((LinkedHashSet) p3.f13250e).remove(this);
        }
        this.f13354f.d(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void f(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f13354f);
        this.f13354f.f(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public abstract void finishClose();

    @Override // androidx.camera.camera2.internal.a1
    public final void g(SynchronizedCaptureSession synchronizedCaptureSession) {
        androidx.concurrent.futures.m mVar;
        synchronized (this.f13349a) {
            try {
                if (this.f13362n) {
                    mVar = null;
                } else {
                    this.f13362n = true;
                    p118hf.a.j(this.f13356h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f13356h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mVar != null) {
            mVar.addListener(new RunnableC0934j(9, this, synchronizedCaptureSession), org.chromium.support_lib_boundary.util.b.u());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final CameraDevice getDevice() {
        this.f13355g.getClass();
        return ((CameraCaptureSession) this.f13355g.f13400a.f13402a).getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final Executor getExecutor() {
        return this.f13352d;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final Surface getInputSurface() {
        this.f13355g.getClass();
        return ((CameraCaptureSession) this.f13355g.f13400a.f13402a).getInputSurface();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final a1 getStateCallback() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void h(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.f13354f);
        this.f13354f.h(synchronizedCaptureSession, surface);
    }

    public final void i(CameraCaptureSession cameraCaptureSession) {
        if (this.f13355g == null) {
            this.f13355g = new androidx.camera.camera2.internal.compat.g(cameraCaptureSession, this.f13351c);
        }
    }

    public final boolean j() {
        boolean z3;
        synchronized (this.f13349a) {
            z3 = this.f13356h != null;
        }
        return z3;
    }

    public final void k() {
        synchronized (this.f13349a) {
            try {
                List list = this.f13359k;
                if (list != null) {
                    androidx.camera.core.impl.utils.n.f(list);
                    this.f13359k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public ListenableFuture openCaptureSession(CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.r rVar, List list) throws Throwable {
        Throwable th;
        synchronized (this.f13349a) {
            try {
                try {
                    if (!this.f13361m) {
                        P0 p3 = this.f13350b;
                        synchronized (p3.f13247b) {
                            try {
                                ((LinkedHashSet) p3.f13250e).add(this);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new Q0(this, list, new androidx.camera.camera2.internal.compat.n(cameraDevice, this.f13351c), rVar, 1));
                        this.f13356h = mVarY;
                        B b7 = new B(this);
                        mVarY.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarY, b7), org.chromium.support_lib_boundary.util.b.u());
                        return androidx.camera.core.impl.utils.futures.j.e(this.f13356h);
                    }
                    try {
                        return new androidx.camera.core.impl.utils.futures.l(new CancellationException("Opener is disabled"), 1);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
            throw th;
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int setRepeatingBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.c(list, this.f13352d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.d(captureRequest, this.f13352d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public ListenableFuture startWithDeferrableSurface(List list, long j6) {
        synchronized (this.f13349a) {
            try {
                if (this.f13361m) {
                    return new androidx.camera.core.impl.utils.futures.l(new CancellationException("Opener is disabled"), 1);
                }
                androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(androidx.camera.core.impl.utils.n.z(list, j6, this.f13352d, this.f13353e));
                C0953t c0953t = new C0953t(4, this, list);
                androidx.camera.core.impl.utils.executor.i iVar = this.f13352d;
                bVarA.getClass();
                androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(bVarA, c0953t, iVar);
                this.f13358j = aVarI;
                return androidx.camera.core.impl.utils.futures.j.e(aVarI);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean z3;
        androidx.camera.core.impl.utils.futures.b bVar = null;
        try {
            synchronized (this.f13349a) {
                try {
                    if (!this.f13361m) {
                        androidx.camera.core.impl.utils.futures.b bVar2 = this.f13358j;
                        bVar = bVar2 != null ? bVar2 : null;
                        this.f13361m = true;
                    }
                    z3 = !j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bVar != null) {
                bVar.cancel(true);
            }
            return z3;
        } catch (Throwable th2) {
            if (bVar != null) {
                bVar.cancel(true);
            }
            throw th2;
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void stopRepeating() throws CameraAccessException {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) this.f13355g.f13400a.f13402a).stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final androidx.camera.camera2.internal.compat.g toCameraCaptureSessionCompat() {
        this.f13355g.getClass();
        return this.f13355g;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.a(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.b(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.c(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        p118hf.a.j(this.f13355g, "Need to call openCaptureSession before using this API.");
        return this.f13355g.d(captureRequest, executor, captureCallback);
    }
}
