package C0;

import android.util.TypedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    public /* synthetic */ Q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final d0 checkNavType$navigation_runtime_release(@NotNull TypedValue value, @Nullable d0 d0Var, @NotNull d0 expectedNavType, @Nullable String str, @NotNull String foundType) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
        Intrinsics.checkNotNullParameter(foundType, "foundType");
        if (d0Var == null || d0Var == expectedNavType) {
            return d0Var == null ? expectedNavType : d0Var;
        }
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("Type is ", str, " but found ", foundType, ": ");
        sbF.append(value.data);
        throw new XmlPullParserException(sbF.toString());
    }

    private Q() {
    }
}
