package com.transsnet.palmpay.teller.bean.resp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010&J\u0080\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006;"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingRaceScheduleData;", "", ViewProps.BACKGROUND_COLOR, "", "backgroundDarkColor", "backgroundPicture", "backgroundDarkPicture", "competitionColor", "androidLink", "dateColor", "matchDetailV2s", "", "Lcom/transsnet/palmpay/teller/bean/resp/BettingMatchDetailBean;", "matchDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getBackgroundDarkColor", "setBackgroundDarkColor", "getBackgroundPicture", "setBackgroundPicture", "getBackgroundDarkPicture", "setBackgroundDarkPicture", "getCompetitionColor", "setCompetitionColor", "getAndroidLink", "setAndroidLink", "getDateColor", "setDateColor", "getMatchDetailV2s", "()Ljava/util/List;", "setMatchDetailV2s", "(Ljava/util/List;)V", "getMatchDate", "()Ljava/lang/Long;", "setMatchDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lcom/transsnet/palmpay/teller/bean/resp/BettingRaceScheduleData;", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingRaceScheduleData {

    @Nullable
    private String androidLink;

    @Nullable
    private String backgroundColor;

    @Nullable
    private String backgroundDarkColor;

    @Nullable
    private String backgroundDarkPicture;

    @Nullable
    private String backgroundPicture;

    @Nullable
    private String competitionColor;

    @Nullable
    private String dateColor;

    @Nullable
    private Long matchDate;

    @Nullable
    private List<BettingMatchDetailBean> matchDetailV2s;

    public BettingRaceScheduleData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<BettingMatchDetailBean> list, @Nullable Long l5) {
        this.backgroundColor = str;
        this.backgroundDarkColor = str2;
        this.backgroundPicture = str3;
        this.backgroundDarkPicture = str4;
        this.competitionColor = str5;
        this.androidLink = str6;
        this.dateColor = str7;
        this.matchDetailV2s = list;
        this.matchDate = l5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BettingRaceScheduleData copy$default(BettingRaceScheduleData bettingRaceScheduleData, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingRaceScheduleData.backgroundColor;
        }
        if ((i7 & 2) != 0) {
            str2 = bettingRaceScheduleData.backgroundDarkColor;
        }
        if ((i7 & 4) != 0) {
            str3 = bettingRaceScheduleData.backgroundPicture;
        }
        if ((i7 & 8) != 0) {
            str4 = bettingRaceScheduleData.backgroundDarkPicture;
        }
        if ((i7 & 16) != 0) {
            str5 = bettingRaceScheduleData.competitionColor;
        }
        if ((i7 & 32) != 0) {
            str6 = bettingRaceScheduleData.androidLink;
        }
        if ((i7 & 64) != 0) {
            str7 = bettingRaceScheduleData.dateColor;
        }
        if ((i7 & 128) != 0) {
            list = bettingRaceScheduleData.matchDetailV2s;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            l5 = bettingRaceScheduleData.matchDate;
        }
        List list2 = list;
        Long l6 = l5;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return bettingRaceScheduleData.copy(str, str2, str11, str4, str10, str8, str9, list2, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundDarkColor() {
        return this.backgroundDarkColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundPicture() {
        return this.backgroundPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundDarkPicture() {
        return this.backgroundDarkPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCompetitionColor() {
        return this.competitionColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDateColor() {
        return this.dateColor;
    }

    @Nullable
    public final List<BettingMatchDetailBean> component8() {
        return this.matchDetailV2s;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getMatchDate() {
        return this.matchDate;
    }

    @NotNull
    public final BettingRaceScheduleData copy(@Nullable String backgroundColor, @Nullable String backgroundDarkColor, @Nullable String backgroundPicture, @Nullable String backgroundDarkPicture, @Nullable String competitionColor, @Nullable String androidLink, @Nullable String dateColor, @Nullable List<BettingMatchDetailBean> matchDetailV2s, @Nullable Long matchDate) {
        return new BettingRaceScheduleData(backgroundColor, backgroundDarkColor, backgroundPicture, backgroundDarkPicture, competitionColor, androidLink, dateColor, matchDetailV2s, matchDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingRaceScheduleData)) {
            return false;
        }
        BettingRaceScheduleData bettingRaceScheduleData = (BettingRaceScheduleData) other;
        return Intrinsics.c(this.backgroundColor, bettingRaceScheduleData.backgroundColor) && Intrinsics.c(this.backgroundDarkColor, bettingRaceScheduleData.backgroundDarkColor) && Intrinsics.c(this.backgroundPicture, bettingRaceScheduleData.backgroundPicture) && Intrinsics.c(this.backgroundDarkPicture, bettingRaceScheduleData.backgroundDarkPicture) && Intrinsics.c(this.competitionColor, bettingRaceScheduleData.competitionColor) && Intrinsics.c(this.androidLink, bettingRaceScheduleData.androidLink) && Intrinsics.c(this.dateColor, bettingRaceScheduleData.dateColor) && Intrinsics.c(this.matchDetailV2s, bettingRaceScheduleData.matchDetailV2s) && Intrinsics.c(this.matchDate, bettingRaceScheduleData.matchDate);
    }

    @Nullable
    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundDarkColor() {
        return this.backgroundDarkColor;
    }

    @Nullable
    public final String getBackgroundDarkPicture() {
        return this.backgroundDarkPicture;
    }

    @Nullable
    public final String getBackgroundPicture() {
        return this.backgroundPicture;
    }

    @Nullable
    public final String getCompetitionColor() {
        return this.competitionColor;
    }

    @Nullable
    public final String getDateColor() {
        return this.dateColor;
    }

    @Nullable
    public final Long getMatchDate() {
        return this.matchDate;
    }

    @Nullable
    public final List<BettingMatchDetailBean> getMatchDetailV2s() {
        return this.matchDetailV2s;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundDarkColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundPicture;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundDarkPicture;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.competitionColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.androidLink;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dateColor;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<BettingMatchDetailBean> list = this.matchDetailV2s;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Long l5 = this.matchDate;
        return iHashCode8 + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setAndroidLink(@Nullable String str) {
        this.androidLink = str;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundDarkColor(@Nullable String str) {
        this.backgroundDarkColor = str;
    }

    public final void setBackgroundDarkPicture(@Nullable String str) {
        this.backgroundDarkPicture = str;
    }

    public final void setBackgroundPicture(@Nullable String str) {
        this.backgroundPicture = str;
    }

    public final void setCompetitionColor(@Nullable String str) {
        this.competitionColor = str;
    }

    public final void setDateColor(@Nullable String str) {
        this.dateColor = str;
    }

    public final void setMatchDate(@Nullable Long l5) {
        this.matchDate = l5;
    }

    public final void setMatchDetailV2s(@Nullable List<BettingMatchDetailBean> list) {
        this.matchDetailV2s = list;
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.backgroundDarkColor;
        String str3 = this.backgroundPicture;
        String str4 = this.backgroundDarkPicture;
        String str5 = this.competitionColor;
        String str6 = this.androidLink;
        String str7 = this.dateColor;
        List<BettingMatchDetailBean> list = this.matchDetailV2s;
        Long l5 = this.matchDate;
        StringBuilder sbF = F.f("BettingRaceScheduleData(backgroundColor=", str, ", backgroundDarkColor=", str2, ", backgroundPicture=");
        u.x(sbF, str3, ", backgroundDarkPicture=", str4, ", competitionColor=");
        u.x(sbF, str5, ", androidLink=", str6, ", dateColor=");
        sbF.append(str7);
        sbF.append(", matchDetailV2s=");
        sbF.append(list);
        sbF.append(", matchDate=");
        sbF.append(l5);
        sbF.append(")");
        return sbF.toString();
    }
}
