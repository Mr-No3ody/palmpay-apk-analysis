package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
final class zzwf extends zzvt implements zzvs {
    private final Exception zza;
    private final boolean zzb;

    public zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z3, zzwq zzwqVar) {
        super("<missing root>:".concat(str), zzvsVar, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = zzvsVar.zzf();
        this.zzb = z3;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws zzg(String str, zzwl zzwlVar, boolean z3, zzwq zzwqVar) {
        if (z3 && !this.zzb) {
            int i7 = zzvy.zzb;
        }
        boolean z8 = true;
        if ((!z3 || this.zzb) && !this.zzb) {
            z8 = false;
        }
        return new zzwf(str, this, zzwlVar, z8, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, String str2, String str3, int i7, zzwl zzwlVar, zzwq zzwqVar) {
        int i10 = zzvy.zzb;
        return zzg(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final long zzk() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.zza;
    }

    public zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, Exception exc, boolean z3, boolean z8, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = exc;
        this.zzb = false;
    }
}
