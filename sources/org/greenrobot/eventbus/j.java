package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.greenrobot.eventbus.meta.SubscriberInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41093a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41094b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41095c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f41096d = new StringBuilder(128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Class f41097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SubscriberInfo f41099g;

    public final boolean a(Method method, Class cls) {
        HashMap map = this.f41094b;
        Object objPut = map.put(cls, method);
        if (objPut == null) {
            return true;
        }
        if (objPut instanceof Method) {
            if (!b((Method) objPut, cls)) {
                throw new IllegalStateException();
            }
            map.put(cls, this);
        }
        return b(method, cls);
    }

    public final boolean b(Method method, Class cls) {
        StringBuilder sb2 = this.f41096d;
        sb2.setLength(0);
        sb2.append(method.getName());
        sb2.append('>');
        sb2.append(cls.getName());
        String string = sb2.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap map = this.f41095c;
        Class cls2 = (Class) map.put(string, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        map.put(string, cls2);
        return false;
    }
}
