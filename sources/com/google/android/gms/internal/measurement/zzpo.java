package com.google.android.gms.internal.measurement;

import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpo {
    private final AtomicReferenceArray zza;
    private final zzog zzb;

    public zzpo(zzog zzogVar, int i7) {
        this.zzb = zzogVar;
        this.zza = new AtomicReferenceArray(i7);
    }

    @SideEffectFree
    public final zzom zza(int i7, String str, boolean z3) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i7);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZza = this.zzb.zza(str, z3);
        while (!atomicReferenceArray.compareAndSet(i7, null, zzomVarZza)) {
            if (atomicReferenceArray.get(i7) != null) {
                return (zzom) Preconditions.checkNotNull((zzom) atomicReferenceArray.get(i7));
            }
        }
        return zzomVarZza;
    }

    @SideEffectFree
    public final zzom zzb(int i7, String str, long j6) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i7);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZzb = this.zzb.zzb(str, j6);
        while (!atomicReferenceArray.compareAndSet(i7, null, zzomVarZzb)) {
            if (atomicReferenceArray.get(i7) != null) {
                return (zzom) Preconditions.checkNotNull((zzom) atomicReferenceArray.get(i7));
            }
        }
        return zzomVarZzb;
    }

    @SideEffectFree
    public final zzom zzc(int i7, String str, double d2) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(2);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZzc = this.zzb.zzc("measurement.test.double_flag", -3.0d);
        while (!atomicReferenceArray.compareAndSet(2, null, zzomVarZzc)) {
            if (atomicReferenceArray.get(2) != null) {
                return (zzom) Preconditions.checkNotNull((zzom) atomicReferenceArray.get(2));
            }
        }
        return zzomVarZzc;
    }

    @SideEffectFree
    public final zzom zzd(int i7, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i7);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZzd = this.zzb.zzd(str, str2);
        while (!atomicReferenceArray.compareAndSet(i7, null, zzomVarZzd)) {
            if (atomicReferenceArray.get(i7) != null) {
                return (zzom) Preconditions.checkNotNull((zzom) atomicReferenceArray.get(i7));
            }
        }
        return zzomVarZzd;
    }
}
