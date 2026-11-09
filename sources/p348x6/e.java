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
public final class e implements IDetectionTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f43643c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43645b;

    static {
        new d(null);
        f43643c = C1850q.h(Float.valueOf(10.0f), Float.valueOf(14.0f));
    }

    public e(String threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f43644a = threshold;
        this.f43645b = new ArrayList();
    }

    public final float[] a() {
        float fFloatValue;
        List listSplit$default = StringsKt__StringsKt.split$default(this.f43644a, new String[]{","}, false, 0, 6, null);
        boolean zIsEmpty = listSplit$default.isEmpty();
        List list = f43643c;
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
        p.f41245l.headShake();
        float headEulerAngleY = face2.getHeadEulerAngleY();
        int i7 = a.f42345a;
        a.a("rotY: " + headEulerAngleY);
        float fAbs = Math.abs(headEulerAngleY);
        boolean z3 = false;
        float f10 = a()[0];
        ArrayList arrayList = this.f43645b;
        if (fAbs > f10) {
            arrayList.add(Float.valueOf(headEulerAngleY));
        }
        if (arrayList.size() > 10) {
            arrayList.remove(0);
        }
        if (arrayList.size() >= 2) {
            Float fN = CollectionsKt.N(arrayList);
            float fFloatValue = fN != null ? fN.floatValue() : 0.0f;
            Float fO = CollectionsKt.O(arrayList);
            float fFloatValue2 = fFloatValue - (fO != null ? fO.floatValue() : 0.0f);
            a.a("shakeRange: " + fFloatValue2);
            if (fFloatValue2 > a()[1]) {
                z3 = true;
            }
        }
        a.a("isShake: " + z3);
        return z3;
    }

    @Override // com.palmpay.lib.liveness.task.IDetectionTask
    public final void start() {
        this.f43645b.clear();
    }
}
