package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/InstallmentLoanMainPageData;", "", "applyStatus", "", "remainingDays", "remainingDate", "", "cardNo", "", "installmentLoanCardInfo", "Lcom/transsnet/palmpay/credit/bean/resp/InstallmentLoanCardInfo;", "currentRepaymentDetail", "Lcom/transsnet/palmpay/credit/bean/resp/CurrentRepaymentDetail;", "loanConfig", "Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "accountPrompt", "ifJointDebit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/InstallmentLoanCardInfo;Lcom/transsnet/palmpay/credit/bean/resp/CurrentRepaymentDetail;Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;Ljava/lang/String;Ljava/lang/Integer;)V", "getApplyStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemainingDays", "getRemainingDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getInstallmentLoanCardInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/InstallmentLoanCardInfo;", "getCurrentRepaymentDetail", "()Lcom/transsnet/palmpay/credit/bean/resp/CurrentRepaymentDetail;", "getLoanConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "getAccountPrompt", "getIfJointDebit", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstallmentLoanMainPageData {

    @Nullable
    private final String accountPrompt;

    @Nullable
    private final Integer applyStatus;

    @Nullable
    private final String cardNo;

    @Nullable
    private final CurrentRepaymentDetail currentRepaymentDetail;

    @Nullable
    private final Integer ifJointDebit;

    @Nullable
    private final InstallmentLoanCardInfo installmentLoanCardInfo;

    @Nullable
    private final LoanConfig loanConfig;

    @Nullable
    private final Long remainingDate;

    @Nullable
    private final Integer remainingDays;

    public InstallmentLoanMainPageData(@Nullable Integer num, @Nullable Integer num2, @Nullable Long l5, @Nullable String str, @Nullable InstallmentLoanCardInfo installmentLoanCardInfo, @Nullable CurrentRepaymentDetail currentRepaymentDetail, @Nullable LoanConfig loanConfig, @Nullable String str2, @Nullable Integer num3) {
        this.applyStatus = num;
        this.remainingDays = num2;
        this.remainingDate = l5;
        this.cardNo = str;
        this.installmentLoanCardInfo = installmentLoanCardInfo;
        this.currentRepaymentDetail = currentRepaymentDetail;
        this.loanConfig = loanConfig;
        this.accountPrompt = str2;
        this.ifJointDebit = num3;
    }

    @Nullable
    public final String getAccountPrompt() {
        return this.accountPrompt;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final CurrentRepaymentDetail getCurrentRepaymentDetail() {
        return this.currentRepaymentDetail;
    }

    @Nullable
    public final Integer getIfJointDebit() {
        return this.ifJointDebit;
    }

    @Nullable
    public final InstallmentLoanCardInfo getInstallmentLoanCardInfo() {
        return this.installmentLoanCardInfo;
    }

    @Nullable
    public final LoanConfig getLoanConfig() {
        return this.loanConfig;
    }

    @Nullable
    public final Long getRemainingDate() {
        return this.remainingDate;
    }

    @Nullable
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }
}
