package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjs {
    final Context zza;

    @Nullable
    Boolean zzb;
    long zzc;

    @Nullable
    com.google.android.gms.internal.measurement.zzdb zzd;
    boolean zze;

    @Nullable
    final Long zzf;

    @Nullable
    final Long zzg;

    @Nullable
    String zzh;

    public zzjs(Context context, @Nullable com.google.android.gms.internal.measurement.zzdb zzdbVar, @Nullable Long l5, @Nullable Long l6) {
        this.zze = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzf = l5;
        this.zzg = l6;
        if (zzdbVar != null) {
            this.zzd = zzdbVar;
            this.zze = zzdbVar.zzc;
            this.zzc = zzdbVar.zzb;
            this.zzh = zzdbVar.zze;
            Bundle bundle = zzdbVar.zzd;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
