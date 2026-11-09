package E;

import B6.RunnableC0085g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.C1003s0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends n0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a0 f1984v = new a0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final androidx.camera.core.impl.utils.executor.d f1985w = org.chromium.support_lib_boundary.util.b.S();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Preview$SurfaceProvider f1986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.camera.core.impl.utils.executor.d f1987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0 f1988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j0 f1989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.camera.core.processing.m f1990s;
    public m0 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public D0 f1991u;

    @Override // E.n0
    public final void A(Rect rect) {
        this.f2081i = rect;
        CameraInternal cameraInternalB = b();
        androidx.camera.core.processing.m mVar = this.f1990s;
        if (cameraInternalB == null || mVar == null) {
            return;
        }
        p140j8.f.B(new N8.J(mVar, g(cameraInternalB, l(cameraInternalB)), ((ImageOutputConfig) this.f2078f).getAppTargetRotation(-1), 1));
    }

    public final void D() {
        D0 d1 = this.f1991u;
        if (d1 != null) {
            d1.a();
            this.f1991u = null;
        }
        j0 j0Var = this.f1989r;
        if (j0Var != null) {
            j0Var.a();
            this.f1989r = null;
        }
        androidx.camera.core.processing.m mVar = this.f1990s;
        if (mVar != null) {
            mVar.c();
            this.f1990s = null;
        }
        this.t = null;
    }

    public final void E(Preview$SurfaceProvider preview$SurfaceProvider) {
        p140j8.f.b();
        if (preview$SurfaceProvider == null) {
            this.f1986o = null;
            this.f2075c = 2;
            p();
            return;
        }
        this.f1986o = preview$SurfaceProvider;
        this.f1987p = f1985w;
        C0993n c0993n = this.f2079g;
        if ((c0993n != null ? c0993n.f14108a : null) != null) {
            F((C1003s0) this.f2078f, c0993n);
            o();
        }
        n();
    }

    public final void F(C1003s0 c1003s0, C0993n c0993n) {
        p140j8.f.b();
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        D();
        p118hf.a.k(this.f1990s == null, null);
        Matrix matrix = this.f2082j;
        boolean hasTransform = cameraInternalB.getHasTransform();
        Size size = c0993n.f14108a;
        Rect rect = this.f2081i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        androidx.camera.core.processing.m mVar = new androidx.camera.core.processing.m(1, 34, c0993n, matrix, hasTransform, rect, g(cameraInternalB, l(cameraInternalB)), ((ImageOutputConfig) this.f2078f).getAppTargetRotation(-1), cameraInternalB.getHasTransform() && l(cameraInternalB));
        this.f1990s = mVar;
        mVar.a(new Ae.n(this, 11));
        m0 m0VarD = this.f1990s.d(cameraInternalB, true);
        this.t = m0VarD;
        this.f1989r = m0VarD.f2066l;
        if (this.f1986o != null) {
            CameraInternal cameraInternalB2 = b();
            androidx.camera.core.processing.m mVar2 = this.f1990s;
            if (cameraInternalB2 != null && mVar2 != null) {
                p140j8.f.B(new N8.J(mVar2, g(cameraInternalB2, l(cameraInternalB2)), ((ImageOutputConfig) this.f2078f).getAppTargetRotation(-1), 1));
            }
            Preview$SurfaceProvider preview$SurfaceProvider = this.f1986o;
            preview$SurfaceProvider.getClass();
            m0 m0Var = this.t;
            m0Var.getClass();
            this.f1987p.execute(new RunnableC0085g(10, preview$SurfaceProvider, m0Var));
        }
        C0 c0E = C0.e(c1003s0, c0993n.f14108a);
        androidx.camera.core.impl.S s3 = c0E.f13839b;
        s3.getClass();
        s3.f13956b.insertOption(androidx.camera.core.impl.T.f13965k, c0993n.f14110c);
        int previewStabilizationMode = c1003s0.getPreviewStabilizationMode();
        if (previewStabilizationMode != 0) {
            s3.getClass();
            if (previewStabilizationMode != 0) {
                s3.f13956b.insertOption(UseCaseConfig.f13991W, Integer.valueOf(previewStabilizationMode));
            }
        }
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        if (bVar != null) {
            s3.c(bVar);
        }
        if (this.f1986o != null) {
            c0E.c(this.f1989r, c0993n.f14109b, ((ImageOutputConfig) this.f2078f).getMirrorMode(-1));
        }
        D0 d1 = this.f1991u;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new C0220z(this, 2));
        this.f1991u = d2;
        c0E.f13843f = d2;
        this.f1988q = c0E;
        Object[] objArr = {c0E.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
    }

    @Override // E.n0
    public final UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory) {
        f1984v.getClass();
        C1003s0 c1003s0 = a0.f1980a;
        Config config = useCaseConfigFactory.getConfig(c1003s0.getCaptureType(), 1);
        if (z3) {
            config = Config.mergeConfigs(config, c1003s0);
        }
        if (config == null) {
            return null;
        }
        return new C1003s0(C1000q0.a(((Z) k(config)).f1976a));
    }

    @Override // E.n0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // E.n0
    public final UseCaseConfig.Builder k(Config config) {
        return new Z(C0992m0.c(config));
    }

    @Override // E.n0
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, 34);
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // E.n0
    public final C0993n v(androidx.camera.camera2.impl.b bVar) {
        this.f1988q.b(bVar);
        Object[] objArr = {this.f1988q.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        C0991m c0991mA = this.f2079g.a();
        c0991mA.f14105d = bVar;
        return c0991mA.a();
    }

    @Override // E.n0
    public final C0993n w(C0993n c0993n, C0993n c0993n2) {
        F((C1003s0) this.f2078f, c0993n);
        return c0993n;
    }

    @Override // E.n0
    public final void x() {
        D();
    }
}
