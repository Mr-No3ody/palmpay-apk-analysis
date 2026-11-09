package com.facebook.react.runtime.internal.bolts;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f21787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Continuation f21788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Executor f21789d;

    public /* synthetic */ a(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, int i7) {
        this.f21786a = i7;
        this.f21787b = taskCompletionSource;
        this.f21788c = continuation;
        this.f21789d = executor;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21786a) {
            case 0:
                return Task.continueWithTask$lambda$11$lambda$10(this.f21787b, this.f21788c, this.f21789d, task);
            default:
                return Task.continueWith$lambda$9$lambda$8(this.f21787b, this.f21788c, this.f21789d, task);
        }
    }
}
