package t0;

import androidx.graphics.shapes.Measurer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final m measurePolygon$graphics_shapes_release(@NotNull Measurer measurer, @NotNull t polygon) {
        List listC;
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        ArrayList<e> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = polygon.f42307a.size();
        for (int i7 = 0; i7 < size; i7++) {
            j jVar = (j) polygon.f42307a.get(i7);
            int size2 = jVar.f42283a.size();
            for (int i10 = 0; i10 < size2; i10++) {
                boolean z3 = jVar instanceof h;
                List list = jVar.f42283a;
                if (z3 && i10 == list.size() / 2) {
                    arrayList2.add(new Pair(jVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list.get(i10));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iL = kotlin.collections.r.l(arrayList, 9);
        if (iL == 0) {
            listC = C1849p.c(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iL + 1);
            arrayList3.add(fValueOf);
            for (e eVar : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fMeasureCubic = measurer.measureCubic(eVar);
                if (fMeasureCubic < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                Unit unit = Unit.f38893a;
                fValueOf = Float.valueOf(fFloatValue + fMeasureCubic);
                arrayList3.add(fValueOf);
            }
            listC = arrayList3;
        }
        float fFloatValue2 = ((Number) CollectionsKt.K(listC)).floatValue();
        M.m mVar = new M.m(listC.size());
        int size3 = listC.size();
        for (int i11 = 0; i11 < size3; i11++) {
            mVar.a(((Number) listC.get(i11)).floatValue() / fFloatValue2);
        }
        Af.d dVarB = C1849p.b();
        int size4 = arrayList2.size();
        for (int i12 = 0; i12 < size4; i12++) {
            int iIntValue = ((Number) ((Pair) arrayList2.get(i12)).f38892b).intValue();
            dVarB.add(new q((mVar.b(iIntValue + 1) + mVar.b(iIntValue)) / 2, (j) ((Pair) arrayList2.get(i12)).f38891a));
        }
        return new m(measurer, C1849p.a(dVarB), arrayList, mVar);
    }

    private k() {
    }
}
