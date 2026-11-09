package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC1199i {
    final /* synthetic */ M this$0;

    public static final class a extends AbstractC1199i {
        final /* synthetic */ M this$0;

        public a(M m7) {
            this.this$0 = m7;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            M m7 = this.this$0;
            int i7 = m7.f17360a + 1;
            m7.f17360a = i7;
            if (i7 == 1 && m7.f17363d) {
                m7.f17365f.e(EnumC1203m.ON_START);
                m7.f17363d = false;
            }
        }
    }

    public K(M m7) {
        this.this$0 = m7;
    }

    @Override // androidx.lifecycle.AbstractC1199i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            ReportFragment.f17398b.get(activity).f17399a = this.this$0.f17367i;
        }
    }

    @Override // androidx.lifecycle.AbstractC1199i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        M m7 = this.this$0;
        int i7 = m7.f17361b - 1;
        m7.f17361b = i7;
        if (i7 == 0) {
            Handler handler = m7.f17364e;
            Intrinsics.e(handler);
            handler.postDelayed(m7.f17366g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @RequiresApi(29)
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        I.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1199i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        M m7 = this.this$0;
        int i7 = m7.f17360a - 1;
        m7.f17360a = i7;
        if (i7 == 0 && m7.f17362c) {
            m7.f17365f.e(EnumC1203m.ON_STOP);
            m7.f17363d = true;
        }
    }
}
