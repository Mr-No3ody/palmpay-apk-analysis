package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15870a;

    public a(CoordinatorLayout coordinatorLayout) {
        this.f15870a = coordinatorLayout;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 q0Var) {
        return this.f15870a.setWindowInsets(q0Var);
    }
}
