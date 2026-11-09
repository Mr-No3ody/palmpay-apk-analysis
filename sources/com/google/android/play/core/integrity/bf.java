package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f22669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f22671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, long j6, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f22671c = bnVar;
        this.f22669a = j6;
        this.f22670b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.k(this.f22671c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f22671c;
            ((com.google.android.play.integrity.internal.i) bnVar.f22691a.e()).e(bn.b(bnVar, this.f22669a, 0), new bl(this.f22671c, this.f22670b));
        } catch (RemoteException e10) {
            this.f22671c.f22692b.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f22669a));
            this.f22670b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
