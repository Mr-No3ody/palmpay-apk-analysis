package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwd extends zzvn implements zzvs {
    static final zzvq zza = new zzvr();
    public static final /* synthetic */ int zzb = 0;
    private final Exception zzc;

    private zzwd(UUID uuid, String str, Exception exc, boolean z3, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.zzc = exc;
    }

    public static zzwd zzi(zzwq zzwqVar) {
        final UUID uuidZzc = zzvz.zza().zzc();
        String strZzcL = zzvn.zzcL(uuidZzc);
        ImmutableSet immutableSetZza = zzvy.zza();
        if (!immutableSetZza.isEmpty()) {
            final Exception exc = null;
            immutableSetZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.gms.internal.measurement.zzwc
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    int i7 = zzwd.zzb;
                    ((zzwu) obj).zza();
                }
            });
        }
        return new zzwd(uuidZzc, strZzcL, zza, false, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws zzg(String str, zzwl zzwlVar, boolean z3, zzwq zzwqVar) {
        if (z3) {
            int i7 = zzvy.zzb;
        }
        return new zzwf(str, this, zzwlVar, z3, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwk.zza;
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
        throw null;
    }
}
