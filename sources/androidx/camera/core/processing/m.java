package androidx.camera.core.processing;

import E.C0205j;
import E.f0;
import E.j0;
import E.m0;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest$TransformationInfoListener;
import androidx.camera.core.impl.C0968a0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f14427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f14429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0993n f14432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14434i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m0 f14436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f14437l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14435j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f14438m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14439n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f14440o = new ArrayList();

    public m(int i7, int i10, C0993n c0993n, Matrix matrix, boolean z3, Rect rect, int i11, int i12, boolean z8) {
        this.f14431f = i7;
        this.f14426a = i10;
        this.f14432g = c0993n;
        this.f14427b = matrix;
        this.f14428c = z3;
        this.f14429d = rect;
        this.f14434i = i11;
        this.f14433h = i12;
        this.f14430e = z8;
        this.f14437l = new l(c0993n.f14108a, i10);
    }

    public final void a(Runnable runnable) {
        p140j8.f.b();
        b();
        this.f14438m.add(runnable);
    }

    public final void b() {
        p118hf.a.k(!this.f14439n, "Edge is already closed.");
    }

    public final void c() {
        p140j8.f.b();
        this.f14437l.a();
        this.f14439n = true;
    }

    public final m0 d(CameraInternal cameraInternal, boolean z3) {
        p140j8.f.b();
        b();
        C0993n c0993n = this.f14432g;
        m0 m0Var = new m0(c0993n.f14108a, cameraInternal, z3, c0993n.f14109b, c0993n.f14110c, new i(this, 0));
        try {
            j0 j0Var = m0Var.f2066l;
            l lVar = this.f14437l;
            Objects.requireNonNull(lVar);
            if (lVar.g(j0Var, new j(lVar, 0))) {
                androidx.camera.core.impl.utils.futures.j.e(lVar.f14025e).addListener(new W8.o(j0Var, 18), org.chromium.support_lib_boundary.util.b.u());
            }
            this.f14436k = m0Var;
            f();
            return m0Var;
        } catch (C0968a0 e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            m0Var.d();
            throw e11;
        }
    }

    public final void e() {
        boolean z3;
        p140j8.f.b();
        b();
        l lVar = this.f14437l;
        lVar.getClass();
        p140j8.f.b();
        if (lVar.f14424q == null) {
            synchronized (lVar.f14021a) {
                z3 = lVar.f14023c;
            }
            if (!z3) {
                return;
            }
        }
        this.f14435j = false;
        this.f14437l.a();
        this.f14437l = new l(this.f14432g.f14108a, this.f14426a);
        Iterator it = this.f14438m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        SurfaceRequest$TransformationInfoListener surfaceRequest$TransformationInfoListener;
        Executor executor;
        p140j8.f.b();
        C0205j c0205j = new C0205j(this.f14429d, this.f14434i, this.f14433h, this.f14428c, this.f14427b, this.f14430e);
        m0 m0Var = this.f14436k;
        if (m0Var != null) {
            synchronized (m0Var.f2055a) {
                m0Var.f2067m = c0205j;
                surfaceRequest$TransformationInfoListener = m0Var.f2068n;
                executor = m0Var.f2069o;
            }
            if (surfaceRequest$TransformationInfoListener != null && executor != null) {
                executor.execute(new f0(surfaceRequest$TransformationInfoListener, c0205j, 0));
            }
        }
        Iterator it = this.f14440o.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(c0205j);
        }
    }
}
