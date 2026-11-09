package com.transsnet.palmpay.util;

import L6.b;
import Pa.i0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import androidx.core.app.AbstractC1032a;
import androidx.core.content.d;
import p183m6.n;

/* JADX INFO: loaded from: classes4.dex */
public class MainUtils {
    public static final String MAIN_WEALTH_TAB_PATH = "arouter://main/home?tab=invest&FROM_LOGIN_PAGE=true";
    private static final String POST_NOTIFICATIONS = "android.permission.POST_NOTIFICATIONS";

    public static boolean checkPostNotificationsPermission(Activity activity) {
        return (Build.VERSION.SDK_INT >= 33 && i0.W(activity) && d.a(activity, POST_NOTIFICATIONS) == -1) ? false : true;
    }

    public static boolean checkUseRemoteWebView() {
        String str = Build.MODEL;
        String str2 = Build.BRAND;
        if (!"TECNO".equalsIgnoreCase(str2) ? !"INFINIX".equalsIgnoreCase(str2) || (!"Infinix X6516".equalsIgnoreCase(str) && !"X6516".equalsIgnoreCase(str) && !"Infinix X6517".equalsIgnoreCase(str) && !"X6517".equalsIgnoreCase(str)) : !"TECNO BF7".equalsIgnoreCase(str) && !"BF7".equalsIgnoreCase(str) && !"TECNO BF6".equalsIgnoreCase(str) && !"BF6".equalsIgnoreCase(str)) {
            try {
                return n.f39523a.instance().b("featureRemoteWebViewAdV3", false);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int getColorByOrderStatus(Context context, String str) {
        if ("Waiting to receive".equalsIgnoreCase(str) || "Waiting to pay".equalsIgnoreCase(str)) {
            return Color.parseColor("#FFF44E4E");
        }
        if ("Pending".equalsIgnoreCase(str) || "Processing".equalsIgnoreCase(str)) {
            return context.getColor(b.ppColorWarning);
        }
        if ("Successful".equalsIgnoreCase(str)) {
            return -1;
        }
        return ("Failed".equalsIgnoreCase(str) || "Cancelled".equalsIgnoreCase(str) || "Expired".equalsIgnoreCase(str) || "Closed".equalsIgnoreCase(str)) ? context.getColor(b.ppColorError) : context.getColor(b.ppColorTextPrimary);
    }

    public static void jumpLoginWithParam(String str) {
        com.palmpay.lib.apm.launchcounter.util.d.H("/account/login", "business_path", str);
    }

    public static void requestNotificationPermission(Activity activity) {
        if (Build.VERSION.SDK_INT < 33 || d.a(activity, POST_NOTIFICATIONS) != -1) {
            return;
        }
        if (AbstractC1032a.h(activity, POST_NOTIFICATIONS)) {
            AbstractC1032a.g(activity, new String[]{POST_NOTIFICATIONS}, 100);
        } else {
            Oe.d.h(activity);
        }
    }
}
