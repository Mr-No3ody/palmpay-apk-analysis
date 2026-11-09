package com.alibaba.android.arouter.routes;

import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.transsnet.palmpay.core.push.PushModuleImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Providers$$module_common_impl implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.transsnet.palmpay.core.provider.IPushModule", RouteMeta.build(RouteType.PROVIDER, PushModuleImpl.class, "/push/provider_push", Constants.PUSH, null, -1, Integer.MIN_VALUE));
    }
}
