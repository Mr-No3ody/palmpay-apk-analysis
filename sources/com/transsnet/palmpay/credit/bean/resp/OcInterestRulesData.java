package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcInterestRulesData;", "", "calculateMethod", "", "intervalRule", "", "Lcom/transsnet/palmpay/credit/bean/resp/IntervalRule;", "maxRatio", "", "penaltyBeginDays", "penaltyEndDays", "penaltyRatio", "penaltyRuleNo", "", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "getCalculateMethod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIntervalRule", "()Ljava/util/List;", "getMaxRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPenaltyBeginDays", "getPenaltyEndDays", "getPenaltyRatio", "getPenaltyRuleNo", "()Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInterestRulesData {

    @Nullable
    private final Integer calculateMethod;

    @Nullable
    private final List<IntervalRule> intervalRule;

    @Nullable
    private final Double maxRatio;

    @Nullable
    private final Integer penaltyBeginDays;

    @Nullable
    private final Integer penaltyEndDays;

    @Nullable
    private final Double penaltyRatio;

    @Nullable
    private final String penaltyRuleNo;

    public OcInterestRulesData(@Nullable Integer num, @Nullable List<IntervalRule> list, @Nullable Double d2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d10, @Nullable String str) {
        this.calculateMethod = num;
        this.intervalRule = list;
        this.maxRatio = d2;
        this.penaltyBeginDays = num2;
        this.penaltyEndDays = num3;
        this.penaltyRatio = d10;
        this.penaltyRuleNo = str;
    }

    @Nullable
    public final Integer getCalculateMethod() {
        return this.calculateMethod;
    }

    @Nullable
    public final List<IntervalRule> getIntervalRule() {
        return this.intervalRule;
    }

    @Nullable
    public final Double getMaxRatio() {
        return this.maxRatio;
    }

    @Nullable
    public final Integer getPenaltyBeginDays() {
        return this.penaltyBeginDays;
    }

    @Nullable
    public final Integer getPenaltyEndDays() {
        return this.penaltyEndDays;
    }

    @Nullable
    public final Double getPenaltyRatio() {
        return this.penaltyRatio;
    }

    @Nullable
    public final String getPenaltyRuleNo() {
        return this.penaltyRuleNo;
    }
}
