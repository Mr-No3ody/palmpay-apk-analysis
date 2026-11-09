package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionItemBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterShowType;", "", "<init>", "()V", CalcPaymentPromotionItemBean.PROMOTION_TYPE_COUPON, "", "getCOUPON", "()I", "COUPON_COMBO", "getCOUPON_COMBO", "TASK", "getTASK", "OLD_MARKETING_CENTER", "getOLD_MARKETING_CENTER", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsCenterShowType {

    @NotNull
    public static final HomeRewardsCenterShowType INSTANCE = new HomeRewardsCenterShowType();
    private static final int COUPON = 1;
    private static final int COUPON_COMBO = 2;
    private static final int TASK = 3;
    private static final int OLD_MARKETING_CENTER = 4;

    private HomeRewardsCenterShowType() {
    }

    public final int getCOUPON() {
        return COUPON;
    }

    public final int getCOUPON_COMBO() {
        return COUPON_COMBO;
    }

    public final int getOLD_MARKETING_CENTER() {
        return OLD_MARKETING_CENTER;
    }

    public final int getTASK() {
        return TASK;
    }
}
