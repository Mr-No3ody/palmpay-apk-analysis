package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpl extends zzadu implements zzafd {
    private static final zzpl zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzadu.zzcy();

    static {
        zzpl zzplVar = new zzpl();
        zze = zzplVar;
        zzadu.zzcs(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    public static zzpl zzb(byte[] bArr, zzadf zzadfVar) throws zzaeh {
        return (zzpl) zzadu.zzcA(zze, bArr, zzadfVar);
    }

    public final List zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i7, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i10 == 3) {
            return new zzpl();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzpk(bArr);
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
        synchronized (zzpl.class) {
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
