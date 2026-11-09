package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.CashInReceiptActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RecordDetailActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentTradeRecordDetailActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawInputAmountRedirectActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$cash_in_out implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$cash_in_out$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("orderType", 3);
        anonymousClass1.put("orderNo", 8);
        anonymousClass1.put("extra_type", 8);
        map.put("/cash_in_out/billdetail", RouteMeta.build(routeType, RecordDetailActivity.class, "/cash_in_out/billdetail", "cash_in_out", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_data", 10);
        anonymousClass2.put("extra_type", 4);
        anonymousClass2.put("extra_entry_type", 4);
        map.put("/cash_in_out/bind_bank_card_result", RouteMeta.build(routeType, BindBankCardResultActivity.class, "/cash_in_out/bind_bank_card_result", "cash_in_out", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("orderId", 8);
        map.put("/cash_in_out/detail", RouteMeta.build(routeType, WithdrawAgentTradeRecordDetailActivity.class, "/cash_in_out/detail", "cash_in_out", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("transType", 8);
        anonymousClass4.put("orderId", 8);
        map.put("/cash_in_out/trans_receipt", RouteMeta.build(routeType, CashInReceiptActivity.class, "/cash_in_out/trans_receipt", "cash_in_out", anonymousClass4, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("extra_data", 10);
        map.put("/cash_in_out/withdraw_agent_payment_result", RouteMeta.build(routeType, WithdrawAgentPaymentResultActivity.class, "/cash_in_out/withdraw_agent_payment_result", "cash_in_out", anonymousClass5, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("sn_no", 8);
        anonymousClass6.put("core_order_source_type", 8);
        map.put("/cash_in_out/withdraw_input_amount", RouteMeta.build(routeType, WithdrawInputAmountRedirectActivity.class, "/cash_in_out/withdraw_input_amount", "cash_in_out", anonymousClass6, -1, Integer.MIN_VALUE));
    }
}
