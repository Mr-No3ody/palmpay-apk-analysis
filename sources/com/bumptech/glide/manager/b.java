package com.bumptech.glide.manager;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ConnectivityMonitorFactory {
    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    public final ConnectivityMonitor build(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        return androidx.core.content.d.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new a(context, connectivityListener) : new i();
    }
}
