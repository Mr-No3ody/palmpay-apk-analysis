package com.transsnet.palmpay.core.base;

import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends F {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f27354n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f27355l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f27356m;

    static {
        new k(null);
        f27354n = l.class.getSimpleName();
    }

    @Override // androidx.lifecycle.B
    public final void e(LifecycleOwner owner, Observer observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (this.f17330c > 0) {
            F6.d.h(f27354n, 5, "multiple observers registered but only one will be notified of changes.");
        }
        super.e(owner, new K3.h(this, observer, 1));
    }

    @Override // androidx.lifecycle.B
    public final void k(Object obj) {
        this.f27355l.set(true);
        super.k(obj);
    }
}
