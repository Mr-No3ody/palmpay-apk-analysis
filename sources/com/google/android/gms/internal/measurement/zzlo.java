package com.google.android.gms.internal.measurement;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzlo implements ThreadFactory {
    static final /* synthetic */ zzlo zza = new zzlo();

    private /* synthetic */ zzlo() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        int i7 = zzlk.zza;
        return new ShadowThread(runnable, "ProcessStablePhenotypeFlag", "\u200bcom.google.android.gms.internal.measurement.zzlo");
    }
}
