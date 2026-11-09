package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1171f extends AbstractC1172g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F f17122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171f(x0 operation, androidx.core.os.d signal, boolean z3) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f17120c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
    public final F c(Context context) {
        int enterAnim;
        F f10;
        Animator animatorLoadAnimator;
        int iN;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f17121d) {
            return this.f17122e;
        }
        x0 x0Var = this.f17128a;
        boolean z3 = x0Var.f17246a == B0.f16951c;
        Fragment fragment = x0Var.f17248c;
        int nextTransition = fragment.getNextTransition();
        if (this.f17120c) {
            enterAnim = z3 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z3 ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        F f11 = null;
        if (viewGroup != null && viewGroup.getTag(p260r0.b.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(p260r0.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z3, enterAnim);
            if (animationOnCreateAnimation != null) {
                f11 = new F(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z3, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    f11 = new F(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iN = z3 ? p260r0.a.fragment_open_enter : p260r0.a.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iN = z3 ? p260r0.a.fragment_close_enter : p260r0.a.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iN = z3 ? Z4.e.N(R.attr.activityCloseEnterAnimation, context) : Z4.e.N(R.attr.activityCloseExitAnimation, context);
                        } else if (nextTransition == 4099) {
                            iN = z3 ? p260r0.a.fragment_fade_enter : p260r0.a.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iN = -1;
                        } else {
                            iN = z3 ? Z4.e.N(R.attr.activityOpenEnterAnimation, context) : Z4.e.N(R.attr.activityOpenExitAnimation, context);
                        }
                        enterAnim = iN;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    f10 = new F(animationLoadAnimation);
                                    f11 = f10;
                                }
                            } catch (Resources.NotFoundException e10) {
                                throw e10;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        f10 = new F(animatorLoadAnimator);
                                        f11 = f10;
                                    }
                                } catch (RuntimeException e11) {
                                    if (zEquals) {
                                        throw e11;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        f11 = new F(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                f10 = new F(animatorLoadAnimator);
                                f11 = f10;
                            }
                        }
                    }
                }
            }
        }
        this.f17122e = f11;
        this.f17121d = true;
        return f11;
    }
}
