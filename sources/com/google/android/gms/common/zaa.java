package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final class zaa implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ a zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zaa(GoogleApiAvailability googleApiAvailability, Activity activity, int i7, a aVar) {
        this.zaa = activity;
        this.zab = i7;
        this.zac = aVar;
        Objects.requireNonNull(googleApiAvailability);
        this.zad = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.zac.a(new IntentSenderRequest(intentSender, null, 0, 0));
    }
}
