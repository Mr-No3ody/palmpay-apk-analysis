package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f15860a;

    public final void a(int i7, SharedValues$SharedValuesListener sharedValues$SharedValuesListener) {
        HashMap map = this.f15860a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i7));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i7), hashSet);
        }
        hashSet.add(new WeakReference(sharedValues$SharedValuesListener));
    }
}
