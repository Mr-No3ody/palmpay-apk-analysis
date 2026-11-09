package androidx.camera.camera2.internal;

import E.C0219y;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f13119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13120c;

    public /* synthetic */ B0(int i7, long j6, K0 k2) {
        this.f13118a = i7;
        this.f13119b = k2;
        this.f13120c = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13118a) {
            case 0:
                K0 k2 = this.f13119b;
                if (this.f13120c == k2.f13213k) {
                    k2.b(null);
                }
                break;
            case 1:
                K0 k8 = this.f13119b;
                if (this.f13120c == k8.f13213k) {
                    k8.f13215m = false;
                    ScheduledFuture scheduledFuture = k8.f13212j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        k8.f13212j = null;
                    }
                    androidx.concurrent.futures.k kVar = k8.t;
                    if (kVar != null) {
                        kVar.b(new C0219y(false));
                        k8.t = null;
                    }
                }
                break;
            case 2:
                K0 k10 = this.f13119b;
                k10.getClass();
                k10.f13204b.execute(new B0(1, this.f13120c, k10));
                break;
            default:
                K0 k11 = this.f13119b;
                k11.getClass();
                k11.f13204b.execute(new B0(0, this.f13120c, k11));
                break;
        }
    }
}
