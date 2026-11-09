package E;

import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1003s0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: E.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0220z implements SessionConfig$ErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2140b;

    public /* synthetic */ C0220z(Object obj, int i7) {
        this.f2139a = i7;
        this.f2140b = obj;
    }

    @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
    public final void onError(H0 h7, F0 f1) {
        switch (this.f2139a) {
            case 0:
                C c6 = (C) this.f2140b;
                if (c6.b() != null) {
                    p140j8.f.b();
                    D0 d1 = c6.t;
                    if (d1 != null) {
                        d1.a();
                        c6.t = null;
                    }
                    j0 j0Var = c6.f1893s;
                    if (j0Var != null) {
                        j0Var.a();
                        c6.f1893s = null;
                    }
                    c6.f1889o.c();
                    c6.d();
                    C0980g0 c0980g0 = (C0980g0) c6.f2078f;
                    C0993n c0993n = c6.f2079g;
                    c0993n.getClass();
                    C0 c0D = c6.D(c0980g0, c0993n);
                    c6.f1892r = c0D;
                    Object[] objArr = {c0D.d()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    c6.C(Collections.unmodifiableList(arrayList));
                    c6.o();
                    break;
                }
                break;
            case 1:
                P p3 = (P) this.f2140b;
                if (p3.b() != null) {
                    androidx.camera.core.imagecapture.x xVar = p3.f1948w;
                    xVar.getClass();
                    p140j8.f.b();
                    xVar.f13826f = true;
                    androidx.camera.core.imagecapture.v vVar = xVar.f13824d;
                    if (vVar != null) {
                        p140j8.f.b();
                        if (!vVar.f13813d.f15066b.isDone()) {
                            Q q10 = new Q(3, "The request is aborted silently and retried.", null);
                            p140j8.f.b();
                            vVar.f13816g = true;
                            ListenableFuture listenableFuture = vVar.f13818i;
                            Objects.requireNonNull(listenableFuture);
                            listenableFuture.cancel(true);
                            vVar.f13814e.d(q10);
                            vVar.f13815f.b(null);
                            vVar.f13811b.retryRequest(vVar.f13810a);
                        }
                    }
                    p3.D(true);
                    String strD = p3.d();
                    C0982h0 c0982h0 = (C0982h0) p3.f2078f;
                    C0993n c0993n2 = p3.f2079g;
                    c0993n2.getClass();
                    C0 c0E = p3.E(strD, c0982h0, c0993n2);
                    p3.f1946u = c0E;
                    Object[] objArr2 = {c0E.d()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    p3.C(Collections.unmodifiableList(arrayList2));
                    p3.o();
                    androidx.camera.core.imagecapture.x xVar2 = p3.f1948w;
                    xVar2.getClass();
                    p140j8.f.b();
                    xVar2.f13826f = false;
                    xVar2.b();
                    break;
                }
                break;
            case 2:
                b0 b0Var = (b0) this.f2140b;
                if (b0Var.b() != null) {
                    b0Var.F((C1003s0) b0Var.f2078f, b0Var.f2079g);
                    b0Var.o();
                    break;
                }
                break;
            case 3:
                Iterator it = ((G0) this.f2140b).f13874l.iterator();
                while (it.hasNext()) {
                    ((SessionConfig$ErrorListener) it.next()).onError(h7, f1);
                }
                break;
            default:
                ((androidx.camera.video.C) this.f2140b).L();
                break;
        }
    }
}
