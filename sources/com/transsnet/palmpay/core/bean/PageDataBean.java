package com.transsnet.palmpay.core.bean;

import com.transsnet.palmpay.core.bean.bill.BillRsp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/PageDataBean;", "T", "", "list", "", "extData", "Lcom/transsnet/palmpay/core/bean/bill/BillRsp$DataBean$ExtDataBean;", "total", "", "totalPage", "curPage", "pageSize", "<init>", "(Ljava/util/List;Lcom/transsnet/palmpay/core/bean/bill/BillRsp$DataBean$ExtDataBean;IIII)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PageDataBean<T> {

    @JvmField
    public final int curPage;

    @JvmField
    @NotNull
    public final BillRsp.DataBean.ExtDataBean extData;

    @JvmField
    @NotNull
    public final List<T> list;

    @JvmField
    public final int pageSize;

    @JvmField
    public final int total;

    @JvmField
    public final int totalPage;

    /* JADX WARN: Multi-variable type inference failed */
    public PageDataBean(@NotNull List<? extends T> list, @NotNull BillRsp.DataBean.ExtDataBean extData, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(extData, "extData");
        this.list = list;
        this.extData = extData;
        this.total = i7;
        this.totalPage = i10;
        this.curPage = i11;
        this.pageSize = i12;
    }
}
