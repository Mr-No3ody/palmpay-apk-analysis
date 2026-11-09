package com.growingio.android.circler;

import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23136a;

    public b(c cVar) {
        this.f23136a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f23136a;
        if (cVar.f23141e.get() < 1) {
            h.c("CirclerService", "start WebSocketService timeout", new Object[0]);
            cVar.onFailed();
        }
    }
}
