package C0;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final String createRoute(@Nullable String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final String getDisplayName(@NotNull Context context, int i7) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            strValueOf = context.getResources().getResourceName(i7);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i7);
        }
        Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                co….toString()\n            }");
        return strValueOf;
    }

    @NotNull
    public final Sequence<K> getHierarchy(@NotNull K k2) {
        Intrinsics.checkNotNullParameter(k2, "<this>");
        return Sf.m.b(k2, C0111c.f1012j);
    }

    @JvmStatic
    @NotNull
    public final <C> Class<? extends C> parseClassFromName(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
        if (name.charAt(0) == '.') {
            str = context.getPackageName() + name;
        } else {
            str = name;
        }
        LinkedHashMap linkedHashMap = K.f953p;
        Class<? extends C> cls = (Class) linkedHashMap.get(str);
        if (cls == null) {
            try {
                cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                linkedHashMap.put(name, cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        Intrinsics.e(cls);
        if (expectedClassType.isAssignableFrom(cls)) {
            return cls;
        }
        throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
    }

    @JvmStatic
    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final <C> Class<? extends C> parseClassFromNameInternal(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
        return K.f952o.parseClassFromName(context, name, expectedClassType);
    }

    private H() {
    }

    @JvmStatic
    public static /* synthetic */ void getHierarchy$annotations(K k2) {
    }
}
