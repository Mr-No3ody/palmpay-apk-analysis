package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneTaskRewardsRecord;", "", "memberId", "", "taskName", "itemType", "", "gmtModified", "", "prizeStatus", "itemName", "nominalValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneTaskRewardsRecord {

    @JvmField
    @Nullable
    public final Long gmtModified;

    @JvmField
    @Nullable
    public final String itemName;

    @JvmField
    @Nullable
    public final Integer itemType;

    @JvmField
    @Nullable
    public final String memberId;

    @JvmField
    @Nullable
    public final Long nominalValue;

    @JvmField
    @Nullable
    public final Integer prizeStatus;

    @JvmField
    @Nullable
    public final String taskName;

    public PalmZoneTaskRewardsRecord(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Long l5, @Nullable Integer num2, @Nullable String str3, @Nullable Long l6) {
        this.memberId = str;
        this.taskName = str2;
        this.itemType = num;
        this.gmtModified = l5;
        this.prizeStatus = num2;
        this.itemName = str3;
        this.nominalValue = l6;
    }
}
