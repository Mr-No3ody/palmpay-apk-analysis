package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferBankChannelInfoResp;", "", "<init>", "()V", "channelStatus", "", "getChannelStatus", "()Ljava/lang/Integer;", "setChannelStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bookTransferDetail", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "getBookTransferDetail", "()Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "setBookTransferDetail", "(Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;)V", "csLevyFeeGuide", "Lcom/transsnet/palmpay/send_money/bean/resp/CreateTransferOrderBeforeResp;", "getCsLevyFeeGuide", "()Lcom/transsnet/palmpay/send_money/bean/resp/CreateTransferOrderBeforeResp;", "setCsLevyFeeGuide", "(Lcom/transsnet/palmpay/send_money/bean/resp/CreateTransferOrderBeforeResp;)V", "Companion", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferBankChannelInfoResp {
    public static final int BANK_ONGOING_SCHEDULE_ORDER = 3;
    public static final int BANK_STABLE = 1;
    public static final int BANK_UNSTABLE = 2;

    @Nullable
    private ScheduleTransferForBankUnstableOrderResp bookTransferDetail;

    @Nullable
    private Integer channelStatus = 1;

    @Nullable
    private CreateTransferOrderBeforeResp csLevyFeeGuide;

    @Nullable
    public final ScheduleTransferForBankUnstableOrderResp getBookTransferDetail() {
        return this.bookTransferDetail;
    }

    @Nullable
    public final Integer getChannelStatus() {
        return this.channelStatus;
    }

    @Nullable
    public final CreateTransferOrderBeforeResp getCsLevyFeeGuide() {
        return this.csLevyFeeGuide;
    }

    public final void setBookTransferDetail(@Nullable ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp) {
        this.bookTransferDetail = scheduleTransferForBankUnstableOrderResp;
    }

    public final void setChannelStatus(@Nullable Integer num) {
        this.channelStatus = num;
    }

    public final void setCsLevyFeeGuide(@Nullable CreateTransferOrderBeforeResp createTransferOrderBeforeResp) {
        this.csLevyFeeGuide = createTransferOrderBeforeResp;
    }
}
