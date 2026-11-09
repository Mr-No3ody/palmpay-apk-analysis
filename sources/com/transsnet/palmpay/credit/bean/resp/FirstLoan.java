package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/FirstLoan;", "", "freePasswordFlag", "", "firstLoanFlag", "productSubId", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getFreePasswordFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFirstLoanFlag", "getProductSubId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FirstLoan {

    @Nullable
    private final Boolean firstLoanFlag;

    @Nullable
    private final Boolean freePasswordFlag;

    @Nullable
    private final Integer productSubId;

    public FirstLoan(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num) {
        this.freePasswordFlag = bool;
        this.firstLoanFlag = bool2;
        this.productSubId = num;
    }

    @Nullable
    public final Boolean getFirstLoanFlag() {
        return this.firstLoanFlag;
    }

    @Nullable
    public final Boolean getFreePasswordFlag() {
        return this.freePasswordFlag;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }
}
