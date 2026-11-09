package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLHistoryBillDetail;", "", "loanAmount", "", "loanNo", "", "loanTime", "unpaidAmount", "id", "repaymentStatus", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)V", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanNo", "()Ljava/lang/String;", "getLoanTime", "getUnpaidAmount", "getId", "getRepaymentStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLHistoryBillDetail {

    @Nullable
    private final Long id;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final String loanNo;

    @Nullable
    private final Long loanTime;

    @Nullable
    private final Integer repaymentStatus;

    @Nullable
    private final Long unpaidAmount;

    public CLHistoryBillDetail(@Nullable Long l5, @Nullable String str, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Integer num) {
        this.loanAmount = l5;
        this.loanNo = str;
        this.loanTime = l6;
        this.unpaidAmount = l8;
        this.id = l10;
        this.repaymentStatus = num;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final Long getLoanTime() {
        return this.loanTime;
    }

    @Nullable
    public final Integer getRepaymentStatus() {
        return this.repaymentStatus;
    }

    @Nullable
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }
}
