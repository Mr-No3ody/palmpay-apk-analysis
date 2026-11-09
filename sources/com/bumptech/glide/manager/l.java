package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f21054a;

    public l(m mVar) {
        this.f21054a = mVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        J1.o.f().post(new B5.a(this, true, 2));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        J1.o.f().post(new B5.a(this, false, 2));
    }
}
