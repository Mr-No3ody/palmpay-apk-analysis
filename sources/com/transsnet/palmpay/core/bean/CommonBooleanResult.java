package com.transsnet.palmpay.core.bean;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/bean/CommonBooleanResult;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "<init>", "(Z)V", "getData", "()Z", "setData", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonBooleanResult extends CommonResult {
    private boolean data;

    public CommonBooleanResult(boolean z3) {
        this.data = z3;
    }

    public final boolean getData() {
        return this.data;
    }

    public final void setData(boolean z3) {
        this.data = z3;
    }
}
