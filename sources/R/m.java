package R;

import C0.G;
import N8.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f7891f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f7892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f7895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7896e;

    public final void a(ArrayList arrayList) {
        int size = this.f7892a.size();
        if (this.f7896e != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                m mVar = (m) arrayList.get(i7);
                if (this.f7896e == mVar.f7893b) {
                    c(this.f7894c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.c cVar, int i7) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f7892a;
        if (arrayList.size() == 0) {
            return 0;
        }
        Q.f fVar = (Q.f) ((Q.e) arrayList.get(0)).f7454V;
        cVar.t();
        fVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((Q.e) arrayList.get(i10)).b(cVar, false);
        }
        if (i7 == 0 && fVar.f7504D0 > 0) {
            Q.k.a(fVar, cVar, arrayList, 0);
        }
        if (i7 == 1 && fVar.f7505E0 > 0) {
            Q.k.a(fVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f7895d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Q.e eVar = (Q.e) arrayList.get(i11);
            com.growingio.android.debugger.a aVar = new com.growingio.android.debugger.a(2);
            new WeakReference(eVar);
            androidx.constraintlayout.core.c.n(eVar.f7442J);
            androidx.constraintlayout.core.c.n(eVar.f7443K);
            androidx.constraintlayout.core.c.n(eVar.f7444L);
            androidx.constraintlayout.core.c.n(eVar.f7445M);
            androidx.constraintlayout.core.c.n(eVar.f7446N);
            this.f7895d.add(aVar);
        }
        if (i7 == 0) {
            iN = androidx.constraintlayout.core.c.n(fVar.f7442J);
            iN2 = androidx.constraintlayout.core.c.n(fVar.f7444L);
            cVar.t();
        } else {
            iN = androidx.constraintlayout.core.c.n(fVar.f7443K);
            iN2 = androidx.constraintlayout.core.c.n(fVar.f7445M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i7, m mVar) {
        for (Q.e eVar : this.f7892a) {
            ArrayList arrayList = mVar.f7892a;
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            int i10 = mVar.f7893b;
            if (i7 == 0) {
                eVar.f7493s0 = i10;
            } else {
                eVar.f7494t0 = i10;
            }
        }
        this.f7896e = mVar.f7893b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f7894c;
        if (i7 == 0) {
            str = "Horizontal";
        } else if (i7 == 1) {
            str = "Vertical";
        } else {
            str = i7 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strN = G.n(this.f7893b, "] <", sb2);
        for (Q.e eVar : this.f7892a) {
            StringBuilder sbT = G.t(strN, " ");
            sbT.append(eVar.f7477k0);
            strN = sbT.toString();
        }
        return q0.j(strN, " >");
    }
}
