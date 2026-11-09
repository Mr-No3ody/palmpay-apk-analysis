package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanV4Data;", "", "accountType", "", "repayPlanAndCouponList", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanV4Group;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepayPlanAndCouponList", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentPlanV4Data {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final List<CLRepaymentPlanV4Group> repayPlanAndCouponList;

    public CLRepaymentPlanV4Data(@Nullable Integer num, @Nullable List<CLRepaymentPlanV4Group> list) {
        this.accountType = num;
        this.repayPlanAndCouponList = list;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final List<CLRepaymentPlanV4Group> getRepayPlanAndCouponList() {
        return this.repayPlanAndCouponList;
    }
}
