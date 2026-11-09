package com.transsnet.palmpay.credit.businessLoan.rnbridge;

import F6.d;
import Pa.i0;
import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053db.a;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/open/appSettings"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/businessLoan/rnbridge/AppSettingsBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ldb/a;", "<init>", "()V", "", "", "", "createSuccessResponse", "()Ljava/util/Map;", "errorMessage", "", "handleFail", "(Ljava/lang/String;)V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Ldb/a;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_business_loan_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppSettingsBridge extends SyncBridge<a> {

    @NotNull
    public static final String RESULT_ERROR = "error";

    @NotNull
    public static final String RESULT_SUCCESS = "success";

    @NotNull
    private static final String TAG = "AppSettingsBridge";

    private final Map<String, Object> createSuccessResponse() {
        return G.g(new Pair("success", Boolean.TRUE), new Pair("message", "Successfully opened app settings page"), new Pair("timestamp", Long.valueOf(System.currentTimeMillis())));
    }

    private final void handleFail(String errorMessage) {
        BaseBridge.handleSuccess$default(this, G.g(new Pair("success", Boolean.FALSE), new Pair("message", errorMessage), new Pair("error", errorMessage), new Pair("timestamp", Long.valueOf(System.currentTimeMillis()))), null, 2, null);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public /* synthetic */ void onHandle(Object obj, IBridgeCallback iBridgeCallback) {
        if (obj != null) {
            throw new ClassCastException();
        }
        onHandle((a) null, iBridgeCallback);
    }

    public void onHandle(@Nullable a params, @Nullable IBridgeCallback callback) {
        d.h(TAG, 4, "onHandle - 开始处理打开系统设置页面请求");
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                d.c(TAG, "onHandle - 无法获取当前 Activity");
                handleFail("Unable to get current Activity. Please ensure the app is in foreground.");
            } else {
                d.h(TAG, 3, "onHandle - 当前 Activity: ".concat(topActivity.getClass().getSimpleName()));
                i0.L(topActivity);
                d.h(TAG, 4, "onHandle - 成功调用打开系统设置页面方法");
                BaseBridge.handleSuccess$default(this, createSuccessResponse(), null, 2, null);
            }
        } catch (Exception e10) {
            d.c(TAG, "onHandle - 打开系统设置页面时发生异常", e10);
            handleFail(C0.G.o("Failed to open app settings page: ", e10.getMessage()));
        }
    }
}
