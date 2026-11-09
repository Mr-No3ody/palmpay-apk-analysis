package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Da.g;
import Da.h;
import F6.d;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ua.C0615a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import androidx.core.app.M;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.web.JsInterface;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.Utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sufficientlysecure.htmltextview.i;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityWebView f28574a;

    public a(ActivityWebView activityWebView) {
        this.f28574a = activityWebView;
    }

    @JavascriptInterface
    public void ParseIntentUrl(String url) {
        if (!r0.Y0(this.f28574a.f28204d)) {
            d.c("ActivityWebView", "Blocked ParseIntentUrl from unsafe url");
            return;
        }
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        JsInterface.c(topActivity, this.f28574a, url);
    }

    @JavascriptInterface
    public void clearWebviewCache(boolean includeDiskFiles) {
        this.f28574a.clearCache(includeDiskFiles);
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
        d.h("ActivityWebView", 3, "bvn close >>>");
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ROUTER_EXIT, (Object) 200));
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.getContext() instanceof Activity) {
            ((Activity) activityWebView.getContext()).finish();
        } else if (ActivityUtils.getTopActivity() != null) {
            ActivityUtils.getTopActivity().finish();
        }
    }

    @JavascriptInterface
    public void commonShareDialog(String businessType, String shareText, String params) {
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                return;
            }
            this.f28574a.post(new g(topActivity.getLocalClassName(), businessType, shareText, params));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void exitApp() {
        ActivityUtils.finishAllActivities();
    }

    @JavascriptInterface
    public String getAppInfo() {
        if (r0.Y0(this.f28574a.f28204d)) {
            return r0.R0(null, null);
        }
        d.c("ActivityWebView", "Blocked getAppInfo from unsafe url");
        return "";
    }

    @JavascriptInterface
    public String getBusinessData() {
        return this.f28574a.f28203c;
    }

    @JavascriptInterface
    public String getLocation() {
        JSONObject jSONObject = new JSONObject();
        if (androidx.core.content.d.a(ActivityUtils.getTopActivity(), com.transsnet.palmpay.core.config.d.j()) == 0 || androidx.core.content.d.a(ActivityUtils.getTopActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
                LocationRecord locationRecordF = p367ya.a.d().f();
                jSONObject.put("permission", true);
                if (locationRecordF != null) {
                    jSONObject.put("latitude", String.valueOf(locationRecordF.getLatitude()));
                    jSONObject.put("longitude", String.valueOf(locationRecordF.getLongitude()));
                    jSONObject.put("updateTime", String.valueOf(locationRecordF.getUpdateTime()));
                }
            } catch (Exception e10) {
                d.c("ActivityWebView", "getLocation: ", e10);
            }
        } else {
            try {
                jSONObject.put("permission", false);
            } catch (JSONException unused) {
            }
        }
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.f28201a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "getLocation");
            activityWebView.f28201a.callback(map);
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
            d.c("ActivityWebView", "getPermissionLocationStatus: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public int getStatusBarHeight() {
        return SizeUtils.px2dp(BarUtils.getStatusBarHeight());
    }

    @JavascriptInterface
    public String getUserInfo() {
        if (!r0.Y0(this.f28574a.f28204d)) {
            d.c("ActivityWebView", "Blocked getUserInfo from unsafe url");
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
            d.c("ActivityWebView", "getUserInfo: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public void googleNavigator(double latitude, double longitude) {
        r0.P0(this.f28574a.getContext(), latitude, longitude);
    }

    @JavascriptInterface
    public void gotoActivityPage(String url) {
        i0.c0(url);
    }

    @JavascriptInterface
    public void gotoPage(String pagePath) {
        Intent intentA = F.a(this.f28574a.getContext(), pagePath);
        if ("/account/signup".equals(pagePath) || "/account/login".equals(pagePath)) {
            intentA.putExtra("extra_data", BaseApplication.getCountryLocale());
        }
        if (intentA != null) {
            ActivityUtils.startActivity(intentA);
        }
    }

    @JavascriptInterface
    public void gotoPageWithParams(String pagePath, String params) {
        ActivityWebView.Callback callback;
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(params);
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
            d.c("ActivityWebView", "gotoPageWithParams: ", e10);
        }
        if ("/main/echat".equals(pagePath) && (callback = this.f28574a.f28202b) != null) {
            callback.openCustomerService(bundle);
        } else if ("/coreImpl/rn_host".equals(pagePath)) {
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, bundle.getString("rn_module_name"));
        } else {
            ARouter.getInstance().build(pagePath).with(bundle).navigation();
        }
    }

    @JavascriptInterface
    public void gotoPageWithParamsSync(String pagePath, String params) {
        String string;
        gotoPageWithParams(pagePath, params);
        HashMap map = new HashMap();
        map.put("goToPageStatus", "success");
        ActivityWebView activityWebView = this.f28574a;
        activityWebView.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (JSONException e10) {
                    d.c("ActivityWebView", "convertToJson1: ", e10);
                }
            }
            string = jSONObject.toString();
        } catch (Exception e11) {
            d.c("ActivityWebView", "convertToJson2: ", e11);
            string = "{}";
        }
        activityWebView.post(new h(activityWebView, 10, string, (String) map.get("cbId")));
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
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.f28201a != null) {
            try {
                JSONObject jSONObject = new JSONObject(param);
                HashMap map = new HashMap();
                map.put("cbId", jSONObject.getString("cbId"));
                map.put("fnName", jSONObject.getString("fnName"));
                map.put("param", param);
                activityWebView.f28201a.callback(map);
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
        G.u(MessageEvent.EVENT_OC_PERSON_COMPLETED, org.greenrobot.eventbus.c.b());
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.getContext() instanceof Activity) {
            ((Activity) activityWebView.getContext()).finish();
        } else if (ActivityUtils.getTopActivity() != null) {
            ActivityUtils.getTopActivity().finish();
        }
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
            d.c("ActivityWebView", "logEvent: ", e10);
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
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.f28201a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "onBack");
            activityWebView.f28201a.callback(map);
        }
    }

    @JavascriptInterface
    public void openCustomerService() {
        ActivityWebView.Callback callback = this.f28574a.f28202b;
        if (callback != null) {
            callback.openCustomerService(null);
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
        ActivityWebView activityWebView = this.f28574a;
        boolean zAreNotificationsEnabled = new M(activityWebView.getContext()).f15943b.areNotificationsEnabled();
        Boolean boolValueOf = Boolean.valueOf(zAreNotificationsEnabled);
        boolean z3 = p367ya.a.d().f44149a.getBoolean("key_notification", true);
        Boolean boolValueOf2 = Boolean.valueOf(z3);
        if (!zAreNotificationsEnabled || !z3) {
            O6.c cVar = new O6.c(activityWebView.getContext());
            cVar.f6596b = O6.d.f(activityWebView.getContext().getString(k.core_notification_permission));
            cVar.f6598d = activityWebView.getContext().getString(k.core_notification_permission_tips);
            String string = activityWebView.getContext().getString(k.core_allow_now);
            Ke.h hVar = new Ke.h(this, boolValueOf, boolValueOf2);
            cVar.f6600f = string;
            cVar.f6602h = hVar;
            cVar.f6601g = activityWebView.getContext().getString(k.core_no_thanks);
            cVar.f6603i = null;
            cVar.g();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationsEnabled", zAreNotificationsEnabled ? "1" : "0");
            jSONObject.put("appNotificationsEnabled", z3 ? "1" : "0");
        } catch (Exception e10) {
            d.c("ActivityWebView", "queryAppNotificationEnable: ", e10);
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
            d.c("ActivityWebView", "queryMyStoreVoiceNotification: ", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public void savePictureToLocalAndShare(String url, String text) {
        r0.I1(this.f28574a.getContext(), url, text, new i(2));
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
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.f28201a != null) {
            HashMap map = new HashMap();
            map.put("fnName", "setPendingBackPressed");
            map.put("param", Boolean.valueOf(pendingBackPressed));
            activityWebView.f28201a.callback(map);
        }
    }

    @JavascriptInterface
    public void setTheme(@NonNull String theme) {
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity != null) {
            topActivity.runOnUiThread(new Da.d(theme, 2));
        }
    }

    @JavascriptInterface
    public void share() {
        ActivityWebView activityWebView = this.f28574a;
        if (activityWebView.f28201a != null) {
            HashMap map = new HashMap();
            map.put("fnName", FirebaseAnalytics.Event.SHARE);
            activityWebView.f28201a.callback(map);
        }
    }

    @JavascriptInterface
    public void shareTitleAndText(String title, String shareTxt) {
        if (TextUtils.isEmpty(shareTxt)) {
            return;
        }
        com.facebook.imagepipeline.nativecode.b.E(this.f28574a.getContext(), title, shareTxt);
    }

    @JavascriptInterface
    public void showRateDialog() {
        p367ya.a.d().f44149a.getLong("key_rate_dialog_show_time", -1L);
        ActivityWebView activityWebView = this.f28574a;
        new InterstitialAdView(activityWebView.getContext().getString(k.ad_fund_lottery_rate_slot_id), 1, new Ab.k(11), new org.sufficientlysecure.htmltextview.h(9)).show(activityWebView.getContext(), new C0615a(this, 0));
    }

    @JavascriptInterface
    public String getAppInfo(String body) {
        if (!r0.Y0(this.f28574a.f28204d)) {
            d.c("ActivityWebView", "Blocked getAppInfo from unsafe url");
            return "";
        }
        return r0.R0(null, body);
    }
}
