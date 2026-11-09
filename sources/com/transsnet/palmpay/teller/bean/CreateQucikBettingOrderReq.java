package com.transsnet.palmpay.teller.bean;

import C0.G;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CreateQucikBettingOrderReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "billerId", "", "businessAmount", "", "customerId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCustomerId", "setCustomerId", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/teller/bean/CreateQucikBettingOrderReq;", "equals", "", "other", "", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateQucikBettingOrderReq implements SingleLiveData$Params {

    @Nullable
    private String billerId;

    @Nullable
    private Long businessAmount;

    @Nullable
    private String customerId;

    public CreateQucikBettingOrderReq(@Nullable String str, @Nullable Long l5, @Nullable String str2) {
        this.billerId = str;
        this.businessAmount = l5;
        this.customerId = str2;
    }

    public static /* synthetic */ CreateQucikBettingOrderReq copy$default(CreateQucikBettingOrderReq createQucikBettingOrderReq, String str, Long l5, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = createQucikBettingOrderReq.billerId;
        }
        if ((i7 & 2) != 0) {
            l5 = createQucikBettingOrderReq.businessAmount;
        }
        if ((i7 & 4) != 0) {
            str2 = createQucikBettingOrderReq.customerId;
        }
        return createQucikBettingOrderReq.copy(str, l5, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final CreateQucikBettingOrderReq copy(@Nullable String billerId, @Nullable Long businessAmount, @Nullable String customerId) {
        return new CreateQucikBettingOrderReq(billerId, businessAmount, customerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateQucikBettingOrderReq)) {
            return false;
        }
        CreateQucikBettingOrderReq createQucikBettingOrderReq = (CreateQucikBettingOrderReq) other;
        return Intrinsics.c(this.billerId, createQucikBettingOrderReq.billerId) && Intrinsics.c(this.businessAmount, createQucikBettingOrderReq.businessAmount) && Intrinsics.c(this.customerId, createQucikBettingOrderReq.customerId);
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        String str = this.billerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.businessAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.customerId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    @NotNull
    public String toString() {
        String str = this.billerId;
        Long l5 = this.businessAmount;
        String str2 = this.customerId;
        StringBuilder sb2 = new StringBuilder("CreateQucikBettingOrderReq(billerId=");
        sb2.append(str);
        sb2.append(", businessAmount=");
        sb2.append(l5);
        sb2.append(", customerId=");
        return G.r(sb2, str2, ")");
    }
}
