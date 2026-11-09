package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.mall.ui.activity.GrabOrderDetailActivity;
import com.transsnet.palmpay.mall.ui.activity.MallPaymentOrderDetailActivity;
import com.transsnet.palmpay.mall.ui.activity.MallPhotoViewActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$mall implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$mall$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/mall/grab_order_detail_activity", RouteMeta.build(routeType, GrabOrderDetailActivity.class, "/mall/grab_order_detail_activity", "mall", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data_2", 9);
        anonymousClass1.put("extra_data_1", 9);
        anonymousClass1.put("extra_data", 3);
        map.put("/mall/grab_photo_activity", RouteMeta.build(routeType, MallPhotoViewActivity.class, "/mall/grab_photo_activity", "mall", anonymousClass1, -1, Integer.MIN_VALUE));
        map.put("/mall/payment_order_detail_page", RouteMeta.build(routeType, MallPaymentOrderDetailActivity.class, "/mall/payment_order_detail_page", "mall", null, -1, Integer.MIN_VALUE));
    }
}
