package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/DowntimeOrderListBean;", "", "<init>", "()V", "total", "", "getTotal", "()Ljava/lang/Long;", "setTotal", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "list", "", "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp$AirtimeDownTimeOrderUpdate;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DowntimeOrderListBean {

    @Nullable
    private List<AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate> list;

    @Nullable
    private Long total;

    @Nullable
    public final List<AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate> getList() {
        return this.list;
    }

    @Nullable
    public final Long getTotal() {
        return this.total;
    }

    public final void setList(@Nullable List<AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate> list) {
        this.list = list;
    }

    public final void setTotal(@Nullable Long l5) {
        this.total = l5;
    }
}
