package androidx.camera.core.streamsharing;

import E.P;
import E.V;
import E.b0;
import E.n0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.UseCase$StateChangeCallback;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0968a0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.processing.m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h implements UseCase$StateChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f14491a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UseCaseConfigFactory f14495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraInternal f14496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CameraInternal f14497g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f14499j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f14500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f14501p;
    public final b t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14492b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14493c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14494d = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V f14498i = new V(this, 2);

    public h(CameraInternal cameraInternal, CameraInternal cameraInternal2, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory, j jVar) {
        this.f14496f = cameraInternal;
        this.f14497g = cameraInternal2;
        this.f14495e = useCaseConfigFactory;
        this.f14491a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            map.put(n0Var, n0Var.m(cameraInternal.getCameraInfoInternal(), null, n0Var.e(true, useCaseConfigFactory)));
        }
        this.f14500o = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f14499j = hashSet2;
        this.f14501p = new b(cameraInternal, hashSet2);
        if (this.f14497g != null) {
            this.t = new b(this.f14497g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            n0 n0Var2 = (n0) it2.next();
            this.f14494d.put(n0Var2, Boolean.FALSE);
            this.f14493c.put(n0Var2, new g(cameraInternal, this, jVar));
        }
    }

    public static void b(m mVar, AbstractC0970b0 abstractC0970b0, H0 h7) {
        mVar.e();
        try {
            p140j8.f.b();
            mVar.b();
            androidx.camera.core.processing.l lVar = mVar.f14437l;
            Objects.requireNonNull(lVar);
            lVar.g(abstractC0970b0, new androidx.camera.core.processing.j(lVar, 0));
        } catch (C0968a0 unused) {
            SessionConfig$ErrorListener sessionConfig$ErrorListener = h7.f13885f;
            if (sessionConfig$ErrorListener != null) {
                sessionConfig$ErrorListener.onError(h7, F0.f13859a);
            }
        }
    }

    public static AbstractC0970b0 c(n0 n0Var) {
        List listB = n0Var instanceof P ? n0Var.f2085m.b() : Collections.unmodifiableList(n0Var.f2085m.f13886g.f13966a);
        p118hf.a.k(listB.size() <= 1, null);
        if (listB.size() == 1) {
            return (AbstractC0970b0) listB.get(0);
        }
        return null;
    }

    public final H.c a(n0 n0Var, b bVar, CameraInternal cameraInternal, m mVar, int i7, boolean z3) {
        boolean z8;
        Size sizeE;
        int i10;
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i7);
        Matrix matrix = mVar.f14427b;
        RectF rectF = o.f14263a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = (f11 * f13) + (f10 * f12);
        float f15 = (f10 * f13) - (f11 * f12);
        double dSqrt = Math.sqrt((f11 * f11) + (f10 * f10)) * Math.sqrt((f13 * f13) + (f12 * f12));
        boolean z10 = ((float) Math.toDegrees(Math.atan2(((double) f15) / dSqrt, ((double) f14) / dSqrt))) > 0.0f;
        UseCaseConfig useCaseConfig = (UseCaseConfig) this.f14500o.get(n0Var);
        Objects.requireNonNull(useCaseConfig);
        float[] fArr2 = new float[9];
        mVar.f14427b.getValues(fArr2);
        int iH = o.h((int) Math.round(Math.atan2(fArr2[3], fArr2[0]) * 57.29577951308232d));
        bVar.getClass();
        boolean zC = o.c(iH);
        Rect rectA = mVar.f14429d;
        if (zC) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z8 = true;
        } else {
            z8 = false;
        }
        if (z3) {
            sizeE = o.e(rectA);
            Iterator it = bVar.b(useCaseConfig).iterator();
            while (it.hasNext()) {
                Size sizeE2 = o.e(b.a((Size) it.next(), sizeE));
                if (!b.c(sizeE2, sizeE)) {
                    sizeE = sizeE2;
                    break;
                }
            }
        } else {
            Size sizeE3 = o.e(rectA);
            List listB = bVar.b(useCaseConfig);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeE = sizeE3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!b.c(size, sizeE3)) {
                            sizeE = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = androidx.camera.core.impl.utils.b.f14143a;
                    Size size3 = androidx.camera.core.internal.utils.d.f14363c;
                    if (!androidx.camera.core.impl.utils.b.a(sizeE3, rationalG, size3)) {
                        rationalG = androidx.camera.core.impl.utils.b.f14145c;
                        if (!androidx.camera.core.impl.utils.b.a(sizeE3, rationalG, size3)) {
                            rationalG = b.g(sizeE3);
                        }
                    }
                    if (!bVar.d(rationalG, size2) && !b.c(size2, sizeE3)) {
                        sizeE = size2;
                        break;
                    }
                }
            }
            rectA = b.a(sizeE3, sizeE);
        }
        Pair pair = new Pair(rectA, sizeE);
        Rect rect = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z8) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect, size4);
        Rect rect2 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int sensorRotationDegrees2 = this.f14496f.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) n0Var.f2078f).getTargetRotation(0));
        g gVar = (g) this.f14493c.get(n0Var);
        Objects.requireNonNull(gVar);
        gVar.f14489c.f14509c = sensorRotationDegrees2;
        int iH2 = o.h((mVar.f14434i + sensorRotationDegrees2) - sensorRotationDegrees);
        if (n0Var instanceof b0) {
            i10 = 1;
        } else {
            i10 = n0Var instanceof P ? 4 : 2;
        }
        return new H.c(UUID.randomUUID(), i10, n0Var instanceof P ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 34, rect2, o.g(size6, iH2), iH2, n0Var.l(cameraInternal) ^ z10);
    }

    public final boolean d(n0 n0Var) {
        Boolean bool = (Boolean) this.f14494d.get(n0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void e(HashMap map) {
        HashMap map2 = this.f14492b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            n0 n0Var = (n0) entry.getKey();
            m mVar = (m) entry.getValue();
            n0Var.A(mVar.f14429d);
            n0Var.y(mVar.f14427b);
            n0Var.f2079g = n0Var.w(mVar.f14432g, null);
            n0Var.p();
        }
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseActive(n0 n0Var) {
        p140j8.f.b();
        if (d(n0Var)) {
            return;
        }
        this.f14494d.put(n0Var, Boolean.TRUE);
        AbstractC0970b0 abstractC0970b0C = c(n0Var);
        if (abstractC0970b0C != null) {
            m mVar = (m) this.f14492b.get(n0Var);
            Objects.requireNonNull(mVar);
            b(mVar, abstractC0970b0C, n0Var.f2085m);
        }
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseInactive(n0 n0Var) {
        p140j8.f.b();
        if (d(n0Var)) {
            this.f14494d.put(n0Var, Boolean.FALSE);
            m mVar = (m) this.f14492b.get(n0Var);
            Objects.requireNonNull(mVar);
            p140j8.f.b();
            mVar.b();
            mVar.f14437l.a();
        }
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseReset(n0 n0Var) {
        AbstractC0970b0 abstractC0970b0C;
        p140j8.f.b();
        m mVar = (m) this.f14492b.get(n0Var);
        Objects.requireNonNull(mVar);
        if (d(n0Var) && (abstractC0970b0C = c(n0Var)) != null) {
            b(mVar, abstractC0970b0C, n0Var.f2085m);
        }
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseUpdated(n0 n0Var) {
        p140j8.f.b();
        if (d(n0Var)) {
            m mVar = (m) this.f14492b.get(n0Var);
            Objects.requireNonNull(mVar);
            AbstractC0970b0 abstractC0970b0C = c(n0Var);
            if (abstractC0970b0C != null) {
                b(mVar, abstractC0970b0C, n0Var.f2085m);
                return;
            }
            p140j8.f.b();
            mVar.b();
            mVar.f14437l.a();
        }
    }
}
