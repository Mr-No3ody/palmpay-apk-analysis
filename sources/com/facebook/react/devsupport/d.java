package com.facebook.react.devsupport;

import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21721c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f21719a = i7;
        this.f21721c = obj;
        this.f21720b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21719a) {
            case 0:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onFailure$lambda$0((Throwable) this.f21721c, (CxxInspectorPackagerConnection.WebSocketDelegate) this.f21720b);
                break;
            case 1:
                ((CxxInspectorPackagerConnection.WebSocketDelegate) this.f21720b).didReceiveMessage((String) this.f21721c);
                break;
            case 2:
                ((DefaultDevLoadingViewImplementation) this.f21721c).showInternal((String) this.f21720b);
                break;
            case 3:
                DevSupportManagerBase.isPackagerRunning$lambda$22((DevSupportManagerBase) this.f21721c, (PackagerStatusCallback) this.f21720b);
                break;
            default:
                DevSupportManagerBase.reportBundleLoadingFailure$lambda$23((Exception) this.f21721c, (DevSupportManagerBase) this.f21720b);
                break;
        }
    }

    public /* synthetic */ d(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, String str) {
        this.f21719a = 1;
        this.f21720b = webSocketDelegate;
        this.f21721c = str;
    }
}
