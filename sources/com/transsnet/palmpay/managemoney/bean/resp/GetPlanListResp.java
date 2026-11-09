package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetPlanListResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/PageDataBean;", "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "<init>", "(Lcom/transsnet/palmpay/core/bean/PageDataBean;)V", "getData", "()Lcom/transsnet/palmpay/core/bean/PageDataBean;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetPlanListResp extends CommonResult {

    @Nullable
    private final PageDataBean<ProductBean> data;

    public GetPlanListResp(@Nullable PageDataBean<ProductBean> pageDataBean) {
        this.data = pageDataBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPlanListResp copy$default(GetPlanListResp getPlanListResp, PageDataBean pageDataBean, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pageDataBean = getPlanListResp.data;
        }
        return getPlanListResp.copy(pageDataBean);
    }

    @Nullable
    public final PageDataBean<ProductBean> component1() {
        return this.data;
    }

    @NotNull
    public final GetPlanListResp copy(@Nullable PageDataBean<ProductBean> data) {
        return new GetPlanListResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetPlanListResp) && Intrinsics.c(this.data, ((GetPlanListResp) other).data);
    }

    @Nullable
    public final PageDataBean<ProductBean> getData() {
        return this.data;
    }

    public int hashCode() {
        PageDataBean<ProductBean> pageDataBean = this.data;
        if (pageDataBean == null) {
            return 0;
        }
        return pageDataBean.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetPlanListResp(data=" + this.data + ")";
    }
}
