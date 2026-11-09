package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabj extends zzabh {
    private static final Map zza;
    private final zzyz zzb;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i7 = 0; i7 < 10; i7++) {
                zzabjVarArr[i7] = new zzabj(i7, zzyzVar, zzza.zza());
            }
            enumMap.put(zzyzVar, zzabjVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    private zzabj(int i7, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i7);
        zzabr.zza(zzyzVar, "format char");
        this.zzb = zzyzVar;
        if (zzzaVar.zze()) {
            zzyzVar.zze();
            return;
        }
        int iZzb = zzyzVar.zzb();
        iZzb = zzzaVar.zzk() ? iZzb & 65503 : iZzb;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.zzl(sb2);
        sb2.append((char) iZzb);
    }

    public static zzabj zza(int i7, zzyz zzyzVar, zzza zzzaVar) {
        if (i7 >= 10 || !zzzaVar.zze()) {
            return new zzabj(i7, zzyzVar, zzzaVar);
        }
        zzabj[] zzabjVarArr = (zzabj[]) zza.get(zzyzVar);
        zzabr.zza(zzabjVarArr, "default parameter");
        return zzabjVarArr[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void zzb(zzabi zzabiVar, Object obj) {
        zzabiVar.zzc(obj, this.zzb, zzd());
    }
}
