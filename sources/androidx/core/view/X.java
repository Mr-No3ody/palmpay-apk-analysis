package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class X implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f16187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f16188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f16189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f16191e;

    public X(d0 d0Var, q0 q0Var, q0 q0Var2, int i7, View view) {
        this.f16187a = d0Var;
        this.f16188b = q0Var;
        this.f16189c = q0Var2;
        this.f16190d = i7;
        this.f16191e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i0 g0Var;
        int i7;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        d0 d0Var = this.f16187a;
        d0Var.f16210a.d(animatedFraction);
        float fB = d0Var.f16210a.b();
        PathInterpolator pathInterpolator = Z.f16194e;
        int i10 = Build.VERSION.SDK_INT;
        q0 q0Var = this.f16188b;
        if (i10 >= 30) {
            g0Var = new h0(q0Var);
        } else {
            g0Var = i10 >= 29 ? new g0(q0Var) : new f0(q0Var);
        }
        int i11 = 1;
        while (i11 <= 256) {
            int i12 = this.f16190d & i11;
            o0 o0Var = q0Var.f16277a;
            if (i12 == 0) {
                g0Var.c(i11, o0Var.g(i11));
                i7 = 1;
            } else {
                androidx.core.graphics.e eVarG = o0Var.g(i11);
                androidx.core.graphics.e eVarG2 = this.f16189c.f16277a.g(i11);
                float f10 = 1.0f - fB;
                i7 = 1;
                g0Var.c(i11, q0.e(eVarG, (int) (((double) ((eVarG.f16058a - eVarG2.f16058a) * f10)) + 0.5d), (int) (((double) ((eVarG.f16059b - eVarG2.f16059b) * f10)) + 0.5d), (int) (((double) ((eVarG.f16060c - eVarG2.f16060c) * f10)) + 0.5d), (int) (((double) ((eVarG.f16061d - eVarG2.f16061d) * f10)) + 0.5d)));
            }
            i11 <<= i7;
            fB = fB;
        }
        Z.g(this.f16191e, g0Var.b(), Collections.singletonList(d0Var));
    }
}
