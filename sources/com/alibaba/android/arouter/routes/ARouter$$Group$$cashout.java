package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$cashout implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cashout$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/cashout/confirm_withdrw_order", RouteMeta.build(routeType, ConfirmAndPayWithdrawOrderActivity.class, "/cashout/confirm_withdrw_order", "cashout", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_type", 3);
        map.put("/cashout/withdraw_home", RouteMeta.build(routeType, WithdrawHomeActivity.class, "/cashout/withdraw_home", "cashout", anonymousClass1, -1, Integer.MIN_VALUE));
        map.put("/cashout/withdraw_query_account", RouteMeta.build(routeType, WithdrawQueryAccountListActivity.class, "/cashout/withdraw_query_account", "cashout", null, -1, Integer.MIN_VALUE));
    }
}
