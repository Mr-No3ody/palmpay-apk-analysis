package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowRepaymentPlanData;", "", "orderExtendObject", "Lcom/transsnet/palmpay/credit/bean/resp/OrderExtendObject;", "transAmount", "", "accountType", "", "withdrawStatus", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/OrderExtendObject;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOrderExtendObject", "()Lcom/transsnet/palmpay/credit/bean/resp/OrderExtendObject;", "getTransAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWithdrawStatus", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowRepaymentPlanData {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final OrderExtendObject orderExtendObject;

    @Nullable
    private final Long transAmount;

    @Nullable
    private final Integer withdrawStatus;

    public CLBorrowRepaymentPlanData(@Nullable OrderExtendObject orderExtendObject, @Nullable Long l5, @Nullable Integer num, @Nullable Integer num2) {
        this.orderExtendObject = orderExtendObject;
        this.transAmount = l5;
        this.accountType = num;
        this.withdrawStatus = num2;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final OrderExtendObject getOrderExtendObject() {
        return this.orderExtendObject;
    }

    @Nullable
    public final Long getTransAmount() {
        return this.transAmount;
    }

    @Nullable
    public final Integer getWithdrawStatus() {
        return this.withdrawStatus;
    }
}
