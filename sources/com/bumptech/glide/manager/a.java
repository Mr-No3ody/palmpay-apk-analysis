package com.bumptech.glide.manager;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ConnectivityMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityMonitor.ConnectivityListener f21036b;

    public a(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f21035a = context.getApplicationContext();
        this.f21036b = connectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        n nVarA = n.a(this.f21035a);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f21036b;
        synchronized (nVarA) {
            nVarA.f21061b.add(connectivityListener);
            if (!nVarA.f21062c && !nVarA.f21061b.isEmpty()) {
                nVarA.f21062c = nVarA.f21060a.register();
            }
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        n nVarA = n.a(this.f21035a);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f21036b;
        synchronized (nVarA) {
            nVarA.f21061b.remove(connectivityListener);
            if (nVarA.f21062c && nVarA.f21061b.isEmpty()) {
                nVarA.f21060a.unregister();
                nVarA.f21062c = false;
            }
        }
    }
}
