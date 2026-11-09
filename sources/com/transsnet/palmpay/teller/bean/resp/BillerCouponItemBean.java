package com.transsnet.palmpay.teller.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "Lcom/transsnet/palmpay/teller/bean/resp/BillerBaseCouponItemBean;", "<init>", "()V", "couponDesc", "", "getCouponDesc", "()Ljava/lang/String;", "setCouponDesc", "(Ljava/lang/String;)V", "startTime", "", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endTime", "getEndTime", "setEndTime", "limitAmt", "getLimitAmt", "setLimitAmt", "androidLinkUrl", "getAndroidLinkUrl", "setAndroidLinkUrl", "iosLinkUrl", "getIosLinkUrl", "setIosLinkUrl", "priority", "", "getPriority", "()Ljava/lang/Integer;", "setPriority", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "remark", "getRemark", "setRemark", "layoutExpand", "", "getLayoutExpand", "()Ljava/lang/Boolean;", "setLayoutExpand", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerCouponItemBean extends BillerBaseCouponItemBean {

    @Nullable
    private String androidLinkUrl;

    @Nullable
    private String couponDesc;

    @Nullable
    private Long endTime;

    @Nullable
    private String iosLinkUrl;

    @Nullable
    private Boolean layoutExpand;

    @Nullable
    private Long limitAmt;

    @Nullable
    private Integer priority;

    @Nullable
    private String remark;

    @Nullable
    private Long startTime;

    public BillerCouponItemBean() {
        super(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        this.layoutExpand = Boolean.FALSE;
    }

    @Nullable
    public final String getAndroidLinkUrl() {
        return this.androidLinkUrl;
    }

    @Nullable
    public final String getCouponDesc() {
        return this.couponDesc;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getIosLinkUrl() {
        return this.iosLinkUrl;
    }

    @Nullable
    public final Boolean getLayoutExpand() {
        return this.layoutExpand;
    }

    @Nullable
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    public final void setAndroidLinkUrl(@Nullable String str) {
        this.androidLinkUrl = str;
    }

    public final void setCouponDesc(@Nullable String str) {
        this.couponDesc = str;
    }

    public final void setEndTime(@Nullable Long l5) {
        this.endTime = l5;
    }

    public final void setIosLinkUrl(@Nullable String str) {
        this.iosLinkUrl = str;
    }

    public final void setLayoutExpand(@Nullable Boolean bool) {
        this.layoutExpand = bool;
    }

    public final void setLimitAmt(@Nullable Long l5) {
        this.limitAmt = l5;
    }

    public final void setPriority(@Nullable Integer num) {
        this.priority = num;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setStartTime(@Nullable Long l5) {
        this.startTime = l5;
    }
}
