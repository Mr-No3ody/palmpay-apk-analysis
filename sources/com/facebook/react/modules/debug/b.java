package com.facebook.react.modules.debug;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FpsDebugFrameCallback f21752b;

    public /* synthetic */ b(FpsDebugFrameCallback fpsDebugFrameCallback, int i7) {
        this.f21751a = i7;
        this.f21752b = fpsDebugFrameCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21751a) {
            case 0:
                FpsDebugFrameCallback.start$lambda$0(this.f21752b);
                break;
            default:
                FpsDebugFrameCallback.stop$lambda$1(this.f21752b);
                break;
        }
    }
}
