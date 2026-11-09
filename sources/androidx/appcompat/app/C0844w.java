package androidx.appcompat.app;

import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;

/* JADX INFO: renamed from: androidx.appcompat.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0844w implements ContentFrameLayout.OnAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f12326a;

    public C0844w(I i7) {
        this.f12326a = i7;
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onAttachedFromWindow() {
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onDetachedFromWindow() {
        I i7 = this.f12326a;
        DecorContentParent decorContentParent = i7.f12120H;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (i7.f12140Y != null) {
            i7.t.getDecorView().removeCallbacks(i7.f12141Z);
            if (i7.f12140Y.isShowing()) {
                try {
                    i7.f12140Y.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            i7.f12140Y = null;
        }
        androidx.core.view.U u6 = i7.f12142k0;
        if (u6 != null) {
            u6.b();
        }
        androidx.appcompat.view.menu.k kVar = i7.B(0).f12098h;
        if (kVar != null) {
            kVar.close();
        }
    }
}
