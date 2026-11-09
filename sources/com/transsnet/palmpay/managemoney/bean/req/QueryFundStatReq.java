package com.transsnet.palmpay.managemoney.bean.req;

import N8.q0;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003Ja\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/req/QueryFundStatReq;", "", "pageSize", "", "pageNum", "fundId", "", "transType", "subTransType", "transactionStatus", "startTime", "", "endTime", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getPageSize", "()I", "setPageSize", "(I)V", "getPageNum", "setPageNum", "getFundId", "()Ljava/lang/String;", "setFundId", "(Ljava/lang/String;)V", "getTransType", "setTransType", "getSubTransType", "setSubTransType", "getTransactionStatus", "setTransactionStatus", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryFundStatReq {
    private long endTime;

    @Nullable
    private String fundId;
    private int pageNum;
    private int pageSize;
    private long startTime;

    @Nullable
    private String subTransType;

    @Nullable
    private String transType;

    @Nullable
    private String transactionStatus;

    public QueryFundStatReq() {
        this(0, 0, null, null, null, null, 0L, 0L, 255, null);
    }

    public static /* synthetic */ QueryFundStatReq copy$default(QueryFundStatReq queryFundStatReq, int i7, int i10, String str, String str2, String str3, String str4, long j6, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = queryFundStatReq.pageSize;
        }
        if ((i11 & 2) != 0) {
            i10 = queryFundStatReq.pageNum;
        }
        if ((i11 & 4) != 0) {
            str = queryFundStatReq.fundId;
        }
        if ((i11 & 8) != 0) {
            str2 = queryFundStatReq.transType;
        }
        if ((i11 & 16) != 0) {
            str3 = queryFundStatReq.subTransType;
        }
        if ((i11 & 32) != 0) {
            str4 = queryFundStatReq.transactionStatus;
        }
        if ((i11 & 64) != 0) {
            j6 = queryFundStatReq.startTime;
        }
        if ((i11 & 128) != 0) {
            j10 = queryFundStatReq.endTime;
        }
        long j11 = j10;
        long j12 = j6;
        String str5 = str3;
        String str6 = str4;
        return queryFundStatReq.copy(i7, i10, str, str2, str5, str6, j12, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNum() {
        return this.pageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFundId() {
        return this.fundId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTransType() {
        return this.subTransType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransactionStatus() {
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
    public final QueryFundStatReq copy(int pageSize, int pageNum, @Nullable String fundId, @Nullable String transType, @Nullable String subTransType, @Nullable String transactionStatus, long startTime, long endTime) {
        return new QueryFundStatReq(pageSize, pageNum, fundId, transType, subTransType, transactionStatus, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryFundStatReq)) {
            return false;
        }
        QueryFundStatReq queryFundStatReq = (QueryFundStatReq) other;
        return this.pageSize == queryFundStatReq.pageSize && this.pageNum == queryFundStatReq.pageNum && Intrinsics.c(this.fundId, queryFundStatReq.fundId) && Intrinsics.c(this.transType, queryFundStatReq.transType) && Intrinsics.c(this.subTransType, queryFundStatReq.subTransType) && Intrinsics.c(this.transactionStatus, queryFundStatReq.transactionStatus) && this.startTime == queryFundStatReq.startTime && this.endTime == queryFundStatReq.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getFundId() {
        return this.fundId;
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

    @Nullable
    public final String getSubTransType() {
        return this.subTransType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public int hashCode() {
        int iB = u.b(this.pageNum, Integer.hashCode(this.pageSize) * 31, 31);
        String str = this.fundId;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTransType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionStatus;
        return Long.hashCode(this.endTime) + q0.b((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.startTime);
    }

    public final void setEndTime(long j6) {
        this.endTime = j6;
    }

    public final void setFundId(@Nullable String str) {
        this.fundId = str;
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

    public final void setSubTransType(@Nullable String str) {
        this.subTransType = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setTransactionStatus(@Nullable String str) {
        this.transactionStatus = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.pageSize;
        int i10 = this.pageNum;
        String str = this.fundId;
        String str2 = this.transType;
        String str3 = this.subTransType;
        String str4 = this.transactionStatus;
        long j6 = this.startTime;
        long j10 = this.endTime;
        StringBuilder sbP = q0.p(i7, "QueryFundStatReq(pageSize=", i10, ", pageNum=", ", fundId=");
        u.x(sbP, str, ", transType=", str2, ", subTransType=");
        u.x(sbP, str3, ", transactionStatus=", str4, ", startTime=");
        sbP.append(j6);
        sbP.append(", endTime=");
        sbP.append(j10);
        sbP.append(")");
        return sbP.toString();
    }

    public QueryFundStatReq(int i7, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j6, long j10) {
        this.pageSize = i7;
        this.pageNum = i10;
        this.fundId = str;
        this.transType = str2;
        this.subTransType = str3;
        this.transactionStatus = str4;
        this.startTime = j6;
        this.endTime = j10;
    }

    public /* synthetic */ QueryFundStatReq(int i7, int i10, String str, String str2, String str3, String str4, long j6, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i7, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? -1L : j6, (i11 & 128) != 0 ? -1L : j10);
    }
}
