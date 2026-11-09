package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzan {
    private final EnumMap zza;

    public zzan() {
        this.zza = new EnumMap(zzjk.class);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i10 = 1;
                while (i7 < length) {
                    enumMap.put(zzjkVarArrValues[i7], zzam.zza(str.charAt(i10)));
                    i7++;
                    i10++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.zzb());
        }
        return sb2.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjk zzjkVar, int i7) {
        zzam zzamVar = zzam.UNSET;
        if (i7 == -30) {
            zzamVar = zzam.TCF;
        } else if (i7 == -20) {
            zzamVar = zzam.API;
        } else if (i7 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i7 == 0) {
            zzamVar = zzam.API;
        } else if (i7 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.zza.put(zzjkVar, zzamVar);
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.zza.put(zzjkVar, zzamVar);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
