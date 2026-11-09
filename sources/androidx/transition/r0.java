package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {
    @Override // androidx.transition.K
    public final float d(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.K
    public final void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.q0, androidx.transition.K
    public final void g(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // androidx.transition.q0
    public final void i(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.q0
    public final void j(View view, int i7, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    @Override // androidx.transition.q0
    public final void k(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.q0
    public final void l(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
