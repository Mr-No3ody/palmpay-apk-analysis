package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/RaiseRecord;", "", "changeQuota", "", "calculateType", "", "desc", "", "createTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/Long;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RaiseRecord {

    @JvmField
    @Nullable
    public final Integer calculateType;

    @JvmField
    @Nullable
    public final Long changeQuota;

    @JvmField
    @Nullable
    public final Long createTime;

    @JvmField
    @Nullable
    public final String desc;

    public RaiseRecord(@Nullable Long l5, @Nullable Integer num, @Nullable String str, @Nullable Long l6) {
        this.changeQuota = l5;
        this.calculateType = num;
        this.desc = str;
        this.createTime = l6;
    }
}
