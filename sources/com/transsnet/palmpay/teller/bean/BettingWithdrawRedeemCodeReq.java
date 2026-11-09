package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemCodeReq;", "", "securityCode", "", "billerId", "billerName", "categoryId", "customerId", "icon", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecurityCode", "()Ljava/lang/String;", "setSecurityCode", "(Ljava/lang/String;)V", "getBillerId", "setBillerId", "getBillerName", "setBillerName", "getCategoryId", "setCategoryId", "getCustomerId", "setCustomerId", "getIcon", "setIcon", "getOrderType", "setOrderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingWithdrawRedeemCodeReq {

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private String categoryId;

    @Nullable
    private String customerId;

    @Nullable
    private String icon;

    @Nullable
    private String orderType;

    @Nullable
    private String securityCode;

    public BettingWithdrawRedeemCodeReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.securityCode = str;
        this.billerId = str2;
        this.billerName = str3;
        this.categoryId = str4;
        this.customerId = str5;
        this.icon = str6;
        this.orderType = str7;
    }

    public static /* synthetic */ BettingWithdrawRedeemCodeReq copy$default(BettingWithdrawRedeemCodeReq bettingWithdrawRedeemCodeReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingWithdrawRedeemCodeReq.securityCode;
        }
        if ((i7 & 2) != 0) {
            str2 = bettingWithdrawRedeemCodeReq.billerId;
        }
        if ((i7 & 4) != 0) {
            str3 = bettingWithdrawRedeemCodeReq.billerName;
        }
        if ((i7 & 8) != 0) {
            str4 = bettingWithdrawRedeemCodeReq.categoryId;
        }
        if ((i7 & 16) != 0) {
            str5 = bettingWithdrawRedeemCodeReq.customerId;
        }
        if ((i7 & 32) != 0) {
            str6 = bettingWithdrawRedeemCodeReq.icon;
        }
        if ((i7 & 64) != 0) {
            str7 = bettingWithdrawRedeemCodeReq.orderType;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return bettingWithdrawRedeemCodeReq.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final BettingWithdrawRedeemCodeReq copy(@Nullable String securityCode, @Nullable String billerId, @Nullable String billerName, @Nullable String categoryId, @Nullable String customerId, @Nullable String icon, @Nullable String orderType) {
        return new BettingWithdrawRedeemCodeReq(securityCode, billerId, billerName, categoryId, customerId, icon, orderType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingWithdrawRedeemCodeReq)) {
            return false;
        }
        BettingWithdrawRedeemCodeReq bettingWithdrawRedeemCodeReq = (BettingWithdrawRedeemCodeReq) other;
        return Intrinsics.c(this.securityCode, bettingWithdrawRedeemCodeReq.securityCode) && Intrinsics.c(this.billerId, bettingWithdrawRedeemCodeReq.billerId) && Intrinsics.c(this.billerName, bettingWithdrawRedeemCodeReq.billerName) && Intrinsics.c(this.categoryId, bettingWithdrawRedeemCodeReq.categoryId) && Intrinsics.c(this.customerId, bettingWithdrawRedeemCodeReq.customerId) && Intrinsics.c(this.icon, bettingWithdrawRedeemCodeReq.icon) && Intrinsics.c(this.orderType, bettingWithdrawRedeemCodeReq.orderType);
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getSecurityCode() {
        return this.securityCode;
    }

    public int hashCode() {
        String str = this.securityCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orderType;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setOrderType(@Nullable String str) {
        this.orderType = str;
    }

    public final void setSecurityCode(@Nullable String str) {
        this.securityCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.securityCode;
        String str2 = this.billerId;
        String str3 = this.billerName;
        String str4 = this.categoryId;
        String str5 = this.customerId;
        String str6 = this.icon;
        String str7 = this.orderType;
        StringBuilder sbF = F.f("BettingWithdrawRedeemCodeReq(securityCode=", str, ", billerId=", str2, ", billerName=");
        u.x(sbF, str3, ", categoryId=", str4, ", customerId=");
        u.x(sbF, str5, ", icon=", str6, ", orderType=");
        return G.r(sbF, str7, ")");
    }
}
