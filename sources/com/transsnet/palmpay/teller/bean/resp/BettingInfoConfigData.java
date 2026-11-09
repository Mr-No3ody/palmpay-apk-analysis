package com.transsnet.palmpay.teller.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingInfoConfigData;", "", "competitionSwitch", "", "disclaimer", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCompetitionSwitch", "()Ljava/lang/Integer;", "setCompetitionSwitch", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDisclaimer", "()Ljava/lang/String;", "setDisclaimer", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/transsnet/palmpay/teller/bean/resp/BettingInfoConfigData;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingInfoConfigData {

    @Nullable
    private Integer competitionSwitch;

    @Nullable
    private String disclaimer;

    /* JADX WARN: Multi-variable type inference failed */
    public BettingInfoConfigData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BettingInfoConfigData copy$default(BettingInfoConfigData bettingInfoConfigData, Integer num, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = bettingInfoConfigData.competitionSwitch;
        }
        if ((i7 & 2) != 0) {
            str = bettingInfoConfigData.disclaimer;
        }
        return bettingInfoConfigData.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCompetitionSwitch() {
        return this.competitionSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final BettingInfoConfigData copy(@Nullable Integer competitionSwitch, @Nullable String disclaimer) {
        return new BettingInfoConfigData(competitionSwitch, disclaimer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingInfoConfigData)) {
            return false;
        }
        BettingInfoConfigData bettingInfoConfigData = (BettingInfoConfigData) other;
        return Intrinsics.c(this.competitionSwitch, bettingInfoConfigData.competitionSwitch) && Intrinsics.c(this.disclaimer, bettingInfoConfigData.disclaimer);
    }

    @Nullable
    public final Integer getCompetitionSwitch() {
        return this.competitionSwitch;
    }

    @Nullable
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public int hashCode() {
        Integer num = this.competitionSwitch;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.disclaimer;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setCompetitionSwitch(@Nullable Integer num) {
        this.competitionSwitch = num;
    }

    public final void setDisclaimer(@Nullable String str) {
        this.disclaimer = str;
    }

    @NotNull
    public String toString() {
        return "BettingInfoConfigData(competitionSwitch=" + this.competitionSwitch + ", disclaimer=" + this.disclaimer + ")";
    }

    public BettingInfoConfigData(@Nullable Integer num, @Nullable String str) {
        this.competitionSwitch = num;
        this.disclaimer = str;
    }

    public /* synthetic */ BettingInfoConfigData(Integer num, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? null : str);
    }
}
