package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanV4Group;", "", "productSubId", "", "accountType", "calcRepayPlanForFCAndCouponDTOS", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getProductSubId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccountType", "getCalcRepayPlanForFCAndCouponDTOS", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentPlanV4Group {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;

    @Nullable
    private final Integer productSubId;

    public CLRepaymentPlanV4Group(@Nullable Integer num, @Nullable Integer num2, @Nullable List<CLRepaymentPlanData> list) {
        this.productSubId = num;
        this.accountType = num2;
        this.calcRepayPlanForFCAndCouponDTOS = list;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final List<CLRepaymentPlanData> getCalcRepayPlanForFCAndCouponDTOS() {
        return this.calcRepayPlanForFCAndCouponDTOS;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }
}
