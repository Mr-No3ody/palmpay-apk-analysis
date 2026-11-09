package com.transsnet.palmpay.send_money.ui.activity;

import Wf.AbstractC0780y;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.EarlyRefundBean;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CusRightsDto;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodReq;
import com.transsnet.palmpay.core.bean.cashier.FastTransSaveGuardDto;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.interfaces.ITransferByLoanService;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.viewmodel.ModelNewEarlyRefundItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentInfoItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.widget.ModelTotalEarlyRefundItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1794b;
import p220oa.h;
import p237pd.c;
import p270rd.C1960c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/CashierTransferPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "a", "rd/a", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierTransferPreviewActivity extends CoreCashierPreviewActivity {
    public boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f33149a1 = 2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f33150b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f33151c1;
    public String d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ModelNewEarlyRefundItem f33152e1;
    public ModelTotalEarlyRefundItem f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f33153g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public LinearLayout f33154h1;

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

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void c0() {
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
        if (cashierPaymentMethodBean == null || 29 != cashierPaymentMethodBean.senderAccountType || !Intrinsics.c(this.f27455e, "03")) {
            super.c0();
            return;
        }
        if (!cashierPaymentMethodBean.enable) {
            return;
        }
        Object objNavigation = ARouter.getInstance().build("/credit_score/transfer_by_loan_service").navigation();
        ITransferByLoanService iTransferByLoanService = objNavigation instanceof ITransferByLoanService ? (ITransferByLoanService) objNavigation : null;
        if (iTransferByLoanService == null || !iTransferByLoanService.isTrialOpen()) {
            if (iTransferByLoanService == null) {
                setResult(0, new Intent().putExtra("cancel_reason", "close_cashier"));
                finish();
            } else {
                if (this.Z0) {
                    return;
                }
                this.Z0 = true;
                AbstractC0780y.m(V.f(this), null, null, new C1960c(this, iTransferByLoanService, null), 3);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void h0() {
        if (this.f33150b1) {
            return;
        }
        super.h0();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void n(DefaultCalcOfPaymentMethodReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(req, "req");
        req.isQuickPay = this.f33150b1;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void o(PayByOrderReq params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        params.buyEarlyRefundByTime = this.f33153g1 ? 1 : 0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1002 && i10 == -1 && intent != null) {
            CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
            if (cashierPaymentMethodBean != null) {
                cashierPaymentMethodBean.needSign = true;
            }
            k0();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void p(PreviewCalcPayInfoReq params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f33152e1 != null) {
            params.buyEarlyRefundByTime = this.f33153g1 ? 1 : 0;
        }
    }

    public final LinearLayout q0() {
        ViewStub viewStub;
        if (this.f33154h1 == null && (viewStub = (ViewStub) this.f27519q0.getValue()) != null) {
            if (viewStub.getParent() == null) {
                return this.f33154h1;
            }
            viewStub.setLayoutResource(c.sm_layout_extra);
            View viewInflate = viewStub.inflate();
            Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f33154h1 = (LinearLayout) viewInflate;
        }
        return this.f33154h1;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        String str = this.f33151c1;
        if (str != null) {
            return str;
        }
        int i7 = this.f33149a1;
        if (i7 != 2) {
            if (i7 == 3) {
                return AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE;
            }
            if (i7 == 5) {
                return "3";
            }
            if (i7 == 9) {
                return "25";
            }
        }
        return "1";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        super.setupView();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void y(CalcOfPaymentMethodResultBean bean) {
        FastTransSaveGuardDto fastTransSaveguardDto;
        LinearLayout linearLayoutQ0;
        boolean z3;
        LinearLayout linearLayoutQ1;
        Intrinsics.checkNotNullParameter(bean, "bean");
        super.y(bean);
        ModelPaymentInfoItem modelPaymentInfoItemR = R();
        if (modelPaymentInfoItemR != null) {
            h.s(modelPaymentInfoItemR, Intrinsics.c(bean.earlyRefundEnable, Boolean.TRUE));
        }
        if (bean.earlyRefund == null || !Intrinsics.c(bean.earlyRefundEnable, Boolean.FALSE)) {
            ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f33152e1;
            if (modelNewEarlyRefundItem != null) {
                h.c(modelNewEarlyRefundItem);
            }
        } else {
            EarlyRefundBean earlyRefundBean = bean.earlyRefund;
            if (earlyRefundBean != null) {
                z3 = earlyRefundBean.selected == 1;
            }
            this.f33153g1 = z3;
            if (this.f33152e1 == null && (linearLayoutQ1 = q0()) != null) {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem2 = new ModelNewEarlyRefundItem(this);
                this.f33152e1 = modelNewEarlyRefundItem2;
                linearLayoutQ1.addView(modelNewEarlyRefundItem2);
                ModelNewEarlyRefundItem modelNewEarlyRefundItem3 = this.f33152e1;
                if (modelNewEarlyRefundItem3 != null) {
                    h.j(modelNewEarlyRefundItem3, Integer.valueOf(CommonViewExtKt.getDp(12)), Integer.valueOf(CommonViewExtKt.getDp(16)), Integer.valueOf(CommonViewExtKt.getDp(16)), 0);
                }
                ModelNewEarlyRefundItem modelNewEarlyRefundItem4 = this.f33152e1;
                if (modelNewEarlyRefundItem4 != null) {
                    modelNewEarlyRefundItem4.setOnCheckedChangeListener(new C1794b(this, 21));
                }
            }
            ModelNewEarlyRefundItem modelNewEarlyRefundItem5 = this.f33152e1;
            if (modelNewEarlyRefundItem5 != null) {
                modelNewEarlyRefundItem5.setData(bean.earlyRefund);
            }
            ModelNewEarlyRefundItem modelNewEarlyRefundItem6 = this.f33152e1;
            if (modelNewEarlyRefundItem6 != null) {
                h.C(modelNewEarlyRefundItem6);
            }
        }
        CusRightsDto cusRightsDto = bean.cusRightsDto;
        if (cusRightsDto == null || (fastTransSaveguardDto = cusRightsDto.getFastTransSaveguardDto()) == null) {
            ModelTotalEarlyRefundItem modelTotalEarlyRefundItem = this.f1;
            if (modelTotalEarlyRefundItem != null) {
                h.c(modelTotalEarlyRefundItem);
            }
        } else if (Intrinsics.c(fastTransSaveguardDto.getSaveGuardFlag(), Boolean.TRUE)) {
            if (this.f1 == null && (linearLayoutQ0 = q0()) != null) {
                ModelTotalEarlyRefundItem modelTotalEarlyRefundItem2 = new ModelTotalEarlyRefundItem(this);
                this.f1 = modelTotalEarlyRefundItem2;
                linearLayoutQ0.addView(modelTotalEarlyRefundItem2);
                ModelTotalEarlyRefundItem modelTotalEarlyRefundItem3 = this.f1;
                if (modelTotalEarlyRefundItem3 != null) {
                    h.j(modelTotalEarlyRefundItem3, Integer.valueOf(CommonViewExtKt.getDp(12)), Integer.valueOf(CommonViewExtKt.getDp(16)), Integer.valueOf(CommonViewExtKt.getDp(16)), 0);
                }
            }
            ModelTotalEarlyRefundItem modelTotalEarlyRefundItem4 = this.f1;
            if (modelTotalEarlyRefundItem4 != null) {
                modelTotalEarlyRefundItem4.setData(fastTransSaveguardDto);
            }
            ModelTotalEarlyRefundItem modelTotalEarlyRefundItem5 = this.f1;
            if (modelTotalEarlyRefundItem5 != null) {
                h.C(modelTotalEarlyRefundItem5);
            }
        } else {
            ModelTotalEarlyRefundItem modelTotalEarlyRefundItem6 = this.f1;
            if (modelTotalEarlyRefundItem6 != null) {
                h.c(modelTotalEarlyRefundItem6);
            }
        }
        if (Intrinsics.c(bean.isQuickPay, Boolean.TRUE)) {
            k0();
        } else {
            super.h0();
        }
    }
}
