package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho extends zzadu implements zzafd {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzadu.zzcy();

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.zzcs(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzhh zzb() {
        return (zzhh) zze.zzcn();
    }

    public static zzho zzc() {
        return zze;
    }

    public final List zza() {
        return this.zzb;
    }

    public final /* synthetic */ void zzd(Iterable iterable) {
        zzaef zzaefVar = this.zzb;
        if (!zzaefVar.zza()) {
            this.zzb = zzadu.zzcz(zzaefVar);
        }
        zzacb.zzcg(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i10 == 3) {
            return new zzho();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzhh(bArr);
        }
        if (i10 == 5) {
            return zze;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzf;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzho.class) {
            try {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
