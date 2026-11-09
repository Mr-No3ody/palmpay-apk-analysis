package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzqd implements zzpm {
    final /* synthetic */ zzqe zza;
    private final zzqm zzb;

    public zzqd(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.zza = zzqeVar;
        this.zzb = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zza(zzpl zzplVar) {
        Iterator it = this.zza.zzc().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).zza(zzplVar.zza()) && !z3) {
                this.zzb.zza();
                z3 = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void zzb(Throwable th) {
    }
}
