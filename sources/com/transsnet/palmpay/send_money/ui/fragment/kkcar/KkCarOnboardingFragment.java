package com.transsnet.palmpay.send_money.ui.fragment.kkcar;

import Ae.j;
import C0.G;
import C9.C0144k;
import Dd.c;
import Dd.d;
import Kd.C0382i;
import L6.b;
import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarOnboardingFragment;
import com.transsnet.palmpay.send_money.viewmodel.KkCarHostViewModel;
import com.transsnet.palmpay.send_money.viewmodel.KkCarOnboardingViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p223od.t;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarOnboardingFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/KkCarOnboardingViewModel;", "Lod/t;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarOnboardingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarOnboardingFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarOnboardingFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,256:1\n115#2,8:257\n145#2:265\n115#2,8:266\n145#2:274\n1#3:275\n255#4:276\n*S KotlinDebug\n*F\n+ 1 KkCarOnboardingFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarOnboardingFragment\n*L\n119#1:257,8\n119#1:265\n126#1:266,8\n126#1:274\n240#1:276\n*E\n"})
public final class KkCarOnboardingFragment extends BaseMvvmVBFragment<KkCarOnboardingViewModel, t> {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f33728p = C2131j.b(new j(this, 11));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        l lVar = ((KkCarHostViewModel) this.f33728p.getValue()).f33969f;
        if (lVar != null) {
            lVar.e(viewLifecycleOwner, new C0144k(new c(this, 0), 14));
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        KkCarOnboardingViewModel kkCarOnboardingViewModel = (KkCarOnboardingViewModel) this.f27333i;
        l lVar2 = kkCarOnboardingViewModel != null ? kkCarOnboardingViewModel.f33970e : null;
        if (lVar2 != null) {
            lVar2.e(viewLifecycleOwner2, new C0144k(new c(this, 1), 14));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ImageView backImageView;
        super.o();
        t tVar = (t) this.f27335j;
        if (tVar != null && (backImageView = tVar.f40507e.getBackImageView()) != null) {
            final int i7 = 0;
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Dd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarOnboardingFragment f1841b;

                {
                    this.f1841b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KkCarOnboardingFragment kkCarOnboardingFragment = this.f1841b;
                    switch (i7) {
                        case 0:
                            int i10 = KkCarOnboardingFragment.t;
                            kkCarOnboardingFragment.requireActivity().onBackPressed();
                            break;
                        default:
                            int i11 = KkCarOnboardingFragment.t;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("keke_auth_confirm_click", "app", "native"));
                                kkCarOnboardingFragment.getClass();
                                Postcard postcardWithString = ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.FLOW_CODE_KK_CAR_AUTH);
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Intrinsics.e(postcardWithString);
                                r0.x(aRouter, kkCarOnboardingFragment, postcardWithString, 1101);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        t tVar2 = (t) this.f27335j;
        if (tVar2 != null) {
            final int i10 = 1;
            tVar2.f40504b.setOnClickListener(new View.OnClickListener(this) { // from class: Dd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarOnboardingFragment f1841b;

                {
                    this.f1841b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KkCarOnboardingFragment kkCarOnboardingFragment = this.f1841b;
                    switch (i10) {
                        case 0:
                            int i11 = KkCarOnboardingFragment.t;
                            kkCarOnboardingFragment.requireActivity().onBackPressed();
                            break;
                        default:
                            int i12 = KkCarOnboardingFragment.t;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("keke_auth_confirm_click", "app", "native"));
                                kkCarOnboardingFragment.getClass();
                                Postcard postcardWithString = ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.FLOW_CODE_KK_CAR_AUTH);
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Intrinsics.e(postcardWithString);
                                r0.x(aRouter, kkCarOnboardingFragment, postcardWithString, 1101);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        t tVar3 = (t) this.f27335j;
        if (tVar3 == null) {
            return 0;
        }
        TextView textView = tVar3.f40508f;
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(new SpanUtils().append(getString(h.sm_kk_auth_agreement_prefix)).appendSpace(SizeUtils.dp2px(4.0f)).append(getString(h.sm_kk_auth_agreement_link)).setForegroundColor(iColorInt).setClickSpan(new d(iColorInt, 0)).create());
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String stringExtra;
        KkCarOnboardingViewModel kkCarOnboardingViewModel;
        super.onActivityResult(i7, i10, intent);
        if (i7 != 1101 || i10 != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_data")) == null || (kkCarOnboardingViewModel = (KkCarOnboardingViewModel) this.f27333i) == null) {
            return;
        }
        f.s(kkCarOnboardingViewModel, new C0382i(stringExtra, kkCarOnboardingViewModel, null), kkCarOnboardingViewModel.f33970e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_kk_fragment_onboarding, viewGroup, false);
        int i7 = e.bodyCl;
        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.btnKkOnboardingGetStarted;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = e.clKkOnboardingFeatureCashless;
                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.clKkOnboardingFeatureFastRide;
                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.clKkOnboardingFeatureSecure;
                        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = e.clKkOnboardingFeatureZeroFee;
                            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.ivKkOnboardingFeatureCashless;
                                if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = e.ivKkOnboardingFeatureFastRide;
                                    if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = e.ivKkOnboardingFeatureSecure;
                                        if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                            i7 = e.ivKkOnboardingFeatureZeroFee;
                                            if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                i7 = e.llKkOnboardingAgreement;
                                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = e.llKkOnboardingPromotion;
                                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                    if (linearLayout != null) {
                                                        i7 = e.spaceKkOnboardingOverlap;
                                                        if (((Space) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = e.spaceView), viewInflate)) != null) {
                                                            i7 = e.titleBarKkOnboarding;
                                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                            if (ppTitleBar != null) {
                                                                i7 = e.tvKkOnboardingAgreement;
                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView != null) {
                                                                    i7 = e.tvKkOnboardingPromotion;
                                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i7 = e.tvKkOnboardingRideWith;
                                                                        if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                            i7 = e.tvKkOnboardingWhyTitle;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i7 = e.vKkOnboardingHeaderBg;
                                                                                if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                    i7 = e.vKkOnboardingHeaderIv1;
                                                                                    if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                        i7 = e.vKkOnboardingHeaderIv2;
                                                                                        if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                            t tVar = new t((ConstraintLayout) viewInflate, ppButton, linearLayout, viewM, ppTitleBar, textView, textView2, textView3);
                                                                                            Intrinsics.checkNotNullExpressionValue(tVar, "inflate(...)");
                                                                                            return tVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
