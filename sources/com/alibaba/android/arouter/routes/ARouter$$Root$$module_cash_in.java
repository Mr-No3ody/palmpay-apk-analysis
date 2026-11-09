package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$module_cash_in implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("cash_in_out", ARouter$$Group$$cash_in_out.class);
        map.put("cashin", ARouter$$Group$$cashin.class);
        map.put("cashin_out", ARouter$$Group$$cashin_out.class);
        map.put("cashout", ARouter$$Group$$cashout.class);
    }
}
