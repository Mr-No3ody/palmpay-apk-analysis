package com.transsnet.palmpay.managemoney.bean.resp;

import N8.q0;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp$CreateWithdrawOrder;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp$CreateWithdrawOrder;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp$CreateWithdrawOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CreateWithdrawOrder", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateWithdrawOrderResp extends CommonResult {

    @Nullable
    private final CreateWithdrawOrder data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CreateWithdrawOrderResp$CreateWithdrawOrder;", "", "cashOrderId", "", "<init>", "(Ljava/lang/String;)V", "getCashOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateWithdrawOrder {

        @Nullable
        private final String cashOrderId;

        public CreateWithdrawOrder(@Nullable String str) {
            this.cashOrderId = str;
        }

        public static /* synthetic */ CreateWithdrawOrder copy$default(CreateWithdrawOrder createWithdrawOrder, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = createWithdrawOrder.cashOrderId;
            }
            return createWithdrawOrder.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCashOrderId() {
            return this.cashOrderId;
        }

        @NotNull
        public final CreateWithdrawOrder copy(@Nullable String cashOrderId) {
            return new CreateWithdrawOrder(cashOrderId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateWithdrawOrder) && Intrinsics.c(this.cashOrderId, ((CreateWithdrawOrder) other).cashOrderId);
        }

        @Nullable
        public final String getCashOrderId() {
            return this.cashOrderId;
        }

        public int hashCode() {
            String str = this.cashOrderId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return q0.k("CreateWithdrawOrder(cashOrderId=", this.cashOrderId, ")");
        }
    }

    public CreateWithdrawOrderResp(@Nullable CreateWithdrawOrder createWithdrawOrder) {
        this.data = createWithdrawOrder;
    }

    public static /* synthetic */ CreateWithdrawOrderResp copy$default(CreateWithdrawOrderResp createWithdrawOrderResp, CreateWithdrawOrder createWithdrawOrder, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            createWithdrawOrder = createWithdrawOrderResp.data;
        }
        return createWithdrawOrderResp.copy(createWithdrawOrder);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreateWithdrawOrder getData() {
        return this.data;
    }

    @NotNull
    public final CreateWithdrawOrderResp copy(@Nullable CreateWithdrawOrder data) {
        return new CreateWithdrawOrderResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateWithdrawOrderResp) && Intrinsics.c(this.data, ((CreateWithdrawOrderResp) other).data);
    }

    @Nullable
    public final CreateWithdrawOrder getData() {
        return this.data;
    }

    public int hashCode() {
        CreateWithdrawOrder createWithdrawOrder = this.data;
        if (createWithdrawOrder == null) {
            return 0;
        }
        return createWithdrawOrder.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CreateWithdrawOrderResp(data=" + this.data + ")";
    }
}
