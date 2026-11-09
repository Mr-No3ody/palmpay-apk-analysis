package com.google.android.gms.internal.measurement;

import kotlin.Unit;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwz implements Runnable {
    final /* synthetic */ F zza;
    final /* synthetic */ zzws zzb;
    final /* synthetic */ Runnable zzc;

    public zzwz(F f10, zzws zzwsVar, Runnable runnable) {
        this.zza = f10;
        this.zzb = zzwsVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.zza.f38951a) != null) {
            throw null;
        }
        zzws zzwsVar = this.zzb;
        Intrinsics.f(zzwsVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.zzc;
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            runnable.run();
            Unit unit = Unit.f38893a;
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
        } catch (Throwable th) {
            try {
                zzvu.zza(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
                throw th2;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.zzc;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
