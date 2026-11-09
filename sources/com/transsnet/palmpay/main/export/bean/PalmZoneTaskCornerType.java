package com.transsnet.palmpay.main.export.bean;

import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionItemBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/PalmZoneTaskCornerType;", "", "<init>", "()V", "OTHER", "", CouponItem.COUPON_TYPE_CASH, CalcPaymentPromotionItemBean.PROMOTION_TYPE_COUPON, "TRIAL_CASH", "CASH_BACK", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneTaskCornerType {
    public static final int CASH = 1;
    public static final int CASH_BACK = 3;
    public static final int COUPON = 2;

    @NotNull
    public static final PalmZoneTaskCornerType INSTANCE = new PalmZoneTaskCornerType();
    public static final int OTHER = 0;
    public static final int TRIAL_CASH = 100;

    private PalmZoneTaskCornerType() {
    }
}
