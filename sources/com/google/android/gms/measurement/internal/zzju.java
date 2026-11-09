package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzju extends zzaz {
    final /* synthetic */ zzlj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzju(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    @WorkerThread
    public final void zza() {
        final zzlj zzljVarZzj = this.zza.zzu.zzj();
        Objects.requireNonNull(zzljVarZzj);
        ShadowThread.setThreadName(new ShadowThread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzljVarZzj.zzw();
            }
        }, "\u200bcom.google.android.gms.measurement.internal.zzju"), "\u200bcom.google.android.gms.measurement.internal.zzju").start();
    }
}
