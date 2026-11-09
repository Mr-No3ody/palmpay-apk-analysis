package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zznf extends zzadu implements zzafd {
    private static final zznf zzf;
    private static volatile zzafj zzg;
    private int zzb;
    private boolean zze;

    static {
        zznf zznfVar = new zznf();
        zzf = zznfVar;
        zzadu.zzcs(zznf.class, zznfVar);
    }

    private zznf() {
    }

    public static zznf zzb() {
        return zzf;
    }

    public final boolean zza() {
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
            return zzadu.zzct(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i10 == 3) {
            return new zznf();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzne(bArr);
        }
        if (i10 == 5) {
            return zzf;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzg;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznf.class) {
            try {
                zzadqVar = zzg;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzf);
                    zzg = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
