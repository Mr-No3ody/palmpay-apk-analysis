package com.transsnet.palmpay.credit.bean.other;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/other/CLRepayExtensionBean;", "", "loanNo", "", "repayAllFlag", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getLoanNo", "()Ljava/lang/String;", "getRepayAllFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepayExtensionBean {

    @Nullable
    private final String loanNo;

    @Nullable
    private final Boolean repayAllFlag;

    public CLRepayExtensionBean(@Nullable String str, @Nullable Boolean bool) {
        this.loanNo = str;
        this.repayAllFlag = bool;
    }

    @Nullable
    public final String getLoanNo() {
        return this.loanNo;
    }

    @Nullable
    public final Boolean getRepayAllFlag() {
        return this.repayAllFlag;
    }
}
