package G9;

import Pa.i0;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.BindBankCardDetailFragment;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BindBankCardDetailFragment f3165a;

    public c(BindBankCardDetailFragment bindBankCardDetailFragment) {
        this.f3165a = bindBankCardDetailFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        TextView orderStatusTv;
        Intrinsics.checkNotNullParameter(v3, "v");
        BindBankCardDetailFragment bindBankCardDetailFragment = this.f3165a;
        E activity = bindBankCardDetailFragment.getActivity();
        bindBankCardDetailFragment.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        BindBankCardDetail bindBankCardDetail = bindBankCardDetailFragment.f27002B;
        if (bindBankCardDetail != null) {
            orderInfoForCustomerService.paymentType = bindBankCardDetailFragment.getString(p025ba.k.core_fund);
            orderInfoForCustomerService.time = bindBankCardDetail.createTime;
            orderInfoForCustomerService.amount = bindBankCardDetail.amount;
            orderInfoForCustomerService.fee = bindBankCardDetail.payFee;
            orderInfoForCustomerService.orderNumber = bindBankCardDetail.orderId;
            OrderResultHeaderModel orderResultHeaderModelT = bindBankCardDetailFragment.t();
            orderInfoForCustomerService.orderStatus = String.valueOf((orderResultHeaderModelT == null || (orderStatusTv = orderResultHeaderModelT.getOrderStatusTv()) == null) ? null : orderStatusTv.getText());
            orderInfoForCustomerService.vat = bindBankCardDetail.vat;
            orderInfoForCustomerService.transType = bindBankCardDetail.transType;
            orderInfoForCustomerService.paymentMethod = bindBankCardDetailFragment.getString(p025ba.k.core_palmpay_payment_balance);
            BillProcessDetail billProcessDetail = bindBankCardDetail.orderStatusInfo;
            if (billProcessDetail != null) {
                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
            }
        }
        i0.M(activity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        String string;
        Intrinsics.checkNotNullParameter(v3, "v");
        BindBankCardDetailFragment bindBankCardDetailFragment = this.f3165a;
        BindBankCardDetail bindBankCardDetail = bindBankCardDetailFragment.f27002B;
        if (bindBankCardDetail != null) {
            String str = bindBankCardDetail.orderId;
            String strEncode = Uri.encode(bindBankCardDetailFragment.getString(p025ba.k.core_palmpay_payment_balance));
            E e10 = bindBankCardDetailFragment.f27319c;
            int i7 = bindBankCardDetail.payeeAccountType;
            if (i7 == 3) {
                string = e10.getString(p025ba.k.core_money_transfer_bank_account);
            } else {
                string = i7 == 9 ? e10.getString(p025ba.k.core_money_transfer_mmo) : e10.getString(p025ba.k.core_money_transfer_palmpay);
            }
            i0.J("7", str, strEncode, Uri.encode(string));
        }
    }
}
