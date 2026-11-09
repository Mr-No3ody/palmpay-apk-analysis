package retrofit2;

import N8.q0;
import Wf.C0765i;
import com.alibaba.android.arouter.utils.Consts;
import com.google.maps.android.BuildConfig;
import com.horcrux.svg.Z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f41895a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41896b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f41897c;

    public static final Object b(Call call, Continuation frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        c0765i.invokeOnCancellation(new C1999q(call, 0));
        call.enqueue(new p204nb.t(c0765i));
        Object objM = c0765i.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }

    public static final Object c(Call call, Continuation frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        c0765i.invokeOnCancellation(new C1999q(call, 1));
        call.enqueue(new p183m6.j(c0765i, 21));
        Object objM = c0765i.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i7, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i7 >= 0 && i7 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i7];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Index ", " not in range [0,");
        sbE.append(actualTypeArguments.length);
        sbE.append(") for ");
        sbE.append(parameterizedType);
        throw new IllegalArgumentException(sbE.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return q(type, cls, f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? BuildConfig.TRAVIS : type.getClass().getName()));
    }

    public static Object k(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f41897c;
        if (declaredConstructor == null) {
            declaredConstructor = Z.D().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f41897c = declaredConstructor;
        }
        return Z.p(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Type type) {
        return f41896b && type == Unit.class;
    }

    public static IllegalArgumentException n(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbT = C0.G.t(String.format(str, objArr), "\n    for method ");
        sbT.append(method.getDeclaringClass().getSimpleName());
        sbT.append(Consts.DOT);
        sbT.append(method.getName());
        return new IllegalArgumentException(sbT.toString(), exc);
    }

    public static IllegalArgumentException o(Method method, int i7, String str, Object... objArr) {
        return n(method, null, q0.l(str, " (", F.f41820b.c(method, i7), ")"), objArr);
    }

    public static IllegalArgumentException p(Method method, Exception exc, int i7, String str, Object... objArr) {
        return n(method, exc, q0.l(str, " (", F.f41820b.c(method, i7), ")"), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public static Type q(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeQ;
        Type type4;
        Type type5 = type2;
        while (type5 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type4 = typeVariable;
            } else {
                Type typeF = f(type, cls, cls2);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i7])) {
                            type4 = ((ParameterizedType) typeF).getActualTypeArguments()[i7];
                            break;
                        }
                        i7++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
        if (type5 instanceof Class) {
            Class cls3 = (Class) type5;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeQ2 = q(type, cls, componentType);
                return componentType == typeQ2 ? cls3 : new Q(typeQ2);
            }
        }
        if (type5 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type5;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeQ3 = q(type, cls, genericComponentType);
            return genericComponentType == typeQ3 ? genericArrayType : new Q(typeQ3);
        }
        if (type5 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type5;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeQ4 = q(type, cls, ownerType);
            boolean z3 = typeQ4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeQ5 = q(type, cls, actualTypeArguments[i10]);
                if (typeQ5 != actualTypeArguments[i10]) {
                    if (!z3) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z3 = true;
                    }
                    actualTypeArguments[i10] = typeQ5;
                }
            }
            return z3 ? new S(typeQ4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type5 instanceof WildcardType) {
            wildcardType = (WildcardType) type5;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeQ6 = q(type, cls, lowerBounds[0]);
                if (typeQ6 != lowerBounds[0]) {
                    type3 = type5;
                    type3 = wildcardType;
                    return new T(new Type[]{Object.class}, new Type[]{typeQ6});
                }
            } else if (upperBounds.length == 1 && (typeQ = q(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                return new T(new Type[]{typeQ}, f41895a);
            }
        }
        type3 = type5;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        return type3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void r(Continuation continuation, Throwable th) {
        r frame;
        if (continuation instanceof r) {
            frame = (r) continuation;
            int i7 = frame.f41949b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f41949b = i7 - Integer.MIN_VALUE;
            } else {
                frame = new r(continuation);
            }
        } else {
            frame = new r(continuation);
        }
        Object obj = frame.f41948a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = frame.f41949b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            throw new C2127f();
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        frame.f41949b = 1;
        Wf.I.f10809a.a(frame.getContext(), new p7.h(frame, 4, th, false));
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public static void s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(H h7, Object obj);
}
