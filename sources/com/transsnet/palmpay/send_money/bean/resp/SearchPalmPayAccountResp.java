package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001b¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/SearchPalmPayAccountResp;", "", "<init>", "()V", "memberId", "", "getMemberId", "()Ljava/lang/String;", "setMemberId", "(Ljava/lang/String;)V", "accountName", "getAccountName", "setAccountName", "accountNo", "getAccountNo", "setAccountNo", "ppAccountNo", "getPpAccountNo", "setPpAccountNo", "transType", "getTransType", "setTransType", "businessType", "", "getBusinessType", "()Ljava/lang/Integer;", "setBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "hasAccount", "", "getHasAccount", "()Ljava/lang/Boolean;", "setHasAccount", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "recipientTradeStatus", "getRecipientTradeStatus", "setRecipientTradeStatus", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchPalmPayAccountResp {

    @Nullable
    private String accountName;

    @Nullable
    private String accountNo;

    @Nullable
    private Integer businessType;

    @Nullable
    private Boolean hasAccount;

    @Nullable
    private String memberId;

    @Nullable
    private String ppAccountNo;

    @Nullable
    private Integer recipientTradeStatus;

    @Nullable
    private String transType;

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final Boolean getHasAccount() {
        return this.hasAccount;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getPpAccountNo() {
        return this.ppAccountNo;
    }

    @Nullable
    public final Integer getRecipientTradeStatus() {
        return this.recipientTradeStatus;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setHasAccount(@Nullable Boolean bool) {
        this.hasAccount = bool;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setPpAccountNo(@Nullable String str) {
        this.ppAccountNo = str;
    }

    public final void setRecipientTradeStatus(@Nullable Integer num) {
        this.recipientTradeStatus = num;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
