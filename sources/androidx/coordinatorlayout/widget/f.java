package androidx.coordinatorlayout.widget;

import M.n;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools$SimplePool f15891a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15892b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15893c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f15894d = new HashSet();

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f15892b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                a(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
