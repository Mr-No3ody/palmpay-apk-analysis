package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zziy extends zzadu implements zzafd {
    private static final zziy zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private zzaef zzf = zzadu.zzcy();

    static {
        zziy zziyVar = new zziy();
        zzg = zziyVar;
        zzadu.zzcs(zziy.class, zziyVar);
    }

    private zziy() {
    }

    public final String zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzje.class});
        }
        if (i10 == 3) {
            return new zziy();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzix(bArr);
        }
        if (i10 == 5) {
            return zzg;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zziy.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
