package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLCurrentBillReq;", "", "billId", "", "loanNo", "", "cardNo", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanNo", "()Ljava/lang/String;", "getCardNo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCurrentBillReq {

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String loanNo;

    public CLCurrentBillReq() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    public CLCurrentBillReq(@Nullable Long l5, @Nullable String str, @Nullable String str2) {
        this.billId = l5;
        this.loanNo = str;
        this.cardNo = str2;
    }

    public /* synthetic */ CLCurrentBillReq(Long l5, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2);
    }
}
