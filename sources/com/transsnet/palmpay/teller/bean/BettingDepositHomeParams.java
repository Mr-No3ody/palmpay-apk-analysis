package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingDepositHomeParams;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "clearCustomerId", "", "billerId", "", "isCouponClick", "Lkotlin/Function0;", "", "<init>", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getClearCustomerId", "()Z", "setClearCustomerId", "(Z)V", "()Lkotlin/jvm/functions/Function0;", "setCouponClick", "(Lkotlin/jvm/functions/Function0;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingDepositHomeParams implements SingleLiveData$Params {

    @NotNull
    private String billerId;
    private boolean clearCustomerId;

    @Nullable
    private Function0<Unit> isCouponClick;

    public BettingDepositHomeParams(boolean z3, @NotNull String billerId, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        this.clearCustomerId = z3;
        this.billerId = billerId;
        this.isCouponClick = function0;
    }

    @NotNull
    public final String getBillerId() {
        return this.billerId;
    }

    public final boolean getClearCustomerId() {
        return this.clearCustomerId;
    }

    @Nullable
    public final Function0<Unit> isCouponClick() {
        return this.isCouponClick;
    }

    public final void setBillerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.billerId = str;
    }

    public final void setClearCustomerId(boolean z3) {
        this.clearCustomerId = z3;
    }

    public final void setCouponClick(@Nullable Function0<Unit> function0) {
        this.isCouponClick = function0;
    }
}
