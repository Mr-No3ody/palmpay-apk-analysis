package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity;
import com.transsnet.palmpay.core.ui.activity.AddNewCardWithPaymentActivity;
import com.transsnet.palmpay.core.ui.activity.BindNewBankAccountActivity;
import com.transsnet.palmpay.core.ui.activity.CommonClaimRewardActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import com.transsnet.palmpay.core.ui.activity.CoreReceiptShareActivity;
import com.transsnet.palmpay.core.ui.activity.CoreTransactionReceiptActivity;
import com.transsnet.palmpay.core.ui.activity.CoreUssdListActivity;
import com.transsnet.palmpay.core.ui.activity.ExpressageInfoActivity;
import com.transsnet.palmpay.core.ui.activity.InputCardPinActivity;
import com.transsnet.palmpay.core.ui.activity.PPRNActivity;
import com.transsnet.palmpay.core.ui.activity.RiskControlVerifyActivity;
import com.transsnet.palmpay.core.ui.activity.VerifyRealNameAlertActivity;
import com.transsnet.palmpay.core.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.core.ui.fragment.AddBankCardFragmentV2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$coreImpl implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$10, reason: invalid class name */
    public class AnonymousClass10 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$8, reason: invalid class name */
    public class AnonymousClass8 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$coreImpl$9, reason: invalid class name */
    public class AnonymousClass9 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.FRAGMENT;
        map.put("/coreImpl/add_account_fragment", RouteMeta.build(routeType, AddBankAccountFragment.class, "/coreimpl/add_account_fragment", "coreimpl", null, -1, Integer.MIN_VALUE));
        RouteType routeType2 = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data_1", 8);
        map.put("/coreImpl/add_new_bank_account", RouteMeta.build(routeType2, AddNewBankAccountActivity.class, "/coreimpl/add_new_bank_account", "coreimpl", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_type", 3);
        map.put("/coreImpl/add_new_card", RouteMeta.build(routeType2, AddBankCardAccountActivity.class, "/coreimpl/add_new_card", "coreimpl", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("extra_data", 10);
        anonymousClass3.put("extra_data_1", 8);
        anonymousClass3.put("me_bind_bank_card", 0);
        anonymousClass3.put("business_type", 4);
        anonymousClass3.put("extra_entry_type", 4);
        anonymousClass3.put("real_name_auth", 0);
        map.put("/coreImpl/add_new_fragment", RouteMeta.build(routeType, AddBankCardFragmentV2.class, "/coreimpl/add_new_fragment", "coreimpl", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("extra_data", 10);
        anonymousClass4.put("extra_type", 3);
        anonymousClass4.put("businessType", 8);
        anonymousClass4.put("real_name_auth", 0);
        map.put("/coreImpl/bind_new_bank_account", RouteMeta.build(routeType2, BindNewBankAccountActivity.class, "/coreimpl/bind_new_bank_account", "coreimpl", anonymousClass4, -1, Integer.MIN_VALUE));
        map.put("/coreImpl/claim_reward", RouteMeta.build(routeType2, CommonClaimRewardActivity.class, "/coreimpl/claim_reward", "coreimpl", null, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("orderNo", 8);
        anonymousClass5.put("COMMENT_TYPE", 8);
        map.put("/coreImpl/comment_add", RouteMeta.build(routeType2, CoreCommentActivity.class, "/coreimpl/comment_add", "coreimpl", anonymousClass5, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("orderType", 3);
        anonymousClass6.put("orderNo", 8);
        map.put("/coreImpl/expressage_infomation", RouteMeta.build(routeType2, ExpressageInfoActivity.class, "/coreimpl/expressage_infomation", "coreimpl", anonymousClass6, -1, Integer.MIN_VALUE));
        map.put("/coreImpl/input_card_pin_activity", RouteMeta.build(routeType2, InputCardPinActivity.class, "/coreimpl/input_card_pin_activity", "coreimpl", null, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("extra_data", 8);
        anonymousClass7.put("extra_type", 3);
        anonymousClass7.put("extra_message", 8);
        map.put("/coreImpl/modify_real_name_alert", RouteMeta.build(routeType2, VerifyRealNameAlertActivity.class, "/coreimpl/modify_real_name_alert", "coreimpl", anonymousClass7, -1, Integer.MIN_VALUE));
        map.put("/coreImpl/receipt_share_page", RouteMeta.build(routeType2, CoreReceiptShareActivity.class, "/coreimpl/receipt_share_page", "coreimpl", null, -1, Integer.MIN_VALUE));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        anonymousClass8.put("extra_data", 10);
        map.put("/coreImpl/risk_control_verify", RouteMeta.build(routeType2, RiskControlVerifyActivity.class, "/coreimpl/risk_control_verify", "coreimpl", anonymousClass8, -1, Integer.MIN_VALUE));
        map.put("/coreImpl/rn_host", RouteMeta.build(routeType2, PPRNActivity.class, "/coreimpl/rn_host", "coreimpl", null, -1, Integer.MIN_VALUE));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        anonymousClass9.put("extra_amount", 4);
        anonymousClass9.put("extra_data_2", 9);
        anonymousClass9.put("extra_title", 8);
        anonymousClass9.put("extra_data", 4);
        anonymousClass9.put("extra_data_1", 9);
        anonymousClass9.put("extra_title_icon", 8);
        anonymousClass9.put("extra_message", 8);
        map.put("/coreImpl/transaction_receipt_page", RouteMeta.build(routeType2, CoreTransactionReceiptActivity.class, "/coreimpl/transaction_receipt_page", "coreimpl", anonymousClass9, -1, Integer.MIN_VALUE));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        anonymousClass10.put("businessType", 8);
        anonymousClass10.put("titleLine2", 8);
        anonymousClass10.put("titleLine1", 8);
        map.put("/coreImpl/use_new_card", RouteMeta.build(routeType2, AddNewCardWithPaymentActivity.class, "/coreimpl/use_new_card", "coreimpl", anonymousClass10, -1, Integer.MIN_VALUE));
        map.put("/coreImpl/ussd_list_page", RouteMeta.build(routeType2, CoreUssdListActivity.class, "/coreimpl/ussd_list_page", "coreimpl", null, -1, Integer.MIN_VALUE));
    }
}
