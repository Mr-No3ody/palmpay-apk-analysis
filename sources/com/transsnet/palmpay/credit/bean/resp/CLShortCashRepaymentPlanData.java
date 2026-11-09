package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.bean.CLBorrowAllDiscountInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;", "", "calcRepayPlanForFCAndCouponDTOS", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "borrowAllDiscountInfo", "Lcom/transsnet/palmpay/credit/bean/CLBorrowAllDiscountInfo;", "<init>", "(Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/CLBorrowAllDiscountInfo;)V", "getCalcRepayPlanForFCAndCouponDTOS", "()Ljava/util/List;", "getBorrowAllDiscountInfo", "()Lcom/transsnet/palmpay/credit/bean/CLBorrowAllDiscountInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLShortCashRepaymentPlanData {

    @Nullable
    private final CLBorrowAllDiscountInfo borrowAllDiscountInfo;

    @Nullable
    private final List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;

    public CLShortCashRepaymentPlanData(@Nullable List<CLRepaymentPlanData> list, @Nullable CLBorrowAllDiscountInfo cLBorrowAllDiscountInfo) {
        this.calcRepayPlanForFCAndCouponDTOS = list;
        this.borrowAllDiscountInfo = cLBorrowAllDiscountInfo;
    }

    @Nullable
    public final CLBorrowAllDiscountInfo getBorrowAllDiscountInfo() {
        return this.borrowAllDiscountInfo;
    }

    @Nullable
    public final List<CLRepaymentPlanData> getCalcRepayPlanForFCAndCouponDTOS() {
        return this.calcRepayPlanForFCAndCouponDTOS;
    }
}
