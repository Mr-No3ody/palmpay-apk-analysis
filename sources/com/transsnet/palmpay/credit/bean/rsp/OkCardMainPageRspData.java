package com.transsnet.palmpay.credit.bean.rsp;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b7\u0018\u0000 T2\u00020\u0001:\u0001TB\u008b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u0006\u0010S\u001a\u00020\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b9\u00103R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010-\"\u0004\b>\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b@\u00103R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bA\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\bE\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bF\u00103R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bG\u00103R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\bH\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\bK\u00103R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010MR\u0015\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\bP\u0010&R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\bQ\u0010&R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\bR\u0010&¨\u0006U"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OkCardMainPageRspData;", "", "accountStatus", "", "applyStatus", "availableBalance", "", "billOutstandingAmount", "billId", "cardNo", "", "creditQuota", "overpaymentBalance", "penaltyRatio", "", "repaymentDateStamp", "userTag", "unpaidInterest", "unpaidPenalty", "noLockUserWhitelist", "wallet", "Lcom/transsnet/palmpay/credit/bean/rsp/Wallet;", "outstandingBillCount", "outstandingBillId", "allOutstandingAmount", "userType", "accountStatusPrompt", "Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;", "nextCycleInstallmentAmount", "spreadAvailable", "", "extensionAvailable", "cardLevel", "flexiRemainingDays", "remainingDays", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;JJLjava/lang/Long;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Double;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/rsp/Wallet;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAccountStatus", "()Ljava/lang/Integer;", "setAccountStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApplyStatus", "setApplyStatus", "getAvailableBalance", "()J", "setAvailableBalance", "(J)V", "getBillOutstandingAmount", "setBillOutstandingAmount", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getCreditQuota", "setCreditQuota", "getOverpaymentBalance", "getPenaltyRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRepaymentDateStamp", "setRepaymentDateStamp", "getUserTag", "getUnpaidInterest", "getUnpaidPenalty", "getNoLockUserWhitelist", "getWallet", "()Lcom/transsnet/palmpay/credit/bean/rsp/Wallet;", "getOutstandingBillCount", "getOutstandingBillId", "getAllOutstandingAmount", "getUserType", "getAccountStatusPrompt", "()Lcom/transsnet/palmpay/credit/bean/rsp/TopTipsData;", "getNextCycleInstallmentAmount", "getSpreadAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExtensionAvailable", "getCardLevel", "getFlexiRemainingDays", "getRemainingDays", "unActiveStatus", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkCardMainPageRspData {
    public static final int OC_ACTIVE = 1;
    public static final int OC_ACTIVE_FAILED = 2;
    public static final int OC_DISABLE_STATUS = 5;
    public static final int OC_FROZEN_STATUS = 4;
    public static final int OC_GOLD_CARD_LEVEL = 1;
    public static final int OC_INVALID_STATUS = 2;
    public static final int OC_NOT_ACTIVE = -1;
    public static final int OC_NO_BIND_CARD_STATUS = 3;
    public static final int OC_OVERDUE_STATUS = 1;
    public static final int OC_PENDING = 0;
    public static final int OC_VALID_STATUS = 0;

    @Nullable
    private Integer accountStatus;

    @Nullable
    private final TopTipsData accountStatusPrompt;

    @Nullable
    private final Long allOutstandingAmount;

    @Nullable
    private Integer applyStatus;
    private long availableBalance;

    @Nullable
    private final Long billId;
    private long billOutstandingAmount;

    @Nullable
    private final Integer cardLevel;

    @Nullable
    private final String cardNo;
    private long creditQuota;

    @Nullable
    private final Boolean extensionAvailable;

    @Nullable
    private final Integer flexiRemainingDays;

    @Nullable
    private final Long nextCycleInstallmentAmount;

    @Nullable
    private final String noLockUserWhitelist;

    @Nullable
    private final Integer outstandingBillCount;

    @Nullable
    private final Long outstandingBillId;

    @Nullable
    private final Long overpaymentBalance;

    @Nullable
    private final Double penaltyRatio;

    @Nullable
    private final Integer remainingDays;
    private long repaymentDateStamp;

    @Nullable
    private final Boolean spreadAvailable;

    @Nullable
    private final Long unpaidInterest;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final String userTag;

    @Nullable
    private final Integer userType;

    @NotNull
    private final Wallet wallet;

    public OkCardMainPageRspData(@Nullable Integer num, @Nullable Integer num2, long j6, long j10, @Nullable Long l5, @Nullable String str, long j11, @Nullable Long l6, @Nullable Double d2, long j12, @Nullable String str2, @Nullable Long l8, @Nullable Long l10, @Nullable String str3, @NotNull Wallet wallet, @Nullable Integer num3, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num4, @Nullable TopTipsData topTipsData, @Nullable Long l13, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.accountStatus = num;
        this.applyStatus = num2;
        this.availableBalance = j6;
        this.billOutstandingAmount = j10;
        this.billId = l5;
        this.cardNo = str;
        this.creditQuota = j11;
        this.overpaymentBalance = l6;
        this.penaltyRatio = d2;
        this.repaymentDateStamp = j12;
        this.userTag = str2;
        this.unpaidInterest = l8;
        this.unpaidPenalty = l10;
        this.noLockUserWhitelist = str3;
        this.wallet = wallet;
        this.outstandingBillCount = num3;
        this.outstandingBillId = l11;
        this.allOutstandingAmount = l12;
        this.userType = num4;
        this.accountStatusPrompt = topTipsData;
        this.nextCycleInstallmentAmount = l13;
        this.spreadAvailable = bool;
        this.extensionAvailable = bool2;
        this.cardLevel = num5;
        this.flexiRemainingDays = num6;
        this.remainingDays = num7;
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
    public final Long getAllOutstandingAmount() {
        return this.allOutstandingAmount;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    public final long getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    public final long getBillOutstandingAmount() {
        return this.billOutstandingAmount;
    }

    @Nullable
    public final Integer getCardLevel() {
        return this.cardLevel;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    public final long getCreditQuota() {
        return this.creditQuota;
    }

    @Nullable
    public final Boolean getExtensionAvailable() {
        return this.extensionAvailable;
    }

    @Nullable
    public final Integer getFlexiRemainingDays() {
        return this.flexiRemainingDays;
    }

    @Nullable
    public final Long getNextCycleInstallmentAmount() {
        return this.nextCycleInstallmentAmount;
    }

    @Nullable
    public final String getNoLockUserWhitelist() {
        return this.noLockUserWhitelist;
    }

    @Nullable
    public final Integer getOutstandingBillCount() {
        return this.outstandingBillCount;
    }

    @Nullable
    public final Long getOutstandingBillId() {
        return this.outstandingBillId;
    }

    @Nullable
    public final Long getOverpaymentBalance() {
        return this.overpaymentBalance;
    }

    @Nullable
    public final Double getPenaltyRatio() {
        return this.penaltyRatio;
    }

    @Nullable
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }

    public final long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Boolean getSpreadAvailable() {
        return this.spreadAvailable;
    }

    @Nullable
    public final Long getUnpaidInterest() {
        return this.unpaidInterest;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final String getUserTag() {
        return this.userTag;
    }

    @Nullable
    public final Integer getUserType() {
        return this.userType;
    }

    @NotNull
    public final Wallet getWallet() {
        return this.wallet;
    }

    public final void setAccountStatus(@Nullable Integer num) {
        this.accountStatus = num;
    }

    public final void setApplyStatus(@Nullable Integer num) {
        this.applyStatus = num;
    }

    public final void setAvailableBalance(long j6) {
        this.availableBalance = j6;
    }

    public final void setBillOutstandingAmount(long j6) {
        this.billOutstandingAmount = j6;
    }

    public final void setCreditQuota(long j6) {
        this.creditQuota = j6;
    }

    public final void setRepaymentDateStamp(long j6) {
        this.repaymentDateStamp = j6;
    }

    public final boolean unActiveStatus() {
        Integer num = this.applyStatus;
        return num != null && num.intValue() == -1;
    }

    public /* synthetic */ OkCardMainPageRspData(Integer num, Integer num2, long j6, long j10, Long l5, String str, long j11, Long l6, Double d2, long j12, String str2, Long l8, Long l10, String str3, Wallet wallet, Integer num3, Long l11, Long l12, Integer num4, TopTipsData topTipsData, Long l13, Boolean bool, Boolean bool2, Integer num5, Integer num6, Integer num7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i7 & 4) != 0 ? 0L : j6, (i7 & 8) != 0 ? 0L : j10, l5, str, (i7 & 64) != 0 ? 0L : j11, l6, d2, (i7 & 512) != 0 ? 0L : j12, str2, l8, l10, str3, wallet, num3, l11, l12, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? 1 : num4, topTipsData, l13, bool, bool2, num5, num6, num7);
    }
}
