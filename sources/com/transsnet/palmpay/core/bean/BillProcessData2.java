package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/BillProcessData2;", "", "node", "", "nodeStatus", "", "orderStatus", "selected", "", "shortTips", "tips", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillProcessData2 {

    @JvmField
    @NotNull
    public final String node;

    @JvmField
    public final int nodeStatus;

    @JvmField
    @NotNull
    public final String orderStatus;

    @JvmField
    public final boolean selected;

    @JvmField
    @NotNull
    public final String shortTips;

    @JvmField
    @NotNull
    public final String tips;

    public BillProcessData2(@NotNull String node, int i7, @NotNull String orderStatus, boolean z3, @NotNull String shortTips, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(shortTips, "shortTips");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.node = node;
        this.nodeStatus = i7;
        this.orderStatus = orderStatus;
        this.selected = z3;
        this.shortTips = shortTips;
        this.tips = tips;
    }
}
