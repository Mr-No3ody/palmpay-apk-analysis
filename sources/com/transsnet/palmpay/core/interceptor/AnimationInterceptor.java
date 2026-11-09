package com.transsnet.palmpay.core.interceptor;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.transsnet.palmpay.custom_view.m;

/* JADX INFO: loaded from: classes3.dex */
@Interceptor(priority = 6)
public class AnimationInterceptor implements IInterceptor {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public final void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (postcard.getEnterAnim() == -1 && postcard.getExitAnim() == -1) {
            postcard.withTransition(m.cv_anim_slide_alpha_in_right, m.cv_anim_slide_alpha_out_left);
        }
        interceptorCallback.onContinue(postcard);
    }
}
