package androidx.camera.core.streamsharing;

import E.AbstractC0210o;
import E.C0216v;
import E.U;
import E.n0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.processing.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D0 f14472A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f14473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f14474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U f14475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U f14476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public top.zibin.luban.io.a f14477s;
    public E2.a t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f14478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f14479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m f14480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f14481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0 f14482y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0 f14483z;

    public d(CameraInternal cameraInternal, CameraInternal cameraInternal2, U u6, U u10, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory) {
        super(I(hashSet));
        this.f14473o = I(hashSet);
        this.f14475q = u6;
        this.f14476r = u10;
        this.f14474p = new h(cameraInternal, cameraInternal2, hashSet, useCaseConfigFactory, new j(this, 2));
    }

    public static ArrayList H(n0 n0Var) {
        ArrayList arrayList = new ArrayList();
        if (!(n0Var instanceof d)) {
            arrayList.add(n0Var.f2078f.getCaptureType());
            return arrayList;
        }
        Iterator it = ((d) n0Var).f14474p.f14491a.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).f2078f.getCaptureType());
        }
        return arrayList;
    }

    public static f I(HashSet hashSet) {
        C0992m0 c0992m0B = C0992m0.b();
        new e(c0992m0B);
        c0992m0B.insertOption(ImageInputConfig.f13897r, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if (n0Var.f2078f.containsOption(UseCaseConfig.f13990V)) {
                arrayList.add(n0Var.f2078f.getCaptureType());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c0992m0B.insertOption(f.f14485b, arrayList);
        c0992m0B.insertOption(ImageOutputConfig.f13908z, 2);
        return new f(C1000q0.a(c0992m0B));
    }

    public final void D() {
        D0 d1 = this.f14472A;
        if (d1 != null) {
            d1.a();
            this.f14472A = null;
        }
        m mVar = this.f14478u;
        if (mVar != null) {
            mVar.c();
            this.f14478u = null;
        }
        m mVar2 = this.f14479v;
        if (mVar2 != null) {
            mVar2.c();
            this.f14479v = null;
        }
        m mVar3 = this.f14480w;
        if (mVar3 != null) {
            mVar3.c();
            this.f14480w = null;
        }
        m mVar4 = this.f14481x;
        if (mVar4 != null) {
            mVar4.c();
            this.f14481x = null;
        }
        top.zibin.luban.io.a aVar = this.f14477s;
        if (aVar != null) {
            aVar.release();
            this.f14477s = null;
        }
        E2.a aVar2 = this.t;
        if (aVar2 != null) {
            aVar2.release();
            this.t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List E(String str, String str2, UseCaseConfig useCaseConfig, C0993n c0993n, C0993n c0993n2) throws AbstractC0210o {
        p140j8.f.b();
        h hVar = this.f14474p;
        if (c0993n2 == null) {
            F(str, str2, useCaseConfig, c0993n, null);
            CameraInternal cameraInternalB = b();
            Objects.requireNonNull(cameraInternalB);
            this.f14477s = new top.zibin.luban.io.a(cameraInternalB, new androidx.camera.core.processing.f(c0993n.f14109b));
            boolean z3 = this.f2081i != null;
            m mVar = this.f14480w;
            int iJ = j();
            hVar.getClass();
            HashMap map = new HashMap();
            for (n0 n0Var : hVar.f14491a) {
                b bVar = hVar.f14501p;
                CameraInternal cameraInternal = hVar.f14496f;
                h hVar2 = hVar;
                boolean z8 = z3;
                map.put(n0Var, hVar2.a(n0Var, bVar, cameraInternal, mVar, iJ, z8));
                z3 = z8;
                hVar = hVar2;
            }
            h hVar3 = hVar;
            G.h hVarTransform = this.f14477s.transform(new androidx.camera.core.processing.c(this.f14480w, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((n0) entry.getKey(), (m) hVarTransform.get(entry.getValue()));
            }
            hVar3.e(map2);
            Object[] objArr = {this.f14482y.d()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        h hVar4 = hVar;
        F(str, str2, useCaseConfig, c0993n, c0993n2);
        Matrix matrix = this.f2082j;
        CameraInternal cameraInternalH = h();
        Objects.requireNonNull(cameraInternalH);
        boolean hasTransform = cameraInternalH.getHasTransform();
        Rect rect = this.f2081i;
        if (rect == null) {
            Size size = c0993n2.f14108a;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        CameraInternal cameraInternalH2 = h();
        Objects.requireNonNull(cameraInternalH2);
        int iG = g(cameraInternalH2, false);
        CameraInternal cameraInternalH3 = h();
        Objects.requireNonNull(cameraInternalH3);
        m mVar2 = new m(3, 34, c0993n2, matrix, hasTransform, rect2, iG, -1, l(cameraInternalH3));
        this.f14479v = mVar2;
        Objects.requireNonNull(h());
        this.f14481x = mVar2;
        C0 c0G = G(this.f14479v, useCaseConfig, c0993n2);
        this.f14483z = c0G;
        D0 d1 = this.f14472A;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new c(this, str, str2, useCaseConfig, c0993n, c0993n2));
        this.f14472A = d2;
        c0G.f13843f = d2;
        this.t = new E2.a(b(), h(), new G.f(c0993n.f14109b, this.f14475q, this.f14476r));
        boolean z10 = this.f2081i != null;
        m mVar3 = this.f14480w;
        m mVar4 = this.f14481x;
        int iJ2 = j();
        hVar4.getClass();
        HashMap map3 = new HashMap();
        for (n0 n0Var2 : hVar4.f14491a) {
            h hVar5 = hVar4;
            H.c cVarA = hVar5.a(n0Var2, hVar4.f14501p, hVar4.f14496f, mVar3, iJ2, z10);
            m mVar5 = mVar3;
            CameraInternal cameraInternal2 = hVar5.f14497g;
            Objects.requireNonNull(cameraInternal2);
            m mVar6 = mVar4;
            map3.put(n0Var2, new G.a(cVarA, hVar5.a(n0Var2, hVar5.t, cameraInternal2, mVar6, iJ2, z10)));
            hVar4 = hVar5;
            mVar4 = mVar6;
            mVar3 = mVar5;
        }
        h hVar6 = hVar4;
        G.h hVarTransform2 = this.t.transform(new G.b(this.f14480w, this.f14481x, new ArrayList(map3.values())));
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put((n0) entry2.getKey(), (m) hVarTransform2.get(entry2.getValue()));
        }
        hVar6.e(map4);
        Object[] objArr2 = {this.f14482y.d(), this.f14483z.d()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj2 = objArr2[i7];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void F(String str, String str2, UseCaseConfig useCaseConfig, C0993n c0993n, C0993n c0993n2) {
        Matrix matrix = this.f2082j;
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        boolean hasTransform = cameraInternalB.getHasTransform();
        Size size = c0993n.f14108a;
        Rect rect = this.f2081i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        CameraInternal cameraInternalB2 = b();
        Objects.requireNonNull(cameraInternalB2);
        int iG = g(cameraInternalB2, false);
        CameraInternal cameraInternalB3 = b();
        Objects.requireNonNull(cameraInternalB3);
        m mVar = new m(3, 34, c0993n, matrix, hasTransform, rect, iG, -1, l(cameraInternalB3));
        this.f14478u = mVar;
        Objects.requireNonNull(b());
        this.f14480w = mVar;
        C0 c0G = G(this.f14478u, useCaseConfig, c0993n);
        this.f14482y = c0G;
        D0 d1 = this.f14472A;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new c(this, str, str2, useCaseConfig, c0993n, c0993n2));
        this.f14472A = d2;
        c0G.f13843f = d2;
    }

    public final C0 G(m mVar, UseCaseConfig useCaseConfig, C0993n c0993n) {
        C0 c0E = C0.e(useCaseConfig, c0993n.f14108a);
        h hVar = this.f14474p;
        Iterator it = hVar.f14491a.iterator();
        int i7 = -1;
        while (it.hasNext()) {
            int i10 = ((n0) it.next()).f2078f.getDefaultSessionConfig().f13886g.f13968c;
            Integer numValueOf = Integer.valueOf(i7);
            List list = H0.f13879i;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i10))) {
                i7 = i10;
            }
        }
        S s3 = c0E.f13839b;
        if (i7 != -1) {
            s3.f13957c = i7;
        }
        Iterator it2 = hVar.f14491a.iterator();
        while (it2.hasNext()) {
            H0 h0D = C0.e(((n0) it2.next()).f2078f, c0993n.f14108a).d();
            T t = h0D.f13886g;
            s3.a(t.f13970e);
            for (AbstractC0999q abstractC0999q : h0D.f13884e) {
                s3.b(abstractC0999q);
                ArrayList arrayList = c0E.f13842e;
                if (!arrayList.contains(abstractC0999q)) {
                    arrayList.add(abstractC0999q);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : h0D.f13883d) {
                ArrayList arrayList2 = c0E.f13841d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : h0D.f13882c) {
                ArrayList arrayList3 = c0E.f13840c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            s3.c(t.f13967b);
        }
        mVar.getClass();
        p140j8.f.b();
        mVar.b();
        p118hf.a.k(!mVar.f14435j, "Consumer can only be linked once.");
        mVar.f14435j = true;
        c0E.c(mVar.f14437l, c0993n.f14109b, -1);
        s3.b(hVar.f14498i);
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        if (bVar != null) {
            s3.c(bVar);
        }
        return c0E;
    }

    @Override // E.n0
    public final UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory) {
        f fVar = this.f14473o;
        Config config = useCaseConfigFactory.getConfig(fVar.getCaptureType(), 1);
        if (z3) {
            config = Config.mergeConfigs(config, fVar.f14486a);
        }
        if (config == null) {
            return null;
        }
        return ((e) k(config)).getUseCaseConfig();
    }

    @Override // E.n0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // E.n0
    public final UseCaseConfig.Builder k(Config config) {
        return new e(C0992m0.c(config));
    }

    @Override // E.n0
    public final void q() {
        h hVar = this.f14474p;
        for (n0 n0Var : hVar.f14491a) {
            g gVar = (g) hVar.f14493c.get(n0Var);
            Objects.requireNonNull(gVar);
            n0Var.a(gVar, null, null, n0Var.e(true, hVar.f14495e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    @Override // E.n0
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        C0216v c0216v;
        Rational rational;
        MutableConfig mutableConfig = builder.getMutableConfig();
        h hVar = this.f14474p;
        b bVar = hVar.f14501p;
        List<Size> supportedResolutions = bVar.f14464f.getSupportedResolutions(34);
        HashSet hashSet = bVar.f14462d;
        Iterator it = hashSet.iterator();
        while (true) {
            c0216v = null;
            if (!it.hasNext()) {
                break;
            }
            UseCaseConfig useCaseConfig = (UseCaseConfig) it.next();
            if (!useCaseConfig.isHighResolutionDisabled(false) && (useCaseConfig instanceof ImageOutputConfig)) {
                ((ImageOutputConfig) useCaseConfig).getResolutionSelector(null);
            }
        }
        List list = (List) mutableConfig.retrieveOption(ImageOutputConfig.f13902G, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    supportedResolutions = new ArrayList<>();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    supportedResolutions = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            hashSet2.addAll(bVar.b((UseCaseConfig) it3.next()));
        }
        Iterator it4 = hashSet2.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            rational = bVar.f14461c;
            if (!zHasNext) {
                break;
            }
            Size size = (Size) it4.next();
            Rational rational2 = androidx.camera.core.impl.utils.b.f14143a;
            if (!androidx.camera.core.impl.utils.b.a(size, rational, androidx.camera.core.internal.utils.d.f14363c)) {
                arrayList.addAll(bVar.f(bVar.f14460b, supportedResolutions, false));
                break;
            }
        }
        arrayList.addAll(bVar.f(rational, supportedResolutions, false));
        arrayList.addAll(bVar.e(supportedResolutions, false));
        if (arrayList.isEmpty()) {
            p140j8.f.G("ResolutionsMerger");
            arrayList.addAll(bVar.e(supportedResolutions, true));
        }
        arrayList.toString();
        p140j8.f.G("ResolutionsMerger");
        mutableConfig.insertOption(ImageOutputConfig.f13904J, arrayList);
        C0971c c0971c = UseCaseConfig.f13986R;
        HashSet hashSet3 = hVar.f14499j;
        Iterator it5 = hashSet3.iterator();
        int iMax = 0;
        while (it5.hasNext()) {
            iMax = Math.max(iMax, ((UseCaseConfig) it5.next()).getSurfaceOccupancyPriority(0));
        }
        mutableConfig.insertOption(c0971c, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet3.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((UseCaseConfig) it6.next()).getDynamicRange());
        }
        if (!arrayList2.isEmpty()) {
            C0216v c0216v2 = (C0216v) arrayList2.get(0);
            Integer numValueOf = Integer.valueOf(c0216v2.f2128a);
            Integer numValueOf2 = Integer.valueOf(c0216v2.f2129b);
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList2.size()) {
                    c0216v = new C0216v(numValueOf.intValue(), numValueOf2.intValue());
                    break;
                }
                C0216v c0216v3 = (C0216v) arrayList2.get(i7);
                Integer numValueOf3 = Integer.valueOf(c0216v3.f2128a);
                if (numValueOf.equals(0)) {
                    numValueOf = numValueOf3;
                } else if (!numValueOf3.equals(0)) {
                    if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
                        numValueOf = numValueOf3;
                    } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
                        numValueOf = null;
                    }
                }
                Integer numValueOf4 = Integer.valueOf(c0216v3.f2129b);
                if (numValueOf2.equals(0)) {
                    numValueOf2 = numValueOf4;
                } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
                    numValueOf2 = null;
                }
                if (numValueOf == null || numValueOf2 == null) {
                    break;
                }
                i7++;
            }
        }
        if (c0216v == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        mutableConfig.insertOption(ImageInputConfig.f13898s, c0216v);
        for (n0 n0Var : hVar.f14491a) {
            if (n0Var.f2078f.getVideoStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.f13992a0, Integer.valueOf(n0Var.f2078f.getVideoStabilizationMode()));
            }
            if (n0Var.f2078f.getPreviewStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.f13991W, Integer.valueOf(n0Var.f2078f.getPreviewStabilizationMode()));
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // E.n0
    public final void t() {
        for (n0 n0Var : this.f14474p.f14491a) {
            n0Var.t();
            n0Var.r();
        }
    }

    @Override // E.n0
    public final void u() {
        Iterator it = this.f14474p.f14491a.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).u();
        }
    }

    @Override // E.n0
    public final C0993n v(androidx.camera.camera2.impl.b bVar) {
        this.f14482y.b(bVar);
        Object[] objArr = {this.f14482y.d()};
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
        C(E(d(), h() == null ? null : h().getCameraInfoInternal().getCameraId(), this.f2078f, c0993n, c0993n2));
        n();
        return c0993n;
    }

    @Override // E.n0
    public final void x() {
        D();
        h hVar = this.f14474p;
        for (n0 n0Var : hVar.f14491a) {
            g gVar = (g) hVar.f14493c.get(n0Var);
            Objects.requireNonNull(gVar);
            n0Var.B(gVar);
        }
    }
}
