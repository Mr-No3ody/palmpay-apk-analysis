package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zznm extends zzadu implements zzafd {
    private static final zznm zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        zznm zznmVar = new zznm();
        zzg = zznmVar;
        zzadu.zzcs(zznm.class, zznmVar);
    }

    private zznm() {
    }

    public static zznm zzc() {
        return zzg;
    }

    public final String zza() {
        return this.zze;
    }

    public final long zzb() {
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
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zznm();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zznl(bArr);
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
        synchronized (zznm.class) {
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
