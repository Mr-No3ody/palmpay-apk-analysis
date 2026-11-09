package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzjy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzlj zzb;

    public zzjy(zzlj zzljVar, boolean z3) {
        this.zza = z3;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = zzljVar.zzu;
        boolean zZzB = zzicVar.zzB();
        boolean zZzA = zzicVar.zzA();
        boolean z3 = this.zza;
        zzicVar.zzz(z3);
        if (zZzA == z3) {
            zzicVar.zzaW().zzk().zzb("Default data collection state already set to", Boolean.valueOf(z3));
        }
        if (zzicVar.zzB() == zZzB || zzicVar.zzB() != zzicVar.zzA()) {
            zzicVar.zzaW().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zZzB));
        }
        zzljVar.zzak();
    }
}
