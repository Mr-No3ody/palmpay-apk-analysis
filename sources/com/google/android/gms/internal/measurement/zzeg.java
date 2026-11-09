package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeg extends zzeo {
    final /* synthetic */ zzcm zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzez zzezVar, zzcm zzcmVar, int i7) {
        super(zzezVar, true);
        this.zza = zzcmVar;
        this.zzb = i7;
        Objects.requireNonNull(zzezVar);
        this.zzc = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() throws RemoteException {
        ((zzcp) Preconditions.checkNotNull(this.zzc.zzS())).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zzb() {
        this.zza.zzb(null);
    }
}
