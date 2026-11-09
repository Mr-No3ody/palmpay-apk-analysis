package G9;

import Pa.i0;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawRecordDetailFragment f3183a;

    public p(WithdrawRecordDetailFragment withdrawRecordDetailFragment) {
        this.f3183a = withdrawRecordDetailFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        WithdrawRecordDetailFragment withdrawRecordDetailFragment = this.f3183a;
        E activity = withdrawRecordDetailFragment.getActivity();
        withdrawRecordDetailFragment.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        BillDetail billDetail = withdrawRecordDetailFragment.f27046v;
        if (billDetail != null) {
            orderInfoForCustomerService.paymentType = withdrawRecordDetailFragment.getString(p025ba.k.core_withdraw);
            orderInfoForCustomerService.time = billDetail.createTime;
            orderInfoForCustomerService.amount = billDetail.businessAmount;
            orderInfoForCustomerService.fee = billDetail.payFee;
            orderInfoForCustomerService.orderNumber = billDetail.orderNo;
            orderInfoForCustomerService.orderStatus = billDetail.orderStatusDesc;
            orderInfoForCustomerService.vat = billDetail.vat;
            orderInfoForCustomerService.pointsUsed = billDetail.redeemPoint;
            orderInfoForCustomerService.pointsEarned = billDetail.returnPoint;
            BillProcessDetail billProcessDetail = billDetail.orderStatusInfo;
            if (billProcessDetail != null) {
                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
            }
            orderInfoForCustomerService.transType = billDetail.transType;
        }
        i0.M(activity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        WithdrawRecordDetailFragment withdrawRecordDetailFragment = this.f3183a;
        BillDetail billDetail = withdrawRecordDetailFragment.f27046v;
        if (billDetail != null) {
            i0.J("3", billDetail.orderNo, withdrawRecordDetailFragment.getString(p025ba.k.core_palmpay_payment_name), "Withdraw");
        }
    }
}
