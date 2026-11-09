package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f11990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f11992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f11993d;

    public E(Function1 function1, Function1 function2, Function0 function0, Function0 function3) {
        this.f11990a = function1;
        this.f11991b = function2;
        this.f11992c = function0;
        this.f11993d = function3;
    }

    public final void onBackCancelled() {
        this.f11993d.invoke();
    }

    public final void onBackInvoked() {
        this.f11992c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f11991b.invoke(new C0812c(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f11990a.invoke(new C0812c(backEvent));
    }
}
