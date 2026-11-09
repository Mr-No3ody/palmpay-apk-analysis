package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0858g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12903c;

    public /* synthetic */ RunnableC0858g(int i7, Object obj, Object obj2) {
        this.f12901a = i7;
        this.f12903c = obj;
        this.f12902b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12901a) {
            case 0:
                C0868l c0868l = (C0868l) this.f12903c;
                androidx.appcompat.view.menu.k kVar = c0868l.f12380c;
                if (kVar != null) {
                    kVar.changeMenuMode();
                }
                View view = (View) c0868l.f12385i;
                if (view != null && view.getWindowToken() != null) {
                    C0862i c0862i = (C0862i) this.f12902b;
                    if (c0862i.b()) {
                        c0868l.f12947M = c0862i;
                    } else if (c0862i.f12482e != null) {
                        c0862i.d(0, 0, false, false);
                        c0868l.f12947M = c0862i;
                    }
                }
                c0868l.f12949X = null;
                break;
            default:
                View view2 = (View) this.f12902b;
                int left = view2.getLeft();
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.f12903c;
                scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view2.getWidth()) / 2), 0);
                scrollingTabContainerView.f12755a = null;
                break;
        }
    }
}
