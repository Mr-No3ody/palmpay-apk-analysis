package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzc(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.zza.zza().zzH();
    }
}
