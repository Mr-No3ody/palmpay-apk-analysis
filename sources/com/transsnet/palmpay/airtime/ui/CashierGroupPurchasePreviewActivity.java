package com.transsnet.palmpay.airtime.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/CashierGroupPurchasePreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "j9/j", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierGroupPurchasePreviewActivity extends CoreCashierPreviewActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "3";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void y(CalcOfPaymentMethodResultBean bean) {
        String str;
        TextView textView;
        Intrinsics.checkNotNullParameter(bean, "bean");
        super.y(bean);
        long longExtra = getIntent().getLongExtra("business_data", 0L);
        if (longExtra > 0) {
            str = longExtra + "-Person Group Price";
        } else {
            str = "Person Group Price";
        }
        ViewGroup viewGroupT = T();
        if (viewGroupT == null || (textView = (TextView) viewGroupT.findViewById(e.tvAmountKey)) == null) {
            return;
        }
        textView.setText(str);
    }
}
