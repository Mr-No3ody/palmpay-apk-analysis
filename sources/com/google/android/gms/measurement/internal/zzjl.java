package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import p381za.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjl {
    public static final zzjl zza = new zzjl(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjl(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzb = enumMap;
        enumMap.put(zzjk.AD_STORAGE, zzh(null));
        enumMap.put(zzjk.ANALYTICS_STORAGE, zzh(null));
        this.zzc = i7;
    }

    public static zzjl zza(zzji zzjiVar, zzji zzjiVar2, int i7) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        enumMap.put(zzjk.AD_STORAGE, zzjiVar);
        enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVar2);
        return new zzjl(enumMap, -10);
    }

    public static String zzd(int i7) {
        if (i7 == -30) {
            return "TCF";
        }
        if (i7 == -20) {
            return "API";
        }
        if (i7 == -10) {
            return "MANIFEST";
        }
        if (i7 == 0) {
            return "1P_API";
        }
        if (i7 == 30) {
            return "1P_INIT";
        }
        if (i7 != 90) {
            return i7 != 100 ? "OTHER" : c.UNKNOWN_PROCESS_NAME;
        }
        return "REMOTE_CONFIG";
    }

    public static zzjl zze(Bundle bundle, int i7) {
        if (bundle == null) {
            return new zzjl(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            enumMap.put(zzjkVar, zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzjl(enumMap, i7);
    }

    public static zzjl zzf(String str, int i7) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.STORAGE.zza();
        for (int i10 = 0; i10 < zzjkVarArrZza.length; i10++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArrZza[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put(zzjkVar, zzj(str2.charAt(i11)));
            } else {
                enumMap.put(zzjkVar, zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i7);
    }

    public static zzji zzg(String str) {
        if (str == null) {
            return zzji.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzji.GRANTED;
        }
        return str.equals("denied") ? zzji.DENIED : zzji.UNINITIALIZED;
    }

    public static zzji zzh(Boolean bool) {
        if (bool == null) {
            return zzji.UNINITIALIZED;
        }
        return bool.booleanValue() ? zzji.GRANTED : zzji.DENIED;
    }

    public static String zzi(zzji zzjiVar) {
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static zzji zzj(char c6) {
        if (c6 == '+') {
            return zzji.POLICY;
        }
        if (c6 != '0') {
            return c6 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED;
        }
        return zzji.DENIED;
    }

    public static char zzm(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean zzu(int i7, int i10) {
        int i11 = -30;
        if (i7 == -20) {
            if (i10 == -30) {
                return true;
            }
            i7 = -20;
        }
        if (i7 != -30) {
            i11 = i7;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i7 < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjlVar = (zzjl) obj;
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            if (this.zzb.get(zzjkVar) != zzjlVar.zzb.get(zzjkVar)) {
                return false;
            }
        }
        return this.zzc == zzjlVar.zzc;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int iHashCode = this.zzc * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzji) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzd(this.zzc));
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(zzjkVar.zze);
            sb2.append("=");
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb2.append(zzjiVar);
        }
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String zzk() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zza()) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            char c6 = '-';
            if (zzjiVar != null && (iOrdinal = zzjiVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c6 = '1';
                } else if (iOrdinal == 2) {
                    c6 = '0';
                } else if (iOrdinal == 3) {
                    c6 = '1';
                }
            }
            sb2.append(c6);
        }
        return sb2.toString();
    }

    public final String zzl() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zza()) {
            sb2.append(zzm((zzji) this.zzb.get(zzjkVar)));
        }
        return sb2.toString();
    }

    public final Bundle zzn() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String strZzi = zzi((zzji) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjk) entry.getKey()).zze, strZzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(zzjk zzjkVar) {
        return ((zzji) this.zzb.get(zzjkVar)) != zzji.DENIED;
    }

    public final zzji zzp() {
        zzji zzjiVar = (zzji) this.zzb.get(zzjk.AD_STORAGE);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final zzji zzq() {
        zzji zzjiVar = (zzji) this.zzb.get(zzjk.ANALYTICS_STORAGE);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final boolean zzr(zzjl zzjlVar) {
        EnumMap enumMap = this.zzb;
        for (zzjk zzjkVar : (zzjk[]) enumMap.keySet().toArray(new zzjk[0])) {
            zzji zzjiVar = (zzji) enumMap.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.zzb.get(zzjkVar);
            zzji zzjiVar3 = zzji.DENIED;
            if (zzjiVar == zzjiVar3 && zzjiVar2 != zzjiVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final zzjl zzs(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.zzb.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzjiVar2;
            } else if (zzjiVar2 != null) {
                zzji zzjiVar3 = zzji.UNINITIALIZED;
                if (zzjiVar == zzjiVar3) {
                    zzjiVar = zzjiVar2;
                } else if (zzjiVar2 != zzjiVar3) {
                    zzji zzjiVar4 = zzji.POLICY;
                    if (zzjiVar == zzjiVar4) {
                        zzjiVar = zzjiVar2;
                    } else if (zzjiVar2 != zzjiVar4) {
                        zzji zzjiVar5 = zzji.DENIED;
                        zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                    }
                }
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, 100);
    }

    public final zzjl zzt(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.zzb.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, this.zzc);
    }

    private zzjl(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i7;
    }
}
