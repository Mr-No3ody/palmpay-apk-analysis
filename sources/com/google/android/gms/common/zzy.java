package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z3, int i7, int i10, @Nullable String str, @Nullable Throwable th, long j6) {
        this.zza = z3;
        this.zzd = i7;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzy zzb() {
        return zze;
    }

    public static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @VisibleForTesting(otherwise = 3)
    public static zzy zzf(int i7, long j6) {
        return new zzy(true, i7, 1, null, null, j6);
    }

    public static zzy zzg(int i7, int i10, @NonNull String str, @Nullable Throwable th) {
        return new zzy(false, i7, i10, str, th, -1L);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }

    public /* synthetic */ zzy(boolean z3, int i7, int i10, String str, Throwable th, long j6, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
