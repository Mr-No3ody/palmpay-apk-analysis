package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.cash_in.ui.activity.FundResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$cashin_out implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cashin_out$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cashin_out$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/cashin_out/add_money", RouteMeta.build(routeType, AddMoneyHomeActivity.class, "/cashin_out/add_money", "cashin_out", null, -1, Integer.MIN_VALUE));
        map.put("/cashin_out/fund_instructions", RouteMeta.build(routeType, InterBankCashInInstructionActivity.class, "/cashin_out/fund_instructions", "cashin_out", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data", 10);
        map.put("/cashin_out/fund_result", RouteMeta.build(routeType, FundResultActivity.class, "/cashin_out/fund_result", "cashin_out", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_data", 10);
        map.put("/cashin_out/withdraw_result", RouteMeta.build(routeType, WithdrawResultActivity.class, "/cashin_out/withdraw_result", "cashin_out", anonymousClass2, -1, Integer.MIN_VALUE));
    }
}
