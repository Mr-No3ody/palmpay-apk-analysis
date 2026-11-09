package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCoupon;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsClaimClickEvent;", "<init>", "()V", "status", "", "couponContent", "couponTitle", "couponNominaValue", "", "Ljava/lang/Long;", "contentType", "", "Ljava/lang/Integer;", "couponCode", "activityId", "androidUrl", "takeActivityId", "takeContentType", "()Ljava/lang/Integer;", "takeCouponCode", "taskShowType", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsCoupon implements HomeRewardsClaimClickEvent {

    @JvmField
    @Nullable
    public String activityId;

    @JvmField
    @Nullable
    public String androidUrl;

    @JvmField
    @Nullable
    public final Integer contentType;

    @JvmField
    @Nullable
    public String couponCode;

    @JvmField
    @Nullable
    public String couponContent;

    @JvmField
    @Nullable
    public Long couponNominaValue;

    @JvmField
    @Nullable
    public String couponTitle;

    @JvmField
    @Nullable
    public String status;

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    /* JADX INFO: renamed from: takeActivityId, reason: from getter */
    public String getActivityId() {
        return this.activityId;
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    public List<String> takeBizIdList() {
        return HomeRewardsClaimClickEvent.DefaultImpls.takeBizIdList(this);
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
        return Integer.valueOf(HomeRewardsCenterShowType.INSTANCE.getCOUPON());
    }
}
