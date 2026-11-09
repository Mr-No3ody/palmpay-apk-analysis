package com.transsnet.adsdk.utils;

import N8.q0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.event.AdEvent;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.widgets.jsinterfaces.JsInterfaces;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.data.network.SignatureUtils;
import com.transsnet.analysis.utils.StringUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import p219o8.a;

/* JADX INFO: loaded from: classes3.dex */
public class AdSdkUtils {
    public static boolean checkAdExpired(String slotId) {
        long adExpiredTime = getAdExpiredTime(slotId);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= adExpiredTime || adExpiredTime - jCurrentTimeMillis > 120000;
    }

    public static void closeIO(final Closeable... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static long getAdExpiredTime(String slotId) {
        return AdSpUtils.getInstance().getLong(slotId, 0L);
    }

    public static String getBehaviorId() {
        return AdManager.get().getApplicationId() + System.currentTimeMillis();
    }

    public static String getSignatureHeader(String originData) {
        return SignatureUtils.sign(StringUtil.encryptMD5String(originData), AdManager.get().getMerchantPrivateKey());
    }

    private static long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        return q0.c(calendar, 12, 0, 14, 0);
    }

    public static boolean isImageOnlyWebAd(AdEntity entity, int adType) {
        return (entity == null || adType != 1 || TextUtils.isEmpty(entity.h5ImageUrl)) ? false : true;
    }

    public static boolean isInDarkMode(View view) {
        try {
            return (view.getResources().getConfiguration().uiMode & 48) == 32;
        } catch (Exception unused) {
        }
    }

    public static boolean isRtlLayout(Context context) {
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean isToday(final long millis) {
        long weeOfToday = getWeeOfToday();
        return millis >= weeOfToday && millis < weeOfToday + 86400000;
    }

    public static boolean isValidGlideContext(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isValidGlideContext(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static void onAdClosed(Context context, IAdListener listener) {
        if (listener == null || !isValidGlideContext(context)) {
            return;
        }
        try {
            listener.onClosed();
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void onClickAd(Context context, IAdListener listener, AdEntity adData) {
        if (listener == null || !isValidGlideContext(context)) {
            return;
        }
        try {
            listener.onClick(adData);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void onLoadAdFailed(Context context, IAdListener listener) {
        if (listener == null || !isValidGlideContext(context)) {
            return;
        }
        try {
            listener.onLoadFailed();
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void onLoadAdSuccess(Context context, IAdListener listener) {
        if (listener == null || !isValidGlideContext(context)) {
            return;
        }
        try {
            listener.onLoadSuccess();
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void runInMainThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(runnable);
        } catch (Exception unused) {
        }
    }

    public static void setAdExpiredTime(String slotId, long expiredTime) {
        AdSpUtils.getInstance().put(slotId, expiredTime);
    }

    public static void setupWebView(Context context, WebView webView, String dataPrefix, JsInterfaces interfaces) {
        if (webView == null) {
            return;
        }
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        File file = context.getExternalCacheDir() != null ? new File(context.getExternalCacheDir(), q0.j(dataPrefix, "AD_CACHE")) : new File(context.getCacheDir(), q0.j(dataPrefix, "AD_CACHE"));
        if (!file.exists()) {
            file.mkdir();
        }
        webView.setBackgroundColor(0);
        if (interfaces != null) {
            settings.setJavaScriptEnabled(true);
            webView.addJavascriptInterface(interfaces, "transsnetAdSdk");
        }
        webView.setWebViewClient(new a());
    }

    public static void trackEvent(AdEvent adEvent) {
        trackEvent(adEvent.adId, adEvent.adShowTime, adEvent.adSlotId, adEvent.eventType, adEvent.eventSubType, adEvent.pointWindowX, adEvent.pointWindowY, adEvent.behaviorId, adEvent.relatedId, adEvent.count);
    }

    public static void trackEvent(String adId, long adShowTime, String adSlotId, String eventType, String eventSubType, String pointWindowX, String pointWindowY, String behaviorId, String relatedId) {
        trackEvent(adId, adShowTime, adSlotId, eventType, eventSubType, pointWindowX, pointWindowY, behaviorId, relatedId, 1);
    }

    public static void trackEvent(String adId, long adShowTime, String adSlotId, String eventType, String eventSubType, String pointWindowX, String pointWindowY, String behaviorId, String relatedId, int count) {
        AdManager adManager = AdManager.get();
        AnalysisManager.track(adManager.getApplicationId(), adManager.getMerchantId(), adManager.getMerchantPrivateKey(), adId, adShowTime, adSlotId, eventType, eventSubType, pointWindowX, pointWindowY, behaviorId, relatedId, count);
    }
}
