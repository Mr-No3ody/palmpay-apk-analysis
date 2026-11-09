package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmq extends zzadu implements zzafd {
    private static final zzmq zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.zza();
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";

    static {
        zzmq zzmqVar = new zzmq();
        zzj = zzmqVar;
        zzadu.zzcs(zzmq.class, zzmqVar);
    }

    private zzmq() {
    }

    public static zzmq zzh(zzacv zzacvVar, zzadf zzadfVar) throws IOException {
        return (zzmq) zzadu.zzcC(zzj, zzacvVar, zzadfVar);
    }

    public static zzmq zzi() {
        return zzj;
    }

    public final String zza() {
        return this.zze;
    }

    public final zzacr zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzi.size();
    }

    public final Map zzf() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzmp.zza});
        }
        if (i10 == 3) {
            return new zzmq();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzmo(bArr);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmq.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
