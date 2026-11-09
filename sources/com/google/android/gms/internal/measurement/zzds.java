package com.google.android.gms.internal.measurement;

import androidx.annotation.BinderThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzds extends zzcu {
    final /* synthetic */ Runnable zza;

    public zzds(zzdt zzdtVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdtVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    @BinderThread
    public final void zze() {
        this.zza.run();
    }
}
