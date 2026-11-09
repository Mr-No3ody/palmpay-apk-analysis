package E;

import B6.RunnableC0085g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class C extends n0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final B f1888u = new B();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f1889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f1890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageAnalysis$Analyzer f1891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0 f1892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j0 f1893s;
    public D0 t;

    public C(C0980g0 c0980g0) {
        super(c0980g0);
        this.f1890p = new Object();
        if (((Integer) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14059b, 0)).intValue() == 1) {
            this.f1889o = new G();
        } else {
            this.f1889o = new J(c0980g0.getBackgroundExecutor(org.chromium.support_lib_boundary.util.b.H()));
        }
        this.f1889o.f1916d = F();
        this.f1889o.f1917e = ((Boolean) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14064g, Boolean.FALSE)).booleanValue();
    }

    @Override // E.n0
    public final void A(Rect rect) {
        this.f2081i = rect;
        F f10 = this.f1889o;
        synchronized (f10.f1911H) {
            f10.f1922o = rect;
            f10.f1923p = new Rect(f10.f1922o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public final C0 D(C0980g0 c0980g0, C0993n c0993n) {
        boolean z3;
        p140j8.f.b();
        Size size = c0993n.f14108a;
        Executor backgroundExecutor = c0980g0.getBackgroundExecutor(org.chromium.support_lib_boundary.util.b.H());
        backgroundExecutor.getClass();
        boolean z8 = true;
        int iE = ((Integer) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14059b, 0)).intValue() == 1 ? E() : 4;
        C0971c c0971c = C0980g0.f14061d;
        d0 d0Var = ((ImageReaderProxyProvider) c0980g0.retrieveOption(c0971c, null)) != null ? new d0(((ImageReaderProxyProvider) c0980g0.retrieveOption(c0971c, null)).newInstance(size.getWidth(), size.getHeight(), this.f2078f.getInputFormat(), iE, 0L)) : new d0(io.fastkv.n.e(size.getWidth(), size.getHeight(), this.f2078f.getInputFormat(), iE));
        if (b() != null) {
            CameraInternal cameraInternalB = b();
            if (!((Boolean) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14064g, Boolean.FALSE)).booleanValue() || g(cameraInternalB, false) % 180 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        int height = z3 ? size.getHeight() : size.getWidth();
        int width = z3 ? size.getWidth() : size.getHeight();
        int i7 = F() == 2 ? 1 : 35;
        boolean z10 = this.f2078f.getInputFormat() == 35 && F() == 2;
        if (this.f2078f.getInputFormat() != 35 || ((b() == null || g(b(), false) == 0) && !Boolean.TRUE.equals((Boolean) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14063f, null)))) {
            z8 = false;
        }
        d0 d0Var2 = (z10 || z8) ? new d0(io.fastkv.n.e(height, width, i7, d0Var.getMaxImages())) : null;
        if (d0Var2 != null) {
            F f10 = this.f1889o;
            synchronized (f10.f1911H) {
                f10.f1920i = d0Var2;
            }
        }
        CameraInternal cameraInternalB2 = b();
        if (cameraInternalB2 != null) {
            this.f1889o.f1914b = g(cameraInternalB2, false);
        }
        d0Var.setOnImageAvailableListener(this.f1889o, backgroundExecutor);
        C0 c0E = C0.e(c0980g0, c0993n.f14108a);
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        if (bVar != null) {
            c0E.f13839b.c(bVar);
        }
        j0 j0Var = this.f1893s;
        if (j0Var != null) {
            j0Var.a();
        }
        j0 j0Var2 = new j0(d0Var.getSurface(), size, this.f2078f.getInputFormat());
        this.f1893s = j0Var2;
        androidx.camera.core.impl.utils.futures.j.e(j0Var2.f14025e).addListener(new RunnableC0085g(8, d0Var, d0Var2), org.chromium.support_lib_boundary.util.b.S());
        Range range = c0993n.f14110c;
        androidx.camera.core.impl.S s3 = c0E.f13839b;
        s3.getClass();
        s3.f13956b.insertOption(androidx.camera.core.impl.T.f13965k, range);
        c0E.c(this.f1893s, c0993n.f14109b, -1);
        D0 d1 = this.t;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new C0220z(this, 0));
        this.t = d2;
        c0E.f13843f = d2;
        return c0E;
    }

    public final int E() {
        return ((Integer) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14060c, 6)).intValue();
    }

    public final int F() {
        return ((Integer) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14062e, 1)).intValue();
    }

    public final void G(Executor executor, ImageAnalysis$Analyzer imageAnalysis$Analyzer) {
        synchronized (this.f1890p) {
            try {
                F f10 = this.f1889o;
                Dg.a aVar = new Dg.a(imageAnalysis$Analyzer, 3);
                synchronized (f10.f1911H) {
                    f10.f1913a = aVar;
                    f10.f1919g = executor;
                }
                if (this.f1891q == null) {
                    n();
                }
                this.f1891q = imageAnalysis$Analyzer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.n0
    public final UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory) {
        f1888u.getClass();
        C0980g0 c0980g0 = B.f1887a;
        Config config = useCaseConfigFactory.getConfig(c0980g0.getCaptureType(), 1);
        if (z3) {
            config = Config.mergeConfigs(config, c0980g0);
        }
        if (config == null) {
            return null;
        }
        return new C0980g0(C1000q0.a(((A) k(config)).f1886a));
    }

    @Override // E.n0
    public final UseCaseConfig.Builder k(Config config) {
        return new A(C0992m0.c(config));
    }

    @Override // E.n0
    public final void q() {
        this.f1889o.f1912L = true;
    }

    @Override // E.n0
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        Size defaultTargetResolution;
        top.zibin.luban.io.a aVarD;
        Boolean bool = (Boolean) ((C0980g0) this.f2078f).retrieveOption(C0980g0.f14063f, null);
        boolean zA = cameraInfoInternal.getCameraQuirks().a(OnePixelShiftQuirk.class);
        F f10 = this.f1889o;
        if (bool != null) {
            zA = bool.booleanValue();
        }
        f10.f1918f = zA;
        synchronized (this.f1890p) {
            try {
                ImageAnalysis$Analyzer imageAnalysis$Analyzer = this.f1891q;
                defaultTargetResolution = imageAnalysis$Analyzer != null ? imageAnalysis$Analyzer.getDefaultTargetResolution() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((Integer) builder.getMutableConfig().retrieveOption(ImageOutputConfig.f13906x, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        UseCaseConfig useCaseConfig = builder.getUseCaseConfig();
        C0971c c0971c = ImageOutputConfig.f13899D;
        if (!useCaseConfig.containsOption(c0971c)) {
            builder.getMutableConfig().insertOption(c0971c, defaultTargetResolution);
        }
        UseCaseConfig useCaseConfig2 = builder.getUseCaseConfig();
        C0971c c0971c2 = ImageOutputConfig.f13903I;
        if (useCaseConfig2.containsOption(c0971c2)) {
            I.b bVar = (I.b) this.f2077e.retrieveOption(c0971c2, null);
            if (bVar == null) {
                aVarD = new top.zibin.luban.io.a(9, false);
                aVarD.f42645b = I.a.f3952b;
                aVarD.f42646c = null;
                aVarD.f42647d = null;
            } else {
                aVarD = top.zibin.luban.io.a.d(bVar);
            }
            if (bVar == null || bVar.f3955b == null) {
                aVarD.f42646c = new I.c(defaultTargetResolution);
            }
            if (bVar == null) {
                aVarD.f42647d = new Dg.a(defaultTargetResolution, 2);
            }
            builder.getMutableConfig().insertOption(c0971c2, new I.b((I.a) aVarD.f42645b, (I.c) aVarD.f42646c, (Dg.a) aVarD.f42647d));
        }
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // E.n0
    public final C0993n v(androidx.camera.camera2.impl.b bVar) {
        this.f1892r.b(bVar);
        Object[] objArr = {this.f1892r.d()};
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
        C0980g0 c0980g0 = (C0980g0) this.f2078f;
        d();
        C0 c0D = D(c0980g0, c0993n);
        this.f1892r = c0D;
        Object[] objArr = {c0D.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        return c0993n;
    }

    @Override // E.n0
    public final void x() {
        p140j8.f.b();
        D0 d1 = this.t;
        if (d1 != null) {
            d1.a();
            this.t = null;
        }
        j0 j0Var = this.f1893s;
        if (j0Var != null) {
            j0Var.a();
            this.f1893s = null;
        }
        F f10 = this.f1889o;
        f10.f1912L = false;
        f10.c();
    }

    @Override // E.n0
    public final void y(Matrix matrix) {
        super.y(matrix);
        F f10 = this.f1889o;
        synchronized (f10.f1911H) {
            f10.t = matrix;
            f10.f1924v = new Matrix(f10.t);
        }
    }
}
