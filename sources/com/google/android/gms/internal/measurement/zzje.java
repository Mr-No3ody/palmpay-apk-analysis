package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzje extends zzadu implements zzafd {
    private static final zzje zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private zzaef zzf = zzadu.zzcy();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        zzje zzjeVar = new zzje();
        zzk = zzjeVar;
        zzadu.zzcs(zzje.class, zzjeVar);
    }

    private zzje() {
    }

    public final List zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return (this.zzb & 4) != 0;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", zzjc.zza, "zzf", zzje.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new zzje();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzjb(bArr);
        }
        if (i10 == 5) {
            return zzk;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzje.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final boolean zzh() {
        return (this.zzb & 16) != 0;
    }

    public final double zzi() {
        return this.zzj;
    }

    public final int zzk() {
        int iZza = zzjd.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
