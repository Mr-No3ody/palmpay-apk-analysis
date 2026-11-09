package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/PalmPayCardBillDetailReq;", "", "cardNo", "", "billId", "", "billedFlag", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getCardNo", "()Ljava/lang/String;", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBilledFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayCardBillDetailReq {

    @Nullable
    private final Long billId;

    @Nullable
    private final Boolean billedFlag;

    @Nullable
    private final String cardNo;

    public PalmPayCardBillDetailReq() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final Boolean getBilledFlag() {
        return this.billedFlag;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    public PalmPayCardBillDetailReq(@Nullable String str, @Nullable Long l5, @Nullable Boolean bool) {
        this.cardNo = str;
        this.billId = l5;
        this.billedFlag = bool;
    }

    public /* synthetic */ PalmPayCardBillDetailReq(String str, Long l5, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : l5, (i7 & 4) != 0 ? Boolean.FALSE : bool);
    }
}
