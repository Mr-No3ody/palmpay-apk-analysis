package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/IntervalRule;", "", "maxAmount", "", "minAmount", "penaltyAmount", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getMaxAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMinAmount", "getPenaltyAmount", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntervalRule {

    @Nullable
    private final Long maxAmount;

    @Nullable
    private final Long minAmount;

    @Nullable
    private final Long penaltyAmount;

    public IntervalRule(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8) {
        this.maxAmount = l5;
        this.minAmount = l6;
        this.penaltyAmount = l8;
    }

    @Nullable
    public final Long getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final Long getPenaltyAmount() {
        return this.penaltyAmount;
    }
}
