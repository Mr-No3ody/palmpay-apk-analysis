package com.google.android.gms.internal.maps;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzbw extends zzbo {
    static final zzbw zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzbw(objArr, 0, objArr, 0, 0);
    }

    public zzbw(Object[] objArr, int i7, Object[] objArr2, int i10, int i11) {
        this.zzb = objArr;
        this.zze = i7;
        this.zzc = objArr2;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // com.google.android.gms.internal.maps.zzbh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZza = zzbg.zza(obj.hashCode());
                while (true) {
                    int i7 = iZza & this.zzf;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZza = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.maps.zzbo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.maps.zzbo, com.google.android.gms.internal.maps.zzbh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbo, com.google.android.gms.internal.maps.zzbh
    /* JADX INFO: renamed from: zzd */
    public final zzbz iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbo
    public final zzbk zzh() {
        return zzbk.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.maps.zzbo
    public final boolean zzj() {
        return true;
    }
}
