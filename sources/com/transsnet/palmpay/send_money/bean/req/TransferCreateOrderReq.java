package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001c\u0010&\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001e\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/TransferCreateOrderReq;", "", "<init>", "()V", "transferPurpose", "", "getTransferPurpose", "()Ljava/lang/Integer;", "setTransferPurpose", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "transType", "", "getTransType", "()Ljava/lang/String;", "setTransType", "(Ljava/lang/String;)V", "businessType", "getBusinessType", "setBusinessType", "accountNo", "getAccountNo", "setAccountNo", "accountName", "getAccountName", "setAccountName", "orderSourceType", "getOrderSourceType", "setOrderSourceType", "payeeMemberId", "getPayeeMemberId", "setPayeeMemberId", "payeeBankCode", "getPayeeBankCode", "setPayeeBankCode", "transferNotes", "getTransferNotes", "setTransferNotes", "extendField", "getExtendField", "setExtendField", "amount", "", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferCreateOrderReq {

    @Nullable
    private String accountName;

    @Nullable
    private String accountNo;

    @Nullable
    private Long amount;

    @Nullable
    private Integer businessType;

    @Nullable
    private String extendField;

    @Nullable
    private String orderSourceType;

    @Nullable
    private String payeeBankCode;

    @Nullable
    private String payeeMemberId;

    @Nullable
    private String transType;

    @Nullable
    private String transferNotes;

    @Nullable
    private Integer transferPurpose;

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getExtendField() {
        return this.extendField;
    }

    @Nullable
    public final String getOrderSourceType() {
        return this.orderSourceType;
    }

    @Nullable
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    public final String getPayeeMemberId() {
        return this.payeeMemberId;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    public final String getTransferNotes() {
        return this.transferNotes;
    }

    @Nullable
    public final Integer getTransferPurpose() {
        return this.transferPurpose;
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setExtendField(@Nullable String str) {
        this.extendField = str;
    }

    public final void setOrderSourceType(@Nullable String str) {
        this.orderSourceType = str;
    }

    public final void setPayeeBankCode(@Nullable String str) {
        this.payeeBankCode = str;
    }

    public final void setPayeeMemberId(@Nullable String str) {
        this.payeeMemberId = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setTransferNotes(@Nullable String str) {
        this.transferNotes = str;
    }

    public final void setTransferPurpose(@Nullable Integer num) {
        this.transferPurpose = num;
    }
}
