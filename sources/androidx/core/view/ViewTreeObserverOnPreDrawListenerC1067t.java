package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: androidx.core.view.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1067t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f16287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f16288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f16289c;

    public ViewTreeObserverOnPreDrawListenerC1067t(View view, Runnable runnable) {
        this.f16287a = view;
        this.f16288b = view.getViewTreeObserver();
        this.f16289c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1067t viewTreeObserverOnPreDrawListenerC1067t = new ViewTreeObserverOnPreDrawListenerC1067t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1067t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1067t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f16288b.isAlive()) {
            this.f16288b.removeOnPreDrawListener(this);
        } else {
            this.f16287a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16287a.removeOnAttachStateChangeListener(this);
        this.f16289c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16288b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f16288b.isAlive()) {
            this.f16288b.removeOnPreDrawListener(this);
        } else {
            this.f16287a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16287a.removeOnAttachStateChangeListener(this);
    }
}
