package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzz extends zzal {
    private final int zza;
    private int zzb;

    public zzz(int i7, int i10) {
        zzr.zzc(i10, i7, FirebaseAnalytics.Param.INDEX);
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        return zza(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zzb - 1;
        this.zzb = i7;
        return zza(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i7);
}
