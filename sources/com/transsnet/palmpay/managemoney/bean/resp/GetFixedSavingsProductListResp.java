package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetFixedSavingsProductListResp;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetFixedSavingsProductListResp {

    @Nullable
    private final List<ProductBean> data;

    public GetFixedSavingsProductListResp(@Nullable List<ProductBean> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetFixedSavingsProductListResp copy$default(GetFixedSavingsProductListResp getFixedSavingsProductListResp, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = getFixedSavingsProductListResp.data;
        }
        return getFixedSavingsProductListResp.copy(list);
    }

    @Nullable
    public final List<ProductBean> component1() {
        return this.data;
    }

    @NotNull
    public final GetFixedSavingsProductListResp copy(@Nullable List<ProductBean> data) {
        return new GetFixedSavingsProductListResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetFixedSavingsProductListResp) && Intrinsics.c(this.data, ((GetFixedSavingsProductListResp) other).data);
    }

    @Nullable
    public final List<ProductBean> getData() {
        return this.data;
    }

    public int hashCode() {
        List<ProductBean> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetFixedSavingsProductListResp(data=" + this.data + ")";
    }
}
