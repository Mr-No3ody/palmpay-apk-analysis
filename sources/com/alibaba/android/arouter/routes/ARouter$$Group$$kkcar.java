package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.send_money.ui.activity.kkcar.KkCarHostActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$kkcar implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/kkcar/passenger", RouteMeta.build(RouteType.ACTIVITY, KkCarHostActivity.class, "/kkcar/passenger", "kkcar", null, -1, Integer.MIN_VALUE));
    }
}
