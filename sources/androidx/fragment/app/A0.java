package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {
    public /* synthetic */ A0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final B0 asOperationState(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? B0.f16953e : from(view.getVisibility());
    }

    @JvmStatic
    @NotNull
    public final B0 from(int i7) {
        if (i7 == 0) {
            return B0.f16951c;
        }
        if (i7 == 4) {
            return B0.f16953e;
        }
        if (i7 == 8) {
            return B0.f16952d;
        }
        throw new IllegalArgumentException(C0.G.m(i7, "Unknown visibility "));
    }

    private A0() {
    }
}
