package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f22688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f22688c = bnVar;
        this.f22689d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f22689d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f22688c.f22696f.a(bundle);
        if (apiExceptionA != null) {
            this.f22682a.trySetException(apiExceptionA);
        } else {
            this.f22682a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
