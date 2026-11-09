package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.bean.OutstandingContentInfoV2;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CanCredit;", "", "can", "", "msg", "", "outstandingContentInfo", "Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;)V", "getCan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMsg", "()Ljava/lang/String;", "getOutstandingContentInfo", "()Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CanCredit {

    @Nullable
    private final Boolean can;

    @Nullable
    private final String msg;

    @Nullable
    private final OutstandingContentInfoV2 outstandingContentInfo;

    public CanCredit(@Nullable Boolean bool, @Nullable String str, @Nullable OutstandingContentInfoV2 outstandingContentInfoV2) {
        this.can = bool;
        this.msg = str;
        this.outstandingContentInfo = outstandingContentInfoV2;
    }

    @Nullable
    public final Boolean getCan() {
        return this.can;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final OutstandingContentInfoV2 getOutstandingContentInfo() {
        return this.outstandingContentInfo;
    }
}
