package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0216v;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0987k;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962x0 implements CaptureSessionInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0960w0 f13672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SynchronizedCaptureSession.Opener f13673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SynchronizedCaptureSession f13674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.H0 f13675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f13676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f13677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.concurrent.futures.m f13679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.concurrent.futures.k f13680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f13681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E.N f13682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E.N f13683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C9.N f13684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.params.b f13685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N7.a f13686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13687r;

    public C0962x0(androidx.camera.camera2.internal.compat.params.b bVar, boolean z3) {
        this(bVar, new androidx.camera.core.impl.y0(Collections.EMPTY_LIST), z3);
    }

    public static N b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback n10;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0999q abstractC0999q = (AbstractC0999q) it.next();
            if (abstractC0999q == null) {
                n10 = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                D3.a.I(abstractC0999q, arrayList2);
                n10 = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new N(arrayList2);
            }
            arrayList.add(n10);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new N(arrayList);
    }

    public static HashMap c(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.a((Surface) map2.get(((C0987k) it.next()).f14094a));
                AbstractC0952s0.b();
                throw null;
            }
            p140j8.f.g("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
        }
        return map3;
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0987k c0987k = (C0987k) it.next();
            if (c0987k.f14097d > 0 && c0987k.f14095b.isEmpty()) {
                int i7 = c0987k.f14097d;
                List arrayList2 = (List) map.get(Integer.valueOf(i7));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i7), arrayList2);
                }
                arrayList2.add(c0987k);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void a() {
        synchronized (this.f13670a) {
            int i7 = this.f13678i;
            if (i7 != 5) {
                p140j8.f.g("CaptureSession", "Unable to abort captures. Incorrect state:".concat(F.k(i7)));
                return;
            }
            try {
                this.f13674e.abortCaptures();
            } catch (CameraAccessException e10) {
                p140j8.f.h("CaptureSession", "Unable to abort captures.", e10);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void cancelIssuedCaptureRequests() {
        ArrayList<androidx.camera.core.impl.T> arrayList;
        synchronized (this.f13670a) {
            try {
                if (this.f13671b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f13671b);
                    this.f13671b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.T t : arrayList) {
                Iterator it = t.f13970e.iterator();
                while (it.hasNext()) {
                    ((AbstractC0999q) it.next()).a(t.a());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void close() {
        synchronized (this.f13670a) {
            try {
                int i7 = F.i(this.f13678i);
                if (i7 == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(F.k(this.f13678i)));
                }
                if (i7 == 1) {
                    this.f13678i = 8;
                } else if (i7 == 2) {
                    p118hf.a.j(this.f13673d, "The Opener shouldn't null in state:".concat(F.k(this.f13678i)));
                    this.f13673d.stop();
                    this.f13678i = 8;
                } else if (i7 == 3 || i7 == 4) {
                    p118hf.a.j(this.f13673d, "The Opener shouldn't null in state:".concat(F.k(this.f13678i)));
                    this.f13673d.stop();
                    this.f13678i = 6;
                    this.f13684o.n();
                    this.f13675f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f13678i == 8) {
            p140j8.f.G("CaptureSession");
            return;
        }
        this.f13678i = 8;
        this.f13674e = null;
        androidx.concurrent.futures.k kVar = this.f13680k;
        if (kVar != null) {
            kVar.b(null);
            this.f13680k = null;
        }
    }

    public final androidx.camera.camera2.internal.compat.params.h e(C0987k c0987k, HashMap map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = (Surface) map.get(c0987k.f14094a);
        p118hf.a.j(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        androidx.camera.camera2.internal.compat.params.h hVar = new androidx.camera.camera2.internal.compat.params.h(c0987k.f14097d, surface);
        if (str != null) {
            hVar.f(str);
        } else {
            hVar.f(null);
        }
        int i7 = c0987k.f14096c;
        if (i7 == 0) {
            hVar.e(1);
        } else if (i7 == 1) {
            hVar.e(2);
        }
        List list = c0987k.f14095b;
        if (!list.isEmpty()) {
            hVar.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC0970b0) it.next());
                p118hf.a.j(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                hVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f13685p.d()) == null) {
            jLongValue = 1;
        } else {
            C0216v c0216v = c0987k.f14098e;
            Long lA = androidx.camera.camera2.internal.compat.params.a.a(c0216v, dynamicRangeProfilesD);
            if (lA == null) {
                p140j8.f.g("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c0216v);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        hVar.d(jLongValue);
        return hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int g(ArrayList arrayList) {
        CameraCaptureResult cameraCaptureResult;
        synchronized (this.f13670a) {
            try {
                if (this.f13678i != 5) {
                    p140j8.f.G("CaptureSession");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    C0942n c0942n = new C0942n(1);
                    ArrayList arrayList2 = new ArrayList();
                    p140j8.f.G("CaptureSession");
                    Iterator it = arrayList.iterator();
                    boolean z3 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.T t = (androidx.camera.core.impl.T) it.next();
                        if (!Collections.unmodifiableList(t.f13966a).isEmpty()) {
                            Iterator it2 = Collections.unmodifiableList(t.f13966a).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (t.f13968c == 2) {
                                        z3 = true;
                                    }
                                    androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S(t);
                                    if (t.f13968c == 5 && (cameraCaptureResult = t.f13973h) != null) {
                                        s3.f13962h = cameraCaptureResult;
                                    }
                                    androidx.camera.core.impl.H0 h7 = this.f13675f;
                                    if (h7 != null) {
                                        s3.c(h7.f13886g.f13967b);
                                    }
                                    s3.c(t.f13967b);
                                    CaptureRequest captureRequestI = org.chromium.support_lib_boundary.util.b.i(s3.d(), this.f13674e.getDevice(), this.f13676g, false, this.f13686q);
                                    if (captureRequestI != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = t.f13970e.iterator();
                                        while (it3.hasNext()) {
                                            D3.a.I((AbstractC0999q) it3.next(), arrayList3);
                                        }
                                        c0942n.a(captureRequestI, arrayList3);
                                        arrayList2.add(captureRequestI);
                                        break;
                                    }
                                    p140j8.f.G("CaptureSession");
                                    return -1;
                                }
                                AbstractC0970b0 abstractC0970b0 = (AbstractC0970b0) it2.next();
                                if (!this.f13676g.containsKey(abstractC0970b0)) {
                                    Objects.toString(abstractC0970b0);
                                    p140j8.f.G("CaptureSession");
                                    break;
                                }
                            }
                        } else {
                            p140j8.f.G("CaptureSession");
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        p140j8.f.G("CaptureSession");
                        return -1;
                    }
                    if (this.f13682m.c(arrayList2, z3)) {
                        this.f13674e.stopRepeating();
                        c0942n.f13601c = new C0956u0(this);
                    }
                    if (this.f13683n.b(arrayList2, z3)) {
                        c0942n.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new N(this)));
                    }
                    return this.f13674e.captureBurstRequests(arrayList2, c0942n);
                } catch (CameraAccessException e10) {
                    p140j8.f.g("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final List getCaptureConfigs() {
        List listUnmodifiableList;
        synchronized (this.f13670a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f13671b);
        }
        return listUnmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final androidx.camera.core.impl.H0 getSessionConfig() {
        androidx.camera.core.impl.H0 h7;
        synchronized (this.f13670a) {
            h7 = this.f13675f;
        }
        return h7;
    }

    public final int h(androidx.camera.core.impl.H0 h7) {
        synchronized (this.f13670a) {
            try {
                if (h7 == null) {
                    p140j8.f.G("CaptureSession");
                    return -1;
                }
                if (this.f13678i != 5) {
                    p140j8.f.G("CaptureSession");
                    return -1;
                }
                androidx.camera.core.impl.T t = h7.f13886g;
                if (Collections.unmodifiableList(t.f13966a).isEmpty()) {
                    p140j8.f.G("CaptureSession");
                    try {
                        this.f13674e.stopRepeating();
                    } catch (CameraAccessException e10) {
                        p140j8.f.g("CaptureSession", "Unable to access camera: " + e10.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    p140j8.f.G("CaptureSession");
                    CaptureRequest captureRequestI = org.chromium.support_lib_boundary.util.b.i(t, this.f13674e.getDevice(), this.f13676g, true, this.f13686q);
                    if (captureRequestI == null) {
                        p140j8.f.G("CaptureSession");
                        return -1;
                    }
                    return this.f13674e.setSingleRepeatingRequest(captureRequestI, this.f13684o.a(b(t.f13970e, new CameraCaptureSession.CaptureCallback[0])));
                } catch (CameraAccessException e11) {
                    p140j8.f.g("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                throw th;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f13670a) {
            int i7 = this.f13678i;
            if (i7 != 5) {
                p140j8.f.g("CaptureSession", "Unable to stop repeating. Incorrect state:".concat(F.k(i7)));
                return;
            }
            try {
                this.f13674e.stopRepeating();
            } catch (CameraAccessException e10) {
                p140j8.f.h("CaptureSession", "Unable to stop repeating.", e10);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final boolean isInOpenState() {
        boolean z3;
        synchronized (this.f13670a) {
            int i7 = this.f13678i;
            z3 = i7 == 5 || i7 == 4;
        }
        return z3;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void issueCaptureRequests(List list) {
        synchronized (this.f13670a) {
            try {
                switch (F.i(this.f13678i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(F.k(this.f13678i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f13671b.addAll(list);
                        break;
                    case 4:
                        this.f13671b.addAll(list);
                        this.f13684o.c().addListener(new RunnableC0961x(this, 4), org.chromium.support_lib_boundary.util.b.u());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture open(final androidx.camera.core.impl.H0 h7, final CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        synchronized (this.f13670a) {
            try {
                if (F.i(this.f13678i) != 1) {
                    p140j8.f.g("CaptureSession", "Open not allowed in state: ".concat(F.k(this.f13678i)));
                    return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("open() should not allow the state: ".concat(F.k(this.f13678i))), 1);
                }
                this.f13678i = 3;
                ArrayList arrayList = new ArrayList(h7.b());
                this.f13677h = arrayList;
                this.f13673d = opener;
                androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(opener.startWithDeferrableSurface(arrayList, 5000L));
                AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.t0
                    /* JADX WARN: Code duplicated, block: B:39:0x0140 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:4:0x0016, B:10:0x0025, B:11:0x0039, B:15:0x003e, B:16:0x0044, B:18:0x004a, B:19:0x005f, B:20:0x00bc, B:22:0x00c2, B:23:0x00da, B:25:0x00ec, B:27:0x00f0, B:28:0x00fc, B:29:0x0116, B:31:0x011c, B:33:0x012a, B:35:0x0132, B:39:0x0140, B:41:0x0152, B:44:0x0168, B:45:0x0174, B:46:0x0187, B:48:0x018d, B:51:0x01a0, B:52:0x01ad, B:54:0x01bb, B:56:0x01bf, B:57:0x01c6, B:58:0x01e7, B:60:0x01ed, B:61:0x01fd, B:63:0x0217, B:67:0x021d, B:68:0x0225, B:70:0x0227, B:71:0x022d, B:73:0x022f, B:74:0x0244), top: B:80:0x0016, inners: #0 }] */
                    /* JADX WARN: Code duplicated, block: B:41:0x0152 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:4:0x0016, B:10:0x0025, B:11:0x0039, B:15:0x003e, B:16:0x0044, B:18:0x004a, B:19:0x005f, B:20:0x00bc, B:22:0x00c2, B:23:0x00da, B:25:0x00ec, B:27:0x00f0, B:28:0x00fc, B:29:0x0116, B:31:0x011c, B:33:0x012a, B:35:0x0132, B:39:0x0140, B:41:0x0152, B:44:0x0168, B:45:0x0174, B:46:0x0187, B:48:0x018d, B:51:0x01a0, B:52:0x01ad, B:54:0x01bb, B:56:0x01bf, B:57:0x01c6, B:58:0x01e7, B:60:0x01ed, B:61:0x01fd, B:63:0x0217, B:67:0x021d, B:68:0x0225, B:70:0x0227, B:71:0x022d, B:73:0x022f, B:74:0x0244), top: B:80:0x0016, inners: #0 }] */
                    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        InputConfiguration inputConfiguration;
                        int i7;
                        androidx.camera.camera2.internal.compat.params.h hVarE;
                        HashMap map;
                        int i10 = 2;
                        C0962x0 c0962x0 = this.f13650a;
                        androidx.camera.core.impl.H0 h10 = h7;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (c0962x0.f13670a) {
                            try {
                                int i11 = F.i(c0962x0.f13678i);
                                if (i11 != 0 && i11 != 1) {
                                    if (i11 == 2) {
                                        c0962x0.f13676g.clear();
                                        for (int i12 = 0; i12 < list.size(); i12++) {
                                            c0962x0.f13676g.put((AbstractC0970b0) c0962x0.f13677h.get(i12), (Surface) list.get(i12));
                                        }
                                        c0962x0.f13678i = 4;
                                        p140j8.f.G("CaptureSession");
                                        C0960w0 c0960w0 = new C0960w0(Arrays.asList(c0962x0.f13672c, new C0960w0(h10.f13883d, 1)), 2);
                                        androidx.camera.core.impl.T t = h10.f13886g;
                                        androidx.camera.camera2.impl.b bVar = new androidx.camera.camera2.impl.b(t.f13967b, i10);
                                        HashSet hashSet = new HashSet();
                                        C0992m0.b();
                                        ArrayList arrayList2 = new ArrayList();
                                        C0996o0.a();
                                        hashSet.addAll(t.f13966a);
                                        C0992m0 c0992m0C = C0992m0.c(t.f13967b);
                                        int i13 = t.f13968c;
                                        arrayList2.addAll(t.f13970e);
                                        boolean z3 = t.f13971f;
                                        ArrayMap arrayMap = new ArrayMap();
                                        androidx.camera.core.impl.O0 o10 = t.f13972g;
                                        Iterator it = o10.f13941a.keySet().iterator();
                                        while (it.hasNext()) {
                                            Iterator it2 = it;
                                            String str = (String) it.next();
                                            arrayMap.put(str, o10.f13941a.get(str));
                                            it = it2;
                                        }
                                        C0996o0 c0996o0 = new C0996o0(arrayMap);
                                        boolean z8 = t.f13969d;
                                        HashMap map2 = new HashMap();
                                        if (c0962x0.f13687r && Build.VERSION.SDK_INT >= 35) {
                                            map2 = C0962x0.c(C0962x0.f(h10.f13880a), c0962x0.f13676g);
                                        }
                                        ArrayList<androidx.camera.camera2.internal.compat.params.h> arrayList3 = new ArrayList();
                                        String str2 = (String) ((Config) bVar.f41079b).retrieveOption(androidx.camera.camera2.impl.b.f13111i, null);
                                        for (C0987k c0987k : h10.f13880a) {
                                            C0992m0 c0992m0 = c0992m0C;
                                            if (c0962x0.f13687r) {
                                                i7 = i13;
                                                hVarE = Build.VERSION.SDK_INT >= 35 ? (androidx.camera.camera2.internal.compat.params.h) map2.get(c0987k) : null;
                                                if (hVarE == null) {
                                                    hVarE = c0962x0.e(c0987k, c0962x0.f13676g, str2);
                                                    map = map2;
                                                    if (c0962x0.f13681l.containsKey(c0987k.f14094a)) {
                                                        hVarE.g(((Long) c0962x0.f13681l.get(c0987k.f14094a)).longValue());
                                                    }
                                                    arrayList3.add(hVarE);
                                                    z3 = z3;
                                                    c0992m0C = c0992m0;
                                                    i13 = i7;
                                                    map2 = map;
                                                } else {
                                                    map = map2;
                                                }
                                                arrayList3.add(hVarE);
                                                z3 = z3;
                                                c0992m0C = c0992m0;
                                                i13 = i7;
                                                map2 = map;
                                            } else {
                                                i7 = i13;
                                            }
                                            if (hVarE == null) {
                                                hVarE = c0962x0.e(c0987k, c0962x0.f13676g, str2);
                                                map = map2;
                                                if (c0962x0.f13681l.containsKey(c0987k.f14094a)) {
                                                    hVarE.g(((Long) c0962x0.f13681l.get(c0987k.f14094a)).longValue());
                                                }
                                                arrayList3.add(hVarE);
                                                z3 = z3;
                                                c0992m0C = c0992m0;
                                                i13 = i7;
                                                map2 = map;
                                            } else {
                                                map = map2;
                                            }
                                            arrayList3.add(hVarE);
                                            z3 = z3;
                                            c0992m0C = c0992m0;
                                            i13 = i7;
                                            map2 = map;
                                        }
                                        C0992m0 c0992m1 = c0992m0C;
                                        int i14 = i13;
                                        boolean z10 = z3;
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (androidx.camera.camera2.internal.compat.params.h hVar : arrayList3) {
                                            if (!arrayList4.contains(hVar.f13422a.getSurface())) {
                                                arrayList4.add(hVar.f13422a.getSurface());
                                                arrayList5.add(hVar);
                                            }
                                        }
                                        androidx.camera.camera2.internal.compat.params.r rVarCreateSessionConfigurationCompat = c0962x0.f13673d.createSessionConfigurationCompat(0, arrayList5, c0960w0);
                                        if (h10.f13886g.f13968c == 5 && (inputConfiguration = h10.f13887h) != null) {
                                            rVarCreateSessionConfigurationCompat.f(androidx.camera.camera2.internal.compat.params.g.a(inputConfiguration));
                                        }
                                        try {
                                            ArrayList arrayList6 = new ArrayList(hashSet);
                                            C1000q0 c1000q0A = C1000q0.a(c0992m1);
                                            ArrayList arrayList7 = new ArrayList(arrayList2);
                                            androidx.camera.core.impl.O0 o11 = androidx.camera.core.impl.O0.f13940b;
                                            ArrayMap arrayMap2 = new ArrayMap();
                                            for (String str3 : c0996o0.f13941a.keySet()) {
                                                arrayMap2.put(str3, c0996o0.f13941a.get(str3));
                                            }
                                            CaptureRequest captureRequestK = org.chromium.support_lib_boundary.util.b.k(new androidx.camera.core.impl.T(arrayList6, c1000q0A, i14, z8, arrayList7, z10, new androidx.camera.core.impl.O0(arrayMap2), null), cameraDevice2, c0962x0.f13686q);
                                            if (captureRequestK != null) {
                                                rVarCreateSessionConfigurationCompat.g(captureRequestK);
                                            }
                                            return c0962x0.f13673d.openCaptureSession(cameraDevice2, rVarCreateSessionConfigurationCompat, c0962x0.f13677h);
                                        } catch (CameraAccessException e10) {
                                            return new androidx.camera.core.impl.utils.futures.l(e10, 1);
                                        }
                                    }
                                    if (i11 != 4) {
                                        return new androidx.camera.core.impl.utils.futures.l(new CancellationException("openCaptureSession() not execute in state: ".concat(F.k(c0962x0.f13678i))), 1);
                                    }
                                }
                                return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(F.k(c0962x0.f13678i))), 1);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
                Executor executor = this.f13673d.getExecutor();
                bVarA.getClass();
                androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(bVarA, asyncFunction, executor);
                C0958v0 c0958v0 = new C0958v0(this);
                aVarI.addListener(new androidx.camera.core.impl.utils.futures.i(0, aVarI, c0958v0), this.f13673d.getExecutor());
                return androidx.camera.core.impl.utils.futures.j.e(aVarI);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture release(boolean z3) {
        synchronized (this.f13670a) {
            switch (F.i(this.f13678i)) {
                case 0:
                    throw new IllegalStateException("release() should not be possible in state: ".concat(F.k(this.f13678i)));
                case 2:
                    p118hf.a.j(this.f13673d, "The Opener shouldn't null in state:".concat(F.k(this.f13678i)));
                    this.f13673d.stop();
                case 1:
                    this.f13678i = 8;
                    return androidx.camera.core.impl.utils.futures.l.f14212c;
                case 4:
                case 5:
                    SynchronizedCaptureSession synchronizedCaptureSession = this.f13674e;
                    if (synchronizedCaptureSession != null) {
                        if (z3) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (CameraAccessException e10) {
                                p140j8.f.h("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f13674e.close();
                        break;
                    }
                case 3:
                    this.f13678i = 7;
                    this.f13684o.n();
                    p118hf.a.j(this.f13673d, "The Opener shouldn't null in state:".concat(F.k(this.f13678i)));
                    if (this.f13673d.stop()) {
                        d();
                        return androidx.camera.core.impl.utils.futures.l.f14212c;
                    }
                case 6:
                    if (this.f13679j == null) {
                        this.f13679j = AbstractC0198c.y(new C0956u0(this));
                    }
                    return this.f13679j;
                default:
                    return androidx.camera.core.impl.utils.futures.l.f14212c;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void setSessionConfig(androidx.camera.core.impl.H0 h7) {
        synchronized (this.f13670a) {
            try {
                switch (F.i(this.f13678i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(F.k(this.f13678i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f13675f = h7;
                        break;
                    case 4:
                        this.f13675f = h7;
                        if (h7 == null) {
                            return;
                        }
                        if (!this.f13676g.keySet().containsAll(h7.b())) {
                            p140j8.f.g("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            p140j8.f.G("CaptureSession");
                            h(this.f13675f);
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void setStreamUseCaseMap(Map map) {
        synchronized (this.f13670a) {
            this.f13681l = map;
        }
    }

    public C0962x0(androidx.camera.camera2.internal.compat.params.b bVar, androidx.camera.core.impl.y0 y0Var, boolean z3) {
        this.f13670a = new Object();
        this.f13671b = new ArrayList();
        this.f13676g = new HashMap();
        this.f13677h = Collections.EMPTY_LIST;
        this.f13678i = 1;
        this.f13681l = new HashMap();
        this.f13682m = new E.N(3);
        this.f13683n = new E.N(4);
        this.f13678i = 2;
        this.f13685p = bVar;
        this.f13672c = new C0960w0(this);
        this.f13684o = new C9.N(y0Var.a(CaptureNoResponseQuirk.class));
        this.f13686q = new N7.a(y0Var, 3);
        this.f13687r = z3;
    }
}
