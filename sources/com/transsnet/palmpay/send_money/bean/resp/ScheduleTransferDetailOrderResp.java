package com.transsnet.palmpay.send_money.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferDetailOrderResp;", "", "historyTransferList", "", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;", "lastTransfer", "nextTransfer", "<init>", "(Ljava/util/List;Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;)V", "getHistoryTransferList", "()Ljava/util/List;", "getLastTransfer", "()Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferSubOrderResp;", "getNextTransfer", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScheduleTransferDetailOrderResp {

    @Nullable
    private final List<ScheduleTransferSubOrderResp> historyTransferList;

    @Nullable
    private final ScheduleTransferSubOrderResp lastTransfer;

    @Nullable
    private final ScheduleTransferSubOrderResp nextTransfer;

    public ScheduleTransferDetailOrderResp(@Nullable List<ScheduleTransferSubOrderResp> list, @Nullable ScheduleTransferSubOrderResp scheduleTransferSubOrderResp, @Nullable ScheduleTransferSubOrderResp scheduleTransferSubOrderResp2) {
        this.historyTransferList = list;
        this.lastTransfer = scheduleTransferSubOrderResp;
        this.nextTransfer = scheduleTransferSubOrderResp2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScheduleTransferDetailOrderResp copy$default(ScheduleTransferDetailOrderResp scheduleTransferDetailOrderResp, List list, ScheduleTransferSubOrderResp scheduleTransferSubOrderResp, ScheduleTransferSubOrderResp scheduleTransferSubOrderResp2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = scheduleTransferDetailOrderResp.historyTransferList;
        }
        if ((i7 & 2) != 0) {
            scheduleTransferSubOrderResp = scheduleTransferDetailOrderResp.lastTransfer;
        }
        if ((i7 & 4) != 0) {
            scheduleTransferSubOrderResp2 = scheduleTransferDetailOrderResp.nextTransfer;
        }
        return scheduleTransferDetailOrderResp.copy(list, scheduleTransferSubOrderResp, scheduleTransferSubOrderResp2);
    }

    @Nullable
    public final List<ScheduleTransferSubOrderResp> component1() {
        return this.historyTransferList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScheduleTransferSubOrderResp getLastTransfer() {
        return this.lastTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ScheduleTransferSubOrderResp getNextTransfer() {
        return this.nextTransfer;
    }

    @NotNull
    public final ScheduleTransferDetailOrderResp copy(@Nullable List<ScheduleTransferSubOrderResp> historyTransferList, @Nullable ScheduleTransferSubOrderResp lastTransfer, @Nullable ScheduleTransferSubOrderResp nextTransfer) {
        return new ScheduleTransferDetailOrderResp(historyTransferList, lastTransfer, nextTransfer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTransferDetailOrderResp)) {
            return false;
        }
        ScheduleTransferDetailOrderResp scheduleTransferDetailOrderResp = (ScheduleTransferDetailOrderResp) other;
        return Intrinsics.c(this.historyTransferList, scheduleTransferDetailOrderResp.historyTransferList) && Intrinsics.c(this.lastTransfer, scheduleTransferDetailOrderResp.lastTransfer) && Intrinsics.c(this.nextTransfer, scheduleTransferDetailOrderResp.nextTransfer);
    }

    @Nullable
    public final List<ScheduleTransferSubOrderResp> getHistoryTransferList() {
        return this.historyTransferList;
    }

    @Nullable
    public final ScheduleTransferSubOrderResp getLastTransfer() {
        return this.lastTransfer;
    }

    @Nullable
    public final ScheduleTransferSubOrderResp getNextTransfer() {
        return this.nextTransfer;
    }

    public int hashCode() {
        List<ScheduleTransferSubOrderResp> list = this.historyTransferList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ScheduleTransferSubOrderResp scheduleTransferSubOrderResp = this.lastTransfer;
        int iHashCode2 = (iHashCode + (scheduleTransferSubOrderResp == null ? 0 : scheduleTransferSubOrderResp.hashCode())) * 31;
        ScheduleTransferSubOrderResp scheduleTransferSubOrderResp2 = this.nextTransfer;
        return iHashCode2 + (scheduleTransferSubOrderResp2 != null ? scheduleTransferSubOrderResp2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScheduleTransferDetailOrderResp(historyTransferList=" + this.historyTransferList + ", lastTransfer=" + this.lastTransfer + ", nextTransfer=" + this.nextTransfer + ")";
    }
}
