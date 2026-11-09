package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzafm<E> extends zzace<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzafm zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzafm(objArr, 0, false);
    }

    public zzafm() {
        this(zza, 0, true);
    }

    public static zzafm zzd() {
        return zzb;
    }

    private static int zzf(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzh(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
    }

    private final String zzi(int i7) {
        return zzacg.zza(this.zzd, i7, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        zzcM();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
        int i11 = i7 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i7, objArr, i11, i10 - i7);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i7);
            System.arraycopy(this.zzc, i7, objArr2, i11, this.zzd - i7);
            this.zzc = objArr2;
        }
        this.zzc[i7] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i7 = this.zzd;
        if (i7 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzafm)) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (!this.zzc[i10].equals(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        zzafm zzafmVar = (zzafm) obj;
        for (int i11 = 0; i11 < i7; i11++) {
            if (!this.zzc[i11].equals(zzafmVar.zzc[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        zzh(i7);
        return (E) this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = this.zzd;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            iHashCode = (iHashCode * 31) + this.zzc[i10].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zzcM();
        zzh(i7);
        Object[] objArr = this.zzc;
        Object obj = objArr[i7];
        int i10 = this.zzd;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zzcM();
        zzh(i7);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    public final /* bridge */ /* synthetic */ zzaef zzg(int i7) {
        if (i7 >= this.zzd) {
            return new zzafm(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzafm(Object[] objArr, int i7, boolean z3) {
        super(z3);
        this.zzc = objArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzcM();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
