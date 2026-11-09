package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.send_money.ui.activity.NibssMoneyInRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeMerchantActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.CreateBankShortcutActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.PersonalHomePageActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$send implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$send$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$send$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$send$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$send$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data", 10);
        map.put("/send/complete", RouteMeta.build(routeType, TransferResultActivity.class, "/send/complete", "send", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("accountNo", 8);
        anonymousClass2.put("core_order_source_type", 8);
        map.put("/send/money", RouteMeta.build(routeType, TransferToPalmPayHomeActivity.class, "/send/money", "send", anonymousClass2, -1, Integer.MIN_VALUE));
        map.put("/send/nibss_money_in", RouteMeta.build(routeType, NibssMoneyInRecordDetailActivity.class, "/send/nibss_money_in", "send", null, -1, Integer.MIN_VALUE));
        map.put("/send/pay_me", RouteMeta.build(routeType, PayMeActivity.class, "/send/pay_me", "send", null, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("extra_data", 9);
        map.put("/send/pay_me_merchant", RouteMeta.build(routeType, PayMeMerchantActivity.class, "/send/pay_me_merchant", "send", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("extra_data", 8);
        anonymousClass4.put("MEMBER_ID", 8);
        anonymousClass4.put("phone_number", 8);
        anonymousClass4.put("extra_type", 3);
        anonymousClass4.put("isHideInfo", 0);
        map.put("/send/personnal_home_page", RouteMeta.build(routeType, PersonalHomePageActivity.class, "/send/personnal_home_page", "send", anonymousClass4, -1, Integer.MIN_VALUE));
        map.put("/send/shortcut", RouteMeta.build(routeType, CreateBankShortcutActivity.class, "/send/shortcut", "send", null, -1, Integer.MIN_VALUE));
    }
}
