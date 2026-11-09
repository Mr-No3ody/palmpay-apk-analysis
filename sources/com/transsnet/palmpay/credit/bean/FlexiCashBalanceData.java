package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/FlexiCashBalanceData;", "", "flexiBalanceDto", "Lcom/transsnet/palmpay/credit/bean/FlexiCashBalance;", "cashBalanceDto", "<init>", "(Lcom/transsnet/palmpay/credit/bean/FlexiCashBalance;Lcom/transsnet/palmpay/credit/bean/FlexiCashBalance;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiCashBalanceData {

    @JvmField
    @Nullable
    public final FlexiCashBalance cashBalanceDto;

    @JvmField
    @Nullable
    public final FlexiCashBalance flexiBalanceDto;

    public FlexiCashBalanceData(@Nullable FlexiCashBalance flexiCashBalance, @Nullable FlexiCashBalance flexiCashBalance2) {
        this.flexiBalanceDto = flexiCashBalance;
        this.cashBalanceDto = flexiCashBalance2;
    }
}
