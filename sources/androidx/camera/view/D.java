package androidx.camera.view;

import E.C0204i;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14878b;

    public /* synthetic */ D(Object obj, int i7) {
        this.f14877a = i7;
        this.f14878b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f14877a) {
            case 0:
                p140j8.f.G("SurfaceViewImpl");
                l lVar = (l) this.f14878b;
                if (lVar != null) {
                    lVar.onSurfaceNotInUse();
                }
                break;
            default:
                ((androidx.concurrent.futures.k) this.f14878b).b((C0204i) obj);
                break;
        }
    }
}
