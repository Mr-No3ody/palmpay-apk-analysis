package p354xe;

import Ac.e;
import Pa.i0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f43941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f43942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WelcomeCouponBean f43943g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimatorSet f43944i;

    public h(View view) {
        this.f43937a = view;
        this.f43938b = view != null ? (TextView) view.findViewById(e.text1) : null;
        this.f43939c = view != null ? (TextView) view.findViewById(e.text2) : null;
        TextView textView = view != null ? (TextView) view.findViewById(e.btn) : null;
        this.f43940d = textView;
        this.f43941e = view != null ? (ImageView) view.findViewById(e.iv_hot) : null;
        this.f43942f = view != null ? (ImageView) view.findViewById(e.ivFinger) : null;
        if (textView != null) {
            textView.setOnClickListener(new c(this, 9));
        }
    }

    public final void a(View view) {
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        WelcomeCouponBean welcomeCouponBean = this.f43943g;
        if (welcomeCouponBean == null || welcomeCouponBean.hot != 1) {
            return;
        }
        if (this.f43944i == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.9f, 0.8f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.9f, 0.8f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "pivotX", 0.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "pivotY", 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f43944i = animatorSet;
            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
            if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat3)) != null) {
                builderWith2.with(objectAnimatorOfFloat4);
            }
            AnimatorSet animatorSet2 = this.f43944i;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(500L);
            }
            AnimatorSet animatorSet3 = this.f43944i;
            if (animatorSet3 != null) {
                animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            AnimatorSet animatorSet4 = this.f43944i;
            if (animatorSet4 != null) {
                animatorSet4.addListener(this);
            }
            AnimatorSet animatorSet5 = this.f43944i;
            if (animatorSet5 != null) {
                animatorSet5.setStartDelay(1000L);
            }
        }
        AnimatorSet animatorSet6 = this.f43944i;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.f43944i;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f43944i;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f43944i = null;
    }

    public final void c(WelcomeCouponBean welcomeCouponBean) {
        String str;
        TextView textView;
        if (welcomeCouponBean != null && (str = welcomeCouponBean.title) != null && (textView = this.f43938b) != null) {
            textView.setText(y.k(str, "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
        }
        TextView textView2 = this.f43939c;
        if (textView2 != null) {
            textView2.setText(welcomeCouponBean != null ? welcomeCouponBean.reward : null);
        }
        TextView textView3 = this.f43940d;
        if (textView3 != null) {
            textView3.setText(welcomeCouponBean != null ? welcomeCouponBean.button : null);
        }
        this.f43943g = welcomeCouponBean;
        ImageView imageView = this.f43941e;
        ImageView imageView2 = this.f43942f;
        if (welcomeCouponBean == null || welcomeCouponBean.hot != 1) {
            if (imageView != null) {
                p220oa.h.s(imageView, false);
            }
            if (imageView2 != null) {
                p220oa.h.s(imageView2, false);
            }
            b();
            return;
        }
        if (imageView != null) {
            p220oa.h.s(imageView, true);
        }
        if (imageView2 != null) {
            p220oa.h.s(imageView2, true);
        }
        a(imageView2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f43937a;
        if (!i0.X(view != null ? view.getContext() : null)) {
            b();
            return;
        }
        AnimatorSet animatorSet = this.f43944i;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
