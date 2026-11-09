package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$p2p implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/p2p/exchange_cash_booking_detail", RouteMeta.build(routeType, BookingDetailPage.class, "/p2p/exchange_cash_booking_detail", "p2p", null, -1, Integer.MIN_VALUE));
        map.put("/p2p/exchange_cash_cashierdesk", RouteMeta.build(routeType, CashierDeskPage.class, "/p2p/exchange_cash_cashierdesk", "p2p", null, -1, Integer.MIN_VALUE));
        map.put("/p2p/exchange_cash_transaction_detail", RouteMeta.build(routeType, TransactionDetailPage.class, "/p2p/exchange_cash_transaction_detail", "p2p", null, -1, Integer.MIN_VALUE));
        map.put("/p2p/nearby_agent_real", RouteMeta.build(routeType, NearbyAgent2Page.class, "/p2p/nearby_agent_real", "p2p", null, -1, Integer.MIN_VALUE));
    }
}
