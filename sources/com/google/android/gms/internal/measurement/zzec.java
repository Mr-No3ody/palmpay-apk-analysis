package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzec extends zzeo {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzcm zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzez zzezVar, Bundle bundle, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = bundle;
        this.zzb = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.zzc = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() throws RemoteException {
        ((zzcp) Preconditions.checkNotNull(this.zzc.zzS())).performAction(this.zza, this.zzb, this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zzb() {
        this.zzb.zzb(null);
    }
}
