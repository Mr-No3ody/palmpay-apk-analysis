package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterContentType;", "", "<init>", "()V", "CONTENT_TYPE_COUPON", "", "getCONTENT_TYPE_COUPON", "()I", "CONTENT_TYPE_COUPON_COMBO", "getCONTENT_TYPE_COUPON_COMBO", "CONTENT_TYPE_PALM_POINTS", "getCONTENT_TYPE_PALM_POINTS", "CONTENT_TYPE_TRAIL_CASH", "getCONTENT_TYPE_TRAIL_CASH", "CONTENT_TYPE_MARKETING_JUMP", "getCONTENT_TYPE_MARKETING_JUMP", "CONTENT_TYPE_REWARD_TASK", "getCONTENT_TYPE_REWARD_TASK", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeRewardsCenterContentType {

    @NotNull
    public static final HomeRewardsCenterContentType INSTANCE = new HomeRewardsCenterContentType();
    private static final int CONTENT_TYPE_COUPON = 1;
    private static final int CONTENT_TYPE_COUPON_COMBO = 2;
    private static final int CONTENT_TYPE_PALM_POINTS = 3;
    private static final int CONTENT_TYPE_TRAIL_CASH = 4;
    private static final int CONTENT_TYPE_MARKETING_JUMP = 5;
    private static final int CONTENT_TYPE_REWARD_TASK = 7;

    private HomeRewardsCenterContentType() {
    }

    public final int getCONTENT_TYPE_COUPON() {
        return CONTENT_TYPE_COUPON;
    }

    public final int getCONTENT_TYPE_COUPON_COMBO() {
        return CONTENT_TYPE_COUPON_COMBO;
    }

    public final int getCONTENT_TYPE_MARKETING_JUMP() {
        return CONTENT_TYPE_MARKETING_JUMP;
    }

    public final int getCONTENT_TYPE_PALM_POINTS() {
        return CONTENT_TYPE_PALM_POINTS;
    }

    public final int getCONTENT_TYPE_REWARD_TASK() {
        return CONTENT_TYPE_REWARD_TASK;
    }

    public final int getCONTENT_TYPE_TRAIL_CASH() {
        return CONTENT_TYPE_TRAIL_CASH;
    }
}
