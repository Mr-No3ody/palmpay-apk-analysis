package com.transsnet.palmpay.main.export.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterInfo;", "", "<init>", "()V", "oldDto", "Lcom/transsnet/palmpay/main/export/bean/rsp/RewardsInfo;", "getOldDto", "()Lcom/transsnet/palmpay/main/export/bean/rsp/RewardsInfo;", FirebaseAnalytics.Param.COUPON, "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCoupon;", "getCoupon", "()Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCoupon;", "couponCombo", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponCombo;", "getCouponCombo", "()Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponCombo;", "showType", "", "getShowType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsCenterInfo {

    @Nullable
    private final HomeRewardsCoupon coupon;

    @Nullable
    private final HomeRewardsCouponCombo couponCombo;

    @Nullable
    private final RewardsInfo oldDto;

    @Nullable
    private final Integer showType;

    @Nullable
    public final HomeRewardsCoupon getCoupon() {
        return this.coupon;
    }

    @Nullable
    public final HomeRewardsCouponCombo getCouponCombo() {
        return this.couponCombo;
    }

    @Nullable
    public final RewardsInfo getOldDto() {
        return this.oldDto;
    }

    @Nullable
    public final Integer getShowType() {
        return this.showType;
    }
}
