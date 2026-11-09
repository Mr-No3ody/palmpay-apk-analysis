package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f22921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f22922c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i7) {
        this.f22920a = i7;
        this.f22921b = runnable;
        this.f22922c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f22920a) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f22921b, this.f22922c);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f22921b, this.f22922c);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f22921b, this.f22922c);
                break;
        }
    }
}
