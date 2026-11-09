package com.transsnet.palmpay.core.interceptor;

import C0.G;
import F6.d;
import Pa.i0;
import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ToastUtils;
import p025ba.k;
import p267r9.a;
import p367ya.c;

/* JADX INFO: loaded from: classes3.dex */
@Interceptor(priority = 7)
public class CheckLogInInterceptor implements IInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f27391a = {"/quick_teller/jamb_home", "/quick_teller/waec_home", "/main/splash", "/main/home", "/main/update", "/account/login", "/account/signup", "/cashin_out/add_money", "/app/all_function_activity", "/account/setnewpin", "/account/set_new_psw", "/account/verifyAccount", "/account/resetpin", "/account/reset_pin_verify", "/account/verify_account_history", "/account/verify_account_face", "/account/select_reset_pin_verify_type", "/account/addGuardian", "/common/webview", "/contact/palmpay_list", "/main/bankCardAndAccount", "/credit_score/oc_main_activity", "/account/changeMobile", "/core/common_result", "/account/setUserPhoto", "/manage_money/new_user_introduction_activity", "/manage_money/loading_activity", "/manage_money/loading_activity", "/credit_score/loan_home_activity"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f27392b = {"/main/splash", "/main/home", "/main/update", "/account/login", "/account/signup", "/app/all_function_activity", "/common/webview"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f27393c = {"/main/splash", "/main/home", "/main/update", "/account/login", "/account/signup", "/app/all_function_activity", "/account/setnewpin", "/account/set_new_psw", "/account/verifyAccount", "/account/resetpin", "/account/reset_pin_verify", "/account/verify_account_history", "/account/select_reset_pin_verify_type", "/common/webview", "/account/changeMobile", "/core/common_result"};

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public final void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        String path = postcard.getPath();
        d.h("CheckLogInInterceptor", 3, G.o("process(), path = ", path));
        if (("/coreImpl/rn_host".equals(path) || "/common/webview".equals(path)) && !a.f41645a.a()) {
            interceptorCallback.onInterrupt(null);
            ToastUtils.showLong(BaseApplication.get().getString(k.core_no_webview_installed));
            return;
        }
        if (c.a()) {
            int i7 = 0;
            while (true) {
                if (i7 >= 7) {
                    interceptorCallback.onInterrupt(null);
                    com.palmpay.lib.apm.launchcounter.util.d.F("/main/update");
                    return;
                } else if (f27392b[i7].equals(path)) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (BaseApplication.hasLogin()) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        for (String str : com.transsnet.palmpay.core.config.d.t() ? f27393c : f27391a) {
            if (str.equals(path)) {
                interceptorCallback.onContinue(postcard);
                return;
            }
        }
        interceptorCallback.onInterrupt(null);
        i0.K(null, null);
    }
}
