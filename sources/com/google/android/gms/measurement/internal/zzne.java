package com.google.android.gms.measurement.internal;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzne implements Runnable {
    final /* synthetic */ ConnectionResult zza;
    final /* synthetic */ zznf zzb;

    public zzne(zznf zznfVar, ConnectionResult connectionResult) {
        this.zza = connectionResult;
        Objects.requireNonNull(zznfVar);
        this.zzb = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb.zza;
        zznlVar.zzaa(null);
        if (this.zza.getErrorCode() != 7777) {
            zznlVar.zzX();
            return;
        }
        if (zznlVar.zzab() == null) {
            zznlVar.zzac(ShadowExecutors.newOptimizedScheduledThreadPool(1, "\u200bcom.google.android.gms.measurement.internal.zzne"));
        }
        zznlVar.zzab().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final zznl zznlVar2 = this.zza.zzb.zza;
                zznlVar2.zzu.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zznlVar2.zzI();
                    }
                });
            }
        }, ((Long) zzfy.zzZ.zzb(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
