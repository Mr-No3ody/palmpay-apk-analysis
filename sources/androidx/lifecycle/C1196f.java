package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1196f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1196f f17450c = new C1196f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17451a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17452b = new HashMap();

    public static void b(HashMap map, C1195e c1195e, EnumC1203m enumC1203m, Class cls) {
        EnumC1203m enumC1203m2 = (EnumC1203m) map.get(c1195e);
        if (enumC1203m2 == null || enumC1203m == enumC1203m2) {
            if (enumC1203m2 == null) {
                map.put(c1195e, enumC1203m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1195e.f17445b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1203m2 + ", new value " + enumC1203m);
    }

    public final C1194d a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f17451a;
        if (superclass != null) {
            C1194d c1194dA = (C1194d) map2.get(superclass);
            if (c1194dA == null) {
                c1194dA = a(superclass, null);
            }
            map.putAll(c1194dA.f17443b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1194d c1194dA2 = (C1194d) map2.get(cls2);
            if (c1194dA2 == null) {
                c1194dA2 = a(cls2, null);
            }
            for (Map.Entry entry : c1194dA2.f17443b.entrySet()) {
                b(map, (C1195e) entry.getKey(), (EnumC1203m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC1203m enumC1203mValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1203m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1203mValue != EnumC1203m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C1195e(method, i7), enumC1203mValue, cls);
                z3 = true;
            }
        }
        C1194d c1194d = new C1194d(map);
        map2.put(cls, c1194d);
        this.f17452b.put(cls, Boolean.valueOf(z3));
        return c1194d;
    }
}
