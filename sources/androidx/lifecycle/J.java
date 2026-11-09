package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public /* synthetic */ J(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
    }

    @JvmStatic
    @NotNull
    public final LifecycleOwner get() {
        return M.f17359o;
    }

    @JvmStatic
    public final void init$lifecycle_process_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        M m7 = M.f17359o;
        m7.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m7.f17364e = new Handler();
        m7.f17365f.e(EnumC1203m.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new K(m7));
    }

    private J() {
    }
}
