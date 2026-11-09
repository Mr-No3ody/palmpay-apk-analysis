package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/CheckCreateOrderResp;", "", "repeatedTransfer", "", "<init>", "(Ljava/lang/Boolean;)V", "getRepeatedTransfer", "()Ljava/lang/Boolean;", "setRepeatedTransfer", "Ljava/lang/Boolean;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckCreateOrderResp {

    @Nullable
    private Boolean repeatedTransfer;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckCreateOrderResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Boolean getRepeatedTransfer() {
        return this.repeatedTransfer;
    }

    public final void setRepeatedTransfer(@Nullable Boolean bool) {
        this.repeatedTransfer = bool;
    }

    public CheckCreateOrderResp(@Nullable Boolean bool) {
        this.repeatedTransfer = bool;
    }

    public /* synthetic */ CheckCreateOrderResp(Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bool);
    }
}
