package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzja extends zzadu implements zzafd {
    private static final zzja zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private zziw zzf;

    static {
        zzja zzjaVar = new zzja();
        zzg = zzjaVar;
        zzadu.zzcs(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public final List zza() {
        return this.zze;
    }

    public final zziw zzb() {
        zziw zziwVar = this.zzf;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzje.class, "zzf"});
        }
        if (i10 == 3) {
            return new zzja();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zziz(bArr);
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
        synchronized (zzja.class) {
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
