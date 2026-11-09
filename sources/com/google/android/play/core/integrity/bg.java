package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f22673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f22674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f22676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, String str, long j6, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f22676e = bnVar;
        this.f22672a = str;
        this.f22673b = j6;
        this.f22674c = j10;
        this.f22675d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.k(this.f22676e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f22676e;
            ((com.google.android.play.integrity.internal.i) bnVar.f22691a.e()).d(bn.a(bnVar, this.f22672a, this.f22673b, this.f22674c, 0), new bk(this.f22676e, this.f22675d, this.f22673b));
        } catch (RemoteException e10) {
            this.f22676e.f22692b.c(e10, "requestExpressIntegrityToken(%s, %s)", this.f22672a, Long.valueOf(this.f22673b));
            this.f22675d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
