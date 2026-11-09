package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OfflineInstallmentRepaymentPlanPO;", "", "accountId", "", "billId", "", "cardNo", "createTime", "currentAmount", "currentServiceFee", "currentTerm", "", "id", "orderNo", "paidPrincipal", "remark", "repaymentDate", "repaymentDateStamp", "settlementTime", "updateTime", "currentTermDesc", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "getCreateTime", "getCurrentAmount", "getCurrentServiceFee", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getOrderNo", "getPaidPrincipal", "getRemark", "getRepaymentDate", "getRepaymentDateStamp", "getSettlementTime", "getUpdateTime", "getCurrentTermDesc", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OfflineInstallmentRepaymentPlanPO {

    @Nullable
    private final String accountId;

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long createTime;

    @Nullable
    private final Long currentAmount;

    @Nullable
    private final Long currentServiceFee;

    @Nullable
    private final Integer currentTerm;

    @Nullable
    private final String currentTermDesc;

    @Nullable
    private final Long id;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Long paidPrincipal;

    @Nullable
    private final String remark;

    @Nullable
    private final String repaymentDate;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Long settlementTime;

    @Nullable
    private final Long updateTime;

    public OfflineInstallmentRepaymentPlanPO(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Integer num, @Nullable Long l11, @Nullable String str3, @Nullable Long l12, @Nullable String str4, @Nullable String str5, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable String str6) {
        this.accountId = str;
        this.billId = l5;
        this.cardNo = str2;
        this.createTime = l6;
        this.currentAmount = l8;
        this.currentServiceFee = l10;
        this.currentTerm = num;
        this.id = l11;
        this.orderNo = str3;
        this.paidPrincipal = l12;
        this.remark = str4;
        this.repaymentDate = str5;
        this.repaymentDateStamp = l13;
        this.settlementTime = l14;
        this.updateTime = l15;
        this.currentTermDesc = str6;
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
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Long getCurrentAmount() {
        return this.currentAmount;
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
    public final Long getId() {
        return this.id;
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
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Long getSettlementTime() {
        return this.settlementTime;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }
}
