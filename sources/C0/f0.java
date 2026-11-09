package C0;

import androidx.navigation.Navigator$Name;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public /* synthetic */ f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final String getNameForNavigator$navigation_common_release(@NotNull Class<? extends e0> navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = g0.f1043c;
        String strValue = (String) linkedHashMap.get(navigatorClass);
        if (strValue == null) {
            Navigator$Name navigator$Name = (Navigator$Name) navigatorClass.getAnnotation(Navigator$Name.class);
            strValue = navigator$Name != null ? navigator$Name.value() : null;
            if (!validateName$navigation_common_release(strValue)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, strValue);
        }
        Intrinsics.e(strValue);
        return strValue;
    }

    public final boolean validateName$navigation_common_release(@Nullable String str) {
        return str != null && str.length() > 0;
    }

    private f0() {
    }
}
