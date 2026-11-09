package com.alibaba.android.arouter.routes;

import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$module_common_impl implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("common", ARouter$$Group$$common.class);
        map.put("coreImpl", ARouter$$Group$$coreImpl.class);
        map.put(Constants.PUSH, ARouter$$Group$$push.class);
    }
}
