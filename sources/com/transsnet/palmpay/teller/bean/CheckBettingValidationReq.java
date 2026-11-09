package com.transsnet.palmpay.teller.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CheckBettingValidationReq;", "", "billerId", "", "customerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getCustomerId", "setCustomerId", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBettingValidationReq {

    @Nullable
    private String billerId;

    @Nullable
    private String customerId;

    public CheckBettingValidationReq(@Nullable String str, @Nullable String str2) {
        this.billerId = str;
        this.customerId = str2;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }
}
