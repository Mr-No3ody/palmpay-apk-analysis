package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class zzli {
    @WorkerThread
    public static void zza(zzkx zzkxVar, int i7, int i10, long j6, int i11, int i12, int i13, int i14) {
        zzkxVar.zzc(zzc(i7, i10, j6, i11, i12, i13, i14), zzhs.INPUT_IMAGE_CONSTRUCTION);
    }

    @WorkerThread
    public static void zzb(zzkx zzkxVar, int i7, int i10, long j6, int i11, int i12, int i13, int i14) {
        zzkxVar.zzc(zzc(i7, i10, j6, i11, i12, i13, i14), zzhs.ODML_IMAGE);
    }

    private static zzlh zzc(int i7, int i10, long j6, int i11, int i12, int i13, int i14) {
        return new zzlh(i7, i10, i13, i11, i12, SystemClock.elapsedRealtime() - j6, i14);
    }
}
