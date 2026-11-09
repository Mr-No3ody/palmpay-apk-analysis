package com.facebook.imagepipeline.producers;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f21476b;

    public /* synthetic */ F(G g7, int i7) {
        this.f21475a = i7;
        this.f21476b = g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p109h3.e eVar;
        int i7;
        switch (this.f21475a) {
            case 0:
                G g7 = this.f21476b;
                g7.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (g7) {
                    eVar = g7.f21481e;
                    i7 = g7.f21482f;
                    g7.f21481e = null;
                    g7.f21482f = 0;
                    g7.f21483g = 3;
                    g7.f21485i = jUptimeMillis;
                    break;
                }
                try {
                    if (G.d(eVar, i7)) {
                        g7.f21478b.run(eVar, i7);
                        break;
                    }
                    return;
                } finally {
                    p109h3.e.b(eVar);
                    g7.b();
                }
            default:
                G g10 = this.f21476b;
                g10.f21477a.execute(g10.f21479c);
                return;
        }
    }
}
