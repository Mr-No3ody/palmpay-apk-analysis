package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxAccountInfoResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC1597t implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxMainFragment f32663a;

    public ViewOnClickListenerC1597t(CashBoxMainFragment cashBoxMainFragment) {
        this.f32663a = cashBoxMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Pa.n0.g().l("CashBox_Savingstips_Click");
        Postcard postcardWithInt = ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1);
        GetCashBoxAccountInfoResp.CashBoxAccountInfo cashBoxAccountInfo = this.f32663a.f32407Q0;
        Intrinsics.e(cashBoxAccountInfo);
        postcardWithInt.withString("total_back_amount", Pa.r0.A(cashBoxAccountInfo.getCanBeDepositFromBalance())).navigation();
    }
}
