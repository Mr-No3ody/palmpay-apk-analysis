package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/BorrowAllDiscountConfig;", "", "ifMatchTag", "", "discountRatio", "", "discountLimit", "", "<init>", "(ZDJ)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorrowAllDiscountConfig {

    @JvmField
    public final long discountLimit;

    @JvmField
    public final double discountRatio;

    @JvmField
    public final boolean ifMatchTag;

    public BorrowAllDiscountConfig(boolean z3, double d2, long j6) {
        this.ifMatchTag = z3;
        this.discountRatio = d2;
        this.discountLimit = j6;
    }
}
