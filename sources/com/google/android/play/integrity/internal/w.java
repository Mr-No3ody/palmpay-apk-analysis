package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f22777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f22778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f22778c = aeVar;
        this.f22776a = taskCompletionSource2;
        this.f22777b = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f22778c.f22753g) {
            try {
                ae.o(this.f22778c, this.f22776a);
                if (this.f22778c.f22759m.getAndIncrement() > 0) {
                    this.f22778c.f22749c.d("Already connected to the service.", new Object[0]);
                }
                ae.q(this.f22778c, this.f22777b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
