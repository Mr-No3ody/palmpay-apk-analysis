package com.transsnet.palmpay.airtime.bean;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/ScheduleTopUpFAQResp;", "", "<init>", "()V", "faqVOS", "", "Lcom/transsnet/palmpay/airtime/bean/ScheduleTopUpFAQBean;", "getFaqVOS", "()Ljava/util/List;", "setFaqVOS", "(Ljava/util/List;)V", "faqUrl", "", "getFaqUrl", "()Ljava/lang/String;", "setFaqUrl", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpFAQResp {

    @Nullable
    private String faqUrl;

    @Nullable
    private List<ScheduleTopUpFAQBean> faqVOS;

    @Nullable
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @Nullable
    public final List<ScheduleTopUpFAQBean> getFaqVOS() {
        return this.faqVOS;
    }

    public final void setFaqUrl(@Nullable String str) {
        this.faqUrl = str;
    }

    public final void setFaqVOS(@Nullable List<ScheduleTopUpFAQBean> list) {
        this.faqVOS = list;
    }
}
