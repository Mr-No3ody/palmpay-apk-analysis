package com.transsnet.palmpay.send_money.bean.req;

import com.transsnet.palmpay.core.bean.req.CommonListReq;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableListReq;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "<init>", "()V", "completedYear", "", "getCompletedYear", "()Ljava/lang/Integer;", "setCompletedYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "completedMonth", "getCompletedMonth", "setCompletedMonth", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableListReq extends CommonListReq {

    @Nullable
    private Integer completedYear = 0;

    @Nullable
    private Integer completedMonth = 0;

    @Nullable
    public final Integer getCompletedMonth() {
        return this.completedMonth;
    }

    @Nullable
    public final Integer getCompletedYear() {
        return this.completedYear;
    }

    public final void setCompletedMonth(@Nullable Integer num) {
        this.completedMonth = num;
    }

    public final void setCompletedYear(@Nullable Integer num) {
        this.completedYear = num;
    }
}
