package Eb;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f2290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f2291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f2292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.c f2293e;

    public n(long j6, Function0 onTick, Function0 onExpired) {
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        Intrinsics.checkNotNullParameter(onExpired, "onExpired");
        this.f2289a = j6;
        this.f2290b = onTick;
        this.f2291c = onExpired;
        this.f2292d = new Handler(Looper.getMainLooper());
        this.f2293e = new B5.c(this, 5);
    }

    public final void a() {
        b();
        this.f2290b.invoke();
        this.f2292d.postDelayed(this.f2293e, 1000L);
    }

    public final void b() {
        this.f2292d.removeCallbacks(this.f2293e);
    }
}
