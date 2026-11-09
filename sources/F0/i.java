package F0;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public final j from(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        G0.d dVarObtain = G0.d.f2889a.obtain(context);
        if (dVarObtain != null) {
            return new h(dVarObtain);
        }
        return null;
    }

    private i() {
    }
}
