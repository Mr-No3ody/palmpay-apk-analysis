package com.transsnet.palmpay.teller.bean;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/OrderReminderSubscribeReq;", "", "orderNo", "", "<init>", "(Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OrderReminderSubscribeReq {

    @NotNull
    private final String orderNo;

    public OrderReminderSubscribeReq(@NotNull String orderNo) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        this.orderNo = orderNo;
    }

    public static /* synthetic */ OrderReminderSubscribeReq copy$default(OrderReminderSubscribeReq orderReminderSubscribeReq, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = orderReminderSubscribeReq.orderNo;
        }
        return orderReminderSubscribeReq.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    public final OrderReminderSubscribeReq copy(@NotNull String orderNo) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        return new OrderReminderSubscribeReq(orderNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderReminderSubscribeReq) && Intrinsics.c(this.orderNo, ((OrderReminderSubscribeReq) other).orderNo);
    }

    @NotNull
    public final String getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        return this.orderNo.hashCode();
    }

    @NotNull
    public String toString() {
        return q0.k("OrderReminderSubscribeReq(orderNo=", this.orderNo, ")");
    }
}
