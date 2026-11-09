package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22887b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f22886a = i7;
        this.f22887b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22886a) {
            case 0:
                ((JdkFutureAdapters.ListenableFutureAdapter) this.f22887b).lambda$addListener$0();
                break;
            default:
                WrappingExecutorService.lambda$wrapTask$0((Callable) this.f22887b);
                break;
        }
    }
}
