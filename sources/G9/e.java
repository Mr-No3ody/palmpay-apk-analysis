package G9;

import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FundDetailFragment f3169b;

    public /* synthetic */ e(FundDetailFragment fundDetailFragment, int i7) {
        this.f3168a = i7;
        this.f3169b = fundDetailFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView orderStatusTv;
        TextView itemValueTv;
        TextView itemValueTv2;
        FundDetailFragment fundDetailFragment = this.f3169b;
        switch (this.f3168a) {
            case 0:
                BillDetail billDetail = fundDetailFragment.f27012H;
                if (billDetail != null) {
                    ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", billDetail.transType).withString("orderId", billDetail.orderNo).navigation();
                }
                break;
            default:
                FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                if (view.getId() == p366y9.b.cffd_share_receipt && fundDetailFragment.f27012H != null) {
                    User user = BaseApplication.getInstance().getUser();
                    N9.f fVar = new N9.f();
                    BillDetail billDetail2 = fundDetailFragment.f27012H;
                    CharSequence text = null;
                    fVar.f6270a = billDetail2 != null ? billDetail2.orderNo : null;
                    fVar.f6271b = user.getFirstName();
                    fVar.f6272c = "";
                    BillDetail billDetail3 = fundDetailFragment.f27012H;
                    fVar.f6273d = billDetail3 != null ? Long.valueOf(billDetail3.successTime) : null;
                    BillDetail billDetail4 = fundDetailFragment.f27012H;
                    fVar.f6274e = billDetail4 != null ? Long.valueOf(billDetail4.totalAmount) : null;
                    OrderResultItemModel orderResultItemModel = fundDetailFragment.f27014M;
                    fVar.f6275f = String.valueOf((orderResultItemModel == null || (itemValueTv2 = orderResultItemModel.getItemValueTv()) == null) ? null : itemValueTv2.getText());
                    OrderResultItemModel orderResultItemModel2 = fundDetailFragment.f27015Q;
                    fVar.f6276g = String.valueOf((orderResultItemModel2 == null || (itemValueTv = orderResultItemModel2.getItemValueTv()) == null) ? null : itemValueTv.getText());
                    fVar.f6277h = user.getFirstName();
                    fVar.f6278i = "";
                    fVar.f6279j = "";
                    BillDetail billDetail5 = fundDetailFragment.f27012H;
                    fVar.f6280k = billDetail5 != null ? Long.valueOf(billDetail5.loyaltyPoint) : null;
                    BillDetail billDetail6 = fundDetailFragment.f27012H;
                    fVar.f6281l = billDetail6 != null ? Long.valueOf(billDetail6.payFee) : null;
                    BillDetail billDetail7 = fundDetailFragment.f27012H;
                    fVar.f6282m = billDetail7 != null ? billDetail7.remark : null;
                    OrderResultHeaderModel orderResultHeaderModelU = fundDetailFragment.u();
                    if (orderResultHeaderModelU != null && (orderStatusTv = orderResultHeaderModelU.getOrderStatusTv()) != null) {
                        text = orderStatusTv.getText();
                    }
                    fVar.f6283n = String.valueOf(text);
                    fVar.a(fundDetailFragment.getContext());
                    break;
                }
                break;
        }
    }
}
