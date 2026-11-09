package com.transsnet.palmpay.send_money.bean.req;

import com.transsnet.palmpay.core.bean.req.CommonListReq;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/ToPalmPayBeneficiaryReq;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "<init>", "()V", "sourceType", "", "getSourceType", "()Ljava/lang/Integer;", "setSourceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sortByName", "", "getSortByName", "()Ljava/lang/Boolean;", "setSortByName", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ToPalmPayBeneficiaryReq extends CommonListReq {

    @Nullable
    private Boolean sortByName = Boolean.TRUE;

    @Nullable
    private Integer sourceType;

    @Nullable
    public final Boolean getSortByName() {
        return this.sortByName;
    }

    @Nullable
    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final void setSortByName(@Nullable Boolean bool) {
        this.sortByName = bool;
    }

    public final void setSourceType(@Nullable Integer num) {
        this.sourceType = num;
    }
}
