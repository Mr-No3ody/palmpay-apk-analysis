package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends l0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.core.graphics.e f16262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.core.graphics.e f16263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.core.graphics.e f16264p;

    public m0(@NonNull q0 q0Var, @NonNull WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f16262n = null;
        this.f16263o = null;
        this.f16264p = null;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public androidx.core.graphics.e h() {
        if (this.f16263o == null) {
            this.f16263o = androidx.core.graphics.e.c(this.f16252c.getMandatorySystemGestureInsets());
        }
        return this.f16263o;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public androidx.core.graphics.e j() {
        if (this.f16262n == null) {
            this.f16262n = androidx.core.graphics.e.c(this.f16252c.getSystemGestureInsets());
        }
        return this.f16262n;
    }

    @Override // androidx.core.view.o0
    @NonNull
    public androidx.core.graphics.e l() {
        if (this.f16264p == null) {
            this.f16264p = androidx.core.graphics.e.c(this.f16252c.getTappableElementInsets());
        }
        return this.f16264p;
    }

    @Override // androidx.core.view.j0, androidx.core.view.o0
    @NonNull
    public q0 m(int i7, int i10, int i11, int i12) {
        return q0.h(null, this.f16252c.inset(i7, i10, i11, i12));
    }

    @Override // androidx.core.view.k0, androidx.core.view.o0
    public void t(@Nullable androidx.core.graphics.e eVar) {
    }

    public m0(@NonNull q0 q0Var, @NonNull m0 m0Var) {
        super(q0Var, m0Var);
        this.f16262n = null;
        this.f16263o = null;
        this.f16264p = null;
    }
}
