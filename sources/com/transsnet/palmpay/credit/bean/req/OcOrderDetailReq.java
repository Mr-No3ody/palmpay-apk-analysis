package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcOrderDetailReq;", "", "payId", "", "cardNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPayId", "()Ljava/lang/String;", "getCardNo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOrderDetailReq {

    @Nullable
    private final String cardNo;

    @Nullable
    private final String payId;

    public OcOrderDetailReq(@Nullable String str, @Nullable String str2) {
        this.payId = str;
        this.cardNo = str2;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }
}
