package R;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f7887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f7888b;

    public static long a(e eVar, long j6) {
        n nVar = eVar.f7875d;
        if (nVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = eVar.f7882k;
        int size = arrayList.size();
        long jMin = j6;
        for (int i7 = 0; i7 < size; i7++) {
            Dependency dependency = (Dependency) arrayList.get(i7);
            if (dependency instanceof e) {
                e eVar2 = (e) dependency;
                if (eVar2.f7875d != nVar) {
                    jMin = Math.min(jMin, a(eVar2, ((long) eVar2.f7877f) + j6));
                }
            }
        }
        if (eVar != nVar.f7905i) {
            return jMin;
        }
        long jI = nVar.i();
        e eVar3 = nVar.f7904h;
        long j10 = j6 - jI;
        return Math.min(Math.min(jMin, a(eVar3, j10)), j10 - ((long) eVar3.f7877f));
    }

    public static long b(e eVar, long j6) {
        n nVar = eVar.f7875d;
        if (nVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = eVar.f7882k;
        int size = arrayList.size();
        long jMax = j6;
        for (int i7 = 0; i7 < size; i7++) {
            Dependency dependency = (Dependency) arrayList.get(i7);
            if (dependency instanceof e) {
                e eVar2 = (e) dependency;
                if (eVar2.f7875d != nVar) {
                    jMax = Math.max(jMax, b(eVar2, ((long) eVar2.f7877f) + j6));
                }
            }
        }
        if (eVar != nVar.f7904h) {
            return jMax;
        }
        long jI = nVar.i();
        e eVar3 = nVar.f7905i;
        long j10 = j6 + jI;
        return Math.max(Math.max(jMax, b(eVar3, j10)), j10 - ((long) eVar3.f7877f));
    }
}
