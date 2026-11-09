package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CashRepaymentInfo;", "", "currentCleared", "", "id", "", "outstandingAmount", "repaymentDate", "billId", "extensionTag", "", "loanNo", "", "cardNo", "accountType", "loanProduct", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentCleared", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOutstandingAmount", "getRepaymentDate", "getBillId", "getExtensionTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLoanNo", "()Ljava/lang/String;", "getCardNo", "getAccountType", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashRepaymentInfo {

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
    private final Long id;

    @Nullable
    private final String loanNo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long repaymentDate;

    public CashRepaymentInfo(@Nullable Boolean bool, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.currentCleared = bool;
        this.id = l5;
        this.outstandingAmount = l6;
        this.repaymentDate = l8;
        this.billId = l10;
        this.extensionTag = num;
        this.loanNo = str;
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
    public final Long getId() {
        return this.id;
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
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }
}
