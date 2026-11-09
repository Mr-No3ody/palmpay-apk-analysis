package androidx.camera.view.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import androidx.camera.view.C1021b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1021b f14962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GestureDetector f14972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14973m;

    static {
        new a(null);
    }

    public f(Context context, C1021b listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14961a = scaledTouchSlop;
        this.f14962b = listener;
        this.f14963c = true;
        this.f14964d = true;
        this.f14972l = new GestureDetector(context, new e(this, 0));
    }

    public final float a() {
        if (!b()) {
            float f10 = this.f14966f;
            if (f10 > 0.0f) {
                return this.f14965e / f10;
            }
            return 1.0f;
        }
        boolean z3 = this.f14973m;
        boolean z8 = (z3 && this.f14965e < this.f14966f) || (!z3 && this.f14965e > this.f14966f);
        float fAbs = Math.abs(1 - (this.f14965e / this.f14966f)) * 0.5f;
        if (this.f14966f <= this.f14961a) {
            return 1.0f;
        }
        return z8 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public final boolean b() {
        return this.f14971k != 0;
    }
}
