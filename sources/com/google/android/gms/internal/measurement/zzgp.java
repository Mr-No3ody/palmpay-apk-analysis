package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgp extends zzadu implements zzafd {
    private static final zzgp zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        zzgp zzgpVar = new zzgp();
        zzj = zzgpVar;
        zzadu.zzcs(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzgp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzgo(bArr);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgp.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
