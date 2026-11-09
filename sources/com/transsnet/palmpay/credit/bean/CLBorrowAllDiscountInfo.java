package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/CLBorrowAllDiscountInfo;", "", "ifBorrowAll", "", "ifDiscount", "discountRatio", "", "discountLimit", "", "<init>", "(ZZDJ)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowAllDiscountInfo {

    @JvmField
    public final long discountLimit;

    @JvmField
    public final double discountRatio;

    @JvmField
    public final boolean ifBorrowAll;

    @JvmField
    public final boolean ifDiscount;

    public CLBorrowAllDiscountInfo(boolean z3, boolean z8, double d2, long j6) {
        this.ifBorrowAll = z3;
        this.ifDiscount = z8;
        this.discountRatio = d2;
        this.discountLimit = j6;
    }
}
