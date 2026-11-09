package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f21793b;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource, int i7) {
        this.f21792a = i7;
        this.f21793b = taskCompletionSource;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21792a) {
            case 0:
                return Task.Companion.completeAfterTask$lambda$5$lambda$4(this.f21793b, task);
            default:
                return Task.Companion.call$lambda$2$lambda$0(this.f21793b, task);
        }
    }
}
