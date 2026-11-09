package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqx extends zzadu implements zzafd {
    private static final zzqx zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzh = zzqxVar;
        zzadu.zzcs(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzh() {
        return (zzqw) zzh.zzcn();
    }

    public final String zza() {
        return this.zzg;
    }

    public final long zzb() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean zzc() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double zzd() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String zze() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final zzacr zzf() {
        return this.zze == 6 ? (zzacr) this.zzf : zzacr.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i10 == 3) {
            return new zzqx();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzqw(bArr);
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
        synchronized (zzqx.class) {
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

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void zzj(long j6) {
        this.zze = 2;
        this.zzf = Long.valueOf(j6);
    }

    public final /* synthetic */ void zzk(boolean z3) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z3);
    }

    public final /* synthetic */ void zzl(double d2) {
        this.zze = 4;
        this.zzf = Double.valueOf(d2);
    }

    public final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void zzn(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 6;
        this.zzf = zzacrVar;
    }

    public final int zzp() {
        int i7 = this.zze;
        if (i7 == 0) {
            return 6;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 != 5) {
            return i7 != 6 ? 0 : 5;
        }
        return 4;
    }
}
