package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zznr extends zzadu implements zzafd {
    private static final zznr zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private String zzf = "";

    static {
        zznr zznrVar = new zznr();
        zzg = zznrVar;
        zzadu.zzcs(zznr.class, zznrVar);
    }

    private zznr() {
    }

    public static zznr zzb() {
        return zzg;
    }

    public final List zza() {
        return this.zze;
    }

    public final /* synthetic */ void zzc(String str) {
        zzaef zzaefVar = this.zze;
        if (!zzaefVar.zza()) {
            this.zze = zzadu.zzcz(zzaefVar);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void zzd(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zznr();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zznq(bArr);
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
        synchronized (zznr.class) {
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
