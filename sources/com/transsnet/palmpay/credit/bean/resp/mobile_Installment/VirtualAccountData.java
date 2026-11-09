package com.transsnet.palmpay.credit.bean.resp.mobile_Installment;

import C0.G;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;", "", "itemLayoutType", "", "itemStyle", "", "image", "imageDark", "icon", "iconDark", "title", "virtualAccountNo", "accountName", "bankName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemLayoutType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemStyle", "()Ljava/lang/String;", "getImage", "getImageDark", "getIcon", "getIconDark", "getTitle", "getVirtualAccountNo", "getAccountName", "getBankName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/VirtualAccountData;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VirtualAccountData {

    @Nullable
    private final String accountName;

    @Nullable
    private final String bankName;

    @Nullable
    private final String icon;

    @Nullable
    private final String iconDark;

    @Nullable
    private final String image;

    @Nullable
    private final String imageDark;

    @Nullable
    private final Integer itemLayoutType;

    @Nullable
    private final String itemStyle;

    @Nullable
    private final String title;

    @Nullable
    private final String virtualAccountNo;

    public VirtualAccountData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ VirtualAccountData copy$default(VirtualAccountData virtualAccountData, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = virtualAccountData.itemLayoutType;
        }
        if ((i7 & 2) != 0) {
            str = virtualAccountData.itemStyle;
        }
        if ((i7 & 4) != 0) {
            str2 = virtualAccountData.image;
        }
        if ((i7 & 8) != 0) {
            str3 = virtualAccountData.imageDark;
        }
        if ((i7 & 16) != 0) {
            str4 = virtualAccountData.icon;
        }
        if ((i7 & 32) != 0) {
            str5 = virtualAccountData.iconDark;
        }
        if ((i7 & 64) != 0) {
            str6 = virtualAccountData.title;
        }
        if ((i7 & 128) != 0) {
            str7 = virtualAccountData.virtualAccountNo;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str8 = virtualAccountData.accountName;
        }
        if ((i7 & 512) != 0) {
            str9 = virtualAccountData.bankName;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return virtualAccountData.copy(num, str, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getItemLayoutType() {
        return this.itemLayoutType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageDark() {
        return this.imageDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconDark() {
        return this.iconDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVirtualAccountNo() {
        return this.virtualAccountNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final VirtualAccountData copy(@Nullable Integer itemLayoutType, @Nullable String itemStyle, @Nullable String image, @Nullable String imageDark, @Nullable String icon, @Nullable String iconDark, @Nullable String title, @Nullable String virtualAccountNo, @Nullable String accountName, @Nullable String bankName) {
        return new VirtualAccountData(itemLayoutType, itemStyle, image, imageDark, icon, iconDark, title, virtualAccountNo, accountName, bankName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualAccountData)) {
            return false;
        }
        VirtualAccountData virtualAccountData = (VirtualAccountData) other;
        return Intrinsics.c(this.itemLayoutType, virtualAccountData.itemLayoutType) && Intrinsics.c(this.itemStyle, virtualAccountData.itemStyle) && Intrinsics.c(this.image, virtualAccountData.image) && Intrinsics.c(this.imageDark, virtualAccountData.imageDark) && Intrinsics.c(this.icon, virtualAccountData.icon) && Intrinsics.c(this.iconDark, virtualAccountData.iconDark) && Intrinsics.c(this.title, virtualAccountData.title) && Intrinsics.c(this.virtualAccountNo, virtualAccountData.virtualAccountNo) && Intrinsics.c(this.accountName, virtualAccountData.accountName) && Intrinsics.c(this.bankName, virtualAccountData.bankName);
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconDark() {
        return this.iconDark;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getImageDark() {
        return this.imageDark;
    }

    @Nullable
    public final Integer getItemLayoutType() {
        return this.itemLayoutType;
    }

    @Nullable
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVirtualAccountNo() {
        return this.virtualAccountNo;
    }

    public int hashCode() {
        Integer num = this.itemLayoutType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemStyle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDark;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconDark;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.virtualAccountNo;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accountName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bankName;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.itemLayoutType;
        String str = this.itemStyle;
        String str2 = this.image;
        String str3 = this.imageDark;
        String str4 = this.icon;
        String str5 = this.iconDark;
        String str6 = this.title;
        String str7 = this.virtualAccountNo;
        String str8 = this.accountName;
        String str9 = this.bankName;
        StringBuilder sb2 = new StringBuilder("VirtualAccountData(itemLayoutType=");
        sb2.append(num);
        sb2.append(", itemStyle=");
        sb2.append(str);
        sb2.append(", image=");
        u.x(sb2, str2, ", imageDark=", str3, ", icon=");
        u.x(sb2, str4, ", iconDark=", str5, ", title=");
        u.x(sb2, str6, ", virtualAccountNo=", str7, ", accountName=");
        return G.s(sb2, str8, ", bankName=", str9, ")");
    }

    public VirtualAccountData(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.itemLayoutType = num;
        this.itemStyle = str;
        this.image = str2;
        this.imageDark = str3;
        this.icon = str4;
        this.iconDark = str5;
        this.title = str6;
        this.virtualAccountNo = str7;
        this.accountName = str8;
        this.bankName = str9;
    }

    public /* synthetic */ VirtualAccountData(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? null : str7, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str8, (i7 & 512) != 0 ? null : str9);
    }
}
