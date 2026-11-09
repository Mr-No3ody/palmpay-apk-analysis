package Pa;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Pa.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0512i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f7093a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f7094b = new ArrayList();

    public static void a(List list) {
        ArrayList arrayList = f7094b;
        arrayList.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList.addAll(list);
    }
}
