package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
final class zzau extends zzao {
    static final zzao zza = new zzau(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzau(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzac.zza(i7, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i7];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzao, com.google.android.gms.internal.mlkit_common.zzak
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final Object[] zze() {
        return this.zzb;
    }
}
