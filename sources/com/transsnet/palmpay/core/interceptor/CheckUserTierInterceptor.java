package com.transsnet.palmpay.core.interceptor;

import C0.G;
import F6.d;
import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;

/* JADX INFO: loaded from: classes3.dex */
public class CheckUserTierInterceptor implements IInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f27394a = {"/cashin/recharge", "/cashin_out/add_money", "/send/money", "/sm/trans_to_bank", "/airtime/top_up_airtime", "/quick_teller/buy_bundle_ng", "/quick_teller/betting_home", "/coreImpl/rn_host", "/credit_score/bind_merchant", "/main/trans_history", "/main/statement", "/main/my_assets_page", "/cashout/withdraw_home", "/main/bankCardAndAccount", "/credit_score/oc_total_bill_activity", "/main/point/list", "/quick_teller/tv_home", "/quick_teller/internet_home", "/quick_teller/insurance_home", "/main/third_party_merchant", "/app/main_qrcode_activity", "/qrcode/scan", "/coreImpl/add_new_card", "/coreImpl/use_new_card"};

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public final void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        String path = postcard.getPath();
        d.h("CheckUserTier", 3, G.o("process(), path = ", path));
        User user = BaseApplication.getInstance().getUser();
        if (user != null && user.getSvaStatus() != 3 && BaseApplication.hasLogin()) {
            int i7 = 0;
            while (true) {
                String[] strArr = this.f27394a;
                if (i7 >= strArr.length) {
                    break;
                }
                String str = strArr[i7];
                if (str.equals(path)) {
                    d.h("CheckUserTier", 3, "被拦截,targetPath = ".concat(str));
                    interceptorCallback.onInterrupt(null);
                    ARouter.getInstance().build("/account/ask_apply_for_balance").withString("extra_data", str).navigation();
                    return;
                }
                i7++;
            }
        }
        interceptorCallback.onContinue(postcard);
    }
}
