package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class L implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f17029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f17030b;

    public L(M m7, f0 f0Var) {
        this.f17030b = m7;
        this.f17029a = f0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f0 f0Var = this.f17029a;
        Fragment fragment = f0Var.f17125c;
        f0Var.i();
        D0.f16973f.getOrCreateController((ViewGroup) fragment.mView.getParent(), this.f17030b.f17031a).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
