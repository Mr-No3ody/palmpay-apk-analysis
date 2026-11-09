package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.jvm.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1857g {
    public /* synthetic */ C1857g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final String getClassQualifiedName(@NotNull Class<?> jClass) {
        String str;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String str2 = (String) C1858h.f38965d.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) C1858h.f38965d.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Nullable
    public final String getClassSimpleName(@NotNull Class<?> jClass) {
        String str;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String str2 = (String) C1858h.f38966e.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C1858h.f38966e.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String strP = StringsKt.P(simpleName, enclosingMethod.getName() + '$');
            if (strP != null) {
                return strP;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.O('$', simpleName, simpleName);
        }
        return StringsKt.P(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean isInstance(@Nullable Object obj, @NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = C1858h.f38964c;
        Intrinsics.f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return K.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNullParameter(jClass, "<this>");
            jClass = p002a.a.n(G.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    private C1857g() {
    }
}
