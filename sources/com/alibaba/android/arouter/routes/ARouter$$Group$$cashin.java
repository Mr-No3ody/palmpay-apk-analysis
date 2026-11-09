package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$cashin implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cashin$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_title", 8);
        anonymousClass1.put("extra_type", 8);
        map.put("/cashin/recharge", RouteMeta.build(routeType, RechargeActivity.class, "/cashin/recharge", "cashin", anonymousClass1, -1, Integer.MIN_VALUE));
        map.put("/cashin/ussd_result", RouteMeta.build(routeType, RechargeUSSDResultActivity.class, "/cashin/ussd_result", "cashin", null, -1, Integer.MIN_VALUE));
    }
}
