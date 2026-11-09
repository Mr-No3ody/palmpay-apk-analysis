package com.transsnet.palmpay.managemoney.bean.resp;

import N8.q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp$ComeTax;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp$ComeTax;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp$ComeTax;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ComeTax", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetTrialIncomeTaxResp extends CommonResult {

    @Nullable
    private ComeTax data;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetTrialIncomeTaxResp$ComeTax;", "", FirebaseAnalytics.Param.CURRENCY, "", "incomeTax", "", "totalAmount", "<init>", "(Ljava/lang/String;JJ)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getIncomeTax", "()J", "setIncomeTax", "(J)V", "getTotalAmount", "setTotalAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ComeTax {

        @NotNull
        private String currency;
        private long incomeTax;
        private long totalAmount;

        public ComeTax(@NotNull String currency, long j6, long j10) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
            this.incomeTax = j6;
            this.totalAmount = j10;
        }

        public static /* synthetic */ ComeTax copy$default(ComeTax comeTax, String str, long j6, long j10, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = comeTax.currency;
            }
            if ((i7 & 2) != 0) {
                j6 = comeTax.incomeTax;
            }
            if ((i7 & 4) != 0) {
                j10 = comeTax.totalAmount;
            }
            return comeTax.copy(str, j6, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getIncomeTax() {
            return this.incomeTax;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTotalAmount() {
            return this.totalAmount;
        }

        @NotNull
        public final ComeTax copy(@NotNull String currency, long incomeTax, long totalAmount) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new ComeTax(currency, incomeTax, totalAmount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComeTax)) {
                return false;
            }
            ComeTax comeTax = (ComeTax) other;
            return Intrinsics.c(this.currency, comeTax.currency) && this.incomeTax == comeTax.incomeTax && this.totalAmount == comeTax.totalAmount;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        public final long getIncomeTax() {
            return this.incomeTax;
        }

        public final long getTotalAmount() {
            return this.totalAmount;
        }

        public int hashCode() {
            return Long.hashCode(this.totalAmount) + q0.b(this.currency.hashCode() * 31, 31, this.incomeTax);
        }

        public final void setCurrency(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.currency = str;
        }

        public final void setIncomeTax(long j6) {
            this.incomeTax = j6;
        }

        public final void setTotalAmount(long j6) {
            this.totalAmount = j6;
        }

        @NotNull
        public String toString() {
            return "ComeTax(currency=" + this.currency + ", incomeTax=" + this.incomeTax + ", totalAmount=" + this.totalAmount + ")";
        }
    }

    public GetTrialIncomeTaxResp(@Nullable ComeTax comeTax) {
        this.data = comeTax;
    }

    public static /* synthetic */ GetTrialIncomeTaxResp copy$default(GetTrialIncomeTaxResp getTrialIncomeTaxResp, ComeTax comeTax, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            comeTax = getTrialIncomeTaxResp.data;
        }
        return getTrialIncomeTaxResp.copy(comeTax);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ComeTax getData() {
        return this.data;
    }

    @NotNull
    public final GetTrialIncomeTaxResp copy(@Nullable ComeTax data) {
        return new GetTrialIncomeTaxResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetTrialIncomeTaxResp) && Intrinsics.c(this.data, ((GetTrialIncomeTaxResp) other).data);
    }

    @Nullable
    public final ComeTax getData() {
        return this.data;
    }

    public int hashCode() {
        ComeTax comeTax = this.data;
        if (comeTax == null) {
            return 0;
        }
        return comeTax.hashCode();
    }

    public final void setData(@Nullable ComeTax comeTax) {
        this.data = comeTax;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetTrialIncomeTaxResp(data=" + this.data + ")";
    }
}
