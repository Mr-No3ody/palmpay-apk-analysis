package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bF\u0018\u00002\u00020\u0001Bë\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b2\u0010/R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b7\u0010/R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b;\u0010/R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b<\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b>\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\b@\u0010/R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bA\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bB\u0010/R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bC\u0010/R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bD\u0010/R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bE\u0010/R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bG\u0010/R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bI\u0010/R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bK\u0010/R\u0015\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00105\u001a\u0004\bL\u00104R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bM\u0010/R\u0015\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bN\u0010/R\u0015\u0010$\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bO\u0010/R\u0015\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bP\u0010/R\u0015\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bQ\u0010/R\u0015\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bR\u0010/R\u0015\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00100\u001a\u0004\bS\u0010/¨\u0006T"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcHistoryBillListDetail;", "", "accountId", "", "beginTime", "beginTimeStamp", "", "billDate", "billDateStamp", "billStatus", "", "cardNo", "createTime", "descList", "", "endTime", "endTimeStamp", "id", "interestBeginDate", "interestBeginDateStamp", "interestEndDate", "interestEndDateStamp", "outstandingAmount", "overduePrincipalAmount", "paidInterest", "paidPenalty", "paidPrincipal", "penaltyBeginDate", "penaltyBeginDateStamp", "penaltyEndDate", "penaltyEndDateStamp", "remark", "repaymentDateStamp", "stauts", "unpaidInterest", "unpaidPenalty", "unpaidPrincipal", "updateTime", "usedAmount", "unpaidInstallmentServiceFee", "paidInstallmentServiceFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getAccountId", "()Ljava/lang/String;", "getBeginTime", "getBeginTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBillDate", "getBillDateStamp", "getBillStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNo", "getCreateTime", "getDescList", "()Ljava/util/List;", "getEndTime", "getEndTimeStamp", "getId", "getInterestBeginDate", "getInterestBeginDateStamp", "getInterestEndDate", "getInterestEndDateStamp", "getOutstandingAmount", "getOverduePrincipalAmount", "getPaidInterest", "getPaidPenalty", "getPaidPrincipal", "getPenaltyBeginDate", "getPenaltyBeginDateStamp", "getPenaltyEndDate", "getPenaltyEndDateStamp", "getRemark", "getRepaymentDateStamp", "getStauts", "getUnpaidInterest", "getUnpaidPenalty", "getUnpaidPrincipal", "getUpdateTime", "getUsedAmount", "getUnpaidInstallmentServiceFee", "getPaidInstallmentServiceFee", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcHistoryBillListDetail {

    @Nullable
    private final String accountId;

    @Nullable
    private final String beginTime;

    @Nullable
    private final Long beginTimeStamp;

    @Nullable
    private final String billDate;

    @Nullable
    private final Long billDateStamp;

    @Nullable
    private final Integer billStatus;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long createTime;

    @Nullable
    private final List<String> descList;

    @Nullable
    private final String endTime;

    @Nullable
    private final Long endTimeStamp;

    @Nullable
    private final Long id;

    @Nullable
    private final String interestBeginDate;

    @Nullable
    private final Long interestBeginDateStamp;

    @Nullable
    private final String interestEndDate;

    @Nullable
    private final Long interestEndDateStamp;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long overduePrincipalAmount;

    @Nullable
    private final Long paidInstallmentServiceFee;

    @Nullable
    private final Long paidInterest;

    @Nullable
    private final Long paidPenalty;

    @Nullable
    private final Long paidPrincipal;

    @Nullable
    private final String penaltyBeginDate;

    @Nullable
    private final Long penaltyBeginDateStamp;

    @Nullable
    private final String penaltyEndDate;

    @Nullable
    private final Long penaltyEndDateStamp;

    @Nullable
    private final String remark;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Integer stauts;

    @Nullable
    private final Long unpaidInstallmentServiceFee;

    @Nullable
    private final Long unpaidInterest;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final Long unpaidPrincipal;

    @Nullable
    private final Long updateTime;

    @Nullable
    private final Long usedAmount;

    public OcHistoryBillListDetail(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable String str3, @Nullable Long l6, @Nullable Integer num, @Nullable String str4, @Nullable Long l8, @Nullable List<String> list, @Nullable String str5, @Nullable Long l10, @Nullable Long l11, @Nullable String str6, @Nullable Long l12, @Nullable String str7, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable Long l17, @Nullable Long l18, @Nullable String str8, @Nullable Long l19, @Nullable String str9, @Nullable Long l20, @Nullable String str10, @Nullable Long l21, @Nullable Integer num2, @Nullable Long l22, @Nullable Long l23, @Nullable Long l24, @Nullable Long l25, @Nullable Long l26, @Nullable Long l27, @Nullable Long l28) {
        this.accountId = str;
        this.beginTime = str2;
        this.beginTimeStamp = l5;
        this.billDate = str3;
        this.billDateStamp = l6;
        this.billStatus = num;
        this.cardNo = str4;
        this.createTime = l8;
        this.descList = list;
        this.endTime = str5;
        this.endTimeStamp = l10;
        this.id = l11;
        this.interestBeginDate = str6;
        this.interestBeginDateStamp = l12;
        this.interestEndDate = str7;
        this.interestEndDateStamp = l13;
        this.outstandingAmount = l14;
        this.overduePrincipalAmount = l15;
        this.paidInterest = l16;
        this.paidPenalty = l17;
        this.paidPrincipal = l18;
        this.penaltyBeginDate = str8;
        this.penaltyBeginDateStamp = l19;
        this.penaltyEndDate = str9;
        this.penaltyEndDateStamp = l20;
        this.remark = str10;
        this.repaymentDateStamp = l21;
        this.stauts = num2;
        this.unpaidInterest = l22;
        this.unpaidPenalty = l23;
        this.unpaidPrincipal = l24;
        this.updateTime = l25;
        this.usedAmount = l26;
        this.unpaidInstallmentServiceFee = l27;
        this.paidInstallmentServiceFee = l28;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getBeginTime() {
        return this.beginTime;
    }

    @Nullable
    public final Long getBeginTimeStamp() {
        return this.beginTimeStamp;
    }

    @Nullable
    public final String getBillDate() {
        return this.billDate;
    }

    @Nullable
    public final Long getBillDateStamp() {
        return this.billDateStamp;
    }

    @Nullable
    public final Integer getBillStatus() {
        return this.billStatus;
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
    public final List<String> getDescList() {
        return this.descList;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getInterestBeginDate() {
        return this.interestBeginDate;
    }

    @Nullable
    public final Long getInterestBeginDateStamp() {
        return this.interestBeginDateStamp;
    }

    @Nullable
    public final String getInterestEndDate() {
        return this.interestEndDate;
    }

    @Nullable
    public final Long getInterestEndDateStamp() {
        return this.interestEndDateStamp;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getOverduePrincipalAmount() {
        return this.overduePrincipalAmount;
    }

    @Nullable
    public final Long getPaidInstallmentServiceFee() {
        return this.paidInstallmentServiceFee;
    }

    @Nullable
    public final Long getPaidInterest() {
        return this.paidInterest;
    }

    @Nullable
    public final Long getPaidPenalty() {
        return this.paidPenalty;
    }

    @Nullable
    public final Long getPaidPrincipal() {
        return this.paidPrincipal;
    }

    @Nullable
    public final String getPenaltyBeginDate() {
        return this.penaltyBeginDate;
    }

    @Nullable
    public final Long getPenaltyBeginDateStamp() {
        return this.penaltyBeginDateStamp;
    }

    @Nullable
    public final String getPenaltyEndDate() {
        return this.penaltyEndDate;
    }

    @Nullable
    public final Long getPenaltyEndDateStamp() {
        return this.penaltyEndDateStamp;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Integer getStauts() {
        return this.stauts;
    }

    @Nullable
    public final Long getUnpaidInstallmentServiceFee() {
        return this.unpaidInstallmentServiceFee;
    }

    @Nullable
    public final Long getUnpaidInterest() {
        return this.unpaidInterest;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final Long getUnpaidPrincipal() {
        return this.unpaidPrincipal;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final Long getUsedAmount() {
        return this.usedAmount;
    }
}
