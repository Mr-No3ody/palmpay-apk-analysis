package com.transsnet.palmpay.credit.bean.rsp;

import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b'\u0010(J\u0006\u0010Y\u001a\u00020\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b4\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b8\u0010*R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b9\u0010-R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b:\u0010-R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00103\u001a\u0004\b;\u00102R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b<\u0010-R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b=\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b>\u0010*R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010A\u001a\u0004\bB\u0010@R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\bD\u0010*R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\bE\u0010-R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bH\u0010-\"\u0004\bI\u0010JR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bK\u0010-\"\u0004\bL\u0010JR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0015\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\bU\u0010-R\u0015\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\bV\u0010*R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u00100R\u0013\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u00100¨\u0006Z"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "", "accountStatus", "", "availableBalance", "", "cardNo", "", "interestRatio", "", "repaymentDateStamp", "accountStatusPrompt", "Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;", "accountPrompt", "largeLoanTerm", "largeLoanMinAmount", "loanAmountMax", "loanMinRatio", "allOutstandingAmount", "useBalance", "applyStatus", "instantWhitelist", "", "noLockWhitelist", "userTag", "remainingDays", "remainingDate", "cashLoanWhitelistData", "Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;", "tempQuotaExpirationDate", "tempQuota", "userOutstandingInfoResp", "Lcom/transsnet/palmpay/credit/bean/rsp/UserOutstandingInfoResp;", "loanConfig", "Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "creditQuota", "accountType", "accountId", "loanProduct", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/rsp/UserOutstandingInfoResp;Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAccountStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailableBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getInterestRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRepaymentDateStamp", "getAccountStatusPrompt", "()Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;", "getAccountPrompt", "getLargeLoanTerm", "getLargeLoanMinAmount", "getLoanAmountMax", "getLoanMinRatio", "getAllOutstandingAmount", "getUseBalance", "getApplyStatus", "getInstantWhitelist", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNoLockWhitelist", "getUserTag", "getRemainingDays", "getRemainingDate", "getCashLoanWhitelistData", "()Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;", "getTempQuotaExpirationDate", "setTempQuotaExpirationDate", "(Ljava/lang/Long;)V", "getTempQuota", "setTempQuota", "getUserOutstandingInfoResp", "()Lcom/transsnet/palmpay/credit/bean/rsp/UserOutstandingInfoResp;", "setUserOutstandingInfoResp", "(Lcom/transsnet/palmpay/credit/bean/rsp/UserOutstandingInfoResp;)V", "getLoanConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "setLoanConfig", "(Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;)V", "getCreditQuota", "getAccountType", "getAccountId", "getLoanProduct", "hasLoan", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainCreditCard {

    @Nullable
    private final String accountId;

    @Nullable
    private final String accountPrompt;

    @Nullable
    private final Integer accountStatus;

    @Nullable
    private final TopTipsData accountStatusPrompt;

    @Nullable
    private final Integer accountType;

    @Nullable
    private final Long allOutstandingAmount;

    @Nullable
    private final Integer applyStatus;

    @Nullable
    private final Long availableBalance;

    @Nullable
    private final String cardNo;

    @Nullable
    private final CashLoanWhitelistData cashLoanWhitelistData;

    @Nullable
    private final Long creditQuota;

    @Nullable
    private final Boolean instantWhitelist;

    @Nullable
    private final Double interestRatio;

    @Nullable
    private final Long largeLoanMinAmount;

    @Nullable
    private final Integer largeLoanTerm;

    @Nullable
    private final Long loanAmountMax;

    @Nullable
    private LoanConfig loanConfig;

    @Nullable
    private final Double loanMinRatio;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Boolean noLockWhitelist;

    @Nullable
    private final Long remainingDate;

    @Nullable
    private final Integer remainingDays;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private Long tempQuota;

    @Nullable
    private Long tempQuotaExpirationDate;

    @Nullable
    private final Long useBalance;

    @Nullable
    private UserOutstandingInfoResp userOutstandingInfoResp;

    @Nullable
    private final String userTag;

    public CLMainCreditCard(@Nullable Integer num, @Nullable Long l5, @Nullable String str, @Nullable Double d2, @Nullable Long l6, @Nullable TopTipsData topTipsData, @Nullable String str2, @Nullable Integer num2, @Nullable Long l8, @Nullable Long l10, @Nullable Double d10, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable Integer num4, @Nullable Long l13, @Nullable CashLoanWhitelistData cashLoanWhitelistData, @Nullable Long l14, @Nullable Long l15, @Nullable UserOutstandingInfoResp userOutstandingInfoResp, @Nullable LoanConfig loanConfig, @Nullable Long l16, @Nullable Integer num5, @Nullable String str4, @Nullable String str5) {
        this.accountStatus = num;
        this.availableBalance = l5;
        this.cardNo = str;
        this.interestRatio = d2;
        this.repaymentDateStamp = l6;
        this.accountStatusPrompt = topTipsData;
        this.accountPrompt = str2;
        this.largeLoanTerm = num2;
        this.largeLoanMinAmount = l8;
        this.loanAmountMax = l10;
        this.loanMinRatio = d10;
        this.allOutstandingAmount = l11;
        this.useBalance = l12;
        this.applyStatus = num3;
        this.instantWhitelist = bool;
        this.noLockWhitelist = bool2;
        this.userTag = str3;
        this.remainingDays = num4;
        this.remainingDate = l13;
        this.cashLoanWhitelistData = cashLoanWhitelistData;
        this.tempQuotaExpirationDate = l14;
        this.tempQuota = l15;
        this.userOutstandingInfoResp = userOutstandingInfoResp;
        this.loanConfig = loanConfig;
        this.creditQuota = l16;
        this.accountType = num5;
        this.accountId = str4;
        this.loanProduct = str5;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountPrompt() {
        return this.accountPrompt;
    }

    @Nullable
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    public final TopTipsData getAccountStatusPrompt() {
        return this.accountStatusPrompt;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getAllOutstandingAmount() {
        return this.allOutstandingAmount;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    public final Long getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final CashLoanWhitelistData getCashLoanWhitelistData() {
        return this.cashLoanWhitelistData;
    }

    @Nullable
    public final Long getCreditQuota() {
        return this.creditQuota;
    }

    @Nullable
    public final Boolean getInstantWhitelist() {
        return this.instantWhitelist;
    }

    @Nullable
    public final Double getInterestRatio() {
        return this.interestRatio;
    }

    @Nullable
    public final Long getLargeLoanMinAmount() {
        return this.largeLoanMinAmount;
    }

    @Nullable
    public final Integer getLargeLoanTerm() {
        return this.largeLoanTerm;
    }

    @Nullable
    public final Long getLoanAmountMax() {
        return this.loanAmountMax;
    }

    @Nullable
    public final LoanConfig getLoanConfig() {
        return this.loanConfig;
    }

    @Nullable
    public final Double getLoanMinRatio() {
        return this.loanMinRatio;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Boolean getNoLockWhitelist() {
        return this.noLockWhitelist;
    }

    @Nullable
    public final Long getRemainingDate() {
        return this.remainingDate;
    }

    @Nullable
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Long getTempQuota() {
        return this.tempQuota;
    }

    @Nullable
    public final Long getTempQuotaExpirationDate() {
        return this.tempQuotaExpirationDate;
    }

    @Nullable
    public final Long getUseBalance() {
        return this.useBalance;
    }

    @Nullable
    public final UserOutstandingInfoResp getUserOutstandingInfoResp() {
        return this.userOutstandingInfoResp;
    }

    @Nullable
    public final String getUserTag() {
        return this.userTag;
    }

    public final boolean hasLoan() {
        Long l5 = this.creditQuota;
        long jLongValue = l5 != null ? l5.longValue() : 0L;
        Long l6 = this.availableBalance;
        return jLongValue > (l6 != null ? l6.longValue() : 0L);
    }

    public final void setLoanConfig(@Nullable LoanConfig loanConfig) {
        this.loanConfig = loanConfig;
    }

    public final void setTempQuota(@Nullable Long l5) {
        this.tempQuota = l5;
    }

    public final void setTempQuotaExpirationDate(@Nullable Long l5) {
        this.tempQuotaExpirationDate = l5;
    }

    public final void setUserOutstandingInfoResp(@Nullable UserOutstandingInfoResp userOutstandingInfoResp) {
        this.userOutstandingInfoResp = userOutstandingInfoResp;
    }
}
