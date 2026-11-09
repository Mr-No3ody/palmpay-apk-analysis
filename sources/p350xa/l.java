package p350xa;

import C0.G;
import Da.i;
import F6.d;
import Pa.A;
import Pa.i0;
import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.util.ActivityUtils;
import okhttp3.Interceptor;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Interceptor {
    public static void a(String str) {
        A.a();
        if (TextUtils.isEmpty(i0.y())) {
            i0.K("HttpClient", null);
            return;
        }
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null || !"com.transsnet.palmpay.account.ui.activity.LogInActivity".equalsIgnoreCase(topActivity.getClass().getName())) {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.LogInActivity");
            if (activityIsActivityExistsInStack != null) {
                A.a();
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                if (activityIsActivityExistsInStack instanceof CustomActionCallback) {
                    activityIsActivityExistsInStack.runOnUiThread(new i(activityIsActivityExistsInStack, str, 3));
                    return;
                }
                return;
            }
            G.u(MessageEvent.EVENT_ACCOUNT_LOG_OUT, c.b());
            try {
                ARouter.getInstance().build("/account/login").withString("android.intent.extra.TEXT", str).withString("extra_data", BaseApplication.getCountryLocale()).navigation();
            } catch (Exception e10) {
                d.c("TokenInterceptor", "gotoLoginPage: ", e10);
            }
            Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            if (activityIsActivityExistsInStack2 != null) {
                activityIsActivityExistsInStack2.finish();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L14;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.e0 intercept(okhttp3.Interceptor.Chain r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p350xa.l.intercept(okhttp3.Interceptor$Chain):okhttp3.e0");
    }
}
