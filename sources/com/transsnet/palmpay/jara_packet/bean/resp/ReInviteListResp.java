package com.transsnet.palmpay.jara_packet.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReInviteListResp;", "", "headerImg", "", "list", "", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReInviteRecordItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeaderImg", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReInviteListResp {

    @Nullable
    private final String headerImg;

    @Nullable
    private final List<ReInviteRecordItem> list;

    /* JADX WARN: Multi-variable type inference failed */
    public ReInviteListResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReInviteListResp copy$default(ReInviteListResp reInviteListResp, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = reInviteListResp.headerImg;
        }
        if ((i7 & 2) != 0) {
            list = reInviteListResp.list;
        }
        return reInviteListResp.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderImg() {
        return this.headerImg;
    }

    @Nullable
    public final List<ReInviteRecordItem> component2() {
        return this.list;
    }

    @NotNull
    public final ReInviteListResp copy(@Nullable String headerImg, @Nullable List<ReInviteRecordItem> list) {
        return new ReInviteListResp(headerImg, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReInviteListResp)) {
            return false;
        }
        ReInviteListResp reInviteListResp = (ReInviteListResp) other;
        return Intrinsics.c(this.headerImg, reInviteListResp.headerImg) && Intrinsics.c(this.list, reInviteListResp.list);
    }

    @Nullable
    public final String getHeaderImg() {
        return this.headerImg;
    }

    @Nullable
    public final List<ReInviteRecordItem> getList() {
        return this.list;
    }

    public int hashCode() {
        String str = this.headerImg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReInviteRecordItem> list = this.list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReInviteListResp(headerImg=" + this.headerImg + ", list=" + this.list + ")";
    }

    public ReInviteListResp(@Nullable String str, @Nullable List<ReInviteRecordItem> list) {
        this.headerImg = str;
        this.list = list;
    }

    public /* synthetic */ ReInviteListResp(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }
}
