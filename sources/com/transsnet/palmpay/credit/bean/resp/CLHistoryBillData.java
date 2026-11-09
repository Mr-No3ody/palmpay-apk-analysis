package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLHistoryBillData;", "", "curPage", "", "list", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLHistoryBillDetail;", "pageSize", "total", "", "totalPage", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "getCurPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getList", "()Ljava/util/List;", "getPageSize", "getTotal", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalPage", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLHistoryBillData {

    @Nullable
    private final Integer curPage;

    @Nullable
    private final List<CLHistoryBillDetail> list;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Long total;

    @Nullable
    private final Integer totalPage;

    public CLHistoryBillData(@Nullable Integer num, @Nullable List<CLHistoryBillDetail> list, @Nullable Integer num2, @Nullable Long l5, @Nullable Integer num3) {
        this.curPage = num;
        this.list = list;
        this.pageSize = num2;
        this.total = l5;
        this.totalPage = num3;
    }

    @Nullable
    public final Integer getCurPage() {
        return this.curPage;
    }

    @Nullable
    public final List<CLHistoryBillDetail> getList() {
        return this.list;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Long getTotal() {
        return this.total;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }
}
