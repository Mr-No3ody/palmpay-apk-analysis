package com.transsnet.palmpay.teller.bean.resp;

import C0.G;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J`\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000bHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingWithdrawRedeemCodeData;", "", "accountName", "", "businessAmount", "", FirebaseAnalytics.Param.CURRENCY, "customerId", "errorMsg", "orderNo", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "getCustomerId", "setCustomerId", "getErrorMsg", "setErrorMsg", "getOrderNo", "setOrderNo", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/transsnet/palmpay/teller/bean/resp/BettingWithdrawRedeemCodeData;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingWithdrawRedeemCodeData {

    @Nullable
    private String accountName;

    @Nullable
    private Long businessAmount;

    @Nullable
    private String currency;

    @Nullable
    private String customerId;

    @Nullable
    private String errorMsg;

    @Nullable
    private String orderNo;
    private int status;

    public BettingWithdrawRedeemCodeData(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i7) {
        this.accountName = str;
        this.businessAmount = l5;
        this.currency = str2;
        this.customerId = str3;
        this.errorMsg = str4;
        this.orderNo = str5;
        this.status = i7;
    }

    public static /* synthetic */ BettingWithdrawRedeemCodeData copy$default(BettingWithdrawRedeemCodeData bettingWithdrawRedeemCodeData, String str, Long l5, String str2, String str3, String str4, String str5, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bettingWithdrawRedeemCodeData.accountName;
        }
        if ((i10 & 2) != 0) {
            l5 = bettingWithdrawRedeemCodeData.businessAmount;
        }
        if ((i10 & 4) != 0) {
            str2 = bettingWithdrawRedeemCodeData.currency;
        }
        if ((i10 & 8) != 0) {
            str3 = bettingWithdrawRedeemCodeData.customerId;
        }
        if ((i10 & 16) != 0) {
            str4 = bettingWithdrawRedeemCodeData.errorMsg;
        }
        if ((i10 & 32) != 0) {
            str5 = bettingWithdrawRedeemCodeData.orderNo;
        }
        if ((i10 & 64) != 0) {
            i7 = bettingWithdrawRedeemCodeData.status;
        }
        String str6 = str5;
        int i11 = i7;
        String str7 = str4;
        String str8 = str2;
        return bettingWithdrawRedeemCodeData.copy(str, l5, str8, str3, str7, str6, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final BettingWithdrawRedeemCodeData copy(@Nullable String accountName, @Nullable Long businessAmount, @Nullable String currency, @Nullable String customerId, @Nullable String errorMsg, @Nullable String orderNo, int status) {
        return new BettingWithdrawRedeemCodeData(accountName, businessAmount, currency, customerId, errorMsg, orderNo, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingWithdrawRedeemCodeData)) {
            return false;
        }
        BettingWithdrawRedeemCodeData bettingWithdrawRedeemCodeData = (BettingWithdrawRedeemCodeData) other;
        return Intrinsics.c(this.accountName, bettingWithdrawRedeemCodeData.accountName) && Intrinsics.c(this.businessAmount, bettingWithdrawRedeemCodeData.businessAmount) && Intrinsics.c(this.currency, bettingWithdrawRedeemCodeData.currency) && Intrinsics.c(this.customerId, bettingWithdrawRedeemCodeData.customerId) && Intrinsics.c(this.errorMsg, bettingWithdrawRedeemCodeData.errorMsg) && Intrinsics.c(this.orderNo, bettingWithdrawRedeemCodeData.orderNo) && this.status == bettingWithdrawRedeemCodeData.status;
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.accountName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.businessAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMsg;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderNo;
        return Integer.hashCode(this.status) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    @NotNull
    public String toString() {
        String str = this.accountName;
        Long l5 = this.businessAmount;
        String str2 = this.currency;
        String str3 = this.customerId;
        String str4 = this.errorMsg;
        String str5 = this.orderNo;
        int i7 = this.status;
        StringBuilder sb2 = new StringBuilder("BettingWithdrawRedeemCodeData(accountName=");
        sb2.append(str);
        sb2.append(", businessAmount=");
        sb2.append(l5);
        sb2.append(", currency=");
        u.x(sb2, str2, ", customerId=", str3, ", errorMsg=");
        u.x(sb2, str4, ", orderNo=", str5, ", status=");
        return G.n(i7, ")", sb2);
    }
}
