package com.transsnet.palmpay.teller.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/CouponWithPointBean;", "", "<init>", "()V", "couponIcon", "", "getCouponIcon", "()Ljava/lang/String;", "setCouponIcon", "(Ljava/lang/String;)V", "couponCount", "", "getCouponCount", "()Ljava/lang/Integer;", "setCouponCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "point", "", "getPoint", "()Ljava/lang/Long;", "setPoint", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "isUnclaimedPoint", "", "()Ljava/lang/Boolean;", "setUnclaimedPoint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isUnclaimedCoupon", "setUnclaimedCoupon", "couponList", "", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "getCouponList", "()Ljava/util/List;", "setCouponList", "(Ljava/util/List;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CouponWithPointBean {

    @Nullable
    private Integer couponCount;

    @Nullable
    private String couponIcon;

    @Nullable
    private List<BillerCouponItemBean> couponList;

    @Nullable
    private Boolean isUnclaimedCoupon;

    @Nullable
    private Boolean isUnclaimedPoint;

    @Nullable
    private Long point = 0L;

    public CouponWithPointBean() {
        Boolean bool = Boolean.FALSE;
        this.isUnclaimedPoint = bool;
        this.isUnclaimedCoupon = bool;
    }

    @Nullable
    public final Integer getCouponCount() {
        return this.couponCount;
    }

    @Nullable
    public final String getCouponIcon() {
        return this.couponIcon;
    }

    @Nullable
    public final List<BillerCouponItemBean> getCouponList() {
        return this.couponList;
    }

    @Nullable
    public final Long getPoint() {
        return this.point;
    }

    @Nullable
    /* JADX INFO: renamed from: isUnclaimedCoupon, reason: from getter */
    public final Boolean getIsUnclaimedCoupon() {
        return this.isUnclaimedCoupon;
    }

    @Nullable
    /* JADX INFO: renamed from: isUnclaimedPoint, reason: from getter */
    public final Boolean getIsUnclaimedPoint() {
        return this.isUnclaimedPoint;
    }

    public final void setCouponCount(@Nullable Integer num) {
        this.couponCount = num;
    }

    public final void setCouponIcon(@Nullable String str) {
        this.couponIcon = str;
    }

    public final void setCouponList(@Nullable List<BillerCouponItemBean> list) {
        this.couponList = list;
    }

    public final void setPoint(@Nullable Long l5) {
        this.point = l5;
    }

    public final void setUnclaimedCoupon(@Nullable Boolean bool) {
        this.isUnclaimedCoupon = bool;
    }

    public final void setUnclaimedPoint(@Nullable Boolean bool) {
        this.isUnclaimedPoint = bool;
    }
}
