package Hb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.Z;
import androidx.core.view.d0;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import kotlin.jvm.internal.Intrinsics;
import p294tb.RunnableC2060w;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3854c;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.f3852a = i7;
        this.f3853b = obj;
        this.f3854c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3852a) {
            case 2:
                ((ViewPropertyAnimatorListener) this.f3853b).onAnimationCancel((View) this.f3854c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f3852a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                ((Handler) ((x) this.f3853b).f3857g.getValue()).postDelayed((Ae.n) this.f3854c, 1000L);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                ((Handler) ((z) this.f3853b).f3860g.getValue()).postDelayed((Ae.n) this.f3854c, 1000L);
                break;
            case 2:
                ((ViewPropertyAnimatorListener) this.f3853b).onAnimationEnd((View) this.f3854c);
                break;
            case 3:
                d0 d0Var = (d0) this.f3853b;
                d0Var.f16210a.d(1.0f);
                Z.e((View) this.f3854c, d0Var);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                ((WelcomeBackActivity) this.f3853b).f35037i.postDelayed((Runnable) this.f3854c, 1000L);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                ((OcGuideDoubleOpenFragment) this.f3853b).j().postDelayed((RunnableC2060w) this.f3854c, 1000L);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3852a) {
            case 2:
                ((ViewPropertyAnimatorListener) this.f3853b).onAnimationStart((View) this.f3854c);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
