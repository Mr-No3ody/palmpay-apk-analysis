package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.bean.WaiverInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b,\u0010&R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b-\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b.\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b/\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b0\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b1\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b6\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\b7\u00103R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b8\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b<\u0010&R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b=\u0010&R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\b>\u00103R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\b?\u00103R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b@\u0010&R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\bA\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLCurrentBillData;", "", "cardNo", "", "loanAmount", "", "loanNo", "repaymentPlanBOList", "", "Lcom/transsnet/palmpay/credit/bean/resp/InsRepaymentPlanDetail;", "unpaidAmount", "unpaidInterest", "paidInterest", "paidPrincipal", "paidPenalty", "unpaidPenalty", "unpaidPrincipal", "largeLoanTerm", "", "interestPrompt", "loanDate", "pendingPaidTerm", "unpaidServiceFee", "serviceFeeRate", "", "minServiceFee", "maxServiceFee", "extensionTag", "loanType", "loanTime", "accountType", "waiverInfo", "Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/WaiverInfo;)V", "getCardNo", "()Ljava/lang/String;", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanNo", "getRepaymentPlanBOList", "()Ljava/util/List;", "getUnpaidAmount", "getUnpaidInterest", "getPaidInterest", "getPaidPrincipal", "getPaidPenalty", "getUnpaidPenalty", "getUnpaidPrincipal", "getLargeLoanTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterestPrompt", "getLoanDate", "getPendingPaidTerm", "getUnpaidServiceFee", "getServiceFeeRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinServiceFee", "getMaxServiceFee", "getExtensionTag", "getLoanType", "getLoanTime", "getAccountType", "getWaiverInfo", "()Lcom/transsnet/palmpay/credit/bean/WaiverInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCurrentBillData {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Integer extensionTag;

    @Nullable
    private final String interestPrompt;

    @Nullable
    private final Integer largeLoanTerm;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Long loanDate;

    @Nullable
    private final String loanNo;

    @Nullable
    private final Long loanTime;

    @Nullable
    private final Integer loanType;

    @Nullable
    private final Long maxServiceFee;

    @Nullable
    private final Long minServiceFee;

    @Nullable
    private final Long paidInterest;

    @Nullable
    private final Long paidPenalty;

    @Nullable
    private final Long paidPrincipal;

    @Nullable
    private final Integer pendingPaidTerm;

    @Nullable
    private final List<InsRepaymentPlanDetail> repaymentPlanBOList;

    @Nullable
    private final Double serviceFeeRate;

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

    @Nullable
    private final WaiverInfo waiverInfo;

    public CLCurrentBillData(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable List<InsRepaymentPlanDetail> list, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Integer num, @Nullable String str3, @Nullable Long l15, @Nullable Integer num2, @Nullable Long l16, @Nullable Double d2, @Nullable Long l17, @Nullable Long l18, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l19, @Nullable Integer num5, @Nullable WaiverInfo waiverInfo) {
        this.cardNo = str;
        this.loanAmount = l5;
        this.loanNo = str2;
        this.repaymentPlanBOList = list;
        this.unpaidAmount = l6;
        this.unpaidInterest = l8;
        this.paidInterest = l10;
        this.paidPrincipal = l11;
        this.paidPenalty = l12;
        this.unpaidPenalty = l13;
        this.unpaidPrincipal = l14;
        this.largeLoanTerm = num;
        this.interestPrompt = str3;
        this.loanDate = l15;
        this.pendingPaidTerm = num2;
        this.unpaidServiceFee = l16;
        this.serviceFeeRate = d2;
        this.minServiceFee = l17;
        this.maxServiceFee = l18;
        this.extensionTag = num3;
        this.loanType = num4;
        this.loanTime = l19;
        this.accountType = num5;
        this.waiverInfo = waiverInfo;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Integer getExtensionTag() {
        return this.extensionTag;
    }

    @Nullable
    public final String getInterestPrompt() {
        return this.interestPrompt;
    }

    @Nullable
    public final Integer getLargeLoanTerm() {
        return this.largeLoanTerm;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Long getLoanDate() {
        return this.loanDate;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final Long getLoanTime() {
        return this.loanTime;
    }

    @Nullable
    public final Integer getLoanType() {
        return this.loanType;
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
    public final Long getPaidInterest() {
        return this.paidInterest;
    }

    @Nullable
    public final Long getPaidPenalty() {
        return this.paidPenalty;
    }

    @Nullable
    public final Long getPaidPrincipal() {
        return this.paidPrincipal;
    }

    @Nullable
    public final Integer getPendingPaidTerm() {
        return this.pendingPaidTerm;
    }

    @Nullable
    public final List<InsRepaymentPlanDetail> getRepaymentPlanBOList() {
        return this.repaymentPlanBOList;
    }

    @Nullable
    public final Double getServiceFeeRate() {
        return this.serviceFeeRate;
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

    @Nullable
    public final WaiverInfo getWaiverInfo() {
        return this.waiverInfo;
    }

    public /* synthetic */ CLCurrentBillData(String str, Long l5, String str2, List list, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Integer num, String str3, Long l15, Integer num2, Long l16, Double d2, Long l17, Long l18, Integer num3, Integer num4, Long l19, Integer num5, WaiverInfo waiverInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l5, str2, list, l6, l8, l10, l11, l12, l13, l14, num, str3, l15, num2, l16, d2, l17, l18, num3, num4, l19, num5, (i7 & 8388608) != 0 ? null : waiverInfo);
    }
}
