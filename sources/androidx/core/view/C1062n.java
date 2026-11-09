package androidx.core.view;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: renamed from: androidx.core.view.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f16265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LifecycleEventObserver f16266b;

    public C1062n(AbstractC1205o abstractC1205o, LifecycleEventObserver lifecycleEventObserver) {
        this.f16265a = abstractC1205o;
        this.f16266b = lifecycleEventObserver;
        abstractC1205o.a(lifecycleEventObserver);
    }
}
