package j4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f38286a;

    static {
        List list;
        f fVar = new f();
        List list2 = fVar.f38289a;
        if (list2 == null || list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new W3.g.a("Nigeria", "尼日利亚", "NG", "NGN", "₦", 234));
            arrayList.add(new W3.g.a("Ghana", "加纳", "GH", "GHS", "GHS", 233));
            fVar.f38289a = arrayList;
            list = arrayList;
        } else {
            List list3 = fVar.f38289a;
            Intrinsics.e(list3);
            list = list3;
        }
        fVar.f38289a = list;
        f38286a = fVar;
    }
}
