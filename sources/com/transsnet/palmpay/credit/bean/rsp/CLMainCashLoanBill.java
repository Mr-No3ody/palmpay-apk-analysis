package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCashLoanBill;", "", "loanNo", "", "outstandingAmount", "", "repaymentDate", "currentCleared", "", "billId", "productSubId", "", "extensionTag", "loanType", "cardNo", "accountType", "loanProduct", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoanNo", "()Ljava/lang/String;", "getOutstandingAmount", "()J", "setOutstandingAmount", "(J)V", "getRepaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentCleared", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBillId", "getProductSubId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtensionTag", "getLoanType", "getCardNo", "getAccountType", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainCashLoanBill {

    @Nullable
    private final String accountType;

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Boolean currentCleared;

    @Nullable
    private final Integer extensionTag;

    @Nullable
    private final String loanNo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Integer loanType;
    private long outstandingAmount;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final Long repaymentDate;

    public CLMainCashLoanBill(@Nullable String str, long j6, @Nullable Long l5, @Nullable Boolean bool, @Nullable Long l6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.loanNo = str;
        this.outstandingAmount = j6;
        this.repaymentDate = l5;
        this.currentCleared = bool;
        this.billId = l6;
        this.productSubId = num;
        this.extensionTag = num2;
        this.loanType = num3;
        this.cardNo = str2;
        this.accountType = str3;
        this.loanProduct = str4;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Boolean getCurrentCleared() {
        return this.currentCleared;
    }

    @Nullable
    public final Integer getExtensionTag() {
        return this.extensionTag;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Integer getLoanType() {
        return this.loanType;
    }

    public final long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    public final void setOutstandingAmount(long j6) {
        this.outstandingAmount = j6;
    }

    public /* synthetic */ CLMainCashLoanBill(String str, long j6, Long l5, Boolean bool, Long l6, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0L : j6, l5, bool, l6, num, num2, num3, str2, str3, str4);
    }
}
