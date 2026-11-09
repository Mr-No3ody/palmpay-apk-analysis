package com.transsnet.palmpay.credit.bean;

import C0.G;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0092\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b!\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\"\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001d¨\u00066"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "", "canBorrowMultiple", "", "availableAmount", "", "remainingBorrowCount", "", "badgeText", "", "summaryText", "summaryIcon", "ctaText", "ctaEnabled", "showPopup", "popupSummary", "popupCtaText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getCanBorrowMultiple", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvailableAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemainingBorrowCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBadgeText", "()Ljava/lang/String;", "getSummaryText", "getSummaryIcon", "getCtaText", "getCtaEnabled", "getShowPopup", "getPopupSummary", "getPopupCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "equals", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiLoanInfo {

    @Nullable
    private final Long availableAmount;

    @Nullable
    private final String badgeText;

    @Nullable
    private final Boolean canBorrowMultiple;

    @Nullable
    private final Boolean ctaEnabled;

    @Nullable
    private final String ctaText;

    @Nullable
    private final String popupCtaText;

    @Nullable
    private final String popupSummary;

    @Nullable
    private final Integer remainingBorrowCount;

    @Nullable
    private final Boolean showPopup;

    @Nullable
    private final String summaryIcon;

    @Nullable
    private final String summaryText;

    public MultiLoanInfo(@Nullable Boolean bool, @Nullable Long l5, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6) {
        this.canBorrowMultiple = bool;
        this.availableAmount = l5;
        this.remainingBorrowCount = num;
        this.badgeText = str;
        this.summaryText = str2;
        this.summaryIcon = str3;
        this.ctaText = str4;
        this.ctaEnabled = bool2;
        this.showPopup = bool3;
        this.popupSummary = str5;
        this.popupCtaText = str6;
    }

    public static /* synthetic */ MultiLoanInfo copy$default(MultiLoanInfo multiLoanInfo, Boolean bool, Long l5, Integer num, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = multiLoanInfo.canBorrowMultiple;
        }
        if ((i7 & 2) != 0) {
            l5 = multiLoanInfo.availableAmount;
        }
        if ((i7 & 4) != 0) {
            num = multiLoanInfo.remainingBorrowCount;
        }
        if ((i7 & 8) != 0) {
            str = multiLoanInfo.badgeText;
        }
        if ((i7 & 16) != 0) {
            str2 = multiLoanInfo.summaryText;
        }
        if ((i7 & 32) != 0) {
            str3 = multiLoanInfo.summaryIcon;
        }
        if ((i7 & 64) != 0) {
            str4 = multiLoanInfo.ctaText;
        }
        if ((i7 & 128) != 0) {
            bool2 = multiLoanInfo.ctaEnabled;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            bool3 = multiLoanInfo.showPopup;
        }
        if ((i7 & 512) != 0) {
            str5 = multiLoanInfo.popupSummary;
        }
        if ((i7 & 1024) != 0) {
            str6 = multiLoanInfo.popupCtaText;
        }
        String str7 = str5;
        String str8 = str6;
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        String str9 = str3;
        String str10 = str4;
        String str11 = str2;
        Integer num2 = num;
        return multiLoanInfo.copy(bool, l5, num2, str, str11, str9, str10, bool4, bool5, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getCanBorrowMultiple() {
        return this.canBorrowMultiple;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPopupSummary() {
        return this.popupSummary;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPopupCtaText() {
        return this.popupCtaText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRemainingBorrowCount() {
        return this.remainingBorrowCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSummaryIcon() {
        return this.summaryIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getShowPopup() {
        return this.showPopup;
    }

    @NotNull
    public final MultiLoanInfo copy(@Nullable Boolean canBorrowMultiple, @Nullable Long availableAmount, @Nullable Integer remainingBorrowCount, @Nullable String badgeText, @Nullable String summaryText, @Nullable String summaryIcon, @Nullable String ctaText, @Nullable Boolean ctaEnabled, @Nullable Boolean showPopup, @Nullable String popupSummary, @Nullable String popupCtaText) {
        return new MultiLoanInfo(canBorrowMultiple, availableAmount, remainingBorrowCount, badgeText, summaryText, summaryIcon, ctaText, ctaEnabled, showPopup, popupSummary, popupCtaText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiLoanInfo)) {
            return false;
        }
        MultiLoanInfo multiLoanInfo = (MultiLoanInfo) other;
        return Intrinsics.c(this.canBorrowMultiple, multiLoanInfo.canBorrowMultiple) && Intrinsics.c(this.availableAmount, multiLoanInfo.availableAmount) && Intrinsics.c(this.remainingBorrowCount, multiLoanInfo.remainingBorrowCount) && Intrinsics.c(this.badgeText, multiLoanInfo.badgeText) && Intrinsics.c(this.summaryText, multiLoanInfo.summaryText) && Intrinsics.c(this.summaryIcon, multiLoanInfo.summaryIcon) && Intrinsics.c(this.ctaText, multiLoanInfo.ctaText) && Intrinsics.c(this.ctaEnabled, multiLoanInfo.ctaEnabled) && Intrinsics.c(this.showPopup, multiLoanInfo.showPopup) && Intrinsics.c(this.popupSummary, multiLoanInfo.popupSummary) && Intrinsics.c(this.popupCtaText, multiLoanInfo.popupCtaText);
    }

    @Nullable
    public final Long getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getBadgeText() {
        return this.badgeText;
    }

    @Nullable
    public final Boolean getCanBorrowMultiple() {
        return this.canBorrowMultiple;
    }

    @Nullable
    public final Boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    @Nullable
    public final String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    public final String getPopupCtaText() {
        return this.popupCtaText;
    }

    @Nullable
    public final String getPopupSummary() {
        return this.popupSummary;
    }

    @Nullable
    public final Integer getRemainingBorrowCount() {
        return this.remainingBorrowCount;
    }

    @Nullable
    public final Boolean getShowPopup() {
        return this.showPopup;
    }

    @Nullable
    public final String getSummaryIcon() {
        return this.summaryIcon;
    }

    @Nullable
    public final String getSummaryText() {
        return this.summaryText;
    }

    public int hashCode() {
        Boolean bool = this.canBorrowMultiple;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l5 = this.availableAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.remainingBorrowCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.badgeText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.summaryText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.summaryIcon;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaText;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.ctaEnabled;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showPopup;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.popupSummary;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.popupCtaText;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.canBorrowMultiple;
        Long l5 = this.availableAmount;
        Integer num = this.remainingBorrowCount;
        String str = this.badgeText;
        String str2 = this.summaryText;
        String str3 = this.summaryIcon;
        String str4 = this.ctaText;
        Boolean bool2 = this.ctaEnabled;
        Boolean bool3 = this.showPopup;
        String str5 = this.popupSummary;
        String str6 = this.popupCtaText;
        StringBuilder sb2 = new StringBuilder("MultiLoanInfo(canBorrowMultiple=");
        sb2.append(bool);
        sb2.append(", availableAmount=");
        sb2.append(l5);
        sb2.append(", remainingBorrowCount=");
        sb2.append(num);
        sb2.append(", badgeText=");
        sb2.append(str);
        sb2.append(", summaryText=");
        u.x(sb2, str2, ", summaryIcon=", str3, ", ctaText=");
        sb2.append(str4);
        sb2.append(", ctaEnabled=");
        sb2.append(bool2);
        sb2.append(", showPopup=");
        sb2.append(bool3);
        sb2.append(", popupSummary=");
        sb2.append(str5);
        sb2.append(", popupCtaText=");
        return G.r(sb2, str6, ")");
    }
}
