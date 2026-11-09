package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpRecommendResp;", "", "<init>", "()V", "phones", "", "Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpRecommendBean;", "getPhones", "()Ljava/util/List;", "setPhones", "(Ljava/util/List;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpRecommendResp {

    @Nullable
    private List<ScheduleTopUpRecommendBean> phones;

    @Nullable
    public final List<ScheduleTopUpRecommendBean> getPhones() {
        return this.phones;
    }

    public final void setPhones(@Nullable List<ScheduleTopUpRecommendBean> list) {
        this.phones = list;
    }
}
