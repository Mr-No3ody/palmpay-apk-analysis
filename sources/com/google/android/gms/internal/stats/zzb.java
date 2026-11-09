package com.google.android.gms.internal.stats;

import androidx.annotation.Nullable;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb implements Closeable {
    private static final zzb zza = new zzb(false, null);

    private zzb(boolean z3, @Nullable zzd zzdVar) {
    }

    public static zzb zza(boolean z3, @Nullable zzc zzcVar) {
        return zza;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
