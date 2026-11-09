package com.reactnativecommunity.webview;

import C0.G;
import E.N;
import N8.q0;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import androidx.webkit.i;
import androidx.webkit.internal.o;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCWebViewManagerDelegate;
import com.facebook.react.viewmanagers.RNCWebViewManagerInterface;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reactnativecommunity.webview.RNCWebViewModule;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.y;
import org.json.JSONException;
import org.json.JSONObject;
import p265r7.a;
import p265r7.b;
import p265r7.f;
import p265r7.k;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNCWebView")
public class RNCWebViewManager extends ViewGroupManager<RNCWebViewWrapper> implements RNCWebViewManagerInterface<RNCWebViewWrapper> {
    private final ViewManagerDelegate<RNCWebViewWrapper> mDelegate = new RNCWebViewManagerDelegate(this);
    private final k mRNCWebViewManagerImpl = new k();

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        this.mRNCWebViewManagerImpl.getClass();
        return MapBuilder.builder().put("goBack", 1).put("goForward", 2).put("reload", 3).put("stopLoading", 4).put("postMessage", 5).put("injectJavaScript", 6).put("loadUrl", 7).put("requestFocus", 8).put("clearFormData", 1000).put("clearCache", 1001).put("clearHistory", 1002).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<RNCWebViewWrapper> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", MapBuilder.of("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", MapBuilder.of("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", MapBuilder.of("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", MapBuilder.of("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", MapBuilder.of("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", MapBuilder.of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", MapBuilder.of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", MapBuilder.of("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", MapBuilder.of("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", MapBuilder.of("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", MapBuilder.of("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowingReadAccessToURL(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsAirPlayForMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsBackForwardNavigationGestures(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsInlineMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsLinkPreview(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsPictureInPictureMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAutoManageStatusBarEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAutomaticallyAdjustContentInsets(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setBounces(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentInset(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentInsetAdjustmentBehavior(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentMode(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDataDetectorTypes(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDecelerationRate(RNCWebViewWrapper rNCWebViewWrapper, double d2) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDirectionalLockEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setEnableApplePay(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setFraudulentWebsiteWarningEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setHasOnFileDownload(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setHideKeyboardAccessoryView(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setIndicatorStyle(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setKeyboardDisplayRequiresUserAction(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setLimitsNavigationsToAppBoundDomains(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setMediaCapturePermissionGrantType(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setPagingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setPullToRefreshEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setRefreshControlLightMode(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setScrollEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setSharedCookiesEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "suppressMenuItems")
    public void setSuppressMenuItems(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setTextInteractionEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setUseSharedProcessPool(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, RNCWebViewWrapper rNCWebViewWrapper) {
        RNCWebView webView = rNCWebViewWrapper.getWebView();
        f fVar = new f();
        fVar.f41610a = false;
        fVar.f41611b = null;
        fVar.f41612c = null;
        webView.setWebViewClient(fVar);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearCache(RNCWebViewWrapper rNCWebViewWrapper, boolean z3) {
        rNCWebViewWrapper.getWebView().clearCache(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearFormData(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().clearFormData();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearHistory(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().clearHistory();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public RNCWebViewWrapper createViewInstance(@NonNull ThemedReactContext context) {
        final k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final RNCWebView webView = new RNCWebView(context);
        webView.f24673d = null;
        webView.f24674e = false;
        webView.f24678j = false;
        webView.f24680p = false;
        webView.t = false;
        webView.f24669B = null;
        webView.f24676g = (RNCWebViewMessagingModule) ((ThemedReactContext) webView.getContext()).getReactApplicationContext().getJSModule(RNCWebViewMessagingModule.class);
        N n10 = new N(9, false);
        n10.f1938b = false;
        webView.f24681v = n10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        kVar.b(webView);
        context.addLifecycleEventListener(webView);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (ReactBuildConfig.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setDownloadListener(new DownloadListener() { // from class: r7.g
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
                String strSubstring;
                int iLastIndexOf;
                String strDecode;
                int iLastIndexOf2;
                k kVar2 = kVar;
                RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) webView.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
                if (rNCWebViewModule == null) {
                    return;
                }
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    Pattern pattern = q.f41643a;
                    String strSubstring2 = null;
                    if (str3 != null) {
                        try {
                            Matcher matcher = q.f41643a.matcher(str3);
                            if (!matcher.find()) {
                                strSubstring = null;
                            } else if (matcher.group(3) == null || matcher.group(4) == null) {
                                strSubstring = matcher.group(2);
                            } else {
                                try {
                                    strSubstring = URLDecoder.decode(matcher.group(4), matcher.group(3).isEmpty() ? Constants.ENCODING : matcher.group(3));
                                } catch (UnsupportedEncodingException unused) {
                                    strSubstring = matcher.group(2);
                                }
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        if (strSubstring != null && (iLastIndexOf = strSubstring.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf);
                        }
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring == null && (strDecode = Uri.decode(str)) != null) {
                        int iIndexOf = strDecode.indexOf(63);
                        if (iIndexOf > 0) {
                            strDecode = strDecode.substring(0, iIndexOf);
                        }
                        if (!strDecode.endsWith("/") && (iLastIndexOf2 = strDecode.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strDecode.substring(iLastIndexOf2);
                        }
                    }
                    if (strSubstring == null) {
                        strSubstring = "downloadfile";
                    }
                    int iIndexOf2 = strSubstring.indexOf(46);
                    if (iIndexOf2 < 0) {
                        if (str4 != null && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                            strSubstring2 = Consts.DOT.concat(strSubstring2);
                        }
                        if (strSubstring2 == null) {
                            if (str4 == null || !str4.toLowerCase(Locale.ROOT).startsWith("text/")) {
                                strSubstring2 = ".bin";
                            } else {
                                strSubstring2 = str4.equalsIgnoreCase("text/html") ? ".html" : ".txt";
                            }
                        }
                    } else {
                        if (str4 != null) {
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.substring(strSubstring.lastIndexOf(46) + 1));
                            if (mimeTypeFromExtension != null && !mimeTypeFromExtension.equalsIgnoreCase(str4) && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                                strSubstring2 = Consts.DOT.concat(strSubstring2);
                            }
                        }
                        if (strSubstring2 == null) {
                            strSubstring2 = strSubstring.substring(iIndexOf2);
                        }
                        strSubstring = strSubstring.substring(0, iIndexOf2);
                    }
                    String str5 = strSubstring + strSubstring2;
                    Intrinsics.e(str5);
                    String strReplace = l.f41626a.replace(str5, "_");
                    String strO = G.o("Downloading ", strReplace);
                    try {
                        URL url = new URL(str);
                        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                    } catch (MalformedURLException unused3) {
                        kVar2.getClass();
                    }
                    request.addRequestHeader("User-Agent", str2);
                    request.setTitle(strReplace);
                    request.setDescription(strO);
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strReplace);
                    rNCWebViewModule.setDownloadRequest(request);
                    String str6 = kVar2.f41620c;
                    if (str6 == null) {
                        str6 = "Downloading";
                    }
                    String str7 = kVar2.f41621d;
                    if (str7 == null) {
                        str7 = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
                    }
                    if (rNCWebViewModule.grantFileDownloaderPermissions(str6, str7)) {
                        String str8 = kVar2.f41620c;
                        rNCWebViewModule.downloadFile(str8 != null ? str8 : "Downloading");
                    }
                } catch (IllegalArgumentException unused4) {
                    kVar2.getClass();
                }
            }
        });
        return new RNCWebViewWrapper(context, webView);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void goBack(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().goBack();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void goForward(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().goForward();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void injectJavaScript(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        rNCWebViewWrapper.getWebView().evaluateJavascript(str, null);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void loadUrl(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        rNCWebViewWrapper.getWebView().loadUrl(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull RNCWebViewWrapper viewWrapper) {
        byte[] bytes;
        super.onAfterUpdateTransaction(viewWrapper);
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        ReadableMap readableMap = kVar.f41623f;
        if (readableMap != null) {
            RNCWebView webView = viewWrapper.getWebView();
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                Intrinsics.e(string);
                webView.loadDataWithBaseURL(string2, string, "text/html", Constants.ENCODING, null);
            } else if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string3)) {
                    if (readableMap.hasKey(FirebaseAnalytics.Param.METHOD) && y.h(readableMap.getString(FirebaseAnalytics.Param.METHOD), "POST", true)) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                Intrinsics.e(string4);
                                Charset charsetForName = Charset.forName(Constants.ENCODING);
                                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                                bytes = string4.getBytes(charsetForName);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                Intrinsics.e(string4);
                                bytes = string4.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        Intrinsics.e(string3);
                        webView.postUrl(string3, bytes);
                    } else {
                        HashMap map = new HashMap();
                        if (readableMap.hasKey("headers")) {
                            ReadableArray array = readableMap.getArray("headers");
                            Intrinsics.e(array);
                            Iterator<Object> it = array.toArrayList().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (it.hasNext()) {
                                Object next = it.next();
                                Intrinsics.f(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                                HashMap map2 = (HashMap) next;
                                String str = (String) map2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) map2.get("value");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale locale = Locale.ENGLISH;
                                if ("user-agent".equals(u.q(locale, "ENGLISH", str, locale, "toLowerCase(...)"))) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    map.put(str, str2);
                                }
                            }
                        }
                        Intrinsics.e(string3);
                        webView.loadUrl(string3, map);
                    }
                }
            } else {
                webView.loadUrl("about:blank");
            }
        }
        kVar.f41623f = null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull RNCWebViewWrapper viewWrapper) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.setWebViewClient(null);
        webView.destroy();
        webView.f24668A = null;
        super.onDropViewInstance(viewWrapper);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void postMessage(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            rNCWebViewWrapper.getWebView().evaluateJavascript("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();", null);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull RNCWebViewWrapper rNCWebViewWrapper, String str, @Nullable ReadableArray readableArray) {
        super.receiveCommand(rNCWebViewWrapper, str, readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void reload(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().reload();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void requestFocus(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.requestFocus();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccess(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccessFromFileURLs(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(RNCWebViewWrapper viewWrapper, boolean z3) {
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        kVar.f41618a = z3;
        kVar.b(webView);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(RNCWebViewWrapper viewWrapper, boolean z3) {
        WebChromeClient webChromeClient;
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        kVar.f41619b = z3;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof b)) {
            return;
        }
        ((b) webChromeClient).f41601p = z3;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "androidLayerType")
    public void setAndroidLayerType(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        int i7;
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (Intrinsics.c(str, "hardware")) {
            i7 = 2;
        } else {
            i7 = Intrinsics.c(str, "software") ? 1 : 0;
        }
        webView.setLayerType(i7, null);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        if (str != null) {
            kVar.f41625h = q0.y(WebSettings.getDefaultUserAgent(viewWrapper.getWebView().getContext()), " ", str);
        } else {
            kVar.f41625h = null;
        }
        kVar.a(viewWrapper);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "basicAuthCredential")
    public void setBasicAuthCredential(RNCWebViewWrapper viewWrapper, @Nullable ReadableMap readableMap) {
        a aVar;
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        if (readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) {
            String string = readableMap.getString("username");
            String string2 = readableMap.getString("password");
            aVar = new a();
            aVar.f41588a = string;
            aVar.f41589b = string2;
        } else {
            aVar = null;
        }
        viewWrapper.getWebView().setBasicAuthCredential(aVar);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setCacheMode(z3 ? -1 : 2);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "cacheMode")
    public void setCacheMode(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebSettings settings = viewWrapper.getWebView().getSettings();
        int i7 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i7 = 2;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i7 = 1;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i7 = 3;
                    }
                    break;
            }
        }
        settings.setCacheMode(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDomStorageEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "downloadingMessage")
    public void setDownloadingMessage(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.f41620c = str;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (androidx.webkit.k.a("FORCE_DARK")) {
                int i7 = z3 ? 2 : 0;
                WebSettings settings = webView.getSettings();
                androidx.webkit.internal.b bVar = o.f18311d;
                if (bVar.a()) {
                    settings.setForceDark(i7);
                } else {
                    if (!bVar.b()) {
                        throw o.a();
                    }
                    i.a(settings).f(i7);
                }
            }
            if (z3 && androidx.webkit.k.a("FORCE_DARK_STRATEGY")) {
                WebSettings settings2 = webView.getSettings();
                if (!o.f18312e.b()) {
                    throw o.a();
                }
                i.a(settings2).g();
            }
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setGeolocationEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(RNCWebViewWrapper viewWrapper, boolean z3) {
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        kVar.f41622e = z3;
        kVar.b(webView);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "hasOnScroll")
    public void setHasOnScroll(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHasScrollEvent(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "incognito")
    public void setIncognito(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (z3) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f24670a = str;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f24671b = str;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getClass();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getClass();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setInjectedJavaScriptObject(str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.f41621d = str;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "menuItems")
    public void setMenuItems(RNCWebViewWrapper viewWrapper, @Nullable ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        Intrinsics.f(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setMessagingEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "messagingModuleName")
    public void setMessagingModuleName(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f24675f = str;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "minimumFontSize")
    public void setMinimumFontSize(RNCWebViewWrapper viewWrapper, int i7) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMinimumFontSize(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (str == null || ReactScrollViewHelper.OVER_SCROLL_NEVER.equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (ReactScrollViewHelper.OVER_SCROLL_ALWAYS.equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().t = z3;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "newSource")
    public void setNewSource(RNCWebViewWrapper viewWrapper, @Nullable ReadableMap readableMap) {
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        kVar.f41623f = readableMap;
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        int i7 = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1414557169) {
                str.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS);
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals(FirebaseAnalytics.Param.CONTENT)) {
                    i7 = 1;
                }
            } else if (str.equals(ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
                i7 = 2;
            }
        }
        webView.setOverScrollMode(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (androidx.webkit.k.a("PAYMENT_REQUEST")) {
            WebSettings settings = webView.getSettings();
            if (!o.f18320m.b()) {
                throw o.a();
            }
            i.a(settings).h(z3);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSaveFormData(!z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z3);
        webView.getSettings().setUseWideViewPort(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setBuiltInZoomControls(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDisplayZoomControls(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSupportMultipleWindows(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHorizontalScrollBarEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setVerticalScrollBarEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "textZoom")
    public void setTextZoom(RNCWebViewWrapper viewWrapper, int i7) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setTextZoom(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(viewWrapper.getWebView(), z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "userAgent")
    public void setUserAgent(RNCWebViewWrapper viewWrapper, @Nullable String str) {
        k kVar = this.mRNCWebViewManagerImpl;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        kVar.f41624g = str;
        kVar.a(viewWrapper);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(RNCWebViewWrapper viewWrapper, boolean z3) {
        this.mRNCWebViewManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void stopLoading(RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().stopLoading();
    }
}
