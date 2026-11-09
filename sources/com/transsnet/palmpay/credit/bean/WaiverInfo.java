package com.transsnet.palmpay.credit.bean;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "Ljava/io/Serializable;", "waiverType", "", "waiverEnable", "", "originalOutstandingAmount", "", "currentOutstandingAmount", "waiverAmount", "validUntil", "badgeText", "amountLabel", "summaryText", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWaiverType", "()Ljava/lang/String;", "getWaiverEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOriginalOutstandingAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentOutstandingAmount", "getWaiverAmount", "getValidUntil", "getBadgeText", "getAmountLabel", "getSummaryText", "getCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "equals", "other", "", "hashCode", "", "toString", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WaiverInfo implements Serializable {

    @NotNull
    public static final String TYPE_FULL = "FULL";

    @NotNull
    public static final String TYPE_PARTIAL = "PARTIAL";
    private static final long serialVersionUID = 1;

    @Nullable
    private final String amountLabel;

    @Nullable
    private final String badgeText;

    @Nullable
    private final String ctaText;

    @Nullable
    private final Long currentOutstandingAmount;

    @Nullable
    private final Long originalOutstandingAmount;

    @Nullable
    private final String summaryText;

    @Nullable
    private final Long validUntil;

    @Nullable
    private final Long waiverAmount;

    @Nullable
    private final Boolean waiverEnable;

    @Nullable
    private final String waiverType;

    public WaiverInfo(@Nullable String str, @Nullable Boolean bool, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.waiverType = str;
        this.waiverEnable = bool;
        this.originalOutstandingAmount = l5;
        this.currentOutstandingAmount = l6;
        this.waiverAmount = l8;
        this.validUntil = l10;
        this.badgeText = str2;
        this.amountLabel = str3;
        this.summaryText = str4;
        this.ctaText = str5;
    }

    public static /* synthetic */ WaiverInfo copy$default(WaiverInfo waiverInfo, String str, Boolean bool, Long l5, Long l6, Long l8, Long l10, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = waiverInfo.waiverType;
        }
        if ((i7 & 2) != 0) {
            bool = waiverInfo.waiverEnable;
        }
        if ((i7 & 4) != 0) {
            l5 = waiverInfo.originalOutstandingAmount;
        }
        if ((i7 & 8) != 0) {
            l6 = waiverInfo.currentOutstandingAmount;
        }
        if ((i7 & 16) != 0) {
            l8 = waiverInfo.waiverAmount;
        }
        if ((i7 & 32) != 0) {
            l10 = waiverInfo.validUntil;
        }
        if ((i7 & 64) != 0) {
            str2 = waiverInfo.badgeText;
        }
        if ((i7 & 128) != 0) {
            str3 = waiverInfo.amountLabel;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str4 = waiverInfo.summaryText;
        }
        if ((i7 & 512) != 0) {
            str5 = waiverInfo.ctaText;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        Long l11 = l8;
        Long l12 = l10;
        return waiverInfo.copy(str, bool, l5, l6, l11, l12, str8, str9, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWaiverType() {
        return this.waiverType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getWaiverEnable() {
        return this.waiverEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getOriginalOutstandingAmount() {
        return this.originalOutstandingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCurrentOutstandingAmount() {
        return this.currentOutstandingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getWaiverAmount() {
        return this.waiverAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAmountLabel() {
        return this.amountLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    @NotNull
    public final WaiverInfo copy(@Nullable String waiverType, @Nullable Boolean waiverEnable, @Nullable Long originalOutstandingAmount, @Nullable Long currentOutstandingAmount, @Nullable Long waiverAmount, @Nullable Long validUntil, @Nullable String badgeText, @Nullable String amountLabel, @Nullable String summaryText, @Nullable String ctaText) {
        return new WaiverInfo(waiverType, waiverEnable, originalOutstandingAmount, currentOutstandingAmount, waiverAmount, validUntil, badgeText, amountLabel, summaryText, ctaText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaiverInfo)) {
            return false;
        }
        WaiverInfo waiverInfo = (WaiverInfo) other;
        return Intrinsics.c(this.waiverType, waiverInfo.waiverType) && Intrinsics.c(this.waiverEnable, waiverInfo.waiverEnable) && Intrinsics.c(this.originalOutstandingAmount, waiverInfo.originalOutstandingAmount) && Intrinsics.c(this.currentOutstandingAmount, waiverInfo.currentOutstandingAmount) && Intrinsics.c(this.waiverAmount, waiverInfo.waiverAmount) && Intrinsics.c(this.validUntil, waiverInfo.validUntil) && Intrinsics.c(this.badgeText, waiverInfo.badgeText) && Intrinsics.c(this.amountLabel, waiverInfo.amountLabel) && Intrinsics.c(this.summaryText, waiverInfo.summaryText) && Intrinsics.c(this.ctaText, waiverInfo.ctaText);
    }

    @Nullable
    public final String getAmountLabel() {
        return this.amountLabel;
    }

    @Nullable
    public final String getBadgeText() {
        return this.badgeText;
    }

    @Nullable
    public final String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    public final Long getCurrentOutstandingAmount() {
        return this.currentOutstandingAmount;
    }

    @Nullable
    public final Long getOriginalOutstandingAmount() {
        return this.originalOutstandingAmount;
    }

    @Nullable
    public final String getSummaryText() {
        return this.summaryText;
    }

    @Nullable
    public final Long getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public final Long getWaiverAmount() {
        return this.waiverAmount;
    }

    @Nullable
    public final Boolean getWaiverEnable() {
        return this.waiverEnable;
    }

    @Nullable
    public final String getWaiverType() {
        return this.waiverType;
    }

    public int hashCode() {
        String str = this.waiverType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.waiverEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l5 = this.originalOutstandingAmount;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.currentOutstandingAmount;
        int iHashCode4 = (iHashCode3 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.waiverAmount;
        int iHashCode5 = (iHashCode4 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.validUntil;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.badgeText;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amountLabel;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.summaryText;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ctaText;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.waiverType;
        Boolean bool = this.waiverEnable;
        Long l5 = this.originalOutstandingAmount;
        Long l6 = this.currentOutstandingAmount;
        Long l8 = this.waiverAmount;
        Long l10 = this.validUntil;
        String str2 = this.badgeText;
        String str3 = this.amountLabel;
        String str4 = this.summaryText;
        String str5 = this.ctaText;
        StringBuilder sb2 = new StringBuilder("WaiverInfo(waiverType=");
        sb2.append(str);
        sb2.append(", waiverEnable=");
        sb2.append(bool);
        sb2.append(", originalOutstandingAmount=");
        q0.w(sb2, l5, ", currentOutstandingAmount=", l6, ", waiverAmount=");
        q0.w(sb2, l8, ", validUntil=", l10, ", badgeText=");
        u.x(sb2, str2, ", amountLabel=", str3, ", summaryText=");
        return G.s(sb2, str4, ", ctaText=", str5, ")");
    }
}
