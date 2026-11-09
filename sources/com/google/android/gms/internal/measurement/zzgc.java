package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc extends zzadu implements zzafd {
    private static final zzgc zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        zzgc zzgcVar = new zzgc();
        zzg = zzgcVar;
        zzadu.zzcs(zzgc.class, zzgcVar);
    }

    private zzgc() {
    }

    public final String zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzgc();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzgb(bArr);
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
        synchronized (zzgc.class) {
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
