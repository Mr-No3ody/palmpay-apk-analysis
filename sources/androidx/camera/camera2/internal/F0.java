package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F0 implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f13139b;

    public /* synthetic */ F0(K0 k2, int i7) {
        this.f13138a = i7;
        this.f13139b = k2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(final androidx.concurrent.futures.k kVar) {
        switch (this.f13138a) {
            case 0:
                final K0 k2 = this.f13139b;
                k2.getClass();
                final int i7 = 1;
                k2.f13204b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                k2.f(kVar);
                                break;
                            default:
                                k2.b(kVar);
                                break;
                        }
                    }
                });
                return "cancelFocusAndMetering";
            default:
                final K0 k8 = this.f13139b;
                k8.getClass();
                final int i10 = 0;
                k8.f13204b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k8.f(kVar);
                                break;
                            default:
                                k8.b(kVar);
                                break;
                        }
                    }
                });
                return "triggerAePrecapture";
        }
    }
}
