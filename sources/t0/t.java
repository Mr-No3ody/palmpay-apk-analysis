package t0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f42306e = new s(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractList f42307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f42309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Af.d f42310d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(AbstractList features, float f10, float f11) {
        ArrayList arrayListI;
        ArrayList arrayListI2;
        char c6;
        e eVar;
        List list;
        char c10;
        Intrinsics.checkNotNullParameter(features, "features");
        this.f42307a = features;
        this.f42308b = f10;
        this.f42309c = f11;
        Af.d dVarB = C1849p.b();
        char c11 = 3;
        e eVar2 = null;
        if (features.size() <= 0 || ((j) features.get(0)).f42283a.size() != 3) {
            arrayListI = null;
            arrayListI2 = null;
        } else {
            Pair pairD = ((e) ((j) features.get(0)).f42283a.get(1)).d(0.5f);
            e eVar3 = (e) pairD.f38891a;
            e eVar4 = (e) pairD.f38892b;
            arrayListI2 = C1850q.i(((j) features.get(0)).f42283a.get(0), eVar3);
            arrayListI = C1850q.i(eVar4, ((j) features.get(0)).f42283a.get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i7 = 0;
            e eVar5 = null;
            while (true) {
                if (i7 == 0 && arrayListI != null) {
                    list = arrayListI;
                } else if (i7 != this.f42307a.size()) {
                    list = ((j) this.f42307a.get(i7)).f42283a;
                } else {
                    if (arrayListI2 == null) {
                        c6 = c11;
                        break;
                    }
                    list = arrayListI2;
                }
                int size2 = list.size();
                int i10 = 0;
                while (i10 < size2) {
                    e eVar6 = (e) list.get(i10);
                    if (!eVar6.f()) {
                        if (eVar5 != null) {
                            dVarB.add(eVar5);
                        }
                        c10 = c11;
                        if (eVar2 == null) {
                            eVar2 = eVar6;
                            eVar5 = eVar2;
                        } else {
                            eVar5 = eVar6;
                        }
                    } else if (eVar5 != null) {
                        float fA = eVar6.a();
                        c10 = c11;
                        float[] fArr = eVar5.f42277a;
                        fArr[6] = fA;
                        fArr[7] = eVar6.b();
                    } else {
                        c10 = c11;
                    }
                    i10++;
                    c11 = c10;
                }
                c6 = c11;
                if (i7 == size) {
                    break;
                }
                i7++;
                c11 = c6;
            }
            eVar = eVar2;
            eVar2 = eVar5;
        } else {
            c6 = 3;
            eVar = null;
        }
        if (eVar2 != null && eVar != null) {
            float[] fArr2 = eVar2.f42277a;
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            float f14 = fArr2[2];
            float f15 = fArr2[c6];
            float f16 = fArr2[4];
            float f17 = fArr2[5];
            float[] fArr3 = eVar.f42277a;
            dVarB.add(p377z5.l.a(f12, f13, f14, f15, f16, f17, fArr3[0], fArr3[1]));
        }
        Af.d dVarA = C1849p.a(dVarB);
        this.f42310d = dVarA;
        Object obj = dVarA.get(dVarA.a() - 1);
        int iA = dVarA.a();
        int i11 = 0;
        while (i11 < iA) {
            e eVar7 = (e) this.f42310d.get(i11);
            e eVar8 = (e) obj;
            if (Math.abs(eVar7.f42277a[0] - eVar8.a()) > 1.0E-4f || Math.abs(eVar7.f42277a[1] - eVar8.b()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i11++;
            obj = eVar7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return Intrinsics.c(this.f42307a, ((t) obj).f42307a);
    }

    public final int hashCode() {
        return this.f42307a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + CollectionsKt.J(this.f42310d, null, null, null, null, 63) + " || Features = " + CollectionsKt.J(this.f42307a, null, null, null, null, 63) + " || Center = (" + this.f42308b + ", " + this.f42309c + ")]";
    }
}
