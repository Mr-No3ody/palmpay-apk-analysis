package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends m0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q0 f16267q = q0.h(null, WindowInsets.CONSUMED);

    public n0(@NonNull q0 q0Var, @NonNull WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // androidx.core.view.j0, androidx.core.view.o0
    public final void d(@NonNull View view) {
    }

    @Override // androidx.core.view.j0, androidx.core.view.o0
    @NonNull
    public androidx.core.graphics.e g(int i7) {
        return androidx.core.graphics.e.c(this.f16252c.getInsets(p0.a(i7)));
    }

    @Override // androidx.core.view.j0, androidx.core.view.o0
    public boolean p(int i7) {
        return this.f16252c.isVisible(p0.a(i7));
    }

    public n0(@NonNull q0 q0Var, @NonNull n0 n0Var) {
        super(q0Var, n0Var);
    }
}
