package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zze extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zzg zzgVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.zza = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 == 1) {
            this.zza.trySetResult(-1);
        } else if (i7 != 2) {
            this.zza.trySetResult(1);
        } else {
            this.zza.trySetResult(0);
        }
    }
}
