package Me;

import Bc.E;
import C0.G;
import Pa.n0;
import Pa.r0;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC0456a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f5995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LifecycleCoroutineScopeImpl f5996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PalmZoneViewModel f5997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f5998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E f5999g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f6000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AnimatorSet f6001j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f6002o;

    public r(LinearLayout linearLayout, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, PalmZoneViewModel palmZoneViewModel) {
        super(0);
        this.f5995c = linearLayout;
        this.f5996d = lifecycleCoroutineScopeImpl;
        this.f5997e = palmZoneViewModel;
        this.f6002o = C2131j.b(new La.i(7));
        AppCompatImageView appCompatImageViewE = e(linearLayout, Ac.d.main_reward_header_skeleton_bg);
        this.f5949a = appCompatImageViewE;
        if (appCompatImageViewE == null) {
            l();
        }
    }

    @Override // Me.AbstractC0456a
    public final int f() {
        return CommonViewExtKt.getDp(4.0f);
    }

    public final void l() {
        AppCompatTextView textView;
        View viewG = AbstractC0456a.g(this, this.f5995c, Ac.f.main_layout_rewards_points_and_coupon, 12);
        this.f5998f = viewG;
        if (viewG != null) {
            int i7 = Ac.e.couponView;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewG);
            if (constraintLayout != null) {
                i7 = Ac.e.guideLine;
                if (((Guideline) p059e1.a.m(i7, viewG)) != null) {
                    i7 = Ac.e.ivBg;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewG);
                    if (imageView != null) {
                        i7 = Ac.e.ivCoupon;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewG);
                        if (imageView2 != null) {
                            i7 = Ac.e.ivPoints;
                            ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewG);
                            if (imageView3 != null) {
                                i7 = Ac.e.ivTopIcon;
                                ImageView imageView4 = (ImageView) p059e1.a.m(i7, viewG);
                                if (imageView4 != null) {
                                    i7 = Ac.e.ivTrialCash;
                                    ImageView imageView5 = (ImageView) p059e1.a.m(i7, viewG);
                                    if (imageView5 != null) {
                                        i7 = Ac.e.leftView;
                                        if (((ConstraintLayout) p059e1.a.m(i7, viewG)) != null) {
                                            i7 = Ac.e.rewardsList;
                                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewG);
                                            if (recyclerView != null) {
                                                i7 = Ac.e.rightGuideline;
                                                if (((Guideline) p059e1.a.m(i7, viewG)) != null) {
                                                    i7 = Ac.e.rightView;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewG);
                                                    if (constraintLayout2 != null) {
                                                        i7 = Ac.e.tvClaimed;
                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewG);
                                                        if (textView2 != null) {
                                                            i7 = Ac.e.tvCoupon;
                                                            ImageTextView imageTextView = (ImageTextView) p059e1.a.m(i7, viewG);
                                                            if (imageTextView != null) {
                                                                i7 = Ac.e.tvCouponAmount;
                                                                ImageTextView imageTextView2 = (ImageTextView) p059e1.a.m(i7, viewG);
                                                                if (imageTextView2 != null) {
                                                                    i7 = Ac.e.tvPointAmount;
                                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewG);
                                                                    if (textView3 != null) {
                                                                        i7 = Ac.e.tvPointAmount2;
                                                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewG);
                                                                        if (textView4 != null) {
                                                                            i7 = Ac.e.tvPointClaim;
                                                                            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewG);
                                                                            if (ppButton != null) {
                                                                                i7 = Ac.e.tvPoints;
                                                                                ImageTextView imageTextView3 = (ImageTextView) p059e1.a.m(i7, viewG);
                                                                                if (imageTextView3 != null) {
                                                                                    i7 = Ac.e.tvToBeClaimed;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewG);
                                                                                    if (textView5 != null) {
                                                                                        i7 = Ac.e.tvTrialCash;
                                                                                        ImageTextView imageTextView4 = (ImageTextView) p059e1.a.m(i7, viewG);
                                                                                        if (imageTextView4 != null) {
                                                                                            i7 = Ac.e.tvTrialCashAmount;
                                                                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewG);
                                                                                            if (textView6 != null) {
                                                                                                i7 = Ac.e.tvTrialCashToClaimed;
                                                                                                TextView textView7 = (TextView) p059e1.a.m(i7, viewG);
                                                                                                if (textView7 != null) {
                                                                                                    i7 = Ac.e.viewTrialCashToClaimed;
                                                                                                    FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewG);
                                                                                                    if (frameLayout != null) {
                                                                                                        this.f5999g = new E((ConstraintLayout) viewG, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, recyclerView, constraintLayout2, textView2, imageTextView, imageTextView2, textView3, textView4, ppButton, imageTextView3, textView5, imageTextView4, textView6, textView7, frameLayout);
                                                                                                        r0.R1(textView3, "fonts/PalmPayNum-Bold.ttf");
                                                                                                        E e10 = this.f5999g;
                                                                                                        r0.R1(e10 != null ? e10.f643i : null, "fonts/PalmPayNum-Bold.ttf");
                                                                                                        E e11 = this.f5999g;
                                                                                                        r0.R1(e11 != null ? e11.f645o : null, "fonts/PalmPayNum-Bold.ttf");
                                                                                                        E e12 = this.f5999g;
                                                                                                        r0.R1(e12 != null ? ((ImageTextView) e12.f631H).getTextView() : null, "fonts/PalmPayNum-Bold.ttf");
                                                                                                        E e13 = this.f5999g;
                                                                                                        if (e13 != null && (textView = ((ImageTextView) e13.f631H).getTextView()) != null) {
                                                                                                            textView.setIncludeFontPadding(false);
                                                                                                        }
                                                                                                        E e14 = this.f5999g;
                                                                                                        if (e14 != null) {
                                                                                                            ((ImageTextView) e14.f631H).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e15 = this.f5999g;
                                                                                                        if (e15 != null) {
                                                                                                            e15.f642g.setOnClickListener(this);
                                                                                                        }
                                                                                                        E e16 = this.f5999g;
                                                                                                        if (e16 != null) {
                                                                                                            ((ImageTextView) e16.f632L).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e17 = this.f5999g;
                                                                                                        if (e17 != null) {
                                                                                                            ((ImageTextView) e17.f630C).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e18 = this.f5999g;
                                                                                                        if (e18 != null) {
                                                                                                            ((ImageView) e18.f648w).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e19 = this.f5999g;
                                                                                                        if (e19 != null) {
                                                                                                            e19.f638c.setOnClickListener(this);
                                                                                                        }
                                                                                                        E e20 = this.f5999g;
                                                                                                        if (e20 != null) {
                                                                                                            ((ConstraintLayout) e20.t).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e21 = this.f5999g;
                                                                                                        if (e21 != null) {
                                                                                                            ((ImageView) e21.f629B).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e22 = this.f5999g;
                                                                                                        if (e22 != null) {
                                                                                                            ((ImageTextView) e22.f633M).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e23 = this.f5999g;
                                                                                                        if (e23 != null) {
                                                                                                            e23.f645o.setOnClickListener(this);
                                                                                                        }
                                                                                                        E e24 = this.f5999g;
                                                                                                        if (e24 != null) {
                                                                                                            ((FrameLayout) e24.f635X).setOnClickListener(this);
                                                                                                        }
                                                                                                        E e25 = this.f5999g;
                                                                                                        if (e25 != null) {
                                                                                                            e25.f647v.setOnClickListener(this);
                                                                                                        }
                                                                                                        E e26 = this.f5999g;
                                                                                                        if (e26 != null) {
                                                                                                            ((PpButton) e26.f634Q).setOnClickListener(new Je.l(this, 14));
                                                                                                        }
                                                                                                        E e27 = this.f5999g;
                                                                                                        if (e27 != null) {
                                                                                                            this.f6000i = new o(e27.f640e, new Ba.a(this, 10));
                                                                                                            return;
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewG.getResources().getResourceName(i7)));
        }
    }

    public final void m() {
        FrameLayout frameLayout;
        AnimatorSet animatorSet = this.f6001j;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f6001j;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f6001j = null;
        E e10 = this.f5999g;
        if (e10 == null || (frameLayout = (FrameLayout) e10.f635X) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = Ac.e.ivCoupon;
        if (numValueOf == null || numValueOf.intValue() != i7) {
            int i10 = Ac.e.tvCoupon;
            if (numValueOf == null || numValueOf.intValue() != i10) {
                int i11 = Ac.e.tvCouponAmount;
                if (numValueOf == null || numValueOf.intValue() != i11) {
                    int i12 = Ac.e.couponView;
                    if (numValueOf == null || numValueOf.intValue() != i12) {
                        int i13 = Ac.e.ivTrialCash;
                        if (numValueOf == null || numValueOf.intValue() != i13) {
                            int i14 = Ac.e.tvTrialCash;
                            if (numValueOf == null || numValueOf.intValue() != i14) {
                                int i15 = Ac.e.tvTrialCashAmount;
                                if (numValueOf == null || numValueOf.intValue() != i15) {
                                    int i16 = Ac.e.tvTrialCashToClaimed;
                                    if (numValueOf == null || numValueOf.intValue() != i16) {
                                        int i17 = Ac.e.viewTrialCashToClaimed;
                                        if (numValueOf == null || numValueOf.intValue() != i17) {
                                            int i18 = Ac.e.rightView;
                                            if (numValueOf == null || numValueOf.intValue() != i18) {
                                                int i19 = Ac.e.ivPoints;
                                                if (numValueOf == null || numValueOf.intValue() != i19) {
                                                    int i20 = Ac.e.tvPoints;
                                                    if (numValueOf == null || numValueOf.intValue() != i20) {
                                                        int i21 = Ac.e.tvPointAmount;
                                                        if (numValueOf == null || numValueOf.intValue() != i21) {
                                                            return;
                                                        }
                                                    }
                                                }
                                                if (d0.t()) {
                                                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                                                    return;
                                                } else {
                                                    n0.g().k((ClickEvent) G.f("new_reward_qy_click", "reward_ype", "palmpoints"));
                                                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "PointHome");
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (d0.t()) {
                            com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                            return;
                        } else {
                            n0.g().k((ClickEvent) G.f("new_reward_qy_click", "reward_ype", "trialcash"));
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            return;
                        }
                    }
                }
            }
        }
        if (d0.t()) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
        } else {
            n0.g().k((ClickEvent) G.f("new_reward_qy_click", "reward_ype", FirebaseAnalytics.Param.COUPON));
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
        }
    }
}
