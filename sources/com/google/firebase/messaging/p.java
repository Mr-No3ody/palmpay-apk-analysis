package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23031b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f23030a = i7;
        this.f23031b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23030a) {
            case 0:
                ((SharedPreferencesQueue) this.f23031b).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) this.f23031b).lambda$arrangeTimeout$0();
                break;
        }
    }
}
