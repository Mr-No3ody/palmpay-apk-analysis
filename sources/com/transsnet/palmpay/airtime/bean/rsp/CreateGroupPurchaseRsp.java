package com.transsnet.palmpay.airtime.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/CreateGroupPurchaseRsp;", "", "<init>", "()V", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "calculationExtInfo", "getCalculationExtInfo", "setCalculationExtInfo", "businessAmount", "", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "itemPrice", "getItemPrice", "setItemPrice", "payAmount", "getPayAmount", "setPayAmount", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateGroupPurchaseRsp {

    @Nullable
    private Long businessAmount;

    @Nullable
    private String calculationExtInfo;

    @Nullable
    private Long itemPrice;

    @Nullable
    private String orderNo;

    @Nullable
    private Long payAmount;

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getCalculationExtInfo() {
        return this.calculationExtInfo;
    }

    @Nullable
    public final Long getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Long getPayAmount() {
        return this.payAmount;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setCalculationExtInfo(@Nullable String str) {
        this.calculationExtInfo = str;
    }

    public final void setItemPrice(@Nullable Long l5) {
        this.itemPrice = l5;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setPayAmount(@Nullable Long l5) {
        this.payAmount = l5;
    }
}
