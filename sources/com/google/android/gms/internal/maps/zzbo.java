package com.google.android.gms.internal.maps;

import C0.G;
import com.google.android.gms.maps.model.FeatureType;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbo extends zzbh implements Set {
    private transient zzbk zza;

    public static int zzf(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @SafeVarargs
    public static zzbo zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[7];
        objArr2[0] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_1;
        objArr2[1] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_2;
        objArr2[2] = FeatureType.COUNTRY;
        objArr2[3] = FeatureType.LOCALITY;
        objArr2[4] = FeatureType.POSTAL_CODE;
        objArr2[5] = FeatureType.SCHOOL_DISTRICT;
        System.arraycopy(objArr, 0, objArr2, 6, 1);
        return zzk(7, objArr2);
    }

    private static zzbo zzk(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzbw.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzby(obj);
        }
        int iZzf = zzf(i7);
        Object[] objArr2 = new Object[iZzf];
        int i10 = iZzf - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(G.m(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzbg.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzby(obj4);
        }
        if (zzf(i12) < iZzf / 2) {
            return zzk(i12, objArr);
        }
        if (i12 < 4) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzbw(objArr, i11, objArr2, i10, i12);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbo) && zzj() && ((zzbo) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.maps.zzbh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbz iterator();

    public final zzbk zzg() {
        zzbk zzbkVar = this.zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzbkVarZzh = zzh();
        this.zza = zzbkVarZzh;
        return zzbkVarZzh;
    }

    public zzbk zzh() {
        Object[] array = toArray();
        int i7 = zzbk.zzd;
        return zzbk.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
