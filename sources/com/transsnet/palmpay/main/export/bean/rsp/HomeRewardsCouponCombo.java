package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponCombo;", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsClaimClickEvent;", "<init>", "()V", "contentType", "", "Ljava/lang/Integer;", "backGroupUrl", "", "darkBackGroupUrl", "couponComboTitle", "couponComboContent", "activityId", "status", "couponDetailInfoList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCouponDetailInfo;", "takeContentType", "()Ljava/lang/Integer;", "takeActivityId", "taskShowType", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsCouponCombo implements HomeRewardsClaimClickEvent {

    @JvmField
    @Nullable
    public String activityId;

    @JvmField
    @Nullable
    public String backGroupUrl;

    @JvmField
    @Nullable
    public final Integer contentType;

    @JvmField
    @Nullable
    public String couponComboContent;

    @JvmField
    @Nullable
    public String couponComboTitle;

    @JvmField
    @Nullable
    public List<HomeRewardsCouponDetailInfo> couponDetailInfoList;

    @JvmField
    @Nullable
    public String darkBackGroupUrl;

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
    /* JADX INFO: renamed from: takeCouponCode */
    public String getCouponCode() {
        return HomeRewardsClaimClickEvent.DefaultImpls.takeCouponCode(this);
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    @Nullable
    public Integer taskShowType() {
        return Integer.valueOf(HomeRewardsCenterShowType.INSTANCE.getCOUPON_COMBO());
    }
}
