package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/InsSingleRepaymentPlanDetail;", "", "currentTerm", "", "interest", "", "outstandingAmount", "principal", "repaymentDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterest", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOutstandingAmount", "getPrincipal", "getRepaymentDate", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InsSingleRepaymentPlanDetail {

    @Nullable
    private final Integer currentTerm;

    @Nullable
    private final Long interest;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long principal;

    @Nullable
    private final Long repaymentDate;

    public InsSingleRepaymentPlanDetail(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10) {
        this.currentTerm = num;
        this.interest = l5;
        this.outstandingAmount = l6;
        this.principal = l8;
        this.repaymentDate = l10;
    }

    @Nullable
    public final Integer getCurrentTerm() {
        return this.currentTerm;
    }

    @Nullable
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }
}
