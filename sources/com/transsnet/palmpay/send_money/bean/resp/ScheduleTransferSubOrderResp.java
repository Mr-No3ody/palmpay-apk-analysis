package com.transsnet.palmpay.send_money.bean.resp;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;", "", "taskNo", "", "orderNo", "businessAmount", "", "executeStatus", "", "gmtModified", "transferStatusIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getTaskNo", "()Ljava/lang/String;", "getOrderNo", "getBusinessAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExecuteStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGmtModified", "getTransferStatusIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;", "equals", "", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScheduleTransferSubOrderResp {

    @Nullable
    private final Long businessAmount;

    @Nullable
    private final Integer executeStatus;

    @Nullable
    private final Long gmtModified;

    @Nullable
    private final String orderNo;

    @Nullable
    private final String taskNo;

    @Nullable
    private final String transferStatusIcon;

    public ScheduleTransferSubOrderResp(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Integer num, @Nullable Long l6, @Nullable String str3) {
        this.taskNo = str;
        this.orderNo = str2;
        this.businessAmount = l5;
        this.executeStatus = num;
        this.gmtModified = l6;
        this.transferStatusIcon = str3;
    }

    public static /* synthetic */ ScheduleTransferSubOrderResp copy$default(ScheduleTransferSubOrderResp scheduleTransferSubOrderResp, String str, String str2, Long l5, Integer num, Long l6, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = scheduleTransferSubOrderResp.taskNo;
        }
        if ((i7 & 2) != 0) {
            str2 = scheduleTransferSubOrderResp.orderNo;
        }
        if ((i7 & 4) != 0) {
            l5 = scheduleTransferSubOrderResp.businessAmount;
        }
        if ((i7 & 8) != 0) {
            num = scheduleTransferSubOrderResp.executeStatus;
        }
        if ((i7 & 16) != 0) {
            l6 = scheduleTransferSubOrderResp.gmtModified;
        }
        if ((i7 & 32) != 0) {
            str3 = scheduleTransferSubOrderResp.transferStatusIcon;
        }
        Long l8 = l6;
        String str4 = str3;
        return scheduleTransferSubOrderResp.copy(str, str2, l5, num, l8, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getExecuteStatus() {
        return this.executeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getGmtModified() {
        return this.gmtModified;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransferStatusIcon() {
        return this.transferStatusIcon;
    }

    @NotNull
    public final ScheduleTransferSubOrderResp copy(@Nullable String taskNo, @Nullable String orderNo, @Nullable Long businessAmount, @Nullable Integer executeStatus, @Nullable Long gmtModified, @Nullable String transferStatusIcon) {
        return new ScheduleTransferSubOrderResp(taskNo, orderNo, businessAmount, executeStatus, gmtModified, transferStatusIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTransferSubOrderResp)) {
            return false;
        }
        ScheduleTransferSubOrderResp scheduleTransferSubOrderResp = (ScheduleTransferSubOrderResp) other;
        return Intrinsics.c(this.taskNo, scheduleTransferSubOrderResp.taskNo) && Intrinsics.c(this.orderNo, scheduleTransferSubOrderResp.orderNo) && Intrinsics.c(this.businessAmount, scheduleTransferSubOrderResp.businessAmount) && Intrinsics.c(this.executeStatus, scheduleTransferSubOrderResp.executeStatus) && Intrinsics.c(this.gmtModified, scheduleTransferSubOrderResp.gmtModified) && Intrinsics.c(this.transferStatusIcon, scheduleTransferSubOrderResp.transferStatusIcon);
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final Integer getExecuteStatus() {
        return this.executeStatus;
    }

    @Nullable
    public final Long getGmtModified() {
        return this.gmtModified;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    public final String getTransferStatusIcon() {
        return this.transferStatusIcon;
    }

    public int hashCode() {
        String str = this.taskNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.businessAmount;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.executeStatus;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l6 = this.gmtModified;
        int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str3 = this.transferStatusIcon;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.taskNo;
        String str2 = this.orderNo;
        Long l5 = this.businessAmount;
        Integer num = this.executeStatus;
        Long l6 = this.gmtModified;
        String str3 = this.transferStatusIcon;
        StringBuilder sbF = F.f("ScheduleTransferSubOrderResp(taskNo=", str, ", orderNo=", str2, ", businessAmount=");
        sbF.append(l5);
        sbF.append(", executeStatus=");
        sbF.append(num);
        sbF.append(", gmtModified=");
        sbF.append(l6);
        sbF.append(", transferStatusIcon=");
        sbF.append(str3);
        sbF.append(")");
        return sbF.toString();
    }
}
