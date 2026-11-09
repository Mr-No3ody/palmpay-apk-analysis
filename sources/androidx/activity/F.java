package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.annotation.DoNotInline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f11994a = new F();

    @DoNotInline
    @NotNull
    public final OnBackInvokedCallback a(@NotNull Function1<? super C0812c, Unit> onBackStarted, @NotNull Function1<? super C0812c, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new E(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
