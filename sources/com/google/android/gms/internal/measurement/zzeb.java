package com.google.android.gms.internal.measurement;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzeb implements ThreadFactory {
    private final ThreadFactory zza;

    public zzeb(zzez zzezVar) {
        Objects.requireNonNull(zzezVar);
        this.zza = ShadowExecutors.defaultThreadFactory("\u200bcom.google.android.gms.internal.measurement.zzeb");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.zza.newThread(runnable);
        threadNewThread.setName(ShadowThread.makeThreadName("ScionFrontendApi", "\u200bcom.google.android.gms.internal.measurement.zzeb"));
        return threadNewThread;
    }
}
