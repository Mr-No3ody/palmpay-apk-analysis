package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OrderExtendObject;", "", "largeRepaymentPlan", "", "Lcom/transsnet/palmpay/credit/bean/resp/InsSingleRepaymentPlanDetail;", "managementFee", "", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "getLargeRepaymentPlan", "()Ljava/util/List;", "getManagementFee", "()Ljava/lang/Long;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderExtendObject {

    @Nullable
    private final List<InsSingleRepaymentPlanDetail> largeRepaymentPlan;

    @Nullable
    private final Long managementFee;

    public OrderExtendObject(@Nullable List<InsSingleRepaymentPlanDetail> list, @Nullable Long l5) {
        this.largeRepaymentPlan = list;
        this.managementFee = l5;
    }

    @Nullable
    public final List<InsSingleRepaymentPlanDetail> getLargeRepaymentPlan() {
        return this.largeRepaymentPlan;
    }

    @Nullable
    public final Long getManagementFee() {
        return this.managementFee;
    }
}
