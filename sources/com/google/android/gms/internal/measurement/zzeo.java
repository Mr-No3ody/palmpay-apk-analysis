package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzeo implements Runnable {
    final long zzi;
    final long zzj;
    final boolean zzk;
    final /* synthetic */ zzez zzl;

    public zzeo(zzez zzezVar, boolean z3) {
        Objects.requireNonNull(zzezVar);
        this.zzl = zzezVar;
        this.zzi = zzezVar.zza.currentTimeMillis();
        this.zzj = zzezVar.zza.elapsedRealtime();
        this.zzk = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzl.zzR()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzl.zzN(e10, false, this.zzk);
            zzb();
        }
    }

    public abstract void zza() throws RemoteException;

    public void zzb() {
    }
}
