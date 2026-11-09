package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryInstallmentWithdrawData;", "", "signedProtocolRes", "Lcom/transsnet/palmpay/credit/bean/resp/SignedProtocolRes;", "moveCashApp", "Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/SignedProtocolRes;Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;)V", "getSignedProtocolRes", "()Lcom/transsnet/palmpay/credit/bean/resp/SignedProtocolRes;", "getMoveCashApp", "()Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryInstallmentWithdrawData {

    @Nullable
    private final MoveCashAppResp moveCashApp;

    @Nullable
    private final SignedProtocolRes signedProtocolRes;

    public QueryInstallmentWithdrawData(@Nullable SignedProtocolRes signedProtocolRes, @Nullable MoveCashAppResp moveCashAppResp) {
        this.signedProtocolRes = signedProtocolRes;
        this.moveCashApp = moveCashAppResp;
    }

    @Nullable
    public final MoveCashAppResp getMoveCashApp() {
        return this.moveCashApp;
    }

    @Nullable
    public final SignedProtocolRes getSignedProtocolRes() {
        return this.signedProtocolRes;
    }
}
