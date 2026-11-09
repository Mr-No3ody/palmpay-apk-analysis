package com.transsnet.palmpay.managemoney.bean.req;

import N8.q0;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/QueryOrderNoReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "payId", "", "<init>", "(Ljava/lang/String;)V", "getPayId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryOrderNoReq implements SingleLiveData$Params {

    @Nullable
    private final String payId;

    public QueryOrderNoReq(@Nullable String str) {
        this.payId = str;
    }

    public static /* synthetic */ QueryOrderNoReq copy$default(QueryOrderNoReq queryOrderNoReq, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = queryOrderNoReq.payId;
        }
        return queryOrderNoReq.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayId() {
        return this.payId;
    }

    @NotNull
    public final QueryOrderNoReq copy(@Nullable String payId) {
        return new QueryOrderNoReq(payId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QueryOrderNoReq) && Intrinsics.c(this.payId, ((QueryOrderNoReq) other).payId);
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    public int hashCode() {
        String str = this.payId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return q0.k("QueryOrderNoReq(payId=", this.payId, ")");
    }
}
