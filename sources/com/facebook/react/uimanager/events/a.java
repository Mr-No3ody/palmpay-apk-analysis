package com.facebook.react.uimanager.events;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21823b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f21822a = i7;
        this.f21823b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21822a) {
            case 0:
                ((EventDispatcherImpl.ScheduleDispatchFrameCallback) this.f21823b).maybePost();
                break;
            case 1:
                ((FabricEventDispatcher.ScheduleDispatchFrameCallback) this.f21823b).maybeDispatchBatchedEvents();
                break;
            default:
                ((EventDispatcherImpl) this.f21823b).stopFrameCallback();
                break;
        }
    }
}
