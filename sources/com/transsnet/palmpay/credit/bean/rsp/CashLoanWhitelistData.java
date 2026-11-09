package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CashLoanWhitelistData;", "", "expireDays", "", "busiType", "", "preCreditLimit", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)V", "getExpireDays", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBusiType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreCreditLimit", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashLoanWhitelistData {

    @Nullable
    private final Integer busiType;

    @Nullable
    private final Long expireDays;

    @Nullable
    private final Long preCreditLimit;

    public CashLoanWhitelistData(@Nullable Long l5, @Nullable Integer num, @Nullable Long l6) {
        this.expireDays = l5;
        this.busiType = num;
        this.preCreditLimit = l6;
    }

    @Nullable
    public final Integer getBusiType() {
        return this.busiType;
    }

    @Nullable
    public final Long getExpireDays() {
        return this.expireDays;
    }

    @Nullable
    public final Long getPreCreditLimit() {
        return this.preCreditLimit;
    }
}
