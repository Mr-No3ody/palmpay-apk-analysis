package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLExtendPlanData;", "", "extensionRepaymentDate", "", "extensionServiceFee", "extensionTag", "", "interest", "loanNo", "", "penalty", "principal", "serviceFee", "totalAmount", "stampDutyPromptInfo", "Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;)V", "getExtensionRepaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExtensionServiceFee", "getExtensionTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterest", "getLoanNo", "()Ljava/lang/String;", "getPenalty", "getPrincipal", "getServiceFee", "getTotalAmount", "getStampDutyPromptInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLExtendPlanData {

    @Nullable
    private final Long extensionRepaymentDate;

    @Nullable
    private final Long extensionServiceFee;

    @Nullable
    private final Integer extensionTag;

    @Nullable
    private final Long interest;

    @Nullable
    private final String loanNo;

    @Nullable
    private final Long penalty;

    @Nullable
    private final Long principal;

    @Nullable
    private final Long serviceFee;

    @Nullable
    private final StampDutyPromptInfo stampDutyPromptInfo;

    @Nullable
    private final Long totalAmount;

    public CLExtendPlanData(@Nullable Long l5, @Nullable Long l6, @Nullable Integer num, @Nullable Long l8, @Nullable String str, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable StampDutyPromptInfo stampDutyPromptInfo) {
        this.extensionRepaymentDate = l5;
        this.extensionServiceFee = l6;
        this.extensionTag = num;
        this.interest = l8;
        this.loanNo = str;
        this.penalty = l10;
        this.principal = l11;
        this.serviceFee = l12;
        this.totalAmount = l13;
        this.stampDutyPromptInfo = stampDutyPromptInfo;
    }

    @Nullable
    public final Long getExtensionRepaymentDate() {
        return this.extensionRepaymentDate;
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
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final Long getPenalty() {
        return this.penalty;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final Long getServiceFee() {
        return this.serviceFee;
    }

    @Nullable
    public final StampDutyPromptInfo getStampDutyPromptInfo() {
        return this.stampDutyPromptInfo;
    }

    @Nullable
    public final Long getTotalAmount() {
        return this.totalAmount;
    }
}
