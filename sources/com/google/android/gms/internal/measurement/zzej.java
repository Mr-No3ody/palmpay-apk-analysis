package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzej extends zzeo {
    final /* synthetic */ zzep zza;
    final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzez zzezVar, zzep zzepVar) {
        super(zzezVar, true);
        this.zza = zzepVar;
        Objects.requireNonNull(zzezVar);
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() throws RemoteException {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zzS())).setEventInterceptor(this.zza);
    }
}
