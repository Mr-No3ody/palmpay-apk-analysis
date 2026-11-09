package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$module_biller_impl implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> routes) {
        routes.put("airtime", ARouter$$Group$$airtime.class);
        routes.put("betting", ARouter$$Group$$betting.class);
        routes.put("databundle", ARouter$$Group$$databundle.class);
        routes.put("quick_teller", ARouter$$Group$$quick_teller.class);
    }
}
