package com.transsnet.palmpay.core.web;

import B6.ViewOnClickListenerC0087i;
import C0.G;
import Da.a;
import Da.h;
import F6.d;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.M;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.imagepipeline.nativecode.b;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.Utils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sufficientlysecure.htmltextview.l;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class JsInterface implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f28583f = new HashSet(Arrays.asList("play.google.com", "play.app.goo.gl"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashSet f28584g = new HashSet(Arrays.asList("com.transsnet.palmpay", "com.google.android.gms", "com.android.vending"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashSet f28585i = new HashSet(Arrays.asList(Constants.SCHEME, "market"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f28586j = Pattern.compile("^[a-zA-Z0-9._]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebJsCallback f28587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f28588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f28589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebJsCallback f28590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f28591e;

    public interface Callback {
        default void openCustomerService(Bundle bundle) {
        }
    }

    public interface JsCallback {
        void callback(Map<String, Object> map);
    }

    public JsInterface(PWebActivity pWebActivity, WebView webView) {
        this.f28589c = new WeakReference(pWebActivity);
        this.f28588b = new WeakReference(webView);
        if (webView == null || !(webView.getContext() instanceof LifecycleOwner)) {
            return;
        }
        ((LifecycleOwner) webView.getContext()).getLifecycle().a(this);
    }

    public static void c(Activity activity, WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("intent://") || activity.isFinishing()) {
            return;
        }
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (uri != null && d(uri)) {
                uri.setComponent(null);
                uri.setSelector(null);
                if (activity.getPackageManager().resolveActivity(uri, 0) != null) {
                    activity.startActivity(uri);
                    return;
                }
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (TextUtils.isEmpty(stringExtra) || webView == null) {
                    return;
                }
                webView.loadUrl(stringExtra);
            }
        } catch (Exception e10) {
            d.c("JsInterface", "Can't resolve intent://", e10);
        }
    }

    public static boolean d(Intent intent) {
        String str = intent.getPackage();
        if (!TextUtils.isEmpty(str) && !f28584g.contains(str)) {
            d.h("JsInterface", 5, G.o("Blocked package: ", str));
            return false;
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action) && !"android.intent.action.VIEW".equals(action)) {
            d.h("JsInterface", 5, G.o("Blocked action: ", action));
            return false;
        }
        if (intent.getComponent() != null) {
            d.h("JsInterface", 5, "Blocked explicit component");
            return false;
        }
        Uri data = intent.getData();
        HashSet hashSet = f28583f;
        if (data != null) {
            String scheme = data.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                HashSet hashSet2 = f28585i;
                Locale locale = Locale.US;
                if (hashSet2.contains(scheme.toLowerCase(locale))) {
                    if (Constants.SCHEME.equalsIgnoreCase(scheme)) {
                        String host = data.getHost();
                        if (TextUtils.isEmpty(host) || !hashSet.contains(host.toLowerCase(locale))) {
                            d.h("JsInterface", 5, "Blocked https host: " + data.getHost());
                            return false;
                        }
                    }
                    if ("market".equalsIgnoreCase(scheme)) {
                        String queryParameter = data.getQueryParameter("id");
                        if (TextUtils.isEmpty(queryParameter) || !f28586j.matcher(queryParameter).matches()) {
                            d.h("JsInterface", 5, "Blocked market uri: " + data);
                            return false;
                        }
                    }
                }
            }
            d.h("JsInterface", 5, G.o("Blocked scheme: ", scheme));
            return false;
        }
        String stringExtra = intent.getStringExtra("browser_fallback_url");
        if (TextUtils.isEmpty(stringExtra)) {
            return true;
        }
        if (stringExtra.startsWith("https://")) {
            try {
                String host2 = Uri.parse(stringExtra).getHost();
                if (!TextUtils.isEmpty(host2) && hashSet.contains(host2.toLowerCase(Locale.US))) {
                    return true;
                }
            } catch (Exception e10) {
                d.h("JsInterface", 5, "Invalid fallback url: ".concat(stringExtra), e10);
            }
        }
        d.h("JsInterface", 5, "Blocked browser_fallback_url: ".concat(stringExtra));
        return false;
    }

    @JavascriptInterface
    public void ParseIntentUrl(String url) {
        if (!r0.Y0(this.f28591e)) {
            d.c("JsInterface", "Blocked ParseIntentUrl from unsafe url");
            return;
        }
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        c(topActivity, (WebView) this.f28588b.get(), url);
    }

    public final void a(HashMap map) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (JSONException e10) {
                    d.c("JsInterface", "convertToJson1: ", e10);
                }
            }
            string = jSONObject.toString();
        } catch (Exception e11) {
            d.c("JsInterface", "convertToJson2: ", e11);
            string = "{}";
        }
        String str2 = (String) map.get("cbId");
        WebView webView = (WebView) this.f28588b.get();
        if (webView == null) {
            return;
        }
        webView.post(new h(string, str2, 14, webView));
    }

    public final Activity b() {
        WeakReference weakReference = this.f28589c;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity != null && !activity.isFinishing()) {
            return (Activity) weakReference.get();
        }
        WeakReference weakReference2 = this.f28588b;
        WebView webView = weakReference2 != null ? (WebView) weakReference2.get() : null;
        if (webView != null) {
            Context context = webView.getContext();
            Activity topActivity = context instanceof Activity ? (Activity) context : ActivityUtils.getTopActivity();
            if (topActivity != null && !topActivity.isFinishing()) {
                return topActivity;
            }
        }
        return null;
    }

    @JavascriptInterface
    public void clearWebviewCache(boolean includeDiskFiles) {
        WebView webView = (WebView) this.f28588b.get();
        if (webView == null) {
            return;
        }
        webView.clearCache(includeDiskFiles);
    }

    @JavascriptInterface
    public void clipBoardCopy(String text) {
        ClipboardUtils.copyText(text);
    }

    @JavascriptInterface
    public void clipBoardCopyGroupShareOrder(String text) {
        ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("GROUP_BUY_CLIP", text));
    }

    @JavascriptInterface
    public void close() {
        WebView webView = (WebView) this.f28588b.get();
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        Activity topActivity = context instanceof Activity ? (Activity) context : ActivityUtils.getTopActivity();
        if (topActivity == null || topActivity.isFinishing()) {
            return;
        }
        topActivity.finish();
    }

    @JavascriptInterface
    public void commonShareDialog(String businessType, String shareText, String params) {
        try {
            Activity activityB = b();
            if (activityB == null) {
                return;
            }
            activityB.runOnUiThread(new a(activityB.getLocalClassName(), businessType, shareText, params, activityB));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void exitApp() {
        ActivityUtils.finishAllActivities();
    }

    @JavascriptInterface
    public String getAppInfo() {
        if (r0.Y0(this.f28591e)) {
            return r0.R0(null, null);
        }
        d.c("JsInterface", "Blocked getAppInfo from unsafe url");
        return "";
    }

    @JavascriptInterface
    public String getBusinessData() {
        return null;
    }

    @JavascriptInterface
    public String getLocation() {
        JSONObject jSONObject = new JSONObject();
        if (androidx.core.content.d.a(ActivityUtils.getTopActivity(), com.transsnet.palmpay.core.config.d.j()) == 0 || androidx.core.content.d.a(ActivityUtils.getTopActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
                LocationRecord locationRecordF = p367ya.a.d().f();
                jSONObject.put("permission", true);
                if (locationRecordF != null && !locationRecordF.isExpired()) {
                    jSONObject.put("latitude", String.valueOf(locationRecordF.getLatitude()));
                    jSONObject.put("longitude", String.valueOf(locationRecordF.getLongitude()));
                }
            } catch (Exception e10) {
                d.c("JsInterface", "getLocation: ", e10);
            }
        } else {
            try {
                jSONObject.put("permission", false);
            } catch (JSONException unused) {
            }
        }
        if (this.f28587a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "getLocation");
            this.f28587a.callback(map);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getPermissionLocationStatus() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (androidx.core.content.d.a(ActivityUtils.getTopActivity(), com.transsnet.palmpay.core.config.d.j()) == 0 || androidx.core.content.d.a(ActivityUtils.getTopActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                jSONObject.put("permissionLocation", "1");
            } else {
                jSONObject.put("permissionLocation", "0");
            }
        } catch (Exception e10) {
            d.c("JsInterface", "getPermissionLocationStatus: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public int getStatusBarHeight() {
        return SizeUtils.px2dp(BarUtils.getStatusBarHeight());
    }

    @JavascriptInterface
    public String getUserInfo() {
        if (!r0.Y0(this.f28591e)) {
            d.c("JsInterface", "Blocked getUserInfo from unsafe url");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isPalmForceUser", false);
            User user = BaseApplication.getInstance().getUser();
            if (user != null) {
                jSONObject.put("memberId", user.getMemberId());
                jSONObject.put("firstName", user.getFirstName());
                jSONObject.put("middleName", user.getMiddleName());
                jSONObject.put("lastName", user.getLastName());
                jSONObject.put("nickName", user.getNickName());
                jSONObject.put("fullName", user.getFullName());
                jSONObject.put("avatar", user.getAvatar());
                jSONObject.put(Scopes.EMAIL, user.getEmail());
                jSONObject.put("birthday", user.getBirthday());
                jSONObject.put("phoneNumber", user.getPhoneNumber());
            }
        } catch (Exception e10) {
            d.c("JsInterface", "getUserInfo: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public void googleNavigator(double latitude, double longitude) {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        r0.P0(activityB, latitude, longitude);
    }

    @JavascriptInterface
    public void gotoActivityPage(String url) {
        i0.c0(url);
    }

    @JavascriptInterface
    public void gotoPage(String pagePath) {
        Intent intentA = F.a(ActivityUtils.getTopActivity(), pagePath);
        if ("/account/signup".equals(pagePath) || "/account/login".equals(pagePath)) {
            intentA.putExtra("extra_data", BaseApplication.getCountryLocale());
        }
        if (intentA != null) {
            ActivityUtils.startActivity(intentA);
        }
    }

    @JavascriptInterface
    public void gotoPageWithParams(String pagePath, String params) {
        WebJsCallback webJsCallback;
        Bundle bundle = new Bundle();
        int iOptInt = 0;
        try {
            JSONObject jSONObject = new JSONObject(params);
            iOptInt = jSONObject.optInt("closeSelf", 0);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof Float) {
                    bundle.putFloat(next, ((Float) objOpt).floatValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                }
            }
        } catch (JSONException e10) {
            d.c("JsInterface", "gotoPageWithParams: ", e10);
        }
        if ("/main/echat".equals(pagePath) && (webJsCallback = this.f28590d) != null) {
            webJsCallback.openCustomerService(bundle);
            return;
        }
        if ("/coreImpl/rn_host".equals(pagePath)) {
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, bundle.getString("rn_module_name"));
            if (iOptInt == 1) {
                onBack();
                return;
            }
            return;
        }
        ARouter.getInstance().build(pagePath).with(bundle).navigation();
        if (iOptInt == 1) {
            onBack();
        }
    }

    @JavascriptInterface
    public void gotoPageWithParamsSync(String pagePath, String params) {
        gotoPageWithParams(pagePath, params);
        HashMap map = new HashMap();
        map.put("goToPageStatus", "success");
        a(map);
    }

    @JavascriptInterface
    public void gotoSendSmsPage(String param) {
        try {
            JSONObject jSONObject = new JSONObject(param);
            JSONArray jSONArray = jSONObject.getJSONArray("phones");
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                sb2.append(jSONArray.get(i7).toString());
                if (i7 < jSONArray.length() - 1) {
                    sb2.append(",");
                }
            }
            String strOptString = jSONObject.optString("smsText");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", strOptString);
            ActivityUtils.startActivity(intent);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public void invoke(String param) {
        if (this.f28587a != null) {
            try {
                JSONObject jSONObject = new JSONObject(param);
                HashMap map = new HashMap();
                if (jSONObject.has("cbId")) {
                    map.put("cbId", jSONObject.getString("cbId"));
                }
                map.put("fnName", jSONObject.getString("fnName"));
                map.put("param", param);
                this.f28587a.callback(map);
            } catch (Exception unused) {
            }
        }
    }

    @JavascriptInterface
    public boolean isSupportPhoneLock() {
        return false;
    }

    @JavascriptInterface
    public void jump2NextRouter() {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        c.b().f(new MessageEvent(MessageEvent.EVENT_OC_PERSON_COMPLETED));
        activityB.finish();
    }

    @JavascriptInterface
    public void jumpTransferPage(String transType, int businessType, String accountNo, String sourceType, String memberId) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("core_order_source_type", sourceType);
            bundle.putString("MEMBER_ID", memberId);
            r0.O0(transType, Integer.valueOf(businessType), accountNo, bundle);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public void launchApp(String pkgName) {
        if (TextUtils.isEmpty(pkgName)) {
            return;
        }
        try {
            ActivityUtils.startActivity(IntentUtils.getLaunchAppIntent(pkgName, true));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void logEvent(@NonNull String eventId, String eventDataValue) {
        try {
            n0 n0VarG = n0.g();
            C0525w.f().getClass();
            n0VarG.r(eventId, (Map) C0525w.d(eventDataValue, Map.class));
        } catch (Exception e10) {
            d.c("JsInterface", "logEvent: ", e10);
        }
    }

    @JavascriptInterface
    public void modifyMyStoreVoiceNotification(String open) {
        String memberId = BaseApplication.getInstance().getUser().getMemberId();
        boolean z3 = false;
        if (!"0".equals(open) && "1".equals(open)) {
            z3 = true;
        }
        SPUtils.getInstance().put(memberId + "KEY_MY_STORE_VOICE_NOTIFICATION_OPEN", z3);
    }

    @JavascriptInterface
    public void onBack() {
        if (this.f28587a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "onBack");
            this.f28587a.callback(map);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f28590d = null;
    }

    @JavascriptInterface
    public void openCustomerService() {
        WebJsCallback webJsCallback = this.f28590d;
        if (webJsCallback != null) {
            webJsCallback.openCustomerService(null);
        }
    }

    @JavascriptInterface
    public void openExternalBroswer(String link) {
        if (RegexUtils.isURL(link)) {
            ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(link, true));
        }
    }

    @JavascriptInterface
    public String queryAppNotificationEnable() {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return "";
        }
        boolean zAreNotificationsEnabled = new M(activityB).f15943b.areNotificationsEnabled();
        Boolean boolValueOf = Boolean.valueOf(zAreNotificationsEnabled);
        boolean z3 = p367ya.a.d().f44149a.getBoolean("key_notification", true);
        Boolean boolValueOf2 = Boolean.valueOf(z3);
        if (!zAreNotificationsEnabled || !z3) {
            O6.c cVar = new O6.c(activityB);
            cVar.f6596b = O6.d.f(activityB.getString(k.core_notification_permission));
            cVar.f6598d = activityB.getString(k.core_notification_permission_tips);
            String string = activityB.getString(k.core_allow_now);
            ViewOnClickListenerC0087i viewOnClickListenerC0087i = new ViewOnClickListenerC0087i(this, boolValueOf, activityB, boolValueOf2, 23);
            cVar.f6600f = string;
            cVar.f6602h = viewOnClickListenerC0087i;
            cVar.f6601g = activityB.getString(k.core_no_thanks);
            cVar.f6603i = null;
            cVar.g();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationsEnabled", zAreNotificationsEnabled ? "1" : "0");
            jSONObject.put("appNotificationsEnabled", z3 ? "1" : "0");
        } catch (Exception e10) {
            d.c("JsInterface", "queryAppNotificationEnable: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String queryMyStoreVoiceNotification() {
        String memberId = BaseApplication.getInstance().getUser().getMemberId();
        SPUtils sPUtils = SPUtils.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(memberId);
        sb2.append("KEY_MY_STORE_VOICE_NOTIFICATION_OPEN");
        String str = sPUtils.getBoolean(sb2.toString()) ? "1" : "0";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("VoiceNotificationOpen", str);
        } catch (Exception e10) {
            d.c("JsInterface", "queryMyStoreVoiceNotification: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public void savePictureToLocalAndShare(String url, String text) {
        Activity activityB = b();
        if (activityB == null) {
            return;
        }
        r0.I1(activityB, url, text, new l(2));
    }

    @JavascriptInterface
    public void sendEventBackToRN(String eventName, String params) {
        Activity activityS = i0.S("/coreImpl/rn_host");
        if (activityS == null) {
            i0.H(null);
        } else {
            r0.O1(eventName, params, null);
            ActivityUtils.finishToActivity(activityS, false);
        }
    }

    @JavascriptInterface
    public void setPendingBackPressed(boolean pendingBackPressed) {
        if (this.f28587a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "setPendingBackPressed");
            map.put("param", Boolean.valueOf(pendingBackPressed));
            this.f28587a.callback(map);
        }
    }

    @JavascriptInterface
    public void setTheme(@NonNull String theme) {
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity != null) {
            topActivity.runOnUiThread(new Da.d(theme, 3));
        }
    }

    @JavascriptInterface
    public void share() {
        if (this.f28587a != null) {
            HashMap map = new HashMap();
            map.put("fnName", FirebaseAnalytics.Event.SHARE);
            this.f28587a.callback(map);
        }
    }

    @JavascriptInterface
    public void shareTitleAndText(String title, String shareTxt) {
        if (TextUtils.isEmpty(shareTxt)) {
            return;
        }
        b.E(ActivityUtils.getTopActivity(), title, shareTxt);
    }

    @JavascriptInterface
    public String getAppInfo(String body) {
        if (!r0.Y0(this.f28591e)) {
            d.c("JsInterface", "Blocked getAppInfo from unsafe url");
            return "";
        }
        return r0.R0(null, body);
    }
}
