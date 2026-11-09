package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcRepaidRecordListReq;", "", "billId", "", "operationType", "", "pageNum", "", "pageSize", "repaymentDateStamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOperationType", "()Ljava/lang/String;", "getPageNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getRepaymentDateStamp", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaidRecordListReq {

    @Nullable
    private final Long billId;

    @Nullable
    private final String operationType;

    @Nullable
    private final Integer pageNum;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Long repaymentDateStamp;

    public OcRepaidRecordListReq(@Nullable Long l5, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l6) {
        this.billId = l5;
        this.operationType = str;
        this.pageNum = num;
        this.pageSize = num2;
        this.repaymentDateStamp = l6;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    public /* synthetic */ OcRepaidRecordListReq(Long l5, String str, Integer num, Integer num2, Long l6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, str, num, num2, (i7 & 16) != 0 ? 0L : l6);
    }
}
