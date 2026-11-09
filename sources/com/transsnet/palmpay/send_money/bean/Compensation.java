package com.transsnet.palmpay.send_money.bean;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/Compensation;", "", "pic", "", "darkPic", "jumpUrl", "show", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPic", "()Ljava/lang/String;", "getDarkPic", "getJumpUrl", "getShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/send_money/bean/Compensation;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Compensation {

    @Nullable
    private final String darkPic;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String pic;

    @Nullable
    private final Boolean show;

    public Compensation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.pic = str;
        this.darkPic = str2;
        this.jumpUrl = str3;
        this.show = bool;
    }

    public static /* synthetic */ Compensation copy$default(Compensation compensation, String str, String str2, String str3, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = compensation.pic;
        }
        if ((i7 & 2) != 0) {
            str2 = compensation.darkPic;
        }
        if ((i7 & 4) != 0) {
            str3 = compensation.jumpUrl;
        }
        if ((i7 & 8) != 0) {
            bool = compensation.show;
        }
        return compensation.copy(str, str2, str3, bool);
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
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShow() {
        return this.show;
    }

    @NotNull
    public final Compensation copy(@Nullable String pic, @Nullable String darkPic, @Nullable String jumpUrl, @Nullable Boolean show) {
        return new Compensation(pic, darkPic, jumpUrl, show);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Compensation)) {
            return false;
        }
        Compensation compensation = (Compensation) other;
        return Intrinsics.c(this.pic, compensation.pic) && Intrinsics.c(this.darkPic, compensation.darkPic) && Intrinsics.c(this.jumpUrl, compensation.jumpUrl) && Intrinsics.c(this.show, compensation.show);
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
        String str3 = this.jumpUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.show;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pic;
        String str2 = this.darkPic;
        String str3 = this.jumpUrl;
        Boolean bool = this.show;
        StringBuilder sbF = F.f("Compensation(pic=", str, ", darkPic=", str2, ", jumpUrl=");
        sbF.append(str3);
        sbF.append(", show=");
        sbF.append(bool);
        sbF.append(")");
        return sbF.toString();
    }
}
