package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzno extends zzadu implements zzafd {
    private static final zzno zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzni zze;
    private zznk zzf;

    static {
        zzno zznoVar = new zzno();
        zzg = zznoVar;
        zzadu.zzcs(zzno.class, zznoVar);
    }

    private zzno() {
    }

    public static zzno zzc(byte[] bArr, zzadf zzadfVar) throws zzaeh {
        return (zzno) zzadu.zzcA(zzg, bArr, zzadfVar);
    }

    public static zznn zzd() {
        return (zznn) zzg.zzcn();
    }

    public final zzni zza() {
        zzni zzniVar = this.zze;
        return zzniVar == null ? zzni.zzp() : zzniVar;
    }

    public final zznk zzb() {
        zznk zznkVar = this.zzf;
        return zznkVar == null ? zznk.zza() : zznkVar;
    }

    public final /* synthetic */ void zze(zzni zzniVar) {
        zzniVar.getClass();
        this.zze = zzniVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzno();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zznn(bArr);
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
        synchronized (zzno.class) {
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
