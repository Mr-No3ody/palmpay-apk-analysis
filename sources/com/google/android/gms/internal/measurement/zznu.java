package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zznu extends zzadu implements zzafd {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.zza();

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.zzcs(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznu zzb() {
        return zze;
    }

    public final zznr zza(String str, zznr zznrVar) {
        str.getClass();
        zznr zznrVar2 = (zznr) this.zzb.get(str);
        return zznrVar2 != null ? zznrVar2 : zznrVar;
    }

    public final /* synthetic */ Map zzc() {
        if (!this.zzb.zze()) {
            this.zzb = this.zzb.zzc();
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", zzns.zza});
        }
        if (i10 == 3) {
            return new zznu();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zznt(bArr);
        }
        if (i10 == 5) {
            return zze;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzf;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznu.class) {
            try {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
