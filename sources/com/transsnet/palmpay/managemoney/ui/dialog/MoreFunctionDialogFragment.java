package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import Pa.i0;
import Pa.n0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.ui.dialog.MoreFunctionDialogFragment;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/MoreFunctionDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoreFunctionDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32297C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MoreFunctionDialogFragment newInstance$default(a aVar, GetBeforeOrderResp.StateInfo stateInfo, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                stateInfo = null;
            }
            return aVar.newInstance(stateInfo);
        }

        @NotNull
        public final MoreFunctionDialogFragment newInstance(@Nullable GetBeforeOrderResp.StateInfo stateInfo) {
            MoreFunctionDialogFragment moreFunctionDialogFragment = new MoreFunctionDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("state_info", stateInfo);
            moreFunctionDialogFragment.setArguments(bundle);
            return moreFunctionDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_more_function_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = DensityUtil.dp2px(180.0f);
        this.f31246p = true;
        this.f31241f = false;
        this.f31236a = DensityUtil.dp2px(8.0f);
        this.f31237b = DensityUtil.dp2px(36.0f);
        this.f31242g = 8388661;
        this.f31243i = w.Animation_slide_in_right_top;
        View viewFindViewById = viewF.findViewById(c.tvState);
        View viewFindViewById2 = viewF.findViewById(c.tvCustomerService);
        View viewFindViewById3 = viewF.findViewById(c.tvFAQ);
        View viewFindViewById4 = viewF.findViewById(c.tvSetting);
        final int i7 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f6787b;

            {
                this.f6787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f6787b;
                switch (i7) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_My_State_Click");
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_select_state_activity");
                        Bundle arguments = moreFunctionDialogFragment.getArguments();
                        Postcard postcardWithParcelable = postcardBuild.withParcelable("state_info", arguments != null ? arguments.getParcelable("state_info") : null);
                        Fragment parentFragment = moreFunctionDialogFragment.getParentFragment();
                        if (parentFragment != null) {
                            parentFragment.startActivityForResult(Pa.F.c(moreFunctionDialogFragment.getContext(), postcardWithParcelable), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                        }
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_Customer_Service_Click");
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_CASHBOX));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f32297C;
                        i0.b0("/cashbox/interest-setting");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_FAQ_Click");
                        com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/faq/faqList?id=4"));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        final int i10 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f6787b;

            {
                this.f6787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f6787b;
                switch (i10) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_My_State_Click");
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_select_state_activity");
                        Bundle arguments = moreFunctionDialogFragment.getArguments();
                        Postcard postcardWithParcelable = postcardBuild.withParcelable("state_info", arguments != null ? arguments.getParcelable("state_info") : null);
                        Fragment parentFragment = moreFunctionDialogFragment.getParentFragment();
                        if (parentFragment != null) {
                            parentFragment.startActivityForResult(Pa.F.c(moreFunctionDialogFragment.getContext(), postcardWithParcelable), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                        }
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_Customer_Service_Click");
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_CASHBOX));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f32297C;
                        i0.b0("/cashbox/interest-setting");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_FAQ_Click");
                        com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/faq/faqList?id=4"));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        final int i11 = 2;
        viewFindViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f6787b;

            {
                this.f6787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f6787b;
                switch (i11) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_My_State_Click");
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_select_state_activity");
                        Bundle arguments = moreFunctionDialogFragment.getArguments();
                        Postcard postcardWithParcelable = postcardBuild.withParcelable("state_info", arguments != null ? arguments.getParcelable("state_info") : null);
                        Fragment parentFragment = moreFunctionDialogFragment.getParentFragment();
                        if (parentFragment != null) {
                            parentFragment.startActivityForResult(Pa.F.c(moreFunctionDialogFragment.getContext(), postcardWithParcelable), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                        }
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_Customer_Service_Click");
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_CASHBOX));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f32297C;
                        i0.b0("/cashbox/interest-setting");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_FAQ_Click");
                        com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/faq/faqList?id=4"));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        final int i12 = 3;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f6787b;

            {
                this.f6787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f6787b;
                switch (i12) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_My_State_Click");
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_select_state_activity");
                        Bundle arguments = moreFunctionDialogFragment.getArguments();
                        Postcard postcardWithParcelable = postcardBuild.withParcelable("state_info", arguments != null ? arguments.getParcelable("state_info") : null);
                        Fragment parentFragment = moreFunctionDialogFragment.getParentFragment();
                        if (parentFragment != null) {
                            parentFragment.startActivityForResult(Pa.F.c(moreFunctionDialogFragment.getContext(), postcardWithParcelable), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                        }
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_Customer_Service_Click");
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_CASHBOX));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f32297C;
                        i0.b0("/cashbox/interest-setting");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f32297C;
                        n0.g().l("PalmPay_CashBoxOld_FAQ_Click");
                        com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/faq/faqList?id=4"));
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        return baseDialog;
    }
}
