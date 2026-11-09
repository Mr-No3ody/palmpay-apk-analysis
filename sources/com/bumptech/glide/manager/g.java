package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC1205o;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements LifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1205o f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21044b;

    public g(h hVar, AbstractC1205o abstractC1205o) {
        this.f21044b = hVar;
        this.f21043a = abstractC1205o;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
        ((HashMap) this.f21044b.f21045a).remove(this.f21043a);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }
}
