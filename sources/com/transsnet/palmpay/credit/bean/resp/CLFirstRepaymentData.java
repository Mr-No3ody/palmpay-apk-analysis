package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLFirstRepaymentData;", "", "repaymentDate", "", "ifPopUp", "", "ifFirstTrade", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getRepaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIfPopUp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIfFirstTrade", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLFirstRepaymentData {

    @Nullable
    private final Boolean ifFirstTrade;

    @Nullable
    private final Boolean ifPopUp;

    @Nullable
    private final Long repaymentDate;

    public CLFirstRepaymentData(@Nullable Long l5, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.repaymentDate = l5;
        this.ifPopUp = bool;
        this.ifFirstTrade = bool2;
    }

    @Nullable
    public final Boolean getIfFirstTrade() {
        return this.ifFirstTrade;
    }

    @Nullable
    public final Boolean getIfPopUp() {
        return this.ifPopUp;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    public /* synthetic */ CLFirstRepaymentData(Long l5, Boolean bool, Boolean bool2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, bool, (i7 & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
