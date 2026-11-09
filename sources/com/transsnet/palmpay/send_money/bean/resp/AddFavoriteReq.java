package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/AddFavoriteReq;", "", "<init>", "()V", "recipientBankAccount", "", "getRecipientBankAccount", "()Ljava/lang/String;", "setRecipientBankAccount", "(Ljava/lang/String;)V", "recipientBankCode", "getRecipientBankCode", "setRecipientBankCode", "recipientBankName", "getRecipientBankName", "setRecipientBankName", "recipientMobileNo", "getRecipientMobileNo", "setRecipientMobileNo", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "orderId", "getOrderId", "setOrderId", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddFavoriteReq {

    @Nullable
    private String label;

    @Nullable
    private String orderId;

    @Nullable
    private String recipientBankAccount;

    @Nullable
    private String recipientBankCode;

    @Nullable
    private String recipientBankName;

    @Nullable
    private String recipientMobileNo;

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getRecipientBankAccount() {
        return this.recipientBankAccount;
    }

    @Nullable
    public final String getRecipientBankCode() {
        return this.recipientBankCode;
    }

    @Nullable
    public final String getRecipientBankName() {
        return this.recipientBankName;
    }

    @Nullable
    public final String getRecipientMobileNo() {
        return this.recipientMobileNo;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setRecipientBankAccount(@Nullable String str) {
        this.recipientBankAccount = str;
    }

    public final void setRecipientBankCode(@Nullable String str) {
        this.recipientBankCode = str;
    }

    public final void setRecipientBankName(@Nullable String str) {
        this.recipientBankName = str;
    }

    public final void setRecipientMobileNo(@Nullable String str) {
        this.recipientMobileNo = str;
    }
}
