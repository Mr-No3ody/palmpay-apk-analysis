package com.transsnet.palmpay.managemoney.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/GetPageDataReq;", "", "pageNum", "", "pageSize", "planType", "<init>", "(III)V", "getPageNum", "()I", "getPageSize", "getPlanType", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetPageDataReq {
    private final int pageNum;
    private final int pageSize;
    private final int planType;

    public GetPageDataReq(int i7, int i10, int i11) {
        this.pageNum = i7;
        this.pageSize = i10;
        this.planType = i11;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getPlanType() {
        return this.planType;
    }

    public /* synthetic */ GetPageDataReq(int i7, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i12 & 2) != 0 ? 10 : i10, i11);
    }
}
