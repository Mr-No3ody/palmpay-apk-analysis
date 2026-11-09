package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/CreateOrderResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/ProductBean;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateOrderResp extends CommonResult {

    @Nullable
    private final ProductBean data;

    public CreateOrderResp(@Nullable ProductBean productBean) {
        this.data = productBean;
    }

    public static /* synthetic */ CreateOrderResp copy$default(CreateOrderResp createOrderResp, ProductBean productBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            productBean = createOrderResp.data;
        }
        return createOrderResp.copy(productBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProductBean getData() {
        return this.data;
    }

    @NotNull
    public final CreateOrderResp copy(@Nullable ProductBean data) {
        return new CreateOrderResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateOrderResp) && Intrinsics.c(this.data, ((CreateOrderResp) other).data);
    }

    @Nullable
    public final ProductBean getData() {
        return this.data;
    }

    public int hashCode() {
        ProductBean productBean = this.data;
        if (productBean == null) {
            return 0;
        }
        return productBean.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CreateOrderResp(data=" + this.data + ")";
    }
}
