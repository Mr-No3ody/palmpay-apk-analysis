package com.transsnet.palmpay.send_money.bean.req;

import N8.q0;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/BeneficiaryByBankCodeReq;", "Lcom/transsnet/palmpay/core/bean/req/CommonListReq;", "bankCode", "", "<init>", "(Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "setBankCode", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BeneficiaryByBankCodeReq extends CommonListReq {

    @Nullable
    private String bankCode;

    public BeneficiaryByBankCodeReq(@Nullable String str) {
        this.bankCode = str;
    }

    public static /* synthetic */ BeneficiaryByBankCodeReq copy$default(BeneficiaryByBankCodeReq beneficiaryByBankCodeReq, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = beneficiaryByBankCodeReq.bankCode;
        }
        return beneficiaryByBankCodeReq.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @NotNull
    public final BeneficiaryByBankCodeReq copy(@Nullable String bankCode) {
        return new BeneficiaryByBankCodeReq(bankCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeneficiaryByBankCodeReq) && Intrinsics.c(this.bankCode, ((BeneficiaryByBankCodeReq) other).bankCode);
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    public int hashCode() {
        String str = this.bankCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setBankCode(@Nullable String str) {
        this.bankCode = str;
    }

    @NotNull
    public String toString() {
        return q0.k("BeneficiaryByBankCodeReq(bankCode=", this.bankCode, ")");
    }
}
