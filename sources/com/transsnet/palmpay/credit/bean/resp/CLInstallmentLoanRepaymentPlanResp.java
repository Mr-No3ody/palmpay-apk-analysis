package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp$CLInstallmentLoanRepaymentPlanData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp$CLInstallmentLoanRepaymentPlanData;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp$CLInstallmentLoanRepaymentPlanData;", "CLInstallmentLoanRepaymentPlanData", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentLoanRepaymentPlanResp extends CommonResult {

    @Nullable
    private final CLInstallmentLoanRepaymentPlanData data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLInstallmentLoanRepaymentPlanResp$CLInstallmentLoanRepaymentPlanData;", "", "calcRepayPlanForFCAndCouponDTOS", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "<init>", "(Ljava/util/List;)V", "getCalcRepayPlanForFCAndCouponDTOS", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CLInstallmentLoanRepaymentPlanData {

        @Nullable
        private final List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;

        public CLInstallmentLoanRepaymentPlanData(@Nullable List<CLRepaymentPlanData> list) {
            this.calcRepayPlanForFCAndCouponDTOS = list;
        }

        @Nullable
        public final List<CLRepaymentPlanData> getCalcRepayPlanForFCAndCouponDTOS() {
            return this.calcRepayPlanForFCAndCouponDTOS;
        }
    }

    public CLInstallmentLoanRepaymentPlanResp(@Nullable CLInstallmentLoanRepaymentPlanData cLInstallmentLoanRepaymentPlanData) {
        this.data = cLInstallmentLoanRepaymentPlanData;
    }

    @Nullable
    public final CLInstallmentLoanRepaymentPlanData getData() {
        return this.data;
    }
}
