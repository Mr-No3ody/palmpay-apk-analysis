package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodBean;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", "calculationDto", "Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "getCalculationDto", "()Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "setCalculationDto", "(Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;)V", "paymentMethodList", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "getPaymentMethodList", "()Ljava/util/List;", "setPaymentMethodList", "(Ljava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ManualCalcOfPaymentMethodBean extends CommonResult {

    @Nullable
    private CalcOfPaymentMethodResultBean calculationDto;

    @Nullable
    private List<? extends CashierPaymentMethodBean> paymentMethodList;

    @Nullable
    public final CalcOfPaymentMethodResultBean getCalculationDto() {
        return this.calculationDto;
    }

    @Nullable
    public final List<CashierPaymentMethodBean> getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final void setCalculationDto(@Nullable CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean) {
        this.calculationDto = calcOfPaymentMethodResultBean;
    }

    public final void setPaymentMethodList(@Nullable List<? extends CashierPaymentMethodBean> list) {
        this.paymentMethodList = list;
    }
}
