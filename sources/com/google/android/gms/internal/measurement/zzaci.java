package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaci extends zzace implements RandomAccess, zzadw, zzafk {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzaci(zArr, 0, false);
    }

    public zzaci() {
        this(zza, 0, true);
    }

    private static int zzh(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
    }

    private final String zzj(int i7) {
        return zzacg.zza(this.zzc, i7, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcM();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
        int i11 = i7 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i7, zArr, i11, i10 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i11, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcM();
        collection.getClass();
        if (!(collection instanceof zzaci)) {
            return super.addAll(collection);
        }
        zzaci zzaciVar = (zzaci) collection;
        int i7 = zzaciVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        boolean[] zArr = this.zzb;
        if (i11 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzaciVar.zzb, 0, this.zzb, this.zzc, zzaciVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaci)) {
            return super.equals(obj);
        }
        zzaci zzaciVar = (zzaci) obj;
        if (this.zzc != zzaciVar.zzc) {
            return false;
        }
        boolean[] zArr = zzaciVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Boolean.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iZza = (iZza * 31) + zzaed.zza(this.zzb[i7]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcM();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i7];
        int i10 = this.zzc;
        if (i7 < i10 - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i10 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zzcM();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcM();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzadw zzg(int i7) {
        if (i7 >= this.zzc) {
            return new zzaci(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zze(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    public final void zzf(boolean z3) {
        zzcM();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr2[i10] = z3;
    }

    private zzaci(boolean[] zArr, int i7, boolean z3) {
        super(z3);
        this.zzb = zArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Boolean) obj).booleanValue());
        return true;
    }
}
