package com.google.firebase.perf.transport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransportManager f23051b;

    public /* synthetic */ a(TransportManager transportManager, int i7) {
        this.f23050a = i7;
        this.f23051b = transportManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23050a) {
            case 0:
                this.f23051b.lambda$onUpdateAppState$1();
                break;
            default:
                this.f23051b.syncInit();
                break;
        }
    }
}
