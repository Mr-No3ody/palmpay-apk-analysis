package p160ke;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {
    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }
}
