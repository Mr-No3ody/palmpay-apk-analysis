package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHistoryActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRankActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$refer_earn implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$refer_earn$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$refer_earn$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$refer_earn$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data_2", 8);
        anonymousClass1.put("extra_data", 8);
        atlas.put("/refer_earn/comment_list", RouteMeta.build(routeType, ReferEarnCommentListActivity.class, "/refer_earn/comment_list", "refer_earn", anonymousClass1, -1, Integer.MIN_VALUE));
        atlas.put("/refer_earn/history", RouteMeta.build(routeType, ReferEarnHistoryActivity.class, "/refer_earn/history", "refer_earn", null, -1, Integer.MIN_VALUE));
        atlas.put("/refer_earn/homepage", RouteMeta.build(routeType, ReferEarnHomePageActivity.class, "/refer_earn/homepage", "refer_earn", null, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_data", 8);
        atlas.put("/refer_earn/rank", RouteMeta.build(routeType, ReferEarnRankActivity.class, "/refer_earn/rank", "refer_earn", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("extra_data", 8);
        atlas.put("/refer_earn/resolve", RouteMeta.build(routeType, ReferEarnResolveActivity.class, "/refer_earn/resolve", "refer_earn", anonymousClass3, -1, Integer.MIN_VALUE));
    }
}
