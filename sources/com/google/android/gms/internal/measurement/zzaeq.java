package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeq extends zzace implements RandomAccess, zzaee, zzafk {
    private static final long[] zza;
    private static final zzaeq zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzaeq(jArr, 0, false);
    }

    public zzaeq() {
        this(zza, 0, true);
    }

    public static zzaeq zze() {
        return zzb;
    }

    private static int zzi(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    private final String zzk(int i7) {
        return zzacg.zza(this.zzd, i7, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zzcM();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i11 = i7 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i7, jArr, i11, i10 - i7);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i7);
            System.arraycopy(this.zzc, i7, jArr2, i11, this.zzd - i7);
            this.zzc = jArr2;
        }
        this.zzc[i7] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcM();
        collection.getClass();
        if (!(collection instanceof zzaeq)) {
            return super.addAll(collection);
        }
        zzaeq zzaeqVar = (zzaeq) collection;
        int i7 = zzaeqVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.zzc;
        if (i11 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzaeqVar.zzc, 0, this.zzc, this.zzd, zzaeqVar.zzd);
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
        if (!(obj instanceof zzaeq)) {
            return super.equals(obj);
        }
        zzaeq zzaeqVar = (zzaeq) obj;
        if (this.zzd != zzaeqVar.zzd) {
            return false;
        }
        long[] jArr = zzaeqVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Long.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            long j6 = this.zzc[i10];
            byte[] bArr = zzaed.zza;
            i7 = (i7 * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i7 = this.zzd;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzc[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcM();
        zzj(i7);
        long[] jArr = this.zzc;
        long j6 = jArr[i7];
        int i10 = this.zzd;
        if (i7 < i10 - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i10 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zzcM();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i10, jArr, i7, this.zzd - i10);
        this.zzd -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zzcM();
        zzj(i7);
        long[] jArr = this.zzc;
        long j6 = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaee
    public final long zzc(int i7) {
        zzj(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzaee zzg(int i7) {
        if (i7 >= this.zzd) {
            return new zzaeq(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(long j6) {
        zzcM();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        jArr2[i10] = j6;
    }

    public final void zzh(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzaeq(long[] jArr, int i7, boolean z3) {
        super(z3);
        this.zzc = jArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
