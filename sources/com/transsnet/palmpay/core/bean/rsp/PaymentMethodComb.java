package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/PaymentMethodComb;", "", "paymentMethod", "", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethod", "()Ljava/lang/String;", "setPaymentMethod", "(Ljava/lang/String;)V", "getJumpUrl", "setJumpUrl", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentMethodComb {

    @Nullable
    private String jumpUrl;

    @Nullable
    private String paymentMethod;

    public PaymentMethodComb(@Nullable String str, @Nullable String str2) {
        this.paymentMethod = str;
        this.jumpUrl = str2;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPaymentMethod(@Nullable String str) {
        this.paymentMethod = str;
    }
}
