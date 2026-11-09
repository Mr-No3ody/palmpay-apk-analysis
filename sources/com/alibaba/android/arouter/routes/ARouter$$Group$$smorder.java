package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.send_money.ui.activity.AgentTradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.B2CTradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$smorder implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/smorder/agent_detail", RouteMeta.build(routeType, AgentTradeRecordDetailActivity.class, "/smorder/agent_detail", "smorder", null, -1, Integer.MIN_VALUE));
        map.put("/smorder/b2c_detail", RouteMeta.build(routeType, B2CTradeRecordDetailActivity.class, "/smorder/b2c_detail", "smorder", null, -1, Integer.MIN_VALUE));
        map.put("/smorder/detail", RouteMeta.build(routeType, TradeRecordDetailActivity.class, "/smorder/detail", "smorder", null, -1, Integer.MIN_VALUE));
    }
}
