package com.transsnet.palmpay.airtime.bean;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeDownTimeOrderBean;", "Ljava/io/Serializable;", "<init>", "()V", "network", "", "getNetwork", "()Ljava/lang/String;", "setNetwork", "(Ljava/lang/String;)V", "transType", "getTransType", "setTransType", "amount", "", "getAmount", "()J", "setAmount", "(J)V", "mobileNo", "getMobileNo", "setMobileNo", "orderNo", "getOrderNo", "setOrderNo", "orderType", "getOrderType", "setOrderType", "billerName", "getBillerName", "setBillerName", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeDownTimeOrderBean implements Serializable {
    private long amount;

    @Nullable
    private String billerName;

    @Nullable
    private String mobileNo;

    @Nullable
    private String network;

    @Nullable
    private String orderNo;

    @Nullable
    private String orderType;

    @Nullable
    private String transType;

    public final long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setAmount(long j6) {
        this.amount = j6;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setMobileNo(@Nullable String str) {
        this.mobileNo = str;
    }

    public final void setNetwork(@Nullable String str) {
        this.network = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setOrderType(@Nullable String str) {
        this.orderType = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
