package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208s extends AbstractC1199i {
    @Override // androidx.lifecycle.AbstractC1199i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ReportFragment.f17398b.injectIfNeededIn(activity);
    }
}
