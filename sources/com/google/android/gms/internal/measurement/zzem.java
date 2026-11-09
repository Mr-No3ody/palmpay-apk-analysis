package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzem extends zzeo {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzez zzezVar, zzeq zzeqVar) {
        super(zzezVar, true);
        this.zza = zzeqVar;
        Objects.requireNonNull(zzezVar);
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() throws RemoteException {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zzS())).unregisterOnMeasurementEventListener(this.zza);
    }
}
