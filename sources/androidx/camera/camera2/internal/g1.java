package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f13538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.internal.b f13539c;

    public /* synthetic */ g1(j1 j1Var, androidx.camera.core.internal.b bVar, int i7) {
        this.f13537a = i7;
        this.f13538b = j1Var;
        this.f13539c = bVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(final androidx.concurrent.futures.k kVar) {
        switch (this.f13537a) {
            case 0:
                final j1 j1Var = this.f13538b;
                j1Var.getClass();
                final androidx.camera.core.internal.b bVar = this.f13539c;
                final int i7 = 0;
                j1Var.f13566b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                j1Var.c(kVar, bVar);
                                break;
                            default:
                                j1Var.c(kVar, bVar);
                                break;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final j1 j1Var2 = this.f13538b;
                j1Var2.getClass();
                final androidx.camera.core.internal.b bVar2 = this.f13539c;
                final int i10 = 1;
                j1Var2.f13566b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j1Var2.c(kVar, bVar2);
                                break;
                            default:
                                j1Var2.c(kVar, bVar2);
                                break;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
