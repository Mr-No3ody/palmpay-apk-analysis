package com.transsnet.palmpay.core.bean.cashier;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierAddablePaymentMethodsBean;", "", "senderAccountType", "", "<init>", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierAddablePaymentMethodsBean {

    @JvmField
    @Nullable
    public Integer senderAccountType;

    /* JADX WARN: Multi-variable type inference failed */
    public CashierAddablePaymentMethodsBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CashierAddablePaymentMethodsBean(@Nullable Integer num) {
        this.senderAccountType = num;
    }

    public /* synthetic */ CashierAddablePaymentMethodsBean(Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num);
    }
}
