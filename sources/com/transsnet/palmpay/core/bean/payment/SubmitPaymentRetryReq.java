package com.transsnet.palmpay.core.bean.payment;

import C0.G;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "", "paymentRetryToken", "", "payType", "", "orderNo", "transType", "payerAccountId", "payerAccountType", "cacheKey", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getPaymentRetryToken", "()Ljava/lang/String;", "getPayType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderNo", "getTransType", "getPayerAccountId", "getPayerAccountType", "getCacheKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "equals", "", "other", "hashCode", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubmitPaymentRetryReq {

    @Nullable
    private final String cacheKey;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Integer payType;

    @Nullable
    private final String payerAccountId;

    @Nullable
    private final Integer payerAccountType;

    @Nullable
    private final String paymentRetryToken;

    @Nullable
    private final String transType;

    public SubmitPaymentRetryReq() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ SubmitPaymentRetryReq copy$default(SubmitPaymentRetryReq submitPaymentRetryReq, String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = submitPaymentRetryReq.paymentRetryToken;
        }
        if ((i7 & 2) != 0) {
            num = submitPaymentRetryReq.payType;
        }
        if ((i7 & 4) != 0) {
            str2 = submitPaymentRetryReq.orderNo;
        }
        if ((i7 & 8) != 0) {
            str3 = submitPaymentRetryReq.transType;
        }
        if ((i7 & 16) != 0) {
            str4 = submitPaymentRetryReq.payerAccountId;
        }
        if ((i7 & 32) != 0) {
            num2 = submitPaymentRetryReq.payerAccountType;
        }
        if ((i7 & 64) != 0) {
            str5 = submitPaymentRetryReq.cacheKey;
        }
        Integer num3 = num2;
        String str6 = str5;
        String str7 = str4;
        String str8 = str2;
        return submitPaymentRetryReq.copy(str, num, str8, str3, str7, num3, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentRetryToken() {
        return this.paymentRetryToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPayerAccountId() {
        return this.payerAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPayerAccountType() {
        return this.payerAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final SubmitPaymentRetryReq copy(@Nullable String paymentRetryToken, @Nullable Integer payType, @Nullable String orderNo, @Nullable String transType, @Nullable String payerAccountId, @Nullable Integer payerAccountType, @Nullable String cacheKey) {
        return new SubmitPaymentRetryReq(paymentRetryToken, payType, orderNo, transType, payerAccountId, payerAccountType, cacheKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitPaymentRetryReq)) {
            return false;
        }
        SubmitPaymentRetryReq submitPaymentRetryReq = (SubmitPaymentRetryReq) other;
        return Intrinsics.c(this.paymentRetryToken, submitPaymentRetryReq.paymentRetryToken) && Intrinsics.c(this.payType, submitPaymentRetryReq.payType) && Intrinsics.c(this.orderNo, submitPaymentRetryReq.orderNo) && Intrinsics.c(this.transType, submitPaymentRetryReq.transType) && Intrinsics.c(this.payerAccountId, submitPaymentRetryReq.payerAccountId) && Intrinsics.c(this.payerAccountType, submitPaymentRetryReq.payerAccountType) && Intrinsics.c(this.cacheKey, submitPaymentRetryReq.cacheKey);
    }

    @Nullable
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    public final String getPayerAccountId() {
        return this.payerAccountId;
    }

    @Nullable
    public final Integer getPayerAccountType() {
        return this.payerAccountType;
    }

    @Nullable
    public final String getPaymentRetryToken() {
        return this.paymentRetryToken;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public int hashCode() {
        String str = this.paymentRetryToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.payType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.orderNo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payerAccountId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.payerAccountType;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.cacheKey;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.paymentRetryToken;
        Integer num = this.payType;
        String str2 = this.orderNo;
        String str3 = this.transType;
        String str4 = this.payerAccountId;
        Integer num2 = this.payerAccountType;
        String str5 = this.cacheKey;
        StringBuilder sb2 = new StringBuilder("SubmitPaymentRetryReq(paymentRetryToken=");
        sb2.append(str);
        sb2.append(", payType=");
        sb2.append(num);
        sb2.append(", orderNo=");
        u.x(sb2, str2, ", transType=", str3, ", payerAccountId=");
        sb2.append(str4);
        sb2.append(", payerAccountType=");
        sb2.append(num2);
        sb2.append(", cacheKey=");
        return G.r(sb2, str5, ")");
    }

    public SubmitPaymentRetryReq(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5) {
        this.paymentRetryToken = str;
        this.payType = num;
        this.orderNo = str2;
        this.transType = str3;
        this.payerAccountId = str4;
        this.payerAccountType = num2;
        this.cacheKey = str5;
    }

    public /* synthetic */ SubmitPaymentRetryReq(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : num2, (i7 & 64) != 0 ? null : str5);
    }
}
