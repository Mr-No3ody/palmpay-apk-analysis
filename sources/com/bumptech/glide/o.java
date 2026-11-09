package com.bumptech.glide;

import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.request.Request;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ConnectivityMonitor.ConnectivityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final He.a f21064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f21065b;

    public o(p pVar, He.a aVar) {
        this.f21065b = pVar;
        this.f21064a = aVar;
    }

    @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
    public final void onConnectivityChanged(boolean z3) {
        if (z3) {
            synchronized (this.f21065b) {
                He.a aVar = this.f21064a;
                for (Request request : J1.o.e((Set) aVar.f3865c)) {
                    if (!request.isComplete() && !request.isCleared()) {
                        request.clear();
                        if (aVar.f3864b) {
                            ((HashSet) aVar.f3866d).add(request);
                        } else {
                            request.begin();
                        }
                    }
                }
            }
        }
    }
}
