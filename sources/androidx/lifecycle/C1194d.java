package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17442a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17443b;

    public C1194d(HashMap map) {
        this.f17443b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1203m enumC1203m = (EnumC1203m) entry.getValue();
            List arrayList = (List) this.f17442a.get(enumC1203m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f17442a.put(enumC1203m, arrayList);
            }
            arrayList.add((C1195e) entry.getKey());
        }
    }

    public static void a(List list, LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m, LifecycleObserver lifecycleObserver) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1195e c1195e = (C1195e) list.get(size);
                c1195e.getClass();
                try {
                    int i7 = c1195e.f17444a;
                    Method method = c1195e.f17445b;
                    if (i7 == 0) {
                        method.invoke(lifecycleObserver, new Object[0]);
                    } else if (i7 == 1) {
                        method.invoke(lifecycleObserver, lifecycleOwner);
                    } else if (i7 == 2) {
                        method.invoke(lifecycleObserver, lifecycleOwner, enumC1203m);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
