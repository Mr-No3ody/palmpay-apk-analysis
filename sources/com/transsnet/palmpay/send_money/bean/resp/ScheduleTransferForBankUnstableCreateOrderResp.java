package com.transsnet.palmpay.send_money.bean.resp;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableCreateOrderResp;", "Ljava/io/Serializable;", "<init>", "()V", "waitDesc", "", "getWaitDesc", "()Ljava/lang/String;", "setWaitDesc", "(Ljava/lang/String;)V", "bookTransferBusinessType", "", "getBookTransferBusinessType", "()Ljava/lang/Integer;", "setBookTransferBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bookTransferDetail", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "getBookTransferDetail", "()Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "setBookTransferDetail", "(Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableCreateOrderResp implements Serializable {

    @Nullable
    private Integer bookTransferBusinessType;

    @Nullable
    private ScheduleTransferForBankUnstableOrderResp bookTransferDetail;

    @Nullable
    private String waitDesc;

    @Nullable
    public final Integer getBookTransferBusinessType() {
        return this.bookTransferBusinessType;
    }

    @Nullable
    public final ScheduleTransferForBankUnstableOrderResp getBookTransferDetail() {
        return this.bookTransferDetail;
    }

    @Nullable
    public final String getWaitDesc() {
        return this.waitDesc;
    }

    public final void setBookTransferBusinessType(@Nullable Integer num) {
        this.bookTransferBusinessType = num;
    }

    public final void setBookTransferDetail(@Nullable ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp) {
        this.bookTransferDetail = scheduleTransferForBankUnstableOrderResp;
    }

    public final void setWaitDesc(@Nullable String str) {
        this.waitDesc = str;
    }
}
