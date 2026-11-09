package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzxy extends zzzj {
    private Object[] zza = new Object[8];
    private int zzb = 0;

    private final int zzh(zzyl zzylVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (this.zza[i7 + i7].equals(zzylVar)) {
                return i7;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i7 = 0; i7 < this.zzb; i7++) {
            sb2.append(" '");
            sb2.append(zzb(i7));
            sb2.append("': ");
            sb2.append(zzc(i7));
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final zzyl zzb(int i7) {
        if (i7 < this.zzb) {
            return (zzyl) this.zza[i7 + i7];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object zzc(int i7) {
        if (i7 < this.zzb) {
            return this.zza[i7 + i7 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object zzd(zzyl zzylVar) {
        int iZzh = zzh(zzylVar);
        if (iZzh != -1) {
            return zzylVar.zze(this.zza[iZzh + iZzh + 1]);
        }
        return null;
    }

    public final void zze(zzyl zzylVar, Object obj) {
        int iZzh;
        if (!zzylVar.zzf() && (iZzh = zzh(zzylVar)) != -1) {
            zzabr.zza(obj, "metadata value");
            this.zza[iZzh + iZzh + 1] = obj;
            return;
        }
        int i7 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i7 + i7 > length) {
            this.zza = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        zzabr.zza(zzylVar, "metadata key");
        objArr2[i10 + i10] = zzylVar;
        Object[] objArr3 = this.zza;
        int i11 = this.zzb;
        zzabr.zza(obj, "metadata value");
        objArr3[i11 + i11 + 1] = obj;
        this.zzb++;
    }

    public final void zzf(zzyl zzylVar) {
        int i7;
        int iZzh = zzh(zzylVar);
        if (iZzh >= 0) {
            int i10 = iZzh + iZzh;
            int i11 = i10 + 2;
            while (true) {
                i7 = this.zzb;
                if (i11 >= i7 + i7) {
                    break;
                }
                Object obj = this.zza[i11];
                if (!obj.equals(zzylVar)) {
                    Object[] objArr = this.zza;
                    objArr[i10] = obj;
                    objArr[i10 + 1] = objArr[i11 + 1];
                    i10 += 2;
                }
                i11 += 2;
            }
            this.zzb = i7 - ((i11 - i10) >> 1);
            while (i10 < i11) {
                this.zza[i10] = null;
                i10++;
            }
        }
    }
}
