package com.google.android.gms.internal.measurement;

import android.os.Process;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqi implements zzqm {
    private static boolean zza;
    private final Supplier zzb;
    private final int zzc;
    private final Supplier zzd;

    public zzqi(Supplier supplier, int i7) {
        zzqh zzqhVar = zzqh.zza;
        this.zzb = supplier;
        this.zzc = Math.max(5, 10);
        this.zzd = zzqhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!zza) {
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzqg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzb();
                        }
                    };
                    long j6 = this.zzc;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ListeningScheduledExecutorService listeningScheduledExecutorService = (ListeningScheduledExecutorService) this.zzb.get();
                    zzpx.zza(listeningScheduledExecutorService.schedule((Runnable) new zzqf(this, runnable, listeningScheduledExecutorService, j6, timeUnit), j6, timeUnit));
                    zza = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzb() {
        if (((Boolean) this.zzd.get()).booleanValue()) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
