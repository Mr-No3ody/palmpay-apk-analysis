package X5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p264r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f10998a = Class.class.getMethod("isRecord", new Class[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f10999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f11000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f11001d;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f10999b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f11000c = componentType.getMethod("getName", new Class[0]);
        this.f11001d = componentType.getMethod("getType", new Class[0]);
    }

    @Override // p264r5.a
    public final boolean A(Class cls) {
        try {
            return ((Boolean) this.f10998a.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p264r5.a
    public final Method l(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p264r5.a
    public final Constructor n(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f10999b.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                clsArr[i7] = (Class) this.f11001d.invoke(objArr[i7], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p264r5.a
    public final String[] v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f10999b.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                strArr[i7] = (String) this.f11000c.invoke(objArr[i7], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
