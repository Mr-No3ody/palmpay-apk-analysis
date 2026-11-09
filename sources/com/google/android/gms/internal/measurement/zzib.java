package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.zzcs(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzhz zzi() {
        return (zzhz) zzi.zzcn();
    }

    public static zzhz zzj(zzib zzibVar) {
        zzadp zzadpVarZzcn = zzi.zzcn();
        zzadpVarZzcn.zzbe(zzibVar);
        return (zzhz) zzadpVarZzcn;
    }

    private final void zzr() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = zzadu.zzcz(zzaefVar);
    }

    public final List zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzid zzc(int i7) {
        return (zzid) this.zze.get(i7);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", zzia.zza});
        }
        if (i10 == 3) {
            return new zzib();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzhz(bArr);
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
        synchronized (zzib.class) {
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

    public final String zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzk(int i7, zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zze.set(i7, zzidVar);
    }

    public final /* synthetic */ void zzl(zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zze.add(zzidVar);
    }

    public final /* synthetic */ void zzm(Iterable iterable) {
        zzr();
        zzacb.zzcg(iterable, this.zze);
    }

    public final /* synthetic */ void zzn() {
        this.zze = zzadu.zzcy();
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }
}
