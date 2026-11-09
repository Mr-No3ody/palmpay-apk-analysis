package com.flexibank.sdk;

import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/flexibank/sdk/FlexiBankSdk$CashierLaunchSession", "Landroidx/lifecycle/DefaultLifecycleObserver;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class FlexiBankSdk$CashierLaunchSession implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0822m f21925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G9.i f21926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.activity.result.g f21927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21928d;

    public FlexiBankSdk$CashierLaunchSession(AbstractActivityC0822m hostActivity, String launcherKey, G9.i callback) {
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        Intrinsics.checkNotNullParameter(launcherKey, "launcherKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f21925a = hostActivity;
        this.f21926b = callback;
    }

    public final void a() {
        if (this.f21928d) {
            return;
        }
        this.f21928d = true;
        androidx.activity.result.g gVar = this.f21927c;
        if (gVar != null) {
            gVar.b();
        }
        this.f21927c = null;
        this.f21925a.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        a();
    }
}
