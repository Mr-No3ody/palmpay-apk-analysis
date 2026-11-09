package com.transsnet.palmpay.teller.bean;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingBillerBannerBean;", "", "adPic", "", "darkAdPic", "adUrl", "endTime", "", "sort", "", "startTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)V", "getAdPic", "()Ljava/lang/String;", "setAdPic", "(Ljava/lang/String;)V", "getDarkAdPic", "setDarkAdPic", "getAdUrl", "setAdUrl", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSort", "()Ljava/lang/Integer;", "setSort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/transsnet/palmpay/teller/bean/BettingBillerBannerBean;", "equals", "", "other", "hashCode", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingBillerBannerBean {

    @Nullable
    private String adPic;

    @Nullable
    private String adUrl;

    @Nullable
    private String darkAdPic;

    @Nullable
    private Long endTime;

    @Nullable
    private Integer sort;

    @Nullable
    private Long startTime;

    public BettingBillerBannerBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable Integer num, @Nullable Long l6) {
        this.adPic = str;
        this.darkAdPic = str2;
        this.adUrl = str3;
        this.endTime = l5;
        this.sort = num;
        this.startTime = l6;
    }

    public static /* synthetic */ BettingBillerBannerBean copy$default(BettingBillerBannerBean bettingBillerBannerBean, String str, String str2, String str3, Long l5, Integer num, Long l6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingBillerBannerBean.adPic;
        }
        if ((i7 & 2) != 0) {
            str2 = bettingBillerBannerBean.darkAdPic;
        }
        if ((i7 & 4) != 0) {
            str3 = bettingBillerBannerBean.adUrl;
        }
        if ((i7 & 8) != 0) {
            l5 = bettingBillerBannerBean.endTime;
        }
        if ((i7 & 16) != 0) {
            num = bettingBillerBannerBean.sort;
        }
        if ((i7 & 32) != 0) {
            l6 = bettingBillerBannerBean.startTime;
        }
        Integer num2 = num;
        Long l8 = l6;
        return bettingBillerBannerBean.copy(str, str2, str3, l5, num2, l8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdPic() {
        return this.adPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkAdPic() {
        return this.darkAdPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdUrl() {
        return this.adUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final BettingBillerBannerBean copy(@Nullable String adPic, @Nullable String darkAdPic, @Nullable String adUrl, @Nullable Long endTime, @Nullable Integer sort, @Nullable Long startTime) {
        return new BettingBillerBannerBean(adPic, darkAdPic, adUrl, endTime, sort, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingBillerBannerBean)) {
            return false;
        }
        BettingBillerBannerBean bettingBillerBannerBean = (BettingBillerBannerBean) other;
        return Intrinsics.c(this.adPic, bettingBillerBannerBean.adPic) && Intrinsics.c(this.darkAdPic, bettingBillerBannerBean.darkAdPic) && Intrinsics.c(this.adUrl, bettingBillerBannerBean.adUrl) && Intrinsics.c(this.endTime, bettingBillerBannerBean.endTime) && Intrinsics.c(this.sort, bettingBillerBannerBean.sort) && Intrinsics.c(this.startTime, bettingBillerBannerBean.startTime);
    }

    @Nullable
    public final String getAdPic() {
        return this.adPic;
    }

    @Nullable
    public final String getAdUrl() {
        return this.adUrl;
    }

    @Nullable
    public final String getDarkAdPic() {
        return this.darkAdPic;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.adPic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkAdPic;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.endTime;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.sort;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l6 = this.startTime;
        return iHashCode5 + (l6 != null ? l6.hashCode() : 0);
    }

    public final void setAdPic(@Nullable String str) {
        this.adPic = str;
    }

    public final void setAdUrl(@Nullable String str) {
        this.adUrl = str;
    }

    public final void setDarkAdPic(@Nullable String str) {
        this.darkAdPic = str;
    }

    public final void setEndTime(@Nullable Long l5) {
        this.endTime = l5;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setStartTime(@Nullable Long l5) {
        this.startTime = l5;
    }

    @NotNull
    public String toString() {
        String str = this.adPic;
        String str2 = this.darkAdPic;
        String str3 = this.adUrl;
        Long l5 = this.endTime;
        Integer num = this.sort;
        Long l6 = this.startTime;
        StringBuilder sbF = F.f("BettingBillerBannerBean(adPic=", str, ", darkAdPic=", str2, ", adUrl=");
        sbF.append(str3);
        sbF.append(", endTime=");
        sbF.append(l5);
        sbF.append(", sort=");
        sbF.append(num);
        sbF.append(", startTime=");
        sbF.append(l6);
        sbF.append(")");
        return sbF.toString();
    }
}
