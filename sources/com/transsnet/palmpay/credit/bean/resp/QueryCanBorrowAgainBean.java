package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainBean;", "", "borrowAgainAble", "", "availableOpenInstallmentLoan", "canBorrowAccountType", "", "canBorrowProductSubId", "loanConfig", "Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;)V", "getBorrowAgainAble", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvailableOpenInstallmentLoan", "getCanBorrowAccountType", "()Ljava/lang/Integer;", "setCanBorrowAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCanBorrowProductSubId", "getLoanConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryCanBorrowAgainBean {

    @Nullable
    private final Boolean availableOpenInstallmentLoan;

    @Nullable
    private final Boolean borrowAgainAble;

    @Nullable
    private Integer canBorrowAccountType;

    @Nullable
    private final Integer canBorrowProductSubId;

    @Nullable
    private final LoanConfig loanConfig;

    public QueryCanBorrowAgainBean(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable LoanConfig loanConfig) {
        this.borrowAgainAble = bool;
        this.availableOpenInstallmentLoan = bool2;
        this.canBorrowAccountType = num;
        this.canBorrowProductSubId = num2;
        this.loanConfig = loanConfig;
    }

    @Nullable
    public final Boolean getAvailableOpenInstallmentLoan() {
        return this.availableOpenInstallmentLoan;
    }

    @Nullable
    public final Boolean getBorrowAgainAble() {
        return this.borrowAgainAble;
    }

    @Nullable
    public final Integer getCanBorrowAccountType() {
        return this.canBorrowAccountType;
    }

    @Nullable
    public final Integer getCanBorrowProductSubId() {
        return this.canBorrowProductSubId;
    }

    @Nullable
    public final LoanConfig getLoanConfig() {
        return this.loanConfig;
    }

    public final void setCanBorrowAccountType(@Nullable Integer num) {
        this.canBorrowAccountType = num;
    }
}
