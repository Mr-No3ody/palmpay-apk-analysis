package com.transsnet.palmpay.credit.bean.resp;

import N8.q0;
import Pa.E;
import Pa.r0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/LoanConfig;", "", "minLoanAmount", "", "availableAmount", "maxLoanDays", "loanRatio", "", "riskLevelResp", "Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;", "loanProduct", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;Ljava/lang/String;)V", "getMinLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAvailableAmount", "getMaxLoanDays", "getLoanRatio", "()Ljava/lang/String;", "getRiskLevelResp", "()Lcom/transsnet/palmpay/credit/bean/resp/CardRiskLevelResp;", "getLoanProduct", "getLoanRatioString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanConfig {

    @Nullable
    private final Long availableAmount;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final String loanRatio;

    @Nullable
    private final Long maxLoanDays;

    @Nullable
    private final Long minLoanAmount;

    @Nullable
    private final CardRiskLevelResp riskLevelResp;

    public LoanConfig(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str, @Nullable CardRiskLevelResp cardRiskLevelResp, @Nullable String str2) {
        this.minLoanAmount = l5;
        this.availableAmount = l6;
        this.maxLoanDays = l8;
        this.loanRatio = str;
        this.riskLevelResp = cardRiskLevelResp;
        this.loanProduct = str2;
    }

    @Nullable
    public final Long getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final String getLoanRatio() {
        return this.loanRatio;
    }

    @NotNull
    public final String getLoanRatioString() {
        return q0.j(E.a(r0.w1(this.loanRatio, "100").toPlainString()), "%");
    }

    @Nullable
    public final Long getMaxLoanDays() {
        return this.maxLoanDays;
    }

    @Nullable
    public final Long getMinLoanAmount() {
        return this.minLoanAmount;
    }

    @Nullable
    public final CardRiskLevelResp getRiskLevelResp() {
        return this.riskLevelResp;
    }
}
