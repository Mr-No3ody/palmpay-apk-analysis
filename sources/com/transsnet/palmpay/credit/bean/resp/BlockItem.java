package com.transsnet.palmpay.credit.bean.resp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Jo\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;", "", "title", "", FirebaseAnalytics.Param.CONTENT, "button", "iconUrl", "jumpPath", "jumpType", "jumpParams", "phoneNumList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getButton", "getIconUrl", "getJumpPath", "getJumpType", "getJumpParams", "getPhoneNumList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BlockItem {

    @Nullable
    private final String button;

    @Nullable
    private final String content;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String jumpParams;

    @Nullable
    private final String jumpPath;

    @Nullable
    private final String jumpType;

    @Nullable
    private final List<String> phoneNumList;

    @Nullable
    private final String title;

    public BlockItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<String> list) {
        this.title = str;
        this.content = str2;
        this.button = str3;
        this.iconUrl = str4;
        this.jumpPath = str5;
        this.jumpType = str6;
        this.jumpParams = str7;
        this.phoneNumList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockItem copy$default(BlockItem blockItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = blockItem.title;
        }
        if ((i7 & 2) != 0) {
            str2 = blockItem.content;
        }
        if ((i7 & 4) != 0) {
            str3 = blockItem.button;
        }
        if ((i7 & 8) != 0) {
            str4 = blockItem.iconUrl;
        }
        if ((i7 & 16) != 0) {
            str5 = blockItem.jumpPath;
        }
        if ((i7 & 32) != 0) {
            str6 = blockItem.jumpType;
        }
        if ((i7 & 64) != 0) {
            str7 = blockItem.jumpParams;
        }
        if ((i7 & 128) != 0) {
            list = blockItem.phoneNumList;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return blockItem.copy(str, str2, str3, str4, str9, str10, str8, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJumpPath() {
        return this.jumpPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJumpParams() {
        return this.jumpParams;
    }

    @Nullable
    public final List<String> component8() {
        return this.phoneNumList;
    }

    @NotNull
    public final BlockItem copy(@Nullable String title, @Nullable String content, @Nullable String button, @Nullable String iconUrl, @Nullable String jumpPath, @Nullable String jumpType, @Nullable String jumpParams, @Nullable List<String> phoneNumList) {
        return new BlockItem(title, content, button, iconUrl, jumpPath, jumpType, jumpParams, phoneNumList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockItem)) {
            return false;
        }
        BlockItem blockItem = (BlockItem) other;
        return Intrinsics.c(this.title, blockItem.title) && Intrinsics.c(this.content, blockItem.content) && Intrinsics.c(this.button, blockItem.button) && Intrinsics.c(this.iconUrl, blockItem.iconUrl) && Intrinsics.c(this.jumpPath, blockItem.jumpPath) && Intrinsics.c(this.jumpType, blockItem.jumpType) && Intrinsics.c(this.jumpParams, blockItem.jumpParams) && Intrinsics.c(this.phoneNumList, blockItem.phoneNumList);
    }

    @Nullable
    public final String getButton() {
        return this.button;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getJumpParams() {
        return this.jumpParams;
    }

    @Nullable
    public final String getJumpPath() {
        return this.jumpPath;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final List<String> getPhoneNumList() {
        return this.phoneNumList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.button;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpPath;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jumpType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jumpParams;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.phoneNumList;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.content;
        String str3 = this.button;
        String str4 = this.iconUrl;
        String str5 = this.jumpPath;
        String str6 = this.jumpType;
        String str7 = this.jumpParams;
        List<String> list = this.phoneNumList;
        StringBuilder sbF = F.f("BlockItem(title=", str, ", content=", str2, ", button=");
        u.x(sbF, str3, ", iconUrl=", str4, ", jumpPath=");
        u.x(sbF, str5, ", jumpType=", str6, ", jumpParams=");
        sbF.append(str7);
        sbF.append(", phoneNumList=");
        sbF.append(list);
        sbF.append(")");
        return sbF.toString();
    }
}
