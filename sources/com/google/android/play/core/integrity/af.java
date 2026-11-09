package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f22614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f22615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f22617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f22618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l5, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f22618e = ajVar;
        this.f22614a = bArr;
        this.f22615b = l5;
        this.f22616c = taskCompletionSource2;
        this.f22617d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.f22618e.f22628a.e()).d(aj.a(this.f22618e, this.f22614a, this.f22615b, null), new ai(this.f22618e, this.f22616c));
        } catch (RemoteException e10) {
            this.f22618e.f22629b.c(e10, "requestIntegrityToken(%s)", this.f22617d);
            this.f22616c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
