package com.transsnet.palmpay.airtime.bean.req;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/req/GroupPurchaseReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "<init>", "()V", "activityId", "", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "groupNumber", "", "getGroupNumber", "()Ljava/lang/Long;", "setGroupNumber", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "billerId", "getBillerId", "setBillerId", "billerName", "getBillerName", "setBillerName", "verifyNetwork", "", "getVerifyNetwork", "()Ljava/lang/Boolean;", "setVerifyNetwork", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupPurchaseReq implements SingleLiveData$Params {

    @Nullable
    private String activityId;

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private Long groupNumber;

    @Nullable
    private String phone;

    @Nullable
    private Boolean verifyNetwork;

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Long getGroupNumber() {
        return this.groupNumber;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Boolean getVerifyNetwork() {
        return this.verifyNetwork;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setGroupNumber(@Nullable Long l5) {
        this.groupNumber = l5;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setVerifyNetwork(@Nullable Boolean bool) {
        this.verifyNetwork = bool;
    }
}
