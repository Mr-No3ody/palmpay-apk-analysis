package com.airbnb.lottie;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class C extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f19558a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f19558a.d((B) get());
            } catch (InterruptedException | ExecutionException e10) {
                this.f19558a.d(new B(e10));
            }
        } finally {
            this.f19558a = null;
        }
    }
}
