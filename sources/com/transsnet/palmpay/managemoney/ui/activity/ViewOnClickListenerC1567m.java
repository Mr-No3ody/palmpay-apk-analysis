package com.transsnet.palmpay.managemoney.ui.activity;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC1567m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxOrderResultActivity f32247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetCashBoxOrderDetailResp f32248b;

    public ViewOnClickListenerC1567m(CashBoxOrderResultActivity cashBoxOrderResultActivity, GetCashBoxOrderDetailResp getCashBoxOrderDetailResp) {
        this.f32247a = cashBoxOrderResultActivity;
        this.f32248b = getCashBoxOrderDetailResp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_order_detail_activity");
        int i7 = CashBoxOrderResultActivity.f32054B;
        Postcard postcardWithString = postcardBuild.withString("orderNo", (String) this.f32247a.f32066w.getValue());
        GetCashBoxOrderDetailResp.CashBoxOrderDetail data = this.f32248b.getData();
        postcardWithString.withString("transType", data != null ? data.getTransactionType() : null).navigation();
    }
}
