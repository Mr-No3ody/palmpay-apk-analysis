package com.transsnet.palmpay.managemoney.bean.req;

import N8.q0;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/QueryCashBoxStatReq;", "", "pageSize", "", "pageNum", "transactionType", "operationType", "transactionDirection", "transactionStatus", "startTime", "", "endTime", "<init>", "(IIIIIIJJ)V", "getPageSize", "()I", "setPageSize", "(I)V", "getPageNum", "setPageNum", "getTransactionType", "setTransactionType", "getOperationType", "setOperationType", "getTransactionDirection", "setTransactionDirection", "getTransactionStatus", "setTransactionStatus", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getKey", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryCashBoxStatReq {
    private long endTime;
    private int operationType;
    private int pageNum;
    private int pageSize;
    private long startTime;
    private int transactionDirection;
    private int transactionStatus;
    private int transactionType;

    public QueryCashBoxStatReq() {
        this(0, 0, 0, 0, 0, 0, 0L, 0L, 255, null);
    }

    public static /* synthetic */ QueryCashBoxStatReq copy$default(QueryCashBoxStatReq queryCashBoxStatReq, int i7, int i10, int i11, int i12, int i13, int i14, long j6, long j10, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i7 = queryCashBoxStatReq.pageSize;
        }
        if ((i15 & 2) != 0) {
            i10 = queryCashBoxStatReq.pageNum;
        }
        if ((i15 & 4) != 0) {
            i11 = queryCashBoxStatReq.transactionType;
        }
        if ((i15 & 8) != 0) {
            i12 = queryCashBoxStatReq.operationType;
        }
        if ((i15 & 16) != 0) {
            i13 = queryCashBoxStatReq.transactionDirection;
        }
        if ((i15 & 32) != 0) {
            i14 = queryCashBoxStatReq.transactionStatus;
        }
        if ((i15 & 64) != 0) {
            j6 = queryCashBoxStatReq.startTime;
        }
        if ((i15 & 128) != 0) {
            j10 = queryCashBoxStatReq.endTime;
        }
        long j11 = j10;
        long j12 = j6;
        int i16 = i13;
        int i17 = i14;
        return queryCashBoxStatReq.copy(i7, i10, i11, i12, i16, i17, j12, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTransactionType() {
        return this.transactionType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOperationType() {
        return this.operationType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTransactionDirection() {
        return this.transactionDirection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTransactionStatus() {
        return this.transactionStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final QueryCashBoxStatReq copy(int pageSize, int pageNum, int transactionType, int operationType, int transactionDirection, int transactionStatus, long startTime, long endTime) {
        return new QueryCashBoxStatReq(pageSize, pageNum, transactionType, operationType, transactionDirection, transactionStatus, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCashBoxStatReq)) {
            return false;
        }
        QueryCashBoxStatReq queryCashBoxStatReq = (QueryCashBoxStatReq) other;
        return this.pageSize == queryCashBoxStatReq.pageSize && this.pageNum == queryCashBoxStatReq.pageNum && this.transactionType == queryCashBoxStatReq.transactionType && this.operationType == queryCashBoxStatReq.operationType && this.transactionDirection == queryCashBoxStatReq.transactionDirection && this.transactionStatus == queryCashBoxStatReq.transactionStatus && this.startTime == queryCashBoxStatReq.startTime && this.endTime == queryCashBoxStatReq.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getKey() {
        int i7 = this.pageSize;
        int i10 = this.pageNum;
        int i11 = this.transactionType;
        int i12 = this.operationType;
        int i13 = this.transactionDirection;
        int i14 = this.transactionStatus;
        long j6 = this.startTime;
        long j10 = this.endTime;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7);
        sb2.append(i10);
        sb2.append(i11);
        sb2.append(i12);
        sb2.append(i13);
        sb2.append(i14);
        sb2.append(j6);
        sb2.append(j10);
        return sb2.toString();
    }

    public final int getOperationType() {
        return this.operationType;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getTransactionDirection() {
        return this.transactionDirection;
    }

    public final int getTransactionStatus() {
        return this.transactionStatus;
    }

    public final int getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return Long.hashCode(this.endTime) + q0.b(u.b(this.transactionStatus, u.b(this.transactionDirection, u.b(this.operationType, u.b(this.transactionType, u.b(this.pageNum, Integer.hashCode(this.pageSize) * 31, 31), 31), 31), 31), 31), 31, this.startTime);
    }

    public final void setEndTime(long j6) {
        this.endTime = j6;
    }

    public final void setOperationType(int i7) {
        this.operationType = i7;
    }

    public final void setPageNum(int i7) {
        this.pageNum = i7;
    }

    public final void setPageSize(int i7) {
        this.pageSize = i7;
    }

    public final void setStartTime(long j6) {
        this.startTime = j6;
    }

    public final void setTransactionDirection(int i7) {
        this.transactionDirection = i7;
    }

    public final void setTransactionStatus(int i7) {
        this.transactionStatus = i7;
    }

    public final void setTransactionType(int i7) {
        this.transactionType = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.pageSize;
        int i10 = this.pageNum;
        int i11 = this.transactionType;
        int i12 = this.operationType;
        int i13 = this.transactionDirection;
        int i14 = this.transactionStatus;
        long j6 = this.startTime;
        long j10 = this.endTime;
        StringBuilder sbP = q0.p(i7, "QueryCashBoxStatReq(pageSize=", i10, ", pageNum=", ", transactionType=");
        u.u(sbP, i11, ", operationType=", i12, ", transactionDirection=");
        u.u(sbP, i13, ", transactionStatus=", i14, ", startTime=");
        sbP.append(j6);
        sbP.append(", endTime=");
        sbP.append(j10);
        sbP.append(")");
        return sbP.toString();
    }

    public QueryCashBoxStatReq(int i7, int i10, int i11, int i12, int i13, int i14, long j6, long j10) {
        this.pageSize = i7;
        this.pageNum = i10;
        this.transactionType = i11;
        this.operationType = i12;
        this.transactionDirection = i13;
        this.transactionStatus = i14;
        this.startTime = j6;
        this.endTime = j10;
    }

    public /* synthetic */ QueryCashBoxStatReq(int i7, int i10, int i11, int i12, int i13, int i14, long j6, long j10, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 10 : i7, (i15 & 2) != 0 ? 1 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? -1L : j6, (i15 & 128) != 0 ? -1L : j10);
    }
}
