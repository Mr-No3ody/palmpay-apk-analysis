package com.transsnet.palmpay.send_money.bean.resp;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/BannerEntranceBean;", "", "pic", "", "darkPic", "cornerMark", "darkCornerMark", "jumpUrl", "show", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "getDarkPic", "setDarkPic", "getCornerMark", "setCornerMark", "getDarkCornerMark", "setDarkCornerMark", "getJumpUrl", "setJumpUrl", "getShow", "()Ljava/lang/Boolean;", "setShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "setName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/resp/BannerEntranceBean;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BannerEntranceBean {

    @Nullable
    private String cornerMark;

    @Nullable
    private String darkCornerMark;

    @Nullable
    private String darkPic;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String name;

    @Nullable
    private String pic;

    @Nullable
    private Boolean show;

    public BannerEntranceBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ BannerEntranceBean copy$default(BannerEntranceBean bannerEntranceBean, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bannerEntranceBean.pic;
        }
        if ((i7 & 2) != 0) {
            str2 = bannerEntranceBean.darkPic;
        }
        if ((i7 & 4) != 0) {
            str3 = bannerEntranceBean.cornerMark;
        }
        if ((i7 & 8) != 0) {
            str4 = bannerEntranceBean.darkCornerMark;
        }
        if ((i7 & 16) != 0) {
            str5 = bannerEntranceBean.jumpUrl;
        }
        if ((i7 & 32) != 0) {
            bool = bannerEntranceBean.show;
        }
        if ((i7 & 64) != 0) {
            str6 = bannerEntranceBean.name;
        }
        Boolean bool2 = bool;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return bannerEntranceBean.copy(str, str2, str9, str4, str8, bool2, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkPic() {
        return this.darkPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCornerMark() {
        return this.cornerMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDarkCornerMark() {
        return this.darkCornerMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getShow() {
        return this.show;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final BannerEntranceBean copy(@Nullable String pic, @Nullable String darkPic, @Nullable String cornerMark, @Nullable String darkCornerMark, @Nullable String jumpUrl, @Nullable Boolean show, @Nullable String name) {
        return new BannerEntranceBean(pic, darkPic, cornerMark, darkCornerMark, jumpUrl, show, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerEntranceBean)) {
            return false;
        }
        BannerEntranceBean bannerEntranceBean = (BannerEntranceBean) other;
        return Intrinsics.c(this.pic, bannerEntranceBean.pic) && Intrinsics.c(this.darkPic, bannerEntranceBean.darkPic) && Intrinsics.c(this.cornerMark, bannerEntranceBean.cornerMark) && Intrinsics.c(this.darkCornerMark, bannerEntranceBean.darkCornerMark) && Intrinsics.c(this.jumpUrl, bannerEntranceBean.jumpUrl) && Intrinsics.c(this.show, bannerEntranceBean.show) && Intrinsics.c(this.name, bannerEntranceBean.name);
    }

    @Nullable
    public final String getCornerMark() {
        return this.cornerMark;
    }

    @Nullable
    public final String getDarkCornerMark() {
        return this.darkCornerMark;
    }

    @Nullable
    public final String getDarkPic() {
        return this.darkPic;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final Boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        String str = this.pic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkPic;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cornerMark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkCornerMark;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.show;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.name;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCornerMark(@Nullable String str) {
        this.cornerMark = str;
    }

    public final void setDarkCornerMark(@Nullable String str) {
        this.darkCornerMark = str;
    }

    public final void setDarkPic(@Nullable String str) {
        this.darkPic = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setShow(@Nullable Boolean bool) {
        this.show = bool;
    }

    @NotNull
    public String toString() {
        String str = this.pic;
        String str2 = this.darkPic;
        String str3 = this.cornerMark;
        String str4 = this.darkCornerMark;
        String str5 = this.jumpUrl;
        Boolean bool = this.show;
        String str6 = this.name;
        StringBuilder sbF = F.f("BannerEntranceBean(pic=", str, ", darkPic=", str2, ", cornerMark=");
        u.x(sbF, str3, ", darkCornerMark=", str4, ", jumpUrl=");
        sbF.append(str5);
        sbF.append(", show=");
        sbF.append(bool);
        sbF.append(", name=");
        return G.r(sbF, str6, ")");
    }

    public BannerEntranceBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6) {
        this.pic = str;
        this.darkPic = str2;
        this.cornerMark = str3;
        this.darkCornerMark = str4;
        this.jumpUrl = str5;
        this.show = bool;
        this.name = str6;
    }

    public /* synthetic */ BannerEntranceBean(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : bool, (i7 & 64) != 0 ? null : str6);
    }
}
