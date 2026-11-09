package com.transsnet.palmpay.credit.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLMainConfig;", "", "creditLimit", "", "termSpan", "", FirebaseAnalytics.Param.TERM, "termSpanUnit", "", "maxLoanDays", "loanMinRatio", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "getCreditLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTermSpan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTerm", "getTermSpanUnit", "()Ljava/lang/String;", "getMaxLoanDays", "getLoanMinRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainConfig {

    @Nullable
    private final Long creditLimit;

    @Nullable
    private final Double loanMinRatio;

    @Nullable
    private final Integer maxLoanDays;

    @Nullable
    private final Integer term;

    @Nullable
    private final Integer termSpan;

    @Nullable
    private final String termSpanUnit;

    public CLMainConfig(@Nullable Long l5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Double d2) {
        this.creditLimit = l5;
        this.termSpan = num;
        this.term = num2;
        this.termSpanUnit = str;
        this.maxLoanDays = num3;
        this.loanMinRatio = d2;
    }

    @Nullable
    public final Long getCreditLimit() {
        return this.creditLimit;
    }

    @Nullable
    public final Double getLoanMinRatio() {
        return this.loanMinRatio;
    }

    @Nullable
    public final Integer getMaxLoanDays() {
        return this.maxLoanDays;
    }

    @Nullable
    public final Integer getTerm() {
        return this.term;
    }

    @Nullable
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }
}
