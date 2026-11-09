package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f22924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f22925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f22926d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i7) {
        this.f22923a = i7;
        this.f22924b = delegatingScheduledExecutorService;
        this.f22925c = runnable;
        this.f22926d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22923a) {
            case 0:
                this.f22924b.lambda$scheduleWithFixedDelay$10(this.f22925c, this.f22926d);
                break;
            case 1:
                this.f22924b.lambda$scheduleAtFixedRate$7(this.f22925c, this.f22926d);
                break;
            default:
                this.f22924b.lambda$schedule$1(this.f22925c, this.f22926d);
                break;
        }
    }
}
