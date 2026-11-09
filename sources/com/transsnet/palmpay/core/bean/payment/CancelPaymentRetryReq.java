package com.transsnet.palmpay.core.bean.payment;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/CancelPaymentRetryReq;", "", "paymentRetryToken", "", "closeReason", "transType", "orderNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentRetryToken", "()Ljava/lang/String;", "getCloseReason", "getTransType", "getOrderNo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CancelPaymentRetryReq {

    @Nullable
    private final String closeReason;

    @Nullable
    private final String orderNo;

    @Nullable
    private final String paymentRetryToken;

    @Nullable
    private final String transType;

    public CancelPaymentRetryReq() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CancelPaymentRetryReq copy$default(CancelPaymentRetryReq cancelPaymentRetryReq, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = cancelPaymentRetryReq.paymentRetryToken;
        }
        if ((i7 & 2) != 0) {
            str2 = cancelPaymentRetryReq.closeReason;
        }
        if ((i7 & 4) != 0) {
            str3 = cancelPaymentRetryReq.transType;
        }
        if ((i7 & 8) != 0) {
            str4 = cancelPaymentRetryReq.orderNo;
        }
        return cancelPaymentRetryReq.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentRetryToken() {
        return this.paymentRetryToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCloseReason() {
        return this.closeReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    public final CancelPaymentRetryReq copy(@Nullable String paymentRetryToken, @Nullable String closeReason, @Nullable String transType, @Nullable String orderNo) {
        return new CancelPaymentRetryReq(paymentRetryToken, closeReason, transType, orderNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelPaymentRetryReq)) {
            return false;
        }
        CancelPaymentRetryReq cancelPaymentRetryReq = (CancelPaymentRetryReq) other;
        return Intrinsics.c(this.paymentRetryToken, cancelPaymentRetryReq.paymentRetryToken) && Intrinsics.c(this.closeReason, cancelPaymentRetryReq.closeReason) && Intrinsics.c(this.transType, cancelPaymentRetryReq.transType) && Intrinsics.c(this.orderNo, cancelPaymentRetryReq.orderNo);
    }

    @Nullable
    public final String getCloseReason() {
        return this.closeReason;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
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
        String str2 = this.closeReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderNo;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.paymentRetryToken;
        String str2 = this.closeReason;
        return G.s(F.f("CancelPaymentRetryReq(paymentRetryToken=", str, ", closeReason=", str2, ", transType="), this.transType, ", orderNo=", this.orderNo, ")");
    }

    public CancelPaymentRetryReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.paymentRetryToken = str;
        this.closeReason = str2;
        this.transType = str3;
        this.orderNo = str4;
    }

    public /* synthetic */ CancelPaymentRetryReq(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }
}
