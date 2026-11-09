package com.transsnet.palmpay.send_money.bean.resp;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/RecentlyScheduleTransferBean;", "", "title", "", FirebaseAnalytics.Param.CONTENT, "jumpUrl", "taskNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getContent", "setContent", "getJumpUrl", "setJumpUrl", "getTaskNo", "setTaskNo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecentlyScheduleTransferBean {

    @Nullable
    private String content;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String taskNo;

    @Nullable
    private String title;

    public RecentlyScheduleTransferBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RecentlyScheduleTransferBean copy$default(RecentlyScheduleTransferBean recentlyScheduleTransferBean, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = recentlyScheduleTransferBean.title;
        }
        if ((i7 & 2) != 0) {
            str2 = recentlyScheduleTransferBean.content;
        }
        if ((i7 & 4) != 0) {
            str3 = recentlyScheduleTransferBean.jumpUrl;
        }
        if ((i7 & 8) != 0) {
            str4 = recentlyScheduleTransferBean.taskNo;
        }
        return recentlyScheduleTransferBean.copy(str, str2, str3, str4);
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
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaskNo() {
        return this.taskNo;
    }

    @NotNull
    public final RecentlyScheduleTransferBean copy(@Nullable String title, @Nullable String content, @Nullable String jumpUrl, @Nullable String taskNo) {
        return new RecentlyScheduleTransferBean(title, content, jumpUrl, taskNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentlyScheduleTransferBean)) {
            return false;
        }
        RecentlyScheduleTransferBean recentlyScheduleTransferBean = (RecentlyScheduleTransferBean) other;
        return Intrinsics.c(this.title, recentlyScheduleTransferBean.title) && Intrinsics.c(this.content, recentlyScheduleTransferBean.content) && Intrinsics.c(this.jumpUrl, recentlyScheduleTransferBean.jumpUrl) && Intrinsics.c(this.taskNo, recentlyScheduleTransferBean.taskNo);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getTaskNo() {
        return this.taskNo;
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
        String str3 = this.jumpUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taskNo;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setTaskNo(@Nullable String str) {
        this.taskNo = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.content;
        return G.s(F.f("RecentlyScheduleTransferBean(title=", str, ", content=", str2, ", jumpUrl="), this.jumpUrl, ", taskNo=", this.taskNo, ")");
    }

    public RecentlyScheduleTransferBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.title = str;
        this.content = str2;
        this.jumpUrl = str3;
        this.taskNo = str4;
    }

    public /* synthetic */ RecentlyScheduleTransferBean(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }
}
