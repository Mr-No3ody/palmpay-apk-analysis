package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006B"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CreateBettingOrderReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "billerId", "", "billerName", "businessAmount", "", FirebaseAnalytics.Param.CURRENCY, "customerId", "icon", "paymentItemId", "paymentItemName", "transType", "verifyPhone", "", "outSourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getBillerName", "setBillerName", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "getCustomerId", "setCustomerId", "getIcon", "setIcon", "getPaymentItemId", "setPaymentItemId", "getPaymentItemName", "setPaymentItemName", "getTransType", "setTransType", "getVerifyPhone", "()Z", "setVerifyPhone", "(Z)V", "getOutSourceId", "setOutSourceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/transsnet/palmpay/teller/bean/CreateBettingOrderReq;", "equals", "other", "", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateBettingOrderReq implements SingleLiveData$Params {

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private Long businessAmount;

    @Nullable
    private String currency;

    @Nullable
    private String customerId;

    @Nullable
    private String icon;

    @Nullable
    private String outSourceId;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String paymentItemName;

    @Nullable
    private String transType;
    private boolean verifyPhone;

    public CreateBettingOrderReq(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z3, @Nullable String str9) {
        this.billerId = str;
        this.billerName = str2;
        this.businessAmount = l5;
        this.currency = str3;
        this.customerId = str4;
        this.icon = str5;
        this.paymentItemId = str6;
        this.paymentItemName = str7;
        this.transType = str8;
        this.verifyPhone = z3;
        this.outSourceId = str9;
    }

    public static /* synthetic */ CreateBettingOrderReq copy$default(CreateBettingOrderReq createBettingOrderReq, String str, String str2, Long l5, String str3, String str4, String str5, String str6, String str7, String str8, boolean z3, String str9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = createBettingOrderReq.billerId;
        }
        if ((i7 & 2) != 0) {
            str2 = createBettingOrderReq.billerName;
        }
        if ((i7 & 4) != 0) {
            l5 = createBettingOrderReq.businessAmount;
        }
        if ((i7 & 8) != 0) {
            str3 = createBettingOrderReq.currency;
        }
        if ((i7 & 16) != 0) {
            str4 = createBettingOrderReq.customerId;
        }
        if ((i7 & 32) != 0) {
            str5 = createBettingOrderReq.icon;
        }
        if ((i7 & 64) != 0) {
            str6 = createBettingOrderReq.paymentItemId;
        }
        if ((i7 & 128) != 0) {
            str7 = createBettingOrderReq.paymentItemName;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str8 = createBettingOrderReq.transType;
        }
        if ((i7 & 512) != 0) {
            z3 = createBettingOrderReq.verifyPhone;
        }
        if ((i7 & 1024) != 0) {
            str9 = createBettingOrderReq.outSourceId;
        }
        boolean z8 = z3;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        String str15 = str4;
        Long l6 = l5;
        return createBettingOrderReq.copy(str, str2, l6, str3, str15, str13, str14, str11, str12, z8, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getVerifyPhone() {
        return this.verifyPhone;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOutSourceId() {
        return this.outSourceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
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
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @NotNull
    public final CreateBettingOrderReq copy(@Nullable String billerId, @Nullable String billerName, @Nullable Long businessAmount, @Nullable String currency, @Nullable String customerId, @Nullable String icon, @Nullable String paymentItemId, @Nullable String paymentItemName, @Nullable String transType, boolean verifyPhone, @Nullable String outSourceId) {
        return new CreateBettingOrderReq(billerId, billerName, businessAmount, currency, customerId, icon, paymentItemId, paymentItemName, transType, verifyPhone, outSourceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBettingOrderReq)) {
            return false;
        }
        CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) other;
        return Intrinsics.c(this.billerId, createBettingOrderReq.billerId) && Intrinsics.c(this.billerName, createBettingOrderReq.billerName) && Intrinsics.c(this.businessAmount, createBettingOrderReq.businessAmount) && Intrinsics.c(this.currency, createBettingOrderReq.currency) && Intrinsics.c(this.customerId, createBettingOrderReq.customerId) && Intrinsics.c(this.icon, createBettingOrderReq.icon) && Intrinsics.c(this.paymentItemId, createBettingOrderReq.paymentItemId) && Intrinsics.c(this.paymentItemName, createBettingOrderReq.paymentItemName) && Intrinsics.c(this.transType, createBettingOrderReq.transType) && this.verifyPhone == createBettingOrderReq.verifyPhone && Intrinsics.c(this.outSourceId, createBettingOrderReq.outSourceId);
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
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getOutSourceId() {
        return this.outSourceId;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final boolean getVerifyPhone() {
        return this.verifyPhone;
    }

    public int hashCode() {
        String str = this.billerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.businessAmount;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentItemId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentItemName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transType;
        int iD = u.d((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.verifyPhone);
        String str9 = this.outSourceId;
        return iD + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
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

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setOutSourceId(@Nullable String str) {
        this.outSourceId = str;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setVerifyPhone(boolean z3) {
        this.verifyPhone = z3;
    }

    @NotNull
    public String toString() {
        String str = this.billerId;
        String str2 = this.billerName;
        Long l5 = this.businessAmount;
        String str3 = this.currency;
        String str4 = this.customerId;
        String str5 = this.icon;
        String str6 = this.paymentItemId;
        String str7 = this.paymentItemName;
        String str8 = this.transType;
        boolean z3 = this.verifyPhone;
        String str9 = this.outSourceId;
        StringBuilder sbF = F.f("CreateBettingOrderReq(billerId=", str, ", billerName=", str2, ", businessAmount=");
        sbF.append(l5);
        sbF.append(", currency=");
        sbF.append(str3);
        sbF.append(", customerId=");
        u.x(sbF, str4, ", icon=", str5, ", paymentItemId=");
        u.x(sbF, str6, ", paymentItemName=", str7, ", transType=");
        sbF.append(str8);
        sbF.append(", verifyPhone=");
        sbF.append(z3);
        sbF.append(", outSourceId=");
        return G.r(sbF, str9, ")");
    }

    public /* synthetic */ CreateBettingOrderReq(String str, String str2, Long l5, String str3, String str4, String str5, String str6, String str7, String str8, boolean z3, String str9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l5, str3, str4, str5, str6, str7, str8, (i7 & 512) != 0 ? false : z3, (i7 & 1024) != 0 ? "" : str9);
    }
}
