package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.activity.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0816g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0816g f12029a = new C0816g();

    @DoNotInline
    @NotNull
    public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
