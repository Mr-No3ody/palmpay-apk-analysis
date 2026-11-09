package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.transsnet.palmpay.core.interceptor.CheckLogInInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Interceptors$$module_common_impl implements IInterceptorGroup {
    @Override // com.alibaba.android.arouter.facade.template.IInterceptorGroup
    public void loadInto(Map<Integer, Class<? extends IInterceptor>> map) {
        map.put(7, CheckLogInInterceptor.class);
    }
}
