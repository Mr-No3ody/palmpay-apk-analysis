package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.core.graphics.e f16257m;

    public k0(@NonNull q0 q0Var, @NonNull WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f16257m = null;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public q0 b() {
        return q0.h(null, this.f16252c.consumeStableInsets());
    }

    @Override // androidx.core.view.o0
    @NonNull
    public q0 c() {
        return q0.h(null, this.f16252c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.o0
    @NonNull
    public final androidx.core.graphics.e i() {
        if (this.f16257m == null) {
            WindowInsets windowInsets = this.f16252c;
            this.f16257m = androidx.core.graphics.e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f16257m;
    }

    @Override // androidx.core.view.o0
    public boolean n() {
        return this.f16252c.isConsumed();
    }

    @Override // androidx.core.view.o0
    public void t(@Nullable androidx.core.graphics.e eVar) {
        this.f16257m = eVar;
    }

    public k0(@NonNull q0 q0Var, @NonNull k0 k0Var) {
        super(q0Var, k0Var);
        this.f16257m = null;
        this.f16257m = k0Var.f16257m;
    }
}
