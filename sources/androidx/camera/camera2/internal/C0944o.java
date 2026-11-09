package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0206k;
import E.C0218x;
import Pa.C0505b;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944o implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0942n f13604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13606d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f13608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.C0 f13609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K0 f13610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1 f13611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1 f13612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1 f13613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1 f13614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D.d f13615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0929g0 f13616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0926f f13617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageCapture$ScreenFlash f13619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f13620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f13621s;
    public final p045d3.k t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final N7.a f13622u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f13623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile ListenableFuture f13624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13626y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0940m f13627z;

    public C0944o(androidx.camera.camera2.internal.compat.l lVar, androidx.camera.core.impl.utils.executor.d dVar, androidx.camera.core.impl.utils.executor.i iVar, C c6, androidx.camera.core.impl.y0 y0Var) {
        androidx.camera.core.impl.C0 c0 = new androidx.camera.core.impl.C0();
        this.f13609g = c0;
        this.f13618p = 0;
        this.f13620r = false;
        this.f13621s = 2;
        this.f13623v = new AtomicLong(0L);
        this.f13624w = androidx.camera.core.impl.utils.futures.l.f14212c;
        this.f13625x = 1;
        this.f13626y = 0L;
        C0940m c0940m = new C0940m();
        c0940m.f13596b = new HashSet();
        c0940m.f13597c = new ArrayMap();
        this.f13627z = c0940m;
        this.f13607e = lVar;
        this.f13608f = c6;
        this.f13605c = iVar;
        this.f13617o = new C0926f(iVar);
        C0942n c0942n = new C0942n(iVar);
        this.f13604b = c0942n;
        c0.f13839b.f13957c = this.f13625x;
        c0.f13839b.b(new C0950r0(c0942n));
        c0.f13839b.b(c0940m);
        this.f13613k = new j1(this, lVar, iVar, 1);
        this.f13610h = new K0(this, dVar, iVar, y0Var);
        this.f13611i = new j1(this, lVar, iVar, 0);
        this.f13612j = new e1(this, lVar, iVar);
        this.f13614l = new l1(lVar);
        this.t = new p045d3.k(y0Var, 12);
        this.f13622u = new N7.a(y0Var, 1);
        this.f13615m = new D.d(this, iVar);
        this.f13616n = new C0929g0(this, lVar, y0Var, iVar, dVar);
    }

    public static int d(androidx.camera.camera2.internal.compat.l lVar, int i7) {
        int[] iArr = (int[]) lVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (g(i7, iArr)) {
            return i7;
        }
        return g(1, iArr) ? 1 : 0;
    }

    public static boolean g(int i7, int[] iArr) {
        for (int i10 : iArr) {
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(TotalCaptureResult totalCaptureResult, long j6) {
        Long l5;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.O0) && (l5 = (Long) ((androidx.camera.core.impl.O0) tag).f13941a.get("CameraControlSessionUpdateId")) != null && l5.longValue() >= j6;
    }

    public final void a(Camera2CameraControlImpl$CaptureResultListener camera2CameraControlImpl$CaptureResultListener) {
        ((HashSet) this.f13604b.f13600b).add(camera2CameraControlImpl$CaptureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
        D.d dVar = this.f13615m;
        org.greenrobot.eventbus.f fVarA = D.e.b(config).build();
        synchronized (dVar.f1581e) {
            androidx.camera.camera2.impl.a aVar = (androidx.camera.camera2.impl.a) dVar.f1582f;
            aVar.getClass();
            androidx.camera.core.impl.W w3 = androidx.camera.core.impl.W.f13997d;
            for (androidx.camera.core.impl.V v3 : fVarA.listOptions()) {
                aVar.f13105a.insertOption(v3, w3, fVarA.retrieveOption(v3));
            }
        }
        androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new D.a(dVar, 0))).addListener(new RunnableC0930h(0), org.chromium.support_lib_boundary.util.b.u());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(androidx.camera.core.impl.C0 c0) {
        this.f13614l.addZslConfig(c0);
    }

    public final void b() {
        synchronized (this.f13606d) {
            try {
                int i7 = this.f13618p;
                if (i7 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f13618p = i7 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z3) {
        this.f13620r = z3;
        if (!z3) {
            androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S();
            s3.f13957c = this.f13625x;
            s3.f13960f = true;
            C0992m0 c0992m0B = C0992m0.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(key), Integer.valueOf(d(this.f13607e, 1)));
            c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.FLASH_MODE), 0);
            s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
            this.f13608f.onCameraControlCaptureRequests(Collections.singletonList(s3.d()));
        }
        k();
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture cancelFocusAndMetering() {
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        K0 k2 = this.f13610h;
        k2.getClass();
        return androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new F0(k2, 0)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        D.d dVar = this.f13615m;
        synchronized (dVar.f1581e) {
            dVar.f1582f = new androidx.camera.camera2.impl.a();
        }
        androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new D.a(dVar, 1))).addListener(new RunnableC0930h(0), org.chromium.support_lib_boundary.util.b.u());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void decrementVideoUsage() {
        C0926f c0926f = this.f13617o;
        c0926f.getClass();
        ((androidx.camera.core.impl.utils.executor.i) c0926f.f13512a).execute(new f1(c0926f, 0));
    }

    public final int e(int i7) {
        int[] iArr = (int[]) this.f13607e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (g(i7, iArr)) {
            return i7;
        }
        if (g(4, iArr)) {
            return 4;
        }
        return g(1, iArr) ? 1 : 0;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture enableTorch(boolean z3) {
        ListenableFuture listenableFutureY;
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        e1 e1Var = this.f13612j;
        if (e1Var.f13507c) {
            e1.b(e1Var.f13506b, Integer.valueOf(z3 ? 1 : 0));
            listenableFutureY = AbstractC0198c.y(new De.b(e1Var, z3, 2));
        } else {
            p140j8.f.G("TorchControl");
            listenableFutureY = new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("No flash unit"), 1);
        }
        return androidx.camera.core.impl.utils.futures.j.e(listenableFutureY);
    }

    public final boolean f() {
        int i7;
        synchronized (this.f13606d) {
            i7 = this.f13618p;
        }
        return i7 > 0;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture getCameraCapturePipelineAsync(final int i7, final int i10) {
        if (!f()) {
            p140j8.f.G("Camera2CameraControlImp");
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        final int i11 = this.f13621s;
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(androidx.camera.core.impl.utils.futures.j.e(this.f13624w));
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.i
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                C0944o c0944o = this.f13550a;
                int i12 = i10;
                C0929g0 c0929g0 = c0944o.f13616n;
                int i13 = i7;
                int i14 = i11;
                return androidx.camera.core.impl.utils.futures.j.d(new U(c0929g0.a(i13, i14, i12), c0929g0.f13533e, i14));
            }
        };
        androidx.camera.core.impl.utils.executor.i iVar = this.f13605c;
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.i(bVarA, asyncFunction, iVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final int getFlashMode() {
        return this.f13621s;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        androidx.camera.camera2.impl.b bVar;
        D.d dVar = this.f13615m;
        synchronized (dVar.f1581e) {
            androidx.camera.camera2.impl.a aVar = (androidx.camera.camera2.impl.a) dVar.f1582f;
            aVar.getClass();
            bVar = new androidx.camera.camera2.impl.b(C1000q0.a(aVar.f13105a), 2);
        }
        return bVar;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect getSensorRect() {
        Rect rect = (Rect) this.f13607e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff A[Catch: all -> 0x0141, LOOP:0: B:51:0x00f9->B:53:0x00ff, LOOP_END, TryCatch #0 {, blocks: (B:50:0x00e9, B:51:0x00f9, B:53:0x00ff, B:54:0x010f), top: B:60:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.camera.core.impl.CameraControlInternal
    public final androidx.camera.core.impl.H0 getSessionConfig() {
        int[] iArr;
        D.d dVar;
        C0992m0 c0992m0;
        androidx.camera.core.impl.W w3;
        androidx.camera.core.impl.C0 c0 = this.f13609g;
        c0.f13839b.f13957c = this.f13625x;
        androidx.camera.camera2.impl.a aVar = new androidx.camera.camera2.impl.a();
        int i7 = 1;
        aVar.a(CaptureRequest.CONTROL_MODE, 1);
        K0 k2 = this.f13610h;
        int i10 = 3;
        aVar.a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(k2.f13203a.e(k2.f13209g ? 1 : k2.f13216n != 3 ? 4 : 3)));
        MeteringRectangle[] meteringRectangleArr = k2.f13219q;
        if (meteringRectangleArr.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = k2.f13220r;
        if (meteringRectangleArr2.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = k2.f13221s;
        if (meteringRectangleArr3.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range range = (Range) this.t.f35518b;
        if (range != null) {
            aVar.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        ((ZoomControl$ZoomImpl) this.f13611i.f13570f).addRequestOption(aVar);
        int i11 = this.f13610h.f13223v ? 5 : 1;
        if (!this.f13620r) {
            int i12 = this.f13621s;
            if (i12 == 0) {
                N7.a aVar2 = this.f13622u;
                if (aVar2.f6099a || aVar2.f6100b) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
            } else if (i12 != 1) {
                if (i12 == 2) {
                    i10 = 1;
                }
            }
            aVar.a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(d(this.f13607e, i10)));
            CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f13607e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!g(1, iArr) && !g(1, iArr))) {
                i7 = 0;
            }
            aVar.a(key, Integer.valueOf(i7));
            j1 j1Var = this.f13613k;
            j1Var.getClass();
            aVar.a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(((C0505b) j1Var.f13568d).getExposureCompensationIndex()));
            dVar = this.f13615m;
            synchronized (dVar.f1581e) {
                c0992m0 = ((androidx.camera.camera2.impl.a) dVar.f1582f).f13105a;
                w3 = androidx.camera.core.impl.W.f13994a;
                for (androidx.camera.core.impl.V v3 : c0992m0.listOptions()) {
                    aVar.f13105a.insertOption(v3, w3, c0992m0.retrieveOption(v3));
                }
            }
            androidx.camera.camera2.impl.b bVar = new androidx.camera.camera2.impl.b(C1000q0.a(aVar.f13105a), 2);
            androidx.camera.core.impl.S s3 = c0.f13839b;
            s3.getClass();
            s3.f13956b = C0992m0.c(bVar);
            this.f13609g.f13839b.f13961g.f13941a.put("CameraControlSessionUpdateId", Long.valueOf(this.f13626y));
            return this.f13609g.d();
        }
        aVar.a(CaptureRequest.FLASH_MODE, 2);
        i10 = i11;
        aVar.a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(d(this.f13607e, i10)));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f13607e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i7 = 0;
        } else {
            i7 = 0;
        }
        aVar.a(key2, Integer.valueOf(i7));
        j1 j1Var2 = this.f13613k;
        j1Var2.getClass();
        aVar.a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(((C0505b) j1Var2.f13568d).getExposureCompensationIndex()));
        dVar = this.f13615m;
        synchronized (dVar.f1581e) {
            c0992m0 = ((androidx.camera.camera2.impl.a) dVar.f1582f).f13105a;
            w3 = androidx.camera.core.impl.W.f13994a;
            while (r5.hasNext()) {
                aVar.f13105a.insertOption(v3, w3, c0992m0.retrieveOption(v3));
            }
            androidx.camera.camera2.impl.b bVar2 = new androidx.camera.camera2.impl.b(C1000q0.a(aVar.f13105a), 2);
            androidx.camera.core.impl.S s8 = c0.f13839b;
            s8.getClass();
            s8.f13956b = C0992m0.c(bVar2);
            this.f13609g.f13839b.f13961g.f13941a.put("CameraControlSessionUpdateId", Long.valueOf(this.f13626y));
            return this.f13609g.d();
        }
    }

    public final void i(Camera2CameraControlImpl$CaptureResultListener camera2CameraControlImpl$CaptureResultListener) {
        ((HashSet) this.f13604b.f13600b).remove(camera2CameraControlImpl$CaptureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void incrementVideoUsage() {
        C0926f c0926f = this.f13617o;
        c0926f.getClass();
        ((androidx.camera.core.impl.utils.executor.i) c0926f.f13512a).execute(new f1(c0926f, 1));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isInVideoUsage() {
        int i7 = ((AtomicInteger) this.f13617o.f13513b).get();
        p140j8.f.G("Camera2CameraControlImp");
        return i7 > 0;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isZslDisabledByByUserCaseConfig() {
        return this.f13614l.f13587c;
    }

    public final void j(boolean z3) {
        androidx.camera.core.internal.b bVarA;
        p140j8.f.G("Camera2CameraControlImp");
        K0 k2 = this.f13610h;
        if (z3 != k2.f13206d) {
            k2.f13206d = z3;
            if (!k2.f13206d) {
                k2.b(null);
            }
        }
        j1 j1Var = this.f13611i;
        if (j1Var.f13567c != z3) {
            j1Var.f13567c = z3;
            if (!z3) {
                synchronized (((k1) j1Var.f13568d)) {
                    ((k1) j1Var.f13568d).b(1.0f);
                    bVarA = androidx.camera.core.internal.b.a((k1) j1Var.f13568d);
                }
                j1Var.d(bVarA);
                ((ZoomControl$ZoomImpl) j1Var.f13570f).resetZoom();
                j1Var.f13565a.k();
            }
        }
        e1 e1Var = this.f13612j;
        if (e1Var.f13509e != z3) {
            e1Var.f13509e = z3;
            if (!z3) {
                if (e1Var.f13511g) {
                    e1Var.f13511g = false;
                    e1Var.f13505a.c(false);
                    e1.b(e1Var.f13506b, 0);
                }
                androidx.concurrent.futures.k kVar = e1Var.f13510f;
                if (kVar != null) {
                    kVar.d(new C0206k("Camera is not active."));
                    e1Var.f13510f = null;
                }
            }
        }
        j1 j1Var2 = this.f13613k;
        if (z3 != j1Var2.f13567c) {
            j1Var2.f13567c = z3;
            if (!z3) {
                C0505b c0505b = (C0505b) j1Var2.f13568d;
                synchronized (c0505b.f7073c) {
                    c0505b.f7072b = 0;
                }
                j1Var2.a();
            }
        }
        D.d dVar = this.f13615m;
        dVar.getClass();
        ((androidx.camera.core.impl.utils.executor.i) dVar.f1580d).execute(new D.b(dVar, z3, 0));
        if (z3) {
            return;
        }
        this.f13619q = null;
        ((AtomicInteger) this.f13617o.f13513b).set(0);
        p140j8.f.G("VideoUsageControl");
    }

    public final long k() {
        this.f13626y = this.f13623v.getAndIncrement();
        this.f13608f.onCameraControlUpdateSessionConfig();
        return this.f13626y;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setExposureCompensationIndex(int i7) {
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        j1 j1Var = this.f13613k;
        C0505b c0505b = (C0505b) j1Var.f13568d;
        if (!c0505b.isExposureCompensationSupported()) {
            return new androidx.camera.core.impl.utils.futures.l(new IllegalArgumentException("ExposureCompensation is not supported"), 1);
        }
        Range exposureCompensationRange = c0505b.getExposureCompensationRange();
        if (exposureCompensationRange.contains(Integer.valueOf(i7))) {
            synchronized (c0505b.f7073c) {
                c0505b.f7072b = i7;
            }
            return androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new Nc.v(j1Var, i7)));
        }
        StringBuilder sbE = F.e(i7, "Requested ExposureCompensation ", " is not within valid range [");
        sbE.append(exposureCompensationRange.getUpper());
        sbE.append("..");
        sbE.append(exposureCompensationRange.getLower());
        sbE.append("]");
        return new androidx.camera.core.impl.utils.futures.l(new IllegalArgumentException(sbE.toString()), 1);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i7) {
        if (!f()) {
            p140j8.f.G("Camera2CameraControlImp");
            return;
        }
        this.f13621s = i7;
        p140j8.f.G("Camera2CameraControlImp");
        l1 l1Var = this.f13614l;
        boolean z3 = true;
        if (this.f13621s != 1 && this.f13621s != 0) {
            z3 = false;
        }
        l1Var.f13588d = z3;
        this.f13624w = androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new C0936k(this, 0)));
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setLinearZoom(float f10) {
        ListenableFuture lVar;
        androidx.camera.core.internal.b bVarA;
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        j1 j1Var = this.f13611i;
        synchronized (((k1) j1Var.f13568d)) {
            try {
                ((k1) j1Var.f13568d).a(f10);
                bVarA = androidx.camera.core.internal.b.a((k1) j1Var.f13568d);
            } catch (IllegalArgumentException e10) {
                lVar = new androidx.camera.core.impl.utils.futures.l(e10, 1);
            }
        }
        j1Var.d(bVarA);
        lVar = AbstractC0198c.y(new g1(j1Var, bVarA, 1));
        return androidx.camera.core.impl.utils.futures.j.e(lVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setScreenFlash(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        this.f13619q = imageCapture$ScreenFlash;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setZoomRatio(float f10) {
        ListenableFuture lVar;
        androidx.camera.core.internal.b bVarA;
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        j1 j1Var = this.f13611i;
        synchronized (((k1) j1Var.f13568d)) {
            try {
                ((k1) j1Var.f13568d).b(f10);
                bVarA = androidx.camera.core.internal.b.a((k1) j1Var.f13568d);
            } catch (IllegalArgumentException e10) {
                lVar = new androidx.camera.core.impl.utils.futures.l(e10, 1);
            }
        }
        j1Var.d(bVarA);
        lVar = AbstractC0198c.y(new g1(j1Var, bVarA, 0));
        return androidx.camera.core.impl.utils.futures.j.e(lVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setZslDisabledByUserCaseConfig(boolean z3) {
        this.f13614l.f13587c = z3;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture startFocusAndMetering(C0218x c0218x) {
        if (!f()) {
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        K0 k2 = this.f13610h;
        k2.getClass();
        return androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new C0953t(3, k2, c0218x)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture submitStillCaptureRequests(final List list, final int i7, final int i10) {
        if (!f()) {
            p140j8.f.G("Camera2CameraControlImp");
            return new androidx.camera.core.impl.utils.futures.l(new C0206k("Camera is not active."), 1);
        }
        final int i11 = this.f13621s;
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(androidx.camera.core.impl.utils.futures.j.e(this.f13624w));
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.g
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                C0944o c0944o = this.f13524a;
                int i12 = i10;
                C0929g0 c0929g0 = c0944o.f13616n;
                int i13 = i7;
                int i14 = i11;
                Z zA = c0929g0.a(i13, i14, i12);
                androidx.camera.core.impl.utils.futures.b bVarA2 = androidx.camera.core.impl.utils.futures.b.a(zA.a(i14));
                V v3 = new V(i14, zA, list);
                bVarA2.getClass();
                androidx.camera.core.impl.utils.executor.i iVar = zA.f13324b;
                androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(bVarA2, v3, iVar);
                aVarI.addListener(new RunnableC0961x(zA, 2), iVar);
                return androidx.camera.core.impl.utils.futures.j.e(aVarI);
            }
        };
        androidx.camera.core.impl.utils.executor.i iVar = this.f13605c;
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.i(bVarA, asyncFunction, iVar);
    }
}
