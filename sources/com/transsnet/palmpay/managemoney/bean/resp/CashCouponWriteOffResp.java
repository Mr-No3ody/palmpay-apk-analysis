package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp$CashCouponWriteOff;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp$CashCouponWriteOff;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp$CashCouponWriteOff;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CashCouponWriteOff", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashCouponWriteOffResp extends CommonResult {

    @Nullable
    private final CashCouponWriteOff data;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp$CashCouponWriteOff;", "", "status", "", "couponAmount", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCouponAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/resp/CashCouponWriteOffResp$CashCouponWriteOff;", "equals", "", "other", "hashCode", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashCouponWriteOff {

        @Nullable
        private final Long couponAmount;

        @Nullable
        private final Integer status;

        public CashCouponWriteOff(@Nullable Integer num, @Nullable Long l5) {
            this.status = num;
            this.couponAmount = l5;
        }

        public static /* synthetic */ CashCouponWriteOff copy$default(CashCouponWriteOff cashCouponWriteOff, Integer num, Long l5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = cashCouponWriteOff.status;
            }
            if ((i7 & 2) != 0) {
                l5 = cashCouponWriteOff.couponAmount;
            }
            return cashCouponWriteOff.copy(num, l5);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @NotNull
        public final CashCouponWriteOff copy(@Nullable Integer status, @Nullable Long couponAmount) {
            return new CashCouponWriteOff(status, couponAmount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashCouponWriteOff)) {
                return false;
            }
            CashCouponWriteOff cashCouponWriteOff = (CashCouponWriteOff) other;
            return Intrinsics.c(this.status, cashCouponWriteOff.status) && Intrinsics.c(this.couponAmount, cashCouponWriteOff.couponAmount);
        }

        @Nullable
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            Integer num = this.status;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l5 = this.couponAmount;
            return iHashCode + (l5 != null ? l5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CashCouponWriteOff(status=" + this.status + ", couponAmount=" + this.couponAmount + ")";
        }
    }

    public CashCouponWriteOffResp(@Nullable CashCouponWriteOff cashCouponWriteOff) {
        this.data = cashCouponWriteOff;
    }

    public static /* synthetic */ CashCouponWriteOffResp copy$default(CashCouponWriteOffResp cashCouponWriteOffResp, CashCouponWriteOff cashCouponWriteOff, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cashCouponWriteOff = cashCouponWriteOffResp.data;
        }
        return cashCouponWriteOffResp.copy(cashCouponWriteOff);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CashCouponWriteOff getData() {
        return this.data;
    }

    @NotNull
    public final CashCouponWriteOffResp copy(@Nullable CashCouponWriteOff data) {
        return new CashCouponWriteOffResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashCouponWriteOffResp) && Intrinsics.c(this.data, ((CashCouponWriteOffResp) other).data);
    }

    @Nullable
    public final CashCouponWriteOff getData() {
        return this.data;
    }

    public int hashCode() {
        CashCouponWriteOff cashCouponWriteOff = this.data;
        if (cashCouponWriteOff == null) {
            return 0;
        }
        return cashCouponWriteOff.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CashCouponWriteOffResp(data=" + this.data + ")";
    }
}
