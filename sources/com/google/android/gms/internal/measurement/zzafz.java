package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzafz {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i7, long j6);

    public abstract void zzb(Object obj, int i7, int i10);

    public abstract void zzc(Object obj, int i7, long j6);

    public abstract void zzd(Object obj, int i7, zzacr zzacrVar);

    public abstract void zze(Object obj, int i7, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzafo zzafoVar, int i7) throws IOException {
        int iZzc = zzafoVar.zzc();
        int i10 = iZzc >>> 3;
        int i11 = iZzc & 7;
        if (i11 == 0) {
            zza(obj, i10, zzafoVar.zzh());
            return true;
        }
        if (i11 == 1) {
            zzc(obj, i10, zzafoVar.zzj());
            return true;
        }
        if (i11 == 2) {
            zzd(obj, i10, zzafoVar.zzq());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw new zzaeh("Protocol message end-group tag did not match expected tag.");
            }
            if (i11 != 5) {
                throw new zzaeg("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i10, zzafoVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i12 = i10 << 3;
        int i13 = i7 + 1;
        if (i13 >= zza) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzafoVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzafoVar, i13)) {
        }
        if ((i12 | 4) != zzafoVar.zzc()) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i10, zzg(objZzf));
        return true;
    }
}
