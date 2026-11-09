package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final TaskCompletionSource f22646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    final com.google.android.play.integrity.internal.ae f22647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22648c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f22650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f22651f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f22649d = context.getPackageName();
        this.f22650e = kVar;
        this.f22646a = taskCompletionSource;
        this.f22651f = activity;
        this.f22647b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f22647b.v(this.f22646a);
        this.f22648c.d("onRequestDialog(%s)", this.f22649d);
        ApiException apiExceptionA = this.f22650e.a(bundle);
        if (apiExceptionA != null) {
            this.f22646a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f22648c.b("onRequestDialog(%s): got null dialog intent", this.f22649d);
            this.f22646a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f22651f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f22647b.c()));
        this.f22648c.a("Starting dialog intent...", new Object[0]);
        this.f22651f.startActivityForResult(intent, 0);
    }
}
