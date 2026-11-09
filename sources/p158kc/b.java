package p158kc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f38730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f38731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f38732c;

    public b(View view, float f10, d dVar) {
        this.f38730a = view;
        this.f38731b = f10;
        this.f38732c = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationCancel(animation);
        View view = this.f38730a;
        if (view != null) {
            view.setTranslationX(this.f38731b);
        }
        this.f38732c.f38745f--;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        View view = this.f38730a;
        if (view != null) {
            view.setTranslationX(this.f38731b);
        }
        this.f38732c.f38745f--;
    }
}
