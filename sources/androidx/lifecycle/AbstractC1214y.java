package androidx.lifecycle;

import com.alibaba.android.arouter.utils.Consts;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1214y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f17485a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17486b = new HashMap();

    public static GeneratedAdapter a(Constructor constructor, LifecycleObserver lifecycleObserver) {
        try {
            Object objNewInstance = constructor.newInstance(lifecycleObserver);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return kotlin.text.y.k(className, Consts.DOT, "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x013d A[SYNTHETIC] */
    public static int c(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i7;
        boolean z3;
        HashMap map = f17485a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r3 != null ? r3.getName() : "";
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strB = b(name);
                if (fullPackage.length() != 0) {
                    strB = fullPackage + '.' + strB;
                }
                declaredConstructor = Class.forName(strB).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f17486b;
            if (declaredConstructor != null) {
                map2.put(cls, C1849p.c(declaredConstructor));
            } else {
                C1196f c1196f = C1196f.f17450c;
                HashMap map3 = c1196f.f17452b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((OnLifecycleEvent) declaredMethods[i11].getAnnotation(OnLifecycleEvent.class)) != null) {
                                c1196f.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i11++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                        Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            Intrinsics.e(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                            for (Class<?> intrface : interfaces) {
                                if (intrface == null && LifecycleObserver.class.isAssignableFrom(intrface)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                                    if (c(intrface) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(intrface);
                                        Intrinsics.e(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                        while (i7 < r7) {
                            if (intrface == null) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                                if (c(intrface) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(intrface);
                                    Intrinsics.e(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
