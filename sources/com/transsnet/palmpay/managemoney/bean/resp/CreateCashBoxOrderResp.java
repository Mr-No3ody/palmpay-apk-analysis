package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp$CreateCashBoxOrderResult;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp$CreateCashBoxOrderResult;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp$CreateCashBoxOrderResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CreateCashBoxOrderResult", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateCashBoxOrderResp extends CommonResult {

    @Nullable
    private final CreateCashBoxOrderResult data;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp$CreateCashBoxOrderResult;", "", "principal", "", "orderId", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getPrincipal", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/managemoney/bean/resp/CreateCashBoxOrderResp$CreateCashBoxOrderResult;", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateCashBoxOrderResult {

        @Nullable
        private final String orderId;

        @Nullable
        private final Long principal;

        public CreateCashBoxOrderResult(@Nullable Long l5, @Nullable String str) {
            this.principal = l5;
            this.orderId = str;
        }

        public static /* synthetic */ CreateCashBoxOrderResult copy$default(CreateCashBoxOrderResult createCashBoxOrderResult, Long l5, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                l5 = createCashBoxOrderResult.principal;
            }
            if ((i7 & 2) != 0) {
                str = createCashBoxOrderResult.orderId;
            }
            return createCashBoxOrderResult.copy(l5, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getPrincipal() {
            return this.principal;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @NotNull
        public final CreateCashBoxOrderResult copy(@Nullable Long principal, @Nullable String orderId) {
            return new CreateCashBoxOrderResult(principal, orderId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateCashBoxOrderResult)) {
                return false;
            }
            CreateCashBoxOrderResult createCashBoxOrderResult = (CreateCashBoxOrderResult) other;
            return Intrinsics.c(this.principal, createCashBoxOrderResult.principal) && Intrinsics.c(this.orderId, createCashBoxOrderResult.orderId);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final Long getPrincipal() {
            return this.principal;
        }

        public int hashCode() {
            Long l5 = this.principal;
            int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
            String str = this.orderId;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CreateCashBoxOrderResult(principal=" + this.principal + ", orderId=" + this.orderId + ")";
        }
    }

    public CreateCashBoxOrderResp(@Nullable CreateCashBoxOrderResult createCashBoxOrderResult) {
        this.data = createCashBoxOrderResult;
    }

    public static /* synthetic */ CreateCashBoxOrderResp copy$default(CreateCashBoxOrderResp createCashBoxOrderResp, CreateCashBoxOrderResult createCashBoxOrderResult, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            createCashBoxOrderResult = createCashBoxOrderResp.data;
        }
        return createCashBoxOrderResp.copy(createCashBoxOrderResult);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreateCashBoxOrderResult getData() {
        return this.data;
    }

    @NotNull
    public final CreateCashBoxOrderResp copy(@Nullable CreateCashBoxOrderResult data) {
        return new CreateCashBoxOrderResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateCashBoxOrderResp) && Intrinsics.c(this.data, ((CreateCashBoxOrderResp) other).data);
    }

    @Nullable
    public final CreateCashBoxOrderResult getData() {
        return this.data;
    }

    public int hashCode() {
        CreateCashBoxOrderResult createCashBoxOrderResult = this.data;
        if (createCashBoxOrderResult == null) {
            return 0;
        }
        return createCashBoxOrderResult.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CreateCashBoxOrderResp(data=" + this.data + ")";
    }
}
