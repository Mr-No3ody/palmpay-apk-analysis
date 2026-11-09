package com.palmpay.lib.webview.container;

import N8.q0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class WebTools {
    public static boolean checkUrlHost(String str) {
        HashSet<String> whiteList;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        if (!OfflineWebManager.getInstance().isInit() || OfflineWebManager.getInstance().getOfflineConfig() == null || (whiteList = OfflineWebManager.getInstance().getOfflineConfig().getWhiteList()) == null || whiteList.isEmpty()) {
            return true;
        }
        try {
            String host = new URI(str).getHost();
            Iterator<String> it = whiteList.iterator();
            while (it.hasNext()) {
                if (host.endsWith(Consts.DOT + it.next())) {
                    return true;
                }
            }
        } catch (URISyntaxException unused) {
        }
        return false;
    }

    private static void dailTo(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String getUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("http")) {
            return str;
        }
        if (str.contains("http")) {
            return str.substring(str.indexOf("http"));
        }
        if (str.startsWith("www")) {
            return "http://".concat(str);
        }
        if (str.contains(".me") || str.contains(".com") || str.contains(".cn")) {
            return "http://www.".concat(str);
        }
        return !str.contains("www") ? "http://m5.baidu.com/s?from=124n&word=".concat(str) : "";
    }

    public static String getVideoHtmlBody(String str) {
        return q0.k("<html><head><meta name=\"viewport\" content=\"width=device-width\"><style type=\"text/css\" abt=\"234\"></style></head><body><video controls=\"\" autoplay=\"\" name=\"media\" style=\"display:block;width:100%;position:absolute;left:0;top:20%;\"><source src=\"", str, "\" type=\"video/mp4\"></video></body></html>");
    }

    public static boolean handleThirdApp(Activity activity, String str) {
        if (str.startsWith("http")) {
            if (!str.contains(".apk")) {
                return false;
            }
            startActivity(activity, str);
            return true;
        }
        if (str.startsWith("tel:")) {
            dailTo(activity, str);
        } else if (str.startsWith("mailto:")) {
            mailTo(activity, str);
        } else if (str.contains("alipays")) {
            if (hasPackage(activity, "com.eg.android.AlipayGphone")) {
                startActivity(activity, str);
            }
        } else if (str.contains("weixin://wap/pay")) {
            if (hasPackage(activity, "com.tencent.mm")) {
                startActivity(activity, str);
            }
        } else if (!str.contains("tbopen:") && !str.contains("openapp.jdmobile:") && !str.contains("jdmobile:") && !str.contains("zhihu:") && !str.contains("vipshop:") && !str.contains("youku:") && !str.contains("uclink:") && !str.contains("ucbrowser:") && !str.contains("newsapp:") && !str.contains("sinaweibo:") && !str.contains("suning:") && !str.contains("pinduoduo:") && !str.contains("qtt:") && !str.contains("baiduboxapp:") && !str.contains("baiduhaokan:")) {
            startActivity(activity, str);
        }
        return true;
    }

    public static boolean hasPackage(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getPackageInfo(str, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean isNetworkConnected(Context context) {
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private static void mailTo(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void startActivity(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void syncCookie(WebView webView, String str, String str2, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            if (cookieManager == null) {
                return;
            }
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(webView, true);
            int i7 = 0;
            if (!TextUtils.isEmpty(str2)) {
                for (String str3 : str2.split(";")) {
                    cookieManager.setCookie(str, str3);
                }
                if (strArr != null && strArr.length > 0) {
                    int length = strArr.length;
                    while (i7 < length) {
                        String str4 = strArr[i7];
                        if (!TextUtils.isEmpty(str4) && !str2.contains(str4)) {
                            cookieManager.setCookie(str, str4);
                        }
                        i7++;
                    }
                }
            } else if (strArr != null && strArr.length > 0) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    String str5 = strArr[i7];
                    if (!TextUtils.isEmpty(str5)) {
                        cookieManager.setCookie(str, str5);
                    }
                    i7++;
                }
            }
            CookieManager.getInstance().flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
