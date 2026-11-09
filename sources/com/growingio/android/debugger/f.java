package com.growingio.android.debugger;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23172a;

    public f(g gVar) {
        this.f23172a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f23172a;
        if (gVar.f23177e.get() < 1) {
            p198n5.h.c("DebuggerService", "start WebSocketService timeout", new Object[0]);
            gVar.onFailed();
        }
    }
}
