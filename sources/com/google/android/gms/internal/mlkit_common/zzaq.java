package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzap zzc;

    public final zzaq zza(Object obj, Object obj2) {
        int i7 = this.zzb + 1;
        int i10 = i7 + i7;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzaj.zzb(length, i10));
        }
        zzaf.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.zzb = i11 + 1;
        return this;
    }

    public final zzar zzb() {
        zzap zzapVar = this.zzc;
        if (zzapVar != null) {
            throw zzapVar.zza();
        }
        zzaz zzazVarZzg = zzaz.zzg(this.zzb, this.zza, this);
        zzap zzapVar2 = this.zzc;
        if (zzapVar2 == null) {
            return zzazVarZzg;
        }
        throw zzapVar2.zza();
    }
}
