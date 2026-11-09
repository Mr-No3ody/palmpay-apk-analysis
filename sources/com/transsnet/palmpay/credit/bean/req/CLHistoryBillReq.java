package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLHistoryBillReq;", "", "pageNum", "", "pageSize", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPageNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLHistoryBillReq {

    @Nullable
    private final Integer pageNum;

    @Nullable
    private final Integer pageSize;

    public CLHistoryBillReq(@Nullable Integer num, @Nullable Integer num2) {
        this.pageNum = num;
        this.pageSize = num2;
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }
}
