package com.transsnet.palmpay.managemoney.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/PreviewOrderReq;", "", "productId", "", "principal", "goal", "", "stateCode", "fromType", "", "durationDay", "renewDepositSwitch", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IJI)V", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPrincipal", "getGoal", "()Ljava/lang/String;", "getStateCode", "getFromType", "()I", "getDurationDay", "()J", "getRenewDepositSwitch", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewOrderReq {
    private final long durationDay;
    private final int fromType;

    @Nullable
    private final String goal;

    @Nullable
    private final Long principal;

    @Nullable
    private final Long productId;
    private final int renewDepositSwitch;

    @Nullable
    private final String stateCode;

    public PreviewOrderReq(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, int i7, long j6, int i10) {
        this.productId = l5;
        this.principal = l6;
        this.goal = str;
        this.stateCode = str2;
        this.fromType = i7;
        this.durationDay = j6;
        this.renewDepositSwitch = i10;
    }

    public final long getDurationDay() {
        return this.durationDay;
    }

    public final int getFromType() {
        return this.fromType;
    }

    @Nullable
    public final String getGoal() {
        return this.goal;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final Long getProductId() {
        return this.productId;
    }

    public final int getRenewDepositSwitch() {
        return this.renewDepositSwitch;
    }

    @Nullable
    public final String getStateCode() {
        return this.stateCode;
    }
}
