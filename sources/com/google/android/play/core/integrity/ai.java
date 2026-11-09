package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22626b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f22627c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f22625a = ajVar;
        this.f22627c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f22625a.f22628a.v(this.f22627c);
        this.f22626b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f22625a.f22632e.a(bundle);
        if (apiExceptionA != null) {
            this.f22627c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f22627c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f22625a.f22630c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f22627c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
