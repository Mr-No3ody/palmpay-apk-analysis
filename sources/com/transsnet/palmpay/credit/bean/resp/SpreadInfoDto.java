package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/SpreadInfoDto;", "", "id", "", "miniRepayAmount", "", "spreadPrincipal", "spreadRepaymentPlanList", "", "Lcom/transsnet/palmpay/credit/bean/resp/SpreadRepaymentPlan;", "spreadServiceFee", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMiniRepayAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSpreadPrincipal", "getSpreadRepaymentPlanList", "()Ljava/util/List;", "getSpreadServiceFee", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpreadInfoDto {

    @Nullable
    private final Integer id;

    @Nullable
    private final Long miniRepayAmount;

    @Nullable
    private final Long spreadPrincipal;

    @Nullable
    private final List<SpreadRepaymentPlan> spreadRepaymentPlanList;

    @Nullable
    private final Long spreadServiceFee;

    public SpreadInfoDto(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable List<SpreadRepaymentPlan> list, @Nullable Long l8) {
        this.id = num;
        this.miniRepayAmount = l5;
        this.spreadPrincipal = l6;
        this.spreadRepaymentPlanList = list;
        this.spreadServiceFee = l8;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Long getMiniRepayAmount() {
        return this.miniRepayAmount;
    }

    @Nullable
    public final Long getSpreadPrincipal() {
        return this.spreadPrincipal;
    }

    @Nullable
    public final List<SpreadRepaymentPlan> getSpreadRepaymentPlanList() {
        return this.spreadRepaymentPlanList;
    }

    @Nullable
    public final Long getSpreadServiceFee() {
        return this.spreadServiceFee;
    }
}
