package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfb extends zzadu implements zzafd {
    private static final zzfb zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        zzfb zzfbVar = new zzfb();
        zzi = zzfbVar;
        zzadu.zzcs(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    public static zzfa zza() {
        return (zzfa) zzi.zzcn();
    }

    public final /* synthetic */ void zzb(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzc(boolean z3) {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void zze(long j6) {
        this.zzb |= 8;
        this.zzh = j6;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzfb();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzfa(bArr);
        }
        if (i10 == 5) {
            return zzi;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfb.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
