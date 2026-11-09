package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Continuation f21791b;

    public /* synthetic */ b(Continuation continuation, int i7) {
        this.f21790a = i7;
        this.f21791b = continuation;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21790a) {
            case 0:
                return Task.onSuccess$lambda$12(this.f21791b, task);
            default:
                return Task.onSuccessTask$lambda$13(this.f21791b, task);
        }
    }
}
