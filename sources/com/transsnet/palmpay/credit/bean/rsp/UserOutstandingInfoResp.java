package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/UserOutstandingInfoResp;", "", "flexiCashBillOutstandingAmount", "", "installmentLoanCardNo", "", "installmentLoanAccountStatus", "", "installmentLoanBillOutstandingAmount", "installmentLoanRepaymentDate", "installmentLoanNo", "installmentLoanBillId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getFlexiCashBillOutstandingAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInstallmentLoanCardNo", "()Ljava/lang/String;", "getInstallmentLoanAccountStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInstallmentLoanBillOutstandingAmount", "getInstallmentLoanRepaymentDate", "getInstallmentLoanNo", "getInstallmentLoanBillId", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserOutstandingInfoResp {

    @Nullable
    private final Long flexiCashBillOutstandingAmount;

    @Nullable
    private final Integer installmentLoanAccountStatus;

    @Nullable
    private final Long installmentLoanBillId;

    @Nullable
    private final Long installmentLoanBillOutstandingAmount;

    @Nullable
    private final String installmentLoanCardNo;

    @Nullable
    private final String installmentLoanNo;

    @Nullable
    private final Long installmentLoanRepaymentDate;

    public UserOutstandingInfoResp(@Nullable Long l5, @Nullable String str, @Nullable Integer num, @Nullable Long l6, @Nullable Long l8, @Nullable String str2, @Nullable Long l10) {
        this.flexiCashBillOutstandingAmount = l5;
        this.installmentLoanCardNo = str;
        this.installmentLoanAccountStatus = num;
        this.installmentLoanBillOutstandingAmount = l6;
        this.installmentLoanRepaymentDate = l8;
        this.installmentLoanNo = str2;
        this.installmentLoanBillId = l10;
    }

    @Nullable
    public final Long getFlexiCashBillOutstandingAmount() {
        return this.flexiCashBillOutstandingAmount;
    }

    @Nullable
    public final Integer getInstallmentLoanAccountStatus() {
        return this.installmentLoanAccountStatus;
    }

    @Nullable
    public final Long getInstallmentLoanBillId() {
        return this.installmentLoanBillId;
    }

    @Nullable
    public final Long getInstallmentLoanBillOutstandingAmount() {
        return this.installmentLoanBillOutstandingAmount;
    }

    @Nullable
    public final String getInstallmentLoanCardNo() {
        return this.installmentLoanCardNo;
    }

    @Nullable
    public final String getInstallmentLoanNo() {
        return this.installmentLoanNo;
    }

    @Nullable
    public final Long getInstallmentLoanRepaymentDate() {
        return this.installmentLoanRepaymentDate;
    }
}
