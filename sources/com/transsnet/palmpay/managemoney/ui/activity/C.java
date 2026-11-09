package com.transsnet.palmpay.managemoney.ui.activity;

import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GetOrderDetailResp.OrderDetailInfo f32017a;

    public C(GetOrderDetailResp.OrderDetailInfo orderDetailInfo) {
        this.f32017a = orderDetailInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClipboardUtils.copyText(this.f32017a.getTransactionId());
        ToastUtils.showShort(p025ba.k.core_copy_success);
        return Unit.f38893a;
    }
}
