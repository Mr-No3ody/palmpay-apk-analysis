package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcClOverdueBillData;", "", "overdueListCashLoan", "", "Lcom/transsnet/palmpay/credit/bean/resp/OverdueCashLoanDetail;", "overdueListOkCard", "Lcom/transsnet/palmpay/credit/bean/resp/OverdueOkCardDetail;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getOverdueListCashLoan", "()Ljava/util/List;", "getOverdueListOkCard", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcClOverdueBillData {

    @Nullable
    private final List<OverdueCashLoanDetail> overdueListCashLoan;

    @Nullable
    private final List<OverdueOkCardDetail> overdueListOkCard;

    public OcClOverdueBillData(@Nullable List<OverdueCashLoanDetail> list, @Nullable List<OverdueOkCardDetail> list2) {
        this.overdueListCashLoan = list;
        this.overdueListOkCard = list2;
    }

    @Nullable
    public final List<OverdueCashLoanDetail> getOverdueListCashLoan() {
        return this.overdueListCashLoan;
    }

    @Nullable
    public final List<OverdueOkCardDetail> getOverdueListOkCard() {
        return this.overdueListOkCard;
    }
}
