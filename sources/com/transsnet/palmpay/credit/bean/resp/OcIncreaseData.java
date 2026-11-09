package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseData;", "", "calculateType", "", "changeQuota", "", "createTime", "desc", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getCalculateType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChangeQuota", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreateTime", "getDesc", "()Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcIncreaseData {

    @Nullable
    private final Integer calculateType;

    @Nullable
    private final Long changeQuota;

    @Nullable
    private final Long createTime;

    @Nullable
    private final String desc;

    public OcIncreaseData(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable String str) {
        this.calculateType = num;
        this.changeQuota = l5;
        this.createTime = l6;
        this.desc = str;
    }

    @Nullable
    public final Integer getCalculateType() {
        return this.calculateType;
    }

    @Nullable
    public final Long getChangeQuota() {
        return this.changeQuota;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }
}
