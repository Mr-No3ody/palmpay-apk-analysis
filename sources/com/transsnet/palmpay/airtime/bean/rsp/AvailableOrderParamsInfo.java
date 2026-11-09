package com.transsnet.palmpay.airtime.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001e\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AvailableOrderParamsInfo;", "", "<init>", "()V", "businessType", "", "getBusinessType", "()Ljava/lang/String;", "setBusinessType", "(Ljava/lang/String;)V", "validity", "getValidity", "setValidity", "billerId", "getBillerId", "setBillerId", "billerName", "getBillerName", "setBillerName", "billerIcon", "getBillerIcon", "setBillerIcon", "couponCode", "getCouponCode", "setCouponCode", "itemId", "getItemId", "setItemId", "volume", "getVolume", "setVolume", "volumeUnit", "getVolumeUnit", "setVolumeUnit", "itemName", "getItemName", "setItemName", "description", "getDescription", "setDescription", "amount", "", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailableOrderParamsInfo {

    @Nullable
    private Long amount;

    @Nullable
    private String billerIcon;

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private String businessType;

    @Nullable
    private String couponCode;

    @Nullable
    private String description;

    @Nullable
    private String itemId;

    @Nullable
    private String itemName;

    @Nullable
    private String validity;

    @Nullable
    private String volume;

    @Nullable
    private String volumeUnit;

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBillerIcon() {
        return this.billerIcon;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getValidity() {
        return this.validity;
    }

    @Nullable
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setBillerIcon(@Nullable String str) {
        this.billerIcon = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessType(@Nullable String str) {
        this.businessType = str;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setValidity(@Nullable String str) {
        this.validity = str;
    }

    public final void setVolume(@Nullable String str) {
        this.volume = str;
    }

    public final void setVolumeUnit(@Nullable String str) {
        this.volumeUnit = str;
    }
}
