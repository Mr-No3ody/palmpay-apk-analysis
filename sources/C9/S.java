package C9;

import Pa.i0;
import android.net.Uri;
import android.view.View;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentTradeRecordDetailActivity;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1277a;

    public S(WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity) {
        this.f1277a = withdrawAgentTradeRecordDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = WithdrawAgentTradeRecordDetailActivity.f26924p;
        this.f1277a.q();
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        QueryOrderDetailRsp queryOrderDetailRsp = this.f1277a.f26932o;
        if (queryOrderDetailRsp != null) {
            String str = queryOrderDetailRsp.orderNo;
            String strEncode = Uri.encode(queryOrderDetailRsp.payTypeDesc);
            String strEncode2 = Uri.encode(queryOrderDetailRsp.paymentTypeDesc);
            StringBuilder sbF = androidx.camera.camera2.internal.F.f("orderType=69&orderNo=", str, "&paymentMethod=", strEncode, "&paymentType=");
            sbF.append(strEncode2);
            i0.a0(sbF.toString());
        }
    }
}
