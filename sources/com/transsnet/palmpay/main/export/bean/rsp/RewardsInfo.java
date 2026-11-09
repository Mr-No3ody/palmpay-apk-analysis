package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001aH\u0016J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010 R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/RewardsInfo;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsClaimClickEvent;", "<init>", "()V", "contentType", "", "Ljava/lang/Integer;", "couponCode", "", "couponNominaValue", "", "Ljava/lang/Long;", "activityId", "couponStatus", "showTitle", "showContent", "showIcon", "darkShowIcon", "androidUrl", "contentAndroidUrl", "buttonContent", "showLabel", "rewardSpecialMemberCycleId", "memberTaskNo", "taskNo", "bizIdList", "", "moduleBackgroundUrl", "darkModeModuleBackgroundUrl", "takeCouponCode", "takeActivityId", "takeContentType", "()Ljava/lang/Integer;", "takeBizIdList", "taskShowType", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardsInfo implements HomeRewardsClaimClickEvent {

    @JvmField
    @Nullable
    public final String activityId;

    @JvmField
    @Nullable
    public final String androidUrl;

    @JvmField
    @Nullable
    public final List<String> bizIdList;

    @JvmField
    @Nullable
    public final String buttonContent;

    @JvmField
    @Nullable
    public final String contentAndroidUrl;

    @JvmField
    @Nullable
    public final Integer contentType;

    @JvmField
    @Nullable
    public final String couponCode;

    @JvmField
    @Nullable
    public Long couponNominaValue;

    @JvmField
    @Nullable
    public final String couponStatus;

    @JvmField
    @Nullable
    public final String darkModeModuleBackgroundUrl;

    @JvmField
    @Nullable
    public final String darkShowIcon;

    @JvmField
    @Nullable
    public final String memberTaskNo;

    @JvmField
    @Nullable
    public final String moduleBackgroundUrl;

    @JvmField
    @Nullable
    public final Long rewardSpecialMemberCycleId;

    @JvmField
    @Nullable
    public final String showContent;

    @JvmField
    @Nullable
    public final String showIcon;

    @JvmField
    @Nullable
    public final String showLabel;

    @JvmField
    @Nullable
    public final String showTitle;

    @JvmField
    @Nullable
    public final String taskNo;

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    /* JADX INFO: renamed from: takeActivityId, reason: from getter */
    public String getActivityId() {
        return this.activityId;
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    public List<String> takeBizIdList() {
        return this.bizIdList;
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    /* JADX INFO: renamed from: takeContentType, reason: from getter */
    public Integer getContentType() {
        return this.contentType;
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    /* JADX INFO: renamed from: takeCouponCode, reason: from getter */
    public String getCouponCode() {
        return this.couponCode;
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    public Integer taskShowType() {
        return Integer.valueOf(HomeRewardsCenterShowType.INSTANCE.getOLD_MARKETING_CENTER());
    }
}
