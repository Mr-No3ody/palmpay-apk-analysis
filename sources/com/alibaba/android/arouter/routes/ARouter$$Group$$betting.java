package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$betting implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$betting$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("orderNo", 8);
        anonymousClass1.put("extra_data", 8);
        atlas.put("/betting/auto_renew_overlay", RouteMeta.build(routeType, BettingAutoRenewOverlayActivity.class, "/betting/auto_renew_overlay", "betting", anonymousClass1, -1, Integer.MIN_VALUE));
    }
}
