package com.transsnet.palmpay.core.ui.activity;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27665e;

    public L(boolean z3, String index, String name, String router, String parameters) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f27661a = index;
        this.f27662b = name;
        this.f27663c = router;
        this.f27664d = parameters;
        this.f27665e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l5 = (L) obj;
        return Intrinsics.c(this.f27661a, l5.f27661a) && Intrinsics.c(this.f27662b, l5.f27662b) && Intrinsics.c(this.f27663c, l5.f27663c) && Intrinsics.c(this.f27664d, l5.f27664d) && this.f27665e == l5.f27665e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27665e) + C0.G.c(C0.G.c(C0.G.c(this.f27661a.hashCode() * 31, 31, this.f27662b), 31, this.f27663c), 31, this.f27664d);
    }

    public final String toString() {
        return "DeepLinkItem(index=" + this.f27661a + ", name=" + this.f27662b + ", router=" + this.f27663c + ", parameters=" + this.f27664d + ", needLogin=" + this.f27665e + ")";
    }
}
