package com.transsnet.palmpay.teller.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/ElectricitytemTipsBean;", "", "cornerMarkUrl", "", "discountText", "itemId", FirebaseAnalytics.Param.PRICE, "priceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCornerMarkUrl", "()Ljava/lang/String;", "setCornerMarkUrl", "(Ljava/lang/String;)V", "getDiscountText", "setDiscountText", "getItemId", "setItemId", "getPrice", "setPrice", "getPriceId", "setPriceId", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ElectricitytemTipsBean {

    @Nullable
    private String cornerMarkUrl;

    @Nullable
    private String discountText;

    @Nullable
    private String itemId;

    @Nullable
    private String price;

    @Nullable
    private String priceId;

    public ElectricitytemTipsBean() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final String getCornerMarkUrl() {
        return this.cornerMarkUrl;
    }

    @Nullable
    public final String getDiscountText() {
        return this.discountText;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPriceId() {
        return this.priceId;
    }

    public final void setCornerMarkUrl(@Nullable String str) {
        this.cornerMarkUrl = str;
    }

    public final void setDiscountText(@Nullable String str) {
        this.discountText = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setPriceId(@Nullable String str) {
        this.priceId = str;
    }

    public ElectricitytemTipsBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.cornerMarkUrl = str;
        this.discountText = str2;
        this.itemId = str3;
        this.price = str4;
        this.priceId = str5;
    }

    public /* synthetic */ ElectricitytemTipsBean(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }
}
