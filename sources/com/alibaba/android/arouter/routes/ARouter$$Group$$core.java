package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.core.ui.activity.CommonTransactionResultActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCommonResultActivity;
import com.transsnet.palmpay.core.ui.activity.H5CorePreviewActivity;
import com.transsnet.palmpay.core.ui.activity.HandleResultPayWithUSSDActivity;
import com.transsnet.palmpay.core.ui.activity.HandleResultPayWithUSSDByPushActivity;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.activity.RNCorePreviewActivity;
import com.transsnet.palmpay.core.ui.activity.USSDPayResultActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$core implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$core$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$core$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$core$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$core$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_title", 8);
        anonymousClass1.put("extra_result", 3);
        anonymousClass1.put("extra_Btn1Text_page", 8);
        anonymousClass1.put("extra_flag", 0);
        anonymousClass1.put("extra_Btn2Text_page", 8);
        anonymousClass1.put("extra_Btn1Text_action", 3);
        anonymousClass1.put("extra_Btn2Text", 8);
        anonymousClass1.put("extra_title_icon", 3);
        anonymousClass1.put("extra_Btn1Text", 8);
        anonymousClass1.put("extra_message", 8);
        anonymousClass1.put("extra_Btn2Text_action", 3);
        atlas.put("/core/common_result", RouteMeta.build(routeType, CoreCommonResultActivity.class, "/core/common_result", "core", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("pay_result_data", 8);
        anonymousClass2.put("orderAmount", 4);
        anonymousClass2.put("transType", 8);
        atlas.put("/core/common_transaction_result", RouteMeta.build(routeType, CommonTransactionResultActivity.class, "/core/common_transaction_result", "core", anonymousClass2, -1, Integer.MIN_VALUE));
        atlas.put("/core/pay_verification_page", RouteMeta.build(routeType, PayVerificationActivity.class, "/core/pay_verification_page", "core", null, -1, Integer.MIN_VALUE));
        atlas.put("/core/preview", RouteMeta.build(routeType, H5CorePreviewActivity.class, "/core/preview", "core", null, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("mobile_channel", 8);
        anonymousClass3.put("business_data", 8);
        atlas.put("/core/result_pay_with_ussd", RouteMeta.build(routeType, HandleResultPayWithUSSDActivity.class, "/core/result_pay_with_ussd", "core", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("mobile_channel", 8);
        anonymousClass4.put("business_data", 8);
        atlas.put("/core/result_pay_with_ussd_by_push", RouteMeta.build(routeType, HandleResultPayWithUSSDByPushActivity.class, "/core/result_pay_with_ussd_by_push", "core", anonymousClass4, -1, Integer.MIN_VALUE));
        atlas.put("/core/rn_preview", RouteMeta.build(routeType, RNCorePreviewActivity.class, "/core/rn_preview", "core", null, -1, Integer.MIN_VALUE));
        atlas.put("/core/ussd_pay_result", RouteMeta.build(routeType, USSDPayResultActivity.class, "/core/ussd_pay_result", "core", null, -1, Integer.MIN_VALUE));
    }
}
