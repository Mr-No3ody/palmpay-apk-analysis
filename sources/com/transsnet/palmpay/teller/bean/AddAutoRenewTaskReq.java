package com.transsnet.palmpay.teller.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/AddAutoRenewTaskReq;", "", "<init>", "()V", "transType", "", "getTransType", "()Ljava/lang/String;", "setTransType", "(Ljava/lang/String;)V", "orderNo", "getOrderNo", "setOrderNo", "itemId", "getItemId", "setItemId", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddAutoRenewTaskReq {

    @Nullable
    private String itemId;

    @Nullable
    private String orderNo;

    @Nullable
    private String transType;

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
