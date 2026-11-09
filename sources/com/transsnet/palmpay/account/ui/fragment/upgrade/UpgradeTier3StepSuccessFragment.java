package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Bc.q;
import C0.G;
import F8.d;
import F8.e;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepSuccessFragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepSuccessFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeTier3StepSuccessFragment extends BaseFragment implements IAutoTrack {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f26304j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f26305i;

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

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "t3_upgrade_result_page_exposure";
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean2;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean3;
        q qVar;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean4;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean5;
        q qVar2;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean6;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean7;
        q qVar3;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean8;
        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean9;
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT = t();
        String str = null;
        Tier3ApplyStatusRsp tier3ApplyStatusRsp = palmPayLevelUpTier3V2ActivityT != null ? palmPayLevelUpTier3V2ActivityT.f25923i : null;
        if (!TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean9 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean9.titleMsg) && (qVar3 = this.f26305i) != null) {
            ((TextView) qVar3.f823o).setText((tier3ApplyStatusRsp == null || (resultBannerBean8 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean8.titleMsg);
        }
        if (!TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean7 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean7.subMsg) && (qVar2 = this.f26305i) != null) {
            qVar2.f822j.setText((tier3ApplyStatusRsp == null || (resultBannerBean6 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean6.subMsg);
        }
        q qVar4 = this.f26305i;
        if (qVar4 != null) {
            h.C((SingleAdView) qVar4.f818e);
        }
        if (!TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean5 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean5.buttonText) && (qVar = this.f26305i) != null) {
            ((PpButton) qVar.f821i).setText((tier3ApplyStatusRsp == null || (resultBannerBean4 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean4.buttonText);
        }
        if (TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean3 = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean3.transactionLimitUrl)) {
            return 0;
        }
        q qVar5 = this.f26305i;
        if (i0.V(qVar5 != null ? (ConstraintLayout) qVar5.f817d : null)) {
            q qVar6 = this.f26305i;
            ImageView imageView = qVar6 != null ? (ImageView) qVar6.f819f : null;
            if (tier3ApplyStatusRsp != null && (resultBannerBean2 = tier3ApplyStatusRsp.bannerInfo) != null) {
                str = resultBannerBean2.transactionLimitDarkUrl;
            }
            r0.l1(str, imageView);
            return 0;
        }
        q qVar7 = this.f26305i;
        ImageView imageView2 = qVar7 != null ? (ImageView) qVar7.f819f : null;
        if (tier3ApplyStatusRsp != null && (resultBannerBean = tier3ApplyStatusRsp.bannerInfo) != null) {
            str = resultBannerBean.transactionLimitUrl;
        }
        r0.l1(str, imageView2);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_palmpay_level_up_tier3_step_success, viewGroup, false);
        int i7 = d.adView;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = d.cornerAd;
            SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView2 != null) {
                i7 = d.ivBanner;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = d.ivCongratulations;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView2 != null) {
                        i7 = d.tvComplete;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = d.tvOk;
                            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                            if (ppButton != null) {
                                i7 = d.tvSubtitle;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = d.tvTitle;
                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView3 != null) {
                                        q qVar = new q((ConstraintLayout) viewInflate, singleAdView, singleAdView2, imageView, imageView2, textView, ppButton, textView2, textView3);
                                        this.f26305i = qVar;
                                        return qVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        PpTitleBar titleBar;
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT = t();
        if (palmPayLevelUpTier3V2ActivityT != null && (titleBar = palmPayLevelUpTier3V2ActivityT.getTitleBar()) != null) {
            h.c(titleBar);
        }
        q qVar = this.f26305i;
        r0.l1("https://static.chuanyinet.com/images/icon-Congratulations4b76201e-56b3-4a.png", qVar != null ? (ImageView) qVar.f820g : null);
        q qVar2 = this.f26305i;
        if (qVar2 != null) {
            final int i7 = 0;
            qVar2.f816c.setOnClickListener(new View.OnClickListener(this) { // from class: b9.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepSuccessFragment f18829b;

                {
                    this.f18829b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean;
                    UpgradeTier3StepSuccessFragment upgradeTier3StepSuccessFragment = this.f18829b;
                    switch (i7) {
                        case 0:
                            int i10 = UpgradeTier3StepSuccessFragment.f26304j;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("t3_upgrade_result_button_click", "button_name", "Complete"));
                                PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(upgradeTier3StepSuccessFragment.getContext());
                                break;
                            }
                            break;
                        default:
                            int i11 = UpgradeTier3StepSuccessFragment.f26304j;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("t3_upgrade_result_button_click", "button_name", "Confirm"));
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT2 = upgradeTier3StepSuccessFragment.t();
                                Tier3ApplyStatusRsp tier3ApplyStatusRsp = palmPayLevelUpTier3V2ActivityT2 != null ? palmPayLevelUpTier3V2ActivityT2.f25923i : null;
                                if (!TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean.jumpPath)) {
                                    if (tier3ApplyStatusRsp != null) {
                                        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean2 = tier3ApplyStatusRsp.bannerInfo;
                                        F.e(resultBannerBean2 != null ? resultBannerBean2.jumpPath : null);
                                    }
                                    PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT3 = upgradeTier3StepSuccessFragment.t();
                                    if (palmPayLevelUpTier3V2ActivityT3 != null) {
                                        palmPayLevelUpTier3V2ActivityT3.finish();
                                    }
                                } else {
                                    PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(upgradeTier3StepSuccessFragment.getContext());
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        q qVar3 = this.f26305i;
        if (qVar3 != null) {
            final int i10 = 1;
            ((PpButton) qVar3.f821i).setOnClickListener(new View.OnClickListener(this) { // from class: b9.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepSuccessFragment f18829b;

                {
                    this.f18829b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean;
                    UpgradeTier3StepSuccessFragment upgradeTier3StepSuccessFragment = this.f18829b;
                    switch (i10) {
                        case 0:
                            int i11 = UpgradeTier3StepSuccessFragment.f26304j;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("t3_upgrade_result_button_click", "button_name", "Complete"));
                                PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(upgradeTier3StepSuccessFragment.getContext());
                                break;
                            }
                            break;
                        default:
                            int i12 = UpgradeTier3StepSuccessFragment.f26304j;
                            if (!r0.U0()) {
                                n0.g().k((ClickEvent) G.f("t3_upgrade_result_button_click", "button_name", "Confirm"));
                                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT2 = upgradeTier3StepSuccessFragment.t();
                                Tier3ApplyStatusRsp tier3ApplyStatusRsp = palmPayLevelUpTier3V2ActivityT2 != null ? palmPayLevelUpTier3V2ActivityT2.f25923i : null;
                                if (!TextUtils.isEmpty((tier3ApplyStatusRsp == null || (resultBannerBean = tier3ApplyStatusRsp.bannerInfo) == null) ? null : resultBannerBean.jumpPath)) {
                                    if (tier3ApplyStatusRsp != null) {
                                        Tier3ApplyStatusRsp.ResultBannerBean resultBannerBean2 = tier3ApplyStatusRsp.bannerInfo;
                                        F.e(resultBannerBean2 != null ? resultBannerBean2.jumpPath : null);
                                    }
                                    PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityT3 = upgradeTier3StepSuccessFragment.t();
                                    if (palmPayLevelUpTier3V2ActivityT3 != null) {
                                        palmPayLevelUpTier3V2ActivityT3.finish();
                                    }
                                } else {
                                    PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(upgradeTier3StepSuccessFragment.getContext());
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        q qVar4 = this.f26305i;
        b.c(qVar4 != null ? (SingleAdView) qVar4.f815b : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f26305i = null;
        super.onDestroyView();
    }

    public final PalmPayLevelUpTier3V2Activity t() {
        E e10 = this.f27319c;
        if (!(e10 instanceof PalmPayLevelUpTier3V2Activity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
        return (PalmPayLevelUpTier3V2Activity) e10;
    }
}
