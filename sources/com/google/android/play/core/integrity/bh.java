package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f22677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f22678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f22680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f22681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(bnVar, taskCompletionSource);
        this.f22681e = bnVar;
        this.f22677a = bundle;
        this.f22678b = activity;
        this.f22679c = taskCompletionSource2;
        this.f22680d = i7;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.k(this.f22681e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f22681e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f22691a;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f22677a, bnVar.f22695e.a(this.f22678b, this.f22679c, aeVar));
        } catch (RemoteException e10) {
            this.f22681e.f22692b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f22680d));
            this.f22679c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
