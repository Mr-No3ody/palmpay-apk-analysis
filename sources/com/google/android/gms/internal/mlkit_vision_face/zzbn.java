package com.google.android.gms.internal.mlkit_vision_face;

import C0.G;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbn extends zzbi implements List, RandomAccess {
    private static final zzcm zza = new zzbl(zzcc.zza, 0);

    public static zzbn zzg(Object[] objArr) {
        return zzh(objArr, objArr.length);
    }

    public static zzbn zzh(Object[] objArr, int i7) {
        return i7 == 0 ? zzcc.zza : new zzcc(objArr, i7);
    }

    public static zzbn zzi(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(G.m(i7, "at index "));
            }
        }
        return zzh(objArr, 2);
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
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
                if (!zzx.zza(get(i7), list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzx.zza(it.next(), it2.next())) {
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

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* JADX INFO: renamed from: zzd */
    public final zzcl iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzf */
    public zzbn subList(int i7, int i10) {
        zzab.zzc(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? zzcc.zza : new zzbm(this, i7, i11);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcm listIterator(int i7) {
        zzab.zzb(i7, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzbl(this, i7);
    }
}
