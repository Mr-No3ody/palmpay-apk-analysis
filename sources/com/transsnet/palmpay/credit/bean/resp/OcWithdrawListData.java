package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcWithdrawListData;", "", "amount", "", "createTime", "id", "memberId", "", "orderNo", "payId", "payRouteId", "subPayId", "transactionId", "updateTime", "withdrawStatus", "", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getAmount", "()J", "getCreateTime", "getId", "getMemberId", "()Ljava/lang/String;", "getOrderNo", "getPayId", "getPayRouteId", "getSubPayId", "getTransactionId", "getUpdateTime", "getWithdrawStatus", "()I", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcWithdrawListData {
    private final long amount;
    private final long createTime;
    private final long id;

    @NotNull
    private final String memberId;

    @NotNull
    private final String orderNo;

    @NotNull
    private final String payId;

    @NotNull
    private final String payRouteId;

    @NotNull
    private final String subPayId;

    @NotNull
    private final String transactionId;
    private final long updateTime;
    private final int withdrawStatus;

    public OcWithdrawListData(long j6, long j10, long j11, @NotNull String memberId, @NotNull String orderNo, @NotNull String payId, @NotNull String payRouteId, @NotNull String subPayId, @NotNull String transactionId, long j12, int i7) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(payId, "payId");
        Intrinsics.checkNotNullParameter(payRouteId, "payRouteId");
        Intrinsics.checkNotNullParameter(subPayId, "subPayId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.amount = j6;
        this.createTime = j10;
        this.id = j11;
        this.memberId = memberId;
        this.orderNo = orderNo;
        this.payId = payId;
        this.payRouteId = payRouteId;
        this.subPayId = subPayId;
        this.transactionId = transactionId;
        this.updateTime = j12;
        this.withdrawStatus = i7;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getMemberId() {
        return this.memberId;
    }

    @NotNull
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    public final String getPayId() {
        return this.payId;
    }

    @NotNull
    public final String getPayRouteId() {
        return this.payRouteId;
    }

    @NotNull
    public final String getSubPayId() {
        return this.subPayId;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getWithdrawStatus() {
        return this.withdrawStatus;
    }
}
