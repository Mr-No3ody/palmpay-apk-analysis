package com.google.android.gms.ads.identifier;

import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzb extends Thread {
    final CountDownLatch zza;
    boolean zzb;
    private final WeakReference<AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j6) {
        super("\u200bcom.google.android.gms.ads.identifier.zzb");
        this.zzc = new WeakReference<>(advertisingIdClient);
        this.zzd = j6;
        this.zza = new CountDownLatch(1);
        this.zzb = false;
        ShadowThread.setThreadName(this, "\u200bcom.google.android.gms.ads.identifier.zzb").start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
                return;
            }
            zza();
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
