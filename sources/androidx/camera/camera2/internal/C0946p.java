package androidx.camera.camera2.internal;

import E.C0211p;
import E.C0212q;
import android.content.Context;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.C0969b;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0946p implements CameraFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C.b f13629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.O f13630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.N f13631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.s f13632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f13633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0966z0 f13634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f13636i = new HashMap();

    public C0946p(Context context, androidx.camera.core.impl.O o10, C0211p c0211p, long j6) throws E.T {
        String strN;
        this.f13628a = context;
        this.f13630c = o10;
        androidx.camera.camera2.internal.compat.s sVar = new androidx.camera.camera2.internal.compat.s(CameraManagerCompat$CameraManagerCompatImpl.from(context, ((C0969b) o10).f14016b));
        this.f13632e = sVar;
        this.f13634g = C0966z0.b(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(sVar.f13482a.getCameraIdList());
            if (c0211p == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strN = p118hf.a.n(sVar, c0211p.b(), listAsList);
                } catch (IllegalStateException unused) {
                    strN = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strN)) {
                        arrayList2.add(a(str));
                    }
                }
                Iterator it2 = c0211p.a(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CameraInfoInternal) ((CameraInfo) it2.next())).getCameraId());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList3.add(str2);
                } else if (p377z5.l.p(this.f13632e, str2)) {
                    arrayList3.add(str2);
                } else {
                    p140j8.f.G("Camera2CameraFactory");
                }
            }
            this.f13633f = arrayList3;
            C.b bVar = new C.b(this.f13632e);
            this.f13629b = bVar;
            androidx.camera.core.impl.N n10 = new androidx.camera.core.impl.N(bVar);
            this.f13631d = n10;
            bVar.addListener(n10);
            this.f13635h = j6;
        } catch (C0212q e10) {
            throw new E.T(e10);
        } catch (androidx.camera.camera2.internal.compat.a e11) {
            throw new E.T(new C0212q(e11));
        }
    }

    public final M a(String str) throws C0212q {
        HashMap map = this.f13636i;
        try {
            M m7 = (M) map.get(str);
            if (m7 != null) {
                return m7;
            }
            M m10 = new M(this.f13632e, str);
            map.put(str, m10);
            return m10;
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            throw new C0212q(e10);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final Set getAvailableCameraIds() {
        return new LinkedHashSet(this.f13633f);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraInternal getCamera(String str) throws C0212q {
        if (!this.f13633f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        M mA = a(str);
        C0969b c0969b = (C0969b) this.f13630c;
        Executor executor = c0969b.f14015a;
        Handler handler = c0969b.f14016b;
        return new J(this.f13628a, this.f13632e, str, mA, this.f13629b, this.f13631d, executor, handler, this.f13634g, this.f13635h);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraCoordinator getCameraCoordinator() {
        return this.f13629b;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final Object getCameraManager() {
        return this.f13632e;
    }
}
