package androidx.core.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16184a;

    public U(View view) {
        this.f16184a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f16184a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f16184a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f16184a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f16184a.get();
        if (view != null) {
            if (viewPropertyAnimatorListener != null) {
                view.animate().setListener(new Hb.w(2, viewPropertyAnimatorListener, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f16184a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
