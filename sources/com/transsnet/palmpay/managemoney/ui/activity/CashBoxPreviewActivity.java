package com.transsnet.palmpay.managemoney.ui.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_order_preview_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "a", "Wd/z", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxPreviewActivity extends CoreCashierPreviewActivity {

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
    public final void h0() {
        if (Intrinsics.c(this.f27455e, TransType.TRANS_TYPE_CASH_BOX_DEPOSIT)) {
            super.h0();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void p0(CalcOfPaymentMethodResultBean bean, boolean z3) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        super.p0(bean, z3);
        if (Intrinsics.c(this.f27455e, TransType.TRANS_TYPE_CASH_BOX_DEPOSIT)) {
            return;
        }
        showLoadingDialog(true);
        c0();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "1";
    }
}
