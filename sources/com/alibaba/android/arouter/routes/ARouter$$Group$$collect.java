package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import com.transsnet.palmpay.send_money.ui.activity.MoneyTransferRecordActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$collect implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/collect/record", RouteMeta.build(RouteType.ACTIVITY, MoneyTransferRecordActivity.class, "/collect/record", CoinRewardDialog.TYPE_URL_COLLECT, null, -1, Integer.MIN_VALUE));
    }
}
