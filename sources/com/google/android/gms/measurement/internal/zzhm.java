package com.google.android.gms.measurement.internal;

import M.l;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhm extends l {
    final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzht zzhtVar, int i7) {
        super(20);
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // M.l
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzD(str);
    }
}
