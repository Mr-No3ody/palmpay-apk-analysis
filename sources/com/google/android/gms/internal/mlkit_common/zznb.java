package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zznb {

    @Nullable
    private static zzna zza;

    public static synchronized zzmq zza(zzmj zzmjVar) {
        try {
            if (zza == null) {
                zza = new zzna(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzmq) zza.get(zzmjVar);
    }

    public static synchronized zzmq zzb(String str) {
        return zza(zzmj.zzd("common").zzd());
    }
}
