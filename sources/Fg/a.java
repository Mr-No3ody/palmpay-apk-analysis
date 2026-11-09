package Fg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f2837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2838d;

    public a(String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2835a = name;
        this.f2836b = z3;
        this.f2838d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f2835a;
    }
}
