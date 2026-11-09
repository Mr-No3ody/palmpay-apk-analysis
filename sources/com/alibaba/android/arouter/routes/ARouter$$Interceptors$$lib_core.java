package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.transsnet.palmpay.core.interceptor.AnimationInterceptor;
import com.transsnet.palmpay.core.interceptor.MultiLaunchInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Interceptors$$lib_core implements IInterceptorGroup {
    @Override // com.alibaba.android.arouter.facade.template.IInterceptorGroup
    public void loadInto(Map<Integer, Class<? extends IInterceptor>> interceptors) {
        interceptors.put(5, MultiLaunchInterceptor.class);
        interceptors.put(6, AnimationInterceptor.class);
    }
}
