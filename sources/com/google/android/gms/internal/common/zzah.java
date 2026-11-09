package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzah extends zzac implements List, RandomAccess {
    private static final zzal zza = new zzae(zzaj.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzah zzj() {
        return zzaj.zza;
    }

    public static zzah zzk(Object obj) {
        Object[] objArr = {obj};
        zzai.zza(objArr, 1);
        return zzq(objArr, 1);
    }

    public static zzah zzl(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzai.zza(objArr, 2);
        return zzq(objArr, 2);
    }

    public static zzah zzm(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzai.zza(objArr, 3);
        return zzq(objArr, 3);
    }

    public static zzah zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzai.zza(objArr, 6);
        return zzq(objArr, 6);
    }

    public static zzah zzo(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzp((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzaj.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzk(next);
        }
        zzad zzadVar = new zzad(4);
        zzadVar.zzb(next);
        zzadVar.zzc(it);
        return zzadVar.zzd();
    }

    public static zzah zzp(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzai.zza(array, length);
            return zzq(array, length);
        }
        zzah zzahVarZze = ((zzac) collection).zze();
        if (!zzahVarZze.zzf()) {
            return zzahVarZze;
        }
        Object[] array2 = zzahVarZze.toArray();
        return zzq(array2, array2.length);
    }

    public static zzah zzq(Object[] objArr, int i7) {
        return i7 == 0 ? zzaj.zza : new zzaj(objArr, i7);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i7 = 0; i7 < size; i7++) {
                if (!Objects.equals(get(i7), list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: zza */
    public final zzak iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    public final zzah zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public int zzg(Object[] objArr, int i7) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    public zzah zzh() {
        return size() <= 1 ? this : new zzaf(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzi */
    public zzah subList(int i7, int i10) {
        zzr.zzd(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? zzaj.zza : new zzag(this, i7, i11);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzal listIterator(int i7) {
        zzr.zzc(i7, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzae(this, i7);
    }
}
