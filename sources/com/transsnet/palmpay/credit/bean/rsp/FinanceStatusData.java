package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/FinanceStatusData;", "", "okCardAccount", "Lcom/transsnet/palmpay/credit/bean/rsp/OkCardMainPageRspData;", "cashLoanAccount", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "installmentLoanAccount", "<init>", "(Lcom/transsnet/palmpay/credit/bean/rsp/OkCardMainPageRspData;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;)V", "getOkCardAccount", "()Lcom/transsnet/palmpay/credit/bean/rsp/OkCardMainPageRspData;", "getCashLoanAccount", "()Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "getInstallmentLoanAccount", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinanceStatusData {

    @Nullable
    private final CLMainCreditCard cashLoanAccount;

    @Nullable
    private final CLMainCreditCard installmentLoanAccount;

    @Nullable
    private final OkCardMainPageRspData okCardAccount;

    public FinanceStatusData(@Nullable OkCardMainPageRspData okCardMainPageRspData, @Nullable CLMainCreditCard cLMainCreditCard, @Nullable CLMainCreditCard cLMainCreditCard2) {
        this.okCardAccount = okCardMainPageRspData;
        this.cashLoanAccount = cLMainCreditCard;
        this.installmentLoanAccount = cLMainCreditCard2;
    }

    @Nullable
    public final CLMainCreditCard getCashLoanAccount() {
        return this.cashLoanAccount;
    }

    @Nullable
    public final CLMainCreditCard getInstallmentLoanAccount() {
        return this.installmentLoanAccount;
    }

    @Nullable
    public final OkCardMainPageRspData getOkCardAccount() {
        return this.okCardAccount;
    }
}
