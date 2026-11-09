package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/SpreadRepaymentPlan;", "", "beginDate", "", "beginDateStamp", "", "currentPrincipal", "currentServiceFee", "currentTerm", "", "endDate", "endDateStamp", "repaymentDate", "repaymentDateStamp", "currentAmountSum", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getBeginDate", "()Ljava/lang/String;", "getBeginDateStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentPrincipal", "getCurrentServiceFee", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndDate", "getEndDateStamp", "getRepaymentDate", "getRepaymentDateStamp", "getCurrentAmountSum", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpreadRepaymentPlan {

    @Nullable
    private final String beginDate;

    @Nullable
    private final Long beginDateStamp;

    @Nullable
    private final Long currentAmountSum;

    @Nullable
    private final Long currentPrincipal;

    @Nullable
    private final Long currentServiceFee;

    @Nullable
    private final Integer currentTerm;

    @Nullable
    private final String endDate;

    @Nullable
    private final Long endDateStamp;

    @Nullable
    private final String repaymentDate;

    @Nullable
    private final Long repaymentDateStamp;

    public SpreadRepaymentPlan(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num, @Nullable String str2, @Nullable Long l10, @Nullable String str3, @Nullable Long l11, @Nullable Long l12) {
        this.beginDate = str;
        this.beginDateStamp = l5;
        this.currentPrincipal = l6;
        this.currentServiceFee = l8;
        this.currentTerm = num;
        this.endDate = str2;
        this.endDateStamp = l10;
        this.repaymentDate = str3;
        this.repaymentDateStamp = l11;
        this.currentAmountSum = l12;
    }

    @Nullable
    public final String getBeginDate() {
        return this.beginDate;
    }

    @Nullable
    public final Long getBeginDateStamp() {
        return this.beginDateStamp;
    }

    @Nullable
    public final Long getCurrentAmountSum() {
        return this.currentAmountSum;
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
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final Long getEndDateStamp() {
        return this.endDateStamp;
    }

    @Nullable
    public final String getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }
}
