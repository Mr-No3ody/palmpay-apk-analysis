package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLMainOkCardBill;", "", "cardNo", "", "outstandingAmount", "", "repaymentDateStamp", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getCardNo", "()Ljava/lang/String;", "getOutstandingAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDateStamp", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainOkCardBill {

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long repaymentDateStamp;

    public CLMainOkCardBill(@Nullable String str, @Nullable Long l5, @Nullable Long l6) {
        this.cardNo = str;
        this.outstandingAmount = l5;
        this.repaymentDateStamp = l6;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getRepaymentDateStamp() {
        return this.repaymentDateStamp;
    }
}
