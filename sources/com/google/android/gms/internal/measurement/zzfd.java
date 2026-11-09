package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfd extends zzadu implements zzafd {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf = zzadu.zzcy();
    private zzaef zzg = zzadu.zzcy();
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.zzcs(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfn zze(int i7) {
        return (zzfn) this.zzf.get(i7);
    }

    public final List zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzfd();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzfc(bArr);
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
        synchronized (zzfd.class) {
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

    public final int zzh() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzff zzi(int i7) {
        return (zzff) this.zzg.get(i7);
    }

    public final /* synthetic */ void zzj(int i7, zzfn zzfnVar) {
        zzfnVar.getClass();
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = zzadu.zzcz(zzaefVar);
        }
        this.zzf.set(i7, zzfnVar);
    }

    public final /* synthetic */ void zzk(int i7, zzff zzffVar) {
        zzffVar.getClass();
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = zzadu.zzcz(zzaefVar);
        }
        this.zzg.set(i7, zzffVar);
    }
}
