package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class zzwa extends zzwb {
    public zzwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzwb
    public final zzwi zza(String str, zzxd zzxdVar) {
        zzws zzwsVar;
        boolean z3;
        zzwq zzwqVar;
        zzws zzwsVarZzg;
        zzwl zzwlVar = zzwk.zza;
        Preconditions.checkNotNull(zzxdVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVar2 = zzwqVarZzd.zzb;
        final Exception exc = null;
        if (zzwsVar2 == zzwg.zza) {
            zzvy.zzc(zzwqVarZzd, null);
            z3 = true;
            zzwsVar = null;
        } else {
            zzwsVar = zzwsVar2;
            z3 = false;
        }
        if (zzwsVar == null) {
            final UUID uuidZzc = zzvz.zza().zzc();
            String strZzcL = zzvn.zzcL(uuidZzc);
            zzvq zzvqVar = zzwd.zza;
            ImmutableSet immutableSetZza = zzvy.zza();
            if (!immutableSetZza.isEmpty()) {
                immutableSetZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.gms.internal.measurement.zzwe
                    @Override // java.util.function.Consumer
                    public final /* synthetic */ void accept(Object obj) {
                        ((zzwu) obj).zza();
                    }
                });
            }
            zzwqVar = zzwqVarZzd;
            zzwsVarZzg = new zzwf(uuidZzc, strZzcL, str, zzwlVar, zzvqVar, false, false, zzwqVar);
        } else {
            zzwqVar = zzwqVarZzd;
            zzwsVarZzg = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).zzg(str, zzwlVar, false, zzwqVar) : zzwsVar.zzj(str, "", "", 0, zzwlVar, zzwqVar);
        }
        zzvy.zzc(zzwqVar, zzwsVarZzg);
        return new zzwi(zzwsVarZzg, z3);
    }
}
