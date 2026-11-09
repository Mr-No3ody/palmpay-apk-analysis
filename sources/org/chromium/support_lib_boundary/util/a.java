package org.chromium.support_lib_boundary.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41029a;

    public a(Object obj) {
        this.f41029a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z3 = obj instanceof a;
        Object obj2 = this.f41029a;
        return z3 ? obj2.equals(((a) obj).f41029a) : obj2.equals(obj);
    }

    public final int hashCode() {
        return this.f41029a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f41029a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        } catch (ReflectiveOperationException e11) {
            throw new RuntimeException("Reflection failed for method " + method, e11);
        }
    }
}
