package com.transsnet.palmpay.core.config;

import C0.G;
import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.RegexUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p183m6.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return g("/h5/service/home");
        }
        return g("/h5/service/home?entryType=" + str);
    }

    public static String b(String str) {
        return g("/h5/help/service?entryType=".concat(str));
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? g("/customer-service/homePage") : g("/customer-service/homePage?entryType=".concat(str));
    }

    public static String d() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "key_finance_home_coupon_show_dialog_time";
    }

    public static String e() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "_FINANCE_HOME_CASH_SHOWED";
    }

    public static String f() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "key_finance_home_repay_show_dialog_time";
    }

    public static String g(String str) {
        return RegexUtils.isURL(str) ? str : G.o("https://h5.palmpay.app", str);
    }

    public static String h() {
        return "pin_sp_" + BaseApplication.getInstance().getUser().getPhoneNumber() + "_last_pin_time";
    }

    public static String i() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "KEY_LAST_PIN_ACTIVITY_TIME";
    }

    public static String j() {
        return "palmstore".equalsIgnoreCase(BaseApplication.getChannel()) ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.ACCESS_COARSE_LOCATION";
    }

    public static String k() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_LOCK_TIME1";
    }

    public static String l() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_ON_OFF_STATE1";
    }

    public static String m() {
        return BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PASSWORD1";
    }

    public static List n() {
        try {
            String strD = n.f39523a.instance().d("featureWebPreloadPath", "");
            if (strD == null) {
                return null;
            }
            String strTrim = strD.trim();
            if (!TextUtils.isEmpty(strTrim) && !BuildConfig.TRAVIS.equalsIgnoreCase(strTrim)) {
                C0525w c0525wF = C0525w.f();
                List<String> list = (List) ((Gson) c0525wF.f7166b).fromJson(strTrim, new TypeToken<List<String>>() { // from class: com.transsnet.palmpay.core.config.RemoteConfig$2
                }.getType());
                if (list == null) {
                    C0525w.f().getClass();
                    String str = (String) C0525w.d(strTrim, String.class);
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    return Collections.singletonList(g(str));
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(g(str2));
                    }
                }
                return arrayList;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List o() {
        try {
            String strD = n.f39523a.instance().d("featureWebPreloadUrl", "");
            if (strD == null) {
                return null;
            }
            String strTrim = strD.trim();
            if (!TextUtils.isEmpty(strTrim) && !BuildConfig.TRAVIS.equalsIgnoreCase(strTrim)) {
                C0525w c0525wF = C0525w.f();
                List<String> list = (List) ((Gson) c0525wF.f7166b).fromJson(strTrim, new TypeToken<List<String>>() { // from class: com.transsnet.palmpay.core.config.RemoteConfig$1
                }.getType());
                if (list == null) {
                    C0525w.f().getClass();
                    String str = (String) C0525w.d(strTrim, String.class);
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    return Collections.singletonList(g(str));
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(g(str2));
                    }
                }
                return arrayList;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static long p() {
        try {
            return ((Long) n.f39523a.instance().c("keySignUpLivenessCountdown", 5L)).longValue();
        } catch (Exception unused) {
            return 5L;
        }
    }

    public static long q() {
        try {
            return ((Long) n.f39523a.instance().c("featureSignUpRule", 2L)).longValue();
        } catch (Exception unused) {
            return 2L;
        }
    }

    public static boolean r() {
        try {
            return n.f39523a.instance().b("featureAsyncViewInflate", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean s() {
        try {
            return n.f39523a.instance().b("monthlyOverView", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean t() {
        return "preinstall_go".equalsIgnoreCase(BaseApplication.getChannel());
    }

    public static boolean u() {
        try {
            return n.f39523a.instance().b("featureShowPrivacyAccount", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean v() {
        try {
            return n.f39523a.instance().b("featureOpenPermission", false);
        } catch (Exception unused) {
            return false;
        }
    }
}
