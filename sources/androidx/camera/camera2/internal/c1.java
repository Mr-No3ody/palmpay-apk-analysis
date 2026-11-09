package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.AbstractC0970b0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends b1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f13372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f13373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.camera.core.impl.utils.futures.m f13374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.workaround.a f13375s;
    public final C2085k0 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C9.N f13376u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final E.N f13377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f13378w;

    public c1(Handler handler, P0 p3, androidx.camera.core.impl.y0 y0Var, androidx.camera.core.impl.y0 y0Var2, androidx.camera.core.impl.utils.executor.d dVar, androidx.camera.core.impl.utils.executor.i iVar) {
        super(p3, iVar, dVar, handler);
        this.f13372p = new Object();
        this.f13378w = new AtomicBoolean(false);
        androidx.camera.camera2.internal.compat.workaround.a aVar = new androidx.camera.camera2.internal.compat.workaround.a();
        aVar.f13484a = y0Var2.a(TextureViewIsClosedQuirk.class);
        aVar.f13485b = y0Var.a(PreviewOrientationIncorrectQuirk.class);
        aVar.f13486c = y0Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f13375s = aVar;
        this.f13376u = new C9.N(y0Var.a(CaptureSessionStuckQuirk.class) || y0Var.a(IncorrectCaptureStateQuirk.class));
        this.t = new C2085k0(y0Var2);
        this.f13377v = new E.N(y0Var2, 2);
        this.f13371o = dVar;
    }

    public static ListenableFuture l(c1 c1Var, CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.r rVar, List list) {
        if (c1Var.f13377v.f1938b) {
            Iterator it = c1Var.f13350b.g().iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).close();
            }
        }
        n();
        return super.openCaptureSession(cameraDevice, rVar, list);
    }

    public static /* synthetic */ void m(c1 c1Var) {
        n();
        super.close();
    }

    public static void n() {
        p140j8.f.G("SyncCaptureSessionImpl");
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.a1
    public final void c(SynchronizedCaptureSession synchronizedCaptureSession) {
        androidx.concurrent.futures.m mVar;
        synchronized (this.f13372p) {
            this.f13375s.b(this.f13373q);
        }
        n();
        synchronized (this.f13349a) {
            try {
                if (this.f13360l) {
                    mVar = null;
                } else {
                    this.f13360l = true;
                    p118hf.a.j(this.f13356h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f13356h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        finishClose();
        if (mVar != null) {
            mVar.addListener(new RunnableC0934j(8, this, synchronizedCaptureSession), org.chromium.support_lib_boundary.util.b.u());
        }
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int captureBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.captureBurstRequests(list, this.f13376u.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void close() {
        if (!this.f13378w.compareAndSet(false, true)) {
            n();
            return;
        }
        if (this.f13377v.f1938b) {
            try {
                n();
                abortCaptures();
            } catch (Exception e10) {
                e10.toString();
                n();
            }
        }
        n();
        this.f13376u.c().addListener(new RunnableC0961x(this, 9), this.f13352d);
    }

    @Override // androidx.camera.camera2.internal.a1
    public final void e(SynchronizedCaptureSession synchronizedCaptureSession) {
        ArrayList arrayList;
        SynchronizedCaptureSession synchronizedCaptureSession2;
        SynchronizedCaptureSession synchronizedCaptureSession3;
        n();
        C2085k0 c2085k0 = this.t;
        P0 p3 = this.f13350b;
        synchronized (p3.f13247b) {
            arrayList = new ArrayList((LinkedHashSet) p3.f13250e);
        }
        ArrayList arrayListG = this.f13350b.g();
        if (((CaptureSessionOnClosedNotCalledQuirk) c2085k0.f42878b) != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (synchronizedCaptureSession3 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(synchronizedCaptureSession3);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession4 : linkedHashSet) {
                synchronizedCaptureSession4.getStateCallback().d(synchronizedCaptureSession4);
            }
        }
        Objects.requireNonNull(this.f13354f);
        P0 p10 = this.f13350b;
        synchronized (p10.f13247b) {
            ((LinkedHashSet) p10.f13248c).add(this);
            ((LinkedHashSet) p10.f13250e).remove(this);
        }
        p10.f(this);
        this.f13354f.e(synchronizedCaptureSession);
        if (((CaptureSessionOnClosedNotCalledQuirk) c2085k0.f42878b) != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayListG.iterator();
            while (it2.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(synchronizedCaptureSession2);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession5 : linkedHashSet2) {
                synchronizedCaptureSession5.getStateCallback().c(synchronizedCaptureSession5);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void finishClose() {
        k();
        this.f13376u.n();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final ListenableFuture getOpeningBlocker() {
        return AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c(this.f13376u.c(), this.f13371o, 1500L, 0));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void onCameraDeviceError(int i7) {
        if (i7 == 5) {
            synchronized (this.f13372p) {
                try {
                    if (j() && this.f13373q != null) {
                        n();
                        Iterator it = this.f13373q.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0970b0) it.next()).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final ListenableFuture openCaptureSession(CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.r rVar, List list) {
        ListenableFuture listenableFutureE;
        synchronized (this.f13372p) {
            try {
                ArrayList arrayListG = this.f13350b.g();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SynchronizedCaptureSession) it.next()).getOpeningBlocker());
                }
                androidx.camera.core.impl.utils.futures.m mVarH = androidx.camera.core.impl.utils.futures.j.h(arrayList);
                this.f13374r = mVarH;
                androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(mVarH);
                Q0 q10 = new Q0(this, cameraDevice, rVar, list);
                androidx.camera.core.impl.utils.executor.i iVar = this.f13352d;
                bVarA.getClass();
                listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(androidx.camera.core.impl.utils.futures.j.i(bVarA, q10, iVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return listenableFutureE;
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, this.f13376u.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final ListenableFuture startWithDeferrableSurface(List list, long j6) {
        ListenableFuture listenableFutureStartWithDeferrableSurface;
        synchronized (this.f13372p) {
            this.f13373q = list;
            listenableFutureStartWithDeferrableSurface = super.startWithDeferrableSurface(list, j6);
        }
        return listenableFutureStartWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.b1, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final boolean stop() {
        boolean zStop;
        synchronized (this.f13372p) {
            try {
                if (j()) {
                    this.f13375s.b(this.f13373q);
                } else {
                    androidx.camera.core.impl.utils.futures.m mVar = this.f13374r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
