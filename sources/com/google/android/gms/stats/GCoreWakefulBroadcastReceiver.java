package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import p344x0.a;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends a {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return a.completeWakefulIntent(intent);
    }
}
