package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1174i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1176k f17143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f17144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f17146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1171f f17147e;

    public C1174i(C1176k c1176k, View view, boolean z3, x0 x0Var, C1171f c1171f) {
        this.f17143a = c1176k;
        this.f17144b = view;
        this.f17145c = z3;
        this.f17146d = x0Var;
        this.f17147e = c1171f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f17143a.f16974a;
        View viewToAnimate = this.f17144b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z3 = this.f17145c;
        x0 x0Var = this.f17146d;
        if (z3) {
            B0 b0 = x0Var.f17246a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            b0.a(viewToAnimate);
        }
        this.f17147e.a();
        if (Z.L(2)) {
            Objects.toString(x0Var);
        }
    }
}
