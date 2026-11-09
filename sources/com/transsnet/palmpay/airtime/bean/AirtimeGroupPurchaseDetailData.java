package com.transsnet.palmpay.airtime.bean;

import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeGroupPurchaseDetailData;", "Lcom/transsnet/palmpay/core/bean/BaseOrderDetailBean;", "<init>", "()V", "orderStatus", "", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "orderStatusDesc", "", "getOrderStatusDesc", "()Ljava/lang/String;", "setOrderStatusDesc", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "itemPrice", "", "getItemPrice", "()Ljava/lang/Long;", "setItemPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeGroupPurchaseDetailData extends BaseOrderDetailBean {

    @Nullable
    private Integer orderStatus = 0;

    @Nullable
    private String orderStatusDesc = "";

    @Nullable
    private String phone = "";

    @Nullable
    private Long itemPrice = 0L;

    @Nullable
    public final Long getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public final void setItemPrice(@Nullable Long l5) {
        this.itemPrice = l5;
    }

    public final void setOrderStatus(@Nullable Integer num) {
        this.orderStatus = num;
    }

    public final void setOrderStatusDesc(@Nullable String str) {
        this.orderStatusDesc = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }
}
