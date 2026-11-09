package com.transsnet.palmpay.managemoney.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/CreateOrderReq;", "", "productId", "", "principal", "goal", "", "stateCode", "fromType", "", "durationDay", "payoutOptionType", "renewDepositSwitch", "isStrictMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IJIII)V", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPrincipal", "getGoal", "()Ljava/lang/String;", "getStateCode", "getFromType", "()I", "getDurationDay", "()J", "getPayoutOptionType", "getRenewDepositSwitch", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateOrderReq {
    private final long durationDay;
    private final int fromType;

    @Nullable
    private final String goal;
    private final int isStrictMode;
    private final int payoutOptionType;

    @Nullable
    private final Long principal;

    @Nullable
    private final Long productId;
    private final int renewDepositSwitch;

    @Nullable
    private final String stateCode;

    public CreateOrderReq(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, int i7, long j6, int i10, int i11, int i12) {
        this.productId = l5;
        this.principal = l6;
        this.goal = str;
        this.stateCode = str2;
        this.fromType = i7;
        this.durationDay = j6;
        this.payoutOptionType = i10;
        this.renewDepositSwitch = i11;
        this.isStrictMode = i12;
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

    public final int getPayoutOptionType() {
        return this.payoutOptionType;
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

    /* JADX INFO: renamed from: isStrictMode, reason: from getter */
    public final int getIsStrictMode() {
        return this.isStrictMode;
    }
}
