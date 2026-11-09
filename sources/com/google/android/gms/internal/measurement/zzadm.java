package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzadm extends zzace implements RandomAccess, zzaea, zzafk {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzadm(fArr, 0, false);
    }

    public zzadm() {
        this(zza, 0, true);
    }

    private static int zzi(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    private final String zzk(int i7) {
        return zzacg.zza(this.zzc, i7, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        zzcM();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i11 = i7 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i10 < length) {
            System.arraycopy(fArr, i7, fArr, i11, i10 - i7);
        } else {
            float[] fArr2 = new float[zzi(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i7);
            System.arraycopy(this.zzb, i7, fArr2, i11, this.zzc - i7);
            this.zzb = fArr2;
        }
        this.zzb[i7] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcM();
        collection.getClass();
        if (!(collection instanceof zzadm)) {
            return super.addAll(collection);
        }
        zzadm zzadmVar = (zzadm) collection;
        int i7 = zzadmVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        float[] fArr = this.zzb;
        if (i11 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zzadmVar.zzb, 0, this.zzb, this.zzc, zzadmVar.zzc);
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
        if (!(obj instanceof zzadm)) {
            return super.equals(obj);
        }
        zzadm zzadmVar = (zzadm) obj;
        if (this.zzc != zzadmVar.zzc) {
            return false;
        }
        float[] fArr = zzadmVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Float.floatToIntBits(this.zzb[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Float.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i7]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcM();
        zzj(i7);
        float[] fArr = this.zzb;
        float f10 = fArr[i7];
        int i10 = this.zzc;
        if (i7 < i10 - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (i10 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zzcM();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i10, fArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzcM();
        zzj(i7);
        float[] fArr = this.zzb;
        float f10 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzaea zzg(int i7) {
        if (i7 >= this.zzc) {
            return new zzadm(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i7) {
        zzj(i7);
        return this.zzb[i7];
    }

    public final void zzf(float f10) {
        zzcM();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            float[] fArr = new float[zzi(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr2[i10] = f10;
    }

    public final void zzh(int i7) {
        int length = this.zzb.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzi(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzadm(float[] fArr, int i7, boolean z3) {
        super(z3);
        this.zzb = fArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
