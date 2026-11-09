package com.transsnet.palmpay.managemoney.ui.fragment;

import android.net.Uri;
import android.view.View;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GetOrderDetailResp.OrderDetailInfo f32672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailFragment f32673b;

    public v0(GetOrderDetailResp.OrderDetailInfo orderDetailInfo, TransactionDetailFragment transactionDetailFragment) {
        this.f32672a = orderDetailInfo;
        this.f32673b = transactionDetailFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Pa.i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        GetOrderDetailResp.OrderDetailInfo orderDetailInfo = this.f32672a;
        if (orderDetailInfo != null) {
            TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
            Pa.i0.a0("orderType=" + this.f32673b.w() + "&orderNo=" + Uri.encode(orderDetailInfo.getTransactionId()));
        }
    }
}
