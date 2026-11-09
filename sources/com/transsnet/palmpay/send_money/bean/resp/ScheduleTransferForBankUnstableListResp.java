package com.transsnet.palmpay.send_money.bean.resp;

import com.transsnet.palmpay.core.bean.CommonListResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableListResp;", "", "<init>", "()V", "activeBookingHistoryDTO", "Lcom/transsnet/palmpay/core/bean/CommonListResult$CommonList;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "getActiveBookingHistoryDTO", "()Lcom/transsnet/palmpay/core/bean/CommonListResult$CommonList;", "setActiveBookingHistoryDTO", "(Lcom/transsnet/palmpay/core/bean/CommonListResult$CommonList;)V", "completedBookingHistory", "getCompletedBookingHistory", "setCompletedBookingHistory", "isBookStatus", "", "()Ljava/lang/Integer;", "setBookStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "currentTime", "", "getCurrentTime", "()Ljava/lang/Long;", "setCurrentTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "Companion", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableListResp {
    public static final int BOOK_STATUS_HAS_COMPLETED = 1;
    public static final int BOOK_STATUS_NONE_COMPLETED = 0;

    @Nullable
    private CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> activeBookingHistoryDTO;

    @Nullable
    private CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> completedBookingHistory;

    @Nullable
    private Long currentTime;

    @Nullable
    private Integer isBookStatus;

    @Nullable
    public final CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> getActiveBookingHistoryDTO() {
        return this.activeBookingHistoryDTO;
    }

    @Nullable
    public final CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> getCompletedBookingHistory() {
        return this.completedBookingHistory;
    }

    @Nullable
    public final Long getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    /* JADX INFO: renamed from: isBookStatus, reason: from getter */
    public final Integer getIsBookStatus() {
        return this.isBookStatus;
    }

    public final void setActiveBookingHistoryDTO(@Nullable CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> commonList) {
        this.activeBookingHistoryDTO = commonList;
    }

    public final void setBookStatus(@Nullable Integer num) {
        this.isBookStatus = num;
    }

    public final void setCompletedBookingHistory(@Nullable CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> commonList) {
        this.completedBookingHistory = commonList;
    }

    public final void setCurrentTime(@Nullable Long l5) {
        this.currentTime = l5;
    }
}
