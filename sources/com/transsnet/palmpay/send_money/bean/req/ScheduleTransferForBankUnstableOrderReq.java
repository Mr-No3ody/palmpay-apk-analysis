package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferForBankUnstableOrderReq;", "", "<init>", "()V", "amount", "", "getAmount", "()J", "setAmount", "(J)V", "paymentType", "", "getPaymentType", "()Ljava/lang/Integer;", "setPaymentType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "payeeBankCode", "", "getPayeeBankCode", "()Ljava/lang/String;", "setPayeeBankCode", "(Ljava/lang/String;)V", "payeeBankCardNo", "getPayeeBankCardNo", "setPayeeBankCardNo", "payeeAccountName", "getPayeeAccountName", "setPayeeAccountName", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferForBankUnstableOrderReq {
    private long amount;

    @Nullable
    private String payeeAccountName;

    @Nullable
    private String payeeBankCardNo;

    @Nullable
    private String payeeBankCode;

    @Nullable
    private Integer paymentType;

    public final long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getPayeeAccountName() {
        return this.payeeAccountName;
    }

    @Nullable
    public final String getPayeeBankCardNo() {
        return this.payeeBankCardNo;
    }

    @Nullable
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    public final Integer getPaymentType() {
        return this.paymentType;
    }

    public final void setAmount(long j6) {
        this.amount = j6;
    }

    public final void setPayeeAccountName(@Nullable String str) {
        this.payeeAccountName = str;
    }

    public final void setPayeeBankCardNo(@Nullable String str) {
        this.payeeBankCardNo = str;
    }

    public final void setPayeeBankCode(@Nullable String str) {
        this.payeeBankCode = str;
    }

    public final void setPaymentType(@Nullable Integer num) {
        this.paymentType = num;
    }
}
