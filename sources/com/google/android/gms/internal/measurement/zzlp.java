package com.google.android.gms.internal.measurement;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzlp implements Supplier {
    static final /* synthetic */ zzlp zza = new zzlp();

    private /* synthetic */ zzlp() {
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        int i7 = zzlk.zza;
        return MoreExecutors.listeningDecorator(ShadowExecutors.newOptimizedSingleThreadScheduledExecutor(zzlo.zza, "\u200bcom.google.android.gms.internal.measurement.zzlp"));
    }
}
