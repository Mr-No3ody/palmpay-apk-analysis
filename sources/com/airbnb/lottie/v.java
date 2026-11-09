package com.airbnb.lottie;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20276b;

    public /* synthetic */ v(y yVar, int i7) {
        this.f20275a = i7;
        this.f20276b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20275a) {
            case 0:
                Drawable drawable = this.f20276b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                y yVar = this.f20276b;
                Semaphore semaphore = yVar.f20291F0;
                com.airbnb.lottie.model.layer.b bVar = yVar.f20293H;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.k(yVar.f20305b.a());
                    if (y.f20280L0 && yVar.f20289D0) {
                        if (yVar.f20292G0 == null) {
                            yVar.f20292G0 = new Handler(Looper.getMainLooper());
                            yVar.f20294H0 = new v(yVar, 0);
                        }
                        yVar.f20292G0.post(yVar.f20294H0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
