package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i7, String str, List list, boolean z3, boolean z8) {
        zzgs zzgsVarZzj;
        int i10 = i7 - 1;
        if (i10 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaW().zzj();
        } else if (i10 != 1) {
            if (i10 == 3) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzk();
            } else if (i10 != 4) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzi();
            } else if (z3) {
                zzgsVarZzj = this.zza.zzu.zzaW().zzf();
            } else {
                zzgsVarZzj = !z8 ? this.zza.zzu.zzaW().zzh() : this.zza.zzu.zzaW().zze();
            }
        } else if (z3) {
            zzgsVarZzj = this.zza.zzu.zzaW().zzc();
        } else {
            zzgsVarZzj = !z8 ? this.zza.zzu.zzaW().zzd() : this.zza.zzu.zzaW().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
