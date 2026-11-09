package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21713b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f21712a = i7;
        this.f21713b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21712a) {
            case 0:
                BridgeDevSupportManager.handleReloadJS$lambda$1$lambda$0((BridgeDevSupportManager) this.f21713b);
                break;
            case 1:
                ((DefaultDevLoadingViewImplementation) this.f21713b).hideInternal();
                break;
            case 2:
                ((DoubleTapReloadRecognizer) this.f21713b).doRefresh = false;
                break;
            case 3:
                PausedInDebuggerOverlayDialogManager.hidePausedInDebuggerOverlay$lambda$4((PausedInDebuggerOverlayDialogManager) this.f21713b);
                break;
            default:
                ((RedBoxDialogSurfaceDelegate) this.f21713b).show();
                break;
        }
    }
}
