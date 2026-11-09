package com.transsnet.palmpay.managemoney.bean.resp;

import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp$CashBoxOrderDetail;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp$CashBoxOrderDetail;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp$CashBoxOrderDetail;", "CashBoxOrderDetail", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCashBoxOrderDetailResp extends CommonResult {

    @Nullable
    private final CashBoxOrderDetail data;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJÞ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u000eHÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b2\u0010\u001d¨\u0006L"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp$CashBoxOrderDetail;", "", "operateName", "", "paymentAmount", "", "transferAmount", "fee", "principal", "annualizedIncomeRatio", "", "completionTime", "createDate", "paymentType", "", "transactionType", "transactionId", "payStatus", "bankCard", "payerBank", "accountNumber", "accountName", "headPortrait", "couponAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;JJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getOperateName", "()Ljava/lang/String;", "getPaymentAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTransferAmount", "getFee", "getPrincipal", "getAnnualizedIncomeRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCompletionTime", "()J", "getCreateDate", "getPaymentType", "()I", "getTransactionType", "getTransactionId", "getPayStatus", "getBankCard", "getPayerBank", "getAccountNumber", "getAccountName", "getHeadPortrait", "getCouponAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;JJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxOrderDetailResp$CashBoxOrderDetail;", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxOrderDetail {

        @Nullable
        private final String accountName;

        @Nullable
        private final String accountNumber;

        @Nullable
        private final Float annualizedIncomeRatio;

        @Nullable
        private final String bankCard;
        private final long completionTime;

        @Nullable
        private final Long couponAmount;
        private final long createDate;

        @Nullable
        private final Long fee;

        @Nullable
        private final String headPortrait;

        @Nullable
        private final String operateName;
        private final int payStatus;

        @Nullable
        private final String payerBank;

        @Nullable
        private final Long paymentAmount;
        private final int paymentType;

        @Nullable
        private final Long principal;

        @Nullable
        private final String transactionId;

        @Nullable
        private final String transactionType;

        @Nullable
        private final Long transferAmount;

        public CashBoxOrderDetail(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Float f10, long j6, long j10, int i7, @Nullable String str2, @Nullable String str3, int i10, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l11) {
            this.operateName = str;
            this.paymentAmount = l5;
            this.transferAmount = l6;
            this.fee = l8;
            this.principal = l10;
            this.annualizedIncomeRatio = f10;
            this.completionTime = j6;
            this.createDate = j10;
            this.paymentType = i7;
            this.transactionType = str2;
            this.transactionId = str3;
            this.payStatus = i10;
            this.bankCard = str4;
            this.payerBank = str5;
            this.accountNumber = str6;
            this.accountName = str7;
            this.headPortrait = str8;
            this.couponAmount = l11;
        }

        public static /* synthetic */ CashBoxOrderDetail copy$default(CashBoxOrderDetail cashBoxOrderDetail, String str, Long l5, Long l6, Long l8, Long l10, Float f10, long j6, long j10, int i7, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, Long l11, int i11, Object obj) {
            Long l12;
            String str9;
            String str10 = (i11 & 1) != 0 ? cashBoxOrderDetail.operateName : str;
            Long l13 = (i11 & 2) != 0 ? cashBoxOrderDetail.paymentAmount : l5;
            Long l14 = (i11 & 4) != 0 ? cashBoxOrderDetail.transferAmount : l6;
            Long l15 = (i11 & 8) != 0 ? cashBoxOrderDetail.fee : l8;
            Long l16 = (i11 & 16) != 0 ? cashBoxOrderDetail.principal : l10;
            Float f11 = (i11 & 32) != 0 ? cashBoxOrderDetail.annualizedIncomeRatio : f10;
            long j11 = (i11 & 64) != 0 ? cashBoxOrderDetail.completionTime : j6;
            long j12 = (i11 & 128) != 0 ? cashBoxOrderDetail.createDate : j10;
            int i12 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cashBoxOrderDetail.paymentType : i7;
            String str11 = (i11 & 512) != 0 ? cashBoxOrderDetail.transactionType : str2;
            String str12 = (i11 & 1024) != 0 ? cashBoxOrderDetail.transactionId : str3;
            int i13 = (i11 & 2048) != 0 ? cashBoxOrderDetail.payStatus : i10;
            String str13 = str10;
            String str14 = (i11 & 4096) != 0 ? cashBoxOrderDetail.bankCard : str4;
            String str15 = (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? cashBoxOrderDetail.payerBank : str5;
            String str16 = (i11 & 16384) != 0 ? cashBoxOrderDetail.accountNumber : str6;
            String str17 = (i11 & 32768) != 0 ? cashBoxOrderDetail.accountName : str7;
            String str18 = (i11 & 65536) != 0 ? cashBoxOrderDetail.headPortrait : str8;
            if ((i11 & 131072) != 0) {
                str9 = str18;
                l12 = cashBoxOrderDetail.couponAmount;
            } else {
                l12 = l11;
                str9 = str18;
            }
            return cashBoxOrderDetail.copy(str13, l13, l14, l15, l16, f11, j11, j12, i12, str11, str12, i13, str14, str15, str16, str17, str9, l12);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOperateName() {
            return this.operateName;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getTransactionType() {
            return this.transactionType;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getPayStatus() {
            return this.payStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getBankCard() {
            return this.bankCard;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getPayerBank() {
            return this.payerBank;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getPaymentAmount() {
            return this.paymentAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getTransferAmount() {
            return this.transferAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getPrincipal() {
            return this.principal;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Float getAnnualizedIncomeRatio() {
            return this.annualizedIncomeRatio;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getCompletionTime() {
            return this.completionTime;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final long getCreateDate() {
            return this.createDate;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getPaymentType() {
            return this.paymentType;
        }

        @NotNull
        public final CashBoxOrderDetail copy(@Nullable String operateName, @Nullable Long paymentAmount, @Nullable Long transferAmount, @Nullable Long fee, @Nullable Long principal, @Nullable Float annualizedIncomeRatio, long completionTime, long createDate, int paymentType, @Nullable String transactionType, @Nullable String transactionId, int payStatus, @Nullable String bankCard, @Nullable String payerBank, @Nullable String accountNumber, @Nullable String accountName, @Nullable String headPortrait, @Nullable Long couponAmount) {
            return new CashBoxOrderDetail(operateName, paymentAmount, transferAmount, fee, principal, annualizedIncomeRatio, completionTime, createDate, paymentType, transactionType, transactionId, payStatus, bankCard, payerBank, accountNumber, accountName, headPortrait, couponAmount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxOrderDetail)) {
                return false;
            }
            CashBoxOrderDetail cashBoxOrderDetail = (CashBoxOrderDetail) other;
            return Intrinsics.c(this.operateName, cashBoxOrderDetail.operateName) && Intrinsics.c(this.paymentAmount, cashBoxOrderDetail.paymentAmount) && Intrinsics.c(this.transferAmount, cashBoxOrderDetail.transferAmount) && Intrinsics.c(this.fee, cashBoxOrderDetail.fee) && Intrinsics.c(this.principal, cashBoxOrderDetail.principal) && Intrinsics.c(this.annualizedIncomeRatio, cashBoxOrderDetail.annualizedIncomeRatio) && this.completionTime == cashBoxOrderDetail.completionTime && this.createDate == cashBoxOrderDetail.createDate && this.paymentType == cashBoxOrderDetail.paymentType && Intrinsics.c(this.transactionType, cashBoxOrderDetail.transactionType) && Intrinsics.c(this.transactionId, cashBoxOrderDetail.transactionId) && this.payStatus == cashBoxOrderDetail.payStatus && Intrinsics.c(this.bankCard, cashBoxOrderDetail.bankCard) && Intrinsics.c(this.payerBank, cashBoxOrderDetail.payerBank) && Intrinsics.c(this.accountNumber, cashBoxOrderDetail.accountNumber) && Intrinsics.c(this.accountName, cashBoxOrderDetail.accountName) && Intrinsics.c(this.headPortrait, cashBoxOrderDetail.headPortrait) && Intrinsics.c(this.couponAmount, cashBoxOrderDetail.couponAmount);
        }

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Nullable
        public final Float getAnnualizedIncomeRatio() {
            return this.annualizedIncomeRatio;
        }

        @Nullable
        public final String getBankCard() {
            return this.bankCard;
        }

        public final long getCompletionTime() {
            return this.completionTime;
        }

        @Nullable
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        public final long getCreateDate() {
            return this.createDate;
        }

        @Nullable
        public final Long getFee() {
            return this.fee;
        }

        @Nullable
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        @Nullable
        public final String getOperateName() {
            return this.operateName;
        }

        public final int getPayStatus() {
            return this.payStatus;
        }

        @Nullable
        public final String getPayerBank() {
            return this.payerBank;
        }

        @Nullable
        public final Long getPaymentAmount() {
            return this.paymentAmount;
        }

        public final int getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        public final Long getPrincipal() {
            return this.principal;
        }

        @Nullable
        public final String getTransactionId() {
            return this.transactionId;
        }

        @Nullable
        public final String getTransactionType() {
            return this.transactionType;
        }

        @Nullable
        public final Long getTransferAmount() {
            return this.transferAmount;
        }

        public int hashCode() {
            String str = this.operateName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l5 = this.paymentAmount;
            int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.transferAmount;
            int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l8 = this.fee;
            int iHashCode4 = (iHashCode3 + (l8 == null ? 0 : l8.hashCode())) * 31;
            Long l10 = this.principal;
            int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Float f10 = this.annualizedIncomeRatio;
            int iB = u.b(this.paymentType, q0.b(q0.b((iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31, this.completionTime), 31, this.createDate), 31);
            String str2 = this.transactionType;
            int iHashCode6 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.transactionId;
            int iB2 = u.b(this.payStatus, (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            String str4 = this.bankCard;
            int iHashCode7 = (iB2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payerBank;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.accountNumber;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.accountName;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.headPortrait;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Long l11 = this.couponAmount;
            return iHashCode11 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.operateName;
            Long l5 = this.paymentAmount;
            Long l6 = this.transferAmount;
            Long l8 = this.fee;
            Long l10 = this.principal;
            Float f10 = this.annualizedIncomeRatio;
            long j6 = this.completionTime;
            long j10 = this.createDate;
            int i7 = this.paymentType;
            String str2 = this.transactionType;
            String str3 = this.transactionId;
            int i10 = this.payStatus;
            String str4 = this.bankCard;
            String str5 = this.payerBank;
            String str6 = this.accountNumber;
            String str7 = this.accountName;
            String str8 = this.headPortrait;
            Long l11 = this.couponAmount;
            StringBuilder sb2 = new StringBuilder("CashBoxOrderDetail(operateName=");
            sb2.append(str);
            sb2.append(", paymentAmount=");
            sb2.append(l5);
            sb2.append(", transferAmount=");
            q0.w(sb2, l6, ", fee=", l8, ", principal=");
            sb2.append(l10);
            sb2.append(", annualizedIncomeRatio=");
            sb2.append(f10);
            sb2.append(", completionTime=");
            sb2.append(j6);
            u.v(sb2, ", createDate=", j10, ", paymentType=");
            sb2.append(i7);
            sb2.append(", transactionType=");
            sb2.append(str2);
            sb2.append(", transactionId=");
            sb2.append(str3);
            sb2.append(", payStatus=");
            sb2.append(i10);
            sb2.append(", bankCard=");
            u.x(sb2, str4, ", payerBank=", str5, ", accountNumber=");
            u.x(sb2, str6, ", accountName=", str7, ", headPortrait=");
            sb2.append(str8);
            sb2.append(", couponAmount=");
            sb2.append(l11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public GetCashBoxOrderDetailResp(@Nullable CashBoxOrderDetail cashBoxOrderDetail) {
        this.data = cashBoxOrderDetail;
    }

    @Nullable
    public final CashBoxOrderDetail getData() {
        return this.data;
    }
}
