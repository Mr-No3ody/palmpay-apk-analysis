package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryCouponClaimData;", "", "actNo", "", "androidLinkUrl", "couponCode", "couponName", "desc", "logo", "nominaValue", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getActNo", "()Ljava/lang/String;", "setActNo", "(Ljava/lang/String;)V", "getAndroidLinkUrl", "setAndroidLinkUrl", "getCouponCode", "setCouponCode", "getCouponName", "setCouponName", "getDesc", "setDesc", "getLogo", "setLogo", "getNominaValue", "()Ljava/lang/Long;", "setNominaValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStatus", "setStatus", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryCouponClaimData {

    @Nullable
    private String actNo;

    @Nullable
    private String androidLinkUrl;

    @Nullable
    private String couponCode;

    @Nullable
    private String couponName;

    @Nullable
    private String desc;

    @Nullable
    private String logo;

    @Nullable
    private Long nominaValue;

    @Nullable
    private String status;

    public QueryCouponClaimData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l5, @Nullable String str7) {
        this.actNo = str;
        this.androidLinkUrl = str2;
        this.couponCode = str3;
        this.couponName = str4;
        this.desc = str5;
        this.logo = str6;
        this.nominaValue = l5;
        this.status = str7;
    }

    @Nullable
    public final String getActNo() {
        return this.actNo;
    }

    @Nullable
    public final String getAndroidLinkUrl() {
        return this.androidLinkUrl;
    }

    @Nullable
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final void setActNo(@Nullable String str) {
        this.actNo = str;
    }

    public final void setAndroidLinkUrl(@Nullable String str) {
        this.androidLinkUrl = str;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setCouponName(@Nullable String str) {
        this.couponName = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setNominaValue(@Nullable Long l5) {
        this.nominaValue = l5;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public /* synthetic */ QueryCouponClaimData(String str, String str2, String str3, String str4, String str5, String str6, Long l5, String str7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i7 & 64) != 0 ? 0L : l5, str7);
    }
}
