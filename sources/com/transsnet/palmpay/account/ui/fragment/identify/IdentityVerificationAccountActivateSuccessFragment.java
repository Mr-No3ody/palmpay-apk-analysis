package com.transsnet.palmpay.account.ui.fragment.identify;

import F8.d;
import F8.e;
import I8.k;
import Pa.F;
import Pa.i0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAccountActivateSuccessFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationAccountActivateSuccessFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/k;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdentityVerificationAccountActivateSuccessFragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, k> implements CustomActionCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26155p;

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        u();
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        this.f26154o = arguments != null ? arguments.getString("_number") : null;
        Bundle arguments2 = getArguments();
        this.f26155p = arguments2 != null ? arguments2.getString("extra_path") : null;
        try {
            k kVar = (k) this.f27335j;
            if (kVar != null) {
                TextView textView = kVar.f4132p;
                String strZ = r0.Z(this.f26154o);
                Intrinsics.checkNotNullExpressionValue(strZ, "getFormatPhoneNumberWithoutCountryCodeV2(...)");
                textView.setText(y.k(strZ, " ", "-"));
            }
        } catch (Exception unused) {
            k kVar2 = (k) this.f27335j;
            if (kVar2 != null) {
                kVar2.f4132p.setText(r0.Z(this.f26154o));
            }
        }
        k kVar3 = (k) this.f27335j;
        if (kVar3 != null) {
            final int i7 = 0;
            kVar3.f4123b.setOnClickListener(new View.OnClickListener(this) { // from class: V8.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationAccountActivateSuccessFragment f10117b;

                {
                    this.f10117b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f10117b.u();
                            break;
                        default:
                            IdentityVerificationAccountActivateSuccessFragment identityVerificationAccountActivateSuccessFragment = this.f10117b;
                            Context context = identityVerificationAccountActivateSuccessFragment.getContext();
                            if (context != null) {
                                p220oa.h.x(context, "Copy Successful");
                            }
                            ClipboardUtils.copyText(r0.w0(identityVerificationAccountActivateSuccessFragment.f26154o));
                            break;
                    }
                }
            });
        }
        k kVar4 = (k) this.f27335j;
        if (kVar4 != null) {
            final int i10 = 1;
            kVar4.f4124c.setOnClickListener(new View.OnClickListener(this) { // from class: V8.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationAccountActivateSuccessFragment f10117b;

                {
                    this.f10117b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f10117b.u();
                            break;
                        default:
                            IdentityVerificationAccountActivateSuccessFragment identityVerificationAccountActivateSuccessFragment = this.f10117b;
                            Context context = identityVerificationAccountActivateSuccessFragment.getContext();
                            if (context != null) {
                                p220oa.h.x(context, "Copy Successful");
                            }
                            ClipboardUtils.copyText(r0.w0(identityVerificationAccountActivateSuccessFragment.f26154o));
                            break;
                    }
                }
            });
        }
        if (getActivity() instanceof IdentityVerificationActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
            PpTitleBar ppTitleBar = ((IdentityVerificationActivity) activity).f25873v;
            if (ppTitleBar != null) {
                h.c(ppTitleBar);
            }
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_account_activate_success, viewGroup, false);
        int i7 = d.adView;
        if (((SingleAdView) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = d.bottomView), viewInflate)) != null) {
            Pb.a.bind(viewM);
            i7 = d.btnView;
            PpButton ppButton = (PpButton) a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = d.ivCopy;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = d.ivSuccess;
                    if (((AppCompatImageView) a.m(i7, viewInflate)) != null) {
                        i7 = d.layoutAccountNo;
                        if (((ConstraintLayout) a.m(i7, viewInflate)) != null) {
                            i7 = d.layoutInfo;
                            if (((ConstraintLayout) a.m(i7, viewInflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i7 = d.tv1;
                                TextView textView = (TextView) a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = d.tv2;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = d.tv3;
                                        TextView textView3 = (TextView) a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = d.tvBalanceLimit;
                                            TextView textView4 = (TextView) a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = d.tvDailyLimit;
                                                TextView textView5 = (TextView) a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = d.tvLevel;
                                                    TextView textView6 = (TextView) a.m(i7, viewInflate);
                                                    if (textView6 != null) {
                                                        i7 = d.tvMsg;
                                                        TextView textView7 = (TextView) a.m(i7, viewInflate);
                                                        if (textView7 != null) {
                                                            i7 = d.tvNo;
                                                            TextView textView8 = (TextView) a.m(i7, viewInflate);
                                                            if (textView8 != null) {
                                                                i7 = d.tvSubTitle1;
                                                                TextView textView9 = (TextView) a.m(i7, viewInflate);
                                                                if (textView9 != null) {
                                                                    i7 = d.tvTitle;
                                                                    TextView textView10 = (TextView) a.m(i7, viewInflate);
                                                                    if (textView10 != null) {
                                                                        k kVar = new k(constraintLayout, ppButton, iconicsImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                                                        Intrinsics.checkNotNullExpressionValue(kVar, "inflate(...)");
                                                                        return kVar;
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

    public final void u() {
        Integer num;
        r0.o();
        Activity activityS = i0.S("/main/merchant_payment");
        boolean z3 = false;
        if (activityS != null) {
            ActivityUtils.finishToActivity(activityS, false);
            return;
        }
        i0.l();
        ActivityUtils.finishAllActivitiesExceptNewest();
        if (!(getActivity() instanceof IdentityVerificationActivity)) {
            v(this.f26155p, false);
            return;
        }
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        SignUpRsp signUpRsp = ((IdentityVerificationActivity) activity).f25863b;
        if ("/account/enableAutoSave".equals(signUpRsp != null ? signUpRsp.jumpPath : null)) {
            EnableCashBoxAutoSaveActivity.f25851j.launch(getActivity(), signUpRsp.urlStep2, this.f26154o);
            return;
        }
        String str = signUpRsp != null ? signUpRsp.jumpPath : null;
        if (signUpRsp != null && (num = signUpRsp.rewardAbLinkTo) != null && num.intValue() == 1) {
            z3 = true;
        }
        v(str, z3);
    }

    public final void v(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            ARouter.getInstance().build("/main/home").withFlags(32768).withBoolean("FROM_REGISITER_PAGE", true).withBoolean("JUMP_TO_SIGNUP_SUCCESS_PAGE", z3).navigation(getContext());
        } else {
            F.g(getContext(), str);
        }
    }
}
