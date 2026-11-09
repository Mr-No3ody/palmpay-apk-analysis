package com.transsnet.palmpay.teller.bean;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp$Data;", "<init>", "(Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp$Data;)V", "getData", "()Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryLastBillerRsp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/QueryLastBillerRsp$Data;", "", "billerId", "", "billerName", "paymentItemId", "customerId", "businessAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBillerId", "()Ljava/lang/String;", "getBillerName", "getPaymentItemId", "getCustomerId", "getBusinessAmount", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final String billerId;

        @NotNull
        private final String billerName;
        private final long businessAmount;

        @NotNull
        private final String customerId;

        @NotNull
        private final String paymentItemId;

        public Data() {
            this(null, null, null, null, 0L, 31, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, long j6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = data.billerId;
            }
            if ((i7 & 2) != 0) {
                str2 = data.billerName;
            }
            if ((i7 & 4) != 0) {
                str3 = data.paymentItemId;
            }
            if ((i7 & 8) != 0) {
                str4 = data.customerId;
            }
            if ((i7 & 16) != 0) {
                j6 = data.businessAmount;
            }
            long j10 = j6;
            return data.copy(str, str2, str3, str4, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBillerId() {
            return this.billerId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBillerName() {
            return this.billerName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPaymentItemId() {
            return this.paymentItemId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCustomerId() {
            return this.customerId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getBusinessAmount() {
            return this.businessAmount;
        }

        @NotNull
        public final Data copy(@NotNull String billerId, @NotNull String billerName, @NotNull String paymentItemId, @NotNull String customerId, long businessAmount) {
            Intrinsics.checkNotNullParameter(billerId, "billerId");
            Intrinsics.checkNotNullParameter(billerName, "billerName");
            Intrinsics.checkNotNullParameter(paymentItemId, "paymentItemId");
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return new Data(billerId, billerName, paymentItemId, customerId, businessAmount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.c(this.billerId, data.billerId) && Intrinsics.c(this.billerName, data.billerName) && Intrinsics.c(this.paymentItemId, data.paymentItemId) && Intrinsics.c(this.customerId, data.customerId) && this.businessAmount == data.businessAmount;
        }

        @NotNull
        public final String getBillerId() {
            return this.billerId;
        }

        @NotNull
        public final String getBillerName() {
            return this.billerName;
        }

        public final long getBusinessAmount() {
            return this.businessAmount;
        }

        @NotNull
        public final String getCustomerId() {
            return this.customerId;
        }

        @NotNull
        public final String getPaymentItemId() {
            return this.paymentItemId;
        }

        public int hashCode() {
            return Long.hashCode(this.businessAmount) + G.c(G.c(G.c(this.billerId.hashCode() * 31, 31, this.billerName), 31, this.paymentItemId), 31, this.customerId);
        }

        @NotNull
        public String toString() {
            String str = this.billerId;
            String str2 = this.billerName;
            String str3 = this.paymentItemId;
            String str4 = this.customerId;
            long j6 = this.businessAmount;
            StringBuilder sbF = F.f("Data(billerId=", str, ", billerName=", str2, ", paymentItemId=");
            u.x(sbF, str3, ", customerId=", str4, ", businessAmount=");
            return q0.n(sbF, ")", j6);
        }

        public Data(@NotNull String billerId, @NotNull String billerName, @NotNull String paymentItemId, @NotNull String customerId, long j6) {
            Intrinsics.checkNotNullParameter(billerId, "billerId");
            Intrinsics.checkNotNullParameter(billerName, "billerName");
            Intrinsics.checkNotNullParameter(paymentItemId, "paymentItemId");
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            this.billerId = billerId;
            this.billerName = billerName;
            this.paymentItemId = paymentItemId;
            this.customerId = customerId;
            this.businessAmount = j6;
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, long j6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? 0L : j6);
        }
    }

    public QueryLastBillerRsp(@Nullable Data data) {
        this.data = data;
    }

    public static /* synthetic */ QueryLastBillerRsp copy$default(QueryLastBillerRsp queryLastBillerRsp, Data data, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            data = queryLastBillerRsp.data;
        }
        return queryLastBillerRsp.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final QueryLastBillerRsp copy(@Nullable Data data) {
        return new QueryLastBillerRsp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QueryLastBillerRsp) && Intrinsics.c(this.data, ((QueryLastBillerRsp) other).data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "QueryLastBillerRsp(data=" + this.data + ")";
    }
}
