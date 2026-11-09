package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhg extends zzadu implements zzafd {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.zzcs(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf zzi() {
        return (zzhf) zzi.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzii zzc() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.zzk() : zziiVar;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final zzii zze() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.zzk() : zziiVar;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzhg();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzhf(bArr);
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
        synchronized (zzhg.class) {
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

    public final boolean zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(int i7) {
        this.zzb |= 1;
        this.zze = i7;
    }

    public final /* synthetic */ void zzk(zzii zziiVar) {
        zziiVar.getClass();
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void zzl(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void zzm(boolean z3) {
        this.zzb |= 8;
        this.zzh = z3;
    }
}
