package com.transsnet.palmpay.send_money.bean.req;

import com.transsnet.palmpay.core.bean.req.CommonListReq;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/TransferToBankHomeRecipientsReq;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "<init>", "()V", "sortByName", "", "getSortByName", "()Ljava/lang/Boolean;", "setSortByName", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferToBankHomeRecipientsReq extends CommonListReq {

    @Nullable
    private Boolean sortByName = Boolean.TRUE;

    @Nullable
    public final Boolean getSortByName() {
        return this.sortByName;
    }

    public final void setSortByName(@Nullable Boolean bool) {
        this.sortByName = bool;
    }
}
