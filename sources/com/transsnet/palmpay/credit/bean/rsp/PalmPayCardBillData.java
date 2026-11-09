package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/PalmPayCardBillData;", "", "cardNo", "", "unpaidAmount", "", "unpaidPrincipal", "unpaidPenalty", "unpaidInterest", "unpaidServiceFee", "repaymentDate", "repaymentDateStamp", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getCardNo", "()Ljava/lang/String;", "getUnpaidAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUnpaidPrincipal", "getUnpaidPenalty", "getUnpaidInterest", "getUnpaidServiceFee", "getRepaymentDate", "getRepaymentDateStamp", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayCardBillData {

    @Nullable
    private final String cardNo;

    @Nullable
    private final String repaymentDate;

    @Nullable
    private final Long repaymentDateStamp;

    @Nullable
    private final Long unpaidAmount;

    @Nullable
    private final Long unpaidInterest;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final Long unpaidPrincipal;

    @Nullable
    private final Long unpaidServiceFee;

    public PalmPayCardBillData(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable String str2, @Nullable Long l12) {
        this.cardNo = str;
        this.unpaidAmount = l5;
        this.unpaidPrincipal = l6;
        this.unpaidPenalty = l8;
        this.unpaidInterest = l10;
        this.unpaidServiceFee = l11;
        this.repaymentDate = str2;
        this.repaymentDateStamp = l12;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }

    @Nullable
    public final Long getUnpaidAmount() {
        return this.unpaidAmount;
    }

    @Nullable
    public final Long getUnpaidInterest() {
        return this.unpaidInterest;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final Long getUnpaidPrincipal() {
        return this.unpaidPrincipal;
    }

    @Nullable
    public final Long getUnpaidServiceFee() {
        return this.unpaidServiceFee;
    }
}
