package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements Lifecycle, LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f21033a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1205o f21034b;

    public LifecycleLifecycle(AbstractC1205o abstractC1205o) {
        this.f21034b = abstractC1205o;
        abstractC1205o.a(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void addListener(LifecycleListener lifecycleListener) {
        this.f21033a.add(lifecycleListener);
        EnumC1204n enumC1204n = ((C1212w) this.f21034b).f17478d;
        if (enumC1204n == EnumC1204n.f17460a) {
            lifecycleListener.onDestroy();
        } else if (enumC1204n.a(EnumC1204n.f17463d)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = J1.o.e(this.f21033a).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().b(this);
    }

    @OnLifecycleEvent(EnumC1203m.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = J1.o.e(this.f21033a).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(EnumC1203m.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = J1.o.e(this.f21033a).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(LifecycleListener lifecycleListener) {
        this.f21033a.remove(lifecycleListener);
    }
}
