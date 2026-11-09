package com.bumptech.glide.manager;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class m implements SingletonConnectivityReceiver$FrameworkConnectivityMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J1.h f21057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f21058d = new l(this);

    public m(J1.h hVar, k kVar) {
        this.f21057c = hVar;
        this.f21056b = kVar;
    }

    @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor
    public final boolean register() {
        J1.h hVar = this.f21057c;
        this.f21055a = ((ConnectivityManager) hVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback(this.f21058d);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor
    public final void unregister() {
        ((ConnectivityManager) this.f21057c.get()).unregisterNetworkCallback(this.f21058d);
    }
}
