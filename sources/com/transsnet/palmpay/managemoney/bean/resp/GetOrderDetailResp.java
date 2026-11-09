package com.transsnet.palmpay.managemoney.bean.resp;

import N8.q0;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$OrderDetailInfo;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$OrderDetailInfo;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$OrderDetailInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "OrderDetailInfo", "MaturityPayoutDetail", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetOrderDetailResp extends CommonResult {

    @Nullable
    private final OrderDetailInfo data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$MaturityPayoutDetail;", "", "hasAutoRepay", "", "payoutValue", "", "savingsAdvanceRepayment", "totalValue", "<init>", "(ZJJJ)V", "getHasAutoRepay", "()Z", "getPayoutValue", "()J", "getSavingsAdvanceRepayment", "getTotalValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MaturityPayoutDetail {
        private final boolean hasAutoRepay;
        private final long payoutValue;
        private final long savingsAdvanceRepayment;
        private final long totalValue;

        public MaturityPayoutDetail() {
            this(false, 0L, 0L, 0L, 15, null);
        }

        public static /* synthetic */ MaturityPayoutDetail copy$default(MaturityPayoutDetail maturityPayoutDetail, boolean z3, long j6, long j10, long j11, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = maturityPayoutDetail.hasAutoRepay;
            }
            if ((i7 & 2) != 0) {
                j6 = maturityPayoutDetail.payoutValue;
            }
            if ((i7 & 4) != 0) {
                j10 = maturityPayoutDetail.savingsAdvanceRepayment;
            }
            if ((i7 & 8) != 0) {
                j11 = maturityPayoutDetail.totalValue;
            }
            long j12 = j11;
            return maturityPayoutDetail.copy(z3, j6, j10, j12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasAutoRepay() {
            return this.hasAutoRepay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getPayoutValue() {
            return this.payoutValue;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getSavingsAdvanceRepayment() {
            return this.savingsAdvanceRepayment;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTotalValue() {
            return this.totalValue;
        }

        @NotNull
        public final MaturityPayoutDetail copy(boolean hasAutoRepay, long payoutValue, long savingsAdvanceRepayment, long totalValue) {
            return new MaturityPayoutDetail(hasAutoRepay, payoutValue, savingsAdvanceRepayment, totalValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaturityPayoutDetail)) {
                return false;
            }
            MaturityPayoutDetail maturityPayoutDetail = (MaturityPayoutDetail) other;
            return this.hasAutoRepay == maturityPayoutDetail.hasAutoRepay && this.payoutValue == maturityPayoutDetail.payoutValue && this.savingsAdvanceRepayment == maturityPayoutDetail.savingsAdvanceRepayment && this.totalValue == maturityPayoutDetail.totalValue;
        }

        public final boolean getHasAutoRepay() {
            return this.hasAutoRepay;
        }

        public final long getPayoutValue() {
            return this.payoutValue;
        }

        public final long getSavingsAdvanceRepayment() {
            return this.savingsAdvanceRepayment;
        }

        public final long getTotalValue() {
            return this.totalValue;
        }

        public int hashCode() {
            return Long.hashCode(this.totalValue) + q0.b(q0.b(Boolean.hashCode(this.hasAutoRepay) * 31, 31, this.payoutValue), 31, this.savingsAdvanceRepayment);
        }

        @NotNull
        public String toString() {
            boolean z3 = this.hasAutoRepay;
            long j6 = this.payoutValue;
            long j10 = this.savingsAdvanceRepayment;
            long j11 = this.totalValue;
            StringBuilder sb2 = new StringBuilder("MaturityPayoutDetail(hasAutoRepay=");
            sb2.append(z3);
            sb2.append(", payoutValue=");
            sb2.append(j6);
            u.v(sb2, ", savingsAdvanceRepayment=", j10, ", totalValue=");
            return q0.n(sb2, ")", j11);
        }

        public MaturityPayoutDetail(boolean z3, long j6, long j10, long j11) {
            this.hasAutoRepay = z3;
            this.payoutValue = j6;
            this.savingsAdvanceRepayment = j10;
            this.totalValue = j11;
        }

        public /* synthetic */ MaturityPayoutDetail(boolean z3, long j6, long j10, long j11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? false : z3, (i7 & 2) != 0 ? 0L : j6, (i7 & 4) != 0 ? 0L : j10, (i7 & 8) != 0 ? 0L : j11);
        }
    }

    public GetOrderDetailResp(@Nullable OrderDetailInfo orderDetailInfo) {
        this.data = orderDetailInfo;
    }

    public static /* synthetic */ GetOrderDetailResp copy$default(GetOrderDetailResp getOrderDetailResp, OrderDetailInfo orderDetailInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            orderDetailInfo = getOrderDetailResp.data;
        }
        return getOrderDetailResp.copy(orderDetailInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderDetailInfo getData() {
        return this.data;
    }

    @NotNull
    public final GetOrderDetailResp copy(@Nullable OrderDetailInfo data) {
        return new GetOrderDetailResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetOrderDetailResp) && Intrinsics.c(this.data, ((GetOrderDetailResp) other).data);
    }

    @Nullable
    public final OrderDetailInfo getData() {
        return this.data;
    }

    public int hashCode() {
        OrderDetailInfo orderDetailInfo = this.data;
        if (orderDetailInfo == null) {
            return 0;
        }
        return orderDetailInfo.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetOrderDetailResp(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b \u0010!J\b\u0010D\u001a\u0004\u0018\u00010\u0005J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00100J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J¢\u0002\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\bHÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b?\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\bB\u0010#R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\bC\u0010#¨\u0006d"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$OrderDetailInfo;", "", "productId", "", "productName", "", "amount", "durationDay", "", "earning", "totalPayback", "goal", "annualizedIncomeRatio", "payType", "transactionTime", "transactionId", "accountNumber", "accountName", "pin", "payStatus", "stateInfo", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "bankCard", "bankName", "payoutOption", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "orgOrderNo", "couponAmount", "maturityPayoutDetail", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$MaturityPayoutDetail;", "earlyWithdrawalFee", "cashPrincipal", "<init>", "(Ljava/lang/Long;Ljava/lang/String;JIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;Ljava/lang/String;Ljava/lang/Long;Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$MaturityPayoutDetail;Ljava/lang/Long;Ljava/lang/Long;)V", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProductName", "()Ljava/lang/String;", "getAmount", "()J", "getDurationDay", "()I", "getEarning", "getTotalPayback", "getGoal", "getAnnualizedIncomeRatio", "getPayType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTransactionTime", "getTransactionId", "getAccountNumber", "getAccountName", "getPin", "getPayStatus", "getStateInfo", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "getBankCard", "getBankName", "getPayoutOption", "()Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "getOrgOrderNo", "getCouponAmount", "getMaturityPayoutDetail", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$MaturityPayoutDetail;", "getEarlyWithdrawalFee", "getCashPrincipal", "getShowName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/Long;Ljava/lang/String;JIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;Ljava/lang/String;Ljava/lang/Long;Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$MaturityPayoutDetail;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/resp/GetOrderDetailResp$OrderDetailInfo;", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderDetailInfo {

        @Nullable
        private final String accountName;

        @Nullable
        private final String accountNumber;
        private final long amount;

        @Nullable
        private final String annualizedIncomeRatio;

        @Nullable
        private final String bankCard;

        @Nullable
        private final String bankName;

        @Nullable
        private final Long cashPrincipal;

        @Nullable
        private final Long couponAmount;
        private final int durationDay;

        @Nullable
        private final Long earlyWithdrawalFee;
        private final long earning;

        @Nullable
        private final String goal;

        @Nullable
        private final MaturityPayoutDetail maturityPayoutDetail;

        @Nullable
        private final String orgOrderNo;
        private final int payStatus;

        @Nullable
        private final Integer payType;

        @Nullable
        private final PayoutOption payoutOption;

        @Nullable
        private final String pin;

        @Nullable
        private final Long productId;

        @Nullable
        private final String productName;

        @Nullable
        private final GetBeforeOrderResp.StateInfo stateInfo;
        private final long totalPayback;

        @Nullable
        private final String transactionId;
        private final long transactionTime;

        public OrderDetailInfo(@Nullable Long l5, @Nullable String str, long j6, int i7, long j10, long j11, @Nullable String str2, @Nullable String str3, @Nullable Integer num, long j12, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i10, @Nullable GetBeforeOrderResp.StateInfo stateInfo, @Nullable String str8, @Nullable String str9, @Nullable PayoutOption payoutOption, @Nullable String str10, @Nullable Long l6, @Nullable MaturityPayoutDetail maturityPayoutDetail, @Nullable Long l8, @Nullable Long l10) {
            this.productId = l5;
            this.productName = str;
            this.amount = j6;
            this.durationDay = i7;
            this.earning = j10;
            this.totalPayback = j11;
            this.goal = str2;
            this.annualizedIncomeRatio = str3;
            this.payType = num;
            this.transactionTime = j12;
            this.transactionId = str4;
            this.accountNumber = str5;
            this.accountName = str6;
            this.pin = str7;
            this.payStatus = i10;
            this.stateInfo = stateInfo;
            this.bankCard = str8;
            this.bankName = str9;
            this.payoutOption = payoutOption;
            this.orgOrderNo = str10;
            this.couponAmount = l6;
            this.maturityPayoutDetail = maturityPayoutDetail;
            this.earlyWithdrawalFee = l8;
            this.cashPrincipal = l10;
        }

        public static /* synthetic */ OrderDetailInfo copy$default(OrderDetailInfo orderDetailInfo, Long l5, String str, long j6, int i7, long j10, long j11, String str2, String str3, Integer num, long j12, String str4, String str5, String str6, String str7, int i10, GetBeforeOrderResp.StateInfo stateInfo, String str8, String str9, PayoutOption payoutOption, String str10, Long l6, MaturityPayoutDetail maturityPayoutDetail, Long l8, Long l10, int i11, Object obj) {
            Long l11;
            Long l12;
            Long l13 = (i11 & 1) != 0 ? orderDetailInfo.productId : l5;
            String str11 = (i11 & 2) != 0 ? orderDetailInfo.productName : str;
            long j13 = (i11 & 4) != 0 ? orderDetailInfo.amount : j6;
            int i12 = (i11 & 8) != 0 ? orderDetailInfo.durationDay : i7;
            long j14 = (i11 & 16) != 0 ? orderDetailInfo.earning : j10;
            long j15 = (i11 & 32) != 0 ? orderDetailInfo.totalPayback : j11;
            String str12 = (i11 & 64) != 0 ? orderDetailInfo.goal : str2;
            String str13 = (i11 & 128) != 0 ? orderDetailInfo.annualizedIncomeRatio : str3;
            Integer num2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? orderDetailInfo.payType : num;
            long j16 = (i11 & 512) != 0 ? orderDetailInfo.transactionTime : j12;
            Long l14 = l13;
            String str14 = (i11 & 1024) != 0 ? orderDetailInfo.transactionId : str4;
            String str15 = (i11 & 2048) != 0 ? orderDetailInfo.accountNumber : str5;
            String str16 = (i11 & 4096) != 0 ? orderDetailInfo.accountName : str6;
            String str17 = (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? orderDetailInfo.pin : str7;
            int i13 = (i11 & 16384) != 0 ? orderDetailInfo.payStatus : i10;
            GetBeforeOrderResp.StateInfo stateInfo2 = (i11 & 32768) != 0 ? orderDetailInfo.stateInfo : stateInfo;
            String str18 = (i11 & 65536) != 0 ? orderDetailInfo.bankCard : str8;
            String str19 = (i11 & 131072) != 0 ? orderDetailInfo.bankName : str9;
            PayoutOption payoutOption2 = (i11 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? orderDetailInfo.payoutOption : payoutOption;
            String str20 = (i11 & 524288) != 0 ? orderDetailInfo.orgOrderNo : str10;
            Long l15 = (i11 & 1048576) != 0 ? orderDetailInfo.couponAmount : l6;
            MaturityPayoutDetail maturityPayoutDetail2 = (i11 & 2097152) != 0 ? orderDetailInfo.maturityPayoutDetail : maturityPayoutDetail;
            Long l16 = (i11 & 4194304) != 0 ? orderDetailInfo.earlyWithdrawalFee : l8;
            if ((i11 & 8388608) != 0) {
                l12 = l16;
                l11 = orderDetailInfo.cashPrincipal;
            } else {
                l11 = l10;
                l12 = l16;
            }
            return orderDetailInfo.copy(l14, str11, j13, i12, j14, j15, str12, str13, num2, j16, str14, str15, str16, str17, i13, stateInfo2, str18, str19, payoutOption2, str20, l15, maturityPayoutDetail2, l12, l11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final long getTransactionTime() {
            return this.transactionTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getPin() {
            return this.pin;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getPayStatus() {
            return this.payStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final GetBeforeOrderResp.StateInfo getStateInfo() {
            return this.stateInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getBankCard() {
            return this.bankCard;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final PayoutOption getPayoutOption() {
            return this.payoutOption;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getOrgOrderNo() {
            return this.orgOrderNo;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final MaturityPayoutDetail getMaturityPayoutDetail() {
            return this.maturityPayoutDetail;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final Long getEarlyWithdrawalFee() {
            return this.earlyWithdrawalFee;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Long getCashPrincipal() {
            return this.cashPrincipal;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getDurationDay() {
            return this.durationDay;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getEarning() {
            return this.earning;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getTotalPayback() {
            return this.totalPayback;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getGoal() {
            return this.goal;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAnnualizedIncomeRatio() {
            return this.annualizedIncomeRatio;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getPayType() {
            return this.payType;
        }

        @NotNull
        public final OrderDetailInfo copy(@Nullable Long productId, @Nullable String productName, long amount, int durationDay, long earning, long totalPayback, @Nullable String goal, @Nullable String annualizedIncomeRatio, @Nullable Integer payType, long transactionTime, @Nullable String transactionId, @Nullable String accountNumber, @Nullable String accountName, @Nullable String pin, int payStatus, @Nullable GetBeforeOrderResp.StateInfo stateInfo, @Nullable String bankCard, @Nullable String bankName, @Nullable PayoutOption payoutOption, @Nullable String orgOrderNo, @Nullable Long couponAmount, @Nullable MaturityPayoutDetail maturityPayoutDetail, @Nullable Long earlyWithdrawalFee, @Nullable Long cashPrincipal) {
            return new OrderDetailInfo(productId, productName, amount, durationDay, earning, totalPayback, goal, annualizedIncomeRatio, payType, transactionTime, transactionId, accountNumber, accountName, pin, payStatus, stateInfo, bankCard, bankName, payoutOption, orgOrderNo, couponAmount, maturityPayoutDetail, earlyWithdrawalFee, cashPrincipal);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDetailInfo)) {
                return false;
            }
            OrderDetailInfo orderDetailInfo = (OrderDetailInfo) other;
            return Intrinsics.c(this.productId, orderDetailInfo.productId) && Intrinsics.c(this.productName, orderDetailInfo.productName) && this.amount == orderDetailInfo.amount && this.durationDay == orderDetailInfo.durationDay && this.earning == orderDetailInfo.earning && this.totalPayback == orderDetailInfo.totalPayback && Intrinsics.c(this.goal, orderDetailInfo.goal) && Intrinsics.c(this.annualizedIncomeRatio, orderDetailInfo.annualizedIncomeRatio) && Intrinsics.c(this.payType, orderDetailInfo.payType) && this.transactionTime == orderDetailInfo.transactionTime && Intrinsics.c(this.transactionId, orderDetailInfo.transactionId) && Intrinsics.c(this.accountNumber, orderDetailInfo.accountNumber) && Intrinsics.c(this.accountName, orderDetailInfo.accountName) && Intrinsics.c(this.pin, orderDetailInfo.pin) && this.payStatus == orderDetailInfo.payStatus && Intrinsics.c(this.stateInfo, orderDetailInfo.stateInfo) && Intrinsics.c(this.bankCard, orderDetailInfo.bankCard) && Intrinsics.c(this.bankName, orderDetailInfo.bankName) && Intrinsics.c(this.payoutOption, orderDetailInfo.payoutOption) && Intrinsics.c(this.orgOrderNo, orderDetailInfo.orgOrderNo) && Intrinsics.c(this.couponAmount, orderDetailInfo.couponAmount) && Intrinsics.c(this.maturityPayoutDetail, orderDetailInfo.maturityPayoutDetail) && Intrinsics.c(this.earlyWithdrawalFee, orderDetailInfo.earlyWithdrawalFee) && Intrinsics.c(this.cashPrincipal, orderDetailInfo.cashPrincipal);
        }

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final long getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getAnnualizedIncomeRatio() {
            return this.annualizedIncomeRatio;
        }

        @Nullable
        public final String getBankCard() {
            return this.bankCard;
        }

        @Nullable
        public final String getBankName() {
            return this.bankName;
        }

        @Nullable
        public final Long getCashPrincipal() {
            return this.cashPrincipal;
        }

        @Nullable
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        public final int getDurationDay() {
            return this.durationDay;
        }

        @Nullable
        public final Long getEarlyWithdrawalFee() {
            return this.earlyWithdrawalFee;
        }

        public final long getEarning() {
            return this.earning;
        }

        @Nullable
        public final String getGoal() {
            return this.goal;
        }

        @Nullable
        public final MaturityPayoutDetail getMaturityPayoutDetail() {
            return this.maturityPayoutDetail;
        }

        @Nullable
        public final String getOrgOrderNo() {
            return this.orgOrderNo;
        }

        public final int getPayStatus() {
            return this.payStatus;
        }

        @Nullable
        public final Integer getPayType() {
            return this.payType;
        }

        @Nullable
        public final PayoutOption getPayoutOption() {
            return this.payoutOption;
        }

        @Nullable
        public final String getPin() {
            return this.pin;
        }

        @Nullable
        public final Long getProductId() {
            return this.productId;
        }

        @Nullable
        public final String getProductName() {
            return this.productName;
        }

        @Nullable
        public final String getShowName() {
            if (TextUtils.isEmpty(this.goal)) {
                return TextUtils.isEmpty(this.productName) ? u.g(this.durationDay, "-fixed-day") : this.productName;
            }
            return this.goal;
        }

        @Nullable
        public final GetBeforeOrderResp.StateInfo getStateInfo() {
            return this.stateInfo;
        }

        public final long getTotalPayback() {
            return this.totalPayback;
        }

        @Nullable
        public final String getTransactionId() {
            return this.transactionId;
        }

        public final long getTransactionTime() {
            return this.transactionTime;
        }

        public int hashCode() {
            Long l5 = this.productId;
            int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
            String str = this.productName;
            int iB = q0.b(q0.b(u.b(this.durationDay, q0.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount), 31), 31, this.earning), 31, this.totalPayback);
            String str2 = this.goal;
            int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.annualizedIncomeRatio;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.payType;
            int iB2 = q0.b((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.transactionTime);
            String str4 = this.transactionId;
            int iHashCode4 = (iB2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.accountNumber;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.accountName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.pin;
            int iB3 = u.b(this.payStatus, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
            GetBeforeOrderResp.StateInfo stateInfo = this.stateInfo;
            int iHashCode7 = (iB3 + (stateInfo == null ? 0 : stateInfo.hashCode())) * 31;
            String str8 = this.bankCard;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.bankName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            PayoutOption payoutOption = this.payoutOption;
            int iHashCode10 = (iHashCode9 + (payoutOption == null ? 0 : payoutOption.hashCode())) * 31;
            String str10 = this.orgOrderNo;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Long l6 = this.couponAmount;
            int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
            MaturityPayoutDetail maturityPayoutDetail = this.maturityPayoutDetail;
            int iHashCode13 = (iHashCode12 + (maturityPayoutDetail == null ? 0 : maturityPayoutDetail.hashCode())) * 31;
            Long l8 = this.earlyWithdrawalFee;
            int iHashCode14 = (iHashCode13 + (l8 == null ? 0 : l8.hashCode())) * 31;
            Long l10 = this.cashPrincipal;
            return iHashCode14 + (l10 != null ? l10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l5 = this.productId;
            String str = this.productName;
            long j6 = this.amount;
            int i7 = this.durationDay;
            long j10 = this.earning;
            long j11 = this.totalPayback;
            String str2 = this.goal;
            String str3 = this.annualizedIncomeRatio;
            Integer num = this.payType;
            long j12 = this.transactionTime;
            String str4 = this.transactionId;
            String str5 = this.accountNumber;
            String str6 = this.accountName;
            String str7 = this.pin;
            int i10 = this.payStatus;
            GetBeforeOrderResp.StateInfo stateInfo = this.stateInfo;
            String str8 = this.bankCard;
            String str9 = this.bankName;
            PayoutOption payoutOption = this.payoutOption;
            String str10 = this.orgOrderNo;
            Long l6 = this.couponAmount;
            MaturityPayoutDetail maturityPayoutDetail = this.maturityPayoutDetail;
            Long l8 = this.earlyWithdrawalFee;
            Long l10 = this.cashPrincipal;
            StringBuilder sb2 = new StringBuilder("OrderDetailInfo(productId=");
            sb2.append(l5);
            sb2.append(", productName=");
            sb2.append(str);
            sb2.append(", amount=");
            sb2.append(j6);
            sb2.append(", durationDay=");
            sb2.append(i7);
            u.v(sb2, ", earning=", j10, ", totalPayback=");
            sb2.append(j11);
            sb2.append(", goal=");
            sb2.append(str2);
            sb2.append(", annualizedIncomeRatio=");
            sb2.append(str3);
            sb2.append(", payType=");
            sb2.append(num);
            u.v(sb2, ", transactionTime=", j12, ", transactionId=");
            u.x(sb2, str4, ", accountNumber=", str5, ", accountName=");
            u.x(sb2, str6, ", pin=", str7, ", payStatus=");
            sb2.append(i10);
            sb2.append(", stateInfo=");
            sb2.append(stateInfo);
            sb2.append(", bankCard=");
            u.x(sb2, str8, ", bankName=", str9, ", payoutOption=");
            sb2.append(payoutOption);
            sb2.append(", orgOrderNo=");
            sb2.append(str10);
            sb2.append(", couponAmount=");
            sb2.append(l6);
            sb2.append(", maturityPayoutDetail=");
            sb2.append(maturityPayoutDetail);
            sb2.append(", earlyWithdrawalFee=");
            sb2.append(l8);
            sb2.append(", cashPrincipal=");
            sb2.append(l10);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ OrderDetailInfo(Long l5, String str, long j6, int i7, long j10, long j11, String str2, String str3, Integer num, long j12, String str4, String str5, String str6, String str7, int i10, GetBeforeOrderResp.StateInfo stateInfo, String str8, String str9, PayoutOption payoutOption, String str10, Long l6, MaturityPayoutDetail maturityPayoutDetail, Long l8, Long l10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(l5, str, (i11 & 4) != 0 ? 0L : j6, (i11 & 8) != 0 ? 0 : i7, (i11 & 16) != 0 ? 0L : j10, (i11 & 32) != 0 ? 0L : j11, str2, str3, num, (i11 & 512) != 0 ? 0L : j12, str4, str5, str6, str7, i10, stateInfo, str8, str9, payoutOption, str10, l6, maturityPayoutDetail, l8, l10);
        }
    }
}
