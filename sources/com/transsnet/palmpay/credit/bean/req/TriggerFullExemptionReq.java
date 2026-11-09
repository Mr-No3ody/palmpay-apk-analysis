package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/TriggerFullExemptionReq;", "", "accountType", "", "loanNo", "", "billId", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLoanNo", "()Ljava/lang/String;", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/credit/bean/req/TriggerFullExemptionReq;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TriggerFullExemptionReq {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final Long billId;

    @Nullable
    private final String loanNo;

    public TriggerFullExemptionReq(@Nullable Integer num, @Nullable String str, @Nullable Long l5) {
        this.accountType = num;
        this.loanNo = str;
        this.billId = l5;
    }

    public static /* synthetic */ TriggerFullExemptionReq copy$default(TriggerFullExemptionReq triggerFullExemptionReq, Integer num, String str, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = triggerFullExemptionReq.accountType;
        }
        if ((i7 & 2) != 0) {
            str = triggerFullExemptionReq.loanNo;
        }
        if ((i7 & 4) != 0) {
            l5 = triggerFullExemptionReq.billId;
        }
        return triggerFullExemptionReq.copy(num, str, l5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBillId() {
        return this.billId;
    }

    @NotNull
    public final TriggerFullExemptionReq copy(@Nullable Integer accountType, @Nullable String loanNo, @Nullable Long billId) {
        return new TriggerFullExemptionReq(accountType, loanNo, billId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerFullExemptionReq)) {
            return false;
        }
        TriggerFullExemptionReq triggerFullExemptionReq = (TriggerFullExemptionReq) other;
        return Intrinsics.c(this.accountType, triggerFullExemptionReq.accountType) && Intrinsics.c(this.loanNo, triggerFullExemptionReq.loanNo) && Intrinsics.c(this.billId, triggerFullExemptionReq.billId);
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    public int hashCode() {
        Integer num = this.accountType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.loanNo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l5 = this.billId;
        return iHashCode2 + (l5 != null ? l5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TriggerFullExemptionReq(accountType=" + this.accountType + ", loanNo=" + this.loanNo + ", billId=" + this.billId + ")";
    }
}
