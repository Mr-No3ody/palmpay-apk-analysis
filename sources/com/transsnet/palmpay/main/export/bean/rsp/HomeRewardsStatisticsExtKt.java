package com.transsnet.palmpay.main.export.bean.rsp;

import Pa.n0;
import com.transsnet.analysis.contants.EventsConstants;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"sendStatisticsEvent", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterInfo;", EventsConstants.CLICK, "", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsClaimClickEvent;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponCombo;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponDetailInfo;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCoupon;", "Lcom/transsnet/palmpay/main/export/bean/PalmZoneTaskBean;", "Lcom/transsnet/palmpay/main/export/bean/rsp/RewardsInfo;", "module_main_export_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsStatisticsExtKt {
    public static final void sendStatisticsEvent(@NotNull HomeRewardsCenterInfo homeRewardsCenterInfo, boolean z3) {
        Intrinsics.checkNotNullParameter(homeRewardsCenterInfo, "<this>");
        if (homeRewardsCenterInfo.getOldDto() != null) {
            sendStatisticsEvent(homeRewardsCenterInfo.getOldDto(), z3);
        } else if (homeRewardsCenterInfo.getCoupon() != null) {
            sendStatisticsEvent(homeRewardsCenterInfo.getCoupon(), z3);
        } else if (homeRewardsCenterInfo.getCouponCombo() != null) {
            sendStatisticsEvent(homeRewardsCenterInfo.getCouponCombo(), z3);
        }
    }

    public static /* synthetic */ void sendStatisticsEvent$default(HomeRewardsCenterInfo homeRewardsCenterInfo, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(homeRewardsCenterInfo, z3);
    }

    public static /* synthetic */ void sendStatisticsEvent$default(HomeRewardsCouponCombo homeRewardsCouponCombo, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(homeRewardsCouponCombo, z3);
    }

    public static /* synthetic */ void sendStatisticsEvent$default(HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(homeRewardsCouponDetailInfo, z3);
    }

    public static /* synthetic */ void sendStatisticsEvent$default(HomeRewardsCoupon homeRewardsCoupon, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(homeRewardsCoupon, z3);
    }

    public static /* synthetic */ void sendStatisticsEvent$default(PalmZoneTaskBean palmZoneTaskBean, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(palmZoneTaskBean, z3);
    }

    public static /* synthetic */ void sendStatisticsEvent$default(RewardsInfo rewardsInfo, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        sendStatisticsEvent(rewardsInfo, z3);
    }

    public static final void sendStatisticsEvent(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
        Intrinsics.checkNotNullParameter(homeRewardsClaimClickEvent, "<this>");
        ViewEvent viewEvent = new ViewEvent("HomePage_MarketCenter_Click");
        Integer numTaskShowType = homeRewardsClaimClickEvent.taskShowType();
        int iIntValue = numTaskShowType != null ? numTaskShowType.intValue() : -1;
        HomeRewardsCenterShowType homeRewardsCenterShowType = HomeRewardsCenterShowType.INSTANCE;
        if (iIntValue == homeRewardsCenterShowType.getCOUPON()) {
            viewEvent.add("showType", "MarketCenterCoupon");
            viewEvent.add("ContentType", "Coupon");
            String couponCode = homeRewardsClaimClickEvent.getCouponCode();
            viewEvent.add("ContentID", couponCode != null ? couponCode : "");
        } else if (iIntValue == homeRewardsCenterShowType.getCOUPON_COMBO()) {
            viewEvent.add("showType", "MarketCenterCouponCombo");
            viewEvent.add("ContentType", "Coupon Combo");
            String activityId = homeRewardsClaimClickEvent.getActivityId();
            viewEvent.add("ContentID", activityId != null ? activityId : "");
        } else if (iIntValue == homeRewardsCenterShowType.getOLD_MARKETING_CENTER()) {
            viewEvent.add("showType", "MarketCenter");
            Integer contentType = homeRewardsClaimClickEvent.getContentType();
            int iIntValue2 = contentType != null ? contentType.intValue() : -1;
            HomeRewardsCenterContentType homeRewardsCenterContentType = HomeRewardsCenterContentType.INSTANCE;
            if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_COUPON()) {
                viewEvent.add("ContentType", "Coupon");
                viewEvent.add("ContentID", homeRewardsClaimClickEvent.getCouponCode());
            } else if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_COUPON_COMBO()) {
                viewEvent.add("ContentType", "Coupon Combo");
                viewEvent.add("ContentID", homeRewardsClaimClickEvent.getActivityId());
            } else if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_PALM_POINTS()) {
                viewEvent.add("ContentType", "PalmPoints");
                viewEvent.add("ContentID", "PalmPoints");
            } else if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_TRAIL_CASH()) {
                viewEvent.add("ContentType", "TrailCash");
                viewEvent.add("ContentID", "TrailCash");
            } else if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_MARKETING_JUMP()) {
                viewEvent.add("ContentType", "MarketingJump");
                viewEvent.add("ContentID", homeRewardsClaimClickEvent.getActivityId());
            } else {
                if (iIntValue2 == homeRewardsCenterContentType.getCONTENT_TYPE_REWARD_TASK()) {
                    Integer contentType2 = homeRewardsClaimClickEvent.getContentType();
                    viewEvent.add("ContentType", contentType2 != null ? contentType2.toString() : null);
                    if (homeRewardsClaimClickEvent instanceof RewardsInfo) {
                        viewEvent.add("ContentID", ((RewardsInfo) homeRewardsClaimClickEvent).taskNo);
                    } else {
                        viewEvent.add("ContentID", homeRewardsClaimClickEvent.getActivityId());
                    }
                } else {
                    Integer contentType3 = homeRewardsClaimClickEvent.getContentType();
                    viewEvent.add("ContentType", contentType3 != null ? contentType3.toString() : null);
                    viewEvent.add("ContentID", homeRewardsClaimClickEvent.getActivityId());
                }
            }
        } else {
            viewEvent.add("showType", "Unknown");
            viewEvent.add("ContentID", "Unknown");
        }
        viewEvent.add("event_type", "Click_Event");
        n0.g().q(viewEvent);
    }

    public static final void sendStatisticsEvent(@NotNull HomeRewardsCouponCombo homeRewardsCouponCombo, boolean z3) {
        Intrinsics.checkNotNullParameter(homeRewardsCouponCombo, "<this>");
        ViewEvent viewEventAfEvt = new ViewEvent(z3 ? "Home_MarketCenter_Click" : "HomePage_MarketCenter_View").afEvt(false);
        viewEventAfEvt.add("showType", "MarketCenterCouponCombo");
        viewEventAfEvt.add("ContentType", "Coupon Combo");
        viewEventAfEvt.add("ContentID", homeRewardsCouponCombo.activityId);
        if (viewEventAfEvt != null) {
            if (z3) {
                viewEventAfEvt.add("event_type", "Click_Event");
            }
            n0.g().q(viewEventAfEvt);
        }
    }

    public static final void sendStatisticsEvent(@NotNull HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo, boolean z3) {
        Intrinsics.checkNotNullParameter(homeRewardsCouponDetailInfo, "<this>");
        ViewEvent viewEventAfEvt = new ViewEvent(z3 ? "Home_MarketCenter_Click" : "HomePage_MarketCenter_View").afEvt(false);
        viewEventAfEvt.add("showType", "MarketCenterCouponCombo");
        viewEventAfEvt.add("ContentType", "Coupon Combo Item");
        viewEventAfEvt.add("ContentID", homeRewardsCouponDetailInfo.couponTitle);
        if (viewEventAfEvt != null) {
            if (z3) {
                viewEventAfEvt.add("event_type", "Click_Event");
            }
            n0.g().q(viewEventAfEvt);
        }
    }

    public static final void sendStatisticsEvent(@NotNull HomeRewardsCoupon homeRewardsCoupon, boolean z3) {
        Intrinsics.checkNotNullParameter(homeRewardsCoupon, "<this>");
        ViewEvent viewEventAfEvt = new ViewEvent(z3 ? "Home_MarketCenter_Click" : "HomePage_MarketCenter_View").afEvt(false);
        viewEventAfEvt.add("showType", "MarketCenterCoupon");
        viewEventAfEvt.add("ContentType", "Coupon");
        viewEventAfEvt.add("ContentID", homeRewardsCoupon.couponCode);
        if (viewEventAfEvt != null) {
            if (z3) {
                viewEventAfEvt.add("event_type", "Click_Event");
            }
            n0.g().q(viewEventAfEvt);
        }
    }

    public static final void sendStatisticsEvent(@NotNull PalmZoneTaskBean palmZoneTaskBean, boolean z3) {
        Intrinsics.checkNotNullParameter(palmZoneTaskBean, "<this>");
        ViewEvent viewEventAfEvt = new ViewEvent(z3 ? "Home_MarketCenter_Click" : "HomePage_MarketCenter_View").afEvt(false);
        viewEventAfEvt.add("showType", "MarketCenterTask");
        viewEventAfEvt.add("ContentType", "Task");
        String str = palmZoneTaskBean.taskName;
        if (str == null) {
            str = "";
        }
        viewEventAfEvt.add("ContentID", str);
        if (z3) {
            viewEventAfEvt.add("event_type", "Click_Event");
        }
        if (viewEventAfEvt != null) {
            n0.g().q(viewEventAfEvt);
        }
    }

    public static final void sendStatisticsEvent(@NotNull RewardsInfo rewardsInfo, boolean z3) {
        Intrinsics.checkNotNullParameter(rewardsInfo, "<this>");
        ViewEvent viewEventAfEvt = new ViewEvent(z3 ? "Home_MarketCenter_Click" : "HomePage_MarketCenter_View").afEvt(false);
        viewEventAfEvt.add("showType", "MarketCenter");
        Integer num = rewardsInfo.contentType;
        int iIntValue = num != null ? num.intValue() : -1;
        HomeRewardsCenterContentType homeRewardsCenterContentType = HomeRewardsCenterContentType.INSTANCE;
        if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_COUPON()) {
            viewEventAfEvt.add("ContentType", "Coupon");
            viewEventAfEvt.add("ContentID", rewardsInfo.couponCode);
        } else if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_COUPON_COMBO()) {
            viewEventAfEvt.add("ContentType", "Coupon Combo");
            viewEventAfEvt.add("ContentID", rewardsInfo.activityId);
        } else if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_PALM_POINTS()) {
            viewEventAfEvt.add("ContentType", "PalmPoints");
            viewEventAfEvt.add("ContentID", "PalmPoints");
        } else if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_TRAIL_CASH()) {
            viewEventAfEvt.add("ContentType", "TrailCash");
            viewEventAfEvt.add("ContentID", "TrailCash");
        } else if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_MARKETING_JUMP()) {
            viewEventAfEvt.add("ContentType", "MarketingJump");
            viewEventAfEvt.add("ContentID", rewardsInfo.showTitle);
        } else if (iIntValue == homeRewardsCenterContentType.getCONTENT_TYPE_REWARD_TASK()) {
            viewEventAfEvt.add("ContentType", String.valueOf(homeRewardsCenterContentType.getCONTENT_TYPE_REWARD_TASK()));
            viewEventAfEvt.add("ContentID", rewardsInfo.taskNo);
        } else {
            viewEventAfEvt.add("ContentType", String.valueOf(rewardsInfo.contentType));
            viewEventAfEvt.add("ContentID", "Unknown");
        }
        if (viewEventAfEvt != null) {
            if (z3) {
                viewEventAfEvt.add("event_type", "Click_Event");
            }
            n0.g().q(viewEventAfEvt);
        }
    }
}
