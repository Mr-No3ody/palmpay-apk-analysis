package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
abstract class zaaq implements Runnable {
    final /* synthetic */ zaar zab;

    public /* synthetic */ zaaq(zaar zaarVar, byte[] bArr) {
        Objects.requireNonNull(zaarVar);
        this.zab = zaarVar;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Lock lockZas;
        zaar zaarVar = this.zab;
        zaarVar.zas().lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lockZas = zaarVar.zas();
                } else {
                    zaa();
                    lockZas = this.zab.zas();
                }
            } catch (RuntimeException e10) {
                this.zab.zar().zas(e10);
            }
            lockZas.unlock();
        } catch (Throwable th) {
            this.zab.zas().unlock();
            throw th;
        }
    }

    @WorkerThread
    public abstract void zaa();
}
