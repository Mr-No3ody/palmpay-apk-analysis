package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzen extends zzeo {
    final /* synthetic */ Long zza;
    final /* synthetic */ Long zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ Bundle zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ zzez zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzez zzezVar, Long l5, Long l6, String str, String str2, Bundle bundle, boolean z3, boolean z8) {
        super(zzezVar, true);
        this.zza = l5;
        this.zzb = l6;
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = z3;
        this.zzg = z8;
        Objects.requireNonNull(zzezVar);
        this.zzh = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() throws RemoteException {
        Long l5 = this.zza;
        ((zzcp) Preconditions.checkNotNull(this.zzh.zzS())).logEventWithElapsedTime(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, l5 == null ? this.zzi : l5.longValue(), this.zzb == null ? this.zzj : 0L);
    }
}
