package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/TransferMatchMemberReq;", "", "<init>", "()V", "accountNo", "", "getAccountNo", "()Ljava/lang/String;", "setAccountNo", "(Ljava/lang/String;)V", "bankCode", "getBankCode", "setBankCode", "sourceType", "", "getSourceType", "()I", "setSourceType", "(I)V", "accountType", "getAccountType", "setAccountType", "existRecipient", "", "getExistRecipient", "()Ljava/lang/Boolean;", "setExistRecipient", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferMatchMemberReq {

    @Nullable
    private String accountNo;
    private int accountType;

    @Nullable
    private String bankCode;

    @Nullable
    private Boolean existRecipient;
    private int sourceType;

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    public final int getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final Boolean getExistRecipient() {
        return this.existRecipient;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setAccountType(int i7) {
        this.accountType = i7;
    }

    public final void setBankCode(@Nullable String str) {
        this.bankCode = str;
    }

    public final void setExistRecipient(@Nullable Boolean bool) {
        this.existRecipient = bool;
    }

    public final void setSourceType(int i7) {
        this.sourceType = i7;
    }
}
