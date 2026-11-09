package com.transsnet.palmpay.main.export.bean.rsp;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeWealthItem;", "", "productTitle", "", "cornerMark", "productSubTitle", "productContent", "productSubContent", "buttonContent", "buttonAndroidUrl", "productCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeWealthItem {

    @JvmField
    @NotNull
    public String buttonAndroidUrl;

    @JvmField
    @NotNull
    public String buttonContent;

    @JvmField
    @NotNull
    public String cornerMark;

    @JvmField
    @NotNull
    public String productCode;

    @JvmField
    @NotNull
    public String productContent;

    @JvmField
    @NotNull
    public String productSubContent;

    @JvmField
    @NotNull
    public String productSubTitle;

    @JvmField
    @NotNull
    public String productTitle;

    public HomeWealthItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!HomeWealthItem.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.HomeWealthItem");
        HomeWealthItem homeWealthItem = (HomeWealthItem) other;
        return Intrinsics.c(this.productTitle, homeWealthItem.productTitle) && Intrinsics.c(this.cornerMark, homeWealthItem.cornerMark) && Intrinsics.c(this.productSubTitle, homeWealthItem.productSubTitle) && Intrinsics.c(this.productContent, homeWealthItem.productContent) && Intrinsics.c(this.productSubContent, homeWealthItem.productSubContent) && Intrinsics.c(this.buttonContent, homeWealthItem.buttonContent) && Intrinsics.c(this.buttonAndroidUrl, homeWealthItem.buttonAndroidUrl) && Intrinsics.c(this.productCode, homeWealthItem.productCode);
    }

    public int hashCode() {
        return this.productCode.hashCode() + G.c(G.c(G.c(G.c(G.c(G.c(this.productTitle.hashCode() * 31, 31, this.cornerMark), 31, this.productSubTitle), 31, this.productContent), 31, this.productSubContent), 31, this.buttonContent), 31, this.buttonAndroidUrl);
    }

    public HomeWealthItem(@NotNull String productTitle, @NotNull String cornerMark, @NotNull String productSubTitle, @NotNull String productContent, @NotNull String productSubContent, @NotNull String buttonContent, @NotNull String buttonAndroidUrl, @NotNull String productCode) {
        Intrinsics.checkNotNullParameter(productTitle, "productTitle");
        Intrinsics.checkNotNullParameter(cornerMark, "cornerMark");
        Intrinsics.checkNotNullParameter(productSubTitle, "productSubTitle");
        Intrinsics.checkNotNullParameter(productContent, "productContent");
        Intrinsics.checkNotNullParameter(productSubContent, "productSubContent");
        Intrinsics.checkNotNullParameter(buttonContent, "buttonContent");
        Intrinsics.checkNotNullParameter(buttonAndroidUrl, "buttonAndroidUrl");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        this.productTitle = productTitle;
        this.cornerMark = cornerMark;
        this.productSubTitle = productSubTitle;
        this.productContent = productContent;
        this.productSubContent = productSubContent;
        this.buttonContent = buttonContent;
        this.buttonAndroidUrl = buttonAndroidUrl;
        this.productCode = productCode;
    }

    public /* synthetic */ HomeWealthItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? "" : str7, (i7 & 128) != 0 ? "" : str8);
    }
}
