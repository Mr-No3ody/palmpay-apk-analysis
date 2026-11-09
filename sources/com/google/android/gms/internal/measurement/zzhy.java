package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhy extends zzadu implements zzafd {
    private static final zzhy zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private zzhc zzg;

    static {
        zzhy zzhyVar = new zzhy();
        zzh = zzhyVar;
        zzadu.zzcs(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzhy();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzhx(bArr);
        }
        if (i10 == 5) {
            return zzh;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhy.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
