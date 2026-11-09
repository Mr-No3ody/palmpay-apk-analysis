package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f21723b;

    public /* synthetic */ e(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, int i7) {
        this.f21722a = i7;
        this.f21723b = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21722a) {
            case 0:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onClosed$lambda$3(this.f21723b);
                break;
            default:
                this.f21723b.didOpen();
                break;
        }
    }
}
