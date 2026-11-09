package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeo {
    public static final List zza(Object obj, long j6) {
        zzaef zzaefVar = (zzaef) zzagg.zzm(obj, j6);
        if (zzaefVar.zza()) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef zzaefVarZzg = zzaefVar.zzg(size == 0 ? 10 : size + size);
        zzagg.zzn(obj, j6, zzaefVarZzg);
        return zzaefVarZzg;
    }
}
