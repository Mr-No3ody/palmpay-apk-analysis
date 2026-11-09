package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp$AdvanceRepay;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp$AdvanceRepay;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp$AdvanceRepay;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AdvanceRepay", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdvanceRepayResp extends CommonResult {

    @Nullable
    private final AdvanceRepay data;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp$AdvanceRepay;", "", "orderId", "", "paymentAmount", "", "repayPrincipal", "repayInterest", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getOrderId", "()Ljava/lang/String;", "getPaymentAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepayPrincipal", "getRepayInterest", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/resp/AdvanceRepayResp$AdvanceRepay;", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdvanceRepay {

        @Nullable
        private final String orderId;

        @Nullable
        private final Long paymentAmount;

        @Nullable
        private final Long repayInterest;

        @Nullable
        private final Long repayPrincipal;

        public AdvanceRepay(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8) {
            this.orderId = str;
            this.paymentAmount = l5;
            this.repayPrincipal = l6;
            this.repayInterest = l8;
        }

        public static /* synthetic */ AdvanceRepay copy$default(AdvanceRepay advanceRepay, String str, Long l5, Long l6, Long l8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = advanceRepay.orderId;
            }
            if ((i7 & 2) != 0) {
                l5 = advanceRepay.paymentAmount;
            }
            if ((i7 & 4) != 0) {
                l6 = advanceRepay.repayPrincipal;
            }
            if ((i7 & 8) != 0) {
                l8 = advanceRepay.repayInterest;
            }
            return advanceRepay.copy(str, l5, l6, l8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getPaymentAmount() {
            return this.paymentAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getRepayPrincipal() {
            return this.repayPrincipal;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getRepayInterest() {
            return this.repayInterest;
        }

        @NotNull
        public final AdvanceRepay copy(@Nullable String orderId, @Nullable Long paymentAmount, @Nullable Long repayPrincipal, @Nullable Long repayInterest) {
            return new AdvanceRepay(orderId, paymentAmount, repayPrincipal, repayInterest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvanceRepay)) {
                return false;
            }
            AdvanceRepay advanceRepay = (AdvanceRepay) other;
            return Intrinsics.c(this.orderId, advanceRepay.orderId) && Intrinsics.c(this.paymentAmount, advanceRepay.paymentAmount) && Intrinsics.c(this.repayPrincipal, advanceRepay.repayPrincipal) && Intrinsics.c(this.repayInterest, advanceRepay.repayInterest);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final Long getPaymentAmount() {
            return this.paymentAmount;
        }

        @Nullable
        public final Long getRepayInterest() {
            return this.repayInterest;
        }

        @Nullable
        public final Long getRepayPrincipal() {
            return this.repayPrincipal;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l5 = this.paymentAmount;
            int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.repayPrincipal;
            int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l8 = this.repayInterest;
            return iHashCode3 + (l8 != null ? l8.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdvanceRepay(orderId=" + this.orderId + ", paymentAmount=" + this.paymentAmount + ", repayPrincipal=" + this.repayPrincipal + ", repayInterest=" + this.repayInterest + ")";
        }
    }

    public AdvanceRepayResp(@Nullable AdvanceRepay advanceRepay) {
        this.data = advanceRepay;
    }

    public static /* synthetic */ AdvanceRepayResp copy$default(AdvanceRepayResp advanceRepayResp, AdvanceRepay advanceRepay, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            advanceRepay = advanceRepayResp.data;
        }
        return advanceRepayResp.copy(advanceRepay);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdvanceRepay getData() {
        return this.data;
    }

    @NotNull
    public final AdvanceRepayResp copy(@Nullable AdvanceRepay data) {
        return new AdvanceRepayResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvanceRepayResp) && Intrinsics.c(this.data, ((AdvanceRepayResp) other).data);
    }

    @Nullable
    public final AdvanceRepay getData() {
        return this.data;
    }

    public int hashCode() {
        AdvanceRepay advanceRepay = this.data;
        if (advanceRepay == null) {
            return 0;
        }
        return advanceRepay.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "AdvanceRepayResp(data=" + this.data + ")";
    }
}
