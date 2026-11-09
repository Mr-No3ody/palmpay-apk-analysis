package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLMultipleRepaymentPlanData;", "", "cashRepayPlanAndCoupon", "Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;", "installRepayPlanAndCoupon", "instantRepayPlanAndCoupon", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;)V", "getCashRepayPlanAndCoupon", "()Lcom/transsnet/palmpay/credit/bean/resp/CLShortCashRepaymentPlanData;", "getInstallRepayPlanAndCoupon", "getInstantRepayPlanAndCoupon", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMultipleRepaymentPlanData {

    @Nullable
    private final CLShortCashRepaymentPlanData cashRepayPlanAndCoupon;

    @Nullable
    private final CLShortCashRepaymentPlanData installRepayPlanAndCoupon;

    @Nullable
    private final CLShortCashRepaymentPlanData instantRepayPlanAndCoupon;

    public CLMultipleRepaymentPlanData(@Nullable CLShortCashRepaymentPlanData cLShortCashRepaymentPlanData, @Nullable CLShortCashRepaymentPlanData cLShortCashRepaymentPlanData2, @Nullable CLShortCashRepaymentPlanData cLShortCashRepaymentPlanData3) {
        this.cashRepayPlanAndCoupon = cLShortCashRepaymentPlanData;
        this.installRepayPlanAndCoupon = cLShortCashRepaymentPlanData2;
        this.instantRepayPlanAndCoupon = cLShortCashRepaymentPlanData3;
    }

    @Nullable
    public final CLShortCashRepaymentPlanData getCashRepayPlanAndCoupon() {
        return this.cashRepayPlanAndCoupon;
    }

    @Nullable
    public final CLShortCashRepaymentPlanData getInstallRepayPlanAndCoupon() {
        return this.installRepayPlanAndCoupon;
    }

    @Nullable
    public final CLShortCashRepaymentPlanData getInstantRepayPlanAndCoupon() {
        return this.instantRepayPlanAndCoupon;
    }
}
