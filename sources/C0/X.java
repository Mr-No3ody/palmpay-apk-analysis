package C0;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import java.io.Serializable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class X {
    public /* synthetic */ X(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public d0 fromArgType(@Nullable String str, @Nullable String str2) {
        W w3 = d0.f1021c;
        w3.getClass();
        if ("integer".equals(str)) {
            return w3;
        }
        W w6 = d0.f1023e;
        w6.getClass();
        if ("integer[]".equals(str)) {
            return w6;
        }
        W w10 = d0.f1024f;
        w10.getClass();
        if (Constants.LONG.equals(str)) {
            return w10;
        }
        W w11 = d0.f1025g;
        w11.getClass();
        if ("long[]".equals(str)) {
            return w11;
        }
        W w12 = d0.f1028j;
        w12.getClass();
        if ("boolean".equals(str)) {
            return w12;
        }
        W w13 = d0.f1029k;
        w13.getClass();
        if ("boolean[]".equals(str)) {
            return w13;
        }
        W w14 = d0.f1030l;
        w14.getClass();
        if (!"string".equals(str)) {
            W w15 = d0.f1031m;
            w15.getClass();
            if ("string[]".equals(str)) {
                return w15;
            }
            W w16 = d0.f1026h;
            w16.getClass();
            if ("float".equals(str)) {
                return w16;
            }
            W w17 = d0.f1027i;
            w17.getClass();
            if ("float[]".equals(str)) {
                return w17;
            }
            W w18 = d0.f1022d;
            w18.getClass();
            if ("reference".equals(str)) {
                return w18;
            }
            if (str != null && str.length() != 0) {
                try {
                    String strConcat = (!kotlin.text.y.m(str, Consts.DOT, false) || str2 == null) ? str : str2.concat(str);
                    if (kotlin.text.y.g(str, "[]", false)) {
                        strConcat = strConcat.substring(0, strConcat.length() - 2);
                        Intrinsics.checkNotNullExpressionValue(strConcat, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(strConcat);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            return new Z(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            return new b0(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(strConcat);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            return new a0(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            return new Y(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            return new c0(cls2);
                        }
                    }
                    throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return w14;
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final d0 inferFromValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            try {
                try {
                    try {
                        W w3 = d0.f1021c;
                        w3.c(value);
                        return w3;
                    } catch (IllegalArgumentException unused) {
                        W w6 = d0.f1026h;
                        w6.c(value);
                        return w6;
                    }
                } catch (IllegalArgumentException unused2) {
                    W w10 = d0.f1030l;
                    Intrinsics.f(w10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return w10;
                }
            } catch (IllegalArgumentException unused3) {
                W w11 = d0.f1024f;
                w11.c(value);
                return w11;
            }
        } catch (IllegalArgumentException unused4) {
            W w12 = d0.f1028j;
            w12.c(value);
            return w12;
        }
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final d0 inferFromValueType(@Nullable Object obj) {
        if (obj instanceof Integer) {
            W w3 = d0.f1021c;
            Intrinsics.f(w3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w3;
        }
        if (obj instanceof int[]) {
            W w6 = d0.f1023e;
            Intrinsics.f(w6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w6;
        }
        if (obj instanceof Long) {
            W w10 = d0.f1024f;
            Intrinsics.f(w10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w10;
        }
        if (obj instanceof long[]) {
            W w11 = d0.f1025g;
            Intrinsics.f(w11, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w11;
        }
        if (obj instanceof Float) {
            W w12 = d0.f1026h;
            Intrinsics.f(w12, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w12;
        }
        if (obj instanceof float[]) {
            W w13 = d0.f1027i;
            Intrinsics.f(w13, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w13;
        }
        if (obj instanceof Boolean) {
            W w14 = d0.f1028j;
            Intrinsics.f(w14, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w14;
        }
        if (obj instanceof boolean[]) {
            W w15 = d0.f1029k;
            Intrinsics.f(w15, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w15;
        }
        if ((obj instanceof String) || obj == null) {
            W w16 = d0.f1030l;
            Intrinsics.f(w16, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w16;
        }
        if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
            W w17 = d0.f1031m;
            Intrinsics.f(w17, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return w17;
        }
        if (obj.getClass().isArray()) {
            Class<?> componentType = obj.getClass().getComponentType();
            Intrinsics.e(componentType);
            if (Parcelable.class.isAssignableFrom(componentType)) {
                Class<?> componentType2 = obj.getClass().getComponentType();
                Intrinsics.f(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                return new Z(componentType2);
            }
        }
        if (obj.getClass().isArray()) {
            Class<?> componentType3 = obj.getClass().getComponentType();
            Intrinsics.e(componentType3);
            if (Serializable.class.isAssignableFrom(componentType3)) {
                Class<?> componentType4 = obj.getClass().getComponentType();
                Intrinsics.f(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                return new b0(componentType4);
            }
        }
        if (obj instanceof Parcelable) {
            return new a0(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new Y(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new c0(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    private X() {
    }
}
