package H5;

import android.annotation.SuppressLint;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @SuppressLint({"SupportAnnotationUsage"})
    @NotNull
    public final j dp(@Dimension(unit = 0) @NotNull Number dp) {
        Intrinsics.checkNotNullParameter(dp, "dp");
        return new k(dp);
    }

    @JvmStatic
    @SuppressLint({"SupportAnnotationUsage"})
    @NotNull
    public final j px(@Dimension(unit = 1) @NotNull Number px) {
        Intrinsics.checkNotNullParameter(px, "px");
        return new l(px);
    }

    @JvmStatic
    @NotNull
    public final j res(@DimenRes int i7) {
        return new m(i7);
    }

    private i() {
    }
}
