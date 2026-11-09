package com.transsnet.palmpay.airtime.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpRecommendBean;", "", "<init>", "()V", "phone", "", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "tag", "getTag", "setTag", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpRecommendBean {

    @Nullable
    private String phone;

    @Nullable
    private String tag;

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }
}
