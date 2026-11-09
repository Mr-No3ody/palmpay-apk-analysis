package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryWithDrawData;", "", "calcManagementFee", "Lcom/transsnet/palmpay/credit/bean/resp/CalcManagementFee;", "canCredit", "Lcom/transsnet/palmpay/credit/bean/resp/CanCredit;", "loanPreCheck", "Lcom/transsnet/palmpay/credit/bean/resp/LoanPreCheck;", "firstLoan", "Lcom/transsnet/palmpay/credit/bean/resp/FirstLoan;", "moveCashApp", "Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CalcManagementFee;Lcom/transsnet/palmpay/credit/bean/resp/CanCredit;Lcom/transsnet/palmpay/credit/bean/resp/LoanPreCheck;Lcom/transsnet/palmpay/credit/bean/resp/FirstLoan;Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;)V", "getCalcManagementFee", "()Lcom/transsnet/palmpay/credit/bean/resp/CalcManagementFee;", "getCanCredit", "()Lcom/transsnet/palmpay/credit/bean/resp/CanCredit;", "getLoanPreCheck", "()Lcom/transsnet/palmpay/credit/bean/resp/LoanPreCheck;", "getFirstLoan", "()Lcom/transsnet/palmpay/credit/bean/resp/FirstLoan;", "getMoveCashApp", "()Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryWithDrawData {

    @Nullable
    private final CalcManagementFee calcManagementFee;

    @Nullable
    private final CanCredit canCredit;

    @Nullable
    private final FirstLoan firstLoan;

    @Nullable
    private final LoanPreCheck loanPreCheck;

    @Nullable
    private final MoveCashAppResp moveCashApp;

    public QueryWithDrawData(@Nullable CalcManagementFee calcManagementFee, @Nullable CanCredit canCredit, @Nullable LoanPreCheck loanPreCheck, @Nullable FirstLoan firstLoan, @Nullable MoveCashAppResp moveCashAppResp) {
        this.calcManagementFee = calcManagementFee;
        this.canCredit = canCredit;
        this.loanPreCheck = loanPreCheck;
        this.firstLoan = firstLoan;
        this.moveCashApp = moveCashAppResp;
    }

    @Nullable
    public final CalcManagementFee getCalcManagementFee() {
        return this.calcManagementFee;
    }

    @Nullable
    public final CanCredit getCanCredit() {
        return this.canCredit;
    }

    @Nullable
    public final FirstLoan getFirstLoan() {
        return this.firstLoan;
    }

    @Nullable
    public final LoanPreCheck getLoanPreCheck() {
        return this.loanPreCheck;
    }

    @Nullable
    public final MoveCashAppResp getMoveCashApp() {
        return this.moveCashApp;
    }
}
