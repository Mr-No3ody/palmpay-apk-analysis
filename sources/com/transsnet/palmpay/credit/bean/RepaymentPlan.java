package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/RepaymentPlan;", "", "currentTerm", "", "repaymentDate", "", "unpaidAmount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RepaymentPlan {

    @JvmField
    @Nullable
    public final Integer currentTerm;

    @JvmField
    @Nullable
    public final Long repaymentDate;

    @JvmField
    @Nullable
    public final Long unpaidAmount;

    public RepaymentPlan(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6) {
        this.currentTerm = num;
        this.repaymentDate = l5;
        this.unpaidAmount = l6;
    }
}
