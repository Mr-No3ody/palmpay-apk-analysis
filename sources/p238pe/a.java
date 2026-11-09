package p238pe;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeOrderDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayCodeOrderDetailActivity f41299a;

    public a(PayCodeOrderDetailActivity payCodeOrderDetailActivity) {
        this.f41299a = payCodeOrderDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        PayCodeOrderDetailActivity payCodeOrderDetailActivity = this.f41299a;
        OrderInfoForCustomerService orderInfoForCustomerServiceM = PayCodeOrderDetailActivity.m(payCodeOrderDetailActivity);
        if (orderInfoForCustomerServiceM != null) {
            i0.M(payCodeOrderDetailActivity, orderInfoForCustomerServiceM);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        OrderInfoForCustomerService orderInfoForCustomerServiceM = PayCodeOrderDetailActivity.m(this.f41299a);
        if (orderInfoForCustomerServiceM != null) {
            i0.N(orderInfoForCustomerServiceM);
        }
    }
}
