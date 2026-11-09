package com.transsnet.palmpay.teller.ui.activity;

import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/CashierBillPaymentPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "Wd/z", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierBillPaymentPreviewActivity extends CoreCashierPreviewActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "3";
    }
}
