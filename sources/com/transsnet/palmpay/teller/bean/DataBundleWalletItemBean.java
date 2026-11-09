package com.transsnet.palmpay.teller.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\t¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemBean;", "", "<init>", "()V", "billerName", "", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "billerId", "getBillerId", "setBillerId", "categoryId", "getCategoryId", "setCategoryId", "institutionLogo", "getInstitutionLogo", "setInstitutionLogo", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "itemId", "getItemId", "setItemId", "itemName", "getItemName", "setItemName", "description", "getDescription", "setDescription", "volume", "getVolume", "setVolume", "volumeUnit", "getVolumeUnit", "setVolumeUnit", "validity", "getValidity", "setValidity", "couponCode", "getCouponCode", "setCouponCode", "discountPackageId", "getDiscountPackageId", "setDiscountPackageId", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataBundleWalletItemBean {

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private String categoryId;

    @Nullable
    private String description;

    @Nullable
    private String institutionLogo;

    @Nullable
    private String itemId;

    @Nullable
    private String itemName;

    @Nullable
    private String volume;

    @Nullable
    private String volumeUnit;

    @Nullable
    private Long price = 0L;

    @Nullable
    private String validity = "";

    @Nullable
    private String couponCode = "";

    @Nullable
    private String discountPackageId = "";

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
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
    public final String getDiscountPackageId() {
        return this.discountPackageId;
    }

    @Nullable
    public final String getInstitutionLogo() {
        return this.institutionLogo;
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
    public final Long getPrice() {
        return this.price;
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

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDiscountPackageId(@Nullable String str) {
        this.discountPackageId = str;
    }

    public final void setInstitutionLogo(@Nullable String str) {
        this.institutionLogo = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setPrice(@Nullable Long l5) {
        this.price = l5;
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
