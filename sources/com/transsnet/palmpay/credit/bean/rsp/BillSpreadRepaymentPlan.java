package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/BillSpreadRepaymentPlan;", "", "accountId", "", "billId", "", "cardNo", "currentPrincipal", "currentServiceFee", "currentTerm", "", "currentTermDesc", "orderNo", "paidPrincipal", "repaymentDateStamp", "settlementTime", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getAccountId", "()Ljava/lang/String;", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "getCurrentPrincipal", "getCurrentServiceFee", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentTermDesc", "getOrderNo", "getPaidPrincipal", "getRepaymentDateStamp", "getSettlementTime", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillSpreadRepaymentPlan {

    @Nullable
    private final String accountId;

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long currentPrincipal;

    @Nullable
    private final Long currentServiceFee;

    @Nullable
    private final Integer currentTerm;

    @Nullable
    private final String currentTermDesc;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Long paidPrincipal;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Long settlementTime;

    public BillSpreadRepaymentPlan(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.accountId = str;
        this.billId = l5;
        this.cardNo = str2;
        this.currentPrincipal = l6;
        this.currentServiceFee = l8;
        this.currentTerm = num;
        this.currentTermDesc = str3;
        this.orderNo = str4;
        this.paidPrincipal = l10;
        this.repaymentDateStamp = l11;
        this.settlementTime = l12;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Long getCurrentPrincipal() {
        return this.currentPrincipal;
    }

    @Nullable
    public final Long getCurrentServiceFee() {
        return this.currentServiceFee;
    }

    @Nullable
    public final Integer getCurrentTerm() {
        return this.currentTerm;
    }

    @Nullable
    public final String getCurrentTermDesc() {
        return this.currentTermDesc;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Long getPaidPrincipal() {
        return this.paidPrincipal;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Long getSettlementTime() {
        return this.settlementTime;
    }
}
