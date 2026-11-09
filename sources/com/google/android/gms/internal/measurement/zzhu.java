package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhu extends zzadu implements zzafd {
    private static final zzhu zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        zzhu zzhuVar = new zzhu();
        zzg = zzhuVar;
        zzadu.zzcs(zzhu.class, zzhuVar);
    }

    private zzhu() {
    }

    public static zzht zza() {
        return (zzht) zzg.zzcn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzc(long j6) {
        this.zzb |= 2;
        this.zzf = j6;
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
            return new zzhu();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzht(bArr);
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
        synchronized (zzhu.class) {
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
