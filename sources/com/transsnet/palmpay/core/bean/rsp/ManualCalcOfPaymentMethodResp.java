package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "getData", "()Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "setData", "(Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ManualCalcOfPaymentMethodResp extends CommonResult {

    @Nullable
    private CalcOfPaymentMethodResultBean data;

    @Nullable
    public final CalcOfPaymentMethodResultBean getData() {
        return this.data;
    }

    public final void setData(@Nullable CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean) {
        this.data = calcOfPaymentMethodResultBean;
    }
}
