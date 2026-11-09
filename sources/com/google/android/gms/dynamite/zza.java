package com.google.android.gms.dynamite;

import android.os.Process;
import com.didiglobal.booster.instrument.ShadowThread;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends Thread {
    public zza(ThreadGroup threadGroup, String str) {
        super(threadGroup, ShadowThread.makeThreadName("GmsDynamite", "\u200bcom.google.android.gms.dynamite.zza"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
