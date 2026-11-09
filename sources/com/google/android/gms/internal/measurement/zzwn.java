package com.google.android.gms.internal.measurement;

import com.horcrux.svg.d0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzwn {
    int zza;
    final int zzb;
    zzwn zzc;
    final Map zzd = new HashMap(0);

    public zzwn(int i7, int i10, zzwn zzwnVar) {
        if (i7 > i10) {
            throw new IllegalArgumentException();
        }
        this.zza = i7;
        this.zzb = i10;
        this.zzc = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return d0.n(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
