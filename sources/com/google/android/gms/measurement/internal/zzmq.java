package com.google.android.gms.measurement.internal;

import com.airbnb.lottie.model.layer.d;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmq extends zzaz {
    final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zznl zznlVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        d.t(this.zza.zzu, "Tasks have been queued for a long time");
    }
}
