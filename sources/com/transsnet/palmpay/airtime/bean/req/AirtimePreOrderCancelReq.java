package com.transsnet.palmpay.airtime.bean.req;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/req/AirtimePreOrderCancelReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "<init>", "()V", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimePreOrderCancelReq implements SingleLiveData$Params {

    @Nullable
    private String orderNo;

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }
}
