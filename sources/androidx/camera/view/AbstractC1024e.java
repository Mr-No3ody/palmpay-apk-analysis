package androidx.camera.view;

import E.C0211p;
import E.C0216v;
import E.K;
import E.L;
import E.P;
import E.Z;
import E.b0;
import E.q0;
import android.content.Context;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Camera;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.video.C1014c;
import androidx.camera.video.C1016e;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import p310ub.C2085k0;

/* JADX INFO: renamed from: androidx.camera.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1024e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C1022c f14921C = new C1022c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final HashSet f14922A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashMap f14923B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0211p f14924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f14926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f14927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f14928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageAnalysis$Analyzer f14929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E.C f14930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.video.C f14931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.d f14932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0216v f14933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0216v f14934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Range f14935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Camera f14936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProcessCameraProviderWrapper f14937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q0 f14938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Preview$SurfaceProvider f14939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.camera.video.internal.c f14940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1021b f14941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f14942s;
    public final boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1026g f14943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1026g f14944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.F f14945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1023d f14946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1023d f14947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1023d f14948z;

    public AbstractC1024e(Context context) {
        ListenableFuture<androidx.camera.lifecycle.h> fVar = androidx.camera.lifecycle.h.f14527i.getInstance(context);
        K k2 = new K(3);
        androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(fVar, new C2085k0(k2, 13), org.chromium.support_lib_boundary.util.b.u());
        this.f14924a = C0211p.f2092c;
        this.f14925b = 3;
        new HashMap();
        this.f14932i = androidx.camera.video.s.f14827G;
        C0216v c0216v = C0216v.f2121c;
        this.f14933j = c0216v;
        this.f14934k = c0216v;
        this.f14935l = C0993n.f14107f;
        this.f14942s = true;
        this.t = true;
        this.f14943u = new C1026g();
        this.f14944v = new C1026g();
        this.f14945w = new androidx.lifecycle.F(0);
        this.f14946x = new C1023d();
        this.f14947y = new C1023d();
        this.f14948z = new C1023d();
        this.f14922A = new HashSet();
        this.f14923B = new HashMap();
        Context contextR = com.palmpay.lib.apm.launchcounter.util.d.r(context);
        Z z3 = new Z();
        c(z3);
        C0216v c0216v2 = this.f14934k;
        z3.f1976a.insertOption(ImageInputConfig.f13898s, c0216v2);
        this.f14926c = z3.build();
        L l5 = new L();
        c(l5);
        this.f14927d = l5.build();
        this.f14930g = d(null, null, null);
        this.f14931h = e();
        C1027h c1027h = (C1027h) this;
        C1020a c1020a = new C1020a(c1027h, 0);
        androidx.camera.core.impl.utils.futures.j.i(aVarI, new C2085k0(c1020a, 13), org.chromium.support_lib_boundary.util.b.S());
        this.f14940q = new androidx.camera.video.internal.c(contextR, 3);
        this.f14941r = new C1021b(c1027h);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public final void a(Preview$SurfaceProvider preview$SurfaceProvider, q0 q0Var) {
        boolean z3;
        p140j8.f.b();
        if (this.f14939p != preview$SurfaceProvider) {
            this.f14939p = preview$SurfaceProvider;
            this.f14926c.E(preview$SurfaceProvider);
        }
        if (this.f14938o == null) {
            z3 = true;
        } else {
            int iG = g(q0Var);
            I.a aVar = iG != -1 ? new I.a(iG) : null;
            int iG2 = g(this.f14938o);
            if (aVar != (iG2 != -1 ? new I.a(iG2) : null)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f14938o = q0Var;
        androidx.camera.video.internal.c cVar = this.f14940q;
        androidx.camera.core.impl.utils.executor.d dVarS = org.chromium.support_lib_boundary.util.b.S();
        C1021b c1021b = this.f14941r;
        synchronized (cVar.f14621b) {
            try {
                if (((v) cVar.f14623d).canDetectOrientation()) {
                    ((HashMap) cVar.f14622c).put(c1021b, new w(c1021b, dVarS));
                    ((v) cVar.f14623d).enable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            o();
        }
        n(null);
    }

    public final void b() {
        p140j8.f.b();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.f14937n;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbind(this.f14926c, this.f14927d, this.f14930g, this.f14931h);
        }
        this.f14926c.E(null);
        this.f14936m = null;
        this.f14939p = null;
        this.f14938o = null;
        androidx.camera.video.internal.c cVar = this.f14940q;
        C1021b c1021b = this.f14941r;
        synchronized (cVar.f14621b) {
            try {
                w wVar = (w) ((HashMap) cVar.f14622c).get(c1021b);
                if (wVar != null) {
                    wVar.f15018c.set(false);
                    ((HashMap) cVar.f14622c).remove(c1021b);
                }
                if (((HashMap) cVar.f14622c).isEmpty()) {
                    ((v) cVar.f14623d).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ImageOutputConfig.Builder builder) {
        q0 q0Var = this.f14938o;
        if (q0Var != null) {
            int iG = g(q0Var);
            I.a aVar = iG != -1 ? new I.a(iG) : null;
            if (aVar != null) {
                builder.setResolutionSelector(new I.b(aVar, null, null));
            }
        }
    }

    public final E.C d(Integer num, Integer num2, Integer num3) {
        E.A a3 = new E.A();
        C0992m0 c0992m0 = a3.f1886a;
        if (num != null) {
            c0992m0.insertOption(C0980g0.f14059b, num);
        }
        if (num2 != null) {
            c0992m0.insertOption(C0980g0.f14060c, num2);
        }
        if (num3 != null) {
            c0992m0.insertOption(C0980g0.f14062e, num3);
        }
        c(a3);
        return a3.build();
    }

    public final androidx.camera.video.C e() {
        int iG;
        B8.d dVar = androidx.camera.video.s.f14830J;
        C1014c c1014cA = C1014c.a().a();
        androidx.camera.video.j jVarA = androidx.camera.video.j.a().a();
        p1.d dVar2 = this.f14932i;
        p118hf.a.j(dVar2, "The specified quality selector can't be null.");
        androidx.camera.video.i iVar = new androidx.camera.video.i();
        iVar.f14603a = jVarA.f14785a;
        iVar.f14604b = jVarA.f14786b;
        iVar.f14605c = jVarA.f14787c;
        iVar.f14606d = Integer.valueOf(jVarA.f14788d);
        iVar.f14603a = dVar2;
        androidx.camera.video.j jVarA2 = iVar.a();
        q0 q0Var = this.f14938o;
        if (q0Var != null && dVar2 == androidx.camera.video.s.f14827G && (iG = g(q0Var)) != -1) {
            androidx.camera.video.i iVar2 = new androidx.camera.video.i();
            iVar2.f14603a = jVarA2.f14785a;
            iVar2.f14604b = jVarA2.f14786b;
            iVar2.f14605c = jVarA2.f14787c;
            iVar2.f14606d = Integer.valueOf(jVarA2.f14788d);
            iVar2.f14606d = Integer.valueOf(iG);
            jVarA2 = iVar2.a();
        }
        androidx.camera.video.y yVar = new androidx.camera.video.y(new androidx.camera.video.s(new C1016e(jVarA2, c1014cA, -1), dVar, dVar));
        C0971c c0971c = UseCaseConfig.f13987S;
        Range range = this.f14935l;
        C0992m0 c0992m0 = yVar.f14871a;
        c0992m0.insertOption(c0971c, range);
        c0992m0.insertOption(ImageOutputConfig.f13908z, 0);
        c0992m0.insertOption(ImageInputConfig.f13898s, this.f14933j);
        return new androidx.camera.video.C(new androidx.camera.video.impl.a(C1000q0.a(c0992m0)));
    }

    public final androidx.camera.view.internal.b f() {
        androidx.camera.view.internal.a aVar = androidx.camera.view.internal.a.f14975b;
        HashMap map = this.f14923B;
        if (map.get(aVar) != null) {
            return (androidx.camera.view.internal.b) map.get(aVar);
        }
        androidx.camera.view.internal.a aVar2 = androidx.camera.view.internal.a.f14974a;
        if (map.get(aVar2) != null) {
            return (androidx.camera.view.internal.b) map.get(aVar2);
        }
        return null;
    }

    public final int g(q0 q0Var) {
        int iV = q0Var == null ? 0 : com.facebook.imagepipeline.nativecode.b.V(q0Var.f2099c);
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.f14937n;
        int sensorRotationDegrees = processCameraProviderWrapper == null ? 0 : processCameraProviderWrapper.getCameraInfo(this.f14924a).getSensorRotationDegrees();
        ProcessCameraProviderWrapper processCameraProviderWrapper2 = this.f14937n;
        int iV2 = com.facebook.imagepipeline.nativecode.b.v(iV, sensorRotationDegrees, processCameraProviderWrapper2 == null || processCameraProviderWrapper2.getCameraInfo(this.f14924a).getLensFacing() == 1);
        Rational rational = q0Var.f2098b;
        if (iV2 == 90 || iV2 == 270) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(new Rational(4, 3))) {
            return 0;
        }
        return rational.equals(new Rational(16, 9)) ? 1 : -1;
    }

    public final boolean h() {
        return this.f14936m != null;
    }

    public final boolean i() {
        return this.f14937n != null;
    }

    public final void j(C0211p c0211p) {
        p140j8.f.b();
        if (this.f14924a == c0211p) {
            return;
        }
        Integer numB = c0211p.b();
        if (this.f14927d.F() == 3 && numB != null && numB.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        C0211p c0211p2 = this.f14924a;
        this.f14924a = c0211p;
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.f14937n;
        if (processCameraProviderWrapper == null) {
            return;
        }
        processCameraProviderWrapper.unbind(this.f14926c, this.f14927d, this.f14930g, this.f14931h);
        n(new androidx.camera.video.internal.encoder.o(8, (C1027h) this, c0211p2));
    }

    public final void k(Executor executor, ImageAnalysis$Analyzer imageAnalysis$Analyzer) {
        p140j8.f.b();
        ImageAnalysis$Analyzer imageAnalysis$Analyzer2 = this.f14929f;
        if (imageAnalysis$Analyzer2 == imageAnalysis$Analyzer && this.f14928e == executor) {
            return;
        }
        this.f14928e = executor;
        this.f14929f = imageAnalysis$Analyzer;
        this.f14930g.G(executor, imageAnalysis$Analyzer);
        if (Objects.equals(imageAnalysis$Analyzer2 == null ? null : imageAnalysis$Analyzer2.getDefaultTargetResolution(), imageAnalysis$Analyzer.getDefaultTargetResolution())) {
            return;
        }
        Integer num = (Integer) ((C0980g0) this.f14930g.f2078f).retrieveOption(C0980g0.f14059b, 0);
        num.intValue();
        p(num, Integer.valueOf(this.f14930g.E()), Integer.valueOf(this.f14930g.F()));
        n(null);
    }

    public final ListenableFuture l(float f10) {
        p140j8.f.b();
        if (h()) {
            return this.f14936m.getCameraControl().setZoomRatio(f10);
        }
        return this.f14948z.a(Float.valueOf(f10));
    }

    public abstract Camera m();

    public final void n(androidx.camera.video.internal.encoder.o oVar) {
        androidx.lifecycle.C c6;
        androidx.lifecycle.C c10;
        try {
            this.f14936m = m();
            if (!h()) {
                p140j8.f.G("CameraController");
                return;
            }
            androidx.lifecycle.B zoomState = this.f14936m.getCameraInfo().getZoomState();
            final C1026g c1026g = this.f14943u;
            androidx.lifecycle.B b7 = c1026g.f14950m;
            if (b7 != null && (c10 = (androidx.lifecycle.C) c1026g.f17342l.c(b7)) != null) {
                c10.f17338a.j(c10);
            }
            c1026g.f14950m = zoomState;
            c1026g.l(zoomState, new Observer() { // from class: androidx.camera.view.f
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    c1026g.k(obj);
                }
            });
            androidx.lifecycle.B torchState = this.f14936m.getCameraInfo().getTorchState();
            final C1026g c1026g2 = this.f14944v;
            androidx.lifecycle.B b10 = c1026g2.f14950m;
            if (b10 != null && (c6 = (androidx.lifecycle.C) c1026g2.f17342l.c(b10)) != null) {
                c6.f17338a.j(c6);
            }
            c1026g2.f14950m = torchState;
            c1026g2.l(torchState, new Observer() { // from class: androidx.camera.view.f
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    c1026g2.k(obj);
                }
            });
            C1023d c1023d = this.f14946x;
            c1023d.getClass();
            p140j8.f.b();
            p058e0.a aVar = (p058e0.a) c1023d.f14920a;
            if (aVar != null) {
                Boolean bool = (Boolean) aVar.f35984b;
                boolean zBooleanValue = bool.booleanValue();
                p140j8.f.b();
                ListenableFuture<Void> listenableFutureA = !h() ? c1023d.a(bool) : this.f14936m.getCameraControl().enableTorch(zBooleanValue);
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) ((p058e0.a) c1023d.f14920a).f35983a;
                Objects.requireNonNull(kVar);
                androidx.camera.core.impl.utils.futures.j.f(listenableFutureA, kVar);
                c1023d.f14920a = null;
            }
            C1023d c1023d2 = this.f14947y;
            c1023d2.getClass();
            p140j8.f.b();
            p058e0.a aVar2 = (p058e0.a) c1023d2.f14920a;
            if (aVar2 != null) {
                Float f10 = (Float) aVar2.f35984b;
                float fFloatValue = f10.floatValue();
                p140j8.f.b();
                ListenableFuture<Void> listenableFutureA2 = !h() ? c1023d2.a(f10) : this.f14936m.getCameraControl().setLinearZoom(fFloatValue);
                androidx.concurrent.futures.k kVar2 = (androidx.concurrent.futures.k) ((p058e0.a) c1023d2.f14920a).f35983a;
                Objects.requireNonNull(kVar2);
                androidx.camera.core.impl.utils.futures.j.f(listenableFutureA2, kVar2);
                c1023d2.f14920a = null;
            }
            C1023d c1023d3 = this.f14948z;
            c1023d3.getClass();
            p140j8.f.b();
            p058e0.a aVar3 = (p058e0.a) c1023d3.f14920a;
            if (aVar3 != null) {
                ListenableFuture listenableFutureL = l(((Float) aVar3.f35984b).floatValue());
                androidx.concurrent.futures.k kVar3 = (androidx.concurrent.futures.k) ((p058e0.a) c1023d3.f14920a).f35983a;
                Objects.requireNonNull(kVar3);
                androidx.camera.core.impl.utils.futures.j.f(listenableFutureL, kVar3);
                c1023d3.f14920a = null;
            }
        } catch (RuntimeException e10) {
            if (oVar != null) {
                oVar.run();
            }
            throw e10;
        }
    }

    public final void o() {
        if (i()) {
            this.f14937n.unbind(this.f14926c);
        }
        Z z3 = new Z();
        c(z3);
        z3.f1976a.insertOption(ImageInputConfig.f13898s, this.f14934k);
        b0 b0VarA = z3.build();
        this.f14926c = b0VarA;
        Preview$SurfaceProvider preview$SurfaceProvider = this.f14939p;
        if (preview$SurfaceProvider != null) {
            b0VarA.E(preview$SurfaceProvider);
        }
        p140j8.f.b();
        Integer numValueOf = Integer.valueOf(this.f14927d.f1941o);
        if (i()) {
            this.f14937n.unbind(this.f14927d);
        }
        int iF = this.f14927d.F();
        L l5 = new L();
        l5.f1935a.insertOption(C0982h0.f14069b, numValueOf);
        c(l5);
        this.f14927d = l5.build();
        p140j8.f.b();
        if (iF == 3) {
            Integer numB = this.f14924a.b();
            if (numB != null && numB.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            q();
        }
        this.f14927d.H(iF);
        Integer num = (Integer) ((C0980g0) this.f14930g.f2078f).retrieveOption(C0980g0.f14059b, 0);
        num.intValue();
        p(num, Integer.valueOf(this.f14930g.E()), Integer.valueOf(this.f14930g.F()));
        if (i()) {
            this.f14937n.unbind(this.f14931h);
        }
        this.f14931h = e();
    }

    public final void p(Integer num, Integer num2, Integer num3) {
        ImageAnalysis$Analyzer imageAnalysis$Analyzer;
        p140j8.f.b();
        if (i()) {
            this.f14937n.unbind(this.f14930g);
        }
        E.C cD = d(num, num2, num3);
        this.f14930g = cD;
        Executor executor = this.f14928e;
        if (executor == null || (imageAnalysis$Analyzer = this.f14929f) == null) {
            return;
        }
        cD.G(executor, imageAnalysis$Analyzer);
    }

    public final void q() {
        androidx.camera.view.internal.b bVarF = f();
        if (bVarF == null) {
            p140j8.f.G("CameraController");
            P p3 = this.f14927d;
            C1022c c1022c = f14921C;
            p3.getClass();
            androidx.camera.core.internal.i iVarFrom = androidx.camera.core.internal.i.f14348e.from(c1022c);
            p3.t = iVarFrom;
            p3.c().setScreenFlash(iVarFrom);
            return;
        }
        P p10 = this.f14927d;
        p10.getClass();
        androidx.camera.core.internal.i iVarFrom2 = androidx.camera.core.internal.i.f14348e.from(bVarF.f14978b);
        p10.t = iVarFrom2;
        p10.c().setScreenFlash(iVarFrom2);
        bVarF.f14977a.name();
        p140j8.f.G("CameraController");
    }
}
