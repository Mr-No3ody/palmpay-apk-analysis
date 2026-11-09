package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzon {
    private final Function zza;
    private final boolean zzb;
    private final ImmutableSet zzc;
    private volatile String zzd = null;

    public zzon(Function function, boolean z3, boolean z8, boolean z10, boolean z11, ImmutableSet immutableSet) {
        this.zza = function;
        this.zzb = z10;
        this.zzc = immutableSet;
    }

    public final String zza(Context context) {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.zza.apply(context);
        this.zzd = str2;
        return str2;
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final ImmutableSet zzc() {
        return this.zzc;
    }
}
