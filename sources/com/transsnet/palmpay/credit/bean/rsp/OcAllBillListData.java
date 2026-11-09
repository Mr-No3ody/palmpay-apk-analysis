package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001BU\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OcAllBillListData;", "", "currentBillList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/AllBillDetail;", "featureBillList", "outstandingAmount", "", "overdueBillList", "unpaidPenalty", "unpaidPrincipal", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentBillList", "()Ljava/util/List;", "getFeatureBillList", "getOutstandingAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOverdueBillList", "getUnpaidPenalty", "getUnpaidPrincipal", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcAllBillListData {

    @Nullable
    private final List<AllBillDetail> currentBillList;

    @Nullable
    private final List<AllBillDetail> featureBillList;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final List<AllBillDetail> overdueBillList;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final Long unpaidPrincipal;

    public OcAllBillListData(@Nullable List<AllBillDetail> list, @Nullable List<AllBillDetail> list2, @Nullable Long l5, @Nullable List<AllBillDetail> list3, @Nullable Long l6, @Nullable Long l8) {
        this.currentBillList = list;
        this.featureBillList = list2;
        this.outstandingAmount = l5;
        this.overdueBillList = list3;
        this.unpaidPenalty = l6;
        this.unpaidPrincipal = l8;
    }

    @Nullable
    public final List<AllBillDetail> getCurrentBillList() {
        return this.currentBillList;
    }

    @Nullable
    public final List<AllBillDetail> getFeatureBillList() {
        return this.featureBillList;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final List<AllBillDetail> getOverdueBillList() {
        return this.overdueBillList;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final Long getUnpaidPrincipal() {
        return this.unpaidPrincipal;
    }
}
