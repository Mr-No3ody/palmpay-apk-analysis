package com.transsnet.palmpay.managemoney.ui.activity;

import android.view.View;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1563i implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {
    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        com.palmpay.lib.apm.launchcounter.util.d.w(GetCustomerServiceUrlReq.ENTER_TYPE_CASHBOX);
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }
}
