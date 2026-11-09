package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f22620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f22622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f22623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f22623e = ajVar;
        this.f22619a = bundle;
        this.f22620b = activity;
        this.f22621c = taskCompletionSource2;
        this.f22622d = i7;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f22623e.f22628a.e();
            Bundle bundle = this.f22619a;
            aj ajVar = this.f22623e;
            nVar.c(bundle, ajVar.f22631d.a(this.f22620b, this.f22621c, ajVar.f22628a));
        } catch (RemoteException e10) {
            this.f22623e.f22629b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f22622d));
            this.f22621c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
