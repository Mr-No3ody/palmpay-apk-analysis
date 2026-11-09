package p224oe;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.main.export.bean.rsp.PalmSafeDetail;
import com.transsnet.palmpay.ui.activity.palmsafe.PalmSafeDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmSafeDetailActivity f40534a;

    public a(PalmSafeDetailActivity palmSafeDetailActivity) {
        this.f40534a = palmSafeDetailActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        PalmSafeDetail palmSafeDetail;
        Intrinsics.checkNotNullParameter(v3, "v");
        int i7 = PalmSafeDetailActivity.f34776f;
        PalmSafeDetailActivity palmSafeDetailActivity = this.f40534a;
        palmSafeDetailActivity.getClass();
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        CommonBeanResult commonBeanResult = palmSafeDetailActivity.f34778d;
        if (commonBeanResult != null && (palmSafeDetail = (PalmSafeDetail) commonBeanResult.data) != null) {
            String str = palmSafeDetail.transType;
            orderInfoForCustomerService.paymentType = str;
            orderInfoForCustomerService.time = palmSafeDetail.gmtCreated;
            orderInfoForCustomerService.amount = palmSafeDetail.payAmount;
            orderInfoForCustomerService.orderNumber = palmSafeDetail.orderNo;
            orderInfoForCustomerService.orderStatus = palmSafeDetail.orderStatusDesc;
            orderInfoForCustomerService.transType = str;
        }
        i0.M(palmSafeDetailActivity, orderInfoForCustomerService);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }
}
