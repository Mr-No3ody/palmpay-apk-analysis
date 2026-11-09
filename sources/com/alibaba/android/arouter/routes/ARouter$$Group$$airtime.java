package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.AirtimeGroupPurchaseResultActivity;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.airtime.ui.ConfirmAirtimeDownTimeActivity;
import com.transsnet.palmpay.airtime.ui.DownTimeTransactionResultActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskManagerActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskStatusActivity;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.ui.USSDTopUpHomeActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashDetailActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$airtime implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$10, reason: invalid class name */
    public class AnonymousClass10 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$11, reason: invalid class name */
    public class AnonymousClass11 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$12, reason: invalid class name */
    public class AnonymousClass12 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$8, reason: invalid class name */
    public class AnonymousClass8 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$airtime$9, reason: invalid class name */
    public class AnonymousClass9 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("bundle_data_downtime_order_result", 9);
        atlas.put("/airtime/airtime_down_time_transaction_result_activity", RouteMeta.build(routeType, DownTimeTransactionResultActivity.class, "/airtime/airtime_down_time_transaction_result_activity", "airtime", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("orderNo", 8);
        atlas.put("/airtime/airtime_group_purchase_result", RouteMeta.build(routeType, AirtimeGroupPurchaseResultActivity.class, "/airtime/airtime_group_purchase_result", "airtime", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("key_phone", 8);
        anonymousClass3.put("extra_data", 3);
        anonymousClass3.put("extra_data_1", 8);
        anonymousClass3.put("extra_type", 0);
        atlas.put("/airtime/airtime_schedule_topup_task_manager", RouteMeta.build(routeType, ScheduleTopUpTaskManagerActivity.class, "/airtime/airtime_schedule_topup_task_manager", "airtime", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("extra_data", 8);
        anonymousClass4.put("extra_data_1", 8);
        atlas.put("/airtime/airtime_schedule_topup_task_status", RouteMeta.build(routeType, ScheduleTopUpTaskStatusActivity.class, "/airtime/airtime_schedule_topup_task_status", "airtime", anonymousClass4, -1, Integer.MIN_VALUE));
        atlas.put("/airtime/auto_top_up_route_page", RouteMeta.build(routeType, ScheduleTopUpHomeActivity.class, "/airtime/auto_top_up_route_page", "airtime", null, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("orderNo", 8);
        anonymousClass5.put("KEY_DATA", 10);
        atlas.put("/airtime/auto_topup_overlay", RouteMeta.build(routeType, AutoTopupOverlayActivity.class, "/airtime/auto_topup_overlay", "airtime", anonymousClass5, -1, Integer.MIN_VALUE));
        atlas.put("/airtime/bill_history_record", RouteMeta.build(routeType, TopUpRecordActivity.class, "/airtime/bill_history_record", "airtime", null, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("orderNo", 8);
        atlas.put("/airtime/billdetail", RouteMeta.build(routeType, AirtimeBillDetailActivity.class, "/airtime/billdetail", "airtime", anonymousClass6, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("extra_data", 9);
        atlas.put("/airtime/down_time_top_up_airtime", RouteMeta.build(routeType, ConfirmAirtimeDownTimeActivity.class, "/airtime/down_time_top_up_airtime", "airtime", anonymousClass7, -1, Integer.MIN_VALUE));
        atlas.put("/airtime/recharge_2_cash", RouteMeta.build(routeType, Recharge2CashHomeActivity.class, "/airtime/recharge_2_cash", "airtime", null, -1, Integer.MIN_VALUE));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        anonymousClass8.put("orderNo", 8);
        atlas.put("/airtime/recharge_2_cash_detail", RouteMeta.build(routeType, Recharge2CashDetailActivity.class, "/airtime/recharge_2_cash_detail", "airtime", anonymousClass8, -1, Integer.MIN_VALUE));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        anonymousClass9.put("key_fail_message", 8);
        anonymousClass9.put("orderNo", 8);
        atlas.put("/airtime/recharge_2_cash_result", RouteMeta.build(routeType, Recharge2CashResultActivity.class, "/airtime/recharge_2_cash_result", "airtime", anonymousClass9, -1, Integer.MIN_VALUE));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        anonymousClass10.put("pay_with_ussd", 0);
        anonymousClass10.put("pay_result_data", 10);
        anonymousClass10.put("mobile_channel", 8);
        atlas.put("/airtime/result_page", RouteMeta.build(routeType, TopupResultActivityV2.class, "/airtime/result_page", "airtime", anonymousClass10, -1, Integer.MIN_VALUE));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        anonymousClass11.put("code", 8);
        anonymousClass11.put(AppsFlyerProperties.CHANNEL, 8);
        anonymousClass11.put("phone_number", 8);
        anonymousClass11.put("couponCode", 8);
        atlas.put("/airtime/top_up_airtime", RouteMeta.build(routeType, TopupAirtimeActivity.class, "/airtime/top_up_airtime", "airtime", anonymousClass11, -1, Integer.MIN_VALUE));
        AnonymousClass12 anonymousClass12 = new AnonymousClass12();
        anonymousClass12.put("transType", 8);
        atlas.put("/airtime/ussd_top_up_route_page", RouteMeta.build(routeType, USSDTopUpHomeActivity.class, "/airtime/ussd_top_up_route_page", "airtime", anonymousClass12, -1, Integer.MIN_VALUE));
    }
}
