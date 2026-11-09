package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/RouterNodeInfo;", "", "current", "Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;", "prev", "next", "<init>", "(Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RouterNodeInfo {

    @JvmField
    @Nullable
    public OcRouterDetail current;

    @JvmField
    @Nullable
    public final OcRouterDetail next;

    @JvmField
    @Nullable
    public final OcRouterDetail prev;

    public RouterNodeInfo() {
        this(null, null, null, 7, null);
    }

    public RouterNodeInfo(@Nullable OcRouterDetail ocRouterDetail, @Nullable OcRouterDetail ocRouterDetail2, @Nullable OcRouterDetail ocRouterDetail3) {
        this.current = ocRouterDetail;
        this.prev = ocRouterDetail2;
        this.next = ocRouterDetail3;
    }

    public /* synthetic */ RouterNodeInfo(OcRouterDetail ocRouterDetail, OcRouterDetail ocRouterDetail2, OcRouterDetail ocRouterDetail3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : ocRouterDetail, (i7 & 2) != 0 ? null : ocRouterDetail2, (i7 & 4) != 0 ? null : ocRouterDetail3);
    }
}
