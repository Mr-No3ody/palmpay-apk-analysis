package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzao extends zzam implements List {
    final /* synthetic */ zzap zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, Object obj, @CheckForNull List list, zzam zzamVar) {
        super(zzapVar, obj, list, zzamVar);
        this.zzf = zzapVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i7, obj);
        zzap.zzd(this.zzf);
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        zzap.zzf(this.zzf, this.zzb.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzb();
        return ((List) this.zzb).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzan(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        zzb();
        Object objRemove = ((List) this.zzb).remove(i7);
        zzap.zze(this.zzf);
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.zzb).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        zzb();
        zzap zzapVar = this.zzf;
        Object obj = this.zza;
        List listSubList = ((List) this.zzb).subList(i7, i10);
        zzam zzamVar = this.zzc;
        if (zzamVar == null) {
            zzamVar = this;
        }
        return zzapVar.zzi(obj, listSubList, zzamVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        zzb();
        return new zzan(this, i7);
    }
}
