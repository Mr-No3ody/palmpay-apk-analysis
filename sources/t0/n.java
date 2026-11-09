package t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final List<Pair<e, e>> match$graphics_shapes_release(@NotNull t p3, @NotNull t p10) {
        Pair pairA;
        Pair pairA2;
        Intrinsics.checkNotNullParameter(p3, "p1");
        Intrinsics.checkNotNullParameter(p10, "p2");
        k kVar = m.f42289e;
        m mVarMeasurePolygon$graphics_shapes_release = kVar.measurePolygon$graphics_shapes_release(new Re.n(p3.f42308b, p3.f42309c), p3);
        m mVarMeasurePolygon$graphics_shapes_release2 = kVar.measurePolygon$graphics_shapes_release(new Re.n(p10.f42308b, p10.f42309c), p10);
        Af.d features1 = mVarMeasurePolygon$graphics_shapes_release.f42292d;
        Af.d features2 = mVarMeasurePolygon$graphics_shapes_release2.f42292d;
        Intrinsics.checkNotNullParameter(features1, "features1");
        Intrinsics.checkNotNullParameter(features2, "features2");
        Af.d dVarB = C1849p.b();
        int iA = features1.a();
        for (int i7 = 0; i7 < iA; i7++) {
            if (((q) features1.get(i7)).f42296b instanceof h) {
                dVarB.add(features1.get(i7));
            }
        }
        Af.d dVarA = C1849p.a(dVarB);
        Af.d dVarB2 = C1849p.b();
        int iA2 = features2.a();
        for (int i10 = 0; i10 < iA2; i10++) {
            if (((q) features2.get(i10)).f42296b instanceof h) {
                dVarB2.add(features2.get(i10));
            }
        }
        Af.d dVarA2 = C1849p.a(dVarB2);
        Pair pair = dVarA.a() > dVarA2.a() ? new Pair(p118hf.a.p(dVarA2, dVarA), dVarA2) : new Pair(dVarA, p118hf.a.p(dVarA, dVarA2));
        List list = (List) pair.f38891a;
        List list2 = (List) pair.f38892b;
        Af.d dVarB3 = C1849p.b();
        int size = list.size();
        for (int i11 = 0; i11 < size && i11 != list2.size(); i11++) {
            dVarB3.add(new Pair(Float.valueOf(((q) list.get(i11)).f42295a), Float.valueOf(((q) list2.get(i11)).f42295a)));
        }
        Pair[] pairArr = (Pair[]) C1849p.a(dVarB3).toArray(new Pair[0]);
        g gVar = new g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        M.m mVar = gVar.f42278a;
        M.m mVar2 = gVar.f42279b;
        float fQ = D3.a.q(mVar, mVar2, 0.0f);
        if (0.0f > fQ || fQ > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (fQ >= 1.0E-4f) {
            ArrayList arrayList = mVarMeasurePolygon$graphics_shapes_release2.f42291c;
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                l lVar = (l) it.next();
                float f10 = lVar.f42286c;
                if (fQ <= lVar.f42287d && f10 <= fQ) {
                    break;
                }
                i12++;
            }
            Pair pairA3 = ((l) arrayList.get(i12)).a(fQ);
            l lVar2 = (l) pairA3.f38891a;
            ArrayList arrayListI = C1850q.i(((l) pairA3.f38892b).f42284a);
            int size2 = arrayList.size();
            for (int i13 = 1; i13 < size2; i13++) {
                arrayListI.add(((l) arrayList.get((i13 + i12) % arrayList.size())).f42284a);
            }
            arrayListI.add(lVar2.f42284a);
            M.m mVar3 = new M.m(arrayList.size() + 2);
            int size3 = arrayList.size() + 2;
            int i14 = 0;
            while (i14 < size3) {
                mVar3.a(i14 == 0 ? 0.0f : i14 == arrayList.size() + 1 ? 1.0f : u.d(((l) arrayList.get(((i12 + i14) - 1) % arrayList.size())).f42287d - fQ, 1.0f));
                i14++;
            }
            Af.d dVarB4 = C1849p.b();
            Af.d dVar = mVarMeasurePolygon$graphics_shapes_release2.f42292d;
            int iA3 = dVar.a();
            for (int i15 = 0; i15 < iA3; i15++) {
                dVarB4.add(new q(u.d(((q) dVar.get(i15)).f42295a - fQ, 1.0f), ((q) dVar.get(i15)).f42296b));
            }
            mVarMeasurePolygon$graphics_shapes_release2 = new m(mVarMeasurePolygon$graphics_shapes_release2.f42290b, C1849p.a(dVarB4), arrayListI, mVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        l lVar3 = (l) CollectionsKt.G(0, mVarMeasurePolygon$graphics_shapes_release);
        l lVar4 = (l) CollectionsKt.G(0, mVarMeasurePolygon$graphics_shapes_release2);
        int i16 = 1;
        int i17 = 1;
        while (lVar3 != null && lVar4 != null) {
            float f11 = i16 == mVarMeasurePolygon$graphics_shapes_release.f42291c.size() ? 1.0f : lVar3.f42287d;
            float fQ2 = i17 == mVarMeasurePolygon$graphics_shapes_release2.f42291c.size() ? 1.0f : D3.a.q(mVar2, mVar, u.d(lVar4.f42287d + fQ, 1.0f));
            float fMin = Math.min(f11, fQ2);
            float f12 = 1.0E-6f + fMin;
            if (f11 > f12) {
                pairA = lVar3.a(fMin);
            } else {
                Pair pair2 = new Pair(lVar3, CollectionsKt.G(i16, mVarMeasurePolygon$graphics_shapes_release));
                i16++;
                pairA = pair2;
            }
            l lVar5 = (l) pairA.f38891a;
            lVar3 = (l) pairA.f38892b;
            if (fQ2 > f12) {
                pairA2 = lVar4.a(u.d(D3.a.q(mVar, mVar2, fMin) - fQ, 1.0f));
            } else {
                Pair pair3 = new Pair(lVar4, CollectionsKt.G(i17, mVarMeasurePolygon$graphics_shapes_release2));
                i17++;
                pairA2 = pair3;
            }
            l lVar6 = (l) pairA2.f38891a;
            lVar4 = (l) pairA2.f38892b;
            arrayList2.add(new Pair(lVar5.f42284a, lVar6.f42284a));
        }
        if (lVar3 == null && lVar4 == null) {
            return arrayList2;
        }
        throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
    }

    private n() {
    }
}
