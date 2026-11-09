package com.transsnet.palmpay.main.export.bean.req;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/req/CreateMerchantPaymentOrderReq;", "", "payToken", "", "type", "", "<init>", "(Ljava/lang/String;I)V", "getPayToken", "()Ljava/lang/String;", "setPayToken", "(Ljava/lang/String;)V", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateMerchantPaymentOrderReq {

    @Nullable
    private String payToken;

    @JvmField
    public final int type;

    public CreateMerchantPaymentOrderReq(@Nullable String str, int i7) {
        this.payToken = str;
        this.type = i7;
    }

    @Nullable
    public final String getPayToken() {
        return this.payToken;
    }

    public final void setPayToken(@Nullable String str) {
        this.payToken = str;
    }

    public /* synthetic */ CreateMerchantPaymentOrderReq(String str, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 2 : i7);
    }
}
