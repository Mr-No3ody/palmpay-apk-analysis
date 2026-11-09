package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmi extends zzadu implements zzafd {
    private static final zzmi zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzmi zzmiVar = new zzmi();
        zzh = zzmiVar;
        zzadu.zzcs(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    public static zzmh zzh() {
        return (zzmh) zzh.zzcn();
    }

    public static zzmi zzi() {
        return zzh;
    }

    public final String zza() {
        return this.zzg;
    }

    public final long zzb() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean zzc() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double zzd() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String zze() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final zzacr zzf() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i10 == 3) {
            return new zzmi();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzmh(bArr);
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
        synchronized (zzmi.class) {
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

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void zzk(long j6) {
        this.zze = 1;
        this.zzf = Long.valueOf(j6);
    }

    public final /* synthetic */ void zzl(boolean z3) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z3);
    }

    public final /* synthetic */ void zzm(double d2) {
        this.zze = 3;
        this.zzf = Double.valueOf(d2);
    }

    public final /* synthetic */ void zzn(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void zzo(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 5;
        this.zzf = zzacrVar;
    }

    public final int zzq() {
        int i7 = this.zze;
        if (i7 == 0) {
            return 6;
        }
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    i10 = 4;
                    if (i7 != 4) {
                        i10 = 5;
                        if (i7 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i10;
    }
}
