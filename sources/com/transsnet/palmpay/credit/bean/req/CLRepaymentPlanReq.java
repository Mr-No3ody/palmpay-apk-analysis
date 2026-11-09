package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanReq;", "", "loanAmount", "", "repaymentDay", "ifUseBorrowAllDiscount", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDay", "getIfUseBorrowAllDiscount", "()Z", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentPlanReq {
    private final boolean ifUseBorrowAllDiscount;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Long repaymentDay;

    public CLRepaymentPlanReq(@Nullable Long l5, @Nullable Long l6, boolean z3) {
        this.loanAmount = l5;
        this.repaymentDay = l6;
        this.ifUseBorrowAllDiscount = z3;
    }

    public final boolean getIfUseBorrowAllDiscount() {
        return this.ifUseBorrowAllDiscount;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Long getRepaymentDay() {
        return this.repaymentDay;
    }

    public /* synthetic */ CLRepaymentPlanReq(Long l5, Long l6, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, l6, (i7 & 4) != 0 ? false : z3);
    }
}
