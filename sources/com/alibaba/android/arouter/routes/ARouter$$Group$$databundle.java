package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoRenewTaskStatusActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$databundle implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$databundle$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$databundle$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("order_detail_type", 10);
        anonymousClass1.put("orderNo", 8);
        atlas.put("/databundle/auto_renew_overlay", RouteMeta.build(routeType, DataBundleAutoTopupOverlayActivity.class, "/databundle/auto_renew_overlay", "databundle", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_sub_id", 8);
        atlas.put("/databundle/auto_renew_task_status", RouteMeta.build(routeType, DataBundleAutoRenewTaskStatusActivity.class, "/databundle/auto_renew_task_status", "databundle", anonymousClass2, -1, Integer.MIN_VALUE));
    }
}
