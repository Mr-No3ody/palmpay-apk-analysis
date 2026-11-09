package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeTaskCenterRsp;", "", "<init>", "()V", "androidUrl", "", "backgroundUrl", "darkModeBackgroundUrl", "subButtonAndroidUrl", "taskFlag", "", "Ljava/lang/Integer;", "tagId", "templateType", "taskSceneType", "templateConfig", "equals", "", "other", "hashCode", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeTaskCenterRsp {

    @JvmField
    @Nullable
    public final String androidUrl;

    @JvmField
    @Nullable
    public final String backgroundUrl;

    @JvmField
    @Nullable
    public final String darkModeBackgroundUrl;

    @JvmField
    @Nullable
    public final String subButtonAndroidUrl;

    @JvmField
    @Nullable
    public final String tagId;

    @JvmField
    @Nullable
    public final Integer taskFlag;

    @JvmField
    @Nullable
    public final String taskSceneType;

    @JvmField
    @Nullable
    public final String templateConfig;

    @JvmField
    @Nullable
    public final Integer templateType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!HomeTaskCenterRsp.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.HomeTaskCenterRsp");
        HomeTaskCenterRsp homeTaskCenterRsp = (HomeTaskCenterRsp) other;
        return Intrinsics.c(this.androidUrl, homeTaskCenterRsp.androidUrl) && Intrinsics.c(this.backgroundUrl, homeTaskCenterRsp.backgroundUrl) && Intrinsics.c(this.darkModeBackgroundUrl, homeTaskCenterRsp.darkModeBackgroundUrl) && Intrinsics.c(this.subButtonAndroidUrl, homeTaskCenterRsp.subButtonAndroidUrl) && Intrinsics.c(this.taskFlag, homeTaskCenterRsp.taskFlag) && Intrinsics.c(this.taskSceneType, homeTaskCenterRsp.taskSceneType) && Intrinsics.c(this.templateConfig, homeTaskCenterRsp.templateConfig) && Intrinsics.c(this.templateType, homeTaskCenterRsp.templateType) && Intrinsics.c(this.tagId, homeTaskCenterRsp.tagId);
    }

    public int hashCode() {
        String str = this.androidUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.backgroundUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.darkModeBackgroundUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subButtonAndroidUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.taskFlag;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str5 = this.taskSceneType;
        int iHashCode5 = (iIntValue + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.templateConfig;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num2 = this.templateType;
        int iIntValue2 = (iHashCode6 + (num2 != null ? num2.intValue() : 0)) * 31;
        String str7 = this.tagId;
        return iIntValue2 + (str7 != null ? str7.hashCode() : 0);
    }
}
