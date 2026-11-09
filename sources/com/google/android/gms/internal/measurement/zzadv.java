package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzadv extends zzace implements RandomAccess, zzaeb, zzafk {
    private static final int[] zza;
    private static final zzadv zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzadv(iArr, 0, false);
    }

    public zzadv() {
        this(zza, 0, true);
    }

    public static zzadv zzd() {
        return zzb;
    }

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i7));
        }
    }

    private final String zzl(int i7) {
        return zzacg.zza(this.zzd, i7, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        zzcM();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i7));
        }
        int i11 = i7 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i7, iArr, i11, i10 - i7);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i7);
            System.arraycopy(this.zzc, i7, iArr2, i11, this.zzd - i7);
            this.zzc = iArr2;
        }
        this.zzc[i7] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcM();
        collection.getClass();
        if (!(collection instanceof zzadv)) {
            return super.addAll(collection);
        }
        zzadv zzadvVar = (zzadv) collection;
        int i7 = zzadvVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.zzc;
        if (i11 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zzadvVar.zzc, 0, this.zzc, this.zzd, zzadvVar.zzd);
        this.zzd = i11;
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
        if (!(obj instanceof zzadv)) {
            return super.equals(obj);
        }
        zzadv zzadvVar = (zzadv) obj;
        if (this.zzd != zzadvVar.zzd) {
            return false;
        }
        int[] iArr = zzadvVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzk(i7);
        return Integer.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            i7 = (i7 * 31) + this.zzc[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.zzd;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzc[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcM();
        zzk(i7);
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        int i11 = this.zzd;
        if (i7 < i11 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i11 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zzcM();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i10, iArr, i7, this.zzd - i10);
        this.zzd -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzcM();
        zzk(i7);
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zze */
    public final zzaeb zzg(int i7) {
        if (i7 >= this.zzd) {
            return new zzadv(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzaeb
    public final int zzf(int i7) {
        zzk(i7);
        return this.zzc[i7];
    }

    public final void zzh(int i7) {
        zzcM();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        iArr2[i11] = i7;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzadv(int[] iArr, int i7, boolean z3) {
        super(z3);
        this.zzc = iArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
