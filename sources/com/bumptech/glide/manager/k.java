package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ConnectivityMonitor.ConnectivityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f21053a;

    public k(n nVar) {
        this.f21053a = nVar;
    }

    @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
    public final void onConnectivityChanged(boolean z3) {
        ArrayList arrayList;
        J1.o.a();
        synchronized (this.f21053a) {
            arrayList = new ArrayList(this.f21053a.f21061b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ConnectivityMonitor.ConnectivityListener) it.next()).onConnectivityChanged(z3);
        }
    }
}
