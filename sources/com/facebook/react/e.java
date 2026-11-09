package com.facebook.react;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21741b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f21740a = i7;
        this.f21741b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21740a) {
            case 0:
                ((ReactInstanceManager.InspectorTargetDelegateImpl) this.f21741b).lambda$onReload$0();
                break;
            case 1:
                ((ReactActivityDelegate) this.f21741b).lambda$onCreate$0();
                break;
            case 2:
                ReactDelegate.reload$lambda$0((ReactDelegate) this.f21741b);
                break;
            default:
                ((ReactInstanceManager) this.f21741b).lambda$runCreateReactContextOnNewThread$0();
                break;
        }
    }
}
