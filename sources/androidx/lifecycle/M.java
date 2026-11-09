package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M implements LifecycleOwner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f17358j = new J(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M f17359o = new M();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17361b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f17364e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17362c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17363d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1212w f17365f = new C1212w(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W8.o f17366g = new W8.o(this, 27);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f17367i = new L(this);

    public final void a() {
        int i7 = this.f17361b + 1;
        this.f17361b = i7;
        if (i7 == 1) {
            if (this.f17362c) {
                this.f17365f.e(EnumC1203m.ON_RESUME);
                this.f17362c = false;
            } else {
                Handler handler = this.f17364e;
                Intrinsics.e(handler);
                handler.removeCallbacks(this.f17366g);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        return this.f17365f;
    }
}
