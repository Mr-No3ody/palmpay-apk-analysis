package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f11989a = new D();

    @DoNotInline
    @NotNull
    public final OnBackInvokedCallback a(@NotNull Function0<Unit> onBackInvoked) {
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new C(onBackInvoked, 0);
    }

    @DoNotInline
    public final void b(@NotNull Object dispatcher, int i7, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) callback);
    }

    @DoNotInline
    public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
