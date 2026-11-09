package com.transsnet.palmpay.credit.bean.rsp;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006<"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentDetail;", "", "loanNo", "", "billId", "", "currentOutstandingAmount", "nextCycleInstallmentAmount", "totalOutstandingAmount", "repaymentDateStamp", "currentCleared", "", "unpaidPenalty", "androidLink", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "cardNo", "accountType", "loanProduct", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoanNo", "()Ljava/lang/String;", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentOutstandingAmount", "getNextCycleInstallmentAmount", "getTotalOutstandingAmount", "getRepaymentDateStamp", "getCurrentCleared", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUnpaidPenalty", "getAndroidLink", "getWaiverInfo", "()Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "getCardNo", "getAccountType", "getLoanProduct", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentDetail;", "equals", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoanHomeRepaymentDetail {

    @Nullable
    private final String accountType;

    @Nullable
    private final String androidLink;

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Boolean currentCleared;

    @Nullable
    private final Long currentOutstandingAmount;

    @Nullable
    private final String loanNo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Long nextCycleInstallmentAmount;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Long totalOutstandingAmount;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final WaiverInfo waiverInfo;

    public LoanHomeRepaymentDetail(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Boolean bool, @Nullable Long l12, @Nullable String str2, @Nullable WaiverInfo waiverInfo, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.loanNo = str;
        this.billId = l5;
        this.currentOutstandingAmount = l6;
        this.nextCycleInstallmentAmount = l8;
        this.totalOutstandingAmount = l10;
        this.repaymentDateStamp = l11;
        this.currentCleared = bool;
        this.unpaidPenalty = l12;
        this.androidLink = str2;
        this.waiverInfo = waiverInfo;
        this.cardNo = str3;
        this.accountType = str4;
        this.loanProduct = str5;
    }

    public static /* synthetic */ LoanHomeRepaymentDetail copy$default(LoanHomeRepaymentDetail loanHomeRepaymentDetail, String str, Long l5, Long l6, Long l8, Long l10, Long l11, Boolean bool, Long l12, String str2, WaiverInfo waiverInfo, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = loanHomeRepaymentDetail.loanNo;
        }
        return loanHomeRepaymentDetail.copy(str, (i7 & 2) != 0 ? loanHomeRepaymentDetail.billId : l5, (i7 & 4) != 0 ? loanHomeRepaymentDetail.currentOutstandingAmount : l6, (i7 & 8) != 0 ? loanHomeRepaymentDetail.nextCycleInstallmentAmount : l8, (i7 & 16) != 0 ? loanHomeRepaymentDetail.totalOutstandingAmount : l10, (i7 & 32) != 0 ? loanHomeRepaymentDetail.repaymentDateStamp : l11, (i7 & 64) != 0 ? loanHomeRepaymentDetail.currentCleared : bool, (i7 & 128) != 0 ? loanHomeRepaymentDetail.unpaidPenalty : l12, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? loanHomeRepaymentDetail.androidLink : str2, (i7 & 512) != 0 ? loanHomeRepaymentDetail.waiverInfo : waiverInfo, (i7 & 1024) != 0 ? loanHomeRepaymentDetail.cardNo : str3, (i7 & 2048) != 0 ? loanHomeRepaymentDetail.accountType : str4, (i7 & 4096) != 0 ? loanHomeRepaymentDetail.loanProduct : str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCurrentOutstandingAmount() {
        return this.currentOutstandingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getNextCycleInstallmentAmount() {
        return this.nextCycleInstallmentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTotalOutstandingAmount() {
        return this.totalOutstandingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getCurrentCleared() {
        return this.currentCleared;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @NotNull
    public final LoanHomeRepaymentDetail copy(@Nullable String loanNo, @Nullable Long billId, @Nullable Long currentOutstandingAmount, @Nullable Long nextCycleInstallmentAmount, @Nullable Long totalOutstandingAmount, @Nullable Long repaymentDateStamp, @Nullable Boolean currentCleared, @Nullable Long unpaidPenalty, @Nullable String androidLink, @Nullable WaiverInfo waiverInfo, @Nullable String cardNo, @Nullable String accountType, @Nullable String loanProduct) {
        return new LoanHomeRepaymentDetail(loanNo, billId, currentOutstandingAmount, nextCycleInstallmentAmount, totalOutstandingAmount, repaymentDateStamp, currentCleared, unpaidPenalty, androidLink, waiverInfo, cardNo, accountType, loanProduct);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoanHomeRepaymentDetail)) {
            return false;
        }
        LoanHomeRepaymentDetail loanHomeRepaymentDetail = (LoanHomeRepaymentDetail) other;
        return Intrinsics.c(this.loanNo, loanHomeRepaymentDetail.loanNo) && Intrinsics.c(this.billId, loanHomeRepaymentDetail.billId) && Intrinsics.c(this.currentOutstandingAmount, loanHomeRepaymentDetail.currentOutstandingAmount) && Intrinsics.c(this.nextCycleInstallmentAmount, loanHomeRepaymentDetail.nextCycleInstallmentAmount) && Intrinsics.c(this.totalOutstandingAmount, loanHomeRepaymentDetail.totalOutstandingAmount) && Intrinsics.c(this.repaymentDateStamp, loanHomeRepaymentDetail.repaymentDateStamp) && Intrinsics.c(this.currentCleared, loanHomeRepaymentDetail.currentCleared) && Intrinsics.c(this.unpaidPenalty, loanHomeRepaymentDetail.unpaidPenalty) && Intrinsics.c(this.androidLink, loanHomeRepaymentDetail.androidLink) && Intrinsics.c(this.waiverInfo, loanHomeRepaymentDetail.waiverInfo) && Intrinsics.c(this.cardNo, loanHomeRepaymentDetail.cardNo) && Intrinsics.c(this.accountType, loanHomeRepaymentDetail.accountType) && Intrinsics.c(this.loanProduct, loanHomeRepaymentDetail.loanProduct);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Boolean getCurrentCleared() {
        return this.currentCleared;
    }

    @Nullable
    public final Long getCurrentOutstandingAmount() {
        return this.currentOutstandingAmount;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Long getNextCycleInstallmentAmount() {
        return this.nextCycleInstallmentAmount;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Long getTotalOutstandingAmount() {
        return this.totalOutstandingAmount;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    public int hashCode() {
        String str = this.loanNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.billId;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.currentOutstandingAmount;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.nextCycleInstallmentAmount;
        int iHashCode4 = (iHashCode3 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.totalOutstandingAmount;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.repaymentDateStamp;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.currentCleared;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.unpaidPenalty;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.androidLink;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WaiverInfo waiverInfo = this.waiverInfo;
        int iHashCode10 = (iHashCode9 + (waiverInfo == null ? 0 : waiverInfo.hashCode())) * 31;
        String str3 = this.cardNo;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountType;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.loanProduct;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.loanNo;
        Long l5 = this.billId;
        Long l6 = this.currentOutstandingAmount;
        Long l8 = this.nextCycleInstallmentAmount;
        Long l10 = this.totalOutstandingAmount;
        Long l11 = this.repaymentDateStamp;
        Boolean bool = this.currentCleared;
        Long l12 = this.unpaidPenalty;
        String str2 = this.androidLink;
        WaiverInfo waiverInfo = this.waiverInfo;
        String str3 = this.cardNo;
        String str4 = this.accountType;
        String str5 = this.loanProduct;
        StringBuilder sb2 = new StringBuilder("LoanHomeRepaymentDetail(loanNo=");
        sb2.append(str);
        sb2.append(", billId=");
        sb2.append(l5);
        sb2.append(", currentOutstandingAmount=");
        q0.w(sb2, l6, ", nextCycleInstallmentAmount=", l8, ", totalOutstandingAmount=");
        q0.w(sb2, l10, ", repaymentDateStamp=", l11, ", currentCleared=");
        sb2.append(bool);
        sb2.append(", unpaidPenalty=");
        sb2.append(l12);
        sb2.append(", androidLink=");
        sb2.append(str2);
        sb2.append(", waiverInfo=");
        sb2.append(waiverInfo);
        sb2.append(", cardNo=");
        u.x(sb2, str3, ", accountType=", str4, ", loanProduct=");
        return G.r(sb2, str5, ")");
    }

    public /* synthetic */ LoanHomeRepaymentDetail(String str, Long l5, Long l6, Long l8, Long l10, Long l11, Boolean bool, Long l12, String str2, WaiverInfo waiverInfo, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l5, l6, l8, l10, l11, bool, l12, str2, (i7 & 512) != 0 ? null : waiverInfo, str3, str4, str5);
    }
}
