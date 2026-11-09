package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzxn extends zzyq {
    private static final zzyf zza = new zzxl();
    private final AtomicLong zzb = new AtomicLong(-1);

    public static zzyq zza(zzzj zzzjVar, zzyd zzydVar, long j6) {
        if (((zzxm) zzzjVar.zzd(zzxx.zzd)) == null) {
            return null;
        }
        zzxn zzxnVar = (zzxn) zza.zzb(zzydVar, zzzjVar);
        zzabr.zzb(j6 >= 0, "timestamp cannot be negative");
        AtomicLong atomicLong = zzxnVar.zzb;
        long j10 = atomicLong.get();
        if (j10 >= 0) {
            throw null;
        }
        atomicLong.compareAndSet(j10, -j6);
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
