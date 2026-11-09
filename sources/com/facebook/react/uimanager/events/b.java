package com.facebook.react.uimanager.events;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FabricEventDispatcher f21825b;

    public /* synthetic */ b(FabricEventDispatcher fabricEventDispatcher, int i7) {
        this.f21824a = i7;
        this.f21825b = fabricEventDispatcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21824a) {
            case 0:
                this.f21825b.cancelDispatchOfBatchedEvents();
                break;
            default:
                FabricEventDispatcher.dispatchEventsRunnable$lambda$0(this.f21825b);
                break;
        }
    }
}
