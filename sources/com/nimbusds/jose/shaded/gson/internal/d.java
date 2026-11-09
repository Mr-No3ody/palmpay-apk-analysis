package com.nimbusds.jose.shaded.gson.internal;

import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.shaded.gson.ReflectionAccessFilter;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f23631a = new Type[0];

    public static Type a(Type type) {
        Type aVar;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                aVar = cls;
                aVar = new a(a(cls.getComponentType()));
            }
            aVar = cls;
            return aVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Type type) {
        b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean d(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static com.nimbusds.jose.shaded.gson.t e(ArrayList arrayList, Class cls) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.nimbusds.jose.shaded.gson.t tVarCheck = ((ReflectionAccessFilter) it.next()).check(cls);
            if (tVarCheck != com.nimbusds.jose.shaded.gson.t.f23718b) {
                return tVarCheck;
            }
        }
        return com.nimbusds.jose.shaded.gson.t.f23717a;
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

    public static Class g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            b(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? BuildConfig.TRAVIS : type.getClass().getName()));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.nimbusds.jose.shaded.gson.internal.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.nimbusds.jose.shaded.gson.internal.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static Type h(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeH;
        Type[] upperBounds2;
        Type typeH2;
        Type[] lowerBounds2;
        Type typeH3;
        boolean z3;
        Type[] actualTypeArguments;
        int length;
        Type bVar;
        Type typeH4;
        Type genericComponentType;
        Type typeH5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeH instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeH).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeH};
                                }
                                type2 = new c(upperBounds2, f23631a);
                                break;
                            }
                            typeH2 = h(type, cls, lowerBounds[0], map);
                            if (typeH2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeH2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeH2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeH2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeH3 = h(type, cls, ownerType, map);
                        z3 = !Objects.equals(typeH3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            typeH4 = h(type, cls, actualTypeArguments[i7], map);
                            if (Objects.equals(typeH4, actualTypeArguments[i7])) {
                                if (!z3) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z3 = true;
                                }
                                actualTypeArguments[i7] = typeH4;
                            }
                        }
                        if (z3) {
                            break;
                        }
                        bVar = new b(typeH3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeH5 = h(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeH5)) {
                        bVar = new a(typeH5);
                        type2 = bVar;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeH = h(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeH instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeH).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeH};
                                    }
                                    type2 = new c(upperBounds2, f23631a);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeH2 = h(type, cls, lowerBounds[0], map);
                            if (typeH2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeH2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeH2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeH2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeH3 = h(type, cls, ownerType2, map);
                        z3 = !Objects.equals(typeH3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i7 < length) {
                            typeH4 = h(type, cls, actualTypeArguments[i7], map);
                            if (Objects.equals(typeH4, actualTypeArguments[i7])) {
                                if (!z3) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z3 = true;
                                }
                                actualTypeArguments[i7] = typeH4;
                            }
                        }
                        if (z3) {
                            break;
                        }
                        bVar = new b(typeH3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeH5 = h(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeH5)) {
                        break;
                    }
                    bVar = new a(typeH5);
                    type2 = bVar;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeH6 = h(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeH6)) {
                    bVar = new a(typeH6);
                    type2 = bVar;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeF = f(type, cls, cls4);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type2 = ((ParameterizedType) typeF).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
