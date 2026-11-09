package com.transsnet.palmpay.credit.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/OpenCashData;", "", "openInstallmentCash", "", "<init>", "(Ljava/lang/Boolean;)V", "getOpenInstallmentCash", "()Ljava/lang/Boolean;", "setOpenInstallmentCash", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenCashData {

    @Nullable
    private Boolean openInstallmentCash;

    public OpenCashData(@Nullable Boolean bool) {
        this.openInstallmentCash = bool;
    }

    @Nullable
    public final Boolean getOpenInstallmentCash() {
        return this.openInstallmentCash;
    }

    public final void setOpenInstallmentCash(@Nullable Boolean bool) {
        this.openInstallmentCash = bool;
    }
}
