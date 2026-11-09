package com.transsnet.palmpay.teller.bean.resp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ¶\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u001a¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingMatchDetailBean;", "", "competitionName", "", "logo", "matchName", "competitionOrder", "", "matchOrder", "matchTime", "", "matchDay", "matchHourMin", "teamName", "teamFlag", "opTeamName", "opTeamFlag", "androidLink", "displayOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCompetitionName", "()Ljava/lang/String;", "getLogo", "getMatchName", "getCompetitionOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchOrder", "getMatchTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMatchDay", "getMatchHourMin", "getTeamName", "getTeamFlag", "getOpTeamName", "getOpTeamFlag", "getAndroidLink", "getDisplayOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/teller/bean/resp/BettingMatchDetailBean;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingMatchDetailBean {

    @Nullable
    private final String androidLink;

    @Nullable
    private final String competitionName;

    @Nullable
    private final Integer competitionOrder;

    @Nullable
    private final Integer displayOrder;

    @Nullable
    private final String logo;

    @Nullable
    private final String matchDay;

    @Nullable
    private final String matchHourMin;

    @Nullable
    private final String matchName;

    @Nullable
    private final Integer matchOrder;

    @Nullable
    private final Long matchTime;

    @Nullable
    private final String opTeamFlag;

    @Nullable
    private final String opTeamName;

    @Nullable
    private final String teamFlag;

    @Nullable
    private final String teamName;

    public BettingMatchDetailBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num3) {
        this.competitionName = str;
        this.logo = str2;
        this.matchName = str3;
        this.competitionOrder = num;
        this.matchOrder = num2;
        this.matchTime = l5;
        this.matchDay = str4;
        this.matchHourMin = str5;
        this.teamName = str6;
        this.teamFlag = str7;
        this.opTeamName = str8;
        this.opTeamFlag = str9;
        this.androidLink = str10;
        this.displayOrder = num3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCompetitionName() {
        return this.competitionName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTeamFlag() {
        return this.teamFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOpTeamName() {
        return this.opTeamName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOpTeamFlag() {
        return this.opTeamFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMatchName() {
        return this.matchName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCompetitionOrder() {
        return this.competitionOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMatchOrder() {
        return this.matchOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getMatchTime() {
        return this.matchTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMatchDay() {
        return this.matchDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMatchHourMin() {
        return this.matchHourMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    @NotNull
    public final BettingMatchDetailBean copy(@Nullable String competitionName, @Nullable String logo, @Nullable String matchName, @Nullable Integer competitionOrder, @Nullable Integer matchOrder, @Nullable Long matchTime, @Nullable String matchDay, @Nullable String matchHourMin, @Nullable String teamName, @Nullable String teamFlag, @Nullable String opTeamName, @Nullable String opTeamFlag, @Nullable String androidLink, @Nullable Integer displayOrder) {
        return new BettingMatchDetailBean(competitionName, logo, matchName, competitionOrder, matchOrder, matchTime, matchDay, matchHourMin, teamName, teamFlag, opTeamName, opTeamFlag, androidLink, displayOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingMatchDetailBean)) {
            return false;
        }
        BettingMatchDetailBean bettingMatchDetailBean = (BettingMatchDetailBean) other;
        return Intrinsics.c(this.competitionName, bettingMatchDetailBean.competitionName) && Intrinsics.c(this.logo, bettingMatchDetailBean.logo) && Intrinsics.c(this.matchName, bettingMatchDetailBean.matchName) && Intrinsics.c(this.competitionOrder, bettingMatchDetailBean.competitionOrder) && Intrinsics.c(this.matchOrder, bettingMatchDetailBean.matchOrder) && Intrinsics.c(this.matchTime, bettingMatchDetailBean.matchTime) && Intrinsics.c(this.matchDay, bettingMatchDetailBean.matchDay) && Intrinsics.c(this.matchHourMin, bettingMatchDetailBean.matchHourMin) && Intrinsics.c(this.teamName, bettingMatchDetailBean.teamName) && Intrinsics.c(this.teamFlag, bettingMatchDetailBean.teamFlag) && Intrinsics.c(this.opTeamName, bettingMatchDetailBean.opTeamName) && Intrinsics.c(this.opTeamFlag, bettingMatchDetailBean.opTeamFlag) && Intrinsics.c(this.androidLink, bettingMatchDetailBean.androidLink) && Intrinsics.c(this.displayOrder, bettingMatchDetailBean.displayOrder);
    }

    @Nullable
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    public final String getCompetitionName() {
        return this.competitionName;
    }

    @Nullable
    public final Integer getCompetitionOrder() {
        return this.competitionOrder;
    }

    @Nullable
    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getMatchDay() {
        return this.matchDay;
    }

    @Nullable
    public final String getMatchHourMin() {
        return this.matchHourMin;
    }

    @Nullable
    public final String getMatchName() {
        return this.matchName;
    }

    @Nullable
    public final Integer getMatchOrder() {
        return this.matchOrder;
    }

    @Nullable
    public final Long getMatchTime() {
        return this.matchTime;
    }

    @Nullable
    public final String getOpTeamFlag() {
        return this.opTeamFlag;
    }

    @Nullable
    public final String getOpTeamName() {
        return this.opTeamName;
    }

    @Nullable
    public final String getTeamFlag() {
        return this.teamFlag;
    }

    @Nullable
    public final String getTeamName() {
        return this.teamName;
    }

    public int hashCode() {
        String str = this.competitionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.competitionOrder;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.matchOrder;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.matchTime;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str4 = this.matchDay;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.matchHourMin;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.teamName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.teamFlag;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.opTeamName;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.opTeamFlag;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.androidLink;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.displayOrder;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.competitionName;
        String str2 = this.logo;
        String str3 = this.matchName;
        Integer num = this.competitionOrder;
        Integer num2 = this.matchOrder;
        Long l5 = this.matchTime;
        String str4 = this.matchDay;
        String str5 = this.matchHourMin;
        String str6 = this.teamName;
        String str7 = this.teamFlag;
        String str8 = this.opTeamName;
        String str9 = this.opTeamFlag;
        String str10 = this.androidLink;
        Integer num3 = this.displayOrder;
        StringBuilder sbF = F.f("BettingMatchDetailBean(competitionName=", str, ", logo=", str2, ", matchName=");
        sbF.append(str3);
        sbF.append(", competitionOrder=");
        sbF.append(num);
        sbF.append(", matchOrder=");
        sbF.append(num2);
        sbF.append(", matchTime=");
        sbF.append(l5);
        sbF.append(", matchDay=");
        u.x(sbF, str4, ", matchHourMin=", str5, ", teamName=");
        u.x(sbF, str6, ", teamFlag=", str7, ", opTeamName=");
        u.x(sbF, str8, ", opTeamFlag=", str9, ", androidLink=");
        sbF.append(str10);
        sbF.append(", displayOrder=");
        sbF.append(num3);
        sbF.append(")");
        return sbF.toString();
    }
}
