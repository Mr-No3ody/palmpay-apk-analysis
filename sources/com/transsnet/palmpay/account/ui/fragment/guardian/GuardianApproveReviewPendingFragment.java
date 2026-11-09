package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.i;
import F8.e;
import L6.b;
import Pa.C0525w;
import R8.d;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveReviewPendingFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuardianApproveReviewPendingFragment extends BaseAddGuardianFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f26149p;

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        super.k();
        i iVar = this.f26149p;
        y(iVar != null ? (PpTitleBar) iVar.f725c : null);
        i iVar2 = this.f26149p;
        if (iVar2 != null) {
            h.d((PpTitleBar) iVar2.f725c);
        }
        GuardianApproveActivity guardianApproveActivityW = w();
        if (guardianApproveActivityW != null) {
            guardianApproveActivityW.n();
        }
        C0525w c0525wF = C0525w.f();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_data") : null;
        c0525wF.getClass();
        SubmitGuardianRsp submitGuardianRsp = (SubmitGuardianRsp) C0525w.d(string, SubmitGuardianRsp.class);
        if (submitGuardianRsp == null) {
            i iVar3 = this.f26149p;
            if (iVar3 != null) {
                ((TextView) iVar3.f728f).setText(F8.h.ac_guardian_review_pending_message);
            }
        } else {
            i iVar4 = this.f26149p;
            if (iVar4 != null) {
                TextView textView = (TextView) iVar4.f728f;
                SpanUtils spanUtils = new SpanUtils();
                String str = submitGuardianRsp.statusDescribe;
                if (str == null) {
                    str = "";
                }
                SpanUtils spanUtilsAppend = spanUtils.append(str);
                String str2 = submitGuardianRsp.highlightStatusDescribe;
                textView.setText(spanUtilsAppend.append(str2 != null ? str2 : "").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext())).create());
            }
        }
        if (TextUtils.isEmpty(submitGuardianRsp != null ? submitGuardianRsp.title : null)) {
            i iVar5 = this.f26149p;
            if (iVar5 != null) {
                ((TextView) iVar5.f729g).setText(F8.h.ac_guardian_review_pending_title);
            }
        } else {
            i iVar6 = this.f26149p;
            if (iVar6 != null) {
                ((TextView) iVar6.f729g).setText(submitGuardianRsp.title);
            }
        }
        i iVar7 = this.f26149p;
        if (iVar7 != null) {
            ((PpButton) iVar7.f730i).setOnClickListener(new d(this, 12));
        }
        i iVar8 = this.f26149p;
        org.chromium.support_lib_boundary.util.b.c(iVar8 != null ? (SingleAdView) iVar8.f726d : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_guardian_approve_review_pending, viewGroup, false);
        int i7 = F8.d.bottomAd;
        SingleAdView singleAdView = (SingleAdView) a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = F8.d.bottomViewStub;
            ViewStub viewStub = (ViewStub) a.m(i7, viewInflate);
            if (viewStub != null) {
                i7 = F8.d.btnConfirm;
                PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = F8.d.ivIcon;
                    if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                        i7 = F8.d.titleBar;
                        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                        if (ppTitleBar != null) {
                            i7 = F8.d.tvMessage;
                            TextView textView = (TextView) a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = F8.d.tvTitle;
                                TextView textView2 = (TextView) a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i iVar = new i((ConstraintLayout) viewInflate, (FrameLayout) singleAdView, (View) viewStub, (FrameLayout) ppButton, ppTitleBar, textView, textView2, 11);
                                    this.f26149p = iVar;
                                    return iVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        i iVar = this.f26149p;
        if (iVar != null) {
            return (ViewStub) iVar.f727e;
        }
        return null;
    }
}
