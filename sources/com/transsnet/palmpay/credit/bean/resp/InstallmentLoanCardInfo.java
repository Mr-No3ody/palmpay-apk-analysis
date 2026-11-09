package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/InstallmentLoanCardInfo;", "", "cardNo", "", "mobileNo", "accountType", "", "applySource", "accountStatus", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, FirebaseAnalytics.Param.CURRENCY, "accountId", "creditQuota", "availableBalance", "", "outStandingAmount", "maxLoanDays", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)V", "getCardNo", "()Ljava/lang/String;", "getMobileNo", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getApplySource", "getAccountStatus", "getCountryCode", "getCurrency", "getAccountId", "getCreditQuota", "getAvailableBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOutStandingAmount", "getMaxLoanDays", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstallmentLoanCardInfo {

    @Nullable
    private final String accountId;

    @Nullable
    private final Integer accountStatus;

    @Nullable
    private final Integer accountType;

    @Nullable
    private final Integer applySource;

    @Nullable
    private final Long availableBalance;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String countryCode;

    @Nullable
    private final Integer creditQuota;

    @Nullable
    private final String currency;

    @Nullable
    private final Integer maxLoanDays;

    @Nullable
    private final String mobileNo;

    @Nullable
    private final Long outStandingAmount;

    public InstallmentLoanCardInfo(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num4, @Nullable Long l5, @Nullable Long l6, @Nullable Integer num5) {
        this.cardNo = str;
        this.mobileNo = str2;
        this.accountType = num;
        this.applySource = num2;
        this.accountStatus = num3;
        this.countryCode = str3;
        this.currency = str4;
        this.accountId = str5;
        this.creditQuota = num4;
        this.availableBalance = l5;
        this.outStandingAmount = l6;
        this.maxLoanDays = num5;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Integer getApplySource() {
        return this.applySource;
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
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final Integer getCreditQuota() {
        return this.creditQuota;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getMaxLoanDays() {
        return this.maxLoanDays;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final Long getOutStandingAmount() {
        return this.outStandingAmount;
    }
}
