package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
