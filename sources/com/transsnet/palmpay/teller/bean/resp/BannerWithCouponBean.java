package com.transsnet.palmpay.teller.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u000bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BannerWithCouponBean;", "Lcom/transsnet/palmpay/teller/bean/resp/BillerBaseCouponItemBean;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "lightImage", "getLightImage", "setLightImage", "(Ljava/lang/String;)V", "darkImage", "getDarkImage", "setDarkImage", "androidLinkUrl", "getAndroidLinkUrl", "setAndroidLinkUrl", "iosLinkUrl", "getIosLinkUrl", "setIosLinkUrl", "couponColor", "getCouponColor", "setCouponColor", "limitAmt", "", "getLimitAmt", "()Ljava/lang/Long;", "setLimitAmt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "claimType", "getClaimType", "setClaimType", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerWithCouponBean extends BillerBaseCouponItemBean {

    @Nullable
    private String androidLinkUrl;

    @Nullable
    private String claimType;

    @Nullable
    private String couponColor;

    @Nullable
    private String darkImage;

    @Nullable
    private final String id;

    @Nullable
    private String iosLinkUrl;

    @Nullable
    private String lightImage;

    @Nullable
    private Long limitAmt;

    public BannerWithCouponBean() {
        super(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        this.limitAmt = 0L;
    }

    @Nullable
    public final String getAndroidLinkUrl() {
        return this.androidLinkUrl;
    }

    @Nullable
    public final String getClaimType() {
        return this.claimType;
    }

    @Nullable
    public final String getCouponColor() {
        return this.couponColor;
    }

    @Nullable
    public final String getDarkImage() {
        return this.darkImage;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIosLinkUrl() {
        return this.iosLinkUrl;
    }

    @Nullable
    public final String getLightImage() {
        return this.lightImage;
    }

    @Nullable
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    public final void setAndroidLinkUrl(@Nullable String str) {
        this.androidLinkUrl = str;
    }

    public final void setClaimType(@Nullable String str) {
        this.claimType = str;
    }

    public final void setCouponColor(@Nullable String str) {
        this.couponColor = str;
    }

    public final void setDarkImage(@Nullable String str) {
        this.darkImage = str;
    }

    public final void setIosLinkUrl(@Nullable String str) {
        this.iosLinkUrl = str;
    }

    public final void setLightImage(@Nullable String str) {
        this.lightImage = str;
    }

    public final void setLimitAmt(@Nullable Long l5) {
        this.limitAmt = l5;
    }
}
