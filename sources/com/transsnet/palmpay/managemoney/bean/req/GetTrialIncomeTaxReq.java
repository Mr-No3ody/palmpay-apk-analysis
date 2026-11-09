package com.transsnet.palmpay.managemoney.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/GetTrialIncomeTaxReq;", "", "productId", "", "principal", "stateCode", "", "durationDay", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getProductId", "()Ljava/lang/Long;", "setProductId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrincipal", "setPrincipal", "getStateCode", "()Ljava/lang/String;", "setStateCode", "(Ljava/lang/String;)V", "getDurationDay", "setDurationDay", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/req/GetTrialIncomeTaxReq;", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetTrialIncomeTaxReq {

    @Nullable
    private Long durationDay;

    @Nullable
    private Long principal;

    @Nullable
    private Long productId;

    @Nullable
    private String stateCode;

    public GetTrialIncomeTaxReq(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable Long l8) {
        this.productId = l5;
        this.principal = l6;
        this.stateCode = str;
        this.durationDay = l8;
    }

    public static /* synthetic */ GetTrialIncomeTaxReq copy$default(GetTrialIncomeTaxReq getTrialIncomeTaxReq, Long l5, Long l6, String str, Long l8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = getTrialIncomeTaxReq.productId;
        }
        if ((i7 & 2) != 0) {
            l6 = getTrialIncomeTaxReq.principal;
        }
        if ((i7 & 4) != 0) {
            str = getTrialIncomeTaxReq.stateCode;
        }
        if ((i7 & 8) != 0) {
            l8 = getTrialIncomeTaxReq.durationDay;
        }
        return getTrialIncomeTaxReq.copy(l5, l6, str, l8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDurationDay() {
        return this.durationDay;
    }

    @NotNull
    public final GetTrialIncomeTaxReq copy(@Nullable Long productId, @Nullable Long principal, @Nullable String stateCode, @Nullable Long durationDay) {
        return new GetTrialIncomeTaxReq(productId, principal, stateCode, durationDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTrialIncomeTaxReq)) {
            return false;
        }
        GetTrialIncomeTaxReq getTrialIncomeTaxReq = (GetTrialIncomeTaxReq) other;
        return Intrinsics.c(this.productId, getTrialIncomeTaxReq.productId) && Intrinsics.c(this.principal, getTrialIncomeTaxReq.principal) && Intrinsics.c(this.stateCode, getTrialIncomeTaxReq.stateCode) && Intrinsics.c(this.durationDay, getTrialIncomeTaxReq.durationDay);
    }

    @Nullable
    public final Long getDurationDay() {
        return this.durationDay;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final Long getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        Long l5 = this.productId;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.principal;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.stateCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l8 = this.durationDay;
        return iHashCode3 + (l8 != null ? l8.hashCode() : 0);
    }

    public final void setDurationDay(@Nullable Long l5) {
        this.durationDay = l5;
    }

    public final void setPrincipal(@Nullable Long l5) {
        this.principal = l5;
    }

    public final void setProductId(@Nullable Long l5) {
        this.productId = l5;
    }

    public final void setStateCode(@Nullable String str) {
        this.stateCode = str;
    }

    @NotNull
    public String toString() {
        return "GetTrialIncomeTaxReq(productId=" + this.productId + ", principal=" + this.principal + ", stateCode=" + this.stateCode + ", durationDay=" + this.durationDay + ")";
    }
}
