package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzye implements Runnable {
    final /* synthetic */ zzyd zza;
    final /* synthetic */ zzyf zzb;

    public zzye(zzyf zzyfVar, zzyd zzydVar) {
        this.zza = zzydVar;
        Objects.requireNonNull(zzyfVar);
        this.zzb = zzyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().remove(this.zza);
    }
}
