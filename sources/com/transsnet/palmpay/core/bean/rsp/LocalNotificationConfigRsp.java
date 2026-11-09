package com.transsnet.palmpay.core.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigRsp;", "", "timeInterval", "", "preNumDay", "startHour", "endHour", "pushDTOList", "", "Lcom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigItem;", "<init>", "(JJJJLjava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalNotificationConfigRsp {

    @JvmField
    public final long endHour;

    @JvmField
    public final long preNumDay;

    @JvmField
    @Nullable
    public final List<LocalNotificationConfigItem> pushDTOList;

    @JvmField
    public final long startHour;

    @JvmField
    public final long timeInterval;

    public LocalNotificationConfigRsp(long j6, long j10, long j11, long j12, @Nullable List<LocalNotificationConfigItem> list) {
        this.timeInterval = j6;
        this.preNumDay = j10;
        this.startHour = j11;
        this.endHour = j12;
        this.pushDTOList = list;
    }
}
