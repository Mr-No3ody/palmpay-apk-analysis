package com.transsnet.palmpay.send_money.bean;

import C0.G;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J`\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u00064"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/OrderCompensateStatusBean;", "", "statusTime", "", "shortTips", "", "tips", "selected", "", "nodeStatus", "", "cornerMarkIcon", "cornerMarkTips", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;)V", "getStatusTime", "()Ljava/lang/Long;", "setStatusTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getShortTips", "()Ljava/lang/String;", "setShortTips", "(Ljava/lang/String;)V", "getTips", "setTips", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNodeStatus", "()I", "setNodeStatus", "(I)V", "getCornerMarkIcon", "setCornerMarkIcon", "getCornerMarkTips", "setCornerMarkTips", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/OrderCompensateStatusBean;", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OrderCompensateStatusBean {

    @Nullable
    private String cornerMarkIcon;

    @Nullable
    private String cornerMarkTips;
    private int nodeStatus;

    @Nullable
    private Boolean selected;

    @Nullable
    private String shortTips;

    @Nullable
    private Long statusTime;

    @Nullable
    private String tips;

    public OrderCompensateStatusBean(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, int i7, @Nullable String str3, @Nullable String str4) {
        this.statusTime = l5;
        this.shortTips = str;
        this.tips = str2;
        this.selected = bool;
        this.nodeStatus = i7;
        this.cornerMarkIcon = str3;
        this.cornerMarkTips = str4;
    }

    public static /* synthetic */ OrderCompensateStatusBean copy$default(OrderCompensateStatusBean orderCompensateStatusBean, Long l5, String str, String str2, Boolean bool, int i7, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l5 = orderCompensateStatusBean.statusTime;
        }
        if ((i10 & 2) != 0) {
            str = orderCompensateStatusBean.shortTips;
        }
        if ((i10 & 4) != 0) {
            str2 = orderCompensateStatusBean.tips;
        }
        if ((i10 & 8) != 0) {
            bool = orderCompensateStatusBean.selected;
        }
        if ((i10 & 16) != 0) {
            i7 = orderCompensateStatusBean.nodeStatus;
        }
        if ((i10 & 32) != 0) {
            str3 = orderCompensateStatusBean.cornerMarkIcon;
        }
        if ((i10 & 64) != 0) {
            str4 = orderCompensateStatusBean.cornerMarkTips;
        }
        String str5 = str3;
        String str6 = str4;
        int i11 = i7;
        String str7 = str2;
        return orderCompensateStatusBean.copy(l5, str, str7, bool, i11, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getStatusTime() {
        return this.statusTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortTips() {
        return this.shortTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNodeStatus() {
        return this.nodeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCornerMarkIcon() {
        return this.cornerMarkIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCornerMarkTips() {
        return this.cornerMarkTips;
    }

    @NotNull
    public final OrderCompensateStatusBean copy(@Nullable Long statusTime, @Nullable String shortTips, @Nullable String tips, @Nullable Boolean selected, int nodeStatus, @Nullable String cornerMarkIcon, @Nullable String cornerMarkTips) {
        return new OrderCompensateStatusBean(statusTime, shortTips, tips, selected, nodeStatus, cornerMarkIcon, cornerMarkTips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCompensateStatusBean)) {
            return false;
        }
        OrderCompensateStatusBean orderCompensateStatusBean = (OrderCompensateStatusBean) other;
        return Intrinsics.c(this.statusTime, orderCompensateStatusBean.statusTime) && Intrinsics.c(this.shortTips, orderCompensateStatusBean.shortTips) && Intrinsics.c(this.tips, orderCompensateStatusBean.tips) && Intrinsics.c(this.selected, orderCompensateStatusBean.selected) && this.nodeStatus == orderCompensateStatusBean.nodeStatus && Intrinsics.c(this.cornerMarkIcon, orderCompensateStatusBean.cornerMarkIcon) && Intrinsics.c(this.cornerMarkTips, orderCompensateStatusBean.cornerMarkTips);
    }

    @Nullable
    public final String getCornerMarkIcon() {
        return this.cornerMarkIcon;
    }

    @Nullable
    public final String getCornerMarkTips() {
        return this.cornerMarkTips;
    }

    public final int getNodeStatus() {
        return this.nodeStatus;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getShortTips() {
        return this.shortTips;
    }

    @Nullable
    public final Long getStatusTime() {
        return this.statusTime;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        Long l5 = this.statusTime;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        String str = this.shortTips;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tips;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.selected;
        int iB = u.b(this.nodeStatus, (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str3 = this.cornerMarkIcon;
        int iHashCode4 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cornerMarkTips;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCornerMarkIcon(@Nullable String str) {
        this.cornerMarkIcon = str;
    }

    public final void setCornerMarkTips(@Nullable String str) {
        this.cornerMarkTips = str;
    }

    public final void setNodeStatus(int i7) {
        this.nodeStatus = i7;
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.selected = bool;
    }

    public final void setShortTips(@Nullable String str) {
        this.shortTips = str;
    }

    public final void setStatusTime(@Nullable Long l5) {
        this.statusTime = l5;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    @NotNull
    public String toString() {
        Long l5 = this.statusTime;
        String str = this.shortTips;
        String str2 = this.tips;
        Boolean bool = this.selected;
        int i7 = this.nodeStatus;
        String str3 = this.cornerMarkIcon;
        String str4 = this.cornerMarkTips;
        StringBuilder sb2 = new StringBuilder("OrderCompensateStatusBean(statusTime=");
        sb2.append(l5);
        sb2.append(", shortTips=");
        sb2.append(str);
        sb2.append(", tips=");
        sb2.append(str2);
        sb2.append(", selected=");
        sb2.append(bool);
        sb2.append(", nodeStatus=");
        sb2.append(i7);
        sb2.append(", cornerMarkIcon=");
        sb2.append(str3);
        sb2.append(", cornerMarkTips=");
        return G.r(sb2, str4, ")");
    }
}
