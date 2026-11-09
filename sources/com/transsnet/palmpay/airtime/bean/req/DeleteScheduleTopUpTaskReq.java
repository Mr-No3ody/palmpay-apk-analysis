package com.transsnet.palmpay.airtime.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/req/DeleteScheduleTopUpTaskReq;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "isDelete", "", "()Ljava/lang/Integer;", "setDelete", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeleteScheduleTopUpTaskReq {

    @Nullable
    private String id;

    @Nullable
    private Integer isDelete;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: isDelete, reason: from getter */
    public final Integer getIsDelete() {
        return this.isDelete;
    }

    public final void setDelete(@Nullable Integer num) {
        this.isDelete = num;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }
}
