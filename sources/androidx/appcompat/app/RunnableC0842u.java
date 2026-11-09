package androidx.appcompat.app;

import android.view.Menu;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.appcompat.app.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0842u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12324b;

    public /* synthetic */ RunnableC0842u(Object obj, int i7) {
        this.f12323a = i7;
        this.f12324b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f12323a) {
            case 0:
                I i7 = (I) this.f12324b;
                if ((i7.f12131P0 & 1) != 0) {
                    i7.w(0);
                }
                if ((i7.f12131P0 & 4096) != 0) {
                    i7.w(108);
                }
                i7.f12130O0 = false;
                i7.f12131P0 = 0;
                return;
            case 1:
                I i10 = (I) this.f12324b;
                i10.f12140Y.showAtLocation(i10.f12139X, 55, 0, 0);
                androidx.core.view.U u6 = i10.f12142k0;
                if (u6 != null) {
                    u6.b();
                }
                if (!(i10.f12145p0 && (viewGroup = i10.f12146q0) != null && viewGroup.isLaidOut())) {
                    i10.f12139X.setAlpha(1.0f);
                    i10.f12139X.setVisibility(0);
                    return;
                }
                i10.f12139X.setAlpha(0.0f);
                androidx.core.view.U uA = androidx.core.view.N.a(i10.f12139X);
                uA.a(1.0f);
                i10.f12142k0 = uA;
                uA.d(new C0845x(this, 0));
                return;
            default:
                S s3 = (S) this.f12324b;
                D d2 = s3.f12165b;
                Menu menuX = s3.x();
                androidx.appcompat.view.menu.k kVar = menuX instanceof androidx.appcompat.view.menu.k ? (androidx.appcompat.view.menu.k) menuX : null;
                if (kVar != null) {
                    kVar.stopDispatchingItemsChanged();
                }
                try {
                    menuX.clear();
                    if (!d2.onCreatePanelMenu(0, menuX) || !d2.onPreparePanel(0, null, menuX)) {
                        menuX.clear();
                    }
                    if (kVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (kVar != null) {
                        kVar.startDispatchingItemsChanged();
                    }
                }
                break;
        }
    }
}
