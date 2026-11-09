package com.transsnet.palmpay.credit.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLCanBorrowData;", "", "can", "", "maxLoanDays", "", "maxLoanAmt", "minLoanAmt", "msg", "", "productSubIdList", "", "", "cardNo", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getMaxLoanAmt", "()Ljava/lang/Long;", "setMaxLoanAmt", "(Ljava/lang/Long;)V", "getMinLoanAmt", "setMinLoanAmt", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCanBorrowData {

    @JvmField
    @Nullable
    public final Boolean can;

    @JvmField
    @Nullable
    public final String cardNo;

    @Nullable
    private Long maxLoanAmt;

    @JvmField
    @Nullable
    public final Long maxLoanDays;

    @Nullable
    private Long minLoanAmt;

    @JvmField
    @Nullable
    public final String msg;

    @JvmField
    @Nullable
    public final List<Integer> productSubIdList;

    public CLCanBorrowData(@Nullable Boolean bool, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str, @Nullable List<Integer> list, @Nullable String str2) {
        this.can = bool;
        this.maxLoanDays = l5;
        this.maxLoanAmt = l6;
        this.minLoanAmt = l8;
        this.msg = str;
        this.productSubIdList = list;
        this.cardNo = str2;
    }

    @Nullable
    public final Long getMaxLoanAmt() {
        return this.maxLoanAmt;
    }

    @Nullable
    public final Long getMinLoanAmt() {
        return this.minLoanAmt;
    }

    public final void setMaxLoanAmt(@Nullable Long l5) {
        this.maxLoanAmt = l5;
    }

    public final void setMinLoanAmt(@Nullable Long l5) {
        this.minLoanAmt = l5;
    }

    public /* synthetic */ CLCanBorrowData(Boolean bool, Long l5, Long l6, Long l8, String str, List list, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, l5, l6, l8, str, list, (i7 & 64) != 0 ? null : str2);
    }
}
