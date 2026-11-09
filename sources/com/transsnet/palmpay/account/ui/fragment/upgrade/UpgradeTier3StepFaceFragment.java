package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Ae.q;
import Bc.l;
import C0.AbstractC0130w;
import C0.G;
import C0.U;
import F8.e;
import F8.h;
import Pa.g0;
import Pa.n0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepFaceFragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.r;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p038ca.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepFaceFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeTier3StepFaceFragment extends BaseFragment implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26297p = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f26298i = new d(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0130w f26299j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I8.d f26300o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final UpgradeTier3StepFaceFragment newInstance() {
            UpgradeTier3StepFaceFragment upgradeTier3StepFaceFragment = new UpgradeTier3StepFaceFragment();
            upgradeTier3StepFaceFragment.setArguments(new Bundle());
            return upgradeTier3StepFaceFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity;
        PpTitleBar titleBar;
        I8.d dVar = this.f26300o;
        if (dVar != null) {
            final int i7 = 0;
            ((PpButton) dVar.f4056c.f755c).setOnClickListener(new View.OnClickListener(this) { // from class: b9.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UpgradeTier3StepFaceFragment f18821b;

                {
                    this.f18821b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity2;
                    switch (i7) {
                        case 0:
                            int i10 = UpgradeTier3StepFaceFragment.f26297p;
                            UpgradeTier3StepFaceFragment upgradeTier3StepFaceFragment = this.f18821b;
                            n0.g().l("KYC_FaceVerify_Click");
                            g0.f(g0.f7080h.getInstance(), upgradeTier3StepFaceFragment, 18, upgradeTier3StepFaceFragment, upgradeTier3StepFaceFragment.f26298i, G.A(), true);
                            break;
                        default:
                            int i11 = UpgradeTier3StepFaceFragment.f26297p;
                            E e10 = this.f18821b.f27319c;
                            if (e10 instanceof PalmPayLevelUpTier3V2Activity) {
                                Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
                                palmPayLevelUpTier3V2Activity2 = (PalmPayLevelUpTier3V2Activity) e10;
                            } else {
                                palmPayLevelUpTier3V2Activity2 = null;
                            }
                            if (palmPayLevelUpTier3V2Activity2 != null) {
                                palmPayLevelUpTier3V2Activity2.onBackPressed();
                            }
                            break;
                    }
                }
            });
        }
        E e10 = this.f27319c;
        if (e10 instanceof PalmPayLevelUpTier3V2Activity) {
            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
            palmPayLevelUpTier3V2Activity = (PalmPayLevelUpTier3V2Activity) e10;
        } else {
            palmPayLevelUpTier3V2Activity = null;
        }
        if (palmPayLevelUpTier3V2Activity == null || (titleBar = palmPayLevelUpTier3V2Activity.getTitleBar()) == null) {
            return 0;
        }
        final int i10 = 1;
        titleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: b9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeTier3StepFaceFragment f18821b;

            {
                this.f18821b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity2;
                switch (i10) {
                    case 0:
                        int i11 = UpgradeTier3StepFaceFragment.f26297p;
                        UpgradeTier3StepFaceFragment upgradeTier3StepFaceFragment = this.f18821b;
                        n0.g().l("KYC_FaceVerify_Click");
                        g0.f(g0.f7080h.getInstance(), upgradeTier3StepFaceFragment, 18, upgradeTier3StepFaceFragment, upgradeTier3StepFaceFragment.f26298i, G.A(), true);
                        break;
                    default:
                        int i12 = UpgradeTier3StepFaceFragment.f26297p;
                        E e11 = this.f18821b.f27319c;
                        if (e11 instanceof PalmPayLevelUpTier3V2Activity) {
                            Intrinsics.f(e11, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
                            palmPayLevelUpTier3V2Activity2 = (PalmPayLevelUpTier3V2Activity) e11;
                        } else {
                            palmPayLevelUpTier3V2Activity2 = null;
                        }
                        if (palmPayLevelUpTier3V2Activity2 != null) {
                            palmPayLevelUpTier3V2Activity2.onBackPressed();
                        }
                        break;
                }
            }
        });
        titleBar.setRightText("");
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_palmpay_level_up_tier3_step_face, viewGroup, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) p059e1.a.m(i7, viewInflate)) == null || (viewM = p059e1.a.m((i7 = F8.d.layoutScanFaceBtn), viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        I8.d dVar = new I8.d((LinearLayout) viewInflate, l.a(viewM), 1);
        this.f26300o = dVar;
        return dVar;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26299j = NavHostFragment.f17502e.findNavController(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        g0.f7080h.getInstance().c(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        I8.d dVar = this.f26300o;
        if (dVar != null) {
            ((PpButton) dVar.f4056c.f755c).b(false);
        }
        if ("VL000073".equals(str)) {
            Context context = getContext();
            if (context != null) {
                n.O(context, 0, Integer.valueOf(k.core_opps), null, null, null, null, str2, Integer.valueOf(h.ac_rescan_face), null, new q(str, str2, 1), null, null, null, null, false, 0, 8387197);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            E activity = getActivity();
            if ((activity != null ? p220oa.h.v(activity, str3, null, null, 14) : null) != null) {
                return;
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            n.O(context2, 0, null, "Face Authentication Failed", Integer.valueOf(r.cv_pay_fail), null, null, "The face authentication and the ID information do not match. Please check the ID information and re-scan face.", Integer.valueOf(h.ac_rescan_face), null, new q(str, str2, 2), null, null, null, null, false, 0, 8387187);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        l lVar;
        PpButton ppButton;
        I8.d dVar = this.f26300o;
        if (dVar == null || (lVar = dVar.f4056c) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity;
        Intrinsics.checkNotNullParameter(data, "data");
        I8.d dVar = this.f26300o;
        if (dVar != null) {
            ((PpButton) dVar.f4056c.f755c).b(false);
        }
        if (TextUtils.isEmpty(data.token)) {
            Context context = getContext();
            if (context != null) {
                p220oa.h.t(context, "Empty token\nPlease try again.");
                return;
            }
            return;
        }
        U uBuildSlideNavOptions = PalmPayLevelUpTier3V2Activity.f25915o.buildSlideNavOptions(Integer.valueOf(F8.d.fragment_tier3_step_face), true);
        E e10 = this.f27319c;
        if (e10 instanceof PalmPayLevelUpTier3V2Activity) {
            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
            palmPayLevelUpTier3V2Activity = (PalmPayLevelUpTier3V2Activity) e10;
        } else {
            palmPayLevelUpTier3V2Activity = null;
        }
        if (TextUtils.isEmpty(palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25918c : null)) {
            AbstractC0130w abstractC0130w = this.f26299j;
            if (abstractC0130w != null) {
                abstractC0130w.h(F8.d.fragment_tier3_step_bill_upload, null, uBuildSlideNavOptions);
                return;
            }
            return;
        }
        AbstractC0130w abstractC0130w2 = this.f26299j;
        if (abstractC0130w2 != null) {
            abstractC0130w2.h(F8.d.fragment_tier3_step_bills, null, uBuildSlideNavOptions);
        }
    }
}
