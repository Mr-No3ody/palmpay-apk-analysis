package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class L implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0878q f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f12698b;

    public L(M m7, ViewTreeObserverOnGlobalLayoutListenerC0878q viewTreeObserverOnGlobalLayoutListenerC0878q) {
        this.f12698b = m7;
        this.f12697a = viewTreeObserverOnGlobalLayoutListenerC0878q;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f12698b.f12731w0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f12697a);
        }
    }
}
