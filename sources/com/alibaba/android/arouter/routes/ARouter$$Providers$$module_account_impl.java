package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.transsnet.palmpay.account.export.AccountModuleImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Providers$$module_account_impl implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.transsnet.palmpay.core.provider.IAccountModule", RouteMeta.build(RouteType.PROVIDER, AccountModuleImpl.class, "/account/provier", "account", null, -1, Integer.MIN_VALUE));
    }
}
