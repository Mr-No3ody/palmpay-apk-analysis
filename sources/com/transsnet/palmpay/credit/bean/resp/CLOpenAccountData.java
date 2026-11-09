package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.businessLoan.rnbridge.LocationServiceBridge;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010&\"\u0004\b(\u0010)R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b*\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b+\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b,\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b-\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b7\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b9\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;", "Ljava/io/Serializable;", "applyStatus", "", "creditLimit", "", "errorContent", "", "applyId", "productSubId", "remainingDays", "dailyAmount", "maxLoanDay", "config", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountConfig;", "cashMinInterestRate", "", "flexiCashRiskLevel", "Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;", "installmentLoanInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", LocationServiceBridge.ACTION_CHECK_STATUS, "loanProduct", "accountType", "migrateUrl", "migrateFlag", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountConfig;Ljava/lang/Double;Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getApplyStatus", "()Ljava/lang/Integer;", "setApplyStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreditLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorContent", "()Ljava/lang/String;", "getApplyId", "setApplyId", "(Ljava/lang/String;)V", "getProductSubId", "getRemainingDays", "getDailyAmount", "getMaxLoanDay", "getConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountConfig;", "getCashMinInterestRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFlexiCashRiskLevel", "()Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;", "getInstallmentLoanInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", "getCheckStatus", "getLoanProduct", "getAccountType", "getMigrateUrl", "getMigrateFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOpenAccountData implements Serializable {

    @Nullable
    private final Integer accountType;

    @Nullable
    private String applyId;

    @Nullable
    private Integer applyStatus;

    @Nullable
    private final Double cashMinInterestRate;

    @Nullable
    private final Integer checkStatus;

    @Nullable
    private final CLOpenAccountConfig config;

    @Nullable
    private final Long creditLimit;

    @Nullable
    private final Long dailyAmount;

    @NotNull
    private final String errorContent;

    @Nullable
    private final CardRiskLevelResp flexiCashRiskLevel;

    @Nullable
    private final QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto installmentLoanInfo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Long maxLoanDay;

    @Nullable
    private final Boolean migrateFlag;

    @Nullable
    private final String migrateUrl;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final Integer remainingDays;

    public CLOpenAccountData(@Nullable Integer num, @Nullable Long l5, @NotNull String errorContent, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l6, @Nullable Long l8, @Nullable CLOpenAccountConfig cLOpenAccountConfig, @Nullable Double d2, @Nullable CardRiskLevelResp cardRiskLevelResp, @Nullable QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto adjustQuotaBusinessResDto, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(errorContent, "errorContent");
        this.applyStatus = num;
        this.creditLimit = l5;
        this.errorContent = errorContent;
        this.applyId = str;
        this.productSubId = num2;
        this.remainingDays = num3;
        this.dailyAmount = l6;
        this.maxLoanDay = l8;
        this.config = cLOpenAccountConfig;
        this.cashMinInterestRate = d2;
        this.flexiCashRiskLevel = cardRiskLevelResp;
        this.installmentLoanInfo = adjustQuotaBusinessResDto;
        this.checkStatus = num4;
        this.loanProduct = str2;
        this.accountType = num5;
        this.migrateUrl = str3;
        this.migrateFlag = bool;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    public final Double getCashMinInterestRate() {
        return this.cashMinInterestRate;
    }

    @Nullable
    public final Integer getCheckStatus() {
        return this.checkStatus;
    }

    @Nullable
    public final CLOpenAccountConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final Long getCreditLimit() {
        return this.creditLimit;
    }

    @Nullable
    public final Long getDailyAmount() {
        return this.dailyAmount;
    }

    @NotNull
    public final String getErrorContent() {
        return this.errorContent;
    }

    @Nullable
    public final CardRiskLevelResp getFlexiCashRiskLevel() {
        return this.flexiCashRiskLevel;
    }

    @Nullable
    public final QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto getInstallmentLoanInfo() {
        return this.installmentLoanInfo;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Long getMaxLoanDay() {
        return this.maxLoanDay;
    }

    @Nullable
    public final Boolean getMigrateFlag() {
        return this.migrateFlag;
    }

    @Nullable
    public final String getMigrateUrl() {
        return this.migrateUrl;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }

    public final void setApplyStatus(@Nullable Integer num) {
        this.applyStatus = num;
    }
}
