package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcIncreaseLimitData;", "", "changeCreditLimit", "", "initCreditLimit", "raiseCount", "", "totalCreditLimit", "initCreditLimitTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getChangeCreditLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInitCreditLimit", "getRaiseCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalCreditLimit", "getInitCreditLimitTime", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcIncreaseLimitData {

    @Nullable
    private final Long changeCreditLimit;

    @Nullable
    private final Long initCreditLimit;

    @Nullable
    private final Long initCreditLimitTime;

    @Nullable
    private final Integer raiseCount;

    @Nullable
    private final Long totalCreditLimit;

    public OcIncreaseLimitData(@Nullable Long l5, @Nullable Long l6, @Nullable Integer num, @Nullable Long l8, @Nullable Long l10) {
        this.changeCreditLimit = l5;
        this.initCreditLimit = l6;
        this.raiseCount = num;
        this.totalCreditLimit = l8;
        this.initCreditLimitTime = l10;
    }

    @Nullable
    public final Long getChangeCreditLimit() {
        return this.changeCreditLimit;
    }

    @Nullable
    public final Long getInitCreditLimit() {
        return this.initCreditLimit;
    }

    @Nullable
    public final Long getInitCreditLimitTime() {
        return this.initCreditLimitTime;
    }

    @Nullable
    public final Integer getRaiseCount() {
        return this.raiseCount;
    }

    @Nullable
    public final Long getTotalCreditLimit() {
        return this.totalCreditLimit;
    }
}
