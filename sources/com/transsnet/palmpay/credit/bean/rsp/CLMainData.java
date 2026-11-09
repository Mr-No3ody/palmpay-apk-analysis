package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 J2\u00020\u0001:\u0001JB÷\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00105\u001a\u0004\b6\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b9\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b:\u0010'R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b;\u0010'R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00105\u001a\u0004\b@\u00104R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00105\u001a\u0004\bA\u00104R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010>\u001a\u0004\bB\u0010=R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010>\u001a\u0004\bC\u0010=R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\bD\u0010'R\u0013\u0010 \u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLMainData;", "", "applyStatus", "", "config", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainConfig;", "creditCard", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "errorText", "", "okCardBillList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainOkCardBill;", "userTag", "cashLoanWhitelist", "installmentUserA", "", "installmentUserC", "currentCashLoanBill", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCashLoanBill;", "okCardAccountStatus", "cashLoanAccountStatus", "remainingDays", "remainingDate", "", "productSubs", "Lcom/transsnet/palmpay/credit/bean/rsp/ProductSubs;", "instantWhitelist", "palmpayAccount", "exampleAmount", "exampleLoanDailyAmount", "shuntType", "cashAppDownloadUrl", "cashLoanWhitelistData", "Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;", "blacklist", "<init>", "(Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainConfig;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCashLoanBill;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;Z)V", "getApplyStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfig", "()Lcom/transsnet/palmpay/credit/bean/rsp/CLMainConfig;", "getCreditCard", "()Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "getErrorText", "()Ljava/lang/String;", "getOkCardBillList", "()Ljava/util/List;", "getUserTag", "getCashLoanWhitelist", "getInstallmentUserA", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInstallmentUserC", "getCurrentCashLoanBill", "()Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCashLoanBill;", "getOkCardAccountStatus", "getCashLoanAccountStatus", "getRemainingDays", "getRemainingDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProductSubs", "getInstantWhitelist", "getPalmpayAccount", "getExampleAmount", "getExampleLoanDailyAmount", "getShuntType", "getCashAppDownloadUrl", "getCashLoanWhitelistData", "()Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;", "getBlacklist", "()Z", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainData {
    public static final int CL_ACTIVE = 1;
    public static final int CL_ACTIVE_FAILED = 2;
    public static final int CL_DISABLE_STATUS = 5;
    public static final int CL_FROZEN_STATUS = 4;
    public static final int CL_INVALID_STATUS = 2;
    public static final int CL_NOT_ACTIVE = -1;
    public static final int CL_NO_BIND_CARD_STATUS = 3;
    public static final int CL_OVERDUE_STATUS = 1;
    public static final int CL_PENDING = 0;
    public static final int CL_REPAYMENT_EXTEND = 1;

    @NotNull
    public static final String CL_RETRY_TIME_TAG = "RETRY_TIME_TAG";

    @NotNull
    public static final String CL_STATUS_RE_ACTIVE = "RE_ACTIVE";
    public static final int CL_VALID_STATUS = 0;

    @Nullable
    private final Integer applyStatus;
    private final boolean blacklist;

    @Nullable
    private final String cashAppDownloadUrl;

    @Nullable
    private final Integer cashLoanAccountStatus;

    @Nullable
    private final String cashLoanWhitelist;

    @Nullable
    private final CashLoanWhitelistData cashLoanWhitelistData;

    @Nullable
    private final CLMainConfig config;

    @Nullable
    private final CLMainCreditCard creditCard;

    @Nullable
    private final CLMainCashLoanBill currentCashLoanBill;

    @Nullable
    private final String errorText;

    @Nullable
    private final Long exampleAmount;

    @Nullable
    private final Long exampleLoanDailyAmount;

    @Nullable
    private final Boolean installmentUserA;

    @Nullable
    private final Boolean installmentUserC;

    @Nullable
    private final Boolean instantWhitelist;

    @Nullable
    private final Integer okCardAccountStatus;

    @Nullable
    private final List<CLMainOkCardBill> okCardBillList;

    @Nullable
    private final Boolean palmpayAccount;

    @Nullable
    private final List<ProductSubs> productSubs;

    @Nullable
    private final Long remainingDate;

    @Nullable
    private final Integer remainingDays;

    @Nullable
    private final Integer shuntType;

    @Nullable
    private final String userTag;

    public CLMainData(@Nullable Integer num, @Nullable CLMainConfig cLMainConfig, @Nullable CLMainCreditCard cLMainCreditCard, @Nullable String str, @Nullable List<CLMainOkCardBill> list, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CLMainCashLoanBill cLMainCashLoanBill, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l5, @Nullable List<ProductSubs> list2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num5, @Nullable String str4, @Nullable CashLoanWhitelistData cashLoanWhitelistData, boolean z3) {
        this.applyStatus = num;
        this.config = cLMainConfig;
        this.creditCard = cLMainCreditCard;
        this.errorText = str;
        this.okCardBillList = list;
        this.userTag = str2;
        this.cashLoanWhitelist = str3;
        this.installmentUserA = bool;
        this.installmentUserC = bool2;
        this.currentCashLoanBill = cLMainCashLoanBill;
        this.okCardAccountStatus = num2;
        this.cashLoanAccountStatus = num3;
        this.remainingDays = num4;
        this.remainingDate = l5;
        this.productSubs = list2;
        this.instantWhitelist = bool3;
        this.palmpayAccount = bool4;
        this.exampleAmount = l6;
        this.exampleLoanDailyAmount = l8;
        this.shuntType = num5;
        this.cashAppDownloadUrl = str4;
        this.cashLoanWhitelistData = cashLoanWhitelistData;
        this.blacklist = z3;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    public final boolean getBlacklist() {
        return this.blacklist;
    }

    @Nullable
    public final String getCashAppDownloadUrl() {
        return this.cashAppDownloadUrl;
    }

    @Nullable
    public final Integer getCashLoanAccountStatus() {
        return this.cashLoanAccountStatus;
    }

    @Nullable
    public final String getCashLoanWhitelist() {
        return this.cashLoanWhitelist;
    }

    @Nullable
    public final CashLoanWhitelistData getCashLoanWhitelistData() {
        return this.cashLoanWhitelistData;
    }

    @Nullable
    public final CLMainConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final CLMainCreditCard getCreditCard() {
        return this.creditCard;
    }

    @Nullable
    public final CLMainCashLoanBill getCurrentCashLoanBill() {
        return this.currentCashLoanBill;
    }

    @Nullable
    public final String getErrorText() {
        return this.errorText;
    }

    @Nullable
    public final Long getExampleAmount() {
        return this.exampleAmount;
    }

    @Nullable
    public final Long getExampleLoanDailyAmount() {
        return this.exampleLoanDailyAmount;
    }

    @Nullable
    public final Boolean getInstallmentUserA() {
        return this.installmentUserA;
    }

    @Nullable
    public final Boolean getInstallmentUserC() {
        return this.installmentUserC;
    }

    @Nullable
    public final Boolean getInstantWhitelist() {
        return this.instantWhitelist;
    }

    @Nullable
    public final Integer getOkCardAccountStatus() {
        return this.okCardAccountStatus;
    }

    @Nullable
    public final List<CLMainOkCardBill> getOkCardBillList() {
        return this.okCardBillList;
    }

    @Nullable
    public final Boolean getPalmpayAccount() {
        return this.palmpayAccount;
    }

    @Nullable
    public final List<ProductSubs> getProductSubs() {
        return this.productSubs;
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
    public final Integer getShuntType() {
        return this.shuntType;
    }

    @Nullable
    public final String getUserTag() {
        return this.userTag;
    }
}
