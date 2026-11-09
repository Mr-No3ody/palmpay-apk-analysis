package p092g2;

import android.app.Application;
import android.util.Log;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f36839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f36840b;

    public static String a(String str, Object... objArr) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj instanceof Throwable) {
                objArr[i7] = Log.getStackTraceString((Throwable) obj);
            }
        }
        return String.format(str, objArr);
    }

    public static Object b(Class cls, Object... objArr) {
        boolean z3;
        boolean z8;
        try {
            Object[] objArr2 = {cls.getSimpleName(), Integer.valueOf(objArr.length)};
            if (c()) {
                a("Reflect to create object \"%s\" with %s constructor params", objArr2);
            }
            if (objArr.length == 0) {
                return cls.newInstance();
            }
            for (Constructor<?> constructor : cls.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != objArr.length) {
                    z3 = false;
                    break;
                }
                int i7 = 0;
                while (true) {
                    z3 = true;
                    if (i7 >= parameterTypes.length) {
                        break;
                    }
                    Class<?> cls2 = parameterTypes[i7];
                    Object obj = objArr[i7];
                    Class<?> cls3 = obj != null ? obj.getClass() : null;
                    if (cls3 == null) {
                        z8 = !cls2.isPrimitive();
                    } else {
                        if (cls2 != cls3 && !cls2.isAssignableFrom(cls3) && d(cls2) != d(cls3)) {
                            z3 = false;
                        }
                        z8 = z3;
                    }
                    if (!z8) {
                        z3 = false;
                        break;
                    }
                    i7++;
                }
                if (z3) {
                    return constructor.newInstance(objArr);
                }
            }
            Object[] objArr3 = {cls};
            if (c()) {
                Log.e("DRouterCore", a("Reflect \"%s\" getInstance no match and return \"null\"", objArr3));
                return null;
            }
            return null;
        } catch (Exception e10) {
            Object[] objArr4 = {cls, e10};
            if (c()) {
                Log.e("DRouterCore", a("Reflect \"%s\" getInstance Exception: %s", objArr4));
            }
        }
    }

    public static boolean c() {
        return f36840b;
    }

    public static Class d(Class cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return cls == Boolean.class ? Boolean.TYPE : cls;
    }
}
