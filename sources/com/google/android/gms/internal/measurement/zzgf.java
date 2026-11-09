package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgf extends zzadu implements zzafd {
    private static final zzgf zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private boolean zzh;
    private zzaef zze = zzadu.zzcy();
    private zzaef zzf = zzadu.zzcy();
    private zzaef zzg = zzadu.zzcy();
    private zzaef zzi = zzadu.zzcy();

    static {
        zzgf zzgfVar = new zzgf();
        zzj = zzgfVar;
        zzadu.zzcs(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzgf zzh() {
        return zzj;
    }

    public final List zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final List zzf() {
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
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", zzfu.class, "zzf", zzfw.class, "zzg", zzgc.class, "zzh", "zzi", zzfu.class});
        }
        if (i10 == 3) {
            return new zzgf();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzfs(bArr);
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
        synchronized (zzgf.class) {
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
