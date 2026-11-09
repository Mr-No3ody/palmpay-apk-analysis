package G9;

import Pa.i0;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FundDetailFragment f3170a;

    public f(FundDetailFragment fundDetailFragment) {
        this.f3170a = fundDetailFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        BillProcessDetail billProcessDetail;
        TextView itemValueTv;
        TextView orderStatusTv;
        Intrinsics.checkNotNullParameter(v3, "v");
        FundDetailFragment fundDetailFragment = this.f3170a;
        E activity = fundDetailFragment.getActivity();
        OrderInfoForCustomerService orderInfoForCustomerService = null;
        str = null;
        String str = null;
        if (fundDetailFragment.f27012H != null) {
            OrderInfoForCustomerService orderInfoForCustomerService2 = new OrderInfoForCustomerService();
            orderInfoForCustomerService2.paymentType = fundDetailFragment.getString(p025ba.k.core_fund);
            BillDetail billDetail = fundDetailFragment.f27012H;
            orderInfoForCustomerService2.time = billDetail != null ? billDetail.createTime : 0L;
            orderInfoForCustomerService2.amount = billDetail != null ? billDetail.businessAmount : 0L;
            orderInfoForCustomerService2.fee = billDetail != null ? billDetail.payFee : 0L;
            orderInfoForCustomerService2.orderNumber = billDetail != null ? billDetail.orderNo : null;
            OrderResultHeaderModel orderResultHeaderModelU = fundDetailFragment.u();
            orderInfoForCustomerService2.orderStatus = String.valueOf((orderResultHeaderModelU == null || (orderStatusTv = orderResultHeaderModelU.getOrderStatusTv()) == null) ? null : orderStatusTv.getText());
            BillDetail billDetail2 = fundDetailFragment.f27012H;
            orderInfoForCustomerService2.vat = billDetail2 != null ? billDetail2.vat : 0L;
            orderInfoForCustomerService2.pointsUsed = billDetail2 != null ? billDetail2.redeemPoint : 0L;
            orderInfoForCustomerService2.pointsEarned = billDetail2 != null ? billDetail2.returnPoint : 0L;
            orderInfoForCustomerService2.transType = billDetail2 != null ? billDetail2.transType : null;
            OrderResultItemModel orderResultItemModel = fundDetailFragment.f27015Q;
            orderInfoForCustomerService2.paymentMethod = String.valueOf((orderResultItemModel == null || (itemValueTv = orderResultItemModel.getItemValueTv()) == null) ? null : itemValueTv.getText());
            BillDetail billDetail3 = fundDetailFragment.f27012H;
            if ((billDetail3 != null ? billDetail3.orderStatusInfo : null) != null) {
                if (billDetail3 != null && (billProcessDetail = billDetail3.orderStatusInfo) != null) {
                    str = billProcessDetail.faqLink;
                }
                orderInfoForCustomerService2.faqUrl = str;
            }
            orderInfoForCustomerService = orderInfoForCustomerService2;
        }
        i0.M(activity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        String string;
        TextView itemValueTv;
        Intrinsics.checkNotNullParameter(v3, "v");
        FundDetailFragment fundDetailFragment = this.f3170a;
        BillDetail billDetail = fundDetailFragment.f27012H;
        if (billDetail != null) {
            int i7 = billDetail.payeeAccountType;
            E e10 = fundDetailFragment.f27319c;
            if (i7 == 3) {
                string = e10.getString(p025ba.k.core_money_transfer_bank_account);
            } else {
                string = i7 == 9 ? e10.getString(p025ba.k.core_money_transfer_mmo) : e10.getString(p025ba.k.core_money_transfer_palmpay);
            }
            Intrinsics.checkNotNullExpressionValue(string, "getPaymentType(...)");
        } else {
            string = "";
        }
        BillDetail billDetail2 = fundDetailFragment.f27012H;
        CharSequence text = null;
        String str = billDetail2 != null ? billDetail2.orderNo : null;
        OrderResultItemModel orderResultItemModel = fundDetailFragment.f27015Q;
        if (orderResultItemModel != null && (itemValueTv = orderResultItemModel.getItemValueTv()) != null) {
            text = itemValueTv.getText();
        }
        i0.J("2", str, Uri.encode(String.valueOf(text)), Uri.encode(string));
    }
}
