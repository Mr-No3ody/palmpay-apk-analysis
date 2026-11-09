package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$request implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$request$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_type", 3);
        map.put("/request/input_mobile", RouteMeta.build(routeType, InputMobileActivity.class, "/request/input_mobile", "request", anonymousClass1, -1, Integer.MIN_VALUE));
    }
}
