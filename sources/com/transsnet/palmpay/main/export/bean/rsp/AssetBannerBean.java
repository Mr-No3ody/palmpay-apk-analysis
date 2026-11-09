package com.transsnet.palmpay.main.export.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/AssetBannerBean;", "", "<init>", "()V", "memberId", "", "businessId", "businessIcon", "businessIconDark", FirebaseAnalytics.Param.CONTENT, "contentDark", "jumpIcon", "jumpIconDark", "jumpContent", "jumpContentDark", "androidJumpUrl", "businessSign", "needClickReport", "", "Ljava/lang/Integer;", "equals", "", "o", "hashCode", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetBannerBean {

    @JvmField
    @Nullable
    public String androidJumpUrl;

    @JvmField
    @Nullable
    public String businessIcon;

    @JvmField
    @Nullable
    public String businessId;

    @JvmField
    @Nullable
    public String businessSign;

    @JvmField
    @Nullable
    public String contentDark;

    @JvmField
    @Nullable
    public String jumpContent;

    @JvmField
    @Nullable
    public String jumpContentDark;

    @JvmField
    @Nullable
    public String jumpIcon;

    @JvmField
    @Nullable
    public String jumpIconDark;

    @JvmField
    @Nullable
    public String memberId;

    @JvmField
    @Nullable
    public Integer needClickReport;

    @JvmField
    @NotNull
    public String businessIconDark = "";

    @JvmField
    @NotNull
    public String content = "";

    public boolean equals(@Nullable Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && AssetBannerBean.class.equals(o10.getClass())) {
            AssetBannerBean assetBannerBean = (AssetBannerBean) o10;
            if (Intrinsics.c(this.businessId, assetBannerBean.businessId) && Intrinsics.c(this.businessIcon, assetBannerBean.businessIcon) && Intrinsics.c(this.businessIconDark, assetBannerBean.businessIconDark) && Intrinsics.c(this.content, assetBannerBean.content) && Intrinsics.c(this.contentDark, assetBannerBean.contentDark)) {
                if (Intrinsics.c(this.jumpContentDark, assetBannerBean.jumpContentDark) & Intrinsics.c(this.jumpContent, assetBannerBean.jumpContent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.businessId, this.content, this.contentDark, this.jumpContent, this.jumpContentDark);
    }
}
