package V0;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
    @JvmStatic
    @NotNull
    public U getInstance() {
        androidx.work.impl.s sVarF = androidx.work.impl.s.f();
        if (sVarF != null) {
            return sVarF;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @JvmStatic
    public void initialize(@NotNull Context context, @NotNull C0684c configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        androidx.work.impl.s.h(context, configuration);
    }

    @JvmStatic
    public boolean isInitialized() {
        return androidx.work.impl.s.f() != null;
    }

    private T() {
    }

    @JvmStatic
    @NotNull
    public U getInstance(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.work.impl.s sVarG = androidx.work.impl.s.g(context);
        Intrinsics.checkNotNullExpressionValue(sVarG, "getInstance(context)");
        return sVarG;
    }
}
