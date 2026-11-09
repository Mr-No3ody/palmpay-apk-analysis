package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import com.transsnet.palmpay.ui.activity.CoinRainActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.ui.activity.RateAppActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessResultActivity;
import com.transsnet.palmpay.ui.activity.qr.QrCodeActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantListActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$app implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/app/all_function_activity", RouteMeta.build(routeType, AllFuncationActivityV2.class, "/app/all_function_activity", "app", null, -1, Integer.MIN_VALUE));
        map.put("/app/coin_rain_page", RouteMeta.build(routeType, CoinRainActivity.class, "/app/coin_rain_page", "app", null, -1, Integer.MIN_VALUE));
        map.put("/app/life_bill_payment_page", RouteMeta.build(routeType, LifeBillsHomeActivity.class, "/app/life_bill_payment_page", "app", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("KEY_POSITION", 8);
        map.put("/app/main_qrcode_activity", RouteMeta.build(routeType, QrCodeActivity.class, "/app/main_qrcode_activity", "app", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_amount", 4);
        anonymousClass2.put("QRCODE_STRING", 8);
        anonymousClass2.put("receiver_info", 8);
        map.put("/app/pay_money_to_palmpay_business_preview_page", RouteMeta.build(routeType, PayMoneyToPalmPayBusinessPreviewActivity.class, "/app/pay_money_to_palmpay_business_preview_page", "app", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("key_pending_message", 8);
        anonymousClass3.put("pay_result_data", 8);
        anonymousClass3.put("key_pending_time", 4);
        anonymousClass3.put("orderState", 3);
        map.put("/app/pay_money_to_palmpay_business_result_page", RouteMeta.build(routeType, PayMoneyToPalmPayBusinessResultActivity.class, "/app/pay_money_to_palmpay_business_result_page", "app", anonymousClass3, -1, Integer.MIN_VALUE));
        map.put("/app/rate_app_activity", RouteMeta.build(routeType, RateAppActivity.class, "/app/rate_app_activity", "app", null, -1, Integer.MIN_VALUE));
        map.put("/app/thied_part_merchant", RouteMeta.build(routeType, ThirdPartyMerchantListActivity.class, "/app/thied_part_merchant", "app", null, -1, Integer.MIN_VALUE));
    }
}
