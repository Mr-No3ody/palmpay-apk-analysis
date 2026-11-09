package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Continuation f21795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Task f21796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f21797d;

    public /* synthetic */ d(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource, int i7) {
        this.f21794a = i7;
        this.f21795b = continuation;
        this.f21796c = task;
        this.f21797d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21794a) {
            case 0:
                Task.Companion.completeImmediately$lambda$3(this.f21795b, this.f21796c, this.f21797d);
                break;
            default:
                Task.Companion.completeAfterTask$lambda$5(this.f21795b, this.f21796c, this.f21797d);
                break;
        }
    }
}
