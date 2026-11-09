package p079f6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.palmpay.lib.apm.inf.IgnoreAppStartTimeTrack;
import com.palmpay.lib.apm.startup.AppStartupPerfTracker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36409a = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Application.ActivityLifecycleCallbacks() { // from class: com.palmpay.lib.apm.LibApm$callback$2$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (activity instanceof IgnoreAppStartTimeTrack) {
                    return;
                }
                AppStartupPerfTracker.onActivityCreated(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (activity instanceof IgnoreAppStartTimeTrack) {
                    return;
                }
                AppStartupPerfTracker.onActivityDestroyed(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (activity instanceof IgnoreAppStartTimeTrack) {
                    AppStartupPerfTracker.onIgnoreActivityResumed(activity);
                } else {
                    AppStartupPerfTracker.onActivityResumed(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        };
    }
}
