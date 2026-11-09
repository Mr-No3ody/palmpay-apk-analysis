package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CurrentRepaymentDetail;", "", "repaymentDate", "", "cashRepaymentInfo", "Lcom/transsnet/palmpay/credit/bean/resp/CashRepaymentInfo;", "currentCleared", "", "<init>", "(Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/CashRepaymentInfo;Ljava/lang/Boolean;)V", "getRepaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCashRepaymentInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/CashRepaymentInfo;", "getCurrentCleared", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CurrentRepaymentDetail {

    @Nullable
    private final CashRepaymentInfo cashRepaymentInfo;

    @Nullable
    private final Boolean currentCleared;

    @Nullable
    private final Long repaymentDate;

    public CurrentRepaymentDetail(@Nullable Long l5, @Nullable CashRepaymentInfo cashRepaymentInfo, @Nullable Boolean bool) {
        this.repaymentDate = l5;
        this.cashRepaymentInfo = cashRepaymentInfo;
        this.currentCleared = bool;
    }

    @Nullable
    public final CashRepaymentInfo getCashRepaymentInfo() {
        return this.cashRepaymentInfo;
    }

    @Nullable
    public final Boolean getCurrentCleared() {
        return this.currentCleared;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }
}
