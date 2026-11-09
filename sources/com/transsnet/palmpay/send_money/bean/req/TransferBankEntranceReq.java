package com.transsnet.palmpay.send_money.bean.req;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/TransferBankEntranceReq;", "", "<init>", "()V", "businessType", "", "getBusinessType", "()Ljava/lang/Integer;", "setBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bankCode", "", "getBankCode", "()Ljava/lang/String;", "setBankCode", "(Ljava/lang/String;)V", "bankAccount", "getBankAccount", "setBankAccount", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferBankEntranceReq {

    @Nullable
    private String bankAccount;

    @Nullable
    private String bankCode;

    @Nullable
    private Integer businessType;

    @Nullable
    private String label;

    @Nullable
    public final String getBankAccount() {
        return this.bankAccount;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final void setBankAccount(@Nullable String str) {
        this.bankAccount = str;
    }

    public final void setBankCode(@Nullable String str) {
        this.bankCode = str;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }
}
