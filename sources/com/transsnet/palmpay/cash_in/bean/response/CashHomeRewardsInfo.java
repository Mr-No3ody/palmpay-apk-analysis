package com.transsnet.palmpay.cash_in.bean.response;

import C0.G;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jª\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001d¨\u0006G"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/CashHomeRewardsInfo;", "", "rewardId", "", "rewardSpecialMemberCycleId", "taskNo", "", "memberTaskNo", "showTitle", "showContent", "buttonContent", "showIcon", "darkShowIcon", "androidUrl", "showLabel", "moduleBackgroundUrl", "darkModeModuleBackgroundUrl", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRewardId", "()Ljava/lang/Long;", "setRewardId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getRewardSpecialMemberCycleId", "setRewardSpecialMemberCycleId", "getTaskNo", "()Ljava/lang/String;", "setTaskNo", "(Ljava/lang/String;)V", "getMemberTaskNo", "setMemberTaskNo", "getShowTitle", "setShowTitle", "getShowContent", "setShowContent", "getButtonContent", "setButtonContent", "getShowIcon", "setShowIcon", "getDarkShowIcon", "setDarkShowIcon", "getAndroidUrl", "setAndroidUrl", "getShowLabel", "setShowLabel", "getModuleBackgroundUrl", "setModuleBackgroundUrl", "getDarkModeModuleBackgroundUrl", "setDarkModeModuleBackgroundUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/cash_in/bean/response/CashHomeRewardsInfo;", "equals", "", "other", "hashCode", "", "toString", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashHomeRewardsInfo {

    @Nullable
    private String androidUrl;

    @Nullable
    private String buttonContent;

    @Nullable
    private String darkModeModuleBackgroundUrl;

    @Nullable
    private String darkShowIcon;

    @Nullable
    private String memberTaskNo;

    @Nullable
    private String moduleBackgroundUrl;

    @Nullable
    private Long rewardId;

    @Nullable
    private Long rewardSpecialMemberCycleId;

    @Nullable
    private String showContent;

    @Nullable
    private String showIcon;

    @Nullable
    private String showLabel;

    @Nullable
    private String showTitle;

    @Nullable
    private String taskNo;

    public CashHomeRewardsInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ CashHomeRewardsInfo copy$default(CashHomeRewardsInfo cashHomeRewardsInfo, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = cashHomeRewardsInfo.rewardId;
        }
        return cashHomeRewardsInfo.copy(l5, (i7 & 2) != 0 ? cashHomeRewardsInfo.rewardSpecialMemberCycleId : l6, (i7 & 4) != 0 ? cashHomeRewardsInfo.taskNo : str, (i7 & 8) != 0 ? cashHomeRewardsInfo.memberTaskNo : str2, (i7 & 16) != 0 ? cashHomeRewardsInfo.showTitle : str3, (i7 & 32) != 0 ? cashHomeRewardsInfo.showContent : str4, (i7 & 64) != 0 ? cashHomeRewardsInfo.buttonContent : str5, (i7 & 128) != 0 ? cashHomeRewardsInfo.showIcon : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cashHomeRewardsInfo.darkShowIcon : str7, (i7 & 512) != 0 ? cashHomeRewardsInfo.androidUrl : str8, (i7 & 1024) != 0 ? cashHomeRewardsInfo.showLabel : str9, (i7 & 2048) != 0 ? cashHomeRewardsInfo.moduleBackgroundUrl : str10, (i7 & 4096) != 0 ? cashHomeRewardsInfo.darkModeModuleBackgroundUrl : str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRewardId() {
        return this.rewardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getShowLabel() {
        return this.showLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getModuleBackgroundUrl() {
        return this.moduleBackgroundUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDarkModeModuleBackgroundUrl() {
        return this.darkModeModuleBackgroundUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRewardSpecialMemberCycleId() {
        return this.rewardSpecialMemberCycleId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemberTaskNo() {
        return this.memberTaskNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShowTitle() {
        return this.showTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShowContent() {
        return this.showContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getButtonContent() {
        return this.buttonContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getShowIcon() {
        return this.showIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDarkShowIcon() {
        return this.darkShowIcon;
    }

    @NotNull
    public final CashHomeRewardsInfo copy(@Nullable Long rewardId, @Nullable Long rewardSpecialMemberCycleId, @Nullable String taskNo, @Nullable String memberTaskNo, @Nullable String showTitle, @Nullable String showContent, @Nullable String buttonContent, @Nullable String showIcon, @Nullable String darkShowIcon, @Nullable String androidUrl, @Nullable String showLabel, @Nullable String moduleBackgroundUrl, @Nullable String darkModeModuleBackgroundUrl) {
        return new CashHomeRewardsInfo(rewardId, rewardSpecialMemberCycleId, taskNo, memberTaskNo, showTitle, showContent, buttonContent, showIcon, darkShowIcon, androidUrl, showLabel, moduleBackgroundUrl, darkModeModuleBackgroundUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashHomeRewardsInfo)) {
            return false;
        }
        CashHomeRewardsInfo cashHomeRewardsInfo = (CashHomeRewardsInfo) other;
        return Intrinsics.c(this.rewardId, cashHomeRewardsInfo.rewardId) && Intrinsics.c(this.rewardSpecialMemberCycleId, cashHomeRewardsInfo.rewardSpecialMemberCycleId) && Intrinsics.c(this.taskNo, cashHomeRewardsInfo.taskNo) && Intrinsics.c(this.memberTaskNo, cashHomeRewardsInfo.memberTaskNo) && Intrinsics.c(this.showTitle, cashHomeRewardsInfo.showTitle) && Intrinsics.c(this.showContent, cashHomeRewardsInfo.showContent) && Intrinsics.c(this.buttonContent, cashHomeRewardsInfo.buttonContent) && Intrinsics.c(this.showIcon, cashHomeRewardsInfo.showIcon) && Intrinsics.c(this.darkShowIcon, cashHomeRewardsInfo.darkShowIcon) && Intrinsics.c(this.androidUrl, cashHomeRewardsInfo.androidUrl) && Intrinsics.c(this.showLabel, cashHomeRewardsInfo.showLabel) && Intrinsics.c(this.moduleBackgroundUrl, cashHomeRewardsInfo.moduleBackgroundUrl) && Intrinsics.c(this.darkModeModuleBackgroundUrl, cashHomeRewardsInfo.darkModeModuleBackgroundUrl);
    }

    @Nullable
    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    @Nullable
    public final String getButtonContent() {
        return this.buttonContent;
    }

    @Nullable
    public final String getDarkModeModuleBackgroundUrl() {
        return this.darkModeModuleBackgroundUrl;
    }

    @Nullable
    public final String getDarkShowIcon() {
        return this.darkShowIcon;
    }

    @Nullable
    public final String getMemberTaskNo() {
        return this.memberTaskNo;
    }

    @Nullable
    public final String getModuleBackgroundUrl() {
        return this.moduleBackgroundUrl;
    }

    @Nullable
    public final Long getRewardId() {
        return this.rewardId;
    }

    @Nullable
    public final Long getRewardSpecialMemberCycleId() {
        return this.rewardSpecialMemberCycleId;
    }

    @Nullable
    public final String getShowContent() {
        return this.showContent;
    }

    @Nullable
    public final String getShowIcon() {
        return this.showIcon;
    }

    @Nullable
    public final String getShowLabel() {
        return this.showLabel;
    }

    @Nullable
    public final String getShowTitle() {
        return this.showTitle;
    }

    @Nullable
    public final String getTaskNo() {
        return this.taskNo;
    }

    public int hashCode() {
        Long l5 = this.rewardId;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.rewardSpecialMemberCycleId;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.taskNo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.memberTaskNo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.showTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.showContent;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonContent;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.showIcon;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.darkShowIcon;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.androidUrl;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.showLabel;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.moduleBackgroundUrl;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.darkModeModuleBackgroundUrl;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setAndroidUrl(@Nullable String str) {
        this.androidUrl = str;
    }

    public final void setButtonContent(@Nullable String str) {
        this.buttonContent = str;
    }

    public final void setDarkModeModuleBackgroundUrl(@Nullable String str) {
        this.darkModeModuleBackgroundUrl = str;
    }

    public final void setDarkShowIcon(@Nullable String str) {
        this.darkShowIcon = str;
    }

    public final void setMemberTaskNo(@Nullable String str) {
        this.memberTaskNo = str;
    }

    public final void setModuleBackgroundUrl(@Nullable String str) {
        this.moduleBackgroundUrl = str;
    }

    public final void setRewardId(@Nullable Long l5) {
        this.rewardId = l5;
    }

    public final void setRewardSpecialMemberCycleId(@Nullable Long l5) {
        this.rewardSpecialMemberCycleId = l5;
    }

    public final void setShowContent(@Nullable String str) {
        this.showContent = str;
    }

    public final void setShowIcon(@Nullable String str) {
        this.showIcon = str;
    }

    public final void setShowLabel(@Nullable String str) {
        this.showLabel = str;
    }

    public final void setShowTitle(@Nullable String str) {
        this.showTitle = str;
    }

    public final void setTaskNo(@Nullable String str) {
        this.taskNo = str;
    }

    @NotNull
    public String toString() {
        Long l5 = this.rewardId;
        Long l6 = this.rewardSpecialMemberCycleId;
        String str = this.taskNo;
        String str2 = this.memberTaskNo;
        String str3 = this.showTitle;
        String str4 = this.showContent;
        String str5 = this.buttonContent;
        String str6 = this.showIcon;
        String str7 = this.darkShowIcon;
        String str8 = this.androidUrl;
        String str9 = this.showLabel;
        String str10 = this.moduleBackgroundUrl;
        String str11 = this.darkModeModuleBackgroundUrl;
        StringBuilder sb2 = new StringBuilder("CashHomeRewardsInfo(rewardId=");
        sb2.append(l5);
        sb2.append(", rewardSpecialMemberCycleId=");
        sb2.append(l6);
        sb2.append(", taskNo=");
        u.x(sb2, str, ", memberTaskNo=", str2, ", showTitle=");
        u.x(sb2, str3, ", showContent=", str4, ", buttonContent=");
        u.x(sb2, str5, ", showIcon=", str6, ", darkShowIcon=");
        u.x(sb2, str7, ", androidUrl=", str8, ", showLabel=");
        u.x(sb2, str9, ", moduleBackgroundUrl=", str10, ", darkModeModuleBackgroundUrl=");
        return G.r(sb2, str11, ")");
    }

    public CashHomeRewardsInfo(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.rewardId = l5;
        this.rewardSpecialMemberCycleId = l6;
        this.taskNo = str;
        this.memberTaskNo = str2;
        this.showTitle = str3;
        this.showContent = str4;
        this.buttonContent = str5;
        this.showIcon = str6;
        this.darkShowIcon = str7;
        this.androidUrl = str8;
        this.showLabel = str9;
        this.moduleBackgroundUrl = str10;
        this.darkModeModuleBackgroundUrl = str11;
    }

    public /* synthetic */ CashHomeRewardsInfo(Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : l6, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? null : str8, (i7 & 1024) != 0 ? null : str9, (i7 & 2048) != 0 ? null : str10, (i7 & 4096) != 0 ? null : str11);
    }
}
