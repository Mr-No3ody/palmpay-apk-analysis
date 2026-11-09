package androidx.camera.core.internal;

import E.C0216v;
import E.L;
import E.P;
import E.U;
import E.Z;
import E.b0;
import E.n0;
import E.q0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0967a;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.C1003s0;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.impl.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Camera {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public n0 f14327A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public androidx.camera.core.streamsharing.d f14328B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final z0 f14329C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final A0 f14330H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final A0 f14331L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final U f14332M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U f14333Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraInternal f14334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraInternal f14335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraDeviceSurfaceManager f14336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UseCaseConfigFactory f14337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f14338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14340g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CameraCoordinator f14341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q0 f14342j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f14343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CameraConfig f14344p;
    public final Object t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Config f14346w;

    public f(CameraInternal cameraInternal, CameraInternal cameraInternal2, A0 a3, A0 a10, CameraCoordinator cameraCoordinator, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        U u6 = U.f1955a;
        this.f14339f = new ArrayList();
        this.f14340g = new ArrayList();
        this.f14343o = Collections.EMPTY_LIST;
        this.t = new Object();
        this.f14345v = true;
        this.f14346w = null;
        this.f14334a = cameraInternal;
        this.f14335b = cameraInternal2;
        this.f14332M = u6;
        this.f14333Q = u6;
        this.f14341i = cameraCoordinator;
        this.f14336c = cameraDeviceSurfaceManager;
        this.f14337d = useCaseConfigFactory;
        CameraConfig cameraConfig = a3.f13837f;
        this.f14344p = cameraConfig;
        this.f14329C = new z0(cameraInternal.getCameraControlInternal(), cameraConfig.getSessionProcessor(null));
        this.f14330H = a3;
        this.f14331L = a10;
        this.f14338e = i(a3, a10);
    }

    public static Matrix d(Rect rect, Size size) {
        p118hf.a.g(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static a i(A0 a3, A0 a10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a3.f14047a.getCameraId());
        sb2.append(a10 == null ? "" : a10.f14047a.getCameraId());
        return new a(sb2.toString(), a3.f13837f.getCompatibilityId());
    }

    public static HashMap k(List list, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        UseCaseConfig useCaseConfigE;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if (n0Var instanceof androidx.camera.core.streamsharing.d) {
                androidx.camera.core.streamsharing.d dVar = (androidx.camera.core.streamsharing.d) n0Var;
                UseCaseConfig useCaseConfigE2 = new Z().build().e(false, useCaseConfigFactory);
                if (useCaseConfigE2 == null) {
                    useCaseConfigE = null;
                } else {
                    C0992m0 c0992m0C = C0992m0.c(useCaseConfigE2);
                    c0992m0C.removeOption(TargetConfig.f14307d0);
                    useCaseConfigE = ((androidx.camera.core.streamsharing.e) dVar.k(c0992m0C)).getUseCaseConfig();
                }
            } else {
                useCaseConfigE = n0Var.e(false, useCaseConfigFactory);
            }
            UseCaseConfig useCaseConfigE3 = n0Var.e(true, useCaseConfigFactory2);
            e eVar = new e();
            eVar.f14325a = useCaseConfigE;
            eVar.f14326b = useCaseConfigE3;
            map.put(n0Var, eVar);
        }
        return map;
    }

    public static boolean o(C0993n c0993n, H0 h7) {
        C1000q0 c1000q0 = h7.f13886g.f13967b;
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        if (bVar.listOptions().size() != h7.f13886g.f13967b.listOptions().size()) {
            return true;
        }
        for (V v3 : bVar.listOptions()) {
            if (!c1000q0.f14126a.containsKey(v3) || !Objects.equals(c1000q0.retrieveOption(v3), bVar.retrieveOption(v3))) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if (n0Var instanceof P) {
                UseCaseConfig useCaseConfig = n0Var.f2078f;
                C0971c c0971c = C0982h0.f14073f;
                if (useCaseConfig.containsOption(c0971c)) {
                    Integer num = (Integer) useCaseConfig.retrieveOption(c0971c);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean q(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if (n0Var != null) {
                if (!n0Var.f2078f.containsOption(UseCaseConfig.f13990V)) {
                    Log.e("CameraUseCaseAdapter", n0Var + " UseCase does not have capture type.");
                } else if (n0Var.f2078f.getCaptureType() == T0.f13977d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList s(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        return arrayList2;
    }

    public final void a(Collection collection) {
        synchronized (this.t) {
            try {
                this.f14334a.setExtendedConfig(this.f14344p);
                CameraInternal cameraInternal = this.f14335b;
                if (cameraInternal != null) {
                    cameraInternal.setExtendedConfig(this.f14344p);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f14339f);
                linkedHashSet.addAll(collection);
                try {
                    t(linkedHashSet, this.f14335b != null);
                } catch (IllegalArgumentException e10) {
                    throw new d(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.t) {
            try {
                if (!this.f14345v) {
                    if (!this.f14340g.isEmpty()) {
                        this.f14334a.setExtendedConfig(this.f14344p);
                        CameraInternal cameraInternal = this.f14335b;
                        if (cameraInternal != null) {
                            cameraInternal.setExtendedConfig(this.f14344p);
                        }
                    }
                    this.f14334a.attachUseCases(this.f14340g);
                    CameraInternal cameraInternal2 = this.f14335b;
                    if (cameraInternal2 != null) {
                        cameraInternal2.attachUseCases(this.f14340g);
                    }
                    synchronized (this.t) {
                        try {
                            if (this.f14346w != null) {
                                this.f14334a.getCameraControlInternal().addInteropConfig(this.f14346w);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f14340g.iterator();
                    while (it.hasNext()) {
                        ((n0) it.next()).p();
                    }
                    this.f14345v = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    public final n0 c(LinkedHashSet linkedHashSet, androidx.camera.core.streamsharing.d dVar) {
        boolean z3;
        boolean z8;
        n0 n0VarA;
        synchronized (this.t) {
            try {
                ArrayList<n0> arrayList = new ArrayList(linkedHashSet);
                if (dVar != null) {
                    arrayList.add(dVar);
                    arrayList.removeAll(dVar.f14474p.f14491a);
                }
                synchronized (this.t) {
                    z3 = false;
                    z8 = this.f14344p.getUseCaseCombinationRequiredRule() == 1;
                }
                if (z8) {
                    boolean z10 = false;
                    boolean z11 = false;
                    for (n0 n0Var : arrayList) {
                        if ((n0Var instanceof b0) || (n0Var instanceof androidx.camera.core.streamsharing.d)) {
                            z11 = true;
                        } else if (n0Var instanceof P) {
                            z10 = true;
                        }
                    }
                    if (!z10 || z11) {
                        boolean z12 = false;
                        for (n0 n0Var2 : arrayList) {
                            if ((n0Var2 instanceof b0) || (n0Var2 instanceof androidx.camera.core.streamsharing.d)) {
                                z3 = true;
                            } else if (n0Var2 instanceof P) {
                                z12 = true;
                            }
                        }
                        if (!z3 || z12) {
                            n0VarA = null;
                        } else {
                            n0 n0Var3 = this.f14327A;
                            if (n0Var3 instanceof P) {
                                n0VarA = n0Var3;
                            } else {
                                L l5 = new L();
                                l5.f1935a.insertOption(TargetConfig.c0, "ImageCapture-Extra");
                                n0VarA = l5.build();
                            }
                        }
                    } else {
                        n0 n0Var4 = this.f14327A;
                        if (n0Var4 instanceof b0) {
                            n0VarA = n0Var4;
                        } else {
                            Z z13 = new Z();
                            z13.f1976a.insertOption(TargetConfig.c0, "Preview-Extra");
                            b0 b0VarA = z13.build();
                            b0VarA.E(new B8.d(11));
                            n0VarA = b0VarA;
                        }
                    }
                } else {
                    n0VarA = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n0VarA;
    }

    public final HashMap e(int i7, CameraInfoInternal cameraInfoInternal, List list, List list2, HashMap map) {
        Rect sensorRect;
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n0 n0Var = (n0) it.next();
            int inputFormat = n0Var.f2078f.getInputFormat();
            C0993n c0993n = n0Var.f2079g;
            N0 n0TransformSurfaceConfig = this.f14336c.transformSurfaceConfig(i7, cameraId, inputFormat, c0993n != null ? c0993n.f14108a : null);
            int inputFormat2 = n0Var.f2078f.getInputFormat();
            C0993n c0993n2 = n0Var.f2079g;
            Size size = c0993n2 != null ? c0993n2.f14108a : null;
            c0993n2.getClass();
            C0967a c0967a = new C0967a(n0TransformSurfaceConfig, inputFormat2, size, c0993n2.f14109b, androidx.camera.core.streamsharing.d.H(n0Var), n0Var.f2079g.f14111d, n0Var.f2078f.getTargetFrameRate(null));
            arrayList.add(c0967a);
            map3.put(c0967a, n0Var);
            map2.put(n0Var, n0Var.f2079g);
        }
        if (!list.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                sensorRect = this.f14334a.getCameraControlInternal().getSensorRect();
            } catch (NullPointerException unused) {
                sensorRect = null;
            }
            Xe.e eVar = new Xe.e(cameraInfoInternal, sensorRect != null ? o.e(sensorRect) : null);
            Iterator it2 = list.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                n0 n0Var2 = (n0) it2.next();
                e eVar2 = (e) map.get(n0Var2);
                UseCaseConfig useCaseConfigM = n0Var2.m(cameraInfoInternal, eVar2.f14325a, eVar2.f14326b);
                map4.put(useCaseConfigM, n0Var2);
                map5.put(useCaseConfigM, eVar.b(useCaseConfigM));
                UseCaseConfig useCaseConfig = n0Var2.f2078f;
                if (useCaseConfig instanceof C1003s0) {
                    z3 = ((C1003s0) useCaseConfig).getPreviewStabilizationMode() == 2;
                }
            }
            Pair<Map<UseCaseConfig<?>, C0993n>, Map<C0967a, C0993n>> suggestedStreamSpecs = this.f14336c.getSuggestedStreamSpecs(i7, cameraId, arrayList, map5, z3, q(list));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((n0) entry.getValue(), (C0993n) ((Map) suggestedStreamSpecs.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) suggestedStreamSpecs.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((n0) map3.get(entry2.getKey()), (C0993n) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final void f(LinkedHashSet linkedHashSet) {
        if (n()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C0216v dynamicRange = ((n0) it.next()).f2078f.getDynamicRange();
                boolean z3 = false;
                boolean z8 = dynamicRange.f2129b == 10;
                int i7 = dynamicRange.f2128a;
                if (i7 != 1 && i7 != 0) {
                    z3 = true;
                }
                if (z8 || z3) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (p(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.t) {
            try {
                if (!this.f14343o.isEmpty() && p(linkedHashSet)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.camera.core.streamsharing.d g(Collection collection, boolean z3) {
        boolean z8;
        synchronized (this.t) {
            try {
                HashSet<n0> hashSetL = l(collection, z3);
                if (hashSetL.size() >= 2 || (n() && q(hashSetL))) {
                    androidx.camera.core.streamsharing.d dVar = this.f14328B;
                    if (dVar != null && dVar.f14474p.f14491a.equals(hashSetL)) {
                        androidx.camera.core.streamsharing.d dVar2 = this.f14328B;
                        Objects.requireNonNull(dVar2);
                        return dVar2;
                    }
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    for (n0 n0Var : hashSetL) {
                        for (int i7 = 0; i7 < 3; i7++) {
                            int i10 = iArr[i7];
                            Iterator it = n0Var.i().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z8 = false;
                                    break;
                                }
                                int iIntValue = ((Integer) it.next()).intValue();
                                if ((i10 & iIntValue) == iIntValue) {
                                    z8 = true;
                                    break;
                                }
                            }
                            if (z8) {
                                if (hashSet.contains(Integer.valueOf(i10))) {
                                    return null;
                                }
                                hashSet.add(Integer.valueOf(i10));
                            }
                        }
                    }
                    return new androidx.camera.core.streamsharing.d(this.f14334a, this.f14335b, this.f14332M, this.f14333Q, hashSetL, this.f14337d);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl getCameraControl() {
        return this.f14329C;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.f14330H;
    }

    @Override // androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        CameraConfig cameraConfig;
        synchronized (this.t) {
            cameraConfig = this.f14344p;
        }
        return cameraConfig;
    }

    public final void h() {
        synchronized (this.t) {
            try {
                if (this.f14345v) {
                    this.f14334a.detachUseCases(new ArrayList(this.f14340g));
                    CameraInternal cameraInternal = this.f14335b;
                    if (cameraInternal != null) {
                        cameraInternal.detachUseCases(new ArrayList(this.f14340g));
                    }
                    synchronized (this.t) {
                        CameraControlInternal cameraControlInternal = this.f14334a.getCameraControlInternal();
                        this.f14346w = cameraControlInternal.getInteropConfig();
                        cameraControlInternal.clearInteropConfig();
                    }
                    this.f14345v = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(boolean z3, n0... n0VarArr) {
        Collection collectionAsList = Arrays.asList(n0VarArr);
        if (z3) {
            androidx.camera.core.streamsharing.d dVarG = g(collectionAsList, true);
            ArrayList arrayList = new ArrayList(collectionAsList);
            if (dVarG != null) {
                arrayList.add(dVarG);
                arrayList.removeAll(dVarG.f14474p.f14491a);
            }
            collectionAsList = arrayList;
        }
        synchronized (this.t) {
            try {
                try {
                    e(j(), this.f14334a.getCameraInfoInternal(), (List) collectionAsList, Collections.EMPTY_LIST, k((List) collectionAsList, this.f14344p.getUseCaseConfigFactory(), this.f14337d));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final int j() {
        synchronized (this.t) {
            try {
                return this.f14341i.getCameraOperatingMode() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet l(Collection collection, boolean z3) {
        int i7;
        HashSet hashSet = new HashSet();
        synchronized (this.t) {
            Iterator it = this.f14343o.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i7 = z3 ? 3 : 0;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            n0 n0Var = (n0) it2.next();
            p118hf.a.g(!(n0Var instanceof androidx.camera.core.streamsharing.d), "Only support one level of sharing for now.");
            Iterator it3 = n0Var.i().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i7 & iIntValue) == iIntValue) {
                    hashSet.add(n0Var);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final List m() {
        ArrayList arrayList;
        synchronized (this.t) {
            arrayList = new ArrayList(this.f14339f);
        }
        return arrayList;
    }

    public final boolean n() {
        boolean z3;
        synchronized (this.t) {
            z3 = this.f14344p.getSessionProcessor(null) != null;
        }
        return z3;
    }

    public final void r(ArrayList arrayList) {
        synchronized (this.t) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f14339f);
            linkedHashSet.removeAll(arrayList);
            t(linkedHashSet, this.f14335b != null);
        }
    }

    public final void t(LinkedHashSet linkedHashSet, boolean z3) {
        C0993n c0993n;
        androidx.camera.camera2.impl.b bVar;
        synchronized (this.t) {
            try {
                f(linkedHashSet);
                if (!z3 && n() && q(linkedHashSet)) {
                    t(linkedHashSet, true);
                    return;
                }
                androidx.camera.core.streamsharing.d dVarG = g(linkedHashSet, z3);
                n0 n0VarC = c(linkedHashSet, dVarG);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (n0VarC != null) {
                    arrayList.add(n0VarC);
                }
                if (dVarG != null) {
                    arrayList.add(dVarG);
                    arrayList.removeAll(dVarG.f14474p.f14491a);
                }
                ArrayList<n0> arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f14340g);
                ArrayList<n0> arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f14340g);
                ArrayList<n0> arrayList4 = new ArrayList(this.f14340g);
                arrayList4.removeAll(arrayList);
                HashMap mapK = k(arrayList2, this.f14344p.getUseCaseConfigFactory(), this.f14337d);
                Map mapE = Collections.EMPTY_MAP;
                try {
                    HashMap mapE2 = e(j(), this.f14334a.getCameraInfoInternal(), arrayList2, arrayList3, mapK);
                    if (this.f14335b != null) {
                        int iJ = j();
                        CameraInternal cameraInternal = this.f14335b;
                        Objects.requireNonNull(cameraInternal);
                        mapE = e(iJ, cameraInternal.getCameraInfoInternal(), arrayList2, arrayList3, mapK);
                    }
                    u(mapE2, arrayList);
                    ArrayList arrayListS = s(arrayList, this.f14343o);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListS2 = s(arrayList5, arrayListS);
                    if (arrayListS2.size() > 0) {
                        arrayListS2.toString();
                        p140j8.f.G("CameraUseCaseAdapter");
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((n0) it.next()).B(this.f14334a);
                    }
                    this.f14334a.detachUseCases(arrayList4);
                    if (this.f14335b != null) {
                        for (n0 n0Var : arrayList4) {
                            CameraInternal cameraInternal2 = this.f14335b;
                            Objects.requireNonNull(cameraInternal2);
                            n0Var.B(cameraInternal2);
                        }
                        CameraInternal cameraInternal3 = this.f14335b;
                        Objects.requireNonNull(cameraInternal3);
                        cameraInternal3.detachUseCases(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        for (n0 n0Var2 : arrayList3) {
                            if (mapE2.containsKey(n0Var2) && (bVar = (c0993n = (C0993n) mapE2.get(n0Var2)).f14111d) != null && o(c0993n, n0Var2.f2085m)) {
                                n0Var2.f2079g = n0Var2.v(bVar);
                                if (this.f14345v) {
                                    this.f14334a.onUseCaseUpdated(n0Var2);
                                    CameraInternal cameraInternal4 = this.f14335b;
                                    if (cameraInternal4 != null) {
                                        cameraInternal4.onUseCaseUpdated(n0Var2);
                                    }
                                }
                            }
                        }
                    }
                    for (n0 n0Var3 : arrayList2) {
                        e eVar = (e) mapK.get(n0Var3);
                        Objects.requireNonNull(eVar);
                        CameraInternal cameraInternal5 = this.f14335b;
                        if (cameraInternal5 != null) {
                            n0Var3.a(this.f14334a, cameraInternal5, eVar.f14325a, eVar.f14326b);
                            C0993n c0993n2 = (C0993n) mapE2.get(n0Var3);
                            c0993n2.getClass();
                            n0Var3.f2079g = n0Var3.w(c0993n2, (C0993n) mapE.get(n0Var3));
                        } else {
                            n0Var3.a(this.f14334a, null, eVar.f14325a, eVar.f14326b);
                            C0993n c0993n3 = (C0993n) mapE2.get(n0Var3);
                            c0993n3.getClass();
                            n0Var3.f2079g = n0Var3.w(c0993n3, null);
                        }
                    }
                    if (this.f14345v) {
                        this.f14334a.attachUseCases(arrayList2);
                        CameraInternal cameraInternal6 = this.f14335b;
                        if (cameraInternal6 != null) {
                            cameraInternal6.attachUseCases(arrayList2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n0) it2.next()).p();
                    }
                    this.f14339f.clear();
                    this.f14339f.addAll(linkedHashSet);
                    this.f14340g.clear();
                    this.f14340g.addAll(arrayList);
                    this.f14327A = n0VarC;
                    this.f14328B = dVarG;
                } catch (IllegalArgumentException e10) {
                    if (z3 || n() || this.f14341i.getCameraOperatingMode() == 2) {
                        throw e10;
                    }
                    t(linkedHashSet, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(HashMap map, ArrayList arrayList) {
        HashMap map2;
        synchronized (this.t) {
            try {
                if (this.f14342j == null || arrayList.isEmpty()) {
                    map2 = map;
                } else {
                    boolean z3 = this.f14334a.getCameraInfoInternal().getLensFacing() == 0;
                    Rect sensorRect = this.f14334a.getCameraControlInternal().getSensorRect();
                    Rational rational = this.f14342j.f2098b;
                    int sensorRotationDegrees = this.f14334a.getCameraInfoInternal().getSensorRotationDegrees(this.f14342j.f2099c);
                    q0 q0Var = this.f14342j;
                    map2 = map;
                    HashMap mapE = p264r5.a.e(sensorRect, z3, rational, sensorRotationDegrees, q0Var.f2097a, q0Var.f2100d, map2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n0 n0Var = (n0) it.next();
                        Rect rect = (Rect) mapE.get(n0Var);
                        rect.getClass();
                        n0Var.A(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    n0 n0Var2 = (n0) it2.next();
                    Rect sensorRect2 = this.f14334a.getCameraControlInternal().getSensorRect();
                    C0993n c0993n = (C0993n) map2.get(n0Var2);
                    c0993n.getClass();
                    n0Var2.y(d(sensorRect2, c0993n.f14108a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
