package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zziu;
import com.google.android.gms.internal.mlkit_common.zziv;
import com.google.android.gms.internal.mlkit_common.zziz;
import com.google.android.gms.internal.mlkit_common.zzja;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class CloseGuard implements Closeable {

    @KeepForSdk
    public static final int API_TRANSLATE = 1;
    private final AtomicBoolean zza = new AtomicBoolean();
    private final String zzb;
    private final Cleaner.Cleanable zzc;

    @KeepForSdk
    public static class Factory {
        private final Cleaner zza;

        public Factory(@NonNull Cleaner cleaner) {
            this.zza = cleaner;
        }

        @NonNull
        @KeepForSdk
        public CloseGuard create(@NonNull Object obj, int i7, @NonNull Runnable runnable) {
            return new CloseGuard(obj, i7, this.zza, runnable, zznb.zzb("common"));
        }
    }

    public CloseGuard(Object obj, final int i7, Cleaner cleaner, final Runnable runnable, final zzmq zzmqVar) {
        this.zzb = obj.toString();
        this.zzc = cleaner.register(obj, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i7, zzmqVar, runnable);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.set(true);
        this.zzc.clean();
    }

    public final /* synthetic */ void zza(int i7, zzmq zzmqVar, Runnable runnable) {
        if (!this.zza.get()) {
            Locale locale = Locale.ENGLISH;
            Log.e("MlKitCloseGuard", this.zzb + " has not been closed");
            zzja zzjaVar = new zzja();
            zziv zzivVar = new zziv();
            zzivVar.zzb(zziu.zzb(i7));
            zzjaVar.zzh(zzivVar.zzc());
            zzmqVar.zzd(zzmt.zzf(zzjaVar), zziz.HANDLE_LEAKED);
        }
        runnable.run();
    }
}
