package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabl extends zzabp {
    private static final zzabp zza = new zzabl();

    private zzabl() {
    }

    public static zzabp zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int zzb(zzabm zzabmVar, int i7, String str, int i10, int i11, int i12) throws zzabo {
        zzabh zzabhVarZza;
        char cCharAt = str.charAt(i12);
        zzza zzzaVarZzb = zzza.zzb(str, i11, i12, (cCharAt & ' ') == 0);
        zzyz zzyzVarZza = zzyz.zza(cCharAt);
        int i13 = i12 + 1;
        if (zzyzVarZza != null) {
            if (!zzzaVarZzb.zzi(zzyzVarZza)) {
                throw zzabo.zza("invalid format specifier", str, i10, i13);
            }
            zzabhVarZza = zzabj.zza(i7, zzyzVarZza, zzzaVarZzb);
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!zzzaVarZzb.zzh(160, false)) {
                throw zzabo.zza("invalid format specification", str, i10, i13);
            }
            int i14 = i12 + 2;
            if (i14 > str.length()) {
                throw zzabo.zzb("truncated format specifier", str, i10);
            }
            zzabf zzabfVarZza = zzabf.zza(str.charAt(i13));
            if (zzabfVarZza == null) {
                throw zzabo.zzb("illegal date/time conversion", str, i13);
            }
            zzabhVarZza = zzabg.zza(zzabfVarZza, zzzaVarZzb, i7);
            i13 = i14;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.zza("invalid format specification", str, i10, i13);
            }
            if (!zzzaVarZzb.zzh(160, false)) {
                throw zzabo.zza("invalid format specification", str, i10, i13);
            }
            zzabhVarZza = new zzabk(zzzaVarZzb, i7, zzzaVarZzb);
        }
        zzabmVar.zzk(i10, i13, zzabhVarZza);
        return i13;
    }
}
