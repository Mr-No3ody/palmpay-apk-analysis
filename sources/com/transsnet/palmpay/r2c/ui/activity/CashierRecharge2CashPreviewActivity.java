package com.transsnet.palmpay.r2c.ui.activity;

import Pa.r0;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentFeeInfoBean;
import com.transsnet.palmpay.core.bean.cashier.PaymentFeeDetailBean;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.model.ModelPaymentInfoItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p010a9.b;
import p025ba.e;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/CashierRecharge2CashPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "Wd/z", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierRecharge2CashPreviewActivity extends CoreCashierPreviewActivity {
    public static final /* synthetic */ int Z0 = 0;

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void e0(CalcPaymentFeeInfoBean calcPaymentFeeInfoBean) {
        PaymentFeeDetailBean payeeFeeDetail;
        ImageView itemKeyIconIv;
        TextView itemKeyTv;
        ImageView itemKeyIconIv2;
        Long payeeVat;
        Long payeeFee;
        long jLongValue = ((calcPaymentFeeInfoBean == null || (payeeFee = calcPaymentFeeInfoBean.getPayeeFee()) == null) ? 0L : payeeFee.longValue()) + ((calcPaymentFeeInfoBean == null || (payeeVat = calcPaymentFeeInfoBean.getPayeeVat()) == null) ? 0L : payeeVat.longValue());
        ModelPaymentInfoItem modelPaymentInfoItemS = S();
        if (modelPaymentInfoItemS != null) {
            modelPaymentInfoItemS.setVisibility(jLongValue > 0 ? 0 : 8);
        }
        ModelPaymentInfoItem modelPaymentInfoItemS2 = S();
        if (modelPaymentInfoItemS2 != null) {
            modelPaymentInfoItemS2.g(r0.B(jLongValue, true));
        }
        if (calcPaymentFeeInfoBean == null || (payeeFeeDetail = calcPaymentFeeInfoBean.getPayeeFeeDetail()) == null) {
            return;
        }
        ModelPaymentInfoItem modelPaymentInfoItemS3 = S();
        if (modelPaymentInfoItemS3 != null && (itemKeyIconIv2 = modelPaymentInfoItemS3.getItemKeyIconIv()) != null) {
            h.s(itemKeyIconIv2, true);
        }
        b bVar = new b(28, this, payeeFeeDetail);
        ModelPaymentInfoItem modelPaymentInfoItemS4 = S();
        if (modelPaymentInfoItemS4 != null && (itemKeyTv = modelPaymentInfoItemS4.getItemKeyTv()) != null) {
            itemKeyTv.setOnClickListener(bVar);
        }
        ModelPaymentInfoItem modelPaymentInfoItemS5 = S();
        if (modelPaymentInfoItemS5 == null || (itemKeyIconIv = modelPaymentInfoItemS5.getItemKeyIconIv()) == null) {
            return;
        }
        itemKeyIconIv.setOnClickListener(bVar);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "1";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        super.setupView();
        if (!TextUtils.isEmpty("You will Get") && (textView3 = (TextView) this.f27528z0.getValue()) != null) {
            textView3.setText("You will Get");
        }
        if (!TextUtils.isEmpty("Confirm to Sell") && (textView2 = (TextView) this.f27494H.getValue()) != null) {
            textView2.setText("Confirm to Sell");
        }
        if (TextUtils.isEmpty("Collection Method") || (textView = (TextView) this.f27487A0.getValue()) == null) {
            return;
        }
        textView.setText("Collection Method");
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void y(CalcOfPaymentMethodResultBean bean) {
        TextView textView;
        Intrinsics.checkNotNullParameter(bean, "bean");
        super.y(bean);
        ViewGroup viewGroupT = T();
        if (viewGroupT != null && (textView = (TextView) viewGroupT.findViewById(e.tvAmountKey)) != null) {
            textView.setText("Sell Amount");
        }
        Long l5 = bean.payeeAmount;
        setPayAmount(l5 != null ? l5.longValue() : 0L);
    }
}
