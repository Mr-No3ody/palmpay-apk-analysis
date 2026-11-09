package com.transsnet.palmpay.credit.bean.rsp;

import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010#J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J¤\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentAccount;", "", "accountType", "", "loanProduct", "", "productTitle", "productIcon", "title", "applyStatus", "accountStatus", "cardNo", "outstandingBillCount", "outstandingBillId", "", "detailList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentDetail;", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)V", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLoanProduct", "()Ljava/lang/String;", "getProductTitle", "getProductIcon", "getTitle", "getApplyStatus", "getAccountStatus", "getCardNo", "getOutstandingBillCount", "getOutstandingBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDetailList", "()Ljava/util/List;", "getWaiverInfo", "()Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentAccount;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoanHomeRepaymentAccount {

    @Nullable
    private final Integer accountStatus;

    @Nullable
    private final Integer accountType;

    @Nullable
    private final Integer applyStatus;

    @Nullable
    private final String cardNo;

    @Nullable
    private final List<LoanHomeRepaymentDetail> detailList;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Integer outstandingBillCount;

    @Nullable
    private final Long outstandingBillId;

    @Nullable
    private final String productIcon;

    @Nullable
    private final String productTitle;

    @Nullable
    private final String title;

    @Nullable
    private final WaiverInfo waiverInfo;

    public LoanHomeRepaymentAccount(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str5, @Nullable Integer num4, @Nullable Long l5, @Nullable List<LoanHomeRepaymentDetail> list, @Nullable WaiverInfo waiverInfo) {
        this.accountType = num;
        this.loanProduct = str;
        this.productTitle = str2;
        this.productIcon = str3;
        this.title = str4;
        this.applyStatus = num2;
        this.accountStatus = num3;
        this.cardNo = str5;
        this.outstandingBillCount = num4;
        this.outstandingBillId = l5;
        this.detailList = list;
        this.waiverInfo = waiverInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoanHomeRepaymentAccount copy$default(LoanHomeRepaymentAccount loanHomeRepaymentAccount, Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, String str5, Integer num4, Long l5, List list, WaiverInfo waiverInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = loanHomeRepaymentAccount.accountType;
        }
        if ((i7 & 2) != 0) {
            str = loanHomeRepaymentAccount.loanProduct;
        }
        if ((i7 & 4) != 0) {
            str2 = loanHomeRepaymentAccount.productTitle;
        }
        if ((i7 & 8) != 0) {
            str3 = loanHomeRepaymentAccount.productIcon;
        }
        if ((i7 & 16) != 0) {
            str4 = loanHomeRepaymentAccount.title;
        }
        if ((i7 & 32) != 0) {
            num2 = loanHomeRepaymentAccount.applyStatus;
        }
        if ((i7 & 64) != 0) {
            num3 = loanHomeRepaymentAccount.accountStatus;
        }
        if ((i7 & 128) != 0) {
            str5 = loanHomeRepaymentAccount.cardNo;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            num4 = loanHomeRepaymentAccount.outstandingBillCount;
        }
        if ((i7 & 512) != 0) {
            l5 = loanHomeRepaymentAccount.outstandingBillId;
        }
        if ((i7 & 1024) != 0) {
            list = loanHomeRepaymentAccount.detailList;
        }
        if ((i7 & 2048) != 0) {
            waiverInfo = loanHomeRepaymentAccount.waiverInfo;
        }
        List list2 = list;
        WaiverInfo waiverInfo2 = waiverInfo;
        Integer num5 = num4;
        Long l6 = l5;
        Integer num6 = num3;
        String str6 = str5;
        String str7 = str4;
        Integer num7 = num2;
        return loanHomeRepaymentAccount.copy(num, str, str2, str3, str7, num7, num6, str6, num5, l6, list2, waiverInfo2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getOutstandingBillId() {
        return this.outstandingBillId;
    }

    @Nullable
    public final List<LoanHomeRepaymentDetail> component11() {
        return this.detailList;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductTitle() {
        return this.productTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getOutstandingBillCount() {
        return this.outstandingBillCount;
    }

    @NotNull
    public final LoanHomeRepaymentAccount copy(@Nullable Integer accountType, @Nullable String loanProduct, @Nullable String productTitle, @Nullable String productIcon, @Nullable String title, @Nullable Integer applyStatus, @Nullable Integer accountStatus, @Nullable String cardNo, @Nullable Integer outstandingBillCount, @Nullable Long outstandingBillId, @Nullable List<LoanHomeRepaymentDetail> detailList, @Nullable WaiverInfo waiverInfo) {
        return new LoanHomeRepaymentAccount(accountType, loanProduct, productTitle, productIcon, title, applyStatus, accountStatus, cardNo, outstandingBillCount, outstandingBillId, detailList, waiverInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoanHomeRepaymentAccount)) {
            return false;
        }
        LoanHomeRepaymentAccount loanHomeRepaymentAccount = (LoanHomeRepaymentAccount) other;
        return Intrinsics.c(this.accountType, loanHomeRepaymentAccount.accountType) && Intrinsics.c(this.loanProduct, loanHomeRepaymentAccount.loanProduct) && Intrinsics.c(this.productTitle, loanHomeRepaymentAccount.productTitle) && Intrinsics.c(this.productIcon, loanHomeRepaymentAccount.productIcon) && Intrinsics.c(this.title, loanHomeRepaymentAccount.title) && Intrinsics.c(this.applyStatus, loanHomeRepaymentAccount.applyStatus) && Intrinsics.c(this.accountStatus, loanHomeRepaymentAccount.accountStatus) && Intrinsics.c(this.cardNo, loanHomeRepaymentAccount.cardNo) && Intrinsics.c(this.outstandingBillCount, loanHomeRepaymentAccount.outstandingBillCount) && Intrinsics.c(this.outstandingBillId, loanHomeRepaymentAccount.outstandingBillId) && Intrinsics.c(this.detailList, loanHomeRepaymentAccount.detailList) && Intrinsics.c(this.waiverInfo, loanHomeRepaymentAccount.waiverInfo);
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
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final List<LoanHomeRepaymentDetail> getDetailList() {
        return this.detailList;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
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
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    public final String getProductTitle() {
        return this.productTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    public int hashCode() {
        Integer num = this.accountType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.loanProduct;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productIcon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.applyStatus;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.accountStatus;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.cardNo;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.outstandingBillCount;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l5 = this.outstandingBillId;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List<LoanHomeRepaymentDetail> list = this.detailList;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        WaiverInfo waiverInfo = this.waiverInfo;
        return iHashCode11 + (waiverInfo != null ? waiverInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.accountType;
        String str = this.loanProduct;
        String str2 = this.productTitle;
        String str3 = this.productIcon;
        String str4 = this.title;
        Integer num2 = this.applyStatus;
        Integer num3 = this.accountStatus;
        String str5 = this.cardNo;
        Integer num4 = this.outstandingBillCount;
        Long l5 = this.outstandingBillId;
        List<LoanHomeRepaymentDetail> list = this.detailList;
        WaiverInfo waiverInfo = this.waiverInfo;
        StringBuilder sb2 = new StringBuilder("LoanHomeRepaymentAccount(accountType=");
        sb2.append(num);
        sb2.append(", loanProduct=");
        sb2.append(str);
        sb2.append(", productTitle=");
        u.x(sb2, str2, ", productIcon=", str3, ", title=");
        sb2.append(str4);
        sb2.append(", applyStatus=");
        sb2.append(num2);
        sb2.append(", accountStatus=");
        sb2.append(num3);
        sb2.append(", cardNo=");
        sb2.append(str5);
        sb2.append(", outstandingBillCount=");
        sb2.append(num4);
        sb2.append(", outstandingBillId=");
        sb2.append(l5);
        sb2.append(", detailList=");
        sb2.append(list);
        sb2.append(", waiverInfo=");
        sb2.append(waiverInfo);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ LoanHomeRepaymentAccount(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, String str5, Integer num4, Long l5, List list, WaiverInfo waiverInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, str4, num2, num3, str5, num4, l5, list, (i7 & 2048) != 0 ? null : waiverInfo);
    }
}
