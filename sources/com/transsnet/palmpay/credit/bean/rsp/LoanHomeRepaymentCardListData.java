package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentCardListData;", "", "repaymentList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/LoanHomeRepaymentAccount;", "<init>", "(Ljava/util/List;)V", "getRepaymentList", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeRepaymentCardListData {

    @Nullable
    private final List<LoanHomeRepaymentAccount> repaymentList;

    public LoanHomeRepaymentCardListData(@Nullable List<LoanHomeRepaymentAccount> list) {
        this.repaymentList = list;
    }

    @Nullable
    public final List<LoanHomeRepaymentAccount> getRepaymentList() {
        return this.repaymentList;
    }
}
