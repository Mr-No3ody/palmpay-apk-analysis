package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0199d;
import E.C0200e;
import E.C0212q;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.Camera;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0967a;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0988k0;
import androidx.camera.core.impl.C0990l0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C0995o;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class J implements CameraInternal {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public androidx.concurrent.futures.k f13163A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C0926f f13164A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedHashMap f13165B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public volatile int f13166B0 = 3;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f13167C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final A f13168H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C.b f13169L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final androidx.camera.core.impl.N f13170M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f13171Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f13172X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13173Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13174Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.greenrobot.eventbus.f f13175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.s f13176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0990l0 f13179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0926f f13180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0944o f13181g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final I f13182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M f13183j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13184k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CameraDevice f13185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13186p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public P0 f13187p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final P0 f13188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Z0 f13189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final HashSet f13190s0;
    public CaptureSessionInterface t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CameraConfig f13191t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Object f13192u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicInteger f13193v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public SessionProcessor f13194v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ListenableFuture f13195w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f13196w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final C0966z0 f13197x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.params.b f13198y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Y0 f13199z0;

    public J(Context context, androidx.camera.camera2.internal.compat.s sVar, String str, M m7, C.b bVar, androidx.camera.core.impl.N n10, Executor executor, Handler handler, C0966z0 c0966z0, long j6) throws C0212q {
        C0990l0 c0990l0 = new C0990l0();
        this.f13179e = c0990l0;
        this.f13186p = 0;
        this.f13193v = new AtomicInteger(0);
        this.f13165B = new LinkedHashMap();
        this.f13167C = 0;
        this.f13173Y = false;
        this.f13174Z = false;
        this.f13184k0 = true;
        this.f13190s0 = new HashSet();
        this.f13191t0 = androidx.camera.core.impl.D.f13854a;
        this.f13192u0 = new Object();
        this.f13196w0 = false;
        this.f13164A0 = new C0926f(this);
        this.f13176b = sVar;
        this.f13169L = bVar;
        this.f13170M = n10;
        androidx.camera.core.impl.utils.executor.d dVar = new androidx.camera.core.impl.utils.executor.d(handler);
        this.f13178d = dVar;
        androidx.camera.core.impl.utils.executor.i iVar = new androidx.camera.core.impl.utils.executor.i(executor);
        this.f13177c = iVar;
        this.f13182i = new I(this, iVar, dVar, j6);
        this.f13175a = new org.greenrobot.eventbus.f(str);
        c0990l0.f14100a.i(new C0988k0(androidx.camera.core.impl.G.CLOSED));
        C0926f c0926f = new C0926f(n10);
        this.f13180f = c0926f;
        P0 p3 = new P0();
        p3.f13247b = new Object();
        p3.f13248c = new LinkedHashSet();
        p3.f13249d = new LinkedHashSet();
        p3.f13250e = new LinkedHashSet();
        p3.f13251f = new C0947p0(p3);
        p3.f13246a = iVar;
        this.f13188q0 = p3;
        this.f13197x0 = c0966z0;
        try {
            androidx.camera.camera2.internal.compat.l lVarA = sVar.a(str);
            C0944o c0944o = new C0944o(lVarA, dVar, iVar, new C(this), m7.f13237j);
            this.f13181g = c0944o;
            this.f13183j = m7;
            m7.b(c0944o);
            m7.f13235h.m((androidx.lifecycle.F) c0926f.f13513b);
            this.f13198y0 = androidx.camera.camera2.internal.compat.params.b.a(lVarA);
            this.t = l();
            this.f13189r0 = new Z0(handler, p3, m7.f13237j, androidx.camera.camera2.internal.compat.quirk.a.f13477a, dVar, iVar);
            this.f13171Q = m7.f13237j.a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f13172X = m7.f13237j.a(LegacyCameraSurfaceCleanupQuirk.class);
            A a3 = new A(this, str);
            this.f13168H = a3;
            B b7 = new B(this);
            synchronized (n10.f13935b) {
                p118hf.a.k(!n10.f13938e.containsKey(this), "Camera is already registered: " + this);
                n10.f13938e.put(this, new androidx.camera.core.impl.M(iVar, b7, a3));
            }
            sVar.f13482a.registerAvailabilityCallback(iVar, a3);
            this.f13199z0 = new Y0(context, str, sVar, new C0959w(0));
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            throw new C0212q(e10);
        }
    }

    public static String h(int i7) {
        if (i7 == 0) {
            return "ERROR_NONE";
        }
        if (i7 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i7 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i7 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i7 != 4) {
            return i7 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String i(P0 p3) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        p3.getClass();
        sb2.append(p3.hashCode());
        return sb2.toString();
    }

    public static String j(E.n0 n0Var) {
        return n0Var.f() + n0Var.hashCode();
    }

    public final void a() {
        List list;
        int i7;
        Size size;
        org.greenrobot.eventbus.f fVar = this.f13175a;
        androidx.camera.core.impl.H0 h0B = fVar.f().b();
        androidx.camera.core.impl.T t = h0B.f13886g;
        int size2 = Collections.unmodifiableList(t.f13966a).size();
        int size3 = h0B.b().size();
        if (h0B.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(t.f13966a).isEmpty()) {
            if (size3 == 1 && size2 == 1) {
                p();
                return;
            }
            if (size2 >= 2) {
                p();
                return;
            } else if (this.f13187p0 == null || k()) {
                p140j8.f.G("Camera2CameraImpl");
                return;
            } else {
                p();
                return;
            }
        }
        if (this.f13187p0 == null) {
            androidx.camera.camera2.internal.compat.l lVar = this.f13183j.f13229b;
            r rVar = new r(this, 0);
            C0966z0 c0966z0 = this.f13197x0;
            P0 p3 = new P0();
            androidx.camera.camera2.internal.compat.workaround.c cVar = new androidx.camera.camera2.internal.compat.workaround.c();
            Size size4 = null;
            p3.f13251f = null;
            p3.f13248c = new O0();
            p3.f13250e = rVar;
            Size[] sizeArrF = lVar.b().f(34);
            int i10 = 0;
            if (sizeArrF != null) {
                if (cVar.f13490a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size5 : sizeArrF) {
                        if (androidx.camera.camera2.internal.compat.workaround.c.f13489c.compare(size5, androidx.camera.camera2.internal.compat.workaround.c.f13488b) >= 0) {
                            arrayList.add(size5);
                        }
                    }
                    sizeArrF = (Size[]) arrayList.toArray(new Size[0]);
                }
                List listAsList = Arrays.asList(sizeArrF);
                Collections.sort(listAsList, new N0());
                Size sizeE = c0966z0.e();
                long jMin = Math.min(((long) sizeE.getWidth()) * ((long) sizeE.getHeight()), 307200L);
                int length = sizeArrF.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Size size6 = sizeArrF[i11];
                        List list2 = listAsList;
                        long j6 = jMin;
                        long width = ((long) size6.getWidth()) * ((long) size6.getHeight());
                        if (width == j6) {
                            size = size6;
                            break;
                        }
                        if (width <= j6) {
                            i11++;
                            size4 = size6;
                            listAsList = list2;
                            jMin = j6;
                            i10 = 0;
                        } else if (size4 != null) {
                            size = size4;
                            break;
                        } else {
                            list = list2;
                            i7 = 0;
                        }
                    } else {
                        list = listAsList;
                        i7 = i10;
                    }
                    size = (Size) list.get(i7);
                    break;
                }
            } else {
                p140j8.f.g("MeteringRepeating", "Can not get output size list.");
                size = new Size(0, 0);
            }
            p3.f13249d = size;
            Objects.toString(size);
            p140j8.f.G("MeteringRepeating");
            p3.f13247b = p3.e();
            this.f13187p0 = p3;
        }
        if (!k()) {
            p140j8.f.g("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        P0 p10 = this.f13187p0;
        if (p10 != null) {
            String strI = i(p10);
            P0 p11 = this.f13187p0;
            androidx.camera.core.impl.H0 h7 = (androidx.camera.core.impl.H0) p11.f13247b;
            androidx.camera.core.impl.T0 t1 = androidx.camera.core.impl.T0.f13979f;
            List listSingletonList = Collections.singletonList(t1);
            LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f41079b;
            androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) linkedHashMap.get(strI);
            O0 o10 = (O0) p11.f13248c;
            if (r3 == null) {
                r3 = new androidx.camera.core.impl.R0(h7, o10, null, listSingletonList);
                linkedHashMap.put(strI, r3);
            }
            r3.f13953e = true;
            fVar.j(strI, h7, o10, null, listSingletonList);
            P0 p12 = this.f13187p0;
            androidx.camera.core.impl.H0 h10 = (androidx.camera.core.impl.H0) p12.f13247b;
            List listSingletonList2 = Collections.singletonList(t1);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) fVar.f41079b;
            androidx.camera.core.impl.R0 r10 = (androidx.camera.core.impl.R0) linkedHashMap2.get(strI);
            if (r10 == null) {
                r10 = new androidx.camera.core.impl.R0(h10, (O0) p12.f13248c, null, listSingletonList2);
                linkedHashMap2.put(strI, r10);
            }
            r10.f13954f = true;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        C0944o c0944o = this.f13181g;
        synchronized (c0944o.f13606d) {
            c0944o.f13618p++;
        }
        for (E.n0 n0Var : new ArrayList(arrayList)) {
            String strJ = j(n0Var);
            HashSet hashSet = this.f13190s0;
            if (!hashSet.contains(strJ)) {
                hashSet.add(strJ);
                n0Var.t();
                n0Var.r();
            }
        }
        try {
            this.f13177c.execute(new RunnableC0957v(this, new ArrayList(t(arrayList)), 1));
        } catch (RejectedExecutionException unused) {
            f("Unable to attach use cases.");
            c0944o.b();
        }
    }

    public final void b() {
        p118hf.a.k(this.f13166B0 == 5 || this.f13166B0 == 2 || (this.f13166B0 == 7 && this.f13186p != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + F.j(this.f13166B0) + " (error: " + h(this.f13186p) + ")");
        q();
        this.t.cancelIssuedCaptureRequests();
    }

    public final void c() {
        E e10;
        f("Closing camera.");
        boolean z3 = true;
        switch (F.i(this.f13166B0)) {
            case 3:
                p118hf.a.k(this.f13185o == null, null);
                s(3);
                break;
            case 4:
            default:
                f("close() ignored due to being in state: ".concat(F.j(this.f13166B0)));
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f13182i.a() && ((e10 = (E) this.f13164A0.f13512a) == null || e10.f13132b.get())) {
                    z3 = false;
                }
                this.f13164A0.a();
                s(5);
                if (z3) {
                    p118hf.a.k(this.f13165B.isEmpty(), null);
                    d();
                }
                break;
            case 8:
            case 9:
                s(5);
                b();
                break;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void close() {
        this.f13177c.execute(new RunnableC0948q(this, 2));
    }

    public final void d() {
        p118hf.a.k(this.f13166B0 == 2 || this.f13166B0 == 5, null);
        p118hf.a.k(this.f13165B.isEmpty(), null);
        if (!this.f13173Y) {
            g();
            return;
        }
        if (this.f13174Z) {
            f("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f13168H.f13113b) {
            this.f13173Y = false;
            g();
            f("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            f("Open camera to configAndClose");
            androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new r(this, 1));
            this.f13174Z = true;
            mVarY.addListener(new RunnableC0948q(this, 1), this.f13177c);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(t(arrayList));
        for (E.n0 n0Var : new ArrayList(arrayList)) {
            String strJ = j(n0Var);
            HashSet hashSet = this.f13190s0;
            if (hashSet.contains(strJ)) {
                n0Var.u();
                hashSet.remove(strJ);
            }
        }
        this.f13177c.execute(new RunnableC0957v(this, arrayList2, 0));
    }

    public final CameraDevice.StateCallback e() {
        ArrayList arrayList = new ArrayList(this.f13175a.f().b().f13882c);
        arrayList.add((C0947p0) this.f13188q0.f13251f);
        arrayList.add(this.f13182i);
        return p264r5.a.i(arrayList);
    }

    public final void f(String str) {
        toString();
        p140j8.f.G("Camera2CameraImpl");
    }

    public final void g() {
        p118hf.a.k(this.f13166B0 == 2 || this.f13166B0 == 5, null);
        p118hf.a.k(this.f13165B.isEmpty(), null);
        this.f13185o = null;
        if (this.f13166B0 == 5) {
            s(3);
            return;
        }
        this.f13176b.f13482a.unregisterAvailabilityCallback(this.f13168H);
        s(1);
        androidx.concurrent.futures.k kVar = this.f13163A;
        if (kVar != null) {
            kVar.b(null);
            this.f13163A = null;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.f13181g;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.f13183j;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable getCameraState() {
        return this.f13179e;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        return this.f13191t0;
    }

    public final boolean k() {
        int i7;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f13192u0) {
            try {
                i7 = this.f13169L.f917f == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        org.greenrobot.eventbus.f fVar = this.f13175a;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) fVar.f41079b).entrySet()) {
            if (((androidx.camera.core.impl.R0) entry.getValue()).f13953e) {
                arrayList2.add((androidx.camera.core.impl.R0) entry.getValue());
            }
        }
        for (androidx.camera.core.impl.R0 r3 : Collections.unmodifiableCollection(arrayList2)) {
            List list = r3.f13952d;
            if (list == null || list.get(0) != androidx.camera.core.impl.T0.f13979f) {
                if (r3.f13951c == null || r3.f13952d == null) {
                    r3.toString();
                    p140j8.f.G("Camera2CameraImpl");
                    return false;
                }
                androidx.camera.core.impl.H0 h7 = r3.f13949a;
                UseCaseConfig useCaseConfig = r3.f13950b;
                for (AbstractC0970b0 abstractC0970b0 : h7.b()) {
                    Y0 y8 = this.f13199z0;
                    int inputFormat = useCaseConfig.getInputFormat();
                    C0995o c0995oB = androidx.camera.core.impl.N0.b(i7, inputFormat, abstractC0970b0.f14028h, y8.i(inputFormat));
                    int inputFormat2 = useCaseConfig.getInputFormat();
                    Size size = abstractC0970b0.f14028h;
                    C0993n c0993n = r3.f13951c;
                    arrayList.add(new C0967a(c0995oB, inputFormat2, size, c0993n.f14109b, r3.f13952d, c0993n.f14111d, useCaseConfig.getTargetFrameRate(null)));
                }
            }
        }
        this.f13187p0.getClass();
        HashMap map = new HashMap();
        P0 p3 = this.f13187p0;
        map.put((O0) p3.f13248c, Collections.singletonList((Size) p3.f13249d));
        try {
            this.f13199z0.g(i7, arrayList, map, false, false);
            f("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException unused) {
            f("Surface combination with metering repeating  not supported!");
            return false;
        }
    }

    public final CaptureSessionInterface l() {
        synchronized (this.f13192u0) {
            try {
                if (this.f13194v0 == null) {
                    return new C0962x0(this.f13198y0, this.f13183j.f13237j, false);
                }
                return new V0(this.f13194v0, this.f13183j, this.f13198y0, this.f13177c, this.f13178d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z3) {
        if (!z3) {
            this.f13182i.f13158e.f13141b = -1L;
        }
        this.f13182i.a();
        this.f13164A0.a();
        f("Opening camera.");
        s(8);
        try {
            this.f13176b.f13482a.openCamera(this.f13183j.f13228a, this.f13177c, e());
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            f("Unable to open camera due to " + e10.getMessage());
            if (e10.f13380a == 10001) {
                r(3, new C0200e(7, e10), true);
                return;
            }
            C0926f c0926f = this.f13164A0;
            if (((J) c0926f.f13513b).f13166B0 != 8) {
                ((J) c0926f.f13513b).f("Don't need the onError timeout handler.");
                return;
            }
            ((J) c0926f.f13513b).f("Camera waiting for onError.");
            c0926f.a();
            c0926f.f13512a = new E(c0926f);
        } catch (SecurityException e11) {
            f("Unable to open camera due to " + e11.getMessage());
            s(7);
            this.f13182i.b();
        }
    }

    public final void n() {
        int i7 = 0;
        int i10 = 1;
        p118hf.a.k(this.f13166B0 == 9, null);
        androidx.camera.core.impl.G0 g0F = this.f13175a.f();
        if (!g0F.f13873k || !g0F.f13872j) {
            f("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f13170M.e(this.f13185o.getId(), this.f13169L.getPairedConcurrentCameraId(this.f13185o.getId()))) {
            f("Unable to create capture session in camera operating mode = " + this.f13169L.f917f);
            return;
        }
        HashMap map = new HashMap();
        Collection<androidx.camera.core.impl.H0> collectionG = this.f13175a.g();
        Collection collectionH = this.f13175a.h();
        C0971c c0971c = X0.f13293a;
        ArrayList arrayList = new ArrayList(collectionH);
        for (androidx.camera.core.impl.H0 h7 : collectionG) {
            C1000q0 c1000q0 = h7.f13886g.f13967b;
            C0971c c0971c2 = X0.f13293a;
            if (c1000q0.f14126a.containsKey(c0971c2) && h7.b().size() != 1) {
                p140j8.f.g("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(h7.b().size())));
                break;
            }
            if (h7.f13886g.f13967b.f14126a.containsKey(c0971c2)) {
                int i11 = 0;
                for (androidx.camera.core.impl.H0 h10 : collectionG) {
                    if (((UseCaseConfig) arrayList.get(i11)).getCaptureType() == androidx.camera.core.impl.T0.f13979f) {
                        p118hf.a.k(!h10.b().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((AbstractC0970b0) h10.b().get(0), 1L);
                    } else if (h10.f13886g.f13967b.f14126a.containsKey(c0971c2) && !h10.b().isEmpty()) {
                        map.put((AbstractC0970b0) h10.b().get(0), (Long) h10.f13886g.f13967b.retrieveOption(c0971c2));
                    }
                    i11++;
                }
                break;
            }
        }
        this.t.setStreamUseCaseMap(map);
        CaptureSessionInterface captureSessionInterface = this.t;
        androidx.camera.core.impl.H0 h0B = g0F.b();
        CameraDevice cameraDevice = this.f13185o;
        cameraDevice.getClass();
        Z0 z3 = this.f13189r0;
        ListenableFuture<Void> listenableFutureOpen = captureSessionInterface.open(h0B, cameraDevice, new c1(z3.f13334c, z3.f13335d, z3.f13336e, z3.f13337f, z3.f13333b, z3.f13332a));
        listenableFutureOpen.addListener(new androidx.camera.core.impl.utils.futures.i(i7, listenableFutureOpen, new C0965z(this, captureSessionInterface, i10)), this.f13177c);
    }

    public final void o() {
        int i7 = F.i(this.f13166B0);
        if (i7 == 2 || i7 == 3) {
            v(false);
            return;
        }
        if (i7 != 4) {
            f("open() ignored due to being in state: ".concat(F.j(this.f13166B0)));
            return;
        }
        s(7);
        if (this.f13165B.isEmpty() || this.f13174Z || this.f13186p != 0) {
            return;
        }
        p118hf.a.k(this.f13185o != null, "Camera Device should be open if session close is not complete");
        s(9);
        n();
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseActive(E.n0 n0Var) {
        n0Var.getClass();
        this.f13177c.execute(new RunnableC0955u(this, j(n0Var), this.f13184k0 ? n0Var.f2085m : n0Var.f2086n, n0Var.f2078f, n0Var.f2079g, n0Var.b() == null ? null : androidx.camera.core.streamsharing.d.H(n0Var), 1));
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseInactive(E.n0 n0Var) {
        n0Var.getClass();
        this.f13177c.execute(new RunnableC0934j(4, this, j(n0Var)));
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseReset(E.n0 n0Var) {
        n0Var.getClass();
        this.f13177c.execute(new G.g(this, j(n0Var), this.f13184k0 ? n0Var.f2085m : n0Var.f2086n, n0Var.f2078f, n0Var.f2079g, n0Var.b() == null ? null : androidx.camera.core.streamsharing.d.H(n0Var), 1));
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseUpdated(E.n0 n0Var) {
        n0Var.getClass();
        this.f13177c.execute(new RunnableC0955u(this, j(n0Var), this.f13184k0 ? n0Var.f2085m : n0Var.f2086n, n0Var.f2078f, n0Var.f2079g, n0Var.b() == null ? null : androidx.camera.core.streamsharing.d.H(n0Var), 0));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void open() {
        this.f13177c.execute(new RunnableC0948q(this, 0));
    }

    public final void p() {
        if (this.f13187p0 != null) {
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f13187p0.getClass();
            sb2.append(this.f13187p0.hashCode());
            String string = sb2.toString();
            org.greenrobot.eventbus.f fVar = this.f13175a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f41079b;
            if (linkedHashMap.containsKey(string)) {
                androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) linkedHashMap.get(string);
                r3.f13953e = false;
                if (!r3.f13954f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.f13187p0.getClass();
            sb3.append(this.f13187p0.hashCode());
            String string2 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) fVar.f41079b;
            if (linkedHashMap2.containsKey(string2)) {
                androidx.camera.core.impl.R0 r10 = (androidx.camera.core.impl.R0) linkedHashMap2.get(string2);
                r10.f13954f = false;
                if (!r10.f13953e) {
                    linkedHashMap2.remove(string2);
                }
            }
            P0 p3 = this.f13187p0;
            p3.getClass();
            p140j8.f.G("MeteringRepeating");
            E.j0 j0Var = (E.j0) p3.f13246a;
            if (j0Var != null) {
                j0Var.a();
            }
            p3.f13246a = null;
            this.f13187p0 = null;
        }
    }

    public final void q() {
        p118hf.a.k(this.t != null, null);
        f("Resetting Capture Session");
        CaptureSessionInterface captureSessionInterface = this.t;
        androidx.camera.core.impl.H0 sessionConfig = captureSessionInterface.getSessionConfig();
        List<androidx.camera.core.impl.T> captureConfigs = captureSessionInterface.getCaptureConfigs();
        CaptureSessionInterface captureSessionInterfaceL = l();
        this.t = captureSessionInterfaceL;
        captureSessionInterfaceL.setSessionConfig(sessionConfig);
        this.t.issueCaptureRequests(captureConfigs);
        if (F.i(this.f13166B0) != 8) {
            f("Skipping Capture Session state check due to current camera state: " + F.j(this.f13166B0) + " and previous session status: " + captureSessionInterface.isInOpenState());
        } else if (this.f13171Q && captureSessionInterface.isInOpenState()) {
            f("Close camera before creating new session");
            s(6);
        }
        if (this.f13172X && captureSessionInterface.isInOpenState()) {
            f("ConfigAndClose is required when close the camera.");
            this.f13173Y = true;
        }
        captureSessionInterface.close();
        ListenableFuture<Void> listenableFutureRelease = captureSessionInterface.release(false);
        f("Releasing session in state ".concat(F.h(this.f13166B0)));
        this.f13165B.put(captureSessionInterface, listenableFutureRelease);
        listenableFutureRelease.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureRelease, new C0965z(this, captureSessionInterface, 0)), org.chromium.support_lib_boundary.util.b.u());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    public final void r(int i7, C0200e c0200e, boolean z3) {
        androidx.camera.core.impl.G g7;
        androidx.camera.core.impl.G g10;
        androidx.camera.core.impl.M mA;
        HashMap map;
        C0199d c0199d;
        f("Transitioning camera internal state: " + F.j(this.f13166B0) + " --> " + F.j(i7));
        if (AbstractC0198c.J()) {
            AbstractC0198c.Z(F.i(i7), "CX:C2State[" + this + "]");
            if (c0200e != null) {
                this.f13167C++;
            }
            if (this.f13167C > 0) {
                AbstractC0198c.Z(c0200e != null ? c0200e.f2013a : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.f13166B0 = i7;
        switch (F.i(i7)) {
            case 0:
                g7 = androidx.camera.core.impl.G.RELEASED;
                break;
            case 1:
                g7 = androidx.camera.core.impl.G.RELEASING;
                break;
            case 2:
                g7 = androidx.camera.core.impl.G.CLOSED;
                break;
            case 3:
                g7 = androidx.camera.core.impl.G.PENDING_OPEN;
                break;
            case 4:
            case 5:
                g7 = androidx.camera.core.impl.G.CLOSING;
                break;
            case 6:
            case 7:
                g7 = androidx.camera.core.impl.G.OPENING;
                break;
            case 8:
                g7 = androidx.camera.core.impl.G.OPEN;
                break;
            case 9:
                g7 = androidx.camera.core.impl.G.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(F.j(i7)));
        }
        androidx.camera.core.impl.N n10 = this.f13170M;
        synchronized (n10.f13935b) {
            try {
                int i10 = n10.f13939f;
                if (g7 == androidx.camera.core.impl.G.RELEASED) {
                    androidx.camera.core.impl.M m7 = (androidx.camera.core.impl.M) n10.f13938e.remove(this);
                    if (m7 != null) {
                        n10.b();
                        g10 = m7.f13920a;
                    } else {
                        g10 = null;
                    }
                } else {
                    androidx.camera.core.impl.M m10 = (androidx.camera.core.impl.M) n10.f13938e.get(this);
                    p118hf.a.j(m10, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    androidx.camera.core.impl.G g11 = m10.f13920a;
                    m10.f13920a = g7;
                    androidx.camera.core.impl.G g12 = androidx.camera.core.impl.G.OPENING;
                    if (g7 == g12) {
                        p118hf.a.k(g7.f13870a || g11 == g12, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                    }
                    if (g11 != g7) {
                        androidx.camera.core.impl.N.c(this, g7);
                        n10.b();
                    }
                    g10 = g11;
                }
                if (g10 != g7) {
                    if (n10.f13937d.f917f == 2 && g7 == androidx.camera.core.impl.G.CONFIGURED) {
                        String pairedConcurrentCameraId = n10.f13937d.getPairedConcurrentCameraId(((CameraInfoInternal) getCameraInfo()).getCameraId());
                        if (pairedConcurrentCameraId != null) {
                            mA = n10.a(pairedConcurrentCameraId);
                        } else {
                            mA = null;
                        }
                    } else {
                        mA = null;
                    }
                    if (i10 < 1 && n10.f13939f > 0) {
                        map = new HashMap();
                        for (Map.Entry entry : n10.f13938e.entrySet()) {
                            if (((androidx.camera.core.impl.M) entry.getValue()).f13920a == androidx.camera.core.impl.G.PENDING_OPEN) {
                                map.put((Camera) entry.getKey(), (androidx.camera.core.impl.M) entry.getValue());
                            }
                        }
                    } else if (g7 != androidx.camera.core.impl.G.PENDING_OPEN || n10.f13939f <= 0) {
                        map = null;
                    } else {
                        map = new HashMap();
                        map.put(this, (androidx.camera.core.impl.M) n10.f13938e.get(this));
                    }
                    if (map != null && !z3) {
                        map.remove(this);
                    }
                    if (map != null) {
                        for (androidx.camera.core.impl.M m11 : map.values()) {
                            m11.getClass();
                            try {
                                m11.f13921b.execute(new W8.o(m11.f13923d, 13));
                            } catch (RejectedExecutionException e10) {
                                p140j8.f.h("CameraStateRegistry", "Unable to notify camera to open.", e10);
                            }
                        }
                    }
                    if (mA != null) {
                        try {
                            mA.f13921b.execute(new W8.o(mA.f13922c, 14));
                        } catch (RejectedExecutionException e11) {
                            p140j8.f.h("CameraStateRegistry", "Unable to notify camera to configure.", e11);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13179e.f14100a.i(new C0988k0(g7));
        C0926f c0926f = this.f13180f;
        c0926f.getClass();
        switch (g7) {
            case RELEASED:
            case CLOSED:
                c0199d = new C0199d(5, c0200e);
                break;
            case RELEASING:
            case CLOSING:
                c0199d = new C0199d(4, c0200e);
                break;
            case PENDING_OPEN:
                androidx.camera.core.impl.N n11 = (androidx.camera.core.impl.N) c0926f.f13512a;
                synchronized (n11.f13935b) {
                    Iterator it = n11.f13938e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c0199d = new C0199d(1, null);
                        } else if (((androidx.camera.core.impl.M) ((Map.Entry) it.next()).getValue()).f13920a == androidx.camera.core.impl.G.CLOSING) {
                            c0199d = new C0199d(2, null);
                        }
                    }
                }
                break;
            case OPENING:
                c0199d = new C0199d(2, c0200e);
                break;
            case OPEN:
            case CONFIGURED:
                c0199d = new C0199d(3, c0200e);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + g7);
        }
        c0199d.toString();
        g7.toString();
        Objects.toString(c0200e);
        p140j8.f.G("CameraStateMachine");
        if (Objects.equals((C0199d) ((androidx.lifecycle.F) c0926f.f13513b).d(), c0199d)) {
            return;
        }
        c0199d.toString();
        p140j8.f.G("CameraStateMachine");
        ((androidx.lifecycle.F) c0926f.f13513b).i(c0199d);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final ListenableFuture release() {
        return AbstractC0198c.y(new r(this, 4));
    }

    public final void s(int i7) {
        r(i7, null, true);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setActiveResumingMode(boolean z3) {
        this.f13177c.execute(new D.b(this, z3, 10));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setExtendedConfig(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = androidx.camera.core.impl.D.f13854a;
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.f13191t0 = cameraConfig;
        synchronized (this.f13192u0) {
            this.f13194v0 = sessionProcessor;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setPrimary(boolean z3) {
        this.f13184k0 = z3;
    }

    public final ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            E.n0 n0Var = (E.n0) it.next();
            boolean z3 = this.f13184k0;
            String strJ = j(n0Var);
            Class<?> cls = n0Var.getClass();
            androidx.camera.core.impl.H0 h7 = z3 ? n0Var.f2085m : n0Var.f2086n;
            UseCaseConfig useCaseConfig = n0Var.f2078f;
            C0993n c0993n = n0Var.f2079g;
            arrayList2.add(new C0920c(strJ, cls, h7, useCaseConfig, c0993n != null ? c0993n.f14108a : null, c0993n, n0Var.b() != null ? androidx.camera.core.streamsharing.d.H(n0Var) : null));
        }
        return arrayList2;
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f13183j.f13228a);
    }

    public final void u(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.f13175a.g().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            C0920c c0920c = (C0920c) it.next();
            if (!this.f13175a.i(c0920c.f13363a)) {
                org.greenrobot.eventbus.f fVar = this.f13175a;
                String str = c0920c.f13363a;
                androidx.camera.core.impl.H0 h7 = c0920c.f13365c;
                UseCaseConfig useCaseConfig = c0920c.f13366d;
                C0993n c0993n = c0920c.f13368f;
                ArrayList arrayList3 = c0920c.f13369g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f41079b;
                androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) linkedHashMap.get(str);
                if (r3 == null) {
                    r3 = new androidx.camera.core.impl.R0(h7, useCaseConfig, c0993n, arrayList3);
                    linkedHashMap.put(str, r3);
                }
                r3.f13953e = true;
                fVar.j(str, h7, useCaseConfig, c0993n, arrayList3);
                arrayList2.add(c0920c.f13363a);
                if (c0920c.f13364b == E.b0.class && (size = c0920c.f13367e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        f("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f13181g.j(true);
            C0944o c0944o = this.f13181g;
            synchronized (c0944o.f13606d) {
                c0944o.f13618p++;
            }
        }
        a();
        y();
        x();
        q();
        if (this.f13166B0 == 9) {
            n();
        } else {
            o();
        }
        if (rational != null) {
            this.f13181g.f13610h.f13207e = rational;
        }
    }

    public final void v(boolean z3) {
        f("Attempting to force open the camera.");
        if (this.f13170M.d(this)) {
            m(z3);
        } else {
            f("No cameras available. Waiting for available camera before opening camera.");
            s(4);
        }
    }

    public final void w(boolean z3) {
        f("Attempting to open the camera.");
        if (this.f13168H.f13113b && this.f13170M.d(this)) {
            m(z3);
        } else {
            f("No cameras available. Waiting for available camera before opening camera.");
            s(4);
        }
    }

    public final void x() {
        org.greenrobot.eventbus.f fVar = this.f13175a;
        fVar.getClass();
        androidx.camera.core.impl.G0 g7 = new androidx.camera.core.impl.G0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) fVar.f41079b).entrySet()) {
            androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) entry.getValue();
            if (r3.f13954f && r3.f13953e) {
                String str = (String) entry.getKey();
                g7.a(r3.f13949a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        p140j8.f.G("UseCaseAttachState");
        boolean z3 = g7.f13873k && g7.f13872j;
        C0944o c0944o = this.f13181g;
        if (!z3) {
            c0944o.f13625x = 1;
            c0944o.f13610h.f13216n = 1;
            c0944o.f13616n.f13536h = 1;
            this.t.setSessionConfig(c0944o.getSessionConfig());
            return;
        }
        int i7 = g7.b().f13886g.f13968c;
        c0944o.f13625x = i7;
        c0944o.f13610h.f13216n = i7;
        c0944o.f13616n.f13536h = i7;
        g7.a(c0944o.getSessionConfig());
        this.t.setSessionConfig(g7.b());
    }

    public final void y() {
        Iterator it = this.f13175a.h().iterator();
        boolean zIsZslDisabled = false;
        while (it.hasNext()) {
            zIsZslDisabled |= ((UseCaseConfig) it.next()).isZslDisabled(false);
        }
        this.f13181g.f13614l.f13587c = zIsZslDisabled;
    }
}
