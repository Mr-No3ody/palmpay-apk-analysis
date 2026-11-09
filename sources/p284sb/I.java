package p284sb;

import Pa.i0;
import android.net.Uri;
import android.view.View;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.PayShopTradeRecordDetailActivity;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayShopTradeRecordDetailActivity f42125a;

    public I(PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity) {
        this.f42125a = payShopTradeRecordDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = PayShopTradeRecordDetailActivity.f28752w;
        this.f42125a.r();
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        QueryOrderDetailRsp queryOrderDetailRsp = this.f42125a.f28759v;
        if (queryOrderDetailRsp != null) {
            String str = queryOrderDetailRsp.orderNo;
            String strEncode = Uri.encode(queryOrderDetailRsp.payTypeDesc);
            String strEncode2 = Uri.encode(queryOrderDetailRsp.paymentTypeDesc);
            StringBuilder sbF = F.f("orderType=68&orderNo=", str, "&paymentMethod=", strEncode, "&paymentType=");
            sbF.append(strEncode2);
            i0.a0(sbF.toString());
        }
    }
}
