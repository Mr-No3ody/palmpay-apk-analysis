package com.transsnet.palmpay.core.interceptor;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/* JADX INFO: loaded from: classes3.dex */
@Interceptor(priority = 5)
public class MultiLaunchInterceptor implements IInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27396b;

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
        this.f27395a = 0L;
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public final void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (postcard != null && !TextUtils.isEmpty(this.f27396b) && this.f27396b.equals(postcard.getPath()) && SystemClock.elapsedRealtime() - this.f27395a <= 1000) {
            interceptorCallback.onInterrupt(null);
            return;
        }
        this.f27396b = postcard.getPath();
        this.f27395a = SystemClock.elapsedRealtime();
        interceptorCallback.onContinue(postcard);
    }
}
