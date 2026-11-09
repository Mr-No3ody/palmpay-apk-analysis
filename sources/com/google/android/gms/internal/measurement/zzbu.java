package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzbu {
    private static volatile zzbu zza;
    private final List zzb = new CopyOnWriteArrayList();

    private zzbu() {
    }

    public static zzbu zza() {
        if (zza == null) {
            synchronized (zzbu.class) {
                try {
                    if (zza == null) {
                        zza = new zzbu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public final void zzb(zzbt zzbtVar) {
        this.zzb.add(0, zzbtVar);
    }
}
