package com.transsnet.palmpay.core.bean.bill;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/bill/SubTransType;", "", "<init>", "()V", "SUB_TRANS_TYPE_COUPON_PACKAGE", "", "getSUB_TRANS_TYPE_COUPON_PACKAGE", "()Ljava/lang/String;", "SUB_TRANS_TYPE_PAY_CODE", "getSUB_TRANS_TYPE_PAY_CODE", "SUB_TRANS_TYPE_MERCHANT_PAY_CODE", "getSUB_TRANS_TYPE_MERCHANT_PAY_CODE", "SUB_TRANS_TYPE_QUICK_BETTING", "getSUB_TRANS_TYPE_QUICK_BETTING", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubTransType {

    @NotNull
    public static final SubTransType INSTANCE = new SubTransType();

    @NotNull
    private static final String SUB_TRANS_TYPE_COUPON_PACKAGE = "w4_01";

    @NotNull
    private static final String SUB_TRANS_TYPE_PAY_CODE = "24_03";

    @NotNull
    private static final String SUB_TRANS_TYPE_MERCHANT_PAY_CODE = "24_04";

    @NotNull
    private static final String SUB_TRANS_TYPE_QUICK_BETTING = "96_01";

    private SubTransType() {
    }

    @NotNull
    public final String getSUB_TRANS_TYPE_COUPON_PACKAGE() {
        return SUB_TRANS_TYPE_COUPON_PACKAGE;
    }

    @NotNull
    public final String getSUB_TRANS_TYPE_MERCHANT_PAY_CODE() {
        return SUB_TRANS_TYPE_MERCHANT_PAY_CODE;
    }

    @NotNull
    public final String getSUB_TRANS_TYPE_PAY_CODE() {
        return SUB_TRANS_TYPE_PAY_CODE;
    }

    @NotNull
    public final String getSUB_TRANS_TYPE_QUICK_BETTING() {
        return SUB_TRANS_TYPE_QUICK_BETTING;
    }
}
