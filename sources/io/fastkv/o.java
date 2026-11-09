package io.fastkv;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.flexibank.sdk.g f37672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.flexibank.sdk.g f37673b;

    public final synchronized void a() {
        com.flexibank.sdk.g gVar = this.f37673b;
        this.f37672a = gVar;
        this.f37673b = null;
        if (gVar != null) {
            n.j().execute(this.f37672a);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f37672a == null) {
                this.f37672a = new com.flexibank.sdk.g(21, this, runnable);
                n.j().execute(this.f37672a);
            } else if (this.f37673b == null) {
                this.f37673b = new com.flexibank.sdk.g(21, this, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
