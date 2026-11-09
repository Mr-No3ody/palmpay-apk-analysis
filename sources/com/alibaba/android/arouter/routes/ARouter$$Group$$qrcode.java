package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.send_money.ui.activity.QrcodeScanActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$qrcode implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$qrcode$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("SCAN_TRANS_TYPE", 3);
        anonymousClass1.put("core_order_source_type", 8);
        map.put("/qrcode/scan", RouteMeta.build(routeType, QrcodeScanActivity.class, "/qrcode/scan", GetCustomerServiceUrlReq.ENTER_TYPE_QRCODE, anonymousClass1, -1, Integer.MIN_VALUE));
    }
}
