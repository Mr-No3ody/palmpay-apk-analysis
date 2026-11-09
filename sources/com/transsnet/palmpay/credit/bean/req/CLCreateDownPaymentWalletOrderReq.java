package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLCreateDownPaymentWalletOrderReq;", "", "businessOrderNo", "", "paymentMethod", "", "<init>", "(Ljava/lang/String;I)V", "getBusinessOrderNo", "()Ljava/lang/String;", "getPaymentMethod", "()I", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCreateDownPaymentWalletOrderReq {

    @Nullable
    private final String businessOrderNo;
    private final int paymentMethod;

    public CLCreateDownPaymentWalletOrderReq(@Nullable String str, int i7) {
        this.businessOrderNo = str;
        this.paymentMethod = i7;
    }

    @Nullable
    public final String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public final int getPaymentMethod() {
        return this.paymentMethod;
    }

    public /* synthetic */ CLCreateDownPaymentWalletOrderReq(String str, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 4 : i7);
    }
}
