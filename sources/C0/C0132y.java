package C0;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: C0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132y {
    public /* synthetic */ C0132y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final C0133z fromAction(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.length() <= 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        C0133z c0133z = new C0133z();
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.length() <= 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        c0133z.f1130b = action;
        return c0133z;
    }

    @JvmStatic
    @NotNull
    public final C0133z fromMimeType(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        C0133z c0133z = new C0133z();
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        c0133z.f1131c = mimeType;
        return c0133z;
    }

    @JvmStatic
    @NotNull
    public final C0133z fromUriPattern(@NotNull String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        C0133z c0133z = new C0133z();
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        c0133z.f1129a = uriPattern;
        return c0133z;
    }

    private C0132y() {
    }
}
