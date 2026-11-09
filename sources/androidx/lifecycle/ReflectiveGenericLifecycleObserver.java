package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleObserver f17389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1194d f17390b;

    public ReflectiveGenericLifecycleObserver(LifecycleObserver lifecycleObserver) {
        this.f17389a = lifecycleObserver;
        C1196f c1196f = C1196f.f17450c;
        Class<?> cls = lifecycleObserver.getClass();
        C1194d c1194d = (C1194d) c1196f.f17451a.get(cls);
        this.f17390b = c1194d == null ? c1196f.a(cls, null) : c1194d;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
        HashMap map = this.f17390b.f17442a;
        List list = (List) map.get(enumC1203m);
        LifecycleObserver lifecycleObserver = this.f17389a;
        C1194d.a(list, lifecycleOwner, enumC1203m, lifecycleObserver);
        C1194d.a((List) map.get(EnumC1203m.ON_ANY), lifecycleOwner, enumC1203m, lifecycleObserver);
    }
}
