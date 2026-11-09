package p305u5;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnWindowFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        c.f42706a.l(new b(view, view2));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c.f42706a.l(new b(2));
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c.f42706a.l(new b(3));
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z3) {
        c.f42706a.l(new b(5));
    }
}
