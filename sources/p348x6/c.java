package p348x6;

import com.google.mlkit.vision.face.Face;
import com.palmpay.lib.liveness.task.IDetectionTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p232p6.p;
import p292t6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements IDetectionTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f43640c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43642b;

    static {
        new b(null);
        f43640c = C1850q.h(Float.valueOf(3.0f), Float.valueOf(6.0f));
    }

    public c(String threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f43641a = threshold;
        this.f43642b = new ArrayList();
    }

    public final float[] a() {
        float fFloatValue;
        List listSplit$default = StringsKt__StringsKt.split$default(this.f43641a, new String[]{","}, false, 0, 6, null);
        boolean zIsEmpty = listSplit$default.isEmpty();
        List list = f43640c;
        if (zIsEmpty || listSplit$default.size() != list.size()) {
            return CollectionsKt.W(list);
        }
        List list2 = listSplit$default;
        ArrayList arrayList = new ArrayList(r.l(list2, 10));
        int i7 = 0;
        for (Object obj : list2) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            try {
                fFloatValue = Float.parseFloat((String) obj);
            } catch (NumberFormatException unused) {
                fFloatValue = ((Number) list.get(i7)).floatValue();
            }
            arrayList.add(Float.valueOf(fFloatValue));
            i7 = i10;
        }
        return CollectionsKt.W(arrayList);
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final boolean process(Face face2) {
        Intrinsics.checkNotNullParameter(face2, "face");
        p.f41245l.headNod();
        float headEulerAngleX = face2.getHeadEulerAngleX();
        int i7 = a.f42345a;
        a.a("rotX: " + headEulerAngleX);
        float fAbs = Math.abs(headEulerAngleX);
        boolean z3 = false;
        float f10 = a()[0];
        ArrayList arrayList = this.f43642b;
        if (fAbs > f10) {
            arrayList.add(Float.valueOf(headEulerAngleX));
        }
        if (arrayList.size() > 10) {
            arrayList.remove(0);
        }
        if (arrayList.size() >= 2) {
            Float fN = CollectionsKt.N(arrayList);
            float fFloatValue = fN != null ? fN.floatValue() : 0.0f;
            Float fO = CollectionsKt.O(arrayList);
            if (fFloatValue - (fO != null ? fO.floatValue() : 0.0f) > a()[1]) {
                z3 = true;
            }
        }
        a.a("isNod: " + z3);
        return z3;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final void start() {
        this.f43642b.clear();
    }
}
