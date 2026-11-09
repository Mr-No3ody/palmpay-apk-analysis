package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp$CashBoxStat;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp$CashBoxStat;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp$CashBoxStat;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CashBoxStat", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryCashBoxStatResp extends CommonResult {

    @Nullable
    private final CashBoxStat data;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp$CashBoxStat;", "", "totalMoneyIn", "", "totalMoneyOut", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getTotalMoneyIn", "()Ljava/lang/Long;", "setTotalMoneyIn", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTotalMoneyOut", "setTotalMoneyOut", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxStatResp$CashBoxStat;", "equals", "", "other", "hashCode", "", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxStat {

        @Nullable
        private Long totalMoneyIn;

        @Nullable
        private Long totalMoneyOut;

        public CashBoxStat(@Nullable Long l5, @Nullable Long l6) {
            this.totalMoneyIn = l5;
            this.totalMoneyOut = l6;
        }

        public static /* synthetic */ CashBoxStat copy$default(CashBoxStat cashBoxStat, Long l5, Long l6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                l5 = cashBoxStat.totalMoneyIn;
            }
            if ((i7 & 2) != 0) {
                l6 = cashBoxStat.totalMoneyOut;
            }
            return cashBoxStat.copy(l5, l6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getTotalMoneyIn() {
            return this.totalMoneyIn;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getTotalMoneyOut() {
            return this.totalMoneyOut;
        }

        @NotNull
        public final CashBoxStat copy(@Nullable Long totalMoneyIn, @Nullable Long totalMoneyOut) {
            return new CashBoxStat(totalMoneyIn, totalMoneyOut);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxStat)) {
                return false;
            }
            CashBoxStat cashBoxStat = (CashBoxStat) other;
            return Intrinsics.c(this.totalMoneyIn, cashBoxStat.totalMoneyIn) && Intrinsics.c(this.totalMoneyOut, cashBoxStat.totalMoneyOut);
        }

        @Nullable
        public final Long getTotalMoneyIn() {
            return this.totalMoneyIn;
        }

        @Nullable
        public final Long getTotalMoneyOut() {
            return this.totalMoneyOut;
        }

        public int hashCode() {
            Long l5 = this.totalMoneyIn;
            int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
            Long l6 = this.totalMoneyOut;
            return iHashCode + (l6 != null ? l6.hashCode() : 0);
        }

        public final void setTotalMoneyIn(@Nullable Long l5) {
            this.totalMoneyIn = l5;
        }

        public final void setTotalMoneyOut(@Nullable Long l5) {
            this.totalMoneyOut = l5;
        }

        @NotNull
        public String toString() {
            return "CashBoxStat(totalMoneyIn=" + this.totalMoneyIn + ", totalMoneyOut=" + this.totalMoneyOut + ")";
        }
    }

    public QueryCashBoxStatResp(@Nullable CashBoxStat cashBoxStat) {
        this.data = cashBoxStat;
    }

    public static /* synthetic */ QueryCashBoxStatResp copy$default(QueryCashBoxStatResp queryCashBoxStatResp, CashBoxStat cashBoxStat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cashBoxStat = queryCashBoxStatResp.data;
        }
        return queryCashBoxStatResp.copy(cashBoxStat);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CashBoxStat getData() {
        return this.data;
    }

    @NotNull
    public final QueryCashBoxStatResp copy(@Nullable CashBoxStat data) {
        return new QueryCashBoxStatResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QueryCashBoxStatResp) && Intrinsics.c(this.data, ((QueryCashBoxStatResp) other).data);
    }

    @Nullable
    public final CashBoxStat getData() {
        return this.data;
    }

    public int hashCode() {
        CashBoxStat cashBoxStat = this.data;
        if (cashBoxStat == null) {
            return 0;
        }
        return cashBoxStat.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "QueryCashBoxStatResp(data=" + this.data + ")";
    }
}
