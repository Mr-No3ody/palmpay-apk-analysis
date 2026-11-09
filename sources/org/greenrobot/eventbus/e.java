package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Handler implements Poster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p039cb.c f41074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f41076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41077d;

    public e(c cVar, Looper looper) {
        super(looper);
        this.f41076c = cVar;
        this.f41075b = 10;
        this.f41074a = new p039cb.c(14, false);
    }

    @Override // org.greenrobot.eventbus.Poster
    public final void enqueue(l lVar, Object obj) {
        g gVarA = g.a(lVar, obj);
        synchronized (this) {
            try {
                this.f41074a.a(gVarA);
                if (!this.f41077d) {
                    this.f41077d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new P0.c("Could not send handler message", 15, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                g gVarE = this.f41074a.e();
                if (gVarE == null) {
                    synchronized (this) {
                        gVarE = this.f41074a.e();
                        if (gVarE == null) {
                            this.f41077d = false;
                            return;
                        }
                    }
                }
                this.f41076c.c(gVarE);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f41075b);
            if (!sendMessage(obtainMessage())) {
                throw new P0.c("Could not send handler message", 15, false);
            }
            this.f41077d = true;
        } catch (Throwable th) {
            this.f41077d = false;
            throw th;
        }
    }
}
