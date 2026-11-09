package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15890a;

    public d(CoordinatorLayout coordinatorLayout) {
        this.f15890a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f15890a.onChildViewsChanged(0);
        return true;
    }
}
