package com.transsnet.palmpay.main.export.bean.rsp;

import C0.G;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeWealthProductRsp;", "", "productRecommendList", "", "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeWealthItem;", "jumpContent", "", "jumpAndroidUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeWealthProductRsp {

    @JvmField
    @NotNull
    public String jumpAndroidUrl;

    @JvmField
    @NotNull
    public String jumpContent;

    @JvmField
    @Nullable
    public List<HomeWealthItem> productRecommendList;

    public HomeWealthProductRsp() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!HomeWealthProductRsp.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.HomeWealthProductRsp");
        HomeWealthProductRsp homeWealthProductRsp = (HomeWealthProductRsp) other;
        return Intrinsics.c(this.productRecommendList, homeWealthProductRsp.productRecommendList) && Intrinsics.c(this.jumpContent, homeWealthProductRsp.jumpContent) && Intrinsics.c(this.jumpAndroidUrl, homeWealthProductRsp.jumpAndroidUrl);
    }

    public int hashCode() {
        List<HomeWealthItem> list = this.productRecommendList;
        return this.jumpAndroidUrl.hashCode() + G.c((list != null ? list.hashCode() : 0) * 31, 31, this.jumpContent);
    }

    public HomeWealthProductRsp(@Nullable List<HomeWealthItem> list, @NotNull String jumpContent, @NotNull String jumpAndroidUrl) {
        Intrinsics.checkNotNullParameter(jumpContent, "jumpContent");
        Intrinsics.checkNotNullParameter(jumpAndroidUrl, "jumpAndroidUrl");
        this.productRecommendList = list;
        this.jumpContent = jumpContent;
        this.jumpAndroidUrl = jumpAndroidUrl;
    }

    public /* synthetic */ HomeWealthProductRsp(List list, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2);
    }
}
