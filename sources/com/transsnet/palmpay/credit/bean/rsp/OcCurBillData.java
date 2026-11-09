package com.transsnet.palmpay.credit.bean.rsp;

import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\u0018\u00002\u00020\u0001B\u00ad\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b<\u00107R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b=\u00107R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b>\u00107R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b?\u00107R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b@\u00107R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bA\u00107R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bB\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bD\u00107R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bH\u00107R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bI\u00107R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bJ\u00107R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bK\u00107R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bL\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00105R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\bN\u0010FR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bP\u00107R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bQ\u00107R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00105R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\bS\u0010FR\u0015\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0015\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bU\u00107R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\bV\u0010FR\u0015\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bW\u00107R\u0015\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bX\u00107R\u0015\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bY\u00107R\u0015\u0010&\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\bZ\u0010FR\u0015\u0010'\u001a\u0004\u0018\u00010(¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\R\u0015\u0010)\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010G\u001a\u0004\b^\u0010FR\u0015\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b_\u00107R\u0015\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b`\u00107R\u0015\u0010,\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\ba\u00107R\u0015\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bb\u00107R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\be\u0010f¨\u0006g"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OcCurBillData;", "", "accountId", "", "beginTimeStamp", "", "cardNo", "createTime", "endTime", "endTimeStamp", "id", "outstandingAmount", "paidInterest", "paidPenalty", "paidPrincipal", "penaltyBeginDateStamp", "remark", "repaymentDateStamp", "stauts", "", "unpaidInterest", "unpaidPenalty", "unpaidPrincipal", "updateTime", "usedAmount", "penaltyRuleNo", "extensionTag", "orderNo", "unpaidInstallmentServiceFee", "paidInstallmentServiceFee", "bizDesc", "overdueDays", "extensionServiceFee", "extensionAmount", "spreadTag", "unpaidSpreadServiceFee", "paidSpreadServiceFee", "extensionDownPaymentPrincipal", "spreadPromptType", "extensionDownPaymentRatio", "", "spreadMaxTerm", "predictEveryTermSpreadAmount", "spreadThreshold", "extensionLastPrincipal", "extensionLastRepaymentDateStamp", "stampDutyPromptInfo", "Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)V", "getAccountId", "()Ljava/lang/String;", "getBeginTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "getCreateTime", "getEndTime", "getEndTimeStamp", "getId", "getOutstandingAmount", "getPaidInterest", "getPaidPenalty", "getPaidPrincipal", "getPenaltyBeginDateStamp", "getRemark", "getRepaymentDateStamp", "getStauts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnpaidInterest", "getUnpaidPenalty", "getUnpaidPrincipal", "getUpdateTime", "getUsedAmount", "getPenaltyRuleNo", "getExtensionTag", "getOrderNo", "getUnpaidInstallmentServiceFee", "getPaidInstallmentServiceFee", "getBizDesc", "getOverdueDays", "getExtensionServiceFee", "getExtensionAmount", "getSpreadTag", "getUnpaidSpreadServiceFee", "getPaidSpreadServiceFee", "getExtensionDownPaymentPrincipal", "getSpreadPromptType", "getExtensionDownPaymentRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSpreadMaxTerm", "getPredictEveryTermSpreadAmount", "getSpreadThreshold", "getExtensionLastPrincipal", "getExtensionLastRepaymentDateStamp", "getStampDutyPromptInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "getWaiverInfo", "()Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcCurBillData {

    @Nullable
    private final String accountId;

    @Nullable
    private final Long beginTimeStamp;

    @Nullable
    private final String bizDesc;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long createTime;

    @Nullable
    private final String endTime;

    @Nullable
    private final Long endTimeStamp;

    @Nullable
    private final Long extensionAmount;

    @Nullable
    private final Long extensionDownPaymentPrincipal;

    @Nullable
    private final Double extensionDownPaymentRatio;

    @Nullable
    private final Long extensionLastPrincipal;

    @Nullable
    private final Long extensionLastRepaymentDateStamp;

    @Nullable
    private final Long extensionServiceFee;

    @Nullable
    private final Integer extensionTag;

    @Nullable
    private final Long id;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Integer overdueDays;

    @Nullable
    private final Long paidInstallmentServiceFee;

    @Nullable
    private final Long paidInterest;

    @Nullable
    private final Long paidPenalty;

    @Nullable
    private final Long paidPrincipal;

    @Nullable
    private final Long paidSpreadServiceFee;

    @Nullable
    private final Long penaltyBeginDateStamp;

    @Nullable
    private final String penaltyRuleNo;

    @Nullable
    private final Long predictEveryTermSpreadAmount;

    @Nullable
    private final String remark;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Integer spreadMaxTerm;

    @Nullable
    private final Integer spreadPromptType;

    @Nullable
    private final Integer spreadTag;

    @Nullable
    private final Long spreadThreshold;

    @Nullable
    private final StampDutyPromptInfo stampDutyPromptInfo;

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
    private final Long unpaidSpreadServiceFee;

    @Nullable
    private final Long updateTime;

    @Nullable
    private final Long usedAmount;

    @Nullable
    private final WaiverInfo waiverInfo;

    public OcCurBillData(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable Long l6, @Nullable String str3, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable String str4, @Nullable Long l16, @Nullable Integer num, @Nullable Long l17, @Nullable Long l18, @Nullable Long l19, @Nullable Long l20, @Nullable Long l21, @Nullable String str5, @Nullable Integer num2, @Nullable String str6, @Nullable Long l22, @Nullable Long l23, @Nullable String str7, @Nullable Integer num3, @Nullable Long l24, @Nullable Long l25, @Nullable Integer num4, @Nullable Long l26, @Nullable Long l27, @Nullable Long l28, @Nullable Integer num5, @Nullable Double d2, @Nullable Integer num6, @Nullable Long l29, @Nullable Long l30, @Nullable Long l31, @Nullable Long l32, @Nullable StampDutyPromptInfo stampDutyPromptInfo, @Nullable WaiverInfo waiverInfo) {
        this.accountId = str;
        this.beginTimeStamp = l5;
        this.cardNo = str2;
        this.createTime = l6;
        this.endTime = str3;
        this.endTimeStamp = l8;
        this.id = l10;
        this.outstandingAmount = l11;
        this.paidInterest = l12;
        this.paidPenalty = l13;
        this.paidPrincipal = l14;
        this.penaltyBeginDateStamp = l15;
        this.remark = str4;
        this.repaymentDateStamp = l16;
        this.stauts = num;
        this.unpaidInterest = l17;
        this.unpaidPenalty = l18;
        this.unpaidPrincipal = l19;
        this.updateTime = l20;
        this.usedAmount = l21;
        this.penaltyRuleNo = str5;
        this.extensionTag = num2;
        this.orderNo = str6;
        this.unpaidInstallmentServiceFee = l22;
        this.paidInstallmentServiceFee = l23;
        this.bizDesc = str7;
        this.overdueDays = num3;
        this.extensionServiceFee = l24;
        this.extensionAmount = l25;
        this.spreadTag = num4;
        this.unpaidSpreadServiceFee = l26;
        this.paidSpreadServiceFee = l27;
        this.extensionDownPaymentPrincipal = l28;
        this.spreadPromptType = num5;
        this.extensionDownPaymentRatio = d2;
        this.spreadMaxTerm = num6;
        this.predictEveryTermSpreadAmount = l29;
        this.spreadThreshold = l30;
        this.extensionLastPrincipal = l31;
        this.extensionLastRepaymentDateStamp = l32;
        this.stampDutyPromptInfo = stampDutyPromptInfo;
        this.waiverInfo = waiverInfo;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final Long getBeginTimeStamp() {
        return this.beginTimeStamp;
    }

    @Nullable
    public final String getBizDesc() {
        return this.bizDesc;
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
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    @Nullable
    public final Long getExtensionAmount() {
        return this.extensionAmount;
    }

    @Nullable
    public final Long getExtensionDownPaymentPrincipal() {
        return this.extensionDownPaymentPrincipal;
    }

    @Nullable
    public final Double getExtensionDownPaymentRatio() {
        return this.extensionDownPaymentRatio;
    }

    @Nullable
    public final Long getExtensionLastPrincipal() {
        return this.extensionLastPrincipal;
    }

    @Nullable
    public final Long getExtensionLastRepaymentDateStamp() {
        return this.extensionLastRepaymentDateStamp;
    }

    @Nullable
    public final Long getExtensionServiceFee() {
        return this.extensionServiceFee;
    }

    @Nullable
    public final Integer getExtensionTag() {
        return this.extensionTag;
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
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Integer getOverdueDays() {
        return this.overdueDays;
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
    public final Long getPaidSpreadServiceFee() {
        return this.paidSpreadServiceFee;
    }

    @Nullable
    public final Long getPenaltyBeginDateStamp() {
        return this.penaltyBeginDateStamp;
    }

    @Nullable
    public final String getPenaltyRuleNo() {
        return this.penaltyRuleNo;
    }

    @Nullable
    public final Long getPredictEveryTermSpreadAmount() {
        return this.predictEveryTermSpreadAmount;
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
    public final Integer getSpreadMaxTerm() {
        return this.spreadMaxTerm;
    }

    @Nullable
    public final Integer getSpreadPromptType() {
        return this.spreadPromptType;
    }

    @Nullable
    public final Integer getSpreadTag() {
        return this.spreadTag;
    }

    @Nullable
    public final Long getSpreadThreshold() {
        return this.spreadThreshold;
    }

    @Nullable
    public final StampDutyPromptInfo getStampDutyPromptInfo() {
        return this.stampDutyPromptInfo;
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
    public final Long getUnpaidSpreadServiceFee() {
        return this.unpaidSpreadServiceFee;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final Long getUsedAmount() {
        return this.usedAmount;
    }

    @Nullable
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    public /* synthetic */ OcCurBillData(String str, Long l5, String str2, Long l6, String str3, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, String str4, Long l16, Integer num, Long l17, Long l18, Long l19, Long l20, Long l21, String str5, Integer num2, String str6, Long l22, Long l23, String str7, Integer num3, Long l24, Long l25, Integer num4, Long l26, Long l27, Long l28, Integer num5, Double d2, Integer num6, Long l29, Long l30, Long l31, Long l32, StampDutyPromptInfo stampDutyPromptInfo, WaiverInfo waiverInfo, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l5, str2, l6, str3, l8, l10, l11, l12, l13, l14, l15, str4, l16, num, l17, l18, l19, l20, l21, str5, num2, str6, l22, l23, str7, num3, l24, l25, num4, l26, l27, l28, num5, d2, num6, l29, l30, l31, l32, stampDutyPromptInfo, (i10 & 512) != 0 ? null : waiverInfo);
    }
}
