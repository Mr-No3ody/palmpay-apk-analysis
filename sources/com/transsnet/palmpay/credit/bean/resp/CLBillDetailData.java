package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bE\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0087\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b.\u0010/R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00104\u001a\u0004\b=\u00103R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b>\u00107R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b?\u00107R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b@\u00107R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bA\u00107R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bB\u00107R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bC\u00107R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bD\u00107R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bH\u00107R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bL\u00107R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bM\u00107R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\bN\u0010FR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\bO\u0010FR\u0015\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bP\u00107R\u0015\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bQ\u00107R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00104\u001a\u0004\bR\u00103R\u0015\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bS\u00107R\u0015\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0015\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bU\u00107R\u0015\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\bV\u0010FR\u0015\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bW\u00107R\u0015\u0010(\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bX\u00107R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00101R\u0015\u0010*\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bZ\u00107R\u0015\u0010+\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b[\u00107R\u0015\u0010,\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\b\\\u0010FR\u0015\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010G\u001a\u0004\b]\u0010F¨\u0006_"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLBillDetailData;", "", "bvn", "", "interestRatio", "", "loanAccount", "loanAmount", "", "loanEndDate", "loanNo", "loanStartDate", "name", "penaltyRatio", "repaymentDate", "unpaidAmount", "paidInterest", "unpaidInterest", "unpaidPenalty", "paidPenalty", "unpaidPrincipal", "loanDays", "", "repaymentAmount", "repaymentPlanPOList", "", "Lcom/transsnet/palmpay/credit/bean/resp/InsRepaymentPlanDetail;", "interestPrompt", "discountInterestSum", "outstandingAmount", "termLeft", "largeLoanTerm", "unpaidServiceFee", "paidServiceFee", "serviceFeeRate", "minServiceFee", "maxServiceFee", "totalAmount", "loanType", "extensionSendPrincipal", "extensionRepaymentDate", "sourceLoanNo", "paidExtensionServiceFee", "managementFee", "reductionWay", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBvn", "()Ljava/lang/String;", "getInterestRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLoanAccount", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanEndDate", "getLoanNo", "getLoanStartDate", "getName", "getPenaltyRatio", "getRepaymentDate", "getUnpaidAmount", "getPaidInterest", "getUnpaidInterest", "getUnpaidPenalty", "getPaidPenalty", "getUnpaidPrincipal", "getLoanDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepaymentAmount", "getRepaymentPlanPOList", "()Ljava/util/List;", "getInterestPrompt", "getDiscountInterestSum", "getOutstandingAmount", "getTermLeft", "getLargeLoanTerm", "getUnpaidServiceFee", "getPaidServiceFee", "getServiceFeeRate", "getMinServiceFee", "getMaxServiceFee", "getTotalAmount", "getLoanType", "getExtensionSendPrincipal", "getExtensionRepaymentDate", "getSourceLoanNo", "getPaidExtensionServiceFee", "getManagementFee", "getReductionWay", "getAccountType", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBillDetailData {
    public static final int CL_EXTEND_LOAN_BILL = 1;
    public static final int CL_NEW_EXTEND_LOAN_BILL = 2;

    @Nullable
    private final Integer accountType;

    @Nullable
    private final String bvn;

    @Nullable
    private final Long discountInterestSum;

    @Nullable
    private final Long extensionRepaymentDate;

    @Nullable
    private final Long extensionSendPrincipal;

    @Nullable
    private final String interestPrompt;

    @Nullable
    private final Double interestRatio;

    @Nullable
    private final Integer largeLoanTerm;

    @Nullable
    private final String loanAccount;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Integer loanDays;

    @Nullable
    private final Long loanEndDate;

    @Nullable
    private final String loanNo;

    @Nullable
    private final Long loanStartDate;

    @Nullable
    private final Integer loanType;

    @Nullable
    private final Long managementFee;

    @Nullable
    private final Long maxServiceFee;

    @Nullable
    private final Long minServiceFee;

    @Nullable
    private final String name;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long paidExtensionServiceFee;

    @Nullable
    private final Long paidInterest;

    @Nullable
    private final Long paidPenalty;

    @Nullable
    private final Long paidServiceFee;

    @Nullable
    private final Double penaltyRatio;

    @Nullable
    private final Integer reductionWay;

    @Nullable
    private final Long repaymentAmount;

    @Nullable
    private final Long repaymentDate;

    @NotNull
    private final List<InsRepaymentPlanDetail> repaymentPlanPOList;

    @Nullable
    private final Double serviceFeeRate;

    @Nullable
    private final String sourceLoanNo;

    @Nullable
    private final Integer termLeft;

    @Nullable
    private final Long totalAmount;

    @Nullable
    private final Long unpaidAmount;

    @Nullable
    private final Long unpaidInterest;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final Long unpaidPrincipal;

    @Nullable
    private final Long unpaidServiceFee;

    public CLBillDetailData(@Nullable String str, @Nullable Double d2, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable String str3, @Nullable Long l8, @Nullable String str4, @Nullable Double d10, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable Integer num, @Nullable Long l17, @NotNull List<InsRepaymentPlanDetail> repaymentPlanPOList, @Nullable String str5, @Nullable Long l18, @Nullable Long l19, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l20, @Nullable Long l21, @Nullable Double d11, @Nullable Long l22, @Nullable Long l23, @Nullable Long l24, @Nullable Integer num4, @Nullable Long l25, @Nullable Long l26, @Nullable String str6, @Nullable Long l27, @Nullable Long l28, @Nullable Integer num5, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(repaymentPlanPOList, "repaymentPlanPOList");
        this.bvn = str;
        this.interestRatio = d2;
        this.loanAccount = str2;
        this.loanAmount = l5;
        this.loanEndDate = l6;
        this.loanNo = str3;
        this.loanStartDate = l8;
        this.name = str4;
        this.penaltyRatio = d10;
        this.repaymentDate = l10;
        this.unpaidAmount = l11;
        this.paidInterest = l12;
        this.unpaidInterest = l13;
        this.unpaidPenalty = l14;
        this.paidPenalty = l15;
        this.unpaidPrincipal = l16;
        this.loanDays = num;
        this.repaymentAmount = l17;
        this.repaymentPlanPOList = repaymentPlanPOList;
        this.interestPrompt = str5;
        this.discountInterestSum = l18;
        this.outstandingAmount = l19;
        this.termLeft = num2;
        this.largeLoanTerm = num3;
        this.unpaidServiceFee = l20;
        this.paidServiceFee = l21;
        this.serviceFeeRate = d11;
        this.minServiceFee = l22;
        this.maxServiceFee = l23;
        this.totalAmount = l24;
        this.loanType = num4;
        this.extensionSendPrincipal = l25;
        this.extensionRepaymentDate = l26;
        this.sourceLoanNo = str6;
        this.paidExtensionServiceFee = l27;
        this.managementFee = l28;
        this.reductionWay = num5;
        this.accountType = num6;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getBvn() {
        return this.bvn;
    }

    @Nullable
    public final Long getDiscountInterestSum() {
        return this.discountInterestSum;
    }

    @Nullable
    public final Long getExtensionRepaymentDate() {
        return this.extensionRepaymentDate;
    }

    @Nullable
    public final Long getExtensionSendPrincipal() {
        return this.extensionSendPrincipal;
    }

    @Nullable
    public final String getInterestPrompt() {
        return this.interestPrompt;
    }

    @Nullable
    public final Double getInterestRatio() {
        return this.interestRatio;
    }

    @Nullable
    public final Integer getLargeLoanTerm() {
        return this.largeLoanTerm;
    }

    @Nullable
    public final String getLoanAccount() {
        return this.loanAccount;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Integer getLoanDays() {
        return this.loanDays;
    }

    @Nullable
    public final Long getLoanEndDate() {
        return this.loanEndDate;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final Long getLoanStartDate() {
        return this.loanStartDate;
    }

    @Nullable
    public final Integer getLoanType() {
        return this.loanType;
    }

    @Nullable
    public final Long getManagementFee() {
        return this.managementFee;
    }

    @Nullable
    public final Long getMaxServiceFee() {
        return this.maxServiceFee;
    }

    @Nullable
    public final Long getMinServiceFee() {
        return this.minServiceFee;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getPaidExtensionServiceFee() {
        return this.paidExtensionServiceFee;
    }

    @Nullable
    public final Long getPaidInterest() {
        return this.paidInterest;
    }

    @Nullable
    public final Long getPaidPenalty() {
        return this.paidPenalty;
    }

    @Nullable
    public final Long getPaidServiceFee() {
        return this.paidServiceFee;
    }

    @Nullable
    public final Double getPenaltyRatio() {
        return this.penaltyRatio;
    }

    @Nullable
    public final Integer getReductionWay() {
        return this.reductionWay;
    }

    @Nullable
    public final Long getRepaymentAmount() {
        return this.repaymentAmount;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @NotNull
    public final List<InsRepaymentPlanDetail> getRepaymentPlanPOList() {
        return this.repaymentPlanPOList;
    }

    @Nullable
    public final Double getServiceFeeRate() {
        return this.serviceFeeRate;
    }

    @Nullable
    public final String getSourceLoanNo() {
        return this.sourceLoanNo;
    }

    @Nullable
    public final Integer getTermLeft() {
        return this.termLeft;
    }

    @Nullable
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }

    @Nullable
    public final Long getUnpaidInterest() {
        return this.unpaidInterest;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final Long getUnpaidPrincipal() {
        return this.unpaidPrincipal;
    }

    @Nullable
    public final Long getUnpaidServiceFee() {
        return this.unpaidServiceFee;
    }
}
