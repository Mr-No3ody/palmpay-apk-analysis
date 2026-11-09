package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAmountItemRsp;", "", "<init>", "()V", "week", "", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAmountItemBean;", "getWeek", "()Ljava/util/List;", "setWeek", "(Ljava/util/List;)V", "month", "getMonth", "setMonth", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpAmountItemRsp {

    @Nullable
    private List<ScheduleTopUpAmountItemBean> month;

    @Nullable
    private List<ScheduleTopUpAmountItemBean> week;

    @Nullable
    public final List<ScheduleTopUpAmountItemBean> getMonth() {
        return this.month;
    }

    @Nullable
    public final List<ScheduleTopUpAmountItemBean> getWeek() {
        return this.week;
    }

    public final void setMonth(@Nullable List<ScheduleTopUpAmountItemBean> list) {
        this.month = list;
    }

    public final void setWeek(@Nullable List<ScheduleTopUpAmountItemBean> list) {
        this.week = list;
    }
}
