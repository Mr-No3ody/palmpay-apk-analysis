package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzce {
    public static final int zza;
    private static volatile boolean zzb = false;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zza(Context context, int i7, Intent intent, int i10) {
        return PendingIntent.getBroadcast(context, 0, intent, i10);
    }
}
