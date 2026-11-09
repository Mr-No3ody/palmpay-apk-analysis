package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class zzhy extends Thread {
    final /* synthetic */ zzhz zza;
    private final Object zzb;
    private final BlockingQueue zzc;

    @GuardedBy("threadLifeCycleLock")
    private boolean zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhy(zzhz zzhzVar, String str, BlockingQueue blockingQueue) {
        super("\u200bcom.google.android.gms.measurement.internal.zzhy");
        Objects.requireNonNull(zzhzVar);
        this.zza = zzhzVar;
        this.zzd = false;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(ShadowThread.makeThreadName(str, "\u200bcom.google.android.gms.measurement.internal.zzhy"));
    }

    private final void zzb() {
        zzhz zzhzVar = this.zza;
        synchronized (zzhzVar.zzr()) {
            try {
                if (!this.zzd) {
                    zzhzVar.zzs().release();
                    zzhzVar.zzr().notifyAll();
                    if (this == zzhzVar.zzn()) {
                        zzhzVar.zzo(null);
                    } else if (this == zzhzVar.zzp()) {
                        zzhzVar.zzq(null);
                    } else {
                        zzhzVar.zzu.zzaW().zzb().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.zzd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzu.zzaW().zze().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        while (!z3) {
            try {
                this.zza.zzs().acquire();
                z3 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.zzc;
                zzhx zzhxVar = (zzhx) blockingQueue.poll();
                if (zzhxVar != null) {
                    Process.setThreadPriority(true != zzhxVar.zza ? 10 : threadPriority);
                    zzhxVar.run();
                } else {
                    Object obj = this.zzb;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.zza.zzt();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    synchronized (this.zza.zzr()) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        Object obj = this.zzb;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
